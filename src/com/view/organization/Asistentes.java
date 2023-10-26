package com.view.organization;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.helper.AsistenteHelper;
import com.utils.Styles;
import com.utils.Tools;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

/**
 *
 * @author Daniel Batres
 */
public class Asistentes extends Styles {

    /**
     * Creates new form Asistentes
     */
    public Asistentes() {
        initComponents();
        styleMyComponentBaby();
        setData();
    }
    
    public void setData() {
        ApplicationContext.asistentesListados.clear();
        ApplicationContext.asistentesListados = AsistenteHelper.listarAsistentes();
        
        if (ApplicationContext.asistentesListados.isEmpty()) {
            Tools.showPanel(container, ApplicationContext.sinResultados, 10, 10);
        } else {
            ApplicationContext.asistentesTable.listTargets();
            Tools.showPanel(container, ApplicationContext.asistentesTable, 10, 10);
        }
    }
    
    public void startLoading() {
        Tools.showPanel(container, ApplicationContext.pacientesTableLoading, 10, 10);
    }
    
    public void stopLoading(JPanel newContainer) {
        Tools.showPanel(container, newContainer, 10, 10);
    }
    
    @Override
    public void initStyles() {
        addAsistenteIcon.setSize(30, 28);
        Tools.setImageLabel(addAsistenteIcon, "src/com/assets/agregar.png", 12, 10, ChoosedPalette.getWhite());
        paintOneContainer(container1, ChoosedPalette.getMidColor());
        paintOnePanelRound(panelRound, ChoosedPalette.getMidColor());
        busquedaIcon.setSize(58, 34);
        Tools.setImageLabel(busquedaIcon, "src/com/assets/busqueda.png", 40, 16, ChoosedPalette.getWhite());
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
        PLAIN_TEXT.add(text5);
        PLAIN_TEXT.add(text6);
        PLAIN_TEXT.add(text7);
        PLAIN_TEXT.add(text8);
        PLAIN_TEXT.add(text9);
    }
    
    @Override
    public void addContainers() {
        CONTAINERS.add(container2);
        CONTAINERS.add(container4);
        CONTAINERS.add(container3);
    }
    
    @Override 
    public void addTextFields() {
        TEXTFIELDS.add(textField1); 
    }
    
    @Override
    public void colorBasics() {
        paintAll();
        needBorder.setBorder(new MatteBorder(0, 0, 1, 0, ChoosedPalette.getGray()));
        needBorder1.setBorder(new MatteBorder(0, 0, 1, 0, ChoosedPalette.getGray()));
    }
    
    @Override
    public void dark() {
        CONTAINERS.forEach(container -> {
            container.setkFillBackground(true);
            container.setkStartColor(ChoosedPalette.getPrimaryBackground());
            container.setkEndColor(ChoosedPalette.getPrimaryBackground());
            container.repaint();
        });
        
        container3.setkFillBackground(false);
        paintOneContainer(container3, ChoosedPalette.getGray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        needBorder = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        title1 = new javax.swing.JLabel();
        text1 = new javax.swing.JLabel();
        container1 = new com.k33ptoo.components.KGradientPanel();
        addAsistenteIcon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        container2 = new com.k33ptoo.components.KGradientPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        container3 = new com.k33ptoo.components.KGradientPanel();
        panelRound = new com.utils.PanelRound();
        busquedaIcon = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        textField1 = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        container4 = new com.k33ptoo.components.KGradientPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        needBorder1 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        text2 = new javax.swing.JLabel();
        text3 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        text4 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        text5 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        text6 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        text7 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        text8 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        text9 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        containerContent = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        container = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(1060, 569));
        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        needBorder.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        needBorder.setMinimumSize(new java.awt.Dimension(28, 100));
        needBorder.setOpaque(false);
        needBorder.setPreferredSize(new java.awt.Dimension(1060, 100));
        needBorder.setLayout(new java.awt.BorderLayout());

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setMinimumSize(new java.awt.Dimension(14, 100));
        jPanel15.setOpaque(false);
        jPanel15.setPreferredSize(new java.awt.Dimension(14, 150));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        needBorder.add(jPanel15, java.awt.BorderLayout.LINE_START);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setMinimumSize(new java.awt.Dimension(14, 100));
        jPanel16.setOpaque(false);
        jPanel16.setPreferredSize(new java.awt.Dimension(14, 150));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        needBorder.add(jPanel16, java.awt.BorderLayout.LINE_END);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setMinimumSize(new java.awt.Dimension(14, 14));
        jPanel17.setOpaque(false);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        needBorder.add(jPanel17, java.awt.BorderLayout.PAGE_START);

        jPanel3.setMaximumSize(new java.awt.Dimension(32767, 150));
        jPanel3.setMinimumSize(new java.awt.Dimension(0, 150));
        jPanel3.setOpaque(false);

        title1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        title1.setForeground(new java.awt.Color(0, 0, 0));
        title1.setText("Asistentes de la organización");

        text1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text1.setForeground(new java.awt.Color(153, 153, 153));
        text1.setText("Información y asistentes");

        container1.setkEndColor(new java.awt.Color(0, 0, 0));
        container1.setkStartColor(new java.awt.Color(0, 0, 0));
        container1.setMaximumSize(new java.awt.Dimension(180, 40));
        container1.setOpaque(false);
        container1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                container1MouseClicked(evt);
            }
        });

        addAsistenteIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addAsistenteIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nuevo asistente");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout container1Layout = new javax.swing.GroupLayout(container1);
        container1.setLayout(container1Layout);
        container1Layout.setHorizontalGroup(
            container1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(addAsistenteIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        container1Layout.setVerticalGroup(
            container1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(container1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addAsistenteIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(title1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(text1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 546, Short.MAX_VALUE)
                .addComponent(container1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(container1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(title1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text1)))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        needBorder.add(jPanel3, java.awt.BorderLayout.CENTER);

        add(needBorder, java.awt.BorderLayout.PAGE_START);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(100, 90));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(1060, 90));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMaximumSize(new java.awt.Dimension(14, 32767));
        jPanel4.setMinimumSize(new java.awt.Dimension(14, 100));
        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(14, 90));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, java.awt.BorderLayout.LINE_END);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setMaximumSize(new java.awt.Dimension(32767, 90));
        jPanel6.setMinimumSize(new java.awt.Dimension(0, 90));
        jPanel6.setOpaque(false);

        container2.setkBorderRadius(20);
        container2.setkEndColor(new java.awt.Color(204, 204, 204));
        container2.setkFillBackground(false);
        container2.setkStartColor(new java.awt.Color(204, 204, 204));
        container2.setMaximumSize(new java.awt.Dimension(1020, 70));
        container2.setMinimumSize(new java.awt.Dimension(1020, 70));
        container2.setOpaque(false);
        container2.setPreferredSize(new java.awt.Dimension(1026, 70));
        container2.setLayout(new javax.swing.BoxLayout(container2, javax.swing.BoxLayout.LINE_AXIS));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setMaximumSize(new java.awt.Dimension(300, 2147483647));
        jPanel5.setMinimumSize(new java.awt.Dimension(200, 60));
        jPanel5.setOpaque(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(200, 65));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setOpaque(false);
        jPanel9.setPreferredSize(new java.awt.Dimension(200, 12));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel9, java.awt.BorderLayout.PAGE_START);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setOpaque(false);
        jPanel8.setPreferredSize(new java.awt.Dimension(200, 12));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel8, java.awt.BorderLayout.PAGE_END);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setOpaque(false);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel10, java.awt.BorderLayout.LINE_START);

        container2.add(jPanel5);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setMinimumSize(new java.awt.Dimension(510, 65));
        jPanel7.setOpaque(false);
        jPanel7.setPreferredSize(new java.awt.Dimension(510, 65));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setOpaque(false);
        jPanel12.setPreferredSize(new java.awt.Dimension(820, 12));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel12, java.awt.BorderLayout.PAGE_END);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setOpaque(false);
        jPanel13.setPreferredSize(new java.awt.Dimension(820, 12));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel13, java.awt.BorderLayout.PAGE_START);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setOpaque(false);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel14, java.awt.BorderLayout.LINE_END);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setMaximumSize(new java.awt.Dimension(32767, 46));
        jPanel18.setMinimumSize(new java.awt.Dimension(0, 46));
        jPanel18.setOpaque(false);
        jPanel18.setLayout(new java.awt.BorderLayout());

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.setMaximumSize(new java.awt.Dimension(5, 32767));
        jPanel33.setMinimumSize(new java.awt.Dimension(5, 0));
        jPanel33.setOpaque(false);
        jPanel33.setPreferredSize(new java.awt.Dimension(5, 40));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        jPanel18.add(jPanel33, java.awt.BorderLayout.LINE_START);

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));
        jPanel34.setOpaque(false);

        container3.setBackground(new java.awt.Color(255, 255, 255));
        container3.setkEndColor(new java.awt.Color(0, 0, 0));
        container3.setkFillBackground(false);
        container3.setkStartColor(new java.awt.Color(0, 0, 0));
        container3.setMaximumSize(new java.awt.Dimension(2147483647, 44));
        container3.setMinimumSize(new java.awt.Dimension(320, 0));
        container3.setOpaque(false);
        container3.setPreferredSize(new java.awt.Dimension(319, 44));
        container3.setLayout(new java.awt.BorderLayout());

        panelRound.setBackground(new java.awt.Color(0, 0, 0));
        panelRound.setMaximumSize(new java.awt.Dimension(75, 32767));
        panelRound.setMinimumSize(new java.awt.Dimension(75, 100));
        panelRound.setPreferredSize(new java.awt.Dimension(75, 46));
        panelRound.setRoundBottomRight(15);
        panelRound.setRoundTopRight(15);
        panelRound.setLayout(new java.awt.BorderLayout());

        busquedaIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelRound.add(busquedaIcon, java.awt.BorderLayout.CENTER);

        container3.add(panelRound, java.awt.BorderLayout.LINE_END);

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));
        jPanel35.setOpaque(false);

        textField1.setBackground(new java.awt.Color(255, 255, 255));
        textField1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        textField1.setForeground(new java.awt.Color(102, 102, 102));
        textField1.setText("Busca asistentes");
        textField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        textField1.setMaximumSize(new java.awt.Dimension(2147483647, 34));
        textField1.setMinimumSize(new java.awt.Dimension(3, 34));
        textField1.setOpaque(false);
        textField1.setPreferredSize(new java.awt.Dimension(96, 34));
        textField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textField1MouseClicked(evt);
            }
        });
        textField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 245, Short.MAX_VALUE)
            .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                    .addContainerGap(7, Short.MAX_VALUE)
                    .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(8, Short.MAX_VALUE)))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
            .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(textField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
        );

        container3.add(jPanel35, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addContainerGap(480, Short.MAX_VALUE)
                .addComponent(container3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(container3, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
        );

        jPanel18.add(jPanel34, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel18, java.awt.BorderLayout.CENTER);

        container2.add(jPanel7);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(container2, javax.swing.GroupLayout.DEFAULT_SIZE, 1020, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(container2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setMaximumSize(new java.awt.Dimension(14, 90));
        jPanel19.setMinimumSize(new java.awt.Dimension(14, 90));
        jPanel19.setOpaque(false);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel19, java.awt.BorderLayout.LINE_START);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel11.setOpaque(false);
        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setMaximumSize(new java.awt.Dimension(16, 90));
        jPanel20.setMinimumSize(new java.awt.Dimension(16, 90));
        jPanel20.setOpaque(false);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 347, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel20, java.awt.BorderLayout.LINE_START);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setMaximumSize(new java.awt.Dimension(16, 32767));
        jPanel21.setMinimumSize(new java.awt.Dimension(16, 100));
        jPanel21.setOpaque(false);
        jPanel21.setPreferredSize(new java.awt.Dimension(16, 90));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 347, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel21, java.awt.BorderLayout.LINE_END);

        jPanel22.setMinimumSize(new java.awt.Dimension(100, 16));
        jPanel22.setOpaque(false);
        jPanel22.setPreferredSize(new java.awt.Dimension(1060, 16));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel22, java.awt.BorderLayout.PAGE_END);

        jPanel23.setMinimumSize(new java.awt.Dimension(100, 16));
        jPanel23.setOpaque(false);
        jPanel23.setPreferredSize(new java.awt.Dimension(1060, 16));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel23, java.awt.BorderLayout.PAGE_START);

        container4.setkEndColor(new java.awt.Color(204, 204, 204));
        container4.setkFillBackground(false);
        container4.setkStartColor(new java.awt.Color(204, 204, 204));
        container4.setOpaque(false);
        container4.setLayout(new java.awt.BorderLayout());

        jPanel24.setMinimumSize(new java.awt.Dimension(100, 40));
        jPanel24.setOpaque(false);
        jPanel24.setPreferredSize(new java.awt.Dimension(1060, 40));
        jPanel24.setLayout(new java.awt.BorderLayout());

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setMaximumSize(new java.awt.Dimension(14, 90));
        jPanel29.setMinimumSize(new java.awt.Dimension(14, 90));
        jPanel29.setOpaque(false);

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel24.add(jPanel29, java.awt.BorderLayout.LINE_START);

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setMaximumSize(new java.awt.Dimension(14, 32767));
        jPanel30.setMinimumSize(new java.awt.Dimension(14, 100));
        jPanel30.setOpaque(false);
        jPanel30.setPreferredSize(new java.awt.Dimension(14, 90));

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

        jPanel24.add(jPanel30, java.awt.BorderLayout.LINE_END);

        needBorder1.setOpaque(false);
        needBorder1.setLayout(new java.awt.GridLayout(1, 0));

        jPanel31.setOpaque(false);

        text2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text2.setForeground(new java.awt.Color(153, 153, 153));
        text2.setText("Foto");

        text3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text3.setForeground(new java.awt.Color(153, 153, 153));
        text3.setText("Nombre completo");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(text3, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(text3, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addContainerGap())
        );

        needBorder1.add(jPanel31);

        jPanel32.setOpaque(false);
        jPanel32.setLayout(new java.awt.GridLayout(1, 0));

        jPanel37.setOpaque(false);

        text4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text4.setForeground(new java.awt.Color(153, 153, 153));
        text4.setText("Edad");

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text4, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text4, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel32.add(jPanel37);

        jPanel38.setOpaque(false);

        text5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text5.setForeground(new java.awt.Color(153, 153, 153));
        text5.setText("Género");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text5, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text5, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel32.add(jPanel38);

        jPanel39.setOpaque(false);

        text6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text6.setForeground(new java.awt.Color(153, 153, 153));
        text6.setText("Contacto");

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text6, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text6, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel32.add(jPanel39);

        jPanel40.setOpaque(false);

        text7.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text7.setForeground(new java.awt.Color(153, 153, 153));
        text7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text7.setText("ID ");

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text7, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text7, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel32.add(jPanel40);

        needBorder1.add(jPanel32);

        jPanel36.setOpaque(false);
        jPanel36.setLayout(new java.awt.GridLayout(1, 0));

        jPanel41.setOpaque(false);

        text8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text8.setForeground(new java.awt.Color(153, 153, 153));
        text8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text8.setText("Estado");

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text8, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text8, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel36.add(jPanel41);

        jPanel42.setOpaque(false);

        text9.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text9.setForeground(new java.awt.Color(153, 153, 153));
        text9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        text9.setText("Acciones");

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text9, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text9, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel36.add(jPanel42);

        needBorder1.add(jPanel36);

        jPanel24.add(needBorder1, java.awt.BorderLayout.CENTER);

        container4.add(jPanel24, java.awt.BorderLayout.PAGE_START);

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setMaximumSize(new java.awt.Dimension(14, 90));
        jPanel25.setMinimumSize(new java.awt.Dimension(14, 90));
        jPanel25.setOpaque(false);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 291, Short.MAX_VALUE)
        );

        container4.add(jPanel25, java.awt.BorderLayout.LINE_START);

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setMaximumSize(new java.awt.Dimension(14, 32767));
        jPanel26.setMinimumSize(new java.awt.Dimension(14, 100));
        jPanel26.setOpaque(false);
        jPanel26.setPreferredSize(new java.awt.Dimension(14, 90));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 291, Short.MAX_VALUE)
        );

        container4.add(jPanel26, java.awt.BorderLayout.LINE_END);

        jPanel27.setMinimumSize(new java.awt.Dimension(100, 16));
        jPanel27.setOpaque(false);
        jPanel27.setPreferredSize(new java.awt.Dimension(1060, 16));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1028, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        container4.add(jPanel27, java.awt.BorderLayout.PAGE_END);

        containerContent.setOpaque(false);
        containerContent.setLayout(new java.awt.BorderLayout());

        jPanel28.setMinimumSize(new java.awt.Dimension(100, 10));
        jPanel28.setOpaque(false);
        jPanel28.setPreferredSize(new java.awt.Dimension(1060, 10));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        containerContent.add(jPanel28, java.awt.BorderLayout.PAGE_START);

        container.setOpaque(false);
        container.setLayout(new java.awt.GridLayout(1, 0));
        containerContent.add(container, java.awt.BorderLayout.CENTER);

        container4.add(containerContent, java.awt.BorderLayout.CENTER);

        jPanel11.add(container4, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel11, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void container1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_container1MouseClicked
        ApplicationContext.mainInterface.mostrarPanel(ApplicationContext.nuevoAsistente);
        ApplicationContext.mainInterface.changeTitle("Nuevo Asistente");
    }//GEN-LAST:event_container1MouseClicked

    private void textField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField1MouseClicked
        if (textField1.getText().contains("Busca")) {
            textField1.setText("");
        }
    }//GEN-LAST:event_textField1MouseClicked

    private void textField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField1KeyTyped
        startLoading();
        ApplicationContext.asistentesListados.clear();
        ApplicationContext.asistentesListados = AsistenteHelper.listarAsistentesLike(textField1.getText() + evt.getKeyChar());

        Tools.setTimeout(() -> {
            if (ApplicationContext.asistentesListados.isEmpty()) {
                Tools.showPanel(container, ApplicationContext.sinResultados, 10, 10);
            } else {
                ApplicationContext.asistentesTable.listTargets();
                Tools.showPanel(container, ApplicationContext.asistentesTable, 10, 10);
                ApplicationContext.asistentesTargets.forEach(target -> target.colorComponent(ApplicationContext.selectedAppereance));
            }
        }, 500);
    }//GEN-LAST:event_textField1KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addAsistenteIcon;
    private javax.swing.JLabel busquedaIcon;
    private javax.swing.JPanel container;
    private com.k33ptoo.components.KGradientPanel container1;
    private com.k33ptoo.components.KGradientPanel container2;
    private com.k33ptoo.components.KGradientPanel container3;
    private com.k33ptoo.components.KGradientPanel container4;
    private javax.swing.JPanel containerContent;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel needBorder;
    private javax.swing.JPanel needBorder1;
    private com.utils.PanelRound panelRound;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel text4;
    private javax.swing.JLabel text5;
    private javax.swing.JLabel text6;
    private javax.swing.JLabel text7;
    private javax.swing.JLabel text8;
    private javax.swing.JLabel text9;
    private javax.swing.JTextField textField1;
    private javax.swing.JLabel title1;
    // End of variables declaration//GEN-END:variables
}
