package com.view.components;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.helper.AsistenteHelper;
import com.helper.DoctorHelper;
import com.k33ptoo.components.KGradientPanel;
import com.utils.Tools;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 29/09/22
 */
public class Appearance extends javax.swing.JFrame {
    ArrayList<KGradientPanel> containers = new ArrayList<>();
    ArrayList<JLabel> texts = new ArrayList<>();
    
    /**
     * Creates new form Appereance
     */
    public Appearance() {
        initComponents();
        setLocationRelativeTo(null);
        styles();
    }
    
    public void colorComponent() {
        container.setBackground(ChoosedPalette.getPrimaryBackground());
        container.setBorder(new LineBorder(ChoosedPalette.getGray()));
        addContainers();
        containers.forEach(itemContainer -> {
            itemContainer.setkStartColor(ChoosedPalette.getGray());
            itemContainer.setkEndColor(ChoosedPalette.getGray());
        });
        addTexts();
        title.setForeground(ChoosedPalette.getDarkColor());
        texts.forEach(text -> text.setForeground(ChoosedPalette.getTextColor()));
        Tools.setImageLabel(cross, "src/com/assets/cruz.png", 15, 15, ChoosedPalette.getDarkColor());
    }
    
    private void styles() {
        icon.setSize(38, 38);
        claro.setSize(88, 88);
        oscuro.setSize(88, 88);
        cross.setSize(32, 32);
        Tools.setImageLabel(icon, "src/com/assets/paleta.png", 15, 15, ChoosedPalette.getWhite());
        Tools.setImage(claro, "src/com/images/light.png", 0, 0);
        Tools.setImage(oscuro, "src/com/images/dark.png", 0, 0);
    }
    
    private void addContainers() {
        containers.add(container1);
        containers.add(container3);
    }
    
    private void addTexts() {
        texts.add(text1);
        texts.add(text2);
        texts.add(text4);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        icon = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        text1 = new javax.swing.JLabel();
        container1 = new com.k33ptoo.components.KGradientPanel();
        claro = new javax.swing.JLabel();
        container3 = new com.k33ptoo.components.KGradientPanel();
        oscuro = new javax.swing.JLabel();
        text4 = new javax.swing.JLabel();
        text2 = new javax.swing.JLabel();
        cross = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(450, 300));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(460, 300));
        setResizable(false);

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setMinimumSize(new java.awt.Dimension(430, 300));
        container.setPreferredSize(new java.awt.Dimension(450, 300));
        container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkBorderRadius(100);
        kGradientPanel1.setkEndColor(new java.awt.Color(69, 98, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(69, 98, 255));
        kGradientPanel1.setOpaque(false);
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(50, 50));

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        container.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        title.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(51, 51, 51));
        title.setText("Apariencia");
        container.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 140, 30));

        text1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text1.setText("Apariencia y colores");
        container.add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 260, -1));

        container1.setkFillBackground(false);
        container1.setMinimumSize(new java.awt.Dimension(100, 100));
        container1.setOpaque(false);
        container1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                container1MouseClicked(evt);
            }
        });

        claro.setMaximumSize(new java.awt.Dimension(88, 88));

        javax.swing.GroupLayout container1Layout = new javax.swing.GroupLayout(container1);
        container1.setLayout(container1Layout);
        container1Layout.setHorizontalGroup(
            container1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(claro, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        container1Layout.setVerticalGroup(
            container1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(claro, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        container.add(container1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        container3.setkFillBackground(false);
        container3.setOpaque(false);
        container3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                container3MouseClicked(evt);
            }
        });

        oscuro.setMaximumSize(new java.awt.Dimension(88, 88));

        javax.swing.GroupLayout container3Layout = new javax.swing.GroupLayout(container3);
        container3.setLayout(container3Layout);
        container3Layout.setHorizontalGroup(
            container3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(oscuro, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        container3Layout.setVerticalGroup(
            container3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(oscuro, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        container.add(container3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        text4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        text4.setForeground(new java.awt.Color(51, 51, 51));
        text4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text4.setText("Modo oscuro");
        container.add(text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 100, 20));

        text2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        text2.setForeground(new java.awt.Color(51, 51, 51));
        text2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text2.setText("Modo claro");
        container.add(text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 100, 20));

        cross.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        cross.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cross.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crossMouseClicked(evt);
            }
        });
        container.add(cross, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 30, 30));

        getContentPane().add(container, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crossMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crossMouseClicked
        dispose();
    }//GEN-LAST:event_crossMouseClicked

    private void container1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_container1MouseClicked
        ApplicationContext.changeTheme("light");
        ApplicationContext.selectedAppereance = "light";
        
        if (ApplicationContext.isDoctorSesionActual()) {
            ApplicationContext.getDoctor().setPaletaPreferencia("light");
            DoctorHelper.setPreferencies(ApplicationContext.getDoctor());
        } else {
            ApplicationContext.getAsistente().setPaletaPreferencia("light");
            AsistenteHelper.setPreferencies(ApplicationContext.getAsistente());
        }
    }//GEN-LAST:event_container1MouseClicked

    private void container3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_container3MouseClicked
        ApplicationContext.changeTheme("dark");
        ApplicationContext.selectedAppereance = "dark";
        
        if (ApplicationContext.isDoctorSesionActual()) {
            ApplicationContext.getDoctor().setPaletaPreferencia("dark");
            DoctorHelper.setPreferencies(ApplicationContext.getDoctor());
        } else {
            ApplicationContext.getAsistente().setPaletaPreferencia("dark");
            AsistenteHelper.setPreferencies(ApplicationContext.getAsistente());
        }
    }//GEN-LAST:event_container3MouseClicked

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
            java.util.logging.Logger.getLogger(Appearance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Appearance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Appearance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Appearance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Appearance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel claro;
    private javax.swing.JPanel container;
    private com.k33ptoo.components.KGradientPanel container1;
    private com.k33ptoo.components.KGradientPanel container3;
    private javax.swing.JLabel cross;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel oscuro;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text4;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
