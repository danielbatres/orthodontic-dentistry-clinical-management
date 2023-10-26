package com.view.dashboard;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.context.StateColors;
import com.model.ConsultaModel;
import com.utils.Styles;

/**
 *
 * @author Daniel Batres
 */
public class ConsultaTarget extends Styles {
    private final ConsultaModel CONSULTA_MODEL;
    
    /**
     * Creates new form ConsultaTarget
     * @param consulta
     */
    public ConsultaTarget(ConsultaModel consulta) {
        initComponents();
        styleMyComponentBaby();
        CONSULTA_MODEL = consulta;
        tratamientoText.setText(consulta.getTratamientoDeConsulta());
        nombres.setText(consulta.getNombres() + " " + consulta.getApellidos());
        fechaText.setText(consulta.getDiaDeConsulta() + "/" + consulta.getMesDeConsulta() + "/" + consulta.getAnnioDeConsulta());
        contactoText.setText(consulta.getContacto());
    }
    
    @Override
    public void addTitlesAndSubtitles() {
        TITLES_AND_SUBTITLES.add(nombres);
        TITLES_AND_SUBTITLES.add(contactoText);
    }
    
    @Override
    public void addPlainText() {
        PLAIN_TEXT.add(fechaText);
    }
    
    @Override
    public void addContainers() {
        CONTAINERS.add(container);
    }
    
    @Override
    public void colorBasics() {
        paintAll();
        facturarButton.setkStartColor(ChoosedPalette.getMidColor());
        facturarButton.setkStartColor(ChoosedPalette.getMidColor());
        factura.setForeground(ChoosedPalette.getWhite());
    }
    
    public void tipoTratamiento() {
        switch (tratamientoText.getText()) {
            case "Odontolog\u00eda":
                paintOnePlainText(tratamientoText, ChoosedPalette.getMidColor());
                paintOneContainer(tratamientoContainer, ChoosedPalette.getPrimaryLightColor());
                break;
            case "Ortodoncia":
                paintOnePlainText(tratamientoText, StateColors.getSuccess());
                paintOneContainer(tratamientoContainer, ChoosedPalette.getSecondaryLightColor());
                break;
            default:
                break;
        }
    }
    
    @Override
    public void light() {
        container.setkFillBackground(false);
        tipoTratamiento();
    }
    
    @Override
    public void dark() {
        container.setkFillBackground(true);
        container.setkStartColor(ChoosedPalette.getSecondaryBackground());
        container.setkEndColor(ChoosedPalette.getSecondaryBackground());
        container.repaint();
        tipoTratamiento();
        tratamientoText.setForeground(ChoosedPalette.getWhite());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        container = new com.k33ptoo.components.KGradientPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        tratamientoContainer = new com.k33ptoo.components.KGradientPanel();
        tratamientoText = new javax.swing.JLabel();
        facturarButton = new com.k33ptoo.components.KGradientPanel();
        factura = new javax.swing.JLabel();
        nombres = new javax.swing.JLabel();
        fechaText = new javax.swing.JLabel();
        contactoText = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(123434, 150));
        setMinimumSize(new java.awt.Dimension(250, 150));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(250, 150));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(100, 10));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 10));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_END);

        container.setkEndColor(new java.awt.Color(204, 204, 204));
        container.setkFillBackground(false);
        container.setkStartColor(new java.awt.Color(204, 204, 204));
        container.setOpaque(false);
        container.setLayout(new java.awt.BorderLayout());

        jPanel2.setMinimumSize(new java.awt.Dimension(100, 10));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 10));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        container.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setMinimumSize(new java.awt.Dimension(100, 10));
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(250, 10));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        container.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel4.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(10, 90));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        container.add(jPanel4, java.awt.BorderLayout.LINE_START);

        jPanel5.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel5.setOpaque(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(10, 90));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        container.add(jPanel5, java.awt.BorderLayout.LINE_END);

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tratamientoContainer.setkEndColor(new java.awt.Color(204, 204, 204));
        tratamientoContainer.setkStartColor(new java.awt.Color(204, 204, 204));
        tratamientoContainer.setMaximumSize(new java.awt.Dimension(32767, 25));
        tratamientoContainer.setMinimumSize(new java.awt.Dimension(100, 25));
        tratamientoContainer.setOpaque(false);

        tratamientoText.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        tratamientoText.setForeground(new java.awt.Color(51, 51, 51));
        tratamientoText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tratamientoText.setText("Tratamiento");

        javax.swing.GroupLayout tratamientoContainerLayout = new javax.swing.GroupLayout(tratamientoContainer);
        tratamientoContainer.setLayout(tratamientoContainerLayout);
        tratamientoContainerLayout.setHorizontalGroup(
            tratamientoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tratamientoText, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        tratamientoContainerLayout.setVerticalGroup(
            tratamientoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tratamientoText, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel6.add(tratamientoContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        facturarButton.setkEndColor(new java.awt.Color(204, 204, 204));
        facturarButton.setkStartColor(new java.awt.Color(204, 204, 204));
        facturarButton.setMaximumSize(new java.awt.Dimension(32767, 25));
        facturarButton.setMinimumSize(new java.awt.Dimension(100, 25));
        facturarButton.setOpaque(false);
        facturarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facturarButtonMouseClicked(evt);
            }
        });

        factura.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        factura.setForeground(new java.awt.Color(51, 51, 51));
        factura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        factura.setText("Facturar");
        factura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout facturarButtonLayout = new javax.swing.GroupLayout(facturarButton);
        facturarButton.setLayout(facturarButtonLayout);
        facturarButtonLayout.setHorizontalGroup(
            facturarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(factura, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        facturarButtonLayout.setVerticalGroup(
            facturarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(factura, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel6.add(facturarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 120, 30));

        nombres.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        nombres.setForeground(new java.awt.Color(51, 51, 51));
        nombres.setText("Damian Alexander García Lewis");
        jPanel6.add(nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 260, -1));

        fechaText.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        fechaText.setText("19/09/22 06:54 AM");
        jPanel6.add(fechaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 220, 20));

        contactoText.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        contactoText.setForeground(new java.awt.Color(51, 51, 51));
        contactoText.setText("6450 0770");
        contactoText.setToolTipText("Contacto");
        jPanel6.add(contactoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 120, 30));

        container.add(jPanel6, java.awt.BorderLayout.CENTER);

        add(container, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void facturarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facturarButtonMouseClicked
        ApplicationContext.facturaData.setPacientName(nombres.getText(), CONSULTA_MODEL.getId());
        ApplicationContext.registroFactura.setVisible(true);

    }//GEN-LAST:event_facturarButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contactoText;
    private com.k33ptoo.components.KGradientPanel container;
    private javax.swing.JLabel factura;
    private com.k33ptoo.components.KGradientPanel facturarButton;
    private javax.swing.JLabel fechaText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel nombres;
    private com.k33ptoo.components.KGradientPanel tratamientoContainer;
    private javax.swing.JLabel tratamientoText;
    // End of variables declaration//GEN-END:variables
}
