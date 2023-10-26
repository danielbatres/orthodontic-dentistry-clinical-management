package com.helper;

import com.model.DoctorModel;
import com.model.Registro;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 17/09/22
 */
public class DoctorHelper extends Basics {
    private static final String QUERY_DOCTORES = "SELECT d.idDoctor, d.nombres, d.apellidos, do.especialidad, p.paletaPreferencia, dg.edad, dg.genero, fn.dia, fn.mes, fn.annio, t.celular, t.casa, dd.departamento, dd.municipio, dd.direccion, fc.dia, fc.mes, fc.annio, fc.hora, fa.dia, fa.mes, fa.annio, fa.hora FROM Doctores d\n" +
        "INNER JOIN DetallesDoctor do ON d.idDoctor = do.idDoctor\n" +
        "INNER JOIN DatosGenerales dg ON do.idDatosGenerales = dg.idDatosGenerales \n" +
        "INNER JOIN FechaHoraCreacion fc ON dg.idFechaHoraCreacion = fc.idFechaHoraCreacion\n" +
        "INNER JOIN FechaHoraActualizacion fa ON dg.idFechaHoraActualizacion = fa.idFechaHoraActualizacion\n" +
        "INNER JOIN Telefonos t ON dg.idTelefono = t.idTelefono\n" +
        "INNER JOIN FechasNacimientos fn ON dg.idFechaNacimiento = fn.idFechaNacimiento \n" +
        "INNER JOIN DatosDireccion dd ON dg.idDatosDireccion = dd.idDatosDireccion\n" +
        "INNER JOIN Preferencias p ON do.idPreferencia = p.idPreferencia";
    private static final String QUERY_READ_DOCTOR_REGISTER = "SELECT r.idRegistro, r.correoElectronico, r.contrasena, fh.dia, fh.mes, fh.annio, fh.hora, fa.dia, fa.mes, fa.annio, fa.hora, rd.idDoctor FROM Registros r\n" +
        "INNER JOIN RegistroDoctor rd ON r.idRegistro = rd.idRegistro \n" +
        "INNER JOIN FechaHoraCreacion fh ON r.idFechaHoraCreacion = fh.idFechaHoraCreacion\n" +
        "INNER JOIN FechaHoraActualizacion fa ON r.idFechaHoraActualizacion = fa.idFechaHoraActualizacion";
    private static final ArrayList<Registro> REGISTRO_DOCTORES = new ArrayList<>();
    private static final DoctorModel doctor = new DoctorModel();
    
    public static void setPreferencies(DoctorModel doctor) {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(getQueryPreferenciesDoctor(doctor.getPaletaPreferencia(), doctor.getId()));
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Preferencias" + e);
        }
    }
    
    public static DoctorModel listDoctor(int idDoctor) {
        try {
            Statement st = CONNECTION.createStatement();
            ResultSet rs = st.executeQuery(QUERY_DOCTORES + " WHERE d.idDoctor = " + idDoctor);
            
            while (rs.next()) {
                doctor.setId(rs.getInt(1));
                doctor.setNombres(rs.getString(2));
                doctor.setApellidos(rs.getString(3));
                doctor.setEspecialidad(rs.getString(4));
                doctor.setPaletaPreferencia(rs.getString(5));
                doctor.setEdad(rs.getInt(6));
                doctor.setGenero(rs.getString(7));
                doctor.setDiaNacimiento(rs.getInt(8));
                doctor.setMesNacimiento(rs.getInt(9));
                doctor.setAnnioNacimiento(rs.getInt(10));
                doctor.setTelefonoCelular(rs.getString(11));
                doctor.setTelefonoCasa(rs.getString(12));
                doctor.setDepartamento(rs.getString(13));
                doctor.setMunicipio(rs.getString(14));
                doctor.setDireccion(rs.getString(15));
                doctor.setDiaCreacion(rs.getInt(16));
                doctor.setMesCreacion(rs.getInt(17));
                doctor.setAnnioCreacion(rs.getInt(18));
                doctor.setHoraCreacion(rs.getString(19));
                doctor.setDiaModificacion(rs.getInt(20));
                doctor.setMesModificacion(rs.getInt(21));
                doctor.setAnnioModificacion(rs.getInt(22));
                doctor.setHoraModificacion(rs.getString(23));
            }
        } catch (SQLException e) {
            System.out.println("ACA" + e);
        }
        
        return doctor;
    }
    
    public static ArrayList<Registro> readDoctorsRegister() {
        try {
            Statement st = CONNECTION.createStatement();
            ResultSet rs = st.executeQuery(QUERY_READ_DOCTOR_REGISTER);
            
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
                REGISTRO_DOCTORES.add(registro);
            }
        } catch (SQLException ex) {
            System.out.println("Algo salio mal " + ex);
        }
        
        return REGISTRO_DOCTORES;
    }
}
