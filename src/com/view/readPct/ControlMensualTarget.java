package com.view.readPct;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.model.ControlMensualModel;
import com.utils.Styles;
import com.utils.Tools;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 19/09/22
 */
public class ControlMensualTarget extends Styles {
    private ControlMensualModel controlMensualModel;
    
    /**
     * Creates new form ControlMensualTarget
     * @param controlMensual
     */
    public ControlMensualTarget(ControlMensualModel controlMensual) {
        initComponents();
        styleMyComponentBaby();
        
        fecha.setText(controlMensual.getDiaCreacion() + "/" + controlMensual.getMesCreacion() + "/" + controlMensual.getAnnioCreacion());
        hora.setText(controlMensual.getHoraCreacion());
        controlMensualModel = controlMensual;
    }
    
    @Override
    public void addTitlesAndSubtitles() {
        TITLES_AND_SUBTITLES.add(fecha);
        TITLES_AND_SUBTITLES.add(hora);
    }

    @Override
    public void addContainers() {
        CONTAINERS.add(container1);
    }

    @Override
    public void initStyles() {
        doc.setSize(65, 70);
        paintOnePanelRound(panelRound1, ChoosedPalette.getMidColor());
        Tools.setImageLabel(doc, "src/com/assets/documento.png", 40, 44, ChoosedPalette.getWhite());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        container1 = new com.k33ptoo.components.KGradientPanel();
        jPanel2 = new javax.swing.JPanel();
        fecha = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        hora = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        panelRound1 = new com.utils.PanelRound();
        doc = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(32767, 80));
        setMinimumSize(new java.awt.Dimension(250, 80));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(250, 80));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(100, 10));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 10));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_END);

        container1.setkEndColor(new java.awt.Color(204, 204, 204));
        container1.setkFillBackground(false);
        container1.setkStartColor(new java.awt.Color(204, 204, 204));
        container1.setOpaque(false);
        container1.setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setOpaque(false);

        fecha.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        fecha.setForeground(new java.awt.Color(0, 0, 0));
        fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha.setText("19/09/22");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        container1.add(jPanel2);

        jPanel3.setOpaque(false);

        hora.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        hora.setForeground(new java.awt.Color(0, 0, 0));
        hora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hora.setText("23:05 PM");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hora, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hora, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        container1.add(jPanel3);

        jPanel4.setOpaque(false);

        panelRound1.setRoundBottomRight(15);
        panelRound1.setRoundTopRight(15);
        panelRound1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRound1MouseClicked(evt);
            }
        });
        panelRound1.setLayout(new java.awt.BorderLayout());

        doc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelRound1.add(doc, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        container1.add(jPanel4);

        add(container1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void panelRound1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound1MouseClicked
        ApplicationContext.selectedControlMensual = controlMensualModel;
        ApplicationContext.datosControl.setData(ApplicationContext.selectedControlMensual);
        ApplicationContext.controlMensual.mostrarControl(ApplicationContext.datosControl);
    }//GEN-LAST:event_panelRound1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KGradientPanel container1;
    private javax.swing.JLabel doc;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel hora;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private com.utils.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables

}
