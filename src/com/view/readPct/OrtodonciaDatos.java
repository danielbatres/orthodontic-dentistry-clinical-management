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
 * @version 1.0.0
 * @since 18/09/22
 */
public class OrtodonciaDatos extends Styles {

    /**
     * Creates new form OrtodonciaDatos
     */
    public OrtodonciaDatos() {
        initComponents();
        styleMyComponentBaby();
    }
    
    @Override
    public void addTitlesAndSubtitles() {
        TITLES_AND_SUBTITLES.add(title1);
        TITLES_AND_SUBTITLES.add(title2);
        TITLES_AND_SUBTITLES.add(title3);
        TITLES_AND_SUBTITLES.add(title4);
    }

    @Override
    public void addPlainText() {
        PLAIN_TEXT.add(text1);
        PLAIN_TEXT.add(text2);
        PLAIN_TEXT.add(text3);
        PLAIN_TEXT.add(text4);
        PLAIN_TEXT.add(text5);
        PLAIN_TEXT.add(text6);
    }

    @Override
    public void addContainers() {
        CONTAINERS.add(container1);
        CONTAINERS.add(container2);
    }

    @Override
    public void initStyles() {
        addIcon.setSize(30, 28);
        setIcons();
        Tools.setScroll(scrollPanel);
    }
    
    public void addTargets() {
        if (ApplicationContext.selectedPacient.isTratamientoOrtodontico()) {
            radiografiasTargets.removeAll();
            ApplicationContext.radiografiasListadas.clear();
            ApplicationContext.radiografiasTargets.clear();
            ApplicationContext.radiografiasListadas = RadiografiaHelper.getRadiografias("ortodoncia", ApplicationContext.selectedPacient.getFichaOrtodoncia().getId());
            
            ApplicationContext.radiografiasListadas.forEach(radiografia -> {
                ApplicationContext.radiografiasTargets.add(new RadiografiaTarget(radiografia, "front"));
            });
            
            ApplicationContext.radiografiasTargets.forEach(target -> {
                radiografiasTargets.add(target);
                
                target.colorComponent(ApplicationContext.selectedAppereance);
            });
            
            SwingUtilities.updateComponentTreeUI(this);
        }
    }
    
    private void setIcons() {
        Tools.setImageLabel(addIcon, "src/com/assets/agregar.png", 12, 10, ChoosedPalette.getDarkColor());
    }
     
    @Override
    public void colorBasics() {
        needBorder.setBorder(new MatteBorder(0, 0, 1, 0, ChoosedPalette.getGray()));
        paintOneContainer(buttonContainer1, ChoosedPalette.getDarkColor());
        paintOneContainer(buttonContainer2, ChoosedPalette.getDarkColor());
        paint.setBackground(ChoosedPalette.getSecondaryBackground());
        paintAll();
        setIcons();
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
        jPanel4 = new javax.swing.JPanel();
        container2 = new com.k33ptoo.components.KGradientPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        title2 = new javax.swing.JLabel();
        text6 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        buttonContainer2 = new com.k33ptoo.components.KGradientPanel();
        title4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        container1 = new com.k33ptoo.components.KGradientPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        title1 = new javax.swing.JLabel();
        text1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        buttonContainer1 = new com.k33ptoo.components.KGradientPanel();
        title3 = new javax.swing.JLabel();
        addIcon = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        needBorder = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        text2 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        text3 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        text4 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        text5 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        scrollPanel = new javax.swing.JScrollPane();
        paint = new javax.swing.JPanel();
        radiografiasTargets = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(467, 432));
        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(100, 120));
        jPanel1.setName(""); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(467, 120));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(467, 7));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        container2.setkEndColor(new java.awt.Color(204, 204, 204));
        container2.setkFillBackground(false);
        container2.setkStartColor(new java.awt.Color(204, 204, 204));
        container2.setOpaque(false);
        container2.setLayout(new java.awt.BorderLayout());

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setMinimumSize(new java.awt.Dimension(14, 100));
        jPanel18.setOpaque(false);
        jPanel18.setPreferredSize(new java.awt.Dimension(14, 150));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container2.add(jPanel18, java.awt.BorderLayout.LINE_START);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setMinimumSize(new java.awt.Dimension(14, 14));
        jPanel19.setOpaque(false);

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

        container2.add(jPanel19, java.awt.BorderLayout.PAGE_END);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setMinimumSize(new java.awt.Dimension(14, 14));
        jPanel20.setOpaque(false);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        container2.add(jPanel20, java.awt.BorderLayout.PAGE_START);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setMinimumSize(new java.awt.Dimension(14, 100));
        jPanel21.setOpaque(false);
        jPanel21.setPreferredSize(new java.awt.Dimension(14, 150));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container2.add(jPanel21, java.awt.BorderLayout.LINE_END);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jPanel13.setOpaque(false);

        title2.setBackground(new java.awt.Color(0, 0, 0));
        title2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        title2.setForeground(new java.awt.Color(0, 0, 0));
        title2.setText("Control mensual");

        text6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text6.setForeground(new java.awt.Color(153, 153, 153));
        text6.setText("Ver control mensual del paciente");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text6)
                    .addComponent(title2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(title2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text6)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel13);

        jPanel22.setOpaque(false);

        buttonContainer2.setBackground(new java.awt.Color(255, 255, 255));
        buttonContainer2.setkEndColor(new java.awt.Color(0, 0, 0));
        buttonContainer2.setkFillBackground(false);
        buttonContainer2.setkStartColor(new java.awt.Color(0, 0, 0));
        buttonContainer2.setMaximumSize(new java.awt.Dimension(32767, 40));
        buttonContainer2.setOpaque(false);

        title4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        title4.setForeground(new java.awt.Color(0, 0, 0));
        title4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title4.setText("Ver control mensual");
        title4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        title4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                title4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout buttonContainer2Layout = new javax.swing.GroupLayout(buttonContainer2);
        buttonContainer2.setLayout(buttonContainer2Layout);
        buttonContainer2Layout.setHorizontalGroup(
            buttonContainer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title4, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        buttonContainer2Layout.setVerticalGroup(
            buttonContainer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonContainer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(buttonContainer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel22);

        container2.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel1.add(container2, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setOpaque(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(467, 7));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, java.awt.BorderLayout.PAGE_END);

        container1.setkEndColor(new java.awt.Color(204, 204, 204));
        container1.setkFillBackground(false);
        container1.setkStartColor(new java.awt.Color(204, 204, 204));
        container1.setOpaque(false);
        container1.setLayout(new java.awt.BorderLayout());

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setMinimumSize(new java.awt.Dimension(14, 14));
        jPanel17.setOpaque(false);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        container1.add(jPanel17, java.awt.BorderLayout.PAGE_START);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setMinimumSize(new java.awt.Dimension(14, 14));
        jPanel16.setOpaque(false);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        container1.add(jPanel16, java.awt.BorderLayout.PAGE_END);

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
            .addGap(0, 277, Short.MAX_VALUE)
        );

        container1.add(jPanel15, java.awt.BorderLayout.LINE_START);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setMinimumSize(new java.awt.Dimension(14, 100));
        jPanel14.setOpaque(false);
        jPanel14.setPreferredSize(new java.awt.Dimension(14, 150));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        container1.add(jPanel14, java.awt.BorderLayout.LINE_END);

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel7.setMinimumSize(new java.awt.Dimension(100, 110));
        jPanel7.setOpaque(false);
        jPanel7.setPreferredSize(new java.awt.Dimension(449, 110));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel9.setOpaque(false);
        jPanel9.setLayout(new java.awt.GridLayout(1, 0));

        jPanel10.setOpaque(false);

        title1.setBackground(new java.awt.Color(0, 0, 0));
        title1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        title1.setForeground(new java.awt.Color(0, 0, 0));
        title1.setText("Radiografías ");

        text1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text1.setForeground(new java.awt.Color(153, 153, 153));
        text1.setText("Radiografías ortodoncia del paciente");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(title1)
                        .addGap(0, 89, Short.MAX_VALUE))
                    .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text1)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel9.add(jPanel10);

        jPanel11.setOpaque(false);

        buttonContainer1.setBackground(new java.awt.Color(255, 255, 255));
        buttonContainer1.setkEndColor(new java.awt.Color(0, 0, 0));
        buttonContainer1.setkFillBackground(false);
        buttonContainer1.setkStartColor(new java.awt.Color(0, 0, 0));
        buttonContainer1.setMaximumSize(new java.awt.Dimension(32767, 40));
        buttonContainer1.setOpaque(false);
        buttonContainer1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonContainer1MouseClicked(evt);
            }
        });

        title3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        title3.setForeground(new java.awt.Color(0, 0, 0));
        title3.setText("Agregar radiografía");
        title3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        addIcon.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        addIcon.setForeground(new java.awt.Color(0, 0, 0));
        addIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout buttonContainer1Layout = new javax.swing.GroupLayout(buttonContainer1);
        buttonContainer1.setLayout(buttonContainer1Layout);
        buttonContainer1Layout.setHorizontalGroup(
            buttonContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonContainer1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title3)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        buttonContainer1Layout.setVerticalGroup(
            buttonContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonContainer1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(title3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonContainer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(buttonContainer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        jPanel9.add(jPanel11);

        jPanel7.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel8.setBackground(new java.awt.Color(255, 102, 51));
        jPanel8.setOpaque(false);
        jPanel8.setPreferredSize(new java.awt.Dimension(449, 40));
        jPanel8.setLayout(new java.awt.BorderLayout());

        needBorder.setBackground(new java.awt.Color(255, 255, 255));
        needBorder.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        needBorder.setMinimumSize(new java.awt.Dimension(100, 35));
        needBorder.setOpaque(false);
        needBorder.setLayout(new java.awt.GridLayout(1, 0));

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
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text2)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        needBorder.add(jPanel42);

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
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text3)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        needBorder.add(jPanel43);

        jPanel39.setBackground(new java.awt.Color(255, 255, 255));
        jPanel39.setOpaque(false);

        text4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text4.setForeground(new java.awt.Color(153, 153, 153));
        text4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text4.setText("Tipo");

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text4, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text4)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        needBorder.add(jPanel39);

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
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(text5)
                .addContainerGap())
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text5)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        needBorder.add(jPanel44);

        jPanel8.add(needBorder, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel8, java.awt.BorderLayout.PAGE_END);

        jPanel6.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jPanel25.setOpaque(false);
        jPanel25.setLayout(new java.awt.BorderLayout());

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setMaximumSize(new java.awt.Dimension(32767, 10));
        jPanel26.setMinimumSize(new java.awt.Dimension(14, 10));
        jPanel26.setOpaque(false);
        jPanel26.setPreferredSize(new java.awt.Dimension(449, 10));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel25.add(jPanel26, java.awt.BorderLayout.PAGE_START);

        scrollPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        scrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        paint.setBackground(new java.awt.Color(255, 255, 255));

        radiografiasTargets.setOpaque(false);
        radiografiasTargets.setLayout(new javax.swing.BoxLayout(radiografiasTargets, javax.swing.BoxLayout.Y_AXIS));

        javax.swing.GroupLayout paintLayout = new javax.swing.GroupLayout(paint);
        paint.setLayout(paintLayout);
        paintLayout.setHorizontalGroup(
            paintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(radiografiasTargets, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        paintLayout.setVerticalGroup(
            paintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paintLayout.createSequentialGroup()
                .addComponent(radiografiasTargets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 157, Short.MAX_VALUE))
        );

        scrollPanel.setViewportView(paint);

        jPanel25.add(scrollPanel, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel25, java.awt.BorderLayout.CENTER);

        container1.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel2.add(container1, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void title4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_title4MouseClicked
        ApplicationContext.paciente.mostrarPanel(ApplicationContext.controlMensual);
        ApplicationContext.controlMensual.mostrarControl(ApplicationContext.noControl);
    }//GEN-LAST:event_title4MouseClicked

    private void buttonContainer1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonContainer1MouseClicked
        ApplicationContext.radiografias.addTargets();
        ApplicationContext.radiografias.setValues("Ortodoncia");
        ApplicationContext.selectedTreatmentInOut = "in";
        ApplicationContext.paciente.mostrarPanel(ApplicationContext.radiografias);
    }//GEN-LAST:event_buttonContainer1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addIcon;
    private com.k33ptoo.components.KGradientPanel buttonContainer1;
    private com.k33ptoo.components.KGradientPanel buttonContainer2;
    private com.k33ptoo.components.KGradientPanel container1;
    private com.k33ptoo.components.KGradientPanel container2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
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
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel needBorder;
    private javax.swing.JPanel paint;
    private javax.swing.JPanel radiografiasTargets;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel text4;
    private javax.swing.JLabel text5;
    private javax.swing.JLabel text6;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title3;
    private javax.swing.JLabel title4;
    // End of variables declaration//GEN-END:variables

    
}
