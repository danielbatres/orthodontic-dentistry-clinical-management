package com.helper;

import com.model.FichaOrtodonciaModel;
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
public class FichaOrtodonciaHelper extends Basics{
    private static final String QUERY_FICHA_ORTODONCIA = "INSERT INTO FichaOrtodoncia (idPaciente, idFechaHoraCreacion, idFechaHoraActualizacion) VALUES (\n" +
        "(SELECT MAX(idPaciente) FROM Pacientes),\n" +
        "(SELECT MAX(idFechaHoraCreacion) FROM FechaHoraCreacion),\n" +
        "(SELECT MAX(idFechaHoraActualizacion) FROM FechaHoraActualizacion));";
    private static final String QUERY_DATOS_DIAGNOSTICO_ORTODONCIA = "INSERT INTO DatosDiagnosticoOrtodoncia (idFichaOrtodoncia, HO, HM, PerfilTotal, PerfilTercioinf, AnguloNasolabial, AnguloCuelloMenton, Encias, Frenillos) VALUES (\n" +
        "(SELECT MAX(idFichaOrtodoncia) FROM FichaOrtodoncia), ?, ?, ?, ?, ?, ?, ?, ?);";
    private static final String QUERY_DATOS_DIAGNOSTICO_ORTODONTICO = "INSERT INTO DatosDiagnosticoOrtodontico (idFichaOrtodoncia, RMD, RMI, RCD, RCI, SMH, SMV, lineasMedias, tipoDenticion, extracciones, observaciones) VALUES (\n" +
        "(SELECT MAX(idFichaOrtodoncia) FROM FichaOrtodoncia), ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    
    private static final String GET_FICHA_DATA = "SELECT fo.idFichaOrtodoncia, ddoca.HM, ddoca.HO, ddoca.PerfilTotal, ddoca.PerfilTercioinf, ddoca.AnguloNasolabial, ddoca.AnguloCuelloMenton, ddoca.Encias, ddoca.Frenillos, ddocc.RMD, ddocc.RMI, ddocc.RCD, ddocc.RCI, ddocc.SMH, ddocc.SMV, ddocc.lineasMedias, ddocc.tipoDenticion, ddocc.extracciones, ddocc.observaciones, fc.dia, fc.mes, fc.annio, fc.annio, fa.dia, fa.mes, fa.annio, fa.hora FROM FichaOrtodoncia fo\n" +
        "INNER JOIN DatosDiagnosticoOrtodoncia ddoca ON fo.idFichaOrtodoncia = ddoca.idFichaOrtodoncia\n" +
        "INNER JOIN DatosDiagnosticoOrtodontico ddocc ON fo.idFichaOrtodoncia = ddocc.idFichaOrtodoncia\n" +
        "INNER JOIN FechaHoraCreacion fc ON fo.idFechaHoraCreacion = fc.idFechaHoraCreacion\n" +
        "INNER JOIN FechaHoraActualizacion fa ON fo.idFechaHoraActualizacion = fa.idFechaHoraActualizacion";
    private static final String UPDATE_DATOS_DIAGNOSTICO_ORTODONCIA = "UPDATE DatosDiagnosticoOrtodoncia SET HO = ?, HM = ?, PerfilTotal = ?, PerfilTercioinf = ?, AnguloNasolabial = ?, AnguloCuelloMenton = ?, Encias = ?, Frenillos = ?";
    private static final String UPDATE_DATOS_DIAGNOSTICO_ORTODONTICO = "UPDATE DatosDiagnosticoOrtodontico SET RMD = ?, RMI = ?, RCD = ?, RCI = ?, SMH = ?, SMV = ?, lineasMedias = ?, tipoDenticion = ?, extracciones = ?, observaciones = ?";
    private static FichaOrtodonciaModel fichaOrtodoncia;
    
    public static void crearFichaOrtodoncia(FichaOrtodonciaModel fichaOrtodoncia) {
        FichaOrtodonciaHelper.fichaOrtodoncia = fichaOrtodoncia;
        
        agregarFechaCreacion();
        agregarFechaModificacion();
        agregarFicha();
        agregarDatosDiagnosticoOrtodoncia();
        agregarDatosDiagnosticoOrtodontico();
    }
    
    public static void agregarFechaCreacion() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_CREACION);
            
            preparedStatement.setInt(1, fichaOrtodoncia.getDiaCreacion());
            preparedStatement.setInt(2, fichaOrtodoncia.getMesCreacion());
            preparedStatement.setInt(3, fichaOrtodoncia.getAnnioCreacion());
            preparedStatement.setString(4, fichaOrtodoncia.getHoraCreacion());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Fecha creacion" + e);
        }
    }
    
    private static void agregarFechaModificacion() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_MODIFICACION);
            
            preparedStatement.setInt(1, fichaOrtodoncia.getDiaModificacion());
            preparedStatement.setInt(2, fichaOrtodoncia.getMesModificacion());
            preparedStatement.setInt(3, fichaOrtodoncia.getAnnioModificacion());
            preparedStatement.setString(4, fichaOrtodoncia.getHoraModificacion());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Fecha modificacion" + e);
        }
    }
    
    private static void agregarFicha() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_FICHA_ORTODONCIA);
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Ficha" + e);
        }
    }
    
    private static void agregarDatosDiagnosticoOrtodoncia() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_DATOS_DIAGNOSTICO_ORTODONCIA);
            
            preparedStatement.setString(1, fichaOrtodoncia.getHO());
            preparedStatement.setString(2, fichaOrtodoncia.getHM());
            preparedStatement.setString(3, fichaOrtodoncia.getPerfilTotal());
            preparedStatement.setString(4, fichaOrtodoncia.getPerfilTercioInf());
            preparedStatement.setString(5, fichaOrtodoncia.getAnguloNasolabial());
            preparedStatement.setString(6, fichaOrtodoncia.getAnguloCuelloMenton());
            preparedStatement.setString(7, fichaOrtodoncia.getEncias());
            preparedStatement.setString(8, fichaOrtodoncia.getFrenillos());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Datos odontologia" + e);
        }
    }
    
    private static void agregarDatosDiagnosticoOrtodontico() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_DATOS_DIAGNOSTICO_ORTODONTICO);
            
            preparedStatement.setString(1, fichaOrtodoncia.getRMD());
            preparedStatement.setString(2, fichaOrtodoncia.getRMI());
            preparedStatement.setString(3, fichaOrtodoncia.getRCD());
            preparedStatement.setString(4, fichaOrtodoncia.getRCI());
            preparedStatement.setString(5, fichaOrtodoncia.getSMH());
            preparedStatement.setString(6, fichaOrtodoncia.getSMV());
            preparedStatement.setString(7, fichaOrtodoncia.getLineasMedias());
            preparedStatement.setString(8, fichaOrtodoncia.getTipoDenticion());
            preparedStatement.setString(9, String.valueOf(fichaOrtodoncia.isExtracciones()));
            preparedStatement.setString(10, fichaOrtodoncia.getObservaciones());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Datos odontologico" + e);
        }
    }
    
    public static FichaOrtodonciaModel getFicha(int id) {
        fichaOrtodoncia = new FichaOrtodonciaModel();
        
        try {
            Statement st = CONNECTION.createStatement();
            ResultSet rs = st.executeQuery(GET_FICHA_DATA + " WHERE fo.idPaciente = " + id);
            
            while (rs.next()) {
                fichaOrtodoncia.setId(rs.getInt(1));
                fichaOrtodoncia.setHM(rs.getString(2));
                fichaOrtodoncia.setHO(rs.getString(3));
                fichaOrtodoncia.setPerfilTotal(rs.getString(4));
                fichaOrtodoncia.setPerfilTercioInf(rs.getString(5));
                fichaOrtodoncia.setAnguloNasolabial(rs.getString(6));
                fichaOrtodoncia.setAnguloCuelloMenton(rs.getString(7));
                fichaOrtodoncia.setEncias(rs.getString(8));
                fichaOrtodoncia.setFrenillos(rs.getString(9));
                fichaOrtodoncia.setRMD(rs.getString(10));
                fichaOrtodoncia.setRMI(rs.getString(11));
                fichaOrtodoncia.setRCD(rs.getString(12));
                fichaOrtodoncia.setRCI(rs.getString(13));
                fichaOrtodoncia.setSMH(rs.getString(14));
                fichaOrtodoncia.setSMV(rs.getString(15));
                fichaOrtodoncia.setLineasMedias(rs.getString(16));
                fichaOrtodoncia.setTipoDenticion(rs.getString(17));
                fichaOrtodoncia.setExtracciones(Boolean.parseBoolean(rs.getString(18)));
                fichaOrtodoncia.setObservaciones(rs.getString(19));
                fichaOrtodoncia.setDiaCreacion(rs.getInt(20));
                fichaOrtodoncia.setMesCreacion(rs.getInt(21));
                fichaOrtodoncia.setAnnioCreacion(rs.getInt(22));
                fichaOrtodoncia.setHoraCreacion(rs.getString(23));
                fichaOrtodoncia.setDiaModificacion(rs.getInt(24));
                fichaOrtodoncia.setMesModificacion(rs.getInt(25));
                fichaOrtodoncia.setAnnioModificacion(rs.getInt(26));
                fichaOrtodoncia.setHoraModificacion(rs.getString(27));
            }
        } catch (SQLException e) {
            System.out.println("obtener ficha ortodoncia" + e);
        }
        
        return fichaOrtodoncia;
    }
    
    public static void updateFichaOrtodoncia(FichaOrtodonciaModel fichaOrtondcia, int idPaciente) {
        FichaOrtodonciaHelper.fichaOrtodoncia = fichaOrtondcia;
        
        updateFechaModificacionOrtodoncia(idPaciente);
        updateDatosDiagnosticoOrtodoncia(idPaciente);
        updateDatosDiagnosticoOrtodontico(idPaciente);
    }
    
    private static void updateFechaModificacionOrtodoncia(int idPaciente) {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(UPDATE_FECHA_MODIFICACION 
                    + " WHERE idFechaHoraActualizacion = (SELECT fa.idFechaHoraActualizacion FROM FechaHoraActualizacion fa, FichaOrtodoncia fo WHERE fa.idFechaHoraActualizacion = fo.idFechaHoraActualizacion and fo.idPaciente = " + idPaciente +");");
            
            preparedStatement.setInt(1, fichaOrtodoncia.getDiaModificacion());
            preparedStatement.setInt(2, fichaOrtodoncia.getMesModificacion());
            preparedStatement.setInt(3, fichaOrtodoncia.getAnnioModificacion());
            preparedStatement.setString(4, fichaOrtodoncia.getHoraModificacion());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    private static void updateDatosDiagnosticoOrtodoncia(int idPaciente) {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(UPDATE_DATOS_DIAGNOSTICO_ORTODONCIA + " WHERE idFichaOrtodoncia = (SELECT idFichaOrtodoncia FROM FichaOrtodoncia fo , Pacientes p WHERE fo.idPaciente = p.idPaciente and p.idPaciente =  " + idPaciente + ")");
            
            preparedStatement.setString(1, fichaOrtodoncia.getHO());
            preparedStatement.setString(2, fichaOrtodoncia.getHM());
            preparedStatement.setString(3, fichaOrtodoncia.getPerfilTotal());
            preparedStatement.setString(4, fichaOrtodoncia.getPerfilTercioInf());
            preparedStatement.setString(5, fichaOrtodoncia.getAnguloNasolabial());
            preparedStatement.setString(6, fichaOrtodoncia.getAnguloCuelloMenton());
            preparedStatement.setString(7, fichaOrtodoncia.getEncias());
            preparedStatement.setString(8, fichaOrtodoncia.getFrenillos());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    private static void updateDatosDiagnosticoOrtodontico(int idPaciente) {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(UPDATE_DATOS_DIAGNOSTICO_ORTODONTICO + " WHERE idFichaOrtodoncia = (SELECT idFichaOrtodoncia FROM FichaOrtodoncia fo , Pacientes p WHERE fo.idPaciente = p.idPaciente and p.idPaciente =  " + idPaciente + ")");
            
            preparedStatement.setString(1, fichaOrtodoncia.getRMD());
            preparedStatement.setString(2, fichaOrtodoncia.getRMI());
            preparedStatement.setString(3, fichaOrtodoncia.getRCD());
            preparedStatement.setString(4, fichaOrtodoncia.getRCI());
            preparedStatement.setString(5, fichaOrtodoncia.getSMH());
            preparedStatement.setString(6, fichaOrtodoncia.getSMV());
            preparedStatement.setString(7, fichaOrtodoncia.getLineasMedias());
            preparedStatement.setString(8, fichaOrtodoncia.getTipoDenticion());
            preparedStatement.setString(9, String.valueOf(fichaOrtodoncia.isExtracciones()));
            preparedStatement.setString(10, fichaOrtodoncia.getObservaciones());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
