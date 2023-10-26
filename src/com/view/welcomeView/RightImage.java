package com.view.welcomeView;

import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author danie
 */
public class RightImage extends javax.swing.JPanel {

    /**
     * Creates new form RightImage
     */
    public RightImage() {
        initComponents();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(new ImageIcon("src/com/images/clinical-template.png").getImage(), 0, 0, getWidth() - 100, getHeight(), this);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setMinimumSize(new java.awt.Dimension(640, 670));
        setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
