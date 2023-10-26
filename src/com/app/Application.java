package com.app;

import com.connection.GenerateConnection;
import com.context.ApplicationContext;
import com.view.MainSite;
import com.view.ingresar.Login;
import java.sql.Connection;

/**
 * <h1>Main</h1>
 * 
 * Aplicacion de escritorio, sistema de gestion clinica
 * metodo principal para ejecutar la aplicacion
 * 
 * @author Daniel Batres
 * @version 1.0.0
 * @since 12/09/22
 */
public class Application {
    
    /**
     * Ejecucion de la aplicacion
     * 
     * @param args linea de comandos
     */
    public static void main(String[] args) {
        ApplicationContext.loading.setVisible(true);
        ApplicationContext.loading.fill(0, 45);
        Connection connection = GenerateConnection.getConnection();
        ApplicationContext.loading.fill(45, 75);
        
        if (connection != null) {
            ApplicationContext.login = new Login();
            ApplicationContext.application = new MainSite();
            ApplicationContext.loading.fill(75, 100);
            ApplicationContext.application.setVisible(true);
            ApplicationContext.loading.dispose();
        } else {
            ApplicationContext.loading.fill(75, 100);
            ApplicationContext.notConnected.setVisible(true);
        }
        
        ApplicationContext.loading.dispose();
    }
}
