package com.helper;

import com.context.ApplicationContext;
import com.model.ActividadModel;
import com.model.PacienteModel;
import com.utils.Tools;
import com.view.createPacient.NewContext;
import static com.view.createPacient.NewContext.dateTimeFormatter;
import com.view.createPacient.NewPacienteInformation;
import com.view.createPacient.NewPacienteOdontologia;
import com.view.createPacient.NewPacienteOrtodoncia;
import com.view.createPacient.NuevoPaciente;
import com.view.estados.SuccessfullySaved;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 14/09/22
 */
public class PacienteHelper extends Basics {
    private static final String QUERY_PACIENTES = "INSERT INTO Pacientes (nombres, apellidos) VALUES (?, ?);";
    private static final String QUERY_DETALLES_PACIENTES = "INSERT INTO DetallesPacientes (idPaciente, idDatosGenerales, parentesco, responsables, estadoDeActividad) VALUES (\n" +
        "(SELECT MAX(idPaciente) FROM Pacientes),\n" +
        "(SELECT MAX(idDatosGenerales) FROM DatosGenerales), ?, ?, ?);";
    private static final String QUERY_TRATAMIENTOS_PACIENTE = "INSERT INTO TratamientoPacientes (idPaciente, Odontologia, Ortodoncia) VALUES ((SELECT MAX(idPaciente) FROM Pacientes), ?, ?);";
    private static final String GET_PACIENT_DATA = "SELECT p.idPaciente, p.nombres, p.apellidos, dg.edad, dg.genero, fn.dia, fn.mes, fn.annio, dp.parentesco, dp.responsables, dp.estadoDeActividad, t.celular, t.casa, dd.departamento, dd.municipio, dd.direccion, tp.Odontologia, tp.Ortodoncia, fc.dia, fc.mes, fc.annio, fc.hora, fa.dia, fa.mes, fa.annio, fa.hora FROM  Pacientes p\n" +
        "INNER JOIN TratamientoPacientes tp ON p.idPaciente = tp.idPaciente\n" +
        "INNER JOIN DetallesPacientes dp ON p.idPaciente = dp.idPaciente\n" +
        "INNER JOIN DatosGenerales dg ON dp.idDatosGenerales = dg.idDatosGenerales\n" +
        "INNER JOIN Telefonos t ON dg.idTelefono = t.idTelefono\n" +
        "INNER JOIN FechaHoraCreacion fc ON dg.idFechaHoraCreacion = fc.idFechaHoraCreacion\n" +
        "INNER JOIN FechaHoraActualizacion fa ON dg.idFechaHoraActualizacion = fa.idFechaHoraActualizacion\n" +
        "INNER JOIN FechasNacimientos fn ON dg.idFechaNacimiento = fn.idFechaNacimiento \n" +
        "INNER JOIN DatosDireccion dd ON dg.idDatosDireccion = dd.idDatosDireccion";
    private static final String UPDATE_PACIENT_DATA = "UPDATE Pacientes SET nombres = ?, apellidos = ? WHERE idPaciente = ?";
    private static final String UPDATE_DETALLES_PACIENTE = "UPDATE DetallesPacientes SET parentesco = ?, responsables = ?, estadoDeActividad = ?";
    private static final String UPDATE_TRATAMIENTOS_PACIENTE = "UPDATE TratamientoPacientes SET Odontologia = ?, Ortodoncia = ?";
    private static final ArrayList<PacienteModel> PACIENTES = new ArrayList<>();
    private static PacienteModel paciente;
    
    public static void createNewPacient(PacienteModel paciente) {
        PacienteHelper.paciente = paciente;

        agregarFechaCreacion();
        agregarFechaModificacion();
        agregarPaciente();
        agregarTelefonosPaciente();
        agregarDireccionPaciente();
        agregarFechaNacimientoPaciente();
        agregarDatosGeneralesPaciente();
        agregarDetallesPaciente();
        agregarTratamientosPaciente();
        AgendaHelper.crearAgenda();

        if (paciente.getFichaOdontologia() != null) {
            FichaOdontologiaHelper.crearFichaOdontologica(paciente.getFichaOdontologia());
        }
        
        if (paciente.getFichaOrtodoncia() != null) {
            FichaOrtodonciaHelper.crearFichaOrtodoncia(paciente.getFichaOrtodoncia());
        }
        
        ActividadModel actividad = new ActividadModel();
        
        if (ApplicationContext.isDoctorSesionActual()) {
            actividad.setNombres(ApplicationContext.getDoctor().getNombres());
            actividad.setApellidos(ApplicationContext.getDoctor().getApellidos());
        } else {
            actividad.setNombres(ApplicationContext.getAsistente().getNombres());
            actividad.setApellidos(ApplicationContext.getAsistente().getApellidos());
        }
        
        actividad.setMensajeActividad("Agrego un nuevo paciente");
        actividad.setDescripcionActividad("Agrego un nuevo paciente: " + paciente.getNombres() + " " +  paciente.getApellidos());
        actividad.setDiaActividad(LocalDateTime.now().getDayOfMonth());
        actividad.setMesActividad(LocalDateTime.now().getMonthValue());
        actividad.setAnnioActividad(LocalDateTime.now().getYear());
        actividad.setHoraActividad(String.valueOf(LocalDateTime.now().getHour()) + ":" + String.valueOf(LocalDateTime.now().getMinute()) + " " + NewContext.localTime.format(dateTimeFormatter));

        ActividadHelper.crearNuevaActividad(actividad);

        
        ApplicationContext.mainInterface.mostrarPanel(ApplicationContext.pacientes);
        
        if (ApplicationContext.isDoctorSesionActual()) {
            ApplicationContext.dashboardScroll.setData();
            ApplicationContext.consultasDashboardTable.addTargets();
            ApplicationContext.actividadTable.setData();
        }
        
        ApplicationContext.pacientes.setData();
        
        ApplicationContext.success = new SuccessfullySaved();
        ApplicationContext.success.setVisible(true);
        
        Tools.setTimeout(() -> {
            ApplicationContext.success.dispose();
        }, 3000);
        
        ApplicationContext.newPacienteInformation = new NewPacienteInformation();
        ApplicationContext.nuevoPacienteOdontologia = new NewPacienteOdontologia();
        ApplicationContext.nuevoPacienteOrtodoncia = new NewPacienteOrtodoncia();
        ApplicationContext.nuevoPaciente = new NuevoPaciente();
        NewContext.paciente = new PacienteModel();
        ApplicationContext.changeTheme(ApplicationContext.selectedAppereance);
    }

    private static void agregarPaciente() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_PACIENTES);
            
            preparedStatement.setString(1, paciente.getNombres());
            preparedStatement.setString(2, paciente.getApellidos());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Paciente, algo salio mal" + e);
        }
    }
    
    public static void agregarFechaCreacion() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_CREACION);
            
            preparedStatement.setInt(1, paciente.getDiaCreacion());
            preparedStatement.setInt(2, paciente.getMesCreacion());
            preparedStatement.setInt(3, paciente.getAnnioCreacion());
            preparedStatement.setString(4, paciente.getHoraCreacion());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Fecha creacion" + e);
        }
    }
    
    public static void agregarFechaModificacion() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_MODIFICACION);
            
            preparedStatement.setInt(1, paciente.getDiaModificacion());
            preparedStatement.setInt(2, paciente.getMesModificacion());
            preparedStatement.setInt(3, paciente.getAnnioModificacion());
            preparedStatement.setString(4, paciente.getHoraModificacion());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Fecha modificacion" + e);
        }
    }
    
    private static void agregarTelefonosPaciente() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_TELEFONOS);
            
            preparedStatement.setString(1, paciente.getTelefonoCelular());
            preparedStatement.setString(2, paciente.getTelefonoCasa());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Telefonos, algo salio mal" + e);
        }
    }
    
    private static void agregarDireccionPaciente() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_DIRECCION);
            
            preparedStatement.setString(1, paciente.getDepartamento());
            preparedStatement.setString(2, paciente.getMunicipio());
            preparedStatement.setString(3, paciente.getDireccion());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Direccion, algo salio mal" + e);
        }
    }
    
    private static void agregarFechaNacimientoPaciente() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_FECHA_NACIMIENTO);
            
            preparedStatement.setInt(1, paciente.getDiaNacimiento());
            preparedStatement.setInt(2, paciente.getMesNacimiento());
            preparedStatement.setInt(3, paciente.getAnnioNacimiento());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Fecha nacimiento, algo salio mal" + e);
        }
    }
    
    private static void agregarDatosGeneralesPaciente() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_DATOS_GENERALES);
            
            preparedStatement.setInt(1, paciente.getEdad());
            preparedStatement.setString(2, paciente.getGenero());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Datos, algo salio mal" + e);
        }
    }
    
    private static void agregarDetallesPaciente() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_DETALLES_PACIENTES);
            
            preparedStatement.setString(1, paciente.getParentesco());
            preparedStatement.setString(2, paciente.getResponsables());
            preparedStatement.setString(3, paciente.getEstadoDeActividad());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Detalles, algo salio mal" + e);
        }
    }
    
    private static void agregarTratamientosPaciente() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_TRATAMIENTOS_PACIENTE);
            
            preparedStatement.setString(1, String.valueOf(paciente.isTratamientoOdontologico()));
            preparedStatement.setString(2, String.valueOf(paciente.isTratamientoOrtodontico()));
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Tratamientos, algo salio mal" + e);
        }
    }
    
    public static ArrayList<PacienteModel> listPacients(String query) {
        PACIENTES.clear();
        
        try {
            Statement st = CONNECTION.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()) {
                PacienteModel model = new PacienteModel();
                
                model.setId(rs.getInt(1));
                model.setNombres(rs.getString(2));
                model.setApellidos(rs.getString(3));
                model.setEdad(rs.getInt(4));
                model.setGenero(rs.getString(5));
                model.setDiaNacimiento(rs.getInt(6));
                model.setMesNacimiento(rs.getInt(7));
                model.setAnnioNacimiento(rs.getInt(8));
                model.setParentesco(rs.getString(9));
                model.setResponsables(rs.getString(10));
                model.setEstadoDeActividad(rs.getString(11));
                model.setTelefonoCelular(rs.getString(12));
                model.setTelefonoCasa(rs.getString(13));
                model.setDepartamento(rs.getString(14));
                model.setMunicipio(rs.getString(15));
                model.setDireccion(rs.getString(16));
                model.setTratamientoOdontologico(Boolean.parseBoolean(rs.getString(17)));
                model.setTratamientoOrtodontico(Boolean.parseBoolean(rs.getString(18)));
                model.setDiaCreacion(rs.getInt(19));
                model.setMesCreacion(rs.getInt(20));
                model.setAnnioCreacion(rs.getInt(21));
                model.setHoraCreacion(rs.getString(22));
                model.setDiaModificacion(rs.getInt(23));
                model.setMesModificacion(rs.getInt(24));
                model.setAnnioModificacion(rs.getInt(25));
                model.setHoraModificacion(rs.getString(26));
                
                if (model.isTratamientoOdontologico()) model.setFichaOdontologia(FichaOdontologiaHelper.getFicha(model.getId()));
                if (model.isTratamientoOrtodontico()) model.setFichaOrtodoncia(FichaOrtodonciaHelper.getFicha(model.getId()));
                
                PACIENTES.add(model);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return PACIENTES;
    }
    
    public static ArrayList<PacienteModel> listPacients() {
        return listPacients(GET_PACIENT_DATA);
    }
    
    public static ArrayList<PacienteModel> listRecientPacients() {
        return listPacients(GET_PACIENT_DATA + " ORDER BY fc.dia DESC, fc.mes DESC, fc.annio DESC");
    }
    
    public static ArrayList<PacienteModel> listPacientsByNameLike(String like) {
        return listPacients(GET_PACIENT_DATA + " and (p.nombres like '%" + like + "%' or p.apellidos like '%" + like + "%' or dg.edad like '%" + like + "%' or dg.genero like '%" + like + "%' or p.idPaciente like '%" + like + "%' or dp.estadoDeActividad like '%" + like + "%')");
    }
    
    public static int countPacientes() {
        return countSomething("Pacientes");
    }
    
    public static void updatePacientData(PacienteModel paciente) {
        PacienteHelper.paciente = paciente;
        
        updatePacienteData();
        updateFechaModificacionPaciente();
        updateTelefonoPaciente();
        updateFechaNacimientoPaciente();
        updateDatosGeneralesPaciente();
        updateDatosDireccion();
        updateDetallesPaciente();
        updateTratamientosPaciente();
        
        if (paciente.isTratamientoOdontologico()) {
            FichaOdontologiaHelper.updateFichaOdontologia(paciente.getFichaOdontologia(), paciente.getId());
        }
        
        if (paciente.isTratamientoOrtodontico()) {
            FichaOrtodonciaHelper.updateFichaOrtodoncia(paciente.getFichaOrtodoncia(), paciente.getId());
        }
        
        ActividadModel actividad = new ActividadModel();
        
        if (ApplicationContext.isDoctorSesionActual()) {
            actividad.setNombres(ApplicationContext.getDoctor().getNombres());
            actividad.setApellidos(ApplicationContext.getDoctor().getApellidos());
        } else {
            actividad.setNombres(ApplicationContext.getAsistente().getNombres());
            actividad.setApellidos(ApplicationContext.getAsistente().getApellidos());
        }
        
        actividad.setMensajeActividad("Modificó a un paciente");
        actividad.setDescripcionActividad("Modificó a un paciente: " + paciente.getNombres() + " " +  paciente.getApellidos());
        actividad.setDiaActividad(LocalDateTime.now().getDayOfMonth());
        actividad.setMesActividad(LocalDateTime.now().getMonthValue());
        actividad.setAnnioActividad(LocalDateTime.now().getYear());
        actividad.setHoraActividad(String.valueOf(LocalDateTime.now().getHour()) + ":" + String.valueOf(LocalDateTime.now().getMinute()) + " " + NewContext.localTime.format(dateTimeFormatter));

        ActividadHelper.crearNuevaActividad(actividad);
        
        ApplicationContext.mainInterface.mostrarPanel(ApplicationContext.dashboard);
        ApplicationContext.dashboardScroll.setData();
        ApplicationContext.consultasDashboardTable.addTargets();
        ApplicationContext.pacientes.setData();
        ApplicationContext.actividadTable.setData();
        ApplicationContext.changeTheme(ApplicationContext.selectedAppereance);
    }
    
    private static void updatePacienteData() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(UPDATE_PACIENT_DATA);
            
            preparedStatement.setString(1, paciente.getNombres());
            preparedStatement.setString(2, paciente.getApellidos());
            preparedStatement.setInt(3, paciente.getId());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    private static void updateFechaModificacionPaciente() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(UPDATE_FECHA_MODIFICACION 
                    + " WHERE idFechaHoraActualizacion = (SELECT fa.idFechaHoraActualizacion FROM FechaHoraActualizacion fa, DatosGenerales dg WHERE fa.idFechaHoraActualizacion = dg.idFechaHoraActualizacion and dg.idDatosGenerales = (SELECT dg.idDatosGenerales FROM DatosGenerales dg, DetallesPacientes dp WHERE dg.idDatosGenerales = dp.idDatosGenerales and dp.idPaciente = " + paciente.getId() + "));");
            
            preparedStatement.setInt(1, paciente.getDiaModificacion());
            preparedStatement.setInt(2, paciente.getMesModificacion());
            preparedStatement.setInt(3, paciente.getAnnioModificacion());
            preparedStatement.setString(4, paciente.getHoraModificacion());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    private static void updateTelefonoPaciente() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(UPDATE_TELEFONO  
                    + " WHERE idTelefono = (SELECT t.idTelefono FROM Telefonos t, DatosGenerales dg WHERE t.idTelefono = dg.idTelefono and dg.idDatosGenerales = (SELECT dg.idDatosGenerales FROM DatosGenerales dg, DetallesPacientes dp WHERE dg.idDatosGenerales = dp.idDatosGenerales and dp.idPaciente = " + paciente.getId() + "));");
            
            preparedStatement.setString(1, paciente.getTelefonoCelular());
            preparedStatement.setString(2, paciente.getTelefonoCasa());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    private static void updateFechaNacimientoPaciente() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(UPDATE_FECHA_NACIMIENTO  
                    + " WHERE idFechaNacimiento = (SELECT fn.idFechaNacimiento FROM FechasNacimientos fn, DatosGenerales dg WHERE fn.idFechaNacimiento = dg.idFechaNacimiento and dg.idDatosGenerales = (SELECT dg.idDatosGenerales FROM DatosGenerales dg, DetallesPacientes dp WHERE dg.idDatosGenerales = dp.idDatosGenerales and dp.idPaciente = " + paciente.getId()+ "));");
            
            preparedStatement.setInt(1, paciente.getDiaNacimiento());
            preparedStatement.setInt(2, paciente.getMesNacimiento());
            preparedStatement.setInt(3, paciente.getAnnioNacimiento());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e + "Intervalo nac");
        }
    }
    
    private static void updateDatosGeneralesPaciente() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(UPDATE_DATOS_GENERALES + " WHERE idDatosGenerales = (SELECT dg.idDatosGenerales FROM DatosGenerales dg, DetallesPacientes dp WHERE dg.idDatosGenerales = dp.idDatosGenerales and dp.idPaciente = " + paciente.getId() + ")");
            
            preparedStatement.setInt(1, paciente.getEdad());
            preparedStatement.setString(2, paciente.getGenero());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e + "lol");
        }
    }
    
    private static void updateDatosDireccion() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(UPDATE_DATOS_DIRECCION
                    + " WHERE idDatosDireccion = (SELECT dd.idDatosDireccion FROM DatosDireccion dd, DatosGenerales dg WHERE dd.idDatosDireccion = dg.idDatosDireccion and dg.idDatosGenerales = (SELECT dg.idDatosGenerales FROM DatosGenerales dg, DetallesPacientes dp WHERE dg.idDatosGenerales = dp.idDatosGenerales and dp.idPaciente = " + paciente.getId() + "));");
            
            preparedStatement.setString(1, paciente.getDepartamento());
            preparedStatement.setString(2, paciente.getMunicipio());
            preparedStatement.setString(3, paciente.getDireccion());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e + "furaaa");
        }
    }
    
    
    private static void updateDetallesPaciente() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(UPDATE_DETALLES_PACIENTE + " WHERE idPaciente = " + paciente.getId());
            
            preparedStatement.setString(1, paciente.getParentesco());
            preparedStatement.setString(2, paciente.getResponsables());
            preparedStatement.setString(3, paciente.getEstadoDeActividad());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e + "lolllll");
        }
    }
    
    private static void updateTratamientosPaciente() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(UPDATE_TRATAMIENTOS_PACIENTE + " WHERE idPaciente = " + paciente.getId());
            
            preparedStatement.setString(1, String.valueOf(paciente.isTratamientoOdontologico()));
            preparedStatement.setString(2, String.valueOf(paciente.isTratamientoOrtodontico()));
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}