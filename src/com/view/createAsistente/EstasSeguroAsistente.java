package com.view.createAsistente;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.helper.AsistenteHelper;
import com.utils.Tools;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 3/10/22
 */
public class EstasSeguroAsistente extends javax.swing.JFrame {

    /**
     * Creates new form EstasSeguro
     */
    public EstasSeguroAsistente() {
        initComponents();
        setLocationRelativeTo(null);
        Tools.setImageLabel(icon, "src/com/images/EmptyBox.png", 340, 20, ChoosedPalette.getMidColor());
        colorComponent();
    }
    
    public void colorComponent() {
        cross.setSize(30, 30);
        content.setBackground(ChoosedPalette.getPrimaryBackground());
        title.setForeground(ChoosedPalette.getDarkColor());
        text1.setForeground(ChoosedPalette.getTextColor());
        text2.setForeground(ChoosedPalette.getTextColor());
        Tools.setImageLabel(cross, "src/com/assets/cruz.png", 10, 10, ChoosedPalette.getDarkColor());
        container1.setkStartColor(ChoosedPalette.getMidColor());
        container1.setkEndColor(ChoosedPalette.getMidColor());
        container2.setkFillBackground(true);
        container2.setkStartColor(ChoosedPalette.getMidColor());
        container2.setkEndColor(ChoosedPalette.getMidColor());
        guardar.setForeground(ChoosedPalette.getWhite());
        cancelar.setForeground(ChoosedPalette.getMidColor());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        cross = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        text1 = new javax.swing.JLabel();
        text2 = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
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

        cross.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crossMouseClicked(evt);
            }
        });
        content.add(cross, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 40, 40));

        title.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Algunos datos estan vacíos");
        content.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 450, -1));

        text1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text1.setText("¿Estas seguro de que quieres guardar este paciente?");
        content.add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 450, -1));

        text2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text2.setText("Hay datos que no han sido especificados todavía");
        content.add(text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 220, 450, -1));

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        content.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 30, 450, 120));

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

        content.add(container1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 160, 50));

        container2.setkEndColor(new java.awt.Color(204, 204, 204));
        container2.setkFillBackground(false);
        container2.setkStartColor(new java.awt.Color(204, 204, 204));
        container2.setOpaque(false);
        container2.setLayout(new java.awt.BorderLayout());

        guardar.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        guardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guardar.setText("Guardar");
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarMouseClicked(evt);
            }
        });
        container2.add(guardar, java.awt.BorderLayout.CENTER);

        content.add(container2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 160, 50));

        getContentPane().add(content, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crossMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crossMouseClicked
        dispose();
    }//GEN-LAST:event_crossMouseClicked

    private void cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMouseClicked
        dispose();
    }//GEN-LAST:event_cancelarMouseClicked

    private void guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseClicked
        AsistenteHelper.crearAsistente(ApplicationContext.newAsistenteInformation.devolverDatos());
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
            java.util.logging.Logger.getLogger(EstasSeguroAsistente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstasSeguroAsistente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstasSeguroAsistente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstasSeguroAsistente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstasSeguroAsistente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancelar;
    private com.k33ptoo.components.KGradientPanel container1;
    private com.k33ptoo.components.KGradientPanel container2;
    private javax.swing.JPanel content;
    private javax.swing.JLabel cross;
    private javax.swing.JLabel guardar;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
