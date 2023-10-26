package com.view.createPacient;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.helper.PacienteHelper;
import com.utils.CustomScrollBar;
import com.utils.Styles;
import com.utils.Tools;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 24/09/22
 */
public class NuevoPaciente extends Styles {
    private JPanel odontologia = ApplicationContext.noPerteneceOdontologia;
    private JPanel ortodoncia = ApplicationContext.noPerteneceOrtodoncia;
    private ArrayList<JPanel> containerButtons = new ArrayList<>();
    
    /**
     * Creates new form NuevoPaciente
     */
    public NuevoPaciente() {
        initComponents();
        styleMyComponentBaby();
        Tools.showPanel(dataContent, ApplicationContext.newPacienteInformation, 10, 10);
    }
    
    @Override
    public void addTitlesAndSubtitles() {
        TITLES_AND_SUBTITLES.add(title1);
    }

    @Override
    public void addPlainText() {
        PLAIN_TEXT.add(text1);
        PLAIN_TEXT.add(text2);
        PLAIN_TEXT.add(text3);
        PLAIN_TEXT.add(text4);
    }

    @Override
    public void addContainers() {
        CONTAINERS.add(container1);
        CONTAINERS.add(container2);
    }

    @Override
    public void initStyles() {
        Tools.setScroll(scrollPanel);
        
        addContainerButtons();
    }
    
    @Override
    public void colorBasics() {
        needBorder.setBorder(new MatteBorder(0, 0, 1, 0, ChoosedPalette.getGray()));
        text2.setForeground(ChoosedPalette.getMidColor());
        datosContainer.setBorder(new MatteBorder(0, 0, 3, 0, ChoosedPalette.getMidColor()));
        paintOneContainer(saveButton, ChoosedPalette.getMidColor());
        paintOneContainer(containerButton, ChoosedPalette.getDarkColor());
        cancel.setForeground(ChoosedPalette.getDarkColor());
        dataContent.setBackground(ChoosedPalette.getPrimaryBackground());
        paintTitlesAndSubtitles();
        paintPlainText();
    }
    
    public void showFirstPanel() {
        Tools.showPanel(dataContent, ApplicationContext.newPacienteInformation, 10, 10);
    }
    
    public void addContainerButtons() {
        containerButtons.add(datosContainer);
        containerButtons.add(odontologiaContainer);
        containerButtons.add(ortodonciaContainer);
    }
    
    public JPanel getOdontologia() {
        return odontologia;
    }

    public void setOdontologia(JPanel odontologia) {
        this.odontologia = odontologia;
    }

    public JPanel getOrtodoncia() {
        return ortodoncia;
    }

    public void setOrtodoncia(JPanel ortodoncia) {
        this.ortodoncia = ortodoncia;
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
        needBorder = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        datosContainer = new javax.swing.JPanel();
        text2 = new javax.swing.JLabel();
        odontologiaContainer = new javax.swing.JPanel();
        text3 = new javax.swing.JLabel();
        ortodonciaContainer = new javax.swing.JPanel();
        text4 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
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

        jPanel6.setMinimumSize(new java.awt.Dimension(100, 110));
        jPanel6.setOpaque(false);
        jPanel6.setPreferredSize(new java.awt.Dimension(1016, 110));
        jPanel6.setLayout(new java.awt.BorderLayout());

        needBorder.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        needBorder.setMinimumSize(new java.awt.Dimension(100, 40));
        needBorder.setOpaque(false);
        needBorder.setPreferredSize(new java.awt.Dimension(1016, 40));
        needBorder.setLayout(new java.awt.GridLayout(1, 0));

        jPanel15.setOpaque(false);
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        datosContainer.setBackground(new java.awt.Color(255, 255, 255));
        datosContainer.setOpaque(false);
        datosContainer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datosContainerMouseClicked(evt);
            }
        });

        text2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text2.setForeground(new java.awt.Color(69, 98, 255));
        text2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text2.setText("Datos generales");
        text2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout datosContainerLayout = new javax.swing.GroupLayout(datosContainer);
        datosContainer.setLayout(datosContainerLayout);
        datosContainerLayout.setHorizontalGroup(
            datosContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text2, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );
        datosContainerLayout.setVerticalGroup(
            datosContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datosContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel15.add(datosContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, -1, 40));

        odontologiaContainer.setBackground(new java.awt.Color(255, 255, 255));
        odontologiaContainer.setOpaque(false);
        odontologiaContainer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                odontologiaContainerMouseClicked(evt);
            }
        });

        text3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text3.setForeground(new java.awt.Color(69, 98, 255));
        text3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text3.setText("Ficha de odontología");
        text3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout odontologiaContainerLayout = new javax.swing.GroupLayout(odontologiaContainer);
        odontologiaContainer.setLayout(odontologiaContainerLayout);
        odontologiaContainerLayout.setHorizontalGroup(
            odontologiaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(odontologiaContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text3, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );
        odontologiaContainerLayout.setVerticalGroup(
            odontologiaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, odontologiaContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel15.add(odontologiaContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 0, -1, 39));

        ortodonciaContainer.setBackground(new java.awt.Color(255, 255, 255));
        ortodonciaContainer.setOpaque(false);
        ortodonciaContainer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ortodonciaContainerMouseClicked(evt);
            }
        });

        text4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text4.setForeground(new java.awt.Color(69, 98, 255));
        text4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text4.setText("Ficha de ortodoncia");
        text4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout ortodonciaContainerLayout = new javax.swing.GroupLayout(ortodonciaContainer);
        ortodonciaContainer.setLayout(ortodonciaContainerLayout);
        ortodonciaContainerLayout.setHorizontalGroup(
            ortodonciaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ortodonciaContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text4, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addContainerGap())
        );
        ortodonciaContainerLayout.setVerticalGroup(
            ortodonciaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ortodonciaContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel15.add(ortodonciaContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 0, -1, 39));

        needBorder.add(jPanel15);

        jPanel16.setOpaque(false);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        needBorder.add(jPanel16);

        jPanel6.add(needBorder, java.awt.BorderLayout.PAGE_END);

        jPanel13.setOpaque(false);

        text1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text1.setForeground(new java.awt.Color(153, 153, 153));
        text1.setText("Agrega la información correspondiente del paciente");

        title1.setBackground(new java.awt.Color(0, 0, 0));
        title1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        title1.setForeground(new java.awt.Color(0, 0, 0));
        title1.setText("Nuevo paciente");

        containerButton.setkEndColor(new java.awt.Color(0, 0, 0));
        containerButton.setkFillBackground(false);
        containerButton.setkStartColor(new java.awt.Color(0, 0, 0));
        containerButton.setOpaque(false);

        cancel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        cancel.setForeground(new java.awt.Color(0, 0, 0));
        cancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancel.setText("Cancelar");
        cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout containerButtonLayout = new javax.swing.GroupLayout(containerButton);
        containerButton.setLayout(containerButtonLayout);
        containerButtonLayout.setHorizontalGroup(
            containerButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancel, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        containerButtonLayout.setVerticalGroup(
            containerButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addGap(0, 290, Short.MAX_VALUE)
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
            .addGap(0, 290, Short.MAX_VALUE)
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

    private void datosContainerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datosContainerMouseClicked
        setSelectionNavigation(containerButtons, text2, datosContainer);
        Tools.showPanel(dataContent, ApplicationContext.newPacienteInformation, 10, 10);
    }//GEN-LAST:event_datosContainerMouseClicked

    private void odontologiaContainerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_odontologiaContainerMouseClicked
        setSelectionNavigation(containerButtons, text3, odontologiaContainer);
        
        if (NewContext.isTratamientoOdontologico) {
            setOdontologia(ApplicationContext.nuevoPacienteOdontologia);
        } else {
            setOdontologia(ApplicationContext.noPerteneceOdontologia);
        }
        Tools.showPanel(dataContent, odontologia, 10, 10);
    }//GEN-LAST:event_odontologiaContainerMouseClicked

    private void ortodonciaContainerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ortodonciaContainerMouseClicked
        setSelectionNavigation(containerButtons, text4, ortodonciaContainer);
        
        if (NewContext.isTratamientoOrtodontico) {
            setOrtodoncia(ApplicationContext.nuevoPacienteOrtodoncia);
        } else {
            setOrtodoncia(ApplicationContext.noPerteneceOrtodoncia);
        }
        
        Tools.showPanel(dataContent, ortodoncia, 10, 10);
    }//GEN-LAST:event_ortodonciaContainerMouseClicked

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseClicked
        NewContext.isTratamientoOdontologico = false;
        NewContext.isTratamientoOrtodontico = false;
        NewContext.emptyCounter = 0;
        NewContext.countedErrors = 0;
        
        NewContext.validarTodosLosCampos(ApplicationContext.newPacienteInformation.camposTexto, ApplicationContext.newPacienteInformation.advertenciasTexto, ApplicationContext.newPacienteInformation.containersTexto);
        ApplicationContext.newPacienteInformation.validarCombo();
        ApplicationContext.newPacienteInformation.validarEdad();
        ApplicationContext.newPacienteInformation.verifyEmpty();
        ApplicationContext.newPacienteInformation.validarFechaNacimiento();
        
        if (NewContext.countedErrors == 0) {
            NewContext.paciente = ApplicationContext.newPacienteInformation.devolverDatos();
            
            if (NewContext.paciente.isTratamientoOdontologico()) {
                NewContext.paciente.setFichaOdontologia(ApplicationContext.nuevoPacienteOdontologia.devolverFicha());
                ApplicationContext.nuevoPacienteOdontologia.verifyEmpty();
            } 

            if (NewContext.paciente.isTratamientoOrtodontico()) {
                NewContext.paciente.setFichaOrtodoncia(ApplicationContext.nuevoPacienteOrtodoncia.devolverFicha());
                ApplicationContext.nuevoPacienteOrtodoncia.verifyEmpty();
            }
            
            if (NewContext.emptyCounter != 0) {
                EstasSeguro estasSeguro = new EstasSeguro();
                estasSeguro.setVisible(true);
            } else {
                PacienteHelper.createNewPacient(NewContext.paciente);
            }
        }
    }//GEN-LAST:event_saveButtonMouseClicked

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        ApplicationContext.mainInterface.mostrarPanel(ApplicationContext.pacientes);
    }//GEN-LAST:event_cancelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancel;
    private com.k33ptoo.components.KGradientPanel container1;
    private com.k33ptoo.components.KGradientPanel container2;
    private com.k33ptoo.components.KGradientPanel containerButton;
    private javax.swing.JPanel dataContent;
    private javax.swing.JPanel datosContainer;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
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
    private javax.swing.JPanel needBorder;
    private javax.swing.JPanel odontologiaContainer;
    private javax.swing.JPanel ortodonciaContainer;
    private com.k33ptoo.components.KGradientPanel saveButton;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel text4;
    private javax.swing.JLabel title1;
    // End of variables declaration//GEN-END:variables
}
