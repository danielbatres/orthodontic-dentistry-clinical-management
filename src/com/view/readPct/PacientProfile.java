package com.view.readPct;

import com.context.ChoosedPalette;
import com.utils.Tools;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 19/09/22
 */
public class PacientProfile extends javax.swing.JPanel {
    
    /**
     * Creates new form Generales
     */
    public PacientProfile() {
        initComponents();
    }
    
    public void colorComponent(String preferred) {
        switch (preferred) {
            case "light":
                light();
                break;
            case "dark":
                dark();
                break;
            default:
                System.out.println("Invalido");
        }
    }
    
    public void light() {
        leftSidePacient.setkFillBackground(false);
        leftSidePacient.setkStartColor(ChoosedPalette.getGray());
        leftSidePacient.setkEndColor(ChoosedPalette.getGray());
        leftSidePacient.repaint();

    };
    
    public void dark() {
        leftSidePacient.setkFillBackground(true);
        leftSidePacient.setkStartColor(ChoosedPalette.getSecondaryBackground());
        leftSidePacient.setkEndColor(ChoosedPalette.getSecondaryBackground());
        leftSidePacient.repaint();
    };
    
    
    
    /**
     * Agregar paneles
     * 
     * @param leftSide lo que se mostrara al lado izquierdo
     * @param rightSide lo que se mostrar al lado derecho
     */
    public void addPanels(JPanel leftSide, JPanel rightSide) {
        Tools.showPanel(leftSidePacient, leftSide, 467, 426);
        Tools.showPanel(rightSidePacient, rightSide, 467, 426);
        
        SwingUtilities.updateComponentTreeUI(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        leftSidePacient = new com.k33ptoo.components.KGradientPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        rightSidePacient = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(976, 388));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(976, 388));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(14, 100));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(14, 253));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 361, Short.MAX_VALUE)
        );

        add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(100, 20));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(976, 20));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 976, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(100, 7));
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(976, 7));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 976, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(14, 0));
        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(14, 253));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 361, Short.MAX_VALUE)
        );

        add(jPanel4, java.awt.BorderLayout.LINE_END);

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.GridLayout(1, 2));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setMinimumSize(new java.awt.Dimension(7, 100));
        jPanel8.setOpaque(false);
        jPanel8.setPreferredSize(new java.awt.Dimension(7, 425));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 361, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel8, java.awt.BorderLayout.LINE_END);

        leftSidePacient.setBackground(new java.awt.Color(255, 255, 255));
        leftSidePacient.setkEndColor(new java.awt.Color(204, 204, 204));
        leftSidePacient.setkFillBackground(false);
        leftSidePacient.setkStartColor(new java.awt.Color(204, 204, 204));
        leftSidePacient.setOpaque(false);
        leftSidePacient.setLayout(new java.awt.GridLayout(1, 1));
        jPanel6.add(leftSidePacient, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setMinimumSize(new java.awt.Dimension(7, 100));
        jPanel9.setOpaque(false);
        jPanel9.setPreferredSize(new java.awt.Dimension(7, 425));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 361, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel9, java.awt.BorderLayout.LINE_START);

        rightSidePacient.setBackground(new java.awt.Color(255, 255, 255));
        rightSidePacient.setOpaque(false);
        rightSidePacient.setLayout(new java.awt.GridLayout(1, 0));
        jPanel7.add(rightSidePacient, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel7);

        add(jPanel5, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private com.k33ptoo.components.KGradientPanel leftSidePacient;
    private javax.swing.JPanel rightSidePacient;
    // End of variables declaration//GEN-END:variables
}
