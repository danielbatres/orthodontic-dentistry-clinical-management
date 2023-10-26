package com.view.readPct;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.context.StateColors;
import com.model.ConsultaModel;
import com.utils.Styles;
import static com.utils.Styles.paintOneContainer;
import javax.swing.SwingUtilities;

/**
 *
 * @author Daniel Batres
 */
public class AgendaGeneralTarget extends Styles {

    /**
     * Creates new form AgendaGeneralTarget
     * @param consulta
     */
    public AgendaGeneralTarget(ConsultaModel consulta) {
        initComponents();
        styleMyComponentBaby();
        fecha.setText(consulta.getDiaDeConsulta() + "/" + consulta.getMesDeConsulta() + "/" + consulta.getAnnioDeConsulta());
        hora.setText(consulta.getHoraDeConsulta());
        tratamientoText.setText(consulta.getTratamientoDeConsulta());
    }
    
    @Override
    public void addContainers() {
        CONTAINERS.add(container1);
    }
    
    @Override
    public void addTitlesAndSubtitles() {
        TITLES_AND_SUBTITLES.add(fecha);
        TITLES_AND_SUBTITLES.add(hora);
    }
    
    @Override
    public void colorBasics() {
        paintOneContainer(container3, ChoosedPalette.getMidColor());
        paintTitlesAndSubtitles();
    }
    
    @Override
    public void dark() {
        CONTAINERS.forEach(container -> {
            container.setkFillBackground(true);
            container.setkStartColor(ChoosedPalette.getPrimaryBackground());
            container.setkEndColor(ChoosedPalette.getPrimaryBackground());
            container.repaint();
        });
        
        if (tratamientoText.getText().equals("Odontolog\u00eda")) {
            paintOnePlainText(tratamientoText, ChoosedPalette.getTerciaryTextColor());
            paintOneContainer(container2, ChoosedPalette.getPrimaryLightColor());
        } else if (tratamientoText.getText().equals("Ortodoncia")) {
            paintOnePlainText(tratamientoText, ChoosedPalette.getTerciaryTextColor());
            paintOneContainer(container2, ChoosedPalette.getSecondaryLightColor());
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
        
        if (tratamientoText.getText().equals("Odontolog\u00eda")) {
            paintOnePlainText(tratamientoText, ChoosedPalette.getMidColor());
            paintOneContainer(container2, ChoosedPalette.getPrimaryLightColor());
        } else if (tratamientoText.getText().equals("Ortodoncia")) {
            paintOnePlainText(tratamientoText, StateColors.getSuccess());
            paintOneContainer(container2, ChoosedPalette.getSecondaryLightColor());
        } 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        container1 = new com.k33ptoo.components.KGradientPanel();
        jPanel3 = new javax.swing.JPanel();
        fecha = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        hora = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        container2 = new com.k33ptoo.components.KGradientPanel();
        tratamientoText = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        container3 = new com.k33ptoo.components.KGradientPanel();
        button = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(32767, 70));
        setMinimumSize(new java.awt.Dimension(0, 70));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(400, 70));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 10));
        jPanel1.setMinimumSize(new java.awt.Dimension(100, 10));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 10));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_END);

        container1.setBackground(new java.awt.Color(255, 255, 255));
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
        container1.setLayout(new java.awt.GridLayout());

        jPanel3.setOpaque(false);

        fecha.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        fecha.setForeground(new java.awt.Color(0, 0, 0));
        fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha.setText("  15/09/2022");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        container1.add(jPanel3);

        jPanel4.setOpaque(false);

        hora.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        hora.setForeground(new java.awt.Color(0, 0, 0));
        hora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hora.setText("17:525 PM");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hora, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hora, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        container1.add(jPanel4);

        jPanel5.setOpaque(false);

        container2.setkEndColor(new java.awt.Color(204, 204, 204));
        container2.setkStartColor(new java.awt.Color(204, 204, 204));
        container2.setMaximumSize(new java.awt.Dimension(0, 0));
        container2.setMinimumSize(new java.awt.Dimension(0, 0));
        container2.setOpaque(false);
        container2.setPreferredSize(new java.awt.Dimension(0, 0));
        container2.setLayout(new java.awt.BorderLayout());

        tratamientoText.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        tratamientoText.setForeground(new java.awt.Color(0, 0, 0));
        tratamientoText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tratamientoText.setText("Tratamiento");
        container2.add(tratamientoText, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(container2, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(container2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        container1.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setOpaque(false);

        container3.setkEndColor(new java.awt.Color(0, 0, 0));
        container3.setkStartColor(new java.awt.Color(0, 0, 0));
        container3.setOpaque(false);

        button.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        button.setForeground(new java.awt.Color(255, 255, 255));
        button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        button.setText("Facturar");
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout container3Layout = new javax.swing.GroupLayout(container3);
        container3.setLayout(container3Layout);
        container3Layout.setHorizontalGroup(
            container3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        );
        container3Layout.setVerticalGroup(
            container3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(container3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(container3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        container1.add(jPanel6);

        add(container1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void container1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_container1MouseEntered
        paintOneContainer(container1, ChoosedPalette.getLightHover());
        if (ApplicationContext.selectedAppereance.equals("light")) {
            container1.setkFillBackground(true);
        } else if (ApplicationContext.selectedAppereance.equals("dark")) {
            paintOneContainer(container1, ChoosedPalette.getSecondaryBackground());
        }
        SwingUtilities.updateComponentTreeUI(this);
    }//GEN-LAST:event_container1MouseEntered

    private void container1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_container1MouseExited
        if (ApplicationContext.selectedAppereance.equals("light")) {
            paintOneContainer(container1, ChoosedPalette.getGray());
            container1.setkFillBackground(false);
        } else if (ApplicationContext.selectedAppereance.equals("dark")) {
            paintOneContainer(container1, ChoosedPalette.getPrimaryBackground());
        }
        SwingUtilities.updateComponentTreeUI(this);
    }//GEN-LAST:event_container1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel button;
    private com.k33ptoo.components.KGradientPanel container1;
    private com.k33ptoo.components.KGradientPanel container2;
    private com.k33ptoo.components.KGradientPanel container3;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel hora;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel tratamientoText;
    // End of variables declaration//GEN-END:variables
}
