package com.helper;

import com.connection.GenerateConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 27/09/22
 */
public class Basics {
    public static final Connection CONNECTION = GenerateConnection.getConnection();
    public static final String QUERY_CREACION = "INSERT INTO FechaHoraCreacion (dia, mes, annio, hora) VALUES (?, ?, ?, ?);";
    public static final String QUERY_MODIFICACION = "INSERT INTO FechaHoraActualizacion (dia, mes, annio, hora) VALUES (?, ?, ?, ?);";
    public static final String QUERY_TELEFONOS = "INSERT INTO Telefonos (celular, casa) VALUES (?, ?);";
    public static final String QUERY_DIRECCION = "INSERT INTO DatosDireccion (departamento, municipio, direccion) VALUES (?, ?, ?);";
    public static final String QUERY_FECHA_NACIMIENTO = "INSERT INTO FechasNacimientos (dia, mes, annio) VALUES (?, ?, ?);";
    public static final String QUERY_DATOS_GENERALES = "INSERT INTO DatosGenerales (idFechaHoraCreacion, idFechaHoraActualizacion, idFechaNacimiento, idTelefono, idDatosDireccion, edad, genero) VALUES (\n" +
        "(SELECT MAX(idFechaHoraCreacion) FROM FechaHoraCreacion),\n" +
        "(SELECT MAX(idFechaHoraActualizacion) FROM FechaHoraActualizacion),\n" +
        "(SELECT MAX(idFechaNacimiento) FROM FechasNacimientos),\n" +
        "(SELECT MAX(idTelefono) From Telefonos),\n" +
        "(SELECT MAX(idDatosDireccion) FROM DatosDireccion), ?, ?);";
    public static final String QUERY_REGISTROS = "INSERT INTO Registros (correoElectronico, contrasena, idFechaHoraCreacion, idFechaHoraActualizacion) VALUES (?, ?, \n" +
        "(SELECT MAX(idFechaHoraCreacion) FROM FechaHoraCreacion),\n" +
        "(SELECT MAX(idFechaHoraCreacion) FROM FechaHoraCreacion)); ";
    public static final String UPDATE_FECHA_MODIFICACION = "UPDATE FechaHoraActualizacion SET dia = ?, mes = ?, annio = ?, hora = ?";
    public static final String UPDATE_TELEFONO = "UPDATE Telefonos SET celular = ?, casa = ?";
    public static final String UPDATE_FECHA_NACIMIENTO = "UPDATE FechasNacimientos SET dia = ?, mes = ?, annio = ?";
    public static final String UPDATE_DATOS_GENERALES = "UPDATE DatosGenerales SET edad = ?, genero = ?";
    public static final String UPDATE_DATOS_DIRECCION = "UPDATE DatosDireccion SET departamento = ?, municipio = ?, direccion = ?";
    
    public static String getQueryPreferenciesDoctor(String theme, int idDoctor) {
        return "UPDATE Preferencias SET paletaPreferencia = '" + theme + "' WHERE idPreferencia = (SELECT idPreferencia FROM DetallesDoctor WHERE idDoctor = " + idDoctor + ");";
    }
    
    public static String getQueryPreferenciesAsistentes(String theme, int idAsistente) {
        return "UPDATE Preferencias SET paletaPreferencia = '" + theme + "' WHERE idPreferencia = (SELECT idPreferencia FROM DetallesAsistentes WHERE idAsistente = " + idAsistente + ");";
    }
    
    public static int countSomething(String name) {
        int quantity = 0;
        
        try {
            String query = "SELECT COUNT(*) as cantidad FROM " + name;
            Statement st = CONNECTION.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()) {
                quantity = rs.getInt("cantidad");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return quantity;
    }
}
