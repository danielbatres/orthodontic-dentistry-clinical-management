package com.helper;

import com.model.ActividadModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 8/10/22
 */
public class ActividadHelper extends Basics {
    private static final String QUERY_AGREGAR_ACTIVIDAD = "INSERT INTO Actividad (nombres, apellidos, mensajeActividad, descripcionActividad, dia, mes, annio, hora) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
    private static final String QUERY_OBTENER_ACTIVIDAD = "SELECT nombres, apellidos, mensajeActividad, descripcionActividad, dia, mes, annio, hora FROM Actividad";
    private static final ArrayList<ActividadModel> actividades = new ArrayList<>();
    
    public static void crearNuevaActividad(ActividadModel actividad) {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_AGREGAR_ACTIVIDAD);
            
            preparedStatement.setString(1, actividad.getNombres());
            preparedStatement.setString(2, actividad.getApellidos());
            preparedStatement.setString(3, actividad.getMensajeActividad());
            preparedStatement.setString(4, actividad.getDescripcionActividad());
            preparedStatement.setInt(5, actividad.getDiaActividad());
            preparedStatement.setInt(6, actividad.getMesActividad());
            preparedStatement.setInt(7, actividad.getAnnioActividad());
            preparedStatement.setString(8, actividad.getHoraActividad());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Nueva Actividad " + e);
        }
    }
    
    public static ArrayList<ActividadModel> listarActividadQuery(String query) {
        actividades.clear();
        
        try {
            Statement st = CONNECTION.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()) {
                ActividadModel actividadModel = new ActividadModel();
                
                actividadModel.setNombres(rs.getString(1));
                actividadModel.setApellidos(rs.getString(2));
                actividadModel.setMensajeActividad(rs.getString(3));
                actividadModel.setDescripcionActividad(rs.getString(4));
                actividadModel.setDiaActividad(rs.getInt(5));
                actividadModel.setMesActividad(rs.getInt(6));
                actividadModel.setAnnioActividad(rs.getInt(7));
                actividadModel.setHoraActividad(rs.getString(8));
                
                actividades.add(actividadModel);
            }
        } catch (SQLException e) {
            System.out.println("Listar Actividad " + e);
        }
        
        return actividades;
    }
    
    public static ArrayList<ActividadModel> listarActividad() {
        return listarActividadQuery(QUERY_OBTENER_ACTIVIDAD + " ORDER BY dia DESC, mes DESC, annio DESC");
    }
    
    public static ArrayList<ActividadModel> listarActividadLike(String like) {
        return listarActividadQuery(QUERY_OBTENER_ACTIVIDAD + " WHERE (nombres like '%" + like + "%' or apellidos like '%" + like + "%' or descripcionActividad like '%" + like + "%') ORDER BY dia DESC, mes DESC, annio DESC");
    }
} 
