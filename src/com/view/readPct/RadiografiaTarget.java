package com.view.readPct;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.context.StateColors;
import com.model.RadiografiaModel;
import com.model.RadiografiaType;
import com.utils.Styles;
import com.utils.Tools;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 20/09/22
 */
public class RadiografiaTarget extends Styles {
    private final RadiografiaType RADIOGRAFIA_TYPE;
    private final RadiografiaModel radiografiaModel;
    
    /**
     * Creates new form RadiografiaTarget
     * @param radiografia
     * @param caseTarget
     */
    public RadiografiaTarget(RadiografiaModel radiografia, String caseTarget) {
        initComponents();
        styleMyComponentBaby();
        RADIOGRAFIA_TYPE = radiografia.getTipo();
        nombreRadiografia.setText(radiografia.getNombreImagen());
        this.radiografiaModel = radiografia;
        image.setSize(40, 40);
        
        try {
            Image images = radiografia.getImagenIcon().getScaledInstance(image.getWidth(), image.getHeight(), Image.SCALE_SMOOTH);
            image.setIcon(new ImageIcon(images));
        } catch (Exception e) {
            System.out.println(e);
        }
        
        if (caseTarget.equals("front")) {
            switch (radiografia.getTipo()) {
                case ANTES:
                    tipo.setText("Antes");
                    break;
                case DESPUES:
                    tipo.setText("Despues");
                    break;
            }
        } else {
            tipo.setText(radiografia.getFechaDeCreacion());
        }
    }
    
    @Override
    public void addTitlesAndSubtitles() {
        TITLES_AND_SUBTITLES.add(nombreRadiografia);
        TITLES_AND_SUBTITLES.add(tipo);
    }
    
    @Override
    public void addContainers() {
        CONTAINERS.add(container1);
    }
    
    @Override
    public void initStyles() {
        deleteIcon.setSize(34, 58);
        Tools.setImageLabel(deleteIcon, "src/com/assets/basura.png", 10, 32, StateColors.getDanger());
        maximize.setSize(34, 58);
        Tools.setImageLabel(maximize, "src/com/assets/expandir-flechas.png", 12, 34, ChoosedPalette.getMidColor());
    }

    public RadiografiaType getRadiografiaType() {
        return RADIOGRAFIA_TYPE;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        container1 = new com.k33ptoo.components.KGradientPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        nombreRadiografia = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        tipo = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        deleteIcon = new javax.swing.JLabel();
        maximize = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(32767, 80));
        setMinimumSize(new java.awt.Dimension(0, 80));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(400, 80));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 10));
        jPanel1.setMinimumSize(new java.awt.Dimension(100, 10));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(327, 10));

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

        container1.setkEndColor(new java.awt.Color(204, 204, 204));
        container1.setkFillBackground(false);
        container1.setkStartColor(new java.awt.Color(204, 204, 204));
        container1.setOpaque(false);
        container1.setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setOpaque(false);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel6.setLayout(new java.awt.BorderLayout());

        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel6.add(image, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        container1.add(jPanel2);

        jPanel3.setOpaque(false);

        nombreRadiografia.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        nombreRadiografia.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombreRadiografia, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombreRadiografia, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        container1.add(jPanel3);

        jPanel4.setOpaque(false);

        tipo.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        tipo.setForeground(new java.awt.Color(0, 0, 0));
        tipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tipo, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tipo, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        container1.add(jPanel4);

        panel.setOpaque(false);

        deleteIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteIconMouseClicked(evt);
            }
        });

        maximize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        maximize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maximizeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(deleteIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(maximize, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(maximize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        container1.add(panel);

        add(container1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void maximizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizeMouseClicked
        ApplicationContext.viewRadiografia.setImage(radiografiaModel);
        ApplicationContext.viewRadiografia.setVisible(true);
    }//GEN-LAST:event_maximizeMouseClicked

    private void deleteIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteIconMouseClicked
        ApplicationContext.deleteRadiografia.setIdRadiografia(radiografiaModel.getId(), radiografiaModel.getNombreImagen(), ApplicationContext.selectedTreatmentInOut);
        ApplicationContext.deleteRadiografia.setVisible(true);
    }//GEN-LAST:event_deleteIconMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KGradientPanel container1;
    private javax.swing.JLabel deleteIcon;
    private javax.swing.JLabel image;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel maximize;
    private javax.swing.JLabel nombreRadiografia;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel tipo;
    // End of variables declaration//GEN-END:variables
}
