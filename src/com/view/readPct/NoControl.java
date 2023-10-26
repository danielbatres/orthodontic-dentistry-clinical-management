package com.view.readPct;

import com.utils.Styles;

/**
 *
 * @author Daniel Batres
 */
public class NoControl extends Styles {

    /**
     * Creates new form NoControl
     */
    public NoControl() {
        initComponents();
        addTitlesAndSubtitles();
    }
    
    @Override
    public void addTitlesAndSubtitles() {
        TITLES_AND_SUBTITLES.add(title);
    }
    
    @Override
    public void colorBasics() {
        paintTitlesAndSubtitles();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        title.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Selecciona el control mensual que deseas revisar...");
        add(title, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
