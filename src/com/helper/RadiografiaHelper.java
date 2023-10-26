package com.helper;

import com.context.ApplicationContext;
import com.model.ActividadModel;
import com.model.RadiografiaModel;
import com.model.RadiografiaType;
import com.view.createPacient.NewContext;
import static com.view.createPacient.NewContext.dateTimeFormatter;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.imageio.ImageIO;

/**
 *
 * @author Daniel Batres
 */
public class RadiografiaHelper extends Basics {
    private static String createRadiografia = "";
    private static String updateRadiografia = "";
    private static String getRadiografiasQuery = "";
    private static String deleteRadiografiaQuery = "";
    private static RadiografiaModel radiografiaModel;
    private static ArrayList<RadiografiaModel> RADIOGRAFIAS;
    
    public static void crearNuevaRadiografia(RadiografiaModel radiografia) {
        RadiografiaHelper.radiografiaModel = radiografia;
        
        addRadiografiaData();
        
        ActividadModel actividad = new ActividadModel();
        
        if (ApplicationContext.isDoctorSesionActual()) {
            actividad.setNombres(ApplicationContext.getDoctor().getNombres());
            actividad.setApellidos(ApplicationContext.getDoctor().getApellidos());
        } else {
            actividad.setNombres(ApplicationContext.getAsistente().getNombres());
            actividad.setApellidos(ApplicationContext.getAsistente().getApellidos());
        }
        
        actividad.setMensajeActividad("Agrego una radiografía");
        actividad.setDescripcionActividad("Agrego una radiografía para: " + ApplicationContext.selectedPacient.getNombres() + " " +  ApplicationContext.selectedPacient.getApellidos());
        actividad.setDiaActividad(LocalDateTime.now().getDayOfMonth());
        actividad.setMesActividad(LocalDateTime.now().getMonthValue());
        actividad.setAnnioActividad(LocalDateTime.now().getYear());
        actividad.setHoraActividad(String.valueOf(LocalDateTime.now().getHour()) + ":" + String.valueOf(LocalDateTime.now().getMinute()) + " " + NewContext.localTime.format(dateTimeFormatter));

        ActividadHelper.crearNuevaActividad(actividad);
    }
    
    private static void addRadiografiaData() {
        int id;
        
        if (radiografiaModel.getTratamiento().equals("ortodoncia")) {
            createRadiografia = "INSERT INTO RadiografiasOrtodoncia (idFichaOrtodoncia, fechaDeCreacion, imagen, tipoImagen, nombreRoot) VALUES (?, ?, ?, ?, ?);";
            id = getId("FichaOrtodoncia", ApplicationContext.selectedPacient.getId());
        } else {
            createRadiografia = "INSERT INTO RadiografiasOdontologia (idFichaOdontologia, fechaDeCreacion, imagen, tipoImagen, nombreRoot) VALUES (?, ?, ?, ?, ?);";
            id = getId("FichaOdontologia", ApplicationContext.selectedPacient.getId());
        }
        
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(createRadiografia);
            
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, radiografiaModel.getFechaDeCreacion());
            preparedStatement.setBlob(3, radiografiaModel.getImagen());
            preparedStatement.setString(4, String.valueOf(radiografiaModel.getTipo()));
            preparedStatement.setString(5, radiografiaModel.getNombreImagen());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    private static RadiografiaType convertType(String type) {
        if (!type.equals("ANTES") && !type.equals("DESPUES")) return null;
        
        if (type.equals("ANTES")) {
            return RadiografiaType.ANTES;
        }
        
        return RadiografiaType.DESPUES;
    }
    
    public static ArrayList<RadiografiaModel> getRadiografias(String treatment, int idFicha){
        RADIOGRAFIAS = new ArrayList<>();
        
        if (treatment.equals("odontologia")) {
            getRadiografiasQuery = "SELECT idRadiografiaOdontologia, fechaDeCreacion, imagen, tipoImagen, nombreRoot FROM RadiografiasOdontologia WHERE idFichaOdontologia = " + idFicha;
        } else {
            getRadiografiasQuery = "SELECT idRadiografiaOrtodoncia, fechaDeCreacion, imagen, tipoImagen, nombreRoot FROM RadiografiasOrtodoncia WHERE idFichaOrtodoncia = " + idFicha;
        }
        
        try {
            Statement st = CONNECTION.createStatement();
            ResultSet rs = st.executeQuery(getRadiografiasQuery);
            
            while (rs.next()) {
                RadiografiaModel radiografia = new RadiografiaModel();
                
                try {
                    Blob imagen = rs.getBlob(3);
                    byte[] bytes = imagen.getBytes(1, (int) imagen.length());
                    BufferedImage img = ImageIO.read(new ByteArrayInputStream(bytes));
                    radiografia.setImagenIcon(img);
                } catch(IOException e) {
                    System.out.println(e);
                }
                radiografia.setId(rs.getInt(1));
                radiografia.setFechaDeCreacion(rs.getString(2));
                radiografia.setTipo(convertType(rs.getString(4)));
                radiografia.setTratamiento(treatment);
                radiografia.setNombreImagen(rs.getString(5));
                
                
                RADIOGRAFIAS.add(radiografia);
            }
        } catch(SQLException e) {
            System.out.println(e);
        }
        
        return RADIOGRAFIAS;
    }
    
    public static void updateRadiografias(RadiografiaModel radiografia) {
        RadiografiaHelper.radiografiaModel = radiografia;
        
        updateRadiografiaData();
    }   

    private static void updateRadiografiaData() {
        int id;
        
        if (radiografiaModel.getTratamiento().equals("Ortodoncia")) {
            updateRadiografia = "UPDATE RadiografiasOrtodoncia SET imagen = ?";
        } else {
            updateRadiografia = "UPDATE RadiografiasOdontologia SET imagen = ?";
        }
        
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(updateRadiografia);
            
            preparedStatement.setBlob(1, radiografiaModel.getImagen());
            preparedStatement.setString(2, String.valueOf(radiografiaModel.getTipo()));
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void deleteRadiografia(String treatment, int idRadiografia) {
        if (treatment.equals("odontologia")) {
            deleteRadiografiaQuery = "DELETE FROM RadiografiasOdontologia WHERE idRadiografiaOdontologia = " + idRadiografia;
        } else {
            deleteRadiografiaQuery = "DELETE FROM RadiografiasOrtodoncia WHERE idRadiografiaOrtodoncia = " + idRadiografia;
        }
        
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(deleteRadiografiaQuery);
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        ActividadModel actividad = new ActividadModel();
        
        if (ApplicationContext.isDoctorSesionActual()) {
            actividad.setNombres(ApplicationContext.getDoctor().getNombres());
            actividad.setApellidos(ApplicationContext.getDoctor().getApellidos());
        } else {
            actividad.setNombres(ApplicationContext.getAsistente().getNombres());
            actividad.setApellidos(ApplicationContext.getAsistente().getApellidos());
        }
        
        actividad.setMensajeActividad("Elimino una radiografía");
        actividad.setDescripcionActividad("Elimino una radiografía de: " + ApplicationContext.selectedPacient.getNombres() + " " +  ApplicationContext.selectedPacient.getApellidos());
        actividad.setDiaActividad(LocalDateTime.now().getDayOfMonth());
        actividad.setMesActividad(LocalDateTime.now().getMonthValue());
        actividad.setAnnioActividad(LocalDateTime.now().getYear());
        actividad.setHoraActividad(String.valueOf(LocalDateTime.now().getHour()) + ":" + String.valueOf(LocalDateTime.now().getMinute()) + " " + NewContext.localTime.format(dateTimeFormatter));

        ActividadHelper.crearNuevaActividad(actividad);
    }
    
    private static int getId(String from, int idPaciente) {
        int id = 0;
        
        try {
            Statement st = CONNECTION.createStatement();
            ResultSet rs = st.executeQuery("SELECT id" + from + " FROM " + from + " WHERE idPaciente = " + idPaciente);
            
            while (rs.next()) {
                id = rs.getInt(1);
            }
        } catch(SQLException e) {
            System.out.println(e);
        }
        
        return id;
    }
}
