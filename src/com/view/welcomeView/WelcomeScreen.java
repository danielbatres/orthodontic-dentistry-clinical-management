package com.view.welcomeView;

import com.utils.Tools;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Daniel Batres
 */
public class WelcomeScreen extends javax.swing.JPanel {
    private RightImage rightImage = new RightImage();
    
    /**
     * Creates new form WelcomeScreen
     * 
     */
    public WelcomeScreen() {
        initComponents();
        
        Tools.showPanel(image, rightImage, 640, 670);
    }
    
    public void mostrarPanel(JPanel panelToShow) {
        panelToShow.setSize(640, 670);
        panelToShow.setLocation(0, 0);
        welcomeViewScreen.removeAll();
        welcomeViewScreen.add(panelToShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        welcomeViewScreen.revalidate();
        welcomeViewScreen.repaint();
        
        SwingUtilities.updateComponentTreeUI(this);
    }
    
    public void mostrarPanelImage(JPanel panelToShow) {
        panelToShow.setSize(640, 670);
        panelToShow.setLocation(0, 0);
        image.removeAll();
        image.add(panelToShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        image.revalidate();
        image.repaint();
        
        SwingUtilities.updateComponentTreeUI(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeViewScreen = new javax.swing.JPanel();
        image = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1280, 670));
        setPreferredSize(new java.awt.Dimension(1280, 670));
        setLayout(new java.awt.GridLayout(1, 2));

        welcomeViewScreen.setBackground(new java.awt.Color(255, 255, 255));
        welcomeViewScreen.setLayout(new java.awt.GridLayout(1, 1));
        add(welcomeViewScreen);

        image.setBackground(new java.awt.Color(51, 51, 51));
        image.setForeground(new java.awt.Color(0, 0, 0));
        image.setOpaque(false);
        image.setLayout(new java.awt.GridLayout(1, 0));
        add(image);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel image;
    private javax.swing.JPanel welcomeViewScreen;
    // End of variables declaration//GEN-END:variables
}
