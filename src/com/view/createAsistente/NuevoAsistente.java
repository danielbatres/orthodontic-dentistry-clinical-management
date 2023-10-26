package com.view.createAsistente;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.helper.AsistenteHelper;
import com.utils.Styles;
import com.utils.Tools;
import com.view.createPacient.NewContext;

/**
 *
 * @author Daniel Batres
 */
public class NuevoAsistente extends Styles {
    
    /**
     * Creates new form NuevoAsistente
     */
    public NuevoAsistente() {
        initComponents();
        styleMyComponentBaby();
        Tools.showPanel(dataContent, ApplicationContext.newAsistenteInformation, 10, 10);
    }
    
    @Override
    public void addTitlesAndSubtitles() {
        TITLES_AND_SUBTITLES.add(title1);
    }

    @Override
    public void addPlainText() {
        PLAIN_TEXT.add(text1);
    }

    @Override
    public void addContainers() {
        CONTAINERS.add(container1);
        CONTAINERS.add(container2);
    }

    @Override
    public void initStyles() {
        Tools.setScroll(scrollPanel);
        
    }
    
    @Override
    public void colorBasics() {
        paintOneContainer(saveButton, ChoosedPalette.getMidColor());
        dataContent.setBackground(ChoosedPalette.getPrimaryBackground());
        paintOneContainer(containerButton, ChoosedPalette.getDarkColor());
        paintOnePlainText(cancel, ChoosedPalette.getDarkColor());
        paintTitlesAndSubtitles();
        paintPlainText();
    }
    
    public void showFirstPanel() {
        Tools.showPanel(dataContent, ApplicationContext.newAsistenteInformation, 10, 10);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        text1 = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        containerButton = new com.k33ptoo.components.KGradientPanel();
        cancel = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        container2 = new com.k33ptoo.components.KGradientPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        saveButton = new com.k33ptoo.components.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        container1 = new com.k33ptoo.components.KGradientPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        scrollPanel = new javax.swing.JScrollPane();
        dataContent = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(1060, 569));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1060, 569));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(22, 32767));
        jPanel1.setMinimumSize(new java.awt.Dimension(22, 100));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(22, 569));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );

        add(jPanel1, java.awt.BorderLayout.LINE_END);

        jPanel3.setMaximumSize(new java.awt.Dimension(22, 32767));
        jPanel3.setMinimumSize(new java.awt.Dimension(22, 100));
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(22, 569));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );

        add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel2.setMaximumSize(new java.awt.Dimension(32767, 20));
        jPanel2.setMinimumSize(new java.awt.Dimension(20, 20));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(1060, 20));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel4.setMaximumSize(new java.awt.Dimension(32767, 20));
        jPanel4.setMinimumSize(new java.awt.Dimension(20, 20));
        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(1060, 20));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel6.setMinimumSize(new java.awt.Dimension(100, 70));
        jPanel6.setOpaque(false);
        jPanel6.setPreferredSize(new java.awt.Dimension(1016, 70));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel13.setOpaque(false);

        text1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text1.setForeground(new java.awt.Color(153, 153, 153));
        text1.setText("Agrega la información correspondiente del asistente");

        title1.setBackground(new java.awt.Color(0, 0, 0));
        title1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        title1.setForeground(new java.awt.Color(0, 0, 0));
        title1.setText("Nuevo Asistente");

        containerButton.setkEndColor(new java.awt.Color(0, 0, 0));
        containerButton.setkFillBackground(false);
        containerButton.setkStartColor(new java.awt.Color(0, 0, 0));
        containerButton.setOpaque(false);
        containerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                containerButtonMouseClicked(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        cancel.setForeground(new java.awt.Color(0, 0, 0));
        cancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancel.setText("Cancelar");
        cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout containerButtonLayout = new javax.swing.GroupLayout(containerButton);
        containerButton.setLayout(containerButtonLayout);
        containerButtonLayout.setHorizontalGroup(
            containerButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancel, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );
        containerButtonLayout.setVerticalGroup(
            containerButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text1)
                    .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(containerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(containerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(title1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text1)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel13, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel7.setMaximumSize(new java.awt.Dimension(32767, 80));
        jPanel7.setMinimumSize(new java.awt.Dimension(100, 80));
        jPanel7.setOpaque(false);
        jPanel7.setPreferredSize(new java.awt.Dimension(1016, 80));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel9.setMaximumSize(new java.awt.Dimension(32767, 7));
        jPanel9.setMinimumSize(new java.awt.Dimension(7, 7));
        jPanel9.setOpaque(false);
        jPanel9.setPreferredSize(new java.awt.Dimension(1060, 7));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1016, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel9, java.awt.BorderLayout.PAGE_START);

        container2.setkEndColor(new java.awt.Color(204, 204, 204));
        container2.setkFillBackground(false);
        container2.setkStartColor(new java.awt.Color(204, 204, 204));
        container2.setOpaque(false);
        container2.setLayout(new java.awt.BorderLayout());

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setMinimumSize(new java.awt.Dimension(14, 100));
        jPanel30.setOpaque(false);
        jPanel30.setPreferredSize(new java.awt.Dimension(14, 150));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container2.add(jPanel30, java.awt.BorderLayout.LINE_END);

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setMinimumSize(new java.awt.Dimension(14, 100));
        jPanel31.setOpaque(false);
        jPanel31.setPreferredSize(new java.awt.Dimension(14, 150));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container2.add(jPanel31, java.awt.BorderLayout.LINE_START);

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setMinimumSize(new java.awt.Dimension(14, 14));
        jPanel32.setOpaque(false);

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1016, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        container2.add(jPanel32, java.awt.BorderLayout.PAGE_END);

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.setMinimumSize(new java.awt.Dimension(14, 14));
        jPanel33.setOpaque(false);

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1016, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        container2.add(jPanel33, java.awt.BorderLayout.PAGE_START);

        jPanel12.setOpaque(false);

        saveButton.setkEndColor(new java.awt.Color(0, 0, 0));
        saveButton.setkStartColor(new java.awt.Color(0, 0, 0));
        saveButton.setOpaque(false);
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Guardar");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout saveButtonLayout = new javax.swing.GroupLayout(saveButton);
        saveButton.setLayout(saveButtonLayout);
        saveButtonLayout.setHorizontalGroup(
            saveButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saveButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );
        saveButtonLayout.setVerticalGroup(
            saveButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saveButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(802, Short.MAX_VALUE)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        container2.add(jPanel12, java.awt.BorderLayout.CENTER);

        jPanel7.add(container2, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel7, java.awt.BorderLayout.PAGE_END);

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel10.setMaximumSize(new java.awt.Dimension(32767, 7));
        jPanel10.setMinimumSize(new java.awt.Dimension(7, 7));
        jPanel10.setOpaque(false);
        jPanel10.setPreferredSize(new java.awt.Dimension(1060, 7));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1016, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel10, java.awt.BorderLayout.PAGE_END);

        jPanel11.setMaximumSize(new java.awt.Dimension(32767, 14));
        jPanel11.setMinimumSize(new java.awt.Dimension(7, 14));
        jPanel11.setOpaque(false);
        jPanel11.setPreferredSize(new java.awt.Dimension(1060, 14));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1016, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel11, java.awt.BorderLayout.PAGE_START);

        container1.setkEndColor(new java.awt.Color(204, 204, 204));
        container1.setkFillBackground(false);
        container1.setkStartColor(new java.awt.Color(204, 204, 204));
        container1.setOpaque(false);
        container1.setLayout(new java.awt.BorderLayout());

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setMinimumSize(new java.awt.Dimension(14, 100));
        jPanel26.setOpaque(false);
        jPanel26.setPreferredSize(new java.awt.Dimension(14, 150));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        container1.add(jPanel26, java.awt.BorderLayout.LINE_END);

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setMinimumSize(new java.awt.Dimension(14, 100));
        jPanel27.setOpaque(false);
        jPanel27.setPreferredSize(new java.awt.Dimension(14, 150));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        container1.add(jPanel27, java.awt.BorderLayout.LINE_START);

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setMinimumSize(new java.awt.Dimension(14, 14));
        jPanel28.setOpaque(false);

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1016, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        container1.add(jPanel28, java.awt.BorderLayout.PAGE_END);

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setMinimumSize(new java.awt.Dimension(14, 14));
        jPanel29.setOpaque(false);

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1016, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        container1.add(jPanel29, java.awt.BorderLayout.PAGE_START);

        scrollPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        scrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        dataContent.setBackground(new java.awt.Color(255, 255, 255));
        dataContent.setLayout(new java.awt.GridLayout(1, 0));
        scrollPanel.setViewportView(dataContent);

        container1.add(scrollPanel, java.awt.BorderLayout.CENTER);

        jPanel8.add(container1, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel8, java.awt.BorderLayout.CENTER);

        add(jPanel5, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseClicked
        NewContext.validarTodosLosCampos(ApplicationContext.newAsistenteInformation.camposTexto, ApplicationContext.newAsistenteInformation.advertenciasTexto, ApplicationContext.newAsistenteInformation.containersTexto);
        ApplicationContext.newAsistenteInformation.validarCombo();
        ApplicationContext.newAsistenteInformation.validarEdad();
        ApplicationContext.newAsistenteInformation.validarFechaNacimiento();
        
        if (NewContext.countedErrors == 0) {
            if (NewContext.emptyCounter != 0) {
                EstasSeguroAsistente estasSeguroAsistente = new EstasSeguroAsistente();
                estasSeguroAsistente.setVisible(true);
            } else {
                AsistenteHelper.crearAsistente(ApplicationContext.newAsistenteInformation.devolverDatos());
            }
        }
        
        NewContext.emptyCounter = 0;
        NewContext.countedErrors = 0;
    }//GEN-LAST:event_saveButtonMouseClicked

    private void containerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_containerButtonMouseClicked
        ApplicationContext.mainInterface.mostrarPanel(ApplicationContext.asistentes);
    }//GEN-LAST:event_containerButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancel;
    private com.k33ptoo.components.KGradientPanel container1;
    private com.k33ptoo.components.KGradientPanel container2;
    private com.k33ptoo.components.KGradientPanel containerButton;
    private javax.swing.JPanel dataContent;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private com.k33ptoo.components.KGradientPanel saveButton;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel title1;
    // End of variables declaration//GEN-END:variables
}
