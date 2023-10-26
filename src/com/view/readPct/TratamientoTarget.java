package com.view.readPct;

import com.context.ChoosedPalette;
import com.context.StateColors;
import com.utils.Styles;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 02/10/2022
 */
public class TratamientoTarget extends Styles {

    /**
     * Creates new form Odontologia
     * @param tratamiento
     */
    public TratamientoTarget(String tratamiento) {
        initComponents();
        
        switch (tratamiento) {
            case "odontologia":
                tratamientoText.setText("Odontolog\u00eda");
                break;
            case "ortodoncia":
                tratamientoText.setText("Ortodoncia");
                break;
            default:
                System.out.println("Invalido");
        }
    }
    
    @Override
    public void colorBasics() {
        if (tratamientoText.getText().equals("Odontolog\u00eda")) {
            paintOneContainer(content, ChoosedPalette.getPrimaryLightColor());
        } else {
            paintOneContainer(content, ChoosedPalette.getSecondaryLightColor());
        }
    }
    
    @Override
    public void dark() {
        tratamientoText.setForeground(ChoosedPalette.getWhite());
    }
    
    @Override
    public void light () {
        if (tratamientoText.getText().equals("Odontolog\u00eda")) {
            tratamientoText.setForeground(ChoosedPalette.getMidColor());
        } else {
            tratamientoText.setForeground(StateColors.getSuccess());
        }
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel22 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        content = new com.k33ptoo.components.KGradientPanel();
        tratamientoText = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(124, 51));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(130, 51));
        setLayout(new java.awt.BorderLayout());

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setOpaque(false);
        jPanel22.setLayout(new java.awt.BorderLayout());

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setOpaque(false);
        jPanel24.setPreferredSize(new java.awt.Dimension(14, 51));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );

        jPanel22.add(jPanel24, java.awt.BorderLayout.LINE_END);

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setOpaque(false);
        jPanel27.setLayout(new java.awt.BorderLayout());

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setkEndColor(new java.awt.Color(204, 204, 204));
        content.setkStartColor(new java.awt.Color(204, 204, 204));
        content.setOpaque(false);

        tratamientoText.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        tratamientoText.setForeground(new java.awt.Color(0, 0, 0));
        tratamientoText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tratamientoText.setText("Odontología");

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tratamientoText, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addContainerGap())
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tratamientoText, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel27.add(content, java.awt.BorderLayout.CENTER);

        jPanel22.add(jPanel27, java.awt.BorderLayout.CENTER);

        add(jPanel22, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KGradientPanel content;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JLabel tratamientoText;
    // End of variables declaration//GEN-END:variables
}
