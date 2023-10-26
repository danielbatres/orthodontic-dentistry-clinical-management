package com.view.viewOdontograma;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.context.StateColors;
import com.helper.OdontogramaHelper;
import com.model.DienteOdontogramaModel;
import com.utils.Styles;
import com.utils.Tools;
import javax.swing.SwingUtilities;

/**
 *
 * @author Daniel Batres
 */
public class OdontogramaTarget extends Styles {
    DienteOdontogramaModel dienteModel;
    
    /**
     * Creates new form OdontogramaTarget
     * @param dienteOdontograma
     */
    public OdontogramaTarget(DienteOdontogramaModel dienteOdontograma) {
        initComponents();
        styleMyComponentBaby();
        this.dienteModel = dienteOdontograma;
        diagnostico.setText(dienteOdontograma.getDiagnostico());
        descripcionDiagnostico.setText(dienteOdontograma.getDescripcionDiagnostico());
        procedimiento.setText(dienteOdontograma.getProcedimiento());
        pieza.setText(dienteOdontograma.getPieza());
        cara.setText(dienteOdontograma.getCara());
    }
    
    @Override
    public void addContainers() {
        CONTAINERS.add(container1);
    }
    
    @Override
    public void addPlainText() {
        PLAIN_TEXT.add(descripcionDiagnostico);
    }
    
    @Override
    public void addTitlesAndSubtitles() {
        TITLES_AND_SUBTITLES.add(diagnostico);
        TITLES_AND_SUBTITLES.add(procedimiento);
        TITLES_AND_SUBTITLES.add(pieza);
        TITLES_AND_SUBTITLES.add(cara);
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
            container.setkStartColor(ChoosedPalette.getPrimaryBackground());
            container.setkEndColor(ChoosedPalette.getPrimaryBackground());
            container.repaint();
        });
    }

    @Override
    public void initStyles() {
        editIcon.setSize(34, 58);
        Tools.setImageLabel(editIcon, "src/com/assets/editar.png", 10, 32, StateColors.getInfo());
        deleteIcon.setSize(34, 58);
        Tools.setImageLabel(deleteIcon, "src/com/assets/basura.png", 10, 32, StateColors.getDanger());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container1 = new com.k33ptoo.components.KGradientPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        diagnostico = new javax.swing.JLabel();
        padding = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        descripcionDiagnostico = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        procedimiento = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        pieza = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        cara = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        editIcon = new javax.swing.JLabel();
        deleteIcon = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(32767, 70));
        setMinimumSize(new java.awt.Dimension(700, 70));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(700, 70));
        setLayout(new java.awt.BorderLayout());

        container1.setkFillBackground(false);
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
        jPanel2.setLayout(new java.awt.GridLayout(2, 1));

        jPanel7.setOpaque(false);

        diagnostico.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        diagnostico.setText("Diagnostico");
        diagnostico.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(padding, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diagnostico, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(diagnostico, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(padding, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jPanel2.add(jPanel7);

        jPanel8.setOpaque(false);

        descripcionDiagnostico.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        descripcionDiagnostico.setText("Descripcion");
        descripcionDiagnostico.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descripcionDiagnostico, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionDiagnostico, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.add(jPanel8);

        container1.add(jPanel2);

        jPanel3.setOpaque(false);

        procedimiento.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        procedimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        procedimiento.setText("Procedimiento");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(procedimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(procedimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        container1.add(jPanel3);

        jPanel4.setOpaque(false);

        pieza.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        pieza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pieza.setText("Pieza");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pieza, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pieza, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        container1.add(jPanel4);

        jPanel5.setOpaque(false);

        cara.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        cara.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cara.setText("Cara");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cara, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cara, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        container1.add(jPanel5);

        jPanel6.setOpaque(false);

        editIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editIconMouseClicked(evt);
            }
        });

        deleteIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(deleteIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addContainerGap())
        );

        container1.add(jPanel6);

        add(container1, java.awt.BorderLayout.CENTER);

        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 10));
        jPanel1.setMinimumSize(new java.awt.Dimension(100, 10));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 10));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void editIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editIconMouseClicked
        ApplicationContext.odontogramaData.setValuesUpdate(dienteModel);
        ApplicationContext.registroOdontograma.setVisible(true);
    }//GEN-LAST:event_editIconMouseClicked

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

    private void deleteIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteIconMouseClicked
        ApplicationContext.deleteTarget.setModel(dienteModel);
        ApplicationContext.deleteTarget.setVisible(true);   
    }//GEN-LAST:event_deleteIconMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cara;
    private com.k33ptoo.components.KGradientPanel container1;
    private javax.swing.JLabel deleteIcon;
    private javax.swing.JLabel descripcionDiagnostico;
    private javax.swing.JLabel diagnostico;
    private javax.swing.JLabel editIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel padding;
    private javax.swing.JLabel pieza;
    private javax.swing.JLabel procedimiento;
    // End of variables declaration//GEN-END:variables
}
