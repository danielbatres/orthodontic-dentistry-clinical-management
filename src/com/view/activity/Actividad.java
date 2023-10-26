package com.view.activity;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.helper.ActividadHelper;
import com.utils.Styles;
import com.utils.Tools;
import javax.swing.border.MatteBorder;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 18/09/22
 */
public class Actividad extends Styles {
    
    /**
     * Creates new form Actividad
     */
    public Actividad() {
        initComponents();
        styleMyComponentBaby();
        setData();
    }
    
    public void setData() {
        ApplicationContext.actividadesListadas = ActividadHelper.listarActividad();
        ApplicationContext.actividadTableLog.listTargets();
        Tools.showPanel(container, ApplicationContext.actividadTableLog, 10, 10);
    }

    @Override
    public void addPlainText() {
        PLAIN_TEXT.add(text2);
        PLAIN_TEXT.add(text3);
        PLAIN_TEXT.add(text8);
        PLAIN_TEXT.add(text9);
    }

    @Override
    public void addContainers() {
        CONTAINERS.add(container2);
        CONTAINERS.add(container1);
        CONTAINERS.add(container3);
    }

    @Override
    public void initStyles() {
        busquedaIcon.setSize(58, 34);
        setIcons();
        paintOnePanelRound(panelRound, ChoosedPalette.getMidColor());
        paintOnePanelRound(panelRound, ChoosedPalette.getMidColor());
    }
    
    @Override
    public void colorBasics() {
        paintAll();
        container2.setkFillBackground(true);
        textField1.setBorder(new MatteBorder(1, 0, 1, 0, ChoosedPalette.getGray()));
        needBorder.setBorder(new MatteBorder(0, 0, 1, 0, ChoosedPalette.getGray()));
    }
    
    @Override
    public void dark() {
        CONTAINERS.forEach(containerC -> {
            containerC.setkFillBackground(true);
            containerC.setkStartColor(ChoosedPalette.getPrimaryBackground());
            containerC.setkEndColor(ChoosedPalette.getPrimaryBackground());
            containerC.repaint();
        });
        
        container2.setkFillBackground(false);
        paintOneContainer(container2, ChoosedPalette.getGray());
    }
    
    private void setIcons() {
        Tools.setImageLabel(busquedaIcon, "src/com/assets/busqueda.png", 40, 16, ChoosedPalette.getWhite());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        container1 = new com.k33ptoo.components.KGradientPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        container2 = new com.k33ptoo.components.KGradientPanel();
        panelRound = new com.utils.PanelRound();
        busquedaIcon = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        textField1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        container3 = new com.k33ptoo.components.KGradientPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        needBorder = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        text2 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        text3 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        text8 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        text9 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        container = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1060, 569));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1060, 569));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(100, 90));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1060, 90));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(14, 32767));
        jPanel3.setMinimumSize(new java.awt.Dimension(14, 100));
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(14, 90));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_END);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setMaximumSize(new java.awt.Dimension(32767, 90));
        jPanel6.setMinimumSize(new java.awt.Dimension(0, 90));
        jPanel6.setOpaque(false);

        container1.setkBorderRadius(20);
        container1.setkEndColor(new java.awt.Color(204, 204, 204));
        container1.setkFillBackground(false);
        container1.setkStartColor(new java.awt.Color(204, 204, 204));
        container1.setMaximumSize(new java.awt.Dimension(1020, 70));
        container1.setMinimumSize(new java.awt.Dimension(1020, 70));
        container1.setOpaque(false);
        container1.setPreferredSize(new java.awt.Dimension(1026, 70));
        container1.setLayout(new javax.swing.BoxLayout(container1, javax.swing.BoxLayout.LINE_AXIS));

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

        container1.add(jPanel5);

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

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setMaximumSize(new java.awt.Dimension(32767, 46));
        jPanel15.setMinimumSize(new java.awt.Dimension(0, 46));
        jPanel15.setOpaque(false);
        jPanel15.setLayout(new java.awt.BorderLayout());

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

        jPanel15.add(jPanel33, java.awt.BorderLayout.LINE_START);

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));
        jPanel34.setOpaque(false);

        container2.setBackground(new java.awt.Color(255, 255, 255));
        container2.setkEndColor(new java.awt.Color(0, 0, 0));
        container2.setkFillBackground(false);
        container2.setkStartColor(new java.awt.Color(0, 0, 0));
        container2.setMaximumSize(new java.awt.Dimension(2147483647, 44));
        container2.setMinimumSize(new java.awt.Dimension(320, 0));
        container2.setOpaque(false);
        container2.setPreferredSize(new java.awt.Dimension(319, 44));
        container2.setLayout(new java.awt.BorderLayout());

        panelRound.setBackground(new java.awt.Color(0, 0, 0));
        panelRound.setMaximumSize(new java.awt.Dimension(75, 32767));
        panelRound.setMinimumSize(new java.awt.Dimension(75, 100));
        panelRound.setPreferredSize(new java.awt.Dimension(75, 46));
        panelRound.setRoundBottomRight(15);
        panelRound.setRoundTopRight(15);
        panelRound.setLayout(new java.awt.BorderLayout());

        busquedaIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelRound.add(busquedaIcon, java.awt.BorderLayout.CENTER);

        container2.add(panelRound, java.awt.BorderLayout.LINE_END);

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));
        jPanel35.setOpaque(false);

        textField1.setBackground(new java.awt.Color(255, 255, 255));
        textField1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        textField1.setForeground(new java.awt.Color(102, 102, 102));
        textField1.setText("Busca actividad");
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
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
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

        container2.add(jPanel35, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addContainerGap(480, Short.MAX_VALUE)
                .addComponent(container2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(container2, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
        );

        jPanel15.add(jPanel34, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel15, java.awt.BorderLayout.CENTER);

        container1.add(jPanel7);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(container1, javax.swing.GroupLayout.DEFAULT_SIZE, 1020, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(container1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMaximumSize(new java.awt.Dimension(14, 90));
        jPanel4.setMinimumSize(new java.awt.Dimension(14, 90));
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
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, java.awt.BorderLayout.LINE_START);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 503));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setMaximumSize(new java.awt.Dimension(14, 32767));
        jPanel16.setMinimumSize(new java.awt.Dimension(14, 100));
        jPanel16.setOpaque(false);
        jPanel16.setPreferredSize(new java.awt.Dimension(14, 90));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel16, java.awt.BorderLayout.LINE_END);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setMaximumSize(new java.awt.Dimension(14, 90));
        jPanel17.setMinimumSize(new java.awt.Dimension(14, 90));
        jPanel17.setOpaque(false);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel17, java.awt.BorderLayout.LINE_START);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setOpaque(false);
        jPanel18.setPreferredSize(new java.awt.Dimension(200, 12));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel18, java.awt.BorderLayout.PAGE_START);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setOpaque(false);
        jPanel19.setPreferredSize(new java.awt.Dimension(820, 12));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel19, java.awt.BorderLayout.PAGE_END);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setOpaque(false);

        container3.setkBorderRadius(20);
        container3.setkEndColor(new java.awt.Color(204, 204, 204));
        container3.setkFillBackground(false);
        container3.setkStartColor(new java.awt.Color(204, 204, 204));
        container3.setOpaque(false);
        container3.setPreferredSize(new java.awt.Dimension(0, 467));
        container3.setLayout(new java.awt.BorderLayout());

        jPanel21.setOpaque(false);
        jPanel21.setPreferredSize(new java.awt.Dimension(0, 40));
        jPanel21.setLayout(new java.awt.BorderLayout());

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setMaximumSize(new java.awt.Dimension(20, 40));
        jPanel23.setMinimumSize(new java.awt.Dimension(20, 40));
        jPanel23.setOpaque(false);
        jPanel23.setPreferredSize(new java.awt.Dimension(20, 40));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel21.add(jPanel23, java.awt.BorderLayout.LINE_END);

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setOpaque(false);
        jPanel24.setPreferredSize(new java.awt.Dimension(20, 40));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel21.add(jPanel24, java.awt.BorderLayout.LINE_START);

        needBorder.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        needBorder.setOpaque(false);
        needBorder.setLayout(new java.awt.GridLayout(1, 0));

        jPanel26.setOpaque(false);

        text2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text2.setForeground(new java.awt.Color(153, 153, 153));
        text2.setText("Nombre");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text2, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        needBorder.add(jPanel26);

        jPanel27.setOpaque(false);
        jPanel27.setLayout(new java.awt.GridLayout(1, 0));

        jPanel38.setOpaque(false);

        text3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text3.setForeground(new java.awt.Color(153, 153, 153));
        text3.setText("Actividad");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text3, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text3, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel27.add(jPanel38);

        jPanel39.setOpaque(false);

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        jPanel27.add(jPanel39);

        jPanel40.setOpaque(false);

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        jPanel27.add(jPanel40);

        needBorder.add(jPanel27);

        jPanel28.setOpaque(false);
        jPanel28.setLayout(new java.awt.GridLayout(1, 0));

        jPanel43.setOpaque(false);

        text8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text8.setForeground(new java.awt.Color(153, 153, 153));
        text8.setText("Fecha");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text8, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text8, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel28.add(jPanel43);

        jPanel44.setOpaque(false);

        text9.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text9.setForeground(new java.awt.Color(153, 153, 153));
        text9.setText("Hora");

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text9, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text9, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel28.add(jPanel44);

        needBorder.add(jPanel28);

        jPanel21.add(needBorder, java.awt.BorderLayout.CENTER);

        container3.add(jPanel21, java.awt.BorderLayout.PAGE_START);

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setOpaque(false);
        jPanel22.setPreferredSize(new java.awt.Dimension(0, 427));
        jPanel22.setLayout(new java.awt.BorderLayout());

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setOpaque(false);
        jPanel29.setPreferredSize(new java.awt.Dimension(14, 379));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
        );

        jPanel22.add(jPanel29, java.awt.BorderLayout.LINE_END);

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setOpaque(false);
        jPanel30.setPreferredSize(new java.awt.Dimension(14, 403));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 403, Short.MAX_VALUE)
        );

        jPanel22.add(jPanel30, java.awt.BorderLayout.LINE_START);

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setOpaque(false);
        jPanel31.setPreferredSize(new java.awt.Dimension(200, 12));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel22.add(jPanel31, java.awt.BorderLayout.PAGE_START);

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setOpaque(false);
        jPanel32.setPreferredSize(new java.awt.Dimension(820, 12));

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel22.add(jPanel32, java.awt.BorderLayout.PAGE_END);

        container.setOpaque(false);
        container.setLayout(new java.awt.GridLayout(1, 0));
        jPanel22.add(container, java.awt.BorderLayout.CENTER);

        container3.add(jPanel22, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(container3, javax.swing.GroupLayout.DEFAULT_SIZE, 1020, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(container3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel20, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void textField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField1KeyTyped
        ApplicationContext.actividadesListadas.clear();
        ApplicationContext.actividadesListadas = ActividadHelper.listarActividadLike(textField1.getText() + evt.getKeyChar());
        
        Tools.setTimeout(() -> {
            if (ApplicationContext.actividadesListadas.isEmpty()) {
                Tools.showPanel(container, ApplicationContext.sinResultados, 10, 10);
            } else {
                ApplicationContext.actividadTableLog.listTargets();
                Tools.showPanel(container, ApplicationContext.actividadTableLog, 10, 10);
                ApplicationContext.actividadTargetsLog.forEach(target -> target.colorComponent(ApplicationContext.selectedAppereance));
            }
        }, 500);
    }//GEN-LAST:event_textField1KeyTyped

    private void textField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField1MouseClicked
        if (textField1.getText().contains("Busca")) {
            textField1.setText("");
        }
    }//GEN-LAST:event_textField1MouseClicked

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel busquedaIcon;
    private javax.swing.JPanel container;
    private com.k33ptoo.components.KGradientPanel container1;
    private com.k33ptoo.components.KGradientPanel container2;
    private com.k33ptoo.components.KGradientPanel container3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
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
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel needBorder;
    private com.utils.PanelRound panelRound;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel text8;
    private javax.swing.JLabel text9;
    private javax.swing.JTextField textField1;
    // End of variables declaration//GEN-END:variables

    
}
