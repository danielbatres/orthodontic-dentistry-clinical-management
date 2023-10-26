
package com.view.readPct;

import com.context.ChoosedPalette;
import com.model.RadiografiaModel;
import com.utils.Tools;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author daniel
 */
public class ViewRadiografia extends javax.swing.JFrame {
    private int y;
    private int x;
    private Toolkit toolkit = Toolkit.getDefaultToolkit();
    private Dimension dimension = toolkit.getScreenSize();
    private Insets taskBar = toolkit.getScreenInsets(getGraphicsConfiguration());
    private int userScreenWidth = (int) dimension.getWidth();
    private int userScreenHeight = (int) dimension.getHeight() - taskBar.bottom;
    
    /**
     * Creates new form ViewRadiografia
     */
    public ViewRadiografia() {
        initComponents();
        setSize(userScreenWidth, userScreenHeight);
        setLocationRelativeTo(null);
        windowControls.setBackground(ChoosedPalette.getDarkestColor());
        controllers.setBackground(ChoosedPalette.getDarkestColor());
        minButton.setBackground(ChoosedPalette.getDarkestColor());
        maxButton.setBackground(ChoosedPalette.getDarkestColor());
        cross.setBackground(ChoosedPalette.getDarkestColor());
        
        Tools.setImageLabel(cross, "src/com/assets/cruz.png", 15, 10, ChoosedPalette.getWhite());
        Tools.setImageLabel(maxButton, "src/com/assets/cuadrado.png", 15, 10, ChoosedPalette.getWhite());
        Tools.setImageLabel(minButton, "src/com/assets/menos.png", 15, 15, ChoosedPalette.getWhite());
        
        scrollPanel.getVerticalScrollBar().setUnitIncrement(35);
        scrollPanel.getHorizontalScrollBar().setUnitIncrement(35);
    }
    
    public void setImage(RadiografiaModel radiografia) {
        content.setSize(radiografia.getImagenIcon().getWidth(), radiografia.getImagenIcon().getHeight());
        image.setSize(radiografia.getImagenIcon().getWidth(), radiografia.getImagenIcon().getHeight());
        
        Image images = radiografia.getImagenIcon().getScaledInstance(image.getWidth(), image.getHeight(), Image.SCALE_SMOOTH);
        image.setIcon(new ImageIcon(images));
    }
    
    public void colorComponent() {
        content.setBackground(ChoosedPalette.getSecondaryBackground());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        windowControls = new javax.swing.JPanel();
        controllers = new javax.swing.JPanel();
        minButton = new javax.swing.JLabel();
        maxButton = new javax.swing.JLabel();
        cross = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        dynamicContent = new javax.swing.JPanel();
        scrollPanel = new javax.swing.JScrollPane();
        content = new javax.swing.JPanel();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setLayout(new java.awt.BorderLayout());

        windowControls.setBackground(new java.awt.Color(51, 51, 51));
        windowControls.setMinimumSize(new java.awt.Dimension(75, 50));
        windowControls.setPreferredSize(new java.awt.Dimension(1280, 20));
        windowControls.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                windowControlsMouseDragged(evt);
            }
        });
        windowControls.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                windowControlsMousePressed(evt);
            }
        });
        windowControls.setLayout(new java.awt.BorderLayout());

        controllers.setBackground(new java.awt.Color(51, 51, 51));
        controllers.setForeground(new java.awt.Color(51, 51, 51));
        controllers.setLayout(new java.awt.GridLayout(1, 3));

        minButton.setBackground(new java.awt.Color(51, 51, 51));
        minButton.setForeground(new java.awt.Color(51, 51, 51));
        minButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minButton.setMaximumSize(new java.awt.Dimension(25, 45));
        minButton.setMinimumSize(new java.awt.Dimension(25, 45));
        minButton.setOpaque(true);
        minButton.setPreferredSize(new java.awt.Dimension(25, 45));
        minButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minButtonMouseExited(evt);
            }
        });
        controllers.add(minButton);

        maxButton.setBackground(new java.awt.Color(51, 51, 51));
        maxButton.setForeground(new java.awt.Color(51, 51, 51));
        maxButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maxButton.setMaximumSize(new java.awt.Dimension(25, 45));
        maxButton.setMinimumSize(new java.awt.Dimension(25, 45));
        maxButton.setOpaque(true);
        maxButton.setPreferredSize(new java.awt.Dimension(25, 45));
        maxButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maxButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                maxButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                maxButtonMouseExited(evt);
            }
        });
        controllers.add(maxButton);

        cross.setBackground(new java.awt.Color(51, 51, 51));
        cross.setForeground(new java.awt.Color(51, 51, 51));
        cross.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cross.setMaximumSize(new java.awt.Dimension(25, 45));
        cross.setMinimumSize(new java.awt.Dimension(25, 45));
        cross.setOpaque(true);
        cross.setPreferredSize(new java.awt.Dimension(25, 45));
        cross.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crossMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                crossMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                crossMouseExited(evt);
            }
        });
        controllers.add(cross);

        windowControls.add(controllers, java.awt.BorderLayout.LINE_END);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 8)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" Clinica - Sistema de gestión");
        jLabel1.setPreferredSize(new java.awt.Dimension(180, 16));
        windowControls.add(jLabel1, java.awt.BorderLayout.LINE_START);

        container.add(windowControls, java.awt.BorderLayout.PAGE_START);

        dynamicContent.setBackground(new java.awt.Color(255, 255, 255));
        dynamicContent.setLayout(new java.awt.GridLayout(1, 1));

        scrollPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setLayout(new java.awt.BorderLayout());

        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        content.add(image, java.awt.BorderLayout.CENTER);

        scrollPanel.setViewportView(content);

        dynamicContent.add(scrollPanel);

        container.add(dynamicContent, java.awt.BorderLayout.CENTER);

        getContentPane().add(container, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minButtonMouseClicked
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minButtonMouseClicked

    private void minButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minButtonMouseEntered
        minButton.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_minButtonMouseEntered

    private void minButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minButtonMouseExited
        minButton.setBackground(ChoosedPalette.getDarkestColor());
    }//GEN-LAST:event_minButtonMouseExited

    private void maxButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxButtonMouseClicked
        if (getWidth() == 1280) {
            setSize(userScreenWidth, userScreenHeight);
        } else {
            setSize(1280, 720);
        }

        setLocationRelativeTo(null);
    }//GEN-LAST:event_maxButtonMouseClicked

    private void maxButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxButtonMouseEntered
        maxButton.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_maxButtonMouseEntered

    private void maxButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxButtonMouseExited
        maxButton.setBackground(ChoosedPalette.getDarkestColor());
    }//GEN-LAST:event_maxButtonMouseExited

    private void crossMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crossMouseClicked
        dispose();
    }//GEN-LAST:event_crossMouseClicked

    private void crossMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crossMouseEntered
        cross.setBackground(Color.red);
    }//GEN-LAST:event_crossMouseEntered

    private void crossMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crossMouseExited
        cross.setBackground(ChoosedPalette.getDarkestColor());
    }//GEN-LAST:event_crossMouseExited

    private void windowControlsMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_windowControlsMouseDragged
        setLocation(getLocation().x + evt.getX() - x, getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_windowControlsMouseDragged

    private void windowControlsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_windowControlsMousePressed
        y = evt.getY();
        x = evt.getX();
    }//GEN-LAST:event_windowControlsMousePressed

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
            java.util.logging.Logger.getLogger(ViewRadiografia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewRadiografia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewRadiografia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewRadiografia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewRadiografia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container;
    private javax.swing.JPanel content;
    private javax.swing.JPanel controllers;
    private javax.swing.JLabel cross;
    private javax.swing.JPanel dynamicContent;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel maxButton;
    private javax.swing.JLabel minButton;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JPanel windowControls;
    // End of variables declaration//GEN-END:variables
}
