package com.helper;

import com.model.FichaOdontologicaModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 27/09/22
 */
public class FichaOdontologiaHelper extends Basics {
    private static final String QUERY_FICHA_ODONTOLOGICA = "INSERT INTO FichaOdontologia (idPaciente, idFechaHoraCreacion, idFechaHoraActualizacion) VALUES (\n" +
        "(SELECT MAX(idPaciente) FROM Pacientes),\n" +
        "(SELECT MAX(idFechaHoraCreacion) FROM FechaHoraCreacion),\n" +
        "(SELECT MAX(idFechaHoraActualizacion) FROM FechaHoraActualizacion));";
    private static final String QUERY_DATOS_DIAGNOSTICO_ODONTOLOGIA = "INSERT INTO DatosDiagnosticoOdontologia (idFichaOdontologia, HM, HO, TipoAnestesico, Medicamentos, TipoOdontograma) VALUES (\n" +
        "(SELECT MAX(idFichaOdontologia) FROM FichaOdontologia), ?, ?, ?, ?, ?);";
    private static final String QUERY_DATOS_DIAGNOSTICO_ODONTOLOGICO = "INSERT INTO DatosDiagnosticoOdontologico (idFichaOdontologia, Anotaciones, Protesis, AnotacionesProtesis) VALUES (\n" +
        "(SELECT MAX(idFichaOdontologia) FROM FichaOdontologia), ?, ?, ?);";
    private static final String GET_FICHA_DATA = "SELECT fo.idFichaOdontologia, ddoga.HM, ddoga.HO, ddoga.TipoAnestesico, ddoga.Medicamentos, ddoga.TipoOdontograma, ddogc.Anotaciones, ddogc.Protesis, ddogc.AnotacionesProtesis, fc.dia, fc.mes, fc.annio, fc.annio, fa.dia, fa.mes, fa.annio, fa.hora FROM FichaOdontologia fo\n" +
        "INNER JOIN DatosDiagnosticoOdontologia ddoga ON fo.idFichaOdontologia = ddoga.idFichaOdontologia\n" +
        "INNER JOIN DatosDiagnosticoOdontologico ddogc ON fo.idFichaOdontologia = ddogc.idFichaOdontologia\n" +
        "INNER JOIN FechaHoraCreacion fc ON fo.idFechaHoraCreacion = fc.idFechaHoraCreacion\n" +
        "INNER JOIN FechaHoraActualizacion fa ON fo.idFechaHoraActualizacion = fa.idFechaHoraActualizacion";
    private static final String UPDATE_DATOS_DIAGNOSTICO_ODONTOLOGIA = "UPDATE DatosDiagnosticoOdontologia SET HM = ?, HO = ?, TipoAnestesico = ?, Medicamentos = ?";
    private static final String UPDATE_DATOS_DIAGNOSTICO_ODONTOLOGICO = "UPDATE DatosDiagnosticoOdontologico SET Anotaciones = ?, Protesis = ?, AnotacionesProtesis = ?";
    private static final String CREATE_ODONTOGRAMA = "INSERT INTO Odontograma (idFichaOdontologia) VALUES ((SELECT MAX(idFichaOdontologia) FROM FichaOdontologia));";
    private static FichaOdontologicaModel fichaOdontologica;
    
    public static void crearFichaOdontologica(FichaOdontologicaModel fichaOdontologica) {
        FichaOdontologiaHelper.fichaOdontologica = fichaOdontologica;
        
        agregarFechaCreacion();
        agregarFechaModificacion();
        agregarFicha();
        agregarDatosDiagnosticoOdontologia();
        agregarDatosDiagnosticoOdontologico();
        crearOdontograma();
    }
    
    public static void agregarFechaCreacion() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_CREACION);
            
            preparedStatement.setInt(1, fichaOdontologica.getDiaCreacion());
            preparedStatement.setInt(2, fichaOdontologica.getMesCreacion());
            preparedStatement.setInt(3, fichaOdontologica.getAnnioCreacion());
            preparedStatement.setString(4, fichaOdontologica.getHoraCreacion());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Fecha creacion" + e);
        }
    }
    
    private static void agregarFechaModificacion() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_MODIFICACION);
            
            preparedStatement.setInt(1, fichaOdontologica.getDiaModificacion());
            preparedStatement.setInt(2, fichaOdontologica.getMesModificacion());
            preparedStatement.setInt(3, fichaOdontologica.getAnnioModificacion());
            preparedStatement.setString(4, fichaOdontologica.getHoraModificacion());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Fecha modificacion" + e);
        }
    }
    
    private static void agregarFicha() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_FICHA_ODONTOLOGICA);
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Ficha" + e);
        }
    }
    
    private static void agregarDatosDiagnosticoOdontologia() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_DATOS_DIAGNOSTICO_ODONTOLOGIA);
            
            preparedStatement.setString(1, fichaOdontologica.getHM());
            preparedStatement.setString(2, fichaOdontologica.getHO());
            preparedStatement.setString(3, fichaOdontologica.getTipoDeAnestesico());
            preparedStatement.setString(4, fichaOdontologica.getMedicamentos());
            preparedStatement.setString(5, fichaOdontologica.getTipoOdontograma());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Datos odontologia" + e);
        }
    }
    
    private static void agregarDatosDiagnosticoOdontologico() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_DATOS_DIAGNOSTICO_ODONTOLOGICO);
            
            preparedStatement.setString(1, fichaOdontologica.getObservaciones());
            preparedStatement.setString(2, fichaOdontologica.getProtesis());
            preparedStatement.setString(3, fichaOdontologica.getAnotacionesProtesis());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Datos odontologico" + e);
        }
    }
    
    public static FichaOdontologicaModel getFicha(int id) {
        fichaOdontologica = new FichaOdontologicaModel();
        
        try {
            Statement st = CONNECTION.createStatement();
            ResultSet rs = st.executeQuery(GET_FICHA_DATA + " WHERE fo.idPaciente = " + id);
            
            while (rs.next()) {
                fichaOdontologica.setId(rs.getInt(1));
                fichaOdontologica.setHM(rs.getString(2));
                fichaOdontologica.setHO(rs.getString(3));
                fichaOdontologica.setTipoDeAnestesico(rs.getString(4));
                fichaOdontologica.setMedicamentos(rs.getString(5));
                fichaOdontologica.setTipoOdontograma(rs.getString(6));
                fichaOdontologica.setObservaciones(rs.getString(7));
                fichaOdontologica.setProtesis(rs.getString(8));
                fichaOdontologica.setAnotacionesProtesis(rs.getString(9));
                fichaOdontologica.setDiaCreacion(rs.getInt(10));
                fichaOdontologica.setMesCreacion(rs.getInt(11));
                fichaOdontologica.setAnnioCreacion(rs.getInt(12));
                fichaOdontologica.setHoraCreacion(rs.getString(13));
                fichaOdontologica.setDiaModificacion(rs.getInt(14));
                fichaOdontologica.setMesModificacion(rs.getInt(15));
                fichaOdontologica.setAnnioModificacion(rs.getInt(16));
                fichaOdontologica.setHoraModificacion(rs.getString(17));
            }
        } catch (SQLException e) {
            System.out.println("obtener ficha odontologia" + e);
        }
        
        return fichaOdontologica;
    }
    
    public static void updateFichaOdontologia(FichaOdontologicaModel fichaOdontologia, int idPaciente) {
        FichaOdontologiaHelper.fichaOdontologica = fichaOdontologia;
        
        updateFechaModificacionOdontologia(idPaciente);
        updateDatosDiagnosticoOdontologia(idPaciente);
        updateDatosDiagnosticoOdontologico(idPaciente);
    }
    
    private static void updateFechaModificacionOdontologia(int idPaciente) {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(UPDATE_FECHA_MODIFICACION 
                    + " WHERE idFechaHoraActualizacion = (SELECT fa.idFechaHoraActualizacion FROM FechaHoraActualizacion fa, FichaOdontologia fo WHERE fa.idFechaHoraActualizacion = fo.idFechaHoraActualizacion and fo.idPaciente = " + idPaciente + ");");
            
            preparedStatement.setInt(1, fichaOdontologica.getDiaModificacion());
            preparedStatement.setInt(2, fichaOdontologica.getMesModificacion());
            preparedStatement.setInt(3, fichaOdontologica.getAnnioModificacion());
            preparedStatement.setString(4, fichaOdontologica.getHoraModificacion());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    private static void updateDatosDiagnosticoOdontologia(int idPaciente) {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(UPDATE_DATOS_DIAGNOSTICO_ODONTOLOGIA + " WHERE idFichaOdontologia = (SELECT idFichaOdontologia FROM FichaOdontologia fo , Pacientes p WHERE fo.idPaciente = p.idPaciente and p.idPaciente =  " + idPaciente + ")");
            
            preparedStatement.setString(1, fichaOdontologica.getHM());
            preparedStatement.setString(2, fichaOdontologica.getHO());
            preparedStatement.setString(3, fichaOdontologica.getTipoDeAnestesico());
            preparedStatement.setString(4, fichaOdontologica.getMedicamentos());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    private static void updateDatosDiagnosticoOdontologico(int idPaciente) {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(UPDATE_DATOS_DIAGNOSTICO_ODONTOLOGICO + " WHERE idFichaOdontologia = (SELECT idFichaOdontologia FROM FichaOdontologia fo , Pacientes p WHERE fo.idPaciente = p.idPaciente and p.idPaciente =  " + idPaciente + ")");
            
            preparedStatement.setString(1, fichaOdontologica.getObservaciones());
            preparedStatement.setString(2, fichaOdontologica.getProtesis());
            preparedStatement.setString(3, fichaOdontologica.getAnotacionesProtesis());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void crearOdontograma() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(CREATE_ODONTOGRAMA);
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
