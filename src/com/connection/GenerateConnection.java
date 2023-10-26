package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * <h1>GenerateConnection</h1>
 * 
 * En esta clase generamos la conexion correspondiente con la base de datos
 * se implementa un patron singleton para generar una unica conexion
 * 
 * @author Daniel Batres
 * @version 1.0.0
 * @since 13/09/22
 */
public class GenerateConnection {
    private static Connection singletonConnection;
    private static String user = "user";
    private static String password = "password";
    private static String bd = "BDOrthodonticDentistry";
    private static String ip = "localhost";
    private static String port = "1433";
    private static String connection = "jdbc:sqlserver://" + ip + ":" + port + ";" + "databaseName=" + bd;
    
    /** 
     * Este metodo es el encargado de generar una nueva conexion en caso de que la conexion sea nula
     * Implementacion de patron singleton
     * 
     * Si la conexion falla se lanzara una excepcion
     * 
     * @return singletonConnection la conexion esperada
     */
    public static Connection getConnection() {
        if (singletonConnection == null) {
            try {
                singletonConnection = DriverManager.getConnection(connection, user, password);
            } catch (SQLException sqlException) {
                System.out.println("La conexion con la base de datos a fallado, Exception: " + sqlException);
            }
        }
        
        return singletonConnection;
    }
}
