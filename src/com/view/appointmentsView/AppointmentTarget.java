package com.view.appointmentsView;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.context.StateColors;
import com.helper.FacturaHelper;
import com.model.ConsultaModel;
import com.utils.Styles;
import static com.utils.Styles.paintOneContainer;
import com.utils.Tools;
import javax.swing.SwingUtilities;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 27/09/22
 */
public class AppointmentTarget extends Styles {
    private final ConsultaModel CONSULTA_MODEL;
    
    /**
     * Creates new form AgendaTarget
     * @param consulta
     */
    public AppointmentTarget(ConsultaModel consulta) {
        initComponents();
        styleMyComponentBaby();
        CONSULTA_MODEL = consulta;
        fechaText.setText(consulta.getDiaDeConsulta() + "/" + consulta.getMesDeConsulta() + "/" + consulta.getAnnioDeConsulta());
        horaText.setText(consulta.getHoraDeConsulta());
        paciente.setText(consulta.getNombres() + " " + consulta.getApellidos());
        tratamientoText.setText(consulta.getTratamientoDeConsulta());
        
        if (consulta.isConsultaRealizada()) {
            facturaText.setText("Ver factura");
        }
    }
    
    @Override
    public void addTitlesAndSubtitles() {
        TITLES_AND_SUBTITLES.add(fechaText);
        TITLES_AND_SUBTITLES.add(horaText);
        TITLES_AND_SUBTITLES.add(paciente);
    }
    
    @Override
    public void addContainers() {
        CONTAINERS.add(container1);
    }
    
    @Override
    public void initStyles() {
        image.setSize(50, 50);
        paintOneContainer(facturaContainer, ChoosedPalette.getMidColor());
        paintOnePlainText(facturaText, ChoosedPalette.getWhite());
    }
    
    @Override
    public void colorBasics() {
        paintAll();
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
        CONTAINERS.forEach(container -> {
            container.setkFillBackground(false);
            container.setkStartColor(ChoosedPalette.getGray());
            container.setkEndColor(ChoosedPalette.getGray());
            container.repaint();
        });
        tipoTratamiento();
        Tools.setImage(image, "src/com/images/user.png", 0, 0);
        if (facturaText.getText().equals("Facturar")) {
            paintOneContainer(facturaContainer, ChoosedPalette.getMidColor());
        } else {
            paintOneContainer(facturaContainer, ChoosedPalette.getSecondaryLightColor());
            paintOnePlainText(facturaText, StateColors.getSuccess());
        }
    }
    
    @Override
    public void dark() {
        CONTAINERS.forEach(container -> {
            container.setkFillBackground(true);
            container.setkStartColor(ChoosedPalette.getSecondaryBackground());
            container.setkEndColor(ChoosedPalette.getSecondaryBackground());
            container.repaint();
        });
        tipoTratamiento();
        tratamientoText.setForeground(ChoosedPalette.getWhite());
        Tools.setImage(image, "src/com/images/dark-user.png", 0, 0);
        if (facturaText.getText().equals("Facturar")) {
            paintOneContainer(facturaContainer, ChoosedPalette.getMidColor());
        } else {
            paintOneContainer(facturaContainer, ChoosedPalette.getSecondaryLightColor());
            paintOnePlainText(facturaText, ChoosedPalette.getWhite());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        container1 = new com.k33ptoo.components.KGradientPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        fechaText = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        horaText = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        kGradientPanel3 = new com.k33ptoo.components.KGradientPanel();
        image = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        paciente = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tratamientoContainer = new com.k33ptoo.components.KGradientPanel();
        tratamientoText = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        facturaContainer = new com.k33ptoo.components.KGradientPanel();
        facturaText = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(2147483647, 80));
        setMinimumSize(new java.awt.Dimension(600, 80));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(600, 80));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(100, 10));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(683, 10));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 913, Short.MAX_VALUE)
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
        container1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                container1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                container1MouseExited(evt);
            }
        });
        container1.setLayout(new java.awt.GridLayout(1, 0));

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.GridLayout(1, 4));

        jPanel7.setOpaque(false);

        fechaText.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        fechaText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fechaText.setText("18/09/22");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 114, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(fechaText, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(fechaText, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel5.add(jPanel7);

        jPanel8.setOpaque(false);

        horaText.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        horaText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        horaText.setText("10:57 AM");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 114, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(horaText, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(horaText, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel5.add(jPanel8);

        jPanel9.setOpaque(false);

        kGradientPanel3.setkBorderRadius(100);
        kGradientPanel3.setkEndColor(new java.awt.Color(204, 204, 204));
        kGradientPanel3.setkStartColor(new java.awt.Color(204, 204, 204));
        kGradientPanel3.setMaximumSize(new java.awt.Dimension(48, 48));
        kGradientPanel3.setMinimumSize(new java.awt.Dimension(48, 48));
        kGradientPanel3.setOpaque(false);
        kGradientPanel3.setPreferredSize(new java.awt.Dimension(48, 48));
        kGradientPanel3.setLayout(new java.awt.BorderLayout());

        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kGradientPanel3.add(image, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.add(jPanel9);

        jPanel10.setOpaque(false);

        paciente.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        paciente.setText("Daniel Alessandro Garcia Batres");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 114, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 102, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(paciente, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel5.add(jPanel10);

        jPanel3.add(jPanel5);

        container1.add(jPanel3);

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setOpaque(false);

        tratamientoContainer.setkEndColor(new java.awt.Color(204, 204, 204));
        tratamientoContainer.setkStartColor(new java.awt.Color(204, 204, 204));
        tratamientoContainer.setMaximumSize(new java.awt.Dimension(100, 50));
        tratamientoContainer.setMinimumSize(new java.awt.Dimension(100, 50));
        tratamientoContainer.setOpaque(false);
        tratamientoContainer.setLayout(new java.awt.BorderLayout());

        tratamientoText.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        tratamientoText.setForeground(new java.awt.Color(0, 0, 0));
        tratamientoText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tratamientoText.setText("Tratamiento");
        tratamientoContainer.add(tratamientoText, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tratamientoContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(tratamientoContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.add(jPanel2);

        jPanel6.setOpaque(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 152, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel6);

        jPanel11.setOpaque(false);

        facturaContainer.setkEndColor(new java.awt.Color(204, 204, 204));
        facturaContainer.setkStartColor(new java.awt.Color(204, 204, 204));
        facturaContainer.setMaximumSize(new java.awt.Dimension(100, 50));
        facturaContainer.setMinimumSize(new java.awt.Dimension(100, 50));
        facturaContainer.setOpaque(false);
        facturaContainer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facturaContainerMouseClicked(evt);
            }
        });
        facturaContainer.setLayout(new java.awt.BorderLayout());

        facturaText.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        facturaText.setForeground(new java.awt.Color(0, 0, 0));
        facturaText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        facturaText.setText("Facturar");
        facturaText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        facturaContainer.add(facturaText, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(facturaContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(facturaContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.add(jPanel11);

        container1.add(jPanel4);

        add(container1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void container1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_container1MouseEntered
        paintOneContainer(container1, ChoosedPalette.getLightHover());
        if (ApplicationContext.selectedAppereance.equals("light")) {
            container1.setkFillBackground(true);
        } else if (ApplicationContext.selectedAppereance.equals("dark")) {
            paintOneContainer(container1, ChoosedPalette.getPrimaryBackground());
        }
        SwingUtilities.updateComponentTreeUI(this);
    }//GEN-LAST:event_container1MouseEntered

    private void container1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_container1MouseExited
        if (ApplicationContext.selectedAppereance.equals("light")) {
            paintOneContainer(container1, ChoosedPalette.getGray());
            container1.setkFillBackground(false);
        } else if (ApplicationContext.selectedAppereance.equals("dark")) {
            paintOneContainer(container1, ChoosedPalette.getSecondaryBackground());
        }
        SwingUtilities.updateComponentTreeUI(this);
    }//GEN-LAST:event_container1MouseExited

    private void facturaContainerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facturaContainerMouseClicked
        if (facturaText.getText().equals("Facturar")) {
            ApplicationContext.facturaData.setState("crear");
            ApplicationContext.facturaData.setPacientName(paciente.getText(), CONSULTA_MODEL.getId());
            ApplicationContext.facturaData.setStaticValues();
            ApplicationContext.registroFactura.setVisible(true);
        } else {
            ApplicationContext.facturaData.setPacientName(paciente.getText(), CONSULTA_MODEL.getId());
            ApplicationContext.facturaData.setState("actualizar");
            ApplicationContext.facturaData.setValues(FacturaHelper.getFactura(CONSULTA_MODEL.getId()));
            
            ApplicationContext.registroFactura.setVisible(true);
        }
    }//GEN-LAST:event_facturaContainerMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KGradientPanel container1;
    private com.k33ptoo.components.KGradientPanel facturaContainer;
    private javax.swing.JLabel facturaText;
    private javax.swing.JLabel fechaText;
    private javax.swing.JLabel horaText;
    private javax.swing.JLabel image;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private com.k33ptoo.components.KGradientPanel kGradientPanel3;
    private javax.swing.JLabel paciente;
    private com.k33ptoo.components.KGradientPanel tratamientoContainer;
    private javax.swing.JLabel tratamientoText;
    // End of variables declaration//GEN-END:variables
}
