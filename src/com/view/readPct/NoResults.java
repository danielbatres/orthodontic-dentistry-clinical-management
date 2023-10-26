package com.view.readPct;

import com.utils.Styles;

/**
 *
 * @author Daniel Batres
 */
public class NoResults extends Styles {

    /**
     * Creates new form NoResults
     */
    public NoResults() {
        initComponents();
        addTitlesAndSubtitles();
    }
    
    @Override
    public void colorBasics() {
        paintTitlesAndSubtitles();
    }
    
    @Override
    public void addTitlesAndSubtitles() {
        TITLES_AND_SUBTITLES.add(title1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(2147483647, 300));
        setMinimumSize(new java.awt.Dimension(267, 300));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(400, 300));
        setLayout(new java.awt.BorderLayout());

        title1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("No se encontraron resultados...");
        add(title1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel title1;
    // End of variables declaration//GEN-END:variables
}
