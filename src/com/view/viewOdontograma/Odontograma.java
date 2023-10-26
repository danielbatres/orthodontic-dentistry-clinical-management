package com.view.viewOdontograma;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.context.StateColors;
import com.helper.OdontogramaHelper;
import com.utils.CustomScrollBar;
import com.utils.Styles;
import com.utils.Tools;
import java.awt.Cursor;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.border.MatteBorder;

/**
 *
 * @author Daniel Batres
 */
public class Odontograma extends Styles {
    private final ArrayList<JLabel> ICONS = new ArrayList<>();
    
    /**
     * Creates new form Odontograma
     */
    public Odontograma() {
        initComponents();
        styleMyComponentBaby();
    }
    
    private void changeSelectedOdontograma(String selected) {
        switch(selected) {
            case "adulto":
                Tools.showPanel(placeOdontograma, ApplicationContext.odontogramaAdulto, 0, 0);
                select.setText("Junior");
                break;
            case "junior":
                Tools.showPanel(placeOdontograma, ApplicationContext.odontogramaJunior, 0, 0);
                select.setText("Adulto");
                break;
        }
    }
    
    @Override
    public void addTitlesAndSubtitles() {
        TITLES_AND_SUBTITLES.add(select);
    }
    
    @Override
    public void addPlainText() {
        PLAIN_TEXT.add(text1);
        PLAIN_TEXT.add(text2);
        PLAIN_TEXT.add(text3);
        PLAIN_TEXT.add(text4);
        PLAIN_TEXT.add(text5);
    }
    
    @Override
    public void addContainers() {
        CONTAINERS.add(container1);
        CONTAINERS.add(container2);
        CONTAINERS.add(container3);
        CONTAINERS.add(container4);
        CONTAINERS.add(container5);
        CONTAINERS.add(container6);
        CONTAINERS.add(container8);
        CONTAINERS.add(container9);
        CONTAINERS.add(container10);
        CONTAINERS.add(container11);
    }
    
    @Override
    public void initStyles() {
        addIcons();
        ICONS.forEach(icn -> {
            icn.setSize(50, 50);
            icn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        });
        setIcons();
        Tools.showPanel(placeOdontograma, ApplicationContext.odontogramaAdulto, 0, 0);
        Tools.setScroll(scrollPanel2);
        scrollPanel1.setHorizontalScrollBar(new CustomScrollBar());
        scrollPanel1.getHorizontalScrollBar().setUnitIncrement(35);
    }
    
    private void addIcons() {
        ICONS.add(icon);
        ICONS.add(icon1);
        ICONS.add(icon2);
        ICONS.add(icon4);
        ICONS.add(icon5);
        ICONS.add(icon6);
        ICONS.add(icon7);
    }
    
    private void setIcons() {
        Tools.setImageLabel(icon, "src/com/images/odontogram/circle.png", 30, 30, StateColors.getDanger());
        Tools.setImageLabel(icon1, "src/com/images/odontogram/circle.png", 30, 30, StateColors.getInfo());
        Tools.setImage(icon2, "src/com/images/odontogram/double.png", 30, 30);
        Tools.setImageLabel(icon4, "src/com/images/odontogram/circle-line.png", 30, 30, StateColors.getDanger());
        Tools.setImageLabel(icon5, "src/com/images/odontogram/circle-line.png", 30, 30, StateColors.getInfo());
        Tools.setImageLabel(icon6, "src/com/images/odontogram/cross.png", 30, 30, StateColors.getDanger());
        Tools.setImageLabel(icon7, "src/com/images/odontogram/cross.png", 30, 30, StateColors.getInfo());
    }

    public void addTargets() {
        ApplicationContext.dienteOdontogramaModels.clear();
        ApplicationContext.odontogramaTargets.clear();
        targets.removeAll();
        ApplicationContext.dienteOdontogramaModels = OdontogramaHelper.getValues(ApplicationContext.selectedPacient.getId());
        
        ApplicationContext.dienteOdontogramaModels.forEach(diente -> {
            ApplicationContext.odontogramaTargets.add(new OdontogramaTarget(diente));
            ApplicationContext.odontogramaAdulto.addValues(diente);
            ApplicationContext.odontogramaJunior.addValues(diente);
        });
        
        ApplicationContext.odontogramaTargets.forEach(target -> {
            target.colorComponent(ApplicationContext.selectedAppereance);
            targets.add(target);
        });
        
        OdontogramaContext.setOdontogramaSelection(null);
        OdontogramaContext.setSelection(false);
        
        SwingUtilities.updateComponentTreeUI(targets);
    }
    
    @Override
    public void colorBasics() {
        needBorder.setBorder(new MatteBorder(0, 0, 1, 0, ChoosedPalette.getGray()));
        content.setBackground(ChoosedPalette.getWhite());
        targetsContainer.setBackground(ChoosedPalette.getSecondaryBackground());
        paintAll();
    }
    
    @Override
    public void dark() {
        CONTAINERS.forEach(container -> {
            container.setkFillBackground(true);
            container.setkStartColor(ChoosedPalette.getSecondaryBackground());
            container.setkEndColor(ChoosedPalette.getSecondaryBackground());
            container.repaint();
        });
        
        for (int i = 3; i < CONTAINERS.size(); i++) {
            CONTAINERS.get(i).setkStartColor(ChoosedPalette.getPrimaryBackground());
            CONTAINERS.get(i).setkEndColor(ChoosedPalette.getPrimaryBackground());
        }
        
        container1.setkStartColor(ChoosedPalette.getWhite());
        container1.setkEndColor(ChoosedPalette.getWhite());
    }
    
    @Override
    public void light() {
        CONTAINERS.forEach(container -> {
            container.setkFillBackground(false);
            container.setkStartColor(ChoosedPalette.getGray());
            container.setkEndColor(ChoosedPalette.getGray());
            container.repaint();
        });
        
        needBorder2.setBorder(new MatteBorder(0, 1, 0, 1, ChoosedPalette.getGray()));
    }
    
    private void setSelectionState(OdontogramaSelection odontogramaSelection) {
        OdontogramaContext.setSelection(true);
        OdontogramaContext.setOdontogramaSelection(odontogramaSelection);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        container1 = new com.k33ptoo.components.KGradientPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        needBorder2 = new javax.swing.JPanel();
        scrollPanel1 = new javax.swing.JScrollPane();
        content = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        placeOdontograma = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        container2 = new com.k33ptoo.components.KGradientPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        container4 = new com.k33ptoo.components.KGradientPanel();
        icon = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        container5 = new com.k33ptoo.components.KGradientPanel();
        icon1 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        container6 = new com.k33ptoo.components.KGradientPanel();
        icon2 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        container8 = new com.k33ptoo.components.KGradientPanel();
        icon4 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        container9 = new com.k33ptoo.components.KGradientPanel();
        icon5 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        container10 = new com.k33ptoo.components.KGradientPanel();
        icon6 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        container11 = new com.k33ptoo.components.KGradientPanel();
        icon7 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        select = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        container3 = new com.k33ptoo.components.KGradientPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        needBorder = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        text1 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        text2 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        text3 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        text4 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        text5 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        scrollPanel2 = new javax.swing.JScrollPane();
        targetsContainer = new javax.swing.JPanel();
        targets = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(976, 814));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(976, 814));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(100, 350));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(976, 350));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setMinimumSize(new java.awt.Dimension(14, 100));
        jPanel5.setOpaque(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(14, 253));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, java.awt.BorderLayout.LINE_END);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setMinimumSize(new java.awt.Dimension(14, 100));
        jPanel6.setOpaque(false);
        jPanel6.setPreferredSize(new java.awt.Dimension(14, 253));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, java.awt.BorderLayout.LINE_START);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setMinimumSize(new java.awt.Dimension(100, 20));
        jPanel7.setOpaque(false);
        jPanel7.setPreferredSize(new java.awt.Dimension(976, 20));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 976, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, java.awt.BorderLayout.PAGE_END);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setMinimumSize(new java.awt.Dimension(100, 20));
        jPanel8.setOpaque(false);
        jPanel8.setPreferredSize(new java.awt.Dimension(976, 20));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 976, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8, java.awt.BorderLayout.PAGE_START);

        container1.setkEndColor(new java.awt.Color(204, 204, 204));
        container1.setkFillBackground(false);
        container1.setkStartColor(new java.awt.Color(204, 204, 204));
        container1.setOpaque(false);
        container1.setLayout(new java.awt.BorderLayout());

        jPanel24.setMinimumSize(new java.awt.Dimension(100, 30));
        jPanel24.setOpaque(false);
        jPanel24.setPreferredSize(new java.awt.Dimension(948, 30));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 948, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        container1.add(jPanel24, java.awt.BorderLayout.PAGE_START);

        jPanel27.setMinimumSize(new java.awt.Dimension(50, 30));
        jPanel27.setOpaque(false);
        jPanel27.setPreferredSize(new java.awt.Dimension(948, 30));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 948, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        container1.add(jPanel27, java.awt.BorderLayout.PAGE_END);

        needBorder2.setOpaque(false);
        needBorder2.setLayout(new java.awt.BorderLayout());

        scrollPanel1.setBackground(new java.awt.Color(255, 255, 255));
        scrollPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        scrollPanel1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        scrollPanel1.setOpaque(false);

        content.setLayout(new javax.swing.BoxLayout(content, javax.swing.BoxLayout.LINE_AXIS));

        jPanel29.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel29.setOpaque(false);
        jPanel29.setPreferredSize(new java.awt.Dimension(10, 250));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        content.add(jPanel29);

        placeOdontograma.setMaximumSize(new java.awt.Dimension(1250, 250));
        placeOdontograma.setMinimumSize(new java.awt.Dimension(1250, 250));
        placeOdontograma.setOpaque(false);
        placeOdontograma.setPreferredSize(new java.awt.Dimension(1250, 250));
        placeOdontograma.setLayout(new java.awt.GridLayout(1, 0));
        content.add(placeOdontograma);

        jPanel30.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel30.setOpaque(false);
        jPanel30.setPreferredSize(new java.awt.Dimension(10, 250));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        content.add(jPanel30);

        scrollPanel1.setViewportView(content);

        needBorder2.add(scrollPanel1, java.awt.BorderLayout.CENTER);

        container1.add(needBorder2, java.awt.BorderLayout.CENTER);

        jPanel1.add(container1, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setMinimumSize(new java.awt.Dimension(100, 90));
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(976, 90));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel9.setMinimumSize(new java.awt.Dimension(14, 100));
        jPanel9.setOpaque(false);
        jPanel9.setPreferredSize(new java.awt.Dimension(14, 100));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel9, java.awt.BorderLayout.LINE_END);

        jPanel10.setMinimumSize(new java.awt.Dimension(14, 100));
        jPanel10.setOpaque(false);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel10, java.awt.BorderLayout.LINE_START);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setMinimumSize(new java.awt.Dimension(100, 20));
        jPanel11.setOpaque(false);
        jPanel11.setPreferredSize(new java.awt.Dimension(976, 20));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 976, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel11, java.awt.BorderLayout.PAGE_END);

        container2.setkEndColor(new java.awt.Color(204, 204, 204));
        container2.setkFillBackground(false);
        container2.setkStartColor(new java.awt.Color(204, 204, 204));
        container2.setOpaque(false);
        container2.setLayout(new java.awt.BorderLayout());

        jPanel25.setMinimumSize(new java.awt.Dimension(30, 100));
        jPanel25.setOpaque(false);
        jPanel25.setPreferredSize(new java.awt.Dimension(30, 50));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container2.add(jPanel25, java.awt.BorderLayout.LINE_END);

        jPanel33.setMinimumSize(new java.awt.Dimension(30, 100));
        jPanel33.setOpaque(false);
        jPanel33.setPreferredSize(new java.awt.Dimension(30, 50));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container2.add(jPanel33, java.awt.BorderLayout.LINE_START);

        jPanel34.setMinimumSize(new java.awt.Dimension(14, 10));
        jPanel34.setOpaque(false);
        jPanel34.setPreferredSize(new java.awt.Dimension(948, 10));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 948, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        container2.add(jPanel34, java.awt.BorderLayout.PAGE_END);

        jPanel35.setMinimumSize(new java.awt.Dimension(14, 10));
        jPanel35.setOpaque(false);
        jPanel35.setPreferredSize(new java.awt.Dimension(948, 10));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 948, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        container2.add(jPanel35, java.awt.BorderLayout.PAGE_START);

        jPanel36.setOpaque(false);
        jPanel36.setLayout(new java.awt.GridLayout(1, 0));

        jPanel37.setOpaque(false);

        container4.setkEndColor(new java.awt.Color(204, 204, 204));
        container4.setkFillBackground(false);
        container4.setkStartColor(new java.awt.Color(204, 204, 204));
        container4.setOpaque(false);
        container4.setPreferredSize(new java.awt.Dimension(50, 50));
        container4.setLayout(new java.awt.BorderLayout());

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconMouseClicked(evt);
            }
        });
        container4.add(icon, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addComponent(container4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 61, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel36.add(jPanel37);

        jPanel38.setOpaque(false);

        container5.setkEndColor(new java.awt.Color(204, 204, 204));
        container5.setkFillBackground(false);
        container5.setkStartColor(new java.awt.Color(204, 204, 204));
        container5.setOpaque(false);
        container5.setPreferredSize(new java.awt.Dimension(50, 50));
        container5.setLayout(new java.awt.BorderLayout());

        icon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon1MouseClicked(evt);
            }
        });
        container5.add(icon1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addComponent(container5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 61, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel36.add(jPanel38);

        jPanel39.setOpaque(false);

        container6.setkEndColor(new java.awt.Color(204, 204, 204));
        container6.setkFillBackground(false);
        container6.setkStartColor(new java.awt.Color(204, 204, 204));
        container6.setOpaque(false);
        container6.setPreferredSize(new java.awt.Dimension(50, 50));
        container6.setLayout(new java.awt.BorderLayout());

        icon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon2MouseClicked(evt);
            }
        });
        container6.add(icon2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addComponent(container6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 61, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel36.add(jPanel39);

        jPanel41.setOpaque(false);

        container8.setkEndColor(new java.awt.Color(204, 204, 204));
        container8.setkFillBackground(false);
        container8.setkStartColor(new java.awt.Color(204, 204, 204));
        container8.setOpaque(false);
        container8.setPreferredSize(new java.awt.Dimension(50, 50));
        container8.setLayout(new java.awt.BorderLayout());

        icon4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon4MouseClicked(evt);
            }
        });
        container8.add(icon4, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addComponent(container8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 61, Short.MAX_VALUE))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel36.add(jPanel41);

        jPanel42.setOpaque(false);

        container9.setkEndColor(new java.awt.Color(204, 204, 204));
        container9.setkFillBackground(false);
        container9.setkStartColor(new java.awt.Color(204, 204, 204));
        container9.setOpaque(false);
        container9.setPreferredSize(new java.awt.Dimension(50, 50));
        container9.setLayout(new java.awt.BorderLayout());

        icon5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon5MouseClicked(evt);
            }
        });
        container9.add(icon5, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addComponent(container9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 61, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel36.add(jPanel42);

        jPanel43.setOpaque(false);

        container10.setkEndColor(new java.awt.Color(204, 204, 204));
        container10.setkFillBackground(false);
        container10.setkStartColor(new java.awt.Color(204, 204, 204));
        container10.setOpaque(false);
        container10.setPreferredSize(new java.awt.Dimension(50, 50));
        container10.setLayout(new java.awt.BorderLayout());

        icon6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon6MouseClicked(evt);
            }
        });
        container10.add(icon6, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addComponent(container10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 61, Short.MAX_VALUE))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel36.add(jPanel43);

        jPanel44.setOpaque(false);

        container11.setkEndColor(new java.awt.Color(204, 204, 204));
        container11.setkFillBackground(false);
        container11.setkStartColor(new java.awt.Color(204, 204, 204));
        container11.setOpaque(false);
        container11.setPreferredSize(new java.awt.Dimension(50, 50));
        container11.setLayout(new java.awt.BorderLayout());

        icon7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon7MouseClicked(evt);
            }
        });
        container11.add(icon7, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addComponent(container11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 61, Short.MAX_VALUE))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel36.add(jPanel44);

        jPanel40.setOpaque(false);

        select.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        select.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        select.setText("Junior");
        select.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(select, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(select, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel36.add(jPanel40);

        container2.add(jPanel36, java.awt.BorderLayout.CENTER);

        jPanel3.add(container2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.setMinimumSize(new java.awt.Dimension(105, 374));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setMinimumSize(new java.awt.Dimension(100, 20));
        jPanel13.setOpaque(false);
        jPanel13.setPreferredSize(new java.awt.Dimension(976, 20));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 976, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel13, java.awt.BorderLayout.PAGE_END);

        jPanel12.setMinimumSize(new java.awt.Dimension(14, 100));
        jPanel12.setOpaque(false);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 354, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel12, java.awt.BorderLayout.LINE_END);

        jPanel14.setMinimumSize(new java.awt.Dimension(14, 100));
        jPanel14.setOpaque(false);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 354, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel14, java.awt.BorderLayout.LINE_START);

        container3.setkEndColor(new java.awt.Color(204, 204, 204));
        container3.setkFillBackground(false);
        container3.setkStartColor(new java.awt.Color(204, 204, 204));
        container3.setOpaque(false);
        container3.setLayout(new java.awt.BorderLayout());

        jPanel15.setOpaque(false);
        jPanel15.setPreferredSize(new java.awt.Dimension(948, 50));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jPanel17.setMinimumSize(new java.awt.Dimension(30, 100));
        jPanel17.setOpaque(false);
        jPanel17.setPreferredSize(new java.awt.Dimension(30, 100));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel17, java.awt.BorderLayout.LINE_END);

        jPanel18.setMinimumSize(new java.awt.Dimension(30, 100));
        jPanel18.setOpaque(false);
        jPanel18.setPreferredSize(new java.awt.Dimension(30, 50));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel18, java.awt.BorderLayout.LINE_START);

        needBorder.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        needBorder.setOpaque(false);
        needBorder.setLayout(new java.awt.GridLayout(1, 5));

        jPanel19.setOpaque(false);

        text1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text1.setText("Diagnostico");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        needBorder.add(jPanel19);

        jPanel20.setOpaque(false);

        text2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text2.setText("Procedimiento");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text2, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        needBorder.add(jPanel20);

        jPanel21.setOpaque(false);

        text3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text3.setText("Pieza dental");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text3, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text3, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        needBorder.add(jPanel21);

        jPanel22.setOpaque(false);

        text4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text4.setText("Cara");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text4, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text4, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        needBorder.add(jPanel22);

        jPanel23.setOpaque(false);

        text5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        text5.setText("Acciones");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text5, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text5, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        needBorder.add(jPanel23);

        jPanel15.add(needBorder, java.awt.BorderLayout.CENTER);

        container3.add(jPanel15, java.awt.BorderLayout.PAGE_START);

        jPanel16.setMinimumSize(new java.awt.Dimension(948, 304));
        jPanel16.setOpaque(false);
        jPanel16.setLayout(new java.awt.BorderLayout());

        jPanel26.setMinimumSize(new java.awt.Dimension(14, 14));
        jPanel26.setOpaque(false);
        jPanel26.setPreferredSize(new java.awt.Dimension(948, 14));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 948, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jPanel16.add(jPanel26, java.awt.BorderLayout.PAGE_END);

        jPanel28.setMinimumSize(new java.awt.Dimension(30, 100));
        jPanel28.setOpaque(false);
        jPanel28.setPreferredSize(new java.awt.Dimension(30, 290));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 276, Short.MAX_VALUE)
        );

        jPanel16.add(jPanel28, java.awt.BorderLayout.LINE_START);

        jPanel31.setMinimumSize(new java.awt.Dimension(30, 100));
        jPanel31.setOpaque(false);
        jPanel31.setPreferredSize(new java.awt.Dimension(30, 290));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 276, Short.MAX_VALUE)
        );

        jPanel16.add(jPanel31, java.awt.BorderLayout.LINE_END);

        jPanel32.setMinimumSize(new java.awt.Dimension(14, 14));
        jPanel32.setOpaque(false);
        jPanel32.setPreferredSize(new java.awt.Dimension(948, 14));

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 948, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jPanel16.add(jPanel32, java.awt.BorderLayout.PAGE_START);

        scrollPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        scrollPanel2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPanel2.setMinimumSize(new java.awt.Dimension(17, 200));
        scrollPanel2.setOpaque(false);

        targets.setOpaque(false);
        targets.setLayout(new javax.swing.BoxLayout(targets, javax.swing.BoxLayout.Y_AXIS));

        javax.swing.GroupLayout targetsContainerLayout = new javax.swing.GroupLayout(targetsContainer);
        targetsContainer.setLayout(targetsContainerLayout);
        targetsContainerLayout.setHorizontalGroup(
            targetsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(targets, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        targetsContainerLayout.setVerticalGroup(
            targetsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(targetsContainerLayout.createSequentialGroup()
                .addComponent(targets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 276, Short.MAX_VALUE))
        );

        scrollPanel2.setViewportView(targetsContainer);

        jPanel16.add(scrollPanel2, java.awt.BorderLayout.CENTER);

        container3.add(jPanel16, java.awt.BorderLayout.CENTER);

        jPanel4.add(container3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void icon4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon4MouseClicked
        setSelectionState(OdontogramaSelection.CORONA_MAL_ESTADO);
    }//GEN-LAST:event_icon4MouseClicked

    private void iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconMouseClicked
        setSelectionState(OdontogramaSelection.CARIES_DENTAL);
    }//GEN-LAST:event_iconMouseClicked

    private void icon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon1MouseClicked
        setSelectionState(OdontogramaSelection.OBTURACION_BUEN_ESTADO);
    }//GEN-LAST:event_icon1MouseClicked

    private void icon5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon5MouseClicked
        setSelectionState(OdontogramaSelection.CORONA_BUEN_ESTADO);
    }//GEN-LAST:event_icon5MouseClicked

    private void icon2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon2MouseClicked
        setSelectionState(OdontogramaSelection.OBTURACION_MAL_ESTADO);
    }//GEN-LAST:event_icon2MouseClicked

    private void icon6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon6MouseClicked
        setSelectionState(OdontogramaSelection.DIENTE_INDICADO_EXTRACCION);
    }//GEN-LAST:event_icon6MouseClicked

    private void icon7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon7MouseClicked
        setSelectionState(OdontogramaSelection.DIENTE_AUSENTE);
    }//GEN-LAST:event_icon7MouseClicked

    private void selectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectMouseClicked
        if (select.getText().toLowerCase().equals("junior")) {
            changeSelectedOdontograma("junior");
        } else {
            changeSelectedOdontograma("adulto");
        }
    }//GEN-LAST:event_selectMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KGradientPanel container1;
    private com.k33ptoo.components.KGradientPanel container10;
    private com.k33ptoo.components.KGradientPanel container11;
    private com.k33ptoo.components.KGradientPanel container2;
    private com.k33ptoo.components.KGradientPanel container3;
    private com.k33ptoo.components.KGradientPanel container4;
    private com.k33ptoo.components.KGradientPanel container5;
    private com.k33ptoo.components.KGradientPanel container6;
    private com.k33ptoo.components.KGradientPanel container8;
    private com.k33ptoo.components.KGradientPanel container9;
    private javax.swing.JPanel content;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel icon4;
    private javax.swing.JLabel icon5;
    private javax.swing.JLabel icon6;
    private javax.swing.JLabel icon7;
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
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel needBorder;
    private javax.swing.JPanel needBorder2;
    private javax.swing.JPanel placeOdontograma;
    private javax.swing.JScrollPane scrollPanel1;
    private javax.swing.JScrollPane scrollPanel2;
    private javax.swing.JLabel select;
    private javax.swing.JPanel targets;
    private javax.swing.JPanel targetsContainer;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel text4;
    private javax.swing.JLabel text5;
    // End of variables declaration//GEN-END:variables
}
