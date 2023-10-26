package com.view.estados;

import com.context.ChoosedPalette;
import java.awt.Color;
import javax.swing.border.LineBorder;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 04/10/2022
 */
public class LoadingApplication extends javax.swing.JFrame {

    /**
     * Creates new form LoadingApplication
     */
    public LoadingApplication() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        title.setForeground(ChoosedPalette.getDarkColor());
        loading.setBackground(Color.white);
        progressBar.setBackground(Color.white);
        progressBar.setForeground(ChoosedPalette.getMidColor());
        loading.setBorder(new LineBorder(ChoosedPalette.getGray()));
        
        progressBar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loading = new javax.swing.JPanel();
        progressBar = new javax.swing.JProgressBar();
        title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cargando aplicacion");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(450, 300));
        setUndecorated(true);
        setResizable(false);

        loading.setBackground(new java.awt.Color(255, 255, 255));
        loading.setMaximumSize(new java.awt.Dimension(450, 300));
        loading.setMinimumSize(new java.awt.Dimension(450, 300));
        loading.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        progressBar.setBackground(new java.awt.Color(0, 0, 0));
        progressBar.setForeground(new java.awt.Color(255, 255, 255));
        progressBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        loading.add(progressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 450, 30));

        title.setBackground(new java.awt.Color(0, 0, 0));
        title.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Iniciando aplicación...");
        loading.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 300));

        getContentPane().add(loading, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoadingApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoadingApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoadingApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadingApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoadingApplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel loading;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
