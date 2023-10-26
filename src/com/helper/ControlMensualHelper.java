package com.helper;

import com.model.ControlMensualModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author Daniel Batres
 * @version 1.0.0
 * @since 04/10/22
 */
public class ControlMensualHelper extends Basics {
    private static final String QUERY_GET_CONTROL_MENSUAL = "SELECT cm.idControlMensual, cm.MX, cm.MD, cm.cadenas, cm.hules, cm.Observaciones, fc.dia, fc.mes, fc.annio, fc.hora, fa.dia, fa.mes, fa.annio, fa.hora FROM ControlMensual cm\n" +
        "INNER JOIN FechaHoraCreacion fc ON cm.idFechaHoraCreacion = fc.idFechaHoraCreacion\n" +
        "INNER JOIN FechaHoraActualizacion fa ON cm.idFechaHoraActualizacion = fa.idFechaHoraActualizacion\n" +
        "WHERE cm.idPaciente = ";
    private static final String QUERY_CREATE_CONTROL_MENSUAL = "INSERT INTO ControlMensual (idFechaHoraCreacion, idFechaHoraActualizacion, idPaciente, cadenas, hules, MD, MX, Observaciones) VALUES (\n" +
        "(SELECT MAX(idFechaHoraCreacion) FROM FechaHoraCreacion), \n" +
        "(SELECT MAX(idFechaHoraActualizacion) FROM FechaHoraActualizacion), ?, ?, ?, ?, ?, ?);";
    private static final String UPDATE_CONTROL_MENSUAL = "UPDATE ControlMensual SET MX = ?, MD = ?, cadenas = ?, hules = ?, Observaciones = ? WHERE idControlMensual = ";
    private static final ArrayList<ControlMensualModel> CONTROL_MENSUAL = new ArrayList<>();
    private static ControlMensualModel controlMensualModel;

    public static String getQUERY_GET_CONTROL_MENSUAL() {
        return QUERY_GET_CONTROL_MENSUAL;
    }
    
    public static void crearControlMensual(ControlMensualModel controlMensualModel, int idPaciente) {
        ControlMensualHelper.controlMensualModel = controlMensualModel;
        
        agregarFechaCreacion();
        agregarFechaModificacion();
        agregarControlMensual(idPaciente);
    }
    
    public static void agregarFechaCreacion() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_CREACION);
            
            preparedStatement.setInt(1, controlMensualModel.getDiaCreacion());
            preparedStatement.setInt(2, controlMensualModel.getMesCreacion());
            preparedStatement.setInt(3, controlMensualModel.getAnnioCreacion());
            preparedStatement.setString(4, controlMensualModel.getHoraCreacion());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Fecha creacion" + e);
        }
    }
    
    public static void agregarFechaModificacion() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_MODIFICACION);
            
            preparedStatement.setInt(1, controlMensualModel.getDiaModificacion());
            preparedStatement.setInt(2, controlMensualModel.getMesModificacion());
            preparedStatement.setInt(3, controlMensualModel.getAnnioModificacion());
            preparedStatement.setString(4, controlMensualModel.getHoraModificacion());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Fecha modificacion" + e);
        }
    }
    
    
    public static void agregarControlMensual(int idPaciente) {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_CREATE_CONTROL_MENSUAL);
            
            preparedStatement.setInt(1, idPaciente);
            preparedStatement.setString(2, controlMensualModel.getCadenas());
            preparedStatement.setString(3, controlMensualModel.getHules());
            preparedStatement.setString(4, controlMensualModel.getMd());
            preparedStatement.setString(5, controlMensualModel.getMx());
            preparedStatement.setString(6, controlMensualModel.getObservaciones());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Agregar control mensual " + e);
        }
    }
    
    public static ArrayList<ControlMensualModel> obtenerControlMensual(String query) {
        CONTROL_MENSUAL.clear();
        
        try {
            Statement st = CONNECTION.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()) {
                ControlMensualModel model = new ControlMensualModel();
                
                model.setId(rs.getInt(1));
                model.setMx(rs.getString(2));
                model.setMd(rs.getString(3));
                model.setCadenas(rs.getString(4));
                model.setHules(rs.getString(5));
                model.setObservaciones(rs.getString(6));
                model.setDiaCreacion(rs.getInt(7));
                model.setMesCreacion(rs.getInt(8));
                model.setAnnioCreacion(rs.getInt(9));
                model.setHoraCreacion(rs.getString(10));
                model.setDiaModificacion(rs.getInt(11));
                model.setMesModificacion(rs.getInt(12));
                model.setAnnioModificacion(rs.getInt(13));
                model.setHoraModificacion(rs.getString(14));
                
                CONTROL_MENSUAL.add(model);
            }
        } catch (SQLException e) {
            System.out.println("Control mensual " + e);
        }
        
        return CONTROL_MENSUAL;
    }
    
    public static void updateControlMensual(ControlMensualModel controlMensual) {
        ControlMensualHelper.controlMensualModel = controlMensual;
        
        updateFechaModificacionControlMensual();
        updateControlMensualDatos();
    }
    
    private static void updateFechaModificacionControlMensual() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(UPDATE_FECHA_MODIFICACION 
                    + " WHERE idFechaHoraActualizacion = (SELECT fa.idFechaHoraActualizacion FROM ControlMensual cm, FechaHoraActualizacion fa WHERE cm.idFechaHoraActualizacion = fa.idFechaHoraActualizacion and cm.idControlMensual = " + controlMensualModel.getId() + ")");
            
            preparedStatement.setInt(1, controlMensualModel.getDiaModificacion());
            preparedStatement.setInt(2, controlMensualModel.getMesModificacion());
            preparedStatement.setInt(3, controlMensualModel.getAnnioModificacion());
            preparedStatement.setString(4, controlMensualModel.getHoraModificacion());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    private static void updateControlMensualDatos() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(UPDATE_CONTROL_MENSUAL + controlMensualModel.getId());
            
            preparedStatement.setString(1, controlMensualModel.getMx());
            preparedStatement.setString(2, controlMensualModel.getMd());
            preparedStatement.setString(3, controlMensualModel.getCadenas());
            preparedStatement.setString(4, controlMensualModel.getHules());
            preparedStatement.setString(5, controlMensualModel.getObservaciones());            
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}