package com.helper;

import com.context.ApplicationContext;
import com.model.ConsultaModel;
import com.utils.Tools;
import com.view.estados.SuccessfullySaved;
import com.view.readPct.NuevaConsulta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class ConsultasHelper extends Basics {
    private static final String QUERY_CONSULTA = "INSERT INTO Consultas (idAgendaPaciente, idFechaHoraCreacion, idFechaHoraActualizacion, dia, mes, annio, hora, realizado, tratamiento) VALUES (\n" +
        "(SELECT idAgendaPaciente FROM AgendaPaciente WHERE idPaciente = ?),\n" +
        "(SELECT MAX(idFechaHoraCreacion) FROM FechaHoraCreacion),\n" +
        "(SELECT MAX(idFechaHoraActualizacion) FROM FechaHoraActualizacion), ?, ?, ?, ?, ?, ?);";
    private static final String QUERY_CONSULTA_DATA = "SELECT c.idConsulta, c.dia, c.mes, c.annio, c.hora, c.realizado, c.tratamiento, fc.dia, fc.mes, fc.annio, fc.hora, fa.dia, fa.mes, fa.annio, fa.hora, p.nombres, p.apellidos, t.celular FROM Consultas c\n" +
        "INNER JOIN FechaHoraCreacion fc ON c.idFechaHoraCreacion = fc.idFechaHoraCreacion\n" +
        "INNER JOIN FechaHoraActualizacion fa ON c.idFechaHoraActualizacion = fa.idFechaHoraActualizacion\n" +
        "INNER JOIN AgendaPaciente a ON c.idAgendaPaciente = a.idAgendaPaciente\n" +
        "INNER JOIN Pacientes p ON a.idPaciente = p.idPaciente\n" +
        "INNER JOIN TratamientoPacientes tp ON  p.idPaciente = tp.idPaciente\n" +
        "INNER JOIN DetallesPacientes dp ON p.idPaciente = dp.idPaciente\n" +
        "INNER JOIN DatosGenerales dg ON dp.idDatosGenerales = dg.idDatosGenerales\n" +
        "INNER JOIN Telefonos t ON dg.idTelefono = t.idTelefono";
    private static final String QUERY_CONSULTAS_ID = "SELECT c.idConsulta, c.dia, c.mes, c.annio, c.hora, c.realizado, c.tratamiento FROM Consultas c, AgendaPaciente a WHERE c.idAgendaPaciente = a.idAgendaPaciente and a.idPaciente = ";
    private static final String QUERY_CONSULTAS = "SELECT c.idConsulta, c.dia, c.mes, c.annio, c.hora, c.realizado, c.tratamiento FROM Consultas c, AgendaPaciente a WHERE c.idAgendaPaciente = a.idAgendaPaciente";
    private static final String UPDATE_CONSULTA = "UPDATE Consultas SET dia = ?, mes = ?, annio = ?, hora = ?, tratamiento = ? WHERE idConsulta = ?";
    
    public static String getQUERY_CONSULTAS_ID() {
        return QUERY_CONSULTAS_ID;
    }
    private static final ArrayList<ConsultaModel> CONSULTAS = new ArrayList<>();
    private static ConsultaModel consultaModel = new ConsultaModel();
    
    public static void crearConsulta(ConsultaModel consulta, int idPaciente) {
        consultaModel = consulta;
        
        agregarFechaCreacionConsulta();
        agregarFechaModificacionConsulta();
        guardarConsulta(idPaciente);
        
        ApplicationContext.paciente.mostrarPanel(ApplicationContext.pacienteProfile);
        ApplicationContext.consultasDashboardTable.addTargets();
        ApplicationContext.consultasTargetsDashboard.forEach(target -> target.colorComponent(ApplicationContext.selectedAppereance));
        
        ApplicationContext.success = new SuccessfullySaved();
        ApplicationContext.success.setVisible(true);
        
        Tools.setTimeout(() -> {
            ApplicationContext.success.dispose();
        }, 3000);
        
        ApplicationContext.nuevaConsulta = new NuevaConsulta();
        ApplicationContext.nuevaConsulta.colorComponent(ApplicationContext.selectedAppereance);
    }
    
    public static void agregarFechaCreacionConsulta() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_CREACION);
            
            preparedStatement.setInt(1, consultaModel.getDiaCreacion());
            preparedStatement.setInt(2, consultaModel.getMesCreacion());
            preparedStatement.setInt(3, consultaModel.getAnnioCreacion());
            preparedStatement.setString(4, consultaModel.getHoraCreacion());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Fecha creacion" + e);
        }
    }
    
    public static void agregarFechaModificacionConsulta() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_MODIFICACION);
            
            preparedStatement.setInt(1, consultaModel.getDiaModificacion());
            preparedStatement.setInt(2, consultaModel.getMesModificacion());
            preparedStatement.setInt(3, consultaModel.getAnnioModificacion());
            preparedStatement.setString(4, consultaModel.getHoraModificacion());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Fecha modificacion" + e);
        }
    }
    
    public static void guardarConsulta(int idPaciente) {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_CONSULTA);
            
            preparedStatement.setInt(1, idPaciente);
            preparedStatement.setInt(2, consultaModel.getDiaDeConsulta());
            preparedStatement.setInt(3, consultaModel.getMesDeConsulta());
            preparedStatement.setInt(4, consultaModel.getAnnioDeConsulta());
            preparedStatement.setString(5, consultaModel.getHoraDeConsulta());
            preparedStatement.setString(6, String.valueOf(consultaModel.isConsultaRealizada()));
            preparedStatement.setString(7, consultaModel.getTratamientoDeConsulta());
            
            preparedStatement.executeUpdate();        
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public static ArrayList<ConsultaModel> obtenerConsultasPaciente(String query) {
        CONSULTAS.clear();
        
        try {
            Statement st = CONNECTION.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()) {
                ConsultaModel consulta = new  ConsultaModel();
                
                consulta.setId(rs.getInt(1));
                consulta.setDiaDeConsulta(rs.getInt(2));
                consulta.setMesDeConsulta(rs.getInt(3));
                consulta.setAnnioDeConsulta(rs.getInt(4));
                consulta.setHoraDeConsulta(rs.getString(5));
                consulta.setConsultaRealizada(Boolean.parseBoolean(rs.getString(6)));
                consulta.setTratamientoDeConsulta(rs.getString(7));
                
                CONSULTAS.add(consulta);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return CONSULTAS;
    }
    
    public static ArrayList<ConsultaModel> obtenerConsultasPorDiaMesAnnio(int dia, int mes, int annio, int idPaciente) {
        return obtenerConsultasPaciente(QUERY_CONSULTAS_ID + idPaciente + " and c.dia = " + dia + " and c.mes = " + mes + " and c.annio = " + annio);
    }
    
    public static ArrayList<ConsultaModel> obtenerConsultasPorFecha(int dia, int mes, int annio, String like) {
        String condicional;
        
        if (like.toLowerCase().contains("buscar") || like.equals("")) {
            condicional = " or ";
        } else {
            condicional = " and ";
        }
        
        return getConsultasByQuery(QUERY_CONSULTA_DATA + " WHERE (c.dia = " + dia + " and c.mes = " + mes + " and c.annio = " + annio + ")" + condicional + "(c.realizado like '%" + like + "%' or p.nombres like '%" + like + "%' or p.apellidos like '%" + like + "%' or c.tratamiento like '%" + like + "%') ORDER BY c.dia, c.mes, c.annio DESC");
    }
    
    public static ArrayList<ConsultaModel> getConsultas() {
        return getConsultasByQuery(QUERY_CONSULTA_DATA + " ORDER BY c.dia DESC, c.mes DESC, c.annio DESC");
    }
    
    public static ArrayList<ConsultaModel> getConsultasByQuery(String query) {
        CONSULTAS.clear();
        
        try {
            Statement st = CONNECTION.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()) {
                ConsultaModel consulta = new ConsultaModel();
                
                consulta.setId(rs.getInt(1));
                consulta.setDiaDeConsulta(rs.getInt(2));
                consulta.setMesDeConsulta(rs.getInt(3));
                consulta.setAnnioDeConsulta(rs.getInt(4));
                consulta.setHoraDeConsulta(rs.getString(5));
                consulta.setConsultaRealizada(Boolean.parseBoolean(rs.getString(6)));
                consulta.setTratamientoDeConsulta(rs.getString(7));
                consulta.setDiaCreacion(rs.getInt(8));
                consulta.setMesCreacion(rs.getInt(9));
                consulta.setAnnioCreacion(rs.getInt(10));
                consulta.setHoraCreacion(rs.getString(11));
                consulta.setDiaModificacion(rs.getInt(12));
                consulta.setMesModificacion(rs.getInt(13));
                consulta.setAnnioModificacion(rs.getInt(14));
                consulta.setHoraModificacion(rs.getString(15));
                consulta.setNombres(rs.getString(16));
                consulta.setApellidos(rs.getString(17));
                consulta.setContacto(rs.getString(18));
                
                CONSULTAS.add(consulta);
            }
        } catch (SQLException e) {
            System.out.println("Get consultas " + e);
        }
        
        return CONSULTAS;
    }
    
    public static int countConsultas() {
        return countSomething("Consultas");
    }
    
    public static void updateConsulta(ConsultaModel consulta) {
        consultaModel = consulta;
        
        updateConsultaItSelf();
        updateFechaModificacionConsulta();
    }
    
    private static void updateFechaModificacionConsulta() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(UPDATE_FECHA_MODIFICACION 
                    + " WHERE idFechaHoraActualizacion = (SELECT fa.idFechaHoraActualizacion FROM FechaHoraActualizacion fa, Consultas c WHERE fa.idFechaHoraActualizacion = c.idFechaHoraActualizacion and c.idConsulta = " + consultaModel.getId() + ");");
            
            preparedStatement.setInt(1, consultaModel.getDiaModificacion());
            preparedStatement.setInt(2, consultaModel.getMesModificacion());
            preparedStatement.setInt(3, consultaModel.getAnnioModificacion());
            preparedStatement.setString(4, consultaModel.getHoraModificacion());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    private static void updateConsultaItSelf() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(UPDATE_CONSULTA);
            
            preparedStatement.setInt(1, consultaModel.getDiaDeConsulta());
            preparedStatement.setInt(2, consultaModel.getMesDeConsulta());
            preparedStatement.setInt(3, consultaModel.getAnnioDeConsulta());
            preparedStatement.setString(4, consultaModel.getHoraDeConsulta());
            preparedStatement.setString(5, consultaModel.getTratamientoDeConsulta());
            preparedStatement.setInt(6, consultaModel.getId());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
