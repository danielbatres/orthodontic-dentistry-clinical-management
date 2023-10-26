package com.view.readPct;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.helper.RadiografiaHelper;
import com.model.RadiografiaModel;
import com.model.RadiografiaType;
import com.utils.Tools;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Daniel Batres
 */
public class AddRadiografia extends javax.swing.JFrame {
    private final ArrayList<JLabel> TEXTS = new ArrayList<>();
    private String root;
    
    /**
     * Creates new form AddRadiografia
     */
    public AddRadiografia() {
        initComponents();
        setLocationRelativeTo(null);
        initialStyles();
        addTexts();
        addComboItems();
    }
    
    private RadiografiaModel devolverDatos() {
        RadiografiaModel radiografia = new RadiografiaModel();
        
        File file = new File(root);
        InputStream input;
        
        try {
            input = new FileInputStream(file);
            radiografia.setImagen(input);
            radiografia.setNombreImagen(file.getName());
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }        
        
        RadiografiaType tipo = RadiografiaType.ANTES;
        
        if (combo.getSelectedItem().toString().equals("Despues")) {
            tipo = RadiografiaType.DESPUES;
        }
        
        radiografia.setTipo(tipo);
        radiografia.setTratamiento(ApplicationContext.selectedTreatment);
        radiografia.setFechaDeCreacion(LocalDateTime.now().getDayOfMonth() + "/" + LocalDateTime.now().getMonthValue() + "/" + LocalDateTime.now().getYear());
        
        return radiografia;
    }
    
    private void setIcons() {
        Tools.setImageLabel(cross, "src/com/assets/cruz.png", 27, 27, ChoosedPalette.getDarkColor());
        Tools.setImageLabel(image, "src/com/assets/imagen.png", 5, 5, ChoosedPalette.getDarkColor());
    }
    
    public void colorComponent() {
        container.setBackground(ChoosedPalette.getSecondaryBackground());
        container.setBorder(new LineBorder(ChoosedPalette.getGray()));
        title1.setForeground(ChoosedPalette.getDarkColor());
        container1.setkStartColor(ChoosedPalette.getMidColor());
        container1.setkEndColor(ChoosedPalette.getMidColor());
        
        TEXTS.forEach(text -> text.setForeground(ChoosedPalette.getTextColor()));
        setIcons();
        combo.setBackground(ChoosedPalette.getPrimaryBackground());
        combo.setForeground(ChoosedPalette.getTextColor());
        combo.setBorder(new LineBorder(ChoosedPalette.getGray()));
    }
    
    private void initialStyles() {
        cross.setSize(50, 50);
        image.setSize(90, 90);
        Tools.setImageLabel(informationIcon, "src/com/assets/documento.png", 25, 25, ChoosedPalette.getWhite());
    }
    
    private void addTexts() {
        TEXTS.add(text1);
        TEXTS.add(text2);
    }
    
    private void addComboItems() {
        combo.addItem("Antes");
        combo.addItem("Despues");
    }
    
    private void selectImage(JLabel label) {
        JFileChooser fileChooser = new JFileChooser();
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
        fileChooser.setFileFilter(filter);
        
        int z = fileChooser.showOpenDialog(this);
        if (z == JFileChooser.APPROVE_OPTION) {
            root = fileChooser.getSelectedFile().getAbsolutePath();
            Image mImage = new ImageIcon(root).getImage();
            ImageIcon mIcon = new ImageIcon(mImage.getScaledInstance(label.getWidth(), label.getHeight(), 0));
            label.setIcon(mIcon);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new com.utils.Styles();
        jPanel2 = new javax.swing.JPanel();
        text1 = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        kGradientPanel3 = new com.k33ptoo.components.KGradientPanel();
        informationIcon = new javax.swing.JLabel();
        cross = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        text2 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        container1 = new com.k33ptoo.components.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(360, 500));
        setMinimumSize(new java.awt.Dimension(360, 500));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(360, 500));
        setResizable(false);

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setMinimumSize(new java.awt.Dimension(500, 350));
        container.setPreferredSize(new java.awt.Dimension(500, 350));
        container.setLayout(new java.awt.BorderLayout());

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text1.setForeground(new java.awt.Color(153, 153, 153));
        text1.setText("Radiografias de ");
        jPanel2.add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 220, -1));

        title1.setBackground(new java.awt.Color(0, 0, 0));
        title1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        title1.setForeground(new java.awt.Color(0, 0, 0));
        title1.setText("Añadir radiografias");
        jPanel2.add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 253, -1));

        kGradientPanel3.setkBorderRadius(100);
        kGradientPanel3.setkEndColor(new java.awt.Color(69, 98, 255));
        kGradientPanel3.setkStartColor(new java.awt.Color(69, 98, 255));
        kGradientPanel3.setMaximumSize(new java.awt.Dimension(50, 50));
        kGradientPanel3.setMinimumSize(new java.awt.Dimension(50, 50));
        kGradientPanel3.setOpaque(false);
        kGradientPanel3.setLayout(new java.awt.BorderLayout());

        informationIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kGradientPanel3.add(informationIcon, java.awt.BorderLayout.CENTER);

        jPanel2.add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 50, 50));

        cross.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        cross.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cross.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crossMouseClicked(evt);
            }
        });
        jPanel2.add(cross, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 30, 30));

        container.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageMouseClicked(evt);
            }
        });
        jPanel5.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 100, 100));

        text2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text2.setText("Imagen");
        jPanel5.add(text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 100, -1));

        combo.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jPanel5.add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 200, 40));

        container1.setkEndColor(new java.awt.Color(0, 0, 0));
        container1.setkStartColor(new java.awt.Color(0, 0, 0));
        container1.setMaximumSize(new java.awt.Dimension(180, 45));
        container1.setMinimumSize(new java.awt.Dimension(0, 45));
        container1.setOpaque(false);
        container1.setPreferredSize(new java.awt.Dimension(200, 45));
        container1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                container1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Añadir radiografia");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout container1Layout = new javax.swing.GroupLayout(container1);
        container1.setLayout(container1Layout);
        container1Layout.setHorizontalGroup(
            container1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        container1Layout.setVerticalGroup(
            container1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.add(container1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 200, 40));

        jPanel3.add(jPanel5, java.awt.BorderLayout.CENTER);

        container.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(container, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crossMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crossMouseClicked
        Tools.setImageLabel(image, "src/com/assets/imagen.png", 5, 5, ChoosedPalette.getDarkColor());
        dispose();
    }//GEN-LAST:event_crossMouseClicked

    private void container1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_container1MouseClicked
        if (root != null) {
            RadiografiaHelper.crearNuevaRadiografia(devolverDatos());
            ApplicationContext.radiografias.addTargets();
            dispose();
        }
    }//GEN-LAST:event_container1MouseClicked

    private void imageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMouseClicked
        selectImage(image);
    }//GEN-LAST:event_imageMouseClicked

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
            java.util.logging.Logger.getLogger(AddRadiografia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddRadiografia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddRadiografia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddRadiografia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AddRadiografia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo;
    private com.utils.Styles container;
    private com.k33ptoo.components.KGradientPanel container1;
    private javax.swing.JLabel cross;
    private javax.swing.JLabel image;
    private javax.swing.JLabel informationIcon;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private com.k33ptoo.components.KGradientPanel kGradientPanel3;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel title1;
    // End of variables declaration//GEN-END:variables
}
