package com.view.activity;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.model.ActividadModel;
import com.utils.Styles;
import static com.utils.Styles.paintOneContainer;
import javax.swing.SwingUtilities;

/**
 *
 * @author Daniel Batres
 */
public class ActividadTargetLog extends Styles {

    /**
     * Creates new form ActividadTarget
     * @param actividad
     */
    public ActividadTargetLog(ActividadModel actividad) {
        initComponents();
        styleMyComponentBaby();
        nombre.setText(actividad.getNombres() + " " + actividad.getApellidos());
        actividadText.setText(actividad.getDescripcionActividad());
        fecha.setText(actividad.getDiaActividad() + "/" + actividad.getMesActividad() + "/" + actividad.getAnnioActividad());
        hora.setText(actividad.getHoraActividad());
    }
    
    @Override
    public void addTitlesAndSubtitles() {
        TITLES_AND_SUBTITLES.add(nombre);
        TITLES_AND_SUBTITLES.add(actividadText);
        TITLES_AND_SUBTITLES.add(fecha);
        TITLES_AND_SUBTITLES.add(hora);
    }
    
    @Override
    public void addContainers() {
        CONTAINERS.add(container1);
    }
    
    @Override
    public void colorBasics() {
        paintAll();
    }
    
    @Override
    public void light() {
        CONTAINERS.forEach(container -> {
            container.setkFillBackground(false);
            container.setkStartColor(ChoosedPalette.getGray());
            container.setkEndColor(ChoosedPalette.getGray());
            container.repaint();
        });
    }
    
    @Override
    public void dark() {
        CONTAINERS.forEach(container -> {
            container.setkFillBackground(true);
            container.setkStartColor(ChoosedPalette.getSecondaryBackground());
            container.setkEndColor(ChoosedPalette.getSecondaryBackground());
            container.repaint();
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        container1 = new com.k33ptoo.components.KGradientPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        actividadText = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        fecha = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        hora = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(0, 80));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(400, 80));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(100, 10));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 10));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
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

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jPanel5.setOpaque(false);

        nombre.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        nombre.setText("Nombre completo");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel5);

        container1.add(jPanel2);

        jPanel3.setOpaque(false);

        actividadText.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        actividadText.setText("Actividad");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(actividadText, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(actividadText, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        container1.add(jPanel3);

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jPanel9.setOpaque(false);

        fecha.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        fecha.setText("00/00/0000");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 61, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(jPanel9);

        jPanel10.setOpaque(false);

        hora.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        hora.setText("00:00 HH");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hora, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hora, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(jPanel10);

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actividadText;
    private com.k33ptoo.components.KGradientPanel container1;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel hora;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel nombre;
    // End of variables declaration//GEN-END:variables
}
