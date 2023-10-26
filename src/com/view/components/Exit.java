package com.view.components;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.context.StateColors;
import com.view.MainSite;
import com.view.ingresar.Login;
import javax.swing.border.LineBorder;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 3/10/22
 */
public class Exit extends javax.swing.JFrame {

    /**
     * Creates new form EstasSeguroEdicion
     */
    public Exit() {
        initComponents();
        setLocationRelativeTo(null);
        container2.setkFillBackground(true);
    }
    
    public void colorComponent(String preferred) {
        switch (preferred) {
            case "light":
                colorBasics();
                light();
                break;
            case "dark":
                colorBasics();
                dark();
                break;
            default:
                System.out.println("Invalido");
        }
    }
    
    public void colorBasics() {
        content.setBackground(ChoosedPalette.getPrimaryBackground());
        content.setBorder(new LineBorder(ChoosedPalette.getGray()));
        title.setForeground(ChoosedPalette.getDarkColor());
        text1.setForeground(ChoosedPalette.getTextColor());
        text2.setForeground(ChoosedPalette.getTextColor());
    }
    
    public void light() {
        container1.setkStartColor(StateColors.getLightDanger());
        container1.setkEndColor(StateColors.getLightDanger());
        container2.setkStartColor(StateColors.getLightDanger());
        container2.setkEndColor(StateColors.getLightDanger());
        guardar.setForeground(StateColors.getDanger());
        cancelar.setForeground(StateColors.getLightDanger());
    }
    
    public void dark() {
        container1.setkStartColor(StateColors.getDanger());
        container1.setkEndColor(StateColors.getDanger());
        container2.setkStartColor(StateColors.getDanger());
        container2.setkEndColor(StateColors.getDanger());
        guardar.setForeground(ChoosedPalette.getWhite());
        cancelar.setForeground(StateColors.getDanger());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        text1 = new javax.swing.JLabel();
        text2 = new javax.swing.JLabel();
        container1 = new com.k33ptoo.components.KGradientPanel();
        cancelar = new javax.swing.JLabel();
        container2 = new com.k33ptoo.components.KGradientPanel();
        guardar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("¿Estas seguro de que quieres eliminar?");
        setMinimumSize(new java.awt.Dimension(450, 350));
        setUndecorated(true);
        setResizable(false);

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Cerrar Sesión");
        content.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 450, -1));

        text1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text1.setText("¿Estás seguro de que quieres salir?");
        content.add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 450, -1));

        text2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text2.setText("Se cerrará la sesión actual para iniciar de nuevo.");
        content.add(text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 450, -1));

        container1.setkEndColor(new java.awt.Color(204, 204, 204));
        container1.setkFillBackground(false);
        container1.setkStartColor(new java.awt.Color(204, 204, 204));
        container1.setOpaque(false);
        container1.setLayout(new java.awt.BorderLayout());

        cancelar.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        cancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelar.setText("Cancelar");
        cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarMouseClicked(evt);
            }
        });
        container1.add(cancelar, java.awt.BorderLayout.CENTER);

        content.add(container1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 160, 50));

        container2.setkEndColor(new java.awt.Color(204, 204, 204));
        container2.setkFillBackground(false);
        container2.setkStartColor(new java.awt.Color(204, 204, 204));
        container2.setOpaque(false);
        container2.setLayout(new java.awt.BorderLayout());

        guardar.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        guardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guardar.setText("Salir");
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarMouseClicked(evt);
            }
        });
        container2.add(guardar, java.awt.BorderLayout.CENTER);

        content.add(container2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 160, 50));

        getContentPane().add(content, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMouseClicked
        dispose();
    }//GEN-LAST:event_cancelarMouseClicked

    private void guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseClicked
        ApplicationContext.application.dispose();
        ApplicationContext.login = new Login();
        ApplicationContext.application = new MainSite();
        ApplicationContext.application.setVisible(true);
        dispose();
    }//GEN-LAST:event_guardarMouseClicked

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
            java.util.logging.Logger.getLogger(Exit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancelar;
    private com.k33ptoo.components.KGradientPanel container1;
    private com.k33ptoo.components.KGradientPanel container2;
    private javax.swing.JPanel content;
    private javax.swing.JLabel guardar;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
