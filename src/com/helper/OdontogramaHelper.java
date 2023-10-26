package com.helper;

import com.model.DienteOdontogramaModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Daniel Batres
 */
public class OdontogramaHelper extends Basics {
    private static final String ADD_DIENTE_ODONTOGRAMA = "INSERT INTO OdontogramaDientes (idOdontograma, Diagnostico, DescripcionDiagnostico, Procedimiento, Pieza, Cara, NumeroPieza, Seleccion, Side) VALUES ((SELECT idOdontograma FROM Odontograma o, FichaOdontologia fo WHERE o.idFichaOdontologia = fo.idFichaOdontologia and fo.idFichaOdontologia = (SELECT idFichaOdontologia FROM FichaOdontologia fo, Pacientes p WHERE fo.idPaciente = p.idPaciente and p.idPaciente = ";
    private static final String GET_DIENTE_ODONTOGRAMA_VALUES = "SELECT IdOdontogramaDiente, Diagnostico, DescripcionDiagnostico, Procedimiento, Pieza, Cara, NumeroPieza, Seleccion, Side FROM OdontogramaDientes \n" +
        "WHERE idOdontograma = (SELECT idOdontograma FROM Odontograma o, FichaOdontologia fo \n" +
        "WHERE o.idFichaOdontologia = fo.idFichaOdontologia and fo.idFichaOdontologia = (SELECT idFichaOdontologia FROM FichaOdontologia fo, Pacientes p \n" +
        "WHERE fo.idPaciente = p.idPaciente and p.idPaciente = ";
    private static final String UPDATE_DIENTE_ODONTOGRAMA = "UPDATE OdontogramaDientes SET Diagnostico = ?, DescripcionDiagnostico = ?, Procedimiento = ?, Pieza = ?, NumeroPieza = ?, Cara = ?, Seleccion = ?, Side = ? WHERE IdOdontogramaDiente = ?;";
    private static final String DELETE_DIENTE_ODONTOGRAMA = "DELETE FROM OdontogramaDientes WHERE IdOdontogramaDiente = ";
    private static final ArrayList<DienteOdontogramaModel> DIENTES_ODONTOGRAMA = new ArrayList<>();
    
    public static void registrarValor(DienteOdontogramaModel dienteOdontograma, int idPaciente) {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(ADD_DIENTE_ODONTOGRAMA + idPaciente + ")), ?, ?, ?, ?, ?, ?, ?, ?);");
            
            preparedStatement.setString(1, dienteOdontograma.getDiagnostico());
            preparedStatement.setString(2, dienteOdontograma.getDescripcionDiagnostico());
            preparedStatement.setString(3, dienteOdontograma.getProcedimiento());
            preparedStatement.setString(4, dienteOdontograma.getPieza());
            preparedStatement.setString(5, dienteOdontograma.getCara());
            preparedStatement.setInt(6, dienteOdontograma.getNumeroPieza());
            preparedStatement.setString(7, dienteOdontograma.getSeleccion());
            preparedStatement.setString(8, dienteOdontograma.getSide());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public static ArrayList<DienteOdontogramaModel> getValues(int idPaciente) {
        DIENTES_ODONTOGRAMA.clear();
        
        try {
            Statement st = CONNECTION.createStatement();
            ResultSet rs = st.executeQuery(GET_DIENTE_ODONTOGRAMA_VALUES + idPaciente + "));");
            
            while (rs.next()) {
                DienteOdontogramaModel model = new DienteOdontogramaModel();
                
                model.setId(rs.getInt(1));
                model.setDiagnostico(rs.getString(2));
                model.setDescripcionDiagnostico(rs.getString(3));
                model.setProcedimiento(rs.getString(4));
                model.setPieza(rs.getString(5));
                model.setCara(rs.getString(6));
                model.setNumeroPieza(rs.getInt(7));
                model.setSeleccion(rs.getString(8));
                model.setSide(rs.getString(9));
                
                DIENTES_ODONTOGRAMA.add(model);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return DIENTES_ODONTOGRAMA;
    }
    
    public static void updateRegistro(DienteOdontogramaModel diente) {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(UPDATE_DIENTE_ODONTOGRAMA);
            
            preparedStatement.setString(1, diente.getDiagnostico());
            preparedStatement.setString(2, diente.getDescripcionDiagnostico());
            preparedStatement.setString(3, diente.getProcedimiento());
            preparedStatement.setString(4, diente.getPieza());
            preparedStatement.setInt(5, diente.getNumeroPieza());
            preparedStatement.setString(6, diente.getCara());
            preparedStatement.setString(7, diente.getSeleccion());
            preparedStatement.setString(8, diente.getSide());
            preparedStatement.setInt(9, diente.getId());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void deleteRegistro(int idRegistro) {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(DELETE_DIENTE_ODONTOGRAMA + idRegistro);
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
