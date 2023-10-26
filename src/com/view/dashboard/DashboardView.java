package com.view.dashboard;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.utils.CustomScrollBar;
import com.utils.Styles;
import com.utils.Tools;
import java.awt.BorderLayout;
import javax.swing.border.MatteBorder;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 19/09/22
 */
public class DashboardView extends Styles {

    /**
     * Creates new form Dashboard
     */
    public DashboardView() {
        initComponents();
        styleMyComponentBaby();
        
        if (!ApplicationContext.isDoctorSesionActual()) {
            cont.remove(actividades);
            cont.setLayout(new BorderLayout());
        }
    }
    
    @Override
    public void addTitlesAndSubtitles() {
        TITLES_AND_SUBTITLES.add(title1);
        TITLES_AND_SUBTITLES.add(title2);
    }

    @Override
    public void addPlainText() {
        PLAIN_TEXT.add(text1);
        PLAIN_TEXT.add(text2);
    }

    @Override
    public void addContainers() {
        CONTAINERS.add(container1);
        CONTAINERS.add(container2);
    }

    @Override
    public void initStyles() {
        Tools.setScroll(scrollPanel);
        Tools.showPanel(placeScroll, ApplicationContext.dashboardScroll, 10, 10);
        Tools.showPanel(placeplace, ApplicationContext.consultasDashboardTable, 10, 10);
        Tools.showPanel(placeplace2, ApplicationContext.actividadTable, 10, 10);
        colorComponent("light");
    }
    
    @Override
    public void colorBasics() {
        content.setBorder(new MatteBorder(0, 1, 0, 0, ChoosedPalette.getGray()));
        needBorder1.setBorder(new MatteBorder(0, 0, 1, 0, ChoosedPalette.getGray()));
        needBorder2.setBorder(new MatteBorder(0, 0, 1, 0, ChoosedPalette.getGray()));
        placeScroll.setBackground(ChoosedPalette.getSecondaryBackground());
        paintTitlesAndSubtitles();
        paintPlainText();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        cont = new javax.swing.JPanel();
        jPanel61 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        container1 = new com.k33ptoo.components.KGradientPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel53 = new javax.swing.JPanel();
        jPanel54 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        needBorder1 = new javax.swing.JPanel();
        text1 = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        jPanel90 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        place = new javax.swing.JPanel();
        jPanel55 = new javax.swing.JPanel();
        jPanel56 = new javax.swing.JPanel();
        placeplace = new javax.swing.JPanel();
        actividades = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        container2 = new com.k33ptoo.components.KGradientPanel();
        jPanel51 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        needBorder2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        text12 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        text13 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        text14 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        text2 = new javax.swing.JLabel();
        jPanel91 = new javax.swing.JPanel();
        title2 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        place1 = new javax.swing.JPanel();
        jPanel59 = new javax.swing.JPanel();
        jPanel60 = new javax.swing.JPanel();
        placeplace2 = new javax.swing.JPanel();
        container = new javax.swing.JPanel();
        scrollPanel = new javax.swing.JScrollPane();
        placeScroll = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1060, 500));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1060, 569));
        setLayout(new java.awt.BorderLayout());

        content.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(204, 204, 204)));
        content.setMaximumSize(new java.awt.Dimension(450, 32767));
        content.setMinimumSize(new java.awt.Dimension(365, 100));
        content.setOpaque(false);
        content.setLayout(new java.awt.BorderLayout());

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setMaximumSize(new java.awt.Dimension(24, 90));
        jPanel18.setMinimumSize(new java.awt.Dimension(24, 90));
        jPanel18.setOpaque(false);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 521, Short.MAX_VALUE)
        );

        content.add(jPanel18, java.awt.BorderLayout.LINE_END);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setMaximumSize(new java.awt.Dimension(24, 90));
        jPanel19.setMinimumSize(new java.awt.Dimension(24, 90));
        jPanel19.setOpaque(false);
        jPanel19.setPreferredSize(new java.awt.Dimension(24, 555));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 521, Short.MAX_VALUE)
        );

        content.add(jPanel19, java.awt.BorderLayout.LINE_START);

        jPanel5.setMaximumSize(new java.awt.Dimension(32767, 24));
        jPanel5.setMinimumSize(new java.awt.Dimension(100, 24));
        jPanel5.setOpaque(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(365, 24));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        content.add(jPanel5, java.awt.BorderLayout.PAGE_END);

        jPanel6.setMaximumSize(new java.awt.Dimension(32767, 24));
        jPanel6.setMinimumSize(new java.awt.Dimension(100, 24));
        jPanel6.setOpaque(false);
        jPanel6.setPreferredSize(new java.awt.Dimension(365, 24));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        content.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        cont.setOpaque(false);
        cont.setLayout(new java.awt.GridLayout(2, 1));

        jPanel61.setOpaque(false);
        jPanel61.setLayout(new java.awt.BorderLayout());

        jPanel2.setMinimumSize(new java.awt.Dimension(100, 7));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(317, 7));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 317, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        jPanel61.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        container1.setkEndColor(new java.awt.Color(204, 204, 204));
        container1.setkFillBackground(false);
        container1.setkStartColor(new java.awt.Color(204, 204, 204));
        container1.setOpaque(false);
        container1.setLayout(new java.awt.BorderLayout());

        jPanel13.setMaximumSize(new java.awt.Dimension(32767, 14));
        jPanel13.setMinimumSize(new java.awt.Dimension(100, 14));
        jPanel13.setOpaque(false);
        jPanel13.setPreferredSize(new java.awt.Dimension(317, 14));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 317, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        container1.add(jPanel13, java.awt.BorderLayout.PAGE_START);

        jPanel53.setBackground(new java.awt.Color(255, 255, 255));
        jPanel53.setMaximumSize(new java.awt.Dimension(14, 90));
        jPanel53.setMinimumSize(new java.awt.Dimension(14, 90));
        jPanel53.setOpaque(false);
        jPanel53.setPreferredSize(new java.awt.Dimension(14, 569));

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
        );

        container1.add(jPanel53, java.awt.BorderLayout.LINE_START);

        jPanel54.setBackground(new java.awt.Color(255, 255, 255));
        jPanel54.setMaximumSize(new java.awt.Dimension(14, 90));
        jPanel54.setMinimumSize(new java.awt.Dimension(14, 90));
        jPanel54.setOpaque(false);
        jPanel54.setPreferredSize(new java.awt.Dimension(14, 569));

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
        );

        container1.add(jPanel54, java.awt.BorderLayout.LINE_END);

        jPanel14.setMaximumSize(new java.awt.Dimension(32767, 14));
        jPanel14.setMinimumSize(new java.awt.Dimension(100, 14));
        jPanel14.setOpaque(false);
        jPanel14.setPreferredSize(new java.awt.Dimension(317, 14));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 317, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        container1.add(jPanel14, java.awt.BorderLayout.PAGE_END);

        jPanel10.setOpaque(false);
        jPanel10.setLayout(new java.awt.BorderLayout());

        needBorder1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        needBorder1.setMaximumSize(new java.awt.Dimension(32767, 80));
        needBorder1.setMinimumSize(new java.awt.Dimension(100, 80));
        needBorder1.setOpaque(false);
        needBorder1.setPreferredSize(new java.awt.Dimension(289, 80));

        text1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text1.setForeground(new java.awt.Color(102, 102, 102));
        text1.setText("Consultas pendientes registradas");

        title1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        title1.setForeground(new java.awt.Color(0, 0, 0));
        title1.setText("Consultas pendientes");

        jPanel90.setBackground(new java.awt.Color(69, 98, 255));

        javax.swing.GroupLayout jPanel90Layout = new javax.swing.GroupLayout(jPanel90);
        jPanel90.setLayout(jPanel90Layout);
        jPanel90Layout.setHorizontalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel90Layout.setVerticalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout needBorder1Layout = new javax.swing.GroupLayout(needBorder1);
        needBorder1.setLayout(needBorder1Layout);
        needBorder1Layout.setHorizontalGroup(
            needBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(needBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(needBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text1, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addComponent(title1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        needBorder1Layout.setVerticalGroup(
            needBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(needBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(needBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel90, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(needBorder1Layout.createSequentialGroup()
                        .addComponent(title1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text1)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel10.add(needBorder1, java.awt.BorderLayout.PAGE_START);

        jPanel17.setOpaque(false);
        jPanel17.setLayout(new java.awt.BorderLayout());

        jPanel3.setMaximumSize(new java.awt.Dimension(32767, 10));
        jPanel3.setMinimumSize(new java.awt.Dimension(100, 10));
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(289, 10));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel17.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        place.setOpaque(false);
        place.setLayout(new java.awt.BorderLayout());

        jPanel55.setBackground(new java.awt.Color(255, 255, 255));
        jPanel55.setMaximumSize(new java.awt.Dimension(7, 90));
        jPanel55.setMinimumSize(new java.awt.Dimension(7, 90));
        jPanel55.setOpaque(false);
        jPanel55.setPreferredSize(new java.awt.Dimension(7, 569));

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 135, Short.MAX_VALUE)
        );

        place.add(jPanel55, java.awt.BorderLayout.LINE_START);

        jPanel56.setBackground(new java.awt.Color(255, 255, 255));
        jPanel56.setMaximumSize(new java.awt.Dimension(7, 90));
        jPanel56.setMinimumSize(new java.awt.Dimension(7, 90));
        jPanel56.setOpaque(false);
        jPanel56.setPreferredSize(new java.awt.Dimension(7, 569));

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 135, Short.MAX_VALUE)
        );

        place.add(jPanel56, java.awt.BorderLayout.LINE_END);

        placeplace.setOpaque(false);
        placeplace.setLayout(new java.awt.GridLayout(1, 1));
        place.add(placeplace, java.awt.BorderLayout.CENTER);

        jPanel17.add(place, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel17, java.awt.BorderLayout.CENTER);

        container1.add(jPanel10, java.awt.BorderLayout.CENTER);

        jPanel61.add(container1, java.awt.BorderLayout.CENTER);

        cont.add(jPanel61);

        actividades.setOpaque(false);
        actividades.setLayout(new java.awt.BorderLayout());

        jPanel8.setMinimumSize(new java.awt.Dimension(100, 7));
        jPanel8.setOpaque(false);
        jPanel8.setPreferredSize(new java.awt.Dimension(317, 7));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 317, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        actividades.add(jPanel8, java.awt.BorderLayout.PAGE_START);

        container2.setkEndColor(new java.awt.Color(204, 204, 204));
        container2.setkFillBackground(false);
        container2.setkStartColor(new java.awt.Color(204, 204, 204));
        container2.setOpaque(false);
        container2.setLayout(new java.awt.BorderLayout());

        jPanel51.setBackground(new java.awt.Color(255, 255, 255));
        jPanel51.setMaximumSize(new java.awt.Dimension(14, 90));
        jPanel51.setMinimumSize(new java.awt.Dimension(14, 90));
        jPanel51.setOpaque(false);
        jPanel51.setPreferredSize(new java.awt.Dimension(14, 569));

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
        );

        container2.add(jPanel51, java.awt.BorderLayout.LINE_END);

        jPanel52.setBackground(new java.awt.Color(255, 255, 255));
        jPanel52.setMaximumSize(new java.awt.Dimension(14, 90));
        jPanel52.setMinimumSize(new java.awt.Dimension(14, 90));
        jPanel52.setOpaque(false);
        jPanel52.setPreferredSize(new java.awt.Dimension(14, 569));

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
        );

        container2.add(jPanel52, java.awt.BorderLayout.LINE_START);

        jPanel15.setMaximumSize(new java.awt.Dimension(32767, 14));
        jPanel15.setMinimumSize(new java.awt.Dimension(100, 14));
        jPanel15.setOpaque(false);
        jPanel15.setPreferredSize(new java.awt.Dimension(317, 14));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 317, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        container2.add(jPanel15, java.awt.BorderLayout.PAGE_END);

        jPanel16.setMaximumSize(new java.awt.Dimension(32767, 14));
        jPanel16.setMinimumSize(new java.awt.Dimension(100, 14));
        jPanel16.setOpaque(false);
        jPanel16.setPreferredSize(new java.awt.Dimension(317, 14));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 317, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        container2.add(jPanel16, java.awt.BorderLayout.PAGE_START);

        jPanel11.setOpaque(false);
        jPanel11.setLayout(new java.awt.BorderLayout());

        needBorder2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        needBorder2.setMaximumSize(new java.awt.Dimension(32767, 110));
        needBorder2.setMinimumSize(new java.awt.Dimension(100, 110));
        needBorder2.setOpaque(false);
        needBorder2.setPreferredSize(new java.awt.Dimension(289, 110));
        needBorder2.setLayout(new java.awt.BorderLayout());

        jPanel9.setMaximumSize(new java.awt.Dimension(32767, 40));
        jPanel9.setMinimumSize(new java.awt.Dimension(100, 40));
        jPanel9.setOpaque(false);
        jPanel9.setPreferredSize(new java.awt.Dimension(289, 40));
        jPanel9.setLayout(new java.awt.GridLayout(1, 0));

        jPanel21.setOpaque(false);

        text12.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text12.setForeground(new java.awt.Color(153, 153, 153));
        text12.setText("Usuario");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text12, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel9.add(jPanel21);

        jPanel22.setOpaque(false);

        text13.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text13.setForeground(new java.awt.Color(153, 153, 153));
        text13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text13.setText("Actividad");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text13, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel9.add(jPanel22);

        jPanel23.setOpaque(false);

        text14.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text14.setForeground(new java.awt.Color(153, 153, 153));
        text14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        text14.setText("Fecha");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text14, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel9.add(jPanel23);

        needBorder2.add(jPanel9, java.awt.BorderLayout.PAGE_END);

        jPanel24.setOpaque(false);

        text2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text2.setForeground(new java.awt.Color(102, 102, 102));
        text2.setText("Actividad realizada recientemente");

        jPanel91.setBackground(new java.awt.Color(69, 98, 255));

        javax.swing.GroupLayout jPanel91Layout = new javax.swing.GroupLayout(jPanel91);
        jPanel91.setLayout(jPanel91Layout);
        jPanel91Layout.setHorizontalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel91Layout.setVerticalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        title2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        title2.setForeground(new java.awt.Color(0, 0, 0));
        title2.setText("Actividad reciente");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text2, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addComponent(title2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(title2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text2)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        needBorder2.add(jPanel24, java.awt.BorderLayout.CENTER);

        jPanel11.add(needBorder2, java.awt.BorderLayout.PAGE_START);

        jPanel20.setOpaque(false);
        jPanel20.setLayout(new java.awt.BorderLayout());

        jPanel12.setMaximumSize(new java.awt.Dimension(32767, 10));
        jPanel12.setMinimumSize(new java.awt.Dimension(100, 10));
        jPanel12.setOpaque(false);
        jPanel12.setPreferredSize(new java.awt.Dimension(289, 10));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel20.add(jPanel12, java.awt.BorderLayout.PAGE_START);

        place1.setOpaque(false);
        place1.setLayout(new java.awt.BorderLayout());

        jPanel59.setBackground(new java.awt.Color(255, 255, 255));
        jPanel59.setMaximumSize(new java.awt.Dimension(7, 90));
        jPanel59.setMinimumSize(new java.awt.Dimension(7, 90));
        jPanel59.setOpaque(false);
        jPanel59.setPreferredSize(new java.awt.Dimension(7, 569));

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 105, Short.MAX_VALUE)
        );

        place1.add(jPanel59, java.awt.BorderLayout.LINE_START);

        jPanel60.setBackground(new java.awt.Color(255, 255, 255));
        jPanel60.setMaximumSize(new java.awt.Dimension(7, 90));
        jPanel60.setMinimumSize(new java.awt.Dimension(7, 90));
        jPanel60.setOpaque(false);
        jPanel60.setPreferredSize(new java.awt.Dimension(7, 569));

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 105, Short.MAX_VALUE)
        );

        place1.add(jPanel60, java.awt.BorderLayout.LINE_END);

        placeplace2.setOpaque(false);
        placeplace2.setLayout(new java.awt.GridLayout(1, 1));
        place1.add(placeplace2, java.awt.BorderLayout.CENTER);

        jPanel20.add(place1, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel20, java.awt.BorderLayout.CENTER);

        container2.add(jPanel11, java.awt.BorderLayout.CENTER);

        actividades.add(container2, java.awt.BorderLayout.CENTER);

        cont.add(actividades);

        content.add(cont, java.awt.BorderLayout.CENTER);

        add(content, java.awt.BorderLayout.LINE_END);

        container.setOpaque(false);
        container.setLayout(new java.awt.BorderLayout());

        scrollPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        scrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        placeScroll.setBackground(new java.awt.Color(255, 255, 255));
        placeScroll.setLayout(new java.awt.GridLayout(1, 0));
        scrollPanel.setViewportView(placeScroll);

        container.add(scrollPanel, java.awt.BorderLayout.CENTER);

        add(container, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actividades;
    private javax.swing.JPanel cont;
    private javax.swing.JPanel container;
    private com.k33ptoo.components.KGradientPanel container1;
    private com.k33ptoo.components.KGradientPanel container2;
    private javax.swing.JPanel content;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel90;
    private javax.swing.JPanel jPanel91;
    private javax.swing.JPanel needBorder1;
    private javax.swing.JPanel needBorder2;
    private javax.swing.JPanel place;
    private javax.swing.JPanel place1;
    private javax.swing.JPanel placeScroll;
    private javax.swing.JPanel placeplace;
    private javax.swing.JPanel placeplace2;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text12;
    private javax.swing.JLabel text13;
    private javax.swing.JLabel text14;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    // End of variables declaration//GEN-END:variables
 }
