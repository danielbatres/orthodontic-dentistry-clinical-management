package com.helper;

import com.context.ApplicationContext;
import static com.helper.Basics.CONNECTION;
import com.model.ActividadModel;
import java.sql.*;
import com.model.AsistenteModel;
import com.model.Registro;
import com.utils.Tools;
import com.view.createAsistente.NewAsistenteInformation;
import com.view.createAsistente.NuevoAsistente;
import com.view.createPacient.NewContext;
import static com.view.createPacient.NewContext.dateTimeFormatter;
import com.view.estados.SuccessfullySaved;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 14/09/22
 */
public class AsistenteHelper extends Basics {
    private static final String QUERY_ASISTENTE = "INSERT INTO Asistentes (nombres, apellidos) VALUES (?, ?);";
    private static final String QUERY_GET_REGISTROS_ASISTENTES = "SELECT r.idRegistro, r.correoElectronico, r.contrasena, fh.dia, fh.mes, fh.annio, fh.hora, fa.dia, fa.mes, fa.annio, fa.hora, ra.idAsistente FROM Registros r\n" +
        "INNER JOIN RegistroAsistentes ra ON r.idRegistro = ra.idRegistro\n" +
        "INNER JOIN FechaHoraCreacion fh ON r.idFechaHoraCreacion = fh.idFechaHoraCreacion\n" +
        "INNER JOIN FechaHoraActualizacion fa ON r.idFechaHoraActualizacion = fa.idFechaHoraActualizacion\n" +
        "INNER JOIN Asistentes a ON a.idAsistente = ra.idAsistente";
    private static final String QUERY_DETALLES_ASISTENTE = "INSERT INTO DetallesAsistentes (idAsistente, idDatosGenerales, idPreferencia, especialidad, actividad) VALUES (\n" +
        "(SELECT MAX(idAsistente) FROM Asistentes), (SELECT MAX(idDatosGenerales) FROM DatosGenerales), " +
        "(SELECT MAX(idPreferencia) FROM Preferencias), ?, ?);";
    private static final String QUERY_REGISTRO_ASISTENTE = "INSERT INTO RegistroAsistentes (idAsistente, idRegistro) VALUES (\n" +
        "(SELECT MAX(idAsistente) FROM Asistentes),\n" +
        "(SELECT MAX(idRegistro) FROM Registros));";
    private static final String GET_ASISTENTES_DATA = "SELECT a.idAsistente, a.nombres, a.apellidos, dg.edad, dg.genero, fn.dia, fn.mes, fn.annio, dp.especialidad, dp.actividad, t.celular, t.casa, dd.departamento, dd.municipio, dd.direccion, r.correoElectronico, r.contrasena, fc.dia, fc.mes, fc.annio, fc.hora, fa.dia, fa.mes, fa.annio, fa.hora, p.paletaPreferencia FROM  Asistentes a\n" +
        "INNER JOIN DetallesAsistentes dp ON a.idAsistente = dp.idAsistente\n" +
        "INNER JOIN DatosGenerales dg ON dp.idDatosGenerales = dg.idDatosGenerales\n" +
        "INNER JOIN Telefonos t ON dg.idTelefono = t.idTelefono\n" +
        "INNER JOIN FechaHoraCreacion fc ON dg.idFechaHoraCreacion = fc.idFechaHoraCreacion\n" +
        "INNER JOIN FechaHoraActualizacion fa ON dg.idFechaHoraActualizacion = fa.idFechaHoraActualizacion\n" +
        "INNER JOIN FechasNacimientos fn ON dg.idFechaNacimiento = fn.idFechaNacimiento \n" +
        "INNER JOIN DatosDireccion dd ON dg.idDatosDireccion = dd.idDatosDireccion\n" +
        "INNER JOIN RegistroAsistentes ra ON a.idAsistente = ra.idAsistente\n" +
        "INNER JOIN Registros r ON ra.idRegistro = r.idRegistro\n" +
        "INNER JOIN Preferencias p ON dp.idPreferencia = p.idPreferencia";
    private static final String UPDATE_ASISTENTE_DATA = "UPDATE Asistentes SET nombres = ?, apellidos = ?";
    private static final String UPDATE_DETALLES_ASISTENTE = "UPDATE DetallesAsistentes SET actividad = ?";
    private static final String UPDATE_REGISTRO_ASISTENTE = "UPDATE Registros SET correoElectronico = ?, contrasena = ? WHERE idRegistro = (SELECT ra.idRegistro FROM Registros r, RegistroAsistentes ra WHERE r.idRegistro = ra.idRegistro and ra.idAsistente = ";
    private static final String QUERY_PREFERENCIAS = "INSERT INTO Preferencias (paletaPreferencia) VALUES (?);";
    private static AsistenteModel asistente;
    private static final ArrayList<AsistenteModel> ASISTENTES = new ArrayList<>();
    private static final ArrayList<Registro> REGISTRO_ASISTENTES = new ArrayList<>();
    
    public static void setPreferencies(AsistenteModel asistente) {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(getQueryPreferenciesAsistentes(asistente.getPaletaPreferencia(), asistente.getId()));
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void crearAsistente(AsistenteModel asistente) {        
        AsistenteHelper.asistente = asistente;
        
        agregarAsistente();
        agregarTelefonosAsistente();
        agregarDireccionAsistente();
        agregarFechaNacimientoAsistente();
        agregarDatosGenerales();
        agregarPreferencias();
        agregarDetallesAsistentes();
        agregarRegistro();
        agregarRegistroAsistente();
        
        if (ApplicationContext.isDoctorSesionActual()) {
            ActividadModel actividad = new ActividadModel();
            
            actividad.setNombres(ApplicationContext.getDoctor().getNombres());
            actividad.setApellidos(ApplicationContext.getDoctor().getApellidos());
            actividad.setMensajeActividad("Agrego un nuevo asistente");
            actividad.setDescripcionActividad("Agrego un nuevo asistente: " + asistente.getNombres() + " " + asistente.getApellidos());
            actividad.setDiaActividad(LocalDateTime.now().getDayOfMonth());
            actividad.setMesActividad(LocalDateTime.now().getMonthValue());
            actividad.setAnnioActividad(LocalDateTime.now().getYear());
            actividad.setHoraActividad(String.valueOf(LocalDateTime.now().getHour()) + ":" + String.valueOf(LocalDateTime.now().getMinute()) + " " + NewContext.localTime.format(dateTimeFormatter));
            
            ActividadHelper.crearNuevaActividad(actividad);
        }
        
        ApplicationContext.mainInterface.mostrarPanel(ApplicationContext.asistentes);
        ApplicationContext.dashboardScroll.setData();
        ApplicationContext.consultasDashboardTable.addTargets();
        ApplicationContext.actividadTable.setData();
        ApplicationContext.asistentes.setData();
        
        ApplicationContext.success = new SuccessfullySaved();
        ApplicationContext.success.setVisible(true);
        
        Tools.setTimeout(() -> {
            ApplicationContext.success.dispose();
        }, 3000);
        
        ApplicationContext.newAsistenteInformation = new NewAsistenteInformation();
        ApplicationContext.nuevoAsistente = new NuevoAsistente();
        ApplicationContext.changeTheme(ApplicationContext.selectedAppereance);
    }
    
    private static void agregarAsistente() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_ASISTENTE);
            
            preparedStatement.setString(1, asistente.getNombres());
            preparedStatement.setString(2, asistente.getApellidos());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Asistente, algo salio mal" + e);
        }
    }
    
    public static void agregarFechaCreacion() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_CREACION);
            
            preparedStatement.setInt(1, asistente.getDiaCreacion());
            preparedStatement.setInt(2, asistente.getMesCreacion());
            preparedStatement.setInt(3, asistente.getAnnioCreacion());
            preparedStatement.setString(4, asistente.getHoraCreacion());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Fecha creacion" + e);
        }
    }
    
    public static void agregarFechaModificacion() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_MODIFICACION);
            
            preparedStatement.setInt(1, asistente.getDiaModificacion());
            preparedStatement.setInt(2, asistente.getMesModificacion());
            preparedStatement.setInt(3, asistente.getAnnioModificacion());
            preparedStatement.setString(4, asistente.getHoraModificacion());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Fecha modificacion" + e);
        }
    }
    
    private static void agregarTelefonosAsistente() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_TELEFONOS);
            
            preparedStatement.setString(1, asistente.getTelefonoCasa());
            preparedStatement.setString(2, asistente.getTelefonoCelular());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Telefonos, algo salio mal" + e);
        }
    }
    
    private static void agregarDireccionAsistente() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_DIRECCION);
            
            preparedStatement.setString(1, asistente.getDepartamento());
            preparedStatement.setString(2, asistente.getMunicipio());
            preparedStatement.setString(3, asistente.getDireccion());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Direccion, algo salio mal" + e);
        }
    }
    
    private static void agregarFechaNacimientoAsistente() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_FECHA_NACIMIENTO);
            
            preparedStatement.setInt(1, asistente.getDiaNacimiento());
            preparedStatement.setInt(2, asistente.getMesNacimiento());
            preparedStatement.setInt(3, asistente.getAnnioNacimiento());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Fecha nacimiento, algo salio mal" + e);
        }
    }
    
    private static void agregarDatosGenerales() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_DATOS_GENERALES);
            
            preparedStatement.setInt(1, asistente.getEdad());
            preparedStatement.setString(2, asistente.getGenero());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Datos, algo salio mal" + e);
        }
    }
    
    private static void agregarPreferencias() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_PREFERENCIAS);
            
            preparedStatement.setString(1, asistente.getPaletaPreferencia());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    private static void agregarDetallesAsistentes() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_DETALLES_ASISTENTE);
            
            preparedStatement.setString(1, asistente.getEspecialidad());
            preparedStatement.setString(2, asistente.getEstadoActividad());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Detalles, algo salio mal " + e);
        }
    }
    
    private static void agregarRegistro() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_REGISTROS);
            
            preparedStatement.setString(1, asistente.getCorreoElectronico());
            preparedStatement.setString(2, asistente.getContrasena());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Registro, algo salio mal" + e);
        }
    }
    
    private static void agregarRegistroAsistente() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_REGISTRO_ASISTENTE);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Detalles, algo salio mal" + e);
        }
    }
    
    public static ArrayList<Registro> readAsistentesRegister() {
        try {
            Statement st = CONNECTION.createStatement();
            ResultSet rs = st.executeQuery(QUERY_GET_REGISTROS_ASISTENTES);
            
            while (rs.next()) {
                Registro registro = new Registro();
                
                registro.setIdRegistro(rs.getInt(1));
                registro.setCorreElectronico(rs.getString(2));
                registro.setContrasena(rs.getString(3));
                registro.setDiaCreacion(rs.getInt(4));
                registro.setMesCreacion(rs.getInt(5));
                registro.setAnnioCreacion(rs.getInt(6));
                registro.setHoraCreacion(rs.getString(7));
                registro.setDiaModificacion(rs.getInt(8));
                registro.setMesModificacion(rs.getInt(9));
                registro.setAnnioModificacion(rs.getInt(10));
                registro.setHoraModificacion(rs.getString(11));
                registro.setIdUser(rs.getInt(12));
                
                REGISTRO_ASISTENTES.add(registro);
            }
        } catch (SQLException ex) {
            System.out.println("AsistentesRegistros " + ex);
        }
        
        return REGISTRO_ASISTENTES;
    }
    
    private static ArrayList<AsistenteModel> listAsistentes(String query) {
        ASISTENTES.clear();
        
        try {
            Statement st = CONNECTION.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()) {
                AsistenteModel asistenteModel = new AsistenteModel();
                
                asistenteModel.setId(rs.getInt(1));
                asistenteModel.setNombres(rs.getString(2));
                asistenteModel.setApellidos(rs.getString(3));
                asistenteModel.setEdad(rs.getInt(4));
                asistenteModel.setGenero(rs.getString(5));
                asistenteModel.setDiaNacimiento(rs.getInt(6));
                asistenteModel.setMesNacimiento(rs.getInt(7));
                asistenteModel.setAnnioNacimiento(rs.getInt(8));
                asistenteModel.setEspecialidad(rs.getString(9));
                asistenteModel.setEstadoActividad(rs.getString(10));
                asistenteModel.setTelefonoCelular(rs.getString(11));
                asistenteModel.setTelefonoCasa(rs.getString(12));
                asistenteModel.setDepartamento(rs.getString(13));
                asistenteModel.setMunicipio(rs.getString(14));
                asistenteModel.setDireccion(rs.getString(15));
                asistenteModel.setCorreoElectronico(rs.getString(16));
                asistenteModel.setContrasena(rs.getString(17));
                asistenteModel.setDiaCreacion(rs.getInt(18));
                asistenteModel.setMesCreacion(rs.getInt(19));
                asistenteModel.setAnnioCreacion(rs.getInt(20));
                asistenteModel.setHoraCreacion(rs.getString(21));
                asistenteModel.setDiaModificacion(rs.getInt(22));
                asistenteModel.setMesModificacion(rs.getInt(23));
                asistenteModel.setAnnioModificacion(rs.getInt(24));
                asistenteModel.setHoraModificacion(rs.getString(25));
                asistenteModel.setPaletaPreferencia(rs.getString(26));
                
                ASISTENTES.add(asistenteModel);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return ASISTENTES;
    }
    
    public static ArrayList<AsistenteModel> listarAsistentes() {
        return listAsistentes(GET_ASISTENTES_DATA);
    }
     
    public static ArrayList<AsistenteModel> listarAsistentesLike(String like) {
        return listAsistentes(GET_ASISTENTES_DATA + " and (a.nombres like '%" + like + "%' or a.apellidos like '%" + like + "%' or a.idAsistente like '%" + like + "%' or dg.edad like '%" + like + "%' or dg.genero like '%" + like + "%' or dp.actividad like '%" + like + "%')");
    }
    
    public static int countAsistentes() {
        return countSomething("Asistentes");
    }
    
    public static void updateAsistenteData(AsistenteModel asistente) {
        AsistenteHelper.asistente = asistente;
        
        updateAsistenteData();
        updateFechaModificacionAsistente();
        updateTelefonoAsistentes();
        updateFechaNacimientoAsistente();
        updateDatosGeneralesAsistente();
        updateDatosDireccion();
        updateDetallesAsistente();
        updateRegistro();
        
        if (ApplicationContext.isDoctorSesionActual()) {
            ActividadModel actividad = new ActividadModel();
            
            actividad.setNombres(ApplicationContext.getDoctor().getNombres());
            actividad.setApellidos(ApplicationContext.getDoctor().getApellidos());
            actividad.setMensajeActividad("Modificó a un asistente");
            actividad.setDescripcionActividad("Modificó un asistente: " + asistente.getNombres() + " " + asistente.getApellidos());
            actividad.setDiaActividad(LocalDateTime.now().getDayOfMonth());
            actividad.setMesActividad(LocalDateTime.now().getMonthValue());
            actividad.setAnnioActividad(LocalDateTime.now().getYear());
            actividad.setHoraActividad(String.valueOf(LocalDateTime.now().getHour()) + ":" + String.valueOf(LocalDateTime.now().getMinute()) + " " + NewContext.localTime.format(dateTimeFormatter));
            
            ActividadHelper.crearNuevaActividad(actividad);
        }
        
        ApplicationContext.dashboardScroll.setData();
        ApplicationContext.consultasDashboardTable.addTargets();
        ApplicationContext.asistentes.setData();
        ApplicationContext.mainInterface.mostrarPanel(ApplicationContext.asistentes);
        ApplicationContext.changeTheme(ApplicationContext.selectedAppereance);
    }
    
    private static void updateAsistenteData() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(UPDATE_ASISTENTE_DATA + " WHERE idAsistente = " + asistente.getId());
            
            preparedStatement.setString(1, asistente.getNombres());
            preparedStatement.setString(2, asistente.getApellidos());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    private static void updateFechaModificacionAsistente() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(UPDATE_FECHA_MODIFICACION 
                    + " WHERE idFechaHoraActualizacion = (SELECT fa.idFechaHoraActualizacion FROM FechaHoraActualizacion fa, DatosGenerales dg WHERE fa.idFechaHoraActualizacion = dg.idFechaHoraActualizacion and dg.idDatosGenerales = (SELECT dg.idDatosGenerales FROM DatosGenerales dg, DetallesAsistentes da WHERE dg.idDatosGenerales = da.idDatosGenerales and da.idAsistente = " + asistente.getId() + "));");
            
            preparedStatement.setInt(1, asistente.getDiaModificacion());
            preparedStatement.setInt(2, asistente.getMesModificacion());
            preparedStatement.setInt(3, asistente.getAnnioModificacion());
            preparedStatement.setString(4, asistente.getHoraModificacion());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    private static void updateTelefonoAsistentes() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(UPDATE_TELEFONO  
                    + " WHERE idTelefono = (SELECT t.idTelefono FROM Telefonos t, DatosGenerales dg WHERE t.idTelefono = dg.idTelefono and dg.idDatosGenerales = (SELECT dg.idDatosGenerales FROM DatosGenerales dg, DetallesAsistentes da WHERE dg.idDatosGenerales = da.idDatosGenerales and da.idAsistente = " + asistente.getId() + "));");
            
            preparedStatement.setString(1, asistente.getTelefonoCelular());
            preparedStatement.setString(2, asistente.getTelefonoCasa());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    private static void updateFechaNacimientoAsistente() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(UPDATE_FECHA_NACIMIENTO  
                    + " WHERE idFechaNacimiento = (SELECT fn.idFechaNacimiento FROM FechasNacimientos fn, DatosGenerales dg WHERE fn.idFechaNacimiento = dg.idFechaNacimiento and dg.idDatosGenerales = (SELECT dg.idDatosGenerales FROM DatosGenerales dg, DetallesAsistentes da WHERE dg.idDatosGenerales = da.idDatosGenerales and da.idAsistente = " + asistente.getId()+ "));");
            
            preparedStatement.setInt(1, asistente.getDiaNacimiento());
            preparedStatement.setInt(2, asistente.getMesNacimiento());
            preparedStatement.setInt(3, asistente.getAnnioNacimiento());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e + "Intervalo nac");
        }
    }
    
    private static void updateDatosGeneralesAsistente() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(UPDATE_DATOS_GENERALES + " WHERE idDatosGenerales = (SELECT dg.idDatosGenerales FROM DatosGenerales dg, DetallesAsistentes da WHERE dg.idDatosGenerales = da.idDatosGenerales and da.idAsistente = " + asistente.getId() + ")");
            
            preparedStatement.setInt(1, asistente.getEdad());
            preparedStatement.setString(2, asistente.getGenero());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e + "lol");
        }
    }
    
    private static void updateDatosDireccion() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(UPDATE_DATOS_DIRECCION
                    + " WHERE idDatosDireccion = (SELECT dd.idDatosDireccion FROM DatosDireccion dd, DatosGenerales dg WHERE dd.idDatosDireccion = dg.idDatosDireccion and dg.idDatosGenerales = (SELECT dg.idDatosGenerales FROM DatosGenerales dg, DetallesAsistentes da WHERE dg.idDatosGenerales = da.idDatosGenerales and da.idAsistente = " + asistente.getId() + "));");
            
            preparedStatement.setString(1, asistente.getDepartamento());
            preparedStatement.setString(2, asistente.getMunicipio());
            preparedStatement.setString(3, asistente.getDireccion());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    private static void updateDetallesAsistente() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(UPDATE_DETALLES_ASISTENTE + " WHERE idAsistente = " + asistente.getId());
            
            preparedStatement.setString(1, asistente.getEstadoActividad());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
        }
    }
    
    private static void updateRegistro() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(UPDATE_REGISTRO_ASISTENTE + asistente.getId() + ");");
            
            preparedStatement.setString(1, asistente.getCorreoElectronico());
            preparedStatement.setString(2, asistente.getContrasena());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}