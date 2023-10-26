package com.view.readPct;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.helper.RadiografiaHelper;
import com.utils.Styles;
import com.utils.Tools;
import javax.swing.SwingUtilities;
import javax.swing.border.MatteBorder;

/**
 *
 * @author Daniel Batres
 */
public class Radiografias extends Styles {
    private String state;
    
    /**
     * Creates new form Radiografias
     */
    public Radiografias() {
        initComponents();
        styleMyComponentBaby();
    }
    
    public void setValues(String value) {
        title1.setText("Radiograf\u00edas de " + value);
        state = value;
    }
    
    public void addTargets() {
        targetsAntes.removeAll();
        targetsDespues.removeAll();
        ApplicationContext.radiografiasListadas.clear();
        ApplicationContext.radiografiasTargets.clear();
        ApplicationContext.radiografiasListadas = RadiografiaHelper.getRadiografias(ApplicationContext.selectedTreatment,
                (ApplicationContext.selectedTreatment.equals("odontologia") ? ApplicationContext.selectedPacient.getFichaOdontologia().getId()
                        : ApplicationContext.selectedPacient.getFichaOrtodoncia().getId()));
        
        ApplicationContext.radiografiasListadas.forEach(radiografia -> {
            ApplicationContext.radiografiasTargets.add(new RadiografiaTarget(radiografia, "back"));
        });
        
        ApplicationContext.radiografiasTargets.forEach(target -> {
            switch(target.getRadiografiaType()) {
                case ANTES:
                    targetsAntes.add(target);
                    break;
                case DESPUES:
                    targetsDespues.add(target);
                    break;
            }
            
            target.colorComponent(ApplicationContext.selectedAppereance);
        });
        
        SwingUtilities.updateComponentTreeUI(this);
    }
    
    @Override
    public void addTitlesAndSubtitles() {
        TITLES_AND_SUBTITLES.add(title1);
        TITLES_AND_SUBTITLES.add(title2);
        TITLES_AND_SUBTITLES.add(title3);
    }
    
    @Override
    public void addPlainText() {
        PLAIN_TEXT.add(text1);
        PLAIN_TEXT.add(text2);
        PLAIN_TEXT.add(text3);
        PLAIN_TEXT.add(text5);
        PLAIN_TEXT.add(text4);
        PLAIN_TEXT.add(text8);
        PLAIN_TEXT.add(text6);
        PLAIN_TEXT.add(text7);
        PLAIN_TEXT.add(text9);
        PLAIN_TEXT.add(text10);
        PLAIN_TEXT.add(text11);
    }
    
    @Override 
    public void addContainers() {
        CONTAINERS.add(container1);
        CONTAINERS.add(container2);
    }
    
    @Override
    public void initStyles() {
        informationIcon.setSize(50, 50);
        editIcon.setSize(30, 28);
        paintOneContainer(addButton, ChoosedPalette.getMidColor());
        Tools.setImageLabel(informationIcon, "src/com/assets/documento.png", 25, 25, ChoosedPalette.getWhite());
        Tools.setImageLabel(editIcon, "src/com/assets/agregar.png", 12, 10, ChoosedPalette.getWhite());
        Tools.setScroll(scroll);
        Tools.setScroll(scroll1);
    }
    
    @Override
    public void colorBasics() {
        paintAll();
        needBorder1.setBorder(new MatteBorder(0, 0, 1, 0, ChoosedPalette.getGray()));
        needBorder2.setBorder(new MatteBorder(0, 0, 1, 0, ChoosedPalette.getGray()));
        cancel.setForeground(ChoosedPalette.getDarkColor());
        paintOneContainer(cancelButton, ChoosedPalette.getDarkColor());
        content.setBackground(ChoosedPalette.getSecondaryBackground());
        content1.setBackground(ChoosedPalette.getSecondaryBackground());
    }
    
    @Override
    public void dark() {
        CONTAINERS.forEach(container -> {
            container.setkFillBackground(true);
            container.setkStartColor(ChoosedPalette.getPrimaryBackground());
            container.setkEndColor(ChoosedPalette.getPrimaryBackground());
            container.repaint();
        });
        
        paintOneContainer(container1, ChoosedPalette.getSecondaryBackground());
        paintOneContainer(container2, ChoosedPalette.getSecondaryBackground());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        kGradientPanel3 = new com.k33ptoo.components.KGradientPanel();
        informationIcon = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        text1 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        title2 = new javax.swing.JLabel();
        text10 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        title3 = new javax.swing.JLabel();
        text11 = new javax.swing.JLabel();
        addButton = new com.k33ptoo.components.KGradientPanel();
        editIcon = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cancelButton = new com.k33ptoo.components.KGradientPanel();
        cancel = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        container1 = new com.k33ptoo.components.KGradientPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        needBorder1 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        text2 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        text3 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        text4 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        text5 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        content = new javax.swing.JPanel();
        targetsAntes = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        container2 = new com.k33ptoo.components.KGradientPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        needBorder2 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        text6 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        text7 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        text8 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        text9 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        scroll1 = new javax.swing.JScrollPane();
        content1 = new javax.swing.JPanel();
        targetsDespues = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(976, 500));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(976, 500));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(100, 14));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(976, 14));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 976, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setMinimumSize(new java.awt.Dimension(14, 100));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(14, 300));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );

        add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setMinimumSize(new java.awt.Dimension(14, 100));
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(14, 300));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );

        add(jPanel3, java.awt.BorderLayout.LINE_END);

        jPanel4.setMinimumSize(new java.awt.Dimension(100, 14));
        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(976, 14));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 976, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel6.setMinimumSize(new java.awt.Dimension(100, 120));
        jPanel6.setOpaque(false);

        kGradientPanel3.setkBorderRadius(100);
        kGradientPanel3.setkEndColor(new java.awt.Color(69, 98, 255));
        kGradientPanel3.setkStartColor(new java.awt.Color(69, 98, 255));
        kGradientPanel3.setMaximumSize(new java.awt.Dimension(50, 50));
        kGradientPanel3.setMinimumSize(new java.awt.Dimension(50, 50));
        kGradientPanel3.setOpaque(false);
        kGradientPanel3.setLayout(new java.awt.BorderLayout());

        informationIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kGradientPanel3.add(informationIcon, java.awt.BorderLayout.CENTER);

        title1.setBackground(new java.awt.Color(0, 0, 0));
        title1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        title1.setForeground(new java.awt.Color(0, 0, 0));
        title1.setText("Radiografias de");

        text1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text1.setForeground(new java.awt.Color(153, 153, 153));
        text1.setText("Radiografias del paciente");

        jPanel30.setOpaque(false);
        jPanel30.setLayout(new java.awt.GridLayout(1, 0));

        jPanel31.setOpaque(false);

        title2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        title2.setText("Anterior");

        text10.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text10.setText("Radiografias antes del tratamiento");
        text10.setToolTipText("");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title2)
                .addGap(18, 18, 18)
                .addComponent(text10, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(text10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel30.add(jPanel31);

        jPanel32.setOpaque(false);

        title3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        title3.setText("Después");

        text11.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text11.setText("Radiografias después del tratamiento");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title3)
                .addGap(18, 18, 18)
                .addComponent(text11, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(text11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel30.add(jPanel32);

        addButton.setkEndColor(new java.awt.Color(0, 0, 0));
        addButton.setkStartColor(new java.awt.Color(0, 0, 0));
        addButton.setOpaque(false);
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });

        editIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Añadir radiografia");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout addButtonLayout = new javax.swing.GroupLayout(addButton);
        addButton.setLayout(addButtonLayout);
        addButtonLayout.setHorizontalGroup(
            addButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addButtonLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(editIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        addButtonLayout.setVerticalGroup(
            addButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        cancelButton.setkEndColor(new java.awt.Color(0, 0, 0));
        cancelButton.setkFillBackground(false);
        cancelButton.setkStartColor(new java.awt.Color(0, 0, 0));
        cancelButton.setOpaque(false);
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancel.setText("Cancelar");
        cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout cancelButtonLayout = new javax.swing.GroupLayout(cancelButton);
        cancelButton.setLayout(cancelButtonLayout);
        cancelButtonLayout.setHorizontalGroup(
            cancelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cancelButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancel, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );
        cancelButtonLayout.setVerticalGroup(
            cancelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cancelButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text1)
                            .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(title1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(text1))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel10.setMinimumSize(new java.awt.Dimension(7, 100));
        jPanel10.setOpaque(false);
        jPanel10.setPreferredSize(new java.awt.Dimension(7, 392));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 357, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel10, java.awt.BorderLayout.LINE_END);

        container1.setkEndColor(new java.awt.Color(204, 204, 204));
        container1.setkFillBackground(false);
        container1.setkStartColor(new java.awt.Color(204, 204, 204));
        container1.setOpaque(false);
        container1.setLayout(new java.awt.BorderLayout());

        jPanel12.setMinimumSize(new java.awt.Dimension(100, 40));
        jPanel12.setOpaque(false);
        jPanel12.setPreferredSize(new java.awt.Dimension(467, 40));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jPanel13.setMinimumSize(new java.awt.Dimension(16, 100));
        jPanel13.setOpaque(false);
        jPanel13.setPreferredSize(new java.awt.Dimension(16, 50));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel12.add(jPanel13, java.awt.BorderLayout.LINE_START);

        jPanel14.setMinimumSize(new java.awt.Dimension(16, 100));
        jPanel14.setOpaque(false);
        jPanel14.setPreferredSize(new java.awt.Dimension(16, 50));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel12.add(jPanel14, java.awt.BorderLayout.LINE_END);

        needBorder1.setBackground(new java.awt.Color(255, 255, 255));
        needBorder1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        needBorder1.setMinimumSize(new java.awt.Dimension(100, 35));
        needBorder1.setOpaque(false);
        needBorder1.setLayout(new java.awt.GridLayout(1, 0));

        jPanel42.setBackground(new java.awt.Color(255, 255, 255));
        jPanel42.setOpaque(false);

        text2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text2.setForeground(new java.awt.Color(153, 153, 153));
        text2.setText("Foto");

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text2)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(text2)
                .addContainerGap())
        );

        needBorder1.add(jPanel42);

        jPanel43.setBackground(new java.awt.Color(255, 255, 255));
        jPanel43.setOpaque(false);

        text3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text3.setForeground(new java.awt.Color(153, 153, 153));
        text3.setText("Nombre");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text3)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(text3)
                .addContainerGap())
        );

        needBorder1.add(jPanel43);

        jPanel39.setBackground(new java.awt.Color(255, 255, 255));
        jPanel39.setOpaque(false);

        text4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text4.setForeground(new java.awt.Color(153, 153, 153));
        text4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text4.setText("Se añadio");

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text4, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel39Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(text4)
                .addContainerGap())
        );

        needBorder1.add(jPanel39);

        jPanel44.setBackground(new java.awt.Color(255, 255, 255));
        jPanel44.setOpaque(false);

        text5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text5.setForeground(new java.awt.Color(153, 153, 153));
        text5.setText("Acciones");

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(text5)
                .addContainerGap())
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(text5)
                .addContainerGap())
        );

        needBorder1.add(jPanel44);

        jPanel12.add(needBorder1, java.awt.BorderLayout.CENTER);

        container1.add(jPanel12, java.awt.BorderLayout.PAGE_START);

        jPanel15.setOpaque(false);
        jPanel15.setLayout(new java.awt.BorderLayout());

        jPanel16.setMinimumSize(new java.awt.Dimension(16, 100));
        jPanel16.setOpaque(false);
        jPanel16.setPreferredSize(new java.awt.Dimension(16, 50));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel16, java.awt.BorderLayout.LINE_END);

        jPanel17.setMinimumSize(new java.awt.Dimension(16, 100));
        jPanel17.setOpaque(false);
        jPanel17.setPreferredSize(new java.awt.Dimension(16, 50));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel17, java.awt.BorderLayout.LINE_START);

        jPanel20.setOpaque(false);
        jPanel20.setLayout(new java.awt.BorderLayout());

        scroll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        scroll.setOpaque(false);

        content.setBackground(new java.awt.Color(255, 255, 255));

        targetsAntes.setOpaque(false);
        targetsAntes.setLayout(new javax.swing.BoxLayout(targetsAntes, javax.swing.BoxLayout.Y_AXIS));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(targetsAntes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addComponent(targetsAntes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 291, Short.MAX_VALUE))
        );

        scroll.setViewportView(content);

        jPanel20.add(scroll, java.awt.BorderLayout.CENTER);

        jPanel15.add(jPanel20, java.awt.BorderLayout.CENTER);

        jPanel18.setMinimumSize(new java.awt.Dimension(100, 14));
        jPanel18.setOpaque(false);
        jPanel18.setPreferredSize(new java.awt.Dimension(976, 14));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel18, java.awt.BorderLayout.PAGE_END);

        jPanel19.setMinimumSize(new java.awt.Dimension(100, 14));
        jPanel19.setOpaque(false);
        jPanel19.setPreferredSize(new java.awt.Dimension(976, 14));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel19, java.awt.BorderLayout.PAGE_START);

        container1.add(jPanel15, java.awt.BorderLayout.CENTER);

        jPanel8.add(container1, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel8);

        jPanel9.setOpaque(false);
        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel11.setMinimumSize(new java.awt.Dimension(7, 100));
        jPanel11.setOpaque(false);
        jPanel11.setPreferredSize(new java.awt.Dimension(7, 392));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 357, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel11, java.awt.BorderLayout.LINE_START);

        container2.setkEndColor(new java.awt.Color(204, 204, 204));
        container2.setkFillBackground(false);
        container2.setkStartColor(new java.awt.Color(204, 204, 204));
        container2.setOpaque(false);
        container2.setLayout(new java.awt.BorderLayout());

        jPanel21.setMinimumSize(new java.awt.Dimension(100, 40));
        jPanel21.setOpaque(false);
        jPanel21.setPreferredSize(new java.awt.Dimension(467, 40));
        jPanel21.setLayout(new java.awt.BorderLayout());

        jPanel22.setMinimumSize(new java.awt.Dimension(16, 100));
        jPanel22.setOpaque(false);
        jPanel22.setPreferredSize(new java.awt.Dimension(16, 50));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel21.add(jPanel22, java.awt.BorderLayout.LINE_START);

        jPanel23.setMinimumSize(new java.awt.Dimension(16, 100));
        jPanel23.setOpaque(false);
        jPanel23.setPreferredSize(new java.awt.Dimension(16, 50));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel21.add(jPanel23, java.awt.BorderLayout.LINE_END);

        needBorder2.setBackground(new java.awt.Color(255, 255, 255));
        needBorder2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        needBorder2.setMinimumSize(new java.awt.Dimension(100, 35));
        needBorder2.setOpaque(false);
        needBorder2.setLayout(new java.awt.GridLayout(1, 0));

        jPanel45.setBackground(new java.awt.Color(255, 255, 255));
        jPanel45.setOpaque(false);

        text6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text6.setForeground(new java.awt.Color(153, 153, 153));
        text6.setText("Foto");

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text6)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(text6)
                .addContainerGap())
        );

        needBorder2.add(jPanel45);

        jPanel46.setBackground(new java.awt.Color(255, 255, 255));
        jPanel46.setOpaque(false);

        text7.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text7.setForeground(new java.awt.Color(153, 153, 153));
        text7.setText("Nombre");

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text7)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel46Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(text7)
                .addContainerGap())
        );

        needBorder2.add(jPanel46);

        jPanel40.setBackground(new java.awt.Color(255, 255, 255));
        jPanel40.setOpaque(false);

        text8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text8.setForeground(new java.awt.Color(153, 153, 153));
        text8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text8.setText("Se añadio");

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text8, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(text8)
                .addContainerGap())
        );

        needBorder2.add(jPanel40);

        jPanel47.setBackground(new java.awt.Color(255, 255, 255));
        jPanel47.setOpaque(false);

        text9.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text9.setForeground(new java.awt.Color(153, 153, 153));
        text9.setText("Acciones");

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(text9)
                .addContainerGap())
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(text9)
                .addContainerGap())
        );

        needBorder2.add(jPanel47);

        jPanel21.add(needBorder2, java.awt.BorderLayout.CENTER);

        container2.add(jPanel21, java.awt.BorderLayout.PAGE_START);

        jPanel24.setOpaque(false);
        jPanel24.setLayout(new java.awt.BorderLayout());

        jPanel25.setMinimumSize(new java.awt.Dimension(16, 100));
        jPanel25.setOpaque(false);
        jPanel25.setPreferredSize(new java.awt.Dimension(16, 50));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );

        jPanel24.add(jPanel25, java.awt.BorderLayout.LINE_END);

        jPanel26.setMinimumSize(new java.awt.Dimension(16, 100));
        jPanel26.setOpaque(false);
        jPanel26.setPreferredSize(new java.awt.Dimension(16, 50));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );

        jPanel24.add(jPanel26, java.awt.BorderLayout.LINE_START);

        jPanel29.setOpaque(false);
        jPanel29.setLayout(new java.awt.BorderLayout());

        scroll1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        scroll1.setOpaque(false);

        content1.setBackground(new java.awt.Color(255, 255, 255));

        targetsDespues.setOpaque(false);
        targetsDespues.setLayout(new javax.swing.BoxLayout(targetsDespues, javax.swing.BoxLayout.Y_AXIS));

        javax.swing.GroupLayout content1Layout = new javax.swing.GroupLayout(content1);
        content1.setLayout(content1Layout);
        content1Layout.setHorizontalGroup(
            content1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(targetsDespues, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        content1Layout.setVerticalGroup(
            content1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content1Layout.createSequentialGroup()
                .addComponent(targetsDespues, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 291, Short.MAX_VALUE))
        );

        scroll1.setViewportView(content1);

        jPanel29.add(scroll1, java.awt.BorderLayout.CENTER);

        jPanel24.add(jPanel29, java.awt.BorderLayout.CENTER);

        jPanel27.setMinimumSize(new java.awt.Dimension(100, 14));
        jPanel27.setOpaque(false);
        jPanel27.setPreferredSize(new java.awt.Dimension(976, 14));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jPanel24.add(jPanel27, java.awt.BorderLayout.PAGE_END);

        jPanel28.setMinimumSize(new java.awt.Dimension(100, 14));
        jPanel28.setOpaque(false);
        jPanel28.setPreferredSize(new java.awt.Dimension(976, 14));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jPanel24.add(jPanel28, java.awt.BorderLayout.PAGE_START);

        container2.add(jPanel24, java.awt.BorderLayout.CENTER);

        jPanel9.add(container2, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel9);

        jPanel5.add(jPanel7, java.awt.BorderLayout.CENTER);

        add(jPanel5, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        ApplicationContext.addRadiografia.setVisible(true);
    }//GEN-LAST:event_addButtonMouseClicked

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        if (state.equals("Odontologia")) {
            ApplicationContext.pacienteProfile.addPanels(ApplicationContext.datosOdontologia, ApplicationContext.odontologiaDatos);
            ApplicationContext.paciente.mostrarPanel(ApplicationContext.pacienteProfile);
            ApplicationContext.odontologiaDatos.addTargets();
        } else {
            ApplicationContext.pacienteProfile.addPanels(ApplicationContext.datosOrtodoncia, ApplicationContext.ortodonciaDatos);
            ApplicationContext.paciente.mostrarPanel(ApplicationContext.pacienteProfile);
            ApplicationContext.ortodonciaDatos.addTargets();
        }
    }//GEN-LAST:event_cancelButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KGradientPanel addButton;
    private javax.swing.JLabel cancel;
    private com.k33ptoo.components.KGradientPanel cancelButton;
    private com.k33ptoo.components.KGradientPanel container1;
    private com.k33ptoo.components.KGradientPanel container2;
    private javax.swing.JPanel content;
    private javax.swing.JPanel content1;
    private javax.swing.JLabel editIcon;
    private javax.swing.JLabel informationIcon;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private com.k33ptoo.components.KGradientPanel kGradientPanel3;
    private javax.swing.JPanel needBorder1;
    private javax.swing.JPanel needBorder2;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JScrollPane scroll1;
    private javax.swing.JPanel targetsAntes;
    private javax.swing.JPanel targetsDespues;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text10;
    private javax.swing.JLabel text11;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel text4;
    private javax.swing.JLabel text5;
    private javax.swing.JLabel text6;
    private javax.swing.JLabel text7;
    private javax.swing.JLabel text8;
    private javax.swing.JLabel text9;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title3;
    // End of variables declaration//GEN-END:variables
}
