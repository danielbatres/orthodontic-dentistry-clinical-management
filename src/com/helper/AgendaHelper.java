package com.helper;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 1/10/2022
 */
public class AgendaHelper extends Basics{
    private static final String QUERY_AGENDA_PACIENTE = "INSERT INTO AgendaPaciente (idPaciente) VALUES ((SELECT MAX(idPaciente) FROM Pacientes));";
    
    public static void crearAgenda() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(QUERY_AGENDA_PACIENTE);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Agenda " + e);
        }
    }
}
