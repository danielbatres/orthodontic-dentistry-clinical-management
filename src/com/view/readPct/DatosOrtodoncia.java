package com.view.readPct;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.model.FichaOrtodonciaModel;
import com.utils.CustomScrollBar;
import com.utils.Styles;
import com.utils.Tools;
import javax.swing.border.MatteBorder;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 15/09/22
 */
public class DatosOrtodoncia extends Styles {

    /**
     * Creates new form DatosOdontologia
     */
    public DatosOrtodoncia() {
        initComponents();
        styleMyComponentBaby();
    }

    public void setValues() {
        FichaOrtodonciaModel fichaOrtodoncia = ApplicationContext.selectedPacient.getFichaOrtodoncia();

        ho.setText(fichaOrtodoncia.getHO());
        hm.setText(fichaOrtodoncia.getHM());
        perfilTotal.setText(fichaOrtodoncia.getPerfilTotal());
        perfilTercioInf.setText(fichaOrtodoncia.getPerfilTercioInf());
        anguloNasolabial.setText(fichaOrtodoncia.getAnguloNasolabial());
        anguloCuello.setText(fichaOrtodoncia.getAnguloCuelloMenton());
        encias.setText(fichaOrtodoncia.getEncias());
        frenillos.setText(fichaOrtodoncia.getFrenillos());
        rmd.setText(fichaOrtodoncia.getRMD());
        rmi.setText(fichaOrtodoncia.getRMI());
        rcd.setText(fichaOrtodoncia.getRCD());
        rci.setText(fichaOrtodoncia.getRCI());
        smh.setText(fichaOrtodoncia.getSMH());
        smv.setText(fichaOrtodoncia.getSMV());
        lineasMedias.setText(fichaOrtodoncia.getLineasMedias());
        tipoDenticion.setText(fichaOrtodoncia.getTipoDenticion());
        extracciones.setText(fichaOrtodoncia.isExtracciones() ? "SI" : "NO");
        observaciones.setText(fichaOrtodoncia.getObservaciones());

        text3.setText("Editada por ultima vez el " + fichaOrtodoncia.getDiaModificacion() + "/" + fichaOrtodoncia.getMesModificacion() + "/" + fichaOrtodoncia.getAnnioModificacion());
        text4.setText("Agregada el " + fichaOrtodoncia.getDiaCreacion() + "/" + fichaOrtodoncia.getMesCreacion() + "/" + fichaOrtodoncia.getAnnioCreacion());
    }

    @Override
    public void addTitlesAndSubtitles() {
        TITLES_AND_SUBTITLES.add(title1);
        TITLES_AND_SUBTITLES.add(title2);
        TITLES_AND_SUBTITLES.add(title3);
        TITLES_AND_SUBTITLES.add(title4);
        TITLES_AND_SUBTITLES.add(title5);
        TITLES_AND_SUBTITLES.add(title8);
        TITLES_AND_SUBTITLES.add(title9);
        TITLES_AND_SUBTITLES.add(title10);
        TITLES_AND_SUBTITLES.add(title11);
        TITLES_AND_SUBTITLES.add(title12);
        TITLES_AND_SUBTITLES.add(title13);
        TITLES_AND_SUBTITLES.add(title14);
        TITLES_AND_SUBTITLES.add(title15);
        TITLES_AND_SUBTITLES.add(title16);
        TITLES_AND_SUBTITLES.add(title17);
        TITLES_AND_SUBTITLES.add(title18);
        TITLES_AND_SUBTITLES.add(title19);
        TITLES_AND_SUBTITLES.add(title20);
        TITLES_AND_SUBTITLES.add(title21);
        TITLES_AND_SUBTITLES.add(title24);
    }

    @Override
    public void addPlainText() {
        PLAIN_TEXT.add(text1);
        PLAIN_TEXT.add(text2);
        PLAIN_TEXT.add(text3);
        PLAIN_TEXT.add(text4);
        PLAIN_TEXT.add(ho);
        PLAIN_TEXT.add(hm);
        PLAIN_TEXT.add(perfilTotal);
        PLAIN_TEXT.add(perfilTercioInf);
        PLAIN_TEXT.add(anguloNasolabial);
        PLAIN_TEXT.add(anguloCuello);
        PLAIN_TEXT.add(encias);
        PLAIN_TEXT.add(frenillos);
        PLAIN_TEXT.add(rmd);
        PLAIN_TEXT.add(rmi);
        PLAIN_TEXT.add(rcd);
        PLAIN_TEXT.add(rci);
        PLAIN_TEXT.add(smh);
        PLAIN_TEXT.add(smv);
        PLAIN_TEXT.add(lineasMedias);
        PLAIN_TEXT.add(tipoDenticion);
        PLAIN_TEXT.add(extracciones);
        PLAIN_TEXT.add(observaciones);
    }

    @Override
    public void addContainers() {

    }

    @Override
    public void initStyles() {
        Tools.setScroll(scrollPanel);
    }
    
    @Override
    public void colorBasics() {
        content.setBackground(ChoosedPalette.getSecondaryBackground());
        separator.setForeground(ChoosedPalette.getGray());
        separator.setBackground(ChoosedPalette.getGray());
        needBorder.setBorder(new MatteBorder(1, 0, 0, 0, ChoosedPalette.getGray()));
        paintAll();
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
        needBorder = new javax.swing.JPanel();
        text4 = new javax.swing.JLabel();
        text3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        scrollPanel = new javax.swing.JScrollPane();
        jPanel9 = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        title1 = new javax.swing.JLabel();
        text1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        title3 = new javax.swing.JLabel();
        ho = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        title4 = new javax.swing.JLabel();
        hm = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        title5 = new javax.swing.JLabel();
        perfilTotal = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        perfilTercioInf = new javax.swing.JLabel();
        title10 = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        title2 = new javax.swing.JLabel();
        text2 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        title8 = new javax.swing.JLabel();
        rmd = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        title9 = new javax.swing.JLabel();
        rmi = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        title15 = new javax.swing.JLabel();
        rcd = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        title16 = new javax.swing.JLabel();
        rci = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        title17 = new javax.swing.JLabel();
        smh = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        title18 = new javax.swing.JLabel();
        smv = new javax.swing.JLabel();
        jPanel122 = new javax.swing.JPanel();
        jPanel123 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        anguloNasolabial = new javax.swing.JLabel();
        title11 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        anguloCuello = new javax.swing.JLabel();
        title12 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        encias = new javax.swing.JLabel();
        title13 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        frenillos = new javax.swing.JLabel();
        title14 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        title19 = new javax.swing.JLabel();
        lineasMedias = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        title20 = new javax.swing.JLabel();
        tipoDenticion = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        title21 = new javax.swing.JLabel();
        extracciones = new javax.swing.JLabel();
        title24 = new javax.swing.JLabel();
        observaciones = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(467, 498));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(467, 498));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(100, 14));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(467, 14));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(14, 14));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        add(jPanel2, java.awt.BorderLayout.LINE_END);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(14, 14));
        jPanel3.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(100, 80));
        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(467, 80));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setMinimumSize(new java.awt.Dimension(14, 100));
        jPanel5.setOpaque(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(14, 30));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5, java.awt.BorderLayout.LINE_START);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setMinimumSize(new java.awt.Dimension(14, 100));
        jPanel6.setOpaque(false);
        jPanel6.setPreferredSize(new java.awt.Dimension(14, 30));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel6, java.awt.BorderLayout.LINE_END);

        needBorder.setBackground(new java.awt.Color(255, 255, 255));
        needBorder.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(204, 204, 204)));
        needBorder.setOpaque(false);

        text4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        text4.setForeground(new java.awt.Color(153, 153, 153));
        text4.setText("Agregada el 15/09/2022");
        text4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        text3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        text3.setForeground(new java.awt.Color(153, 153, 153));
        text3.setText("Editada por ultima vez el 15/09/2022");
        text3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout needBorderLayout = new javax.swing.GroupLayout(needBorder);
        needBorder.setLayout(needBorderLayout);
        needBorderLayout.setHorizontalGroup(
            needBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(needBorderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(needBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text4, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                    .addComponent(text3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE))
                .addContainerGap())
        );
        needBorderLayout.setVerticalGroup(
            needBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, needBorderLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(text3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(text4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jPanel4.add(needBorder, java.awt.BorderLayout.CENTER);

        add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.BorderLayout());

        scrollPanel.setBackground(new java.awt.Color(255, 255, 255));
        scrollPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        scrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPanel.setOpaque(false);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        content.setBackground(new java.awt.Color(255, 255, 255));

        title1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        title1.setForeground(new java.awt.Color(0, 0, 0));
        title1.setText("Datos de diagnostico ");

        text1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text1.setForeground(new java.awt.Color(153, 153, 153));
        text1.setText("Datos de diagnostico sobre el paciente");
        text1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setOpaque(false);
        jPanel11.setLayout(new java.awt.GridLayout(1, 0));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setOpaque(false);

        title3.setBackground(new java.awt.Color(255, 255, 255));
        title3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title3.setForeground(new java.awt.Color(0, 0, 0));
        title3.setText("HO");

        ho.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        ho.setForeground(new java.awt.Color(153, 153, 153));
        ho.setText("HO");
        ho.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(title3)
                .addGap(0, 86, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(ho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(title3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ho)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel11.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setOpaque(false);

        title4.setBackground(new java.awt.Color(255, 255, 255));
        title4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title4.setForeground(new java.awt.Color(0, 0, 0));
        title4.setText("HM");

        hm.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        hm.setForeground(new java.awt.Color(153, 153, 153));
        hm.setText("HM");
        hm.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(hm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(title4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hm)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel11.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setOpaque(false);

        title5.setBackground(new java.awt.Color(255, 255, 255));
        title5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title5.setForeground(new java.awt.Color(0, 0, 0));
        title5.setText("Perfil Total");

        perfilTotal.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        perfilTotal.setForeground(new java.awt.Color(153, 153, 153));
        perfilTotal.setText("Perfil total");
        perfilTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(perfilTotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(title5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(title5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(perfilTotal)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel11.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setOpaque(false);

        perfilTercioInf.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        perfilTercioInf.setForeground(new java.awt.Color(153, 153, 153));
        perfilTercioInf.setText("Perfil tercio inf");
        perfilTercioInf.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        title10.setBackground(new java.awt.Color(255, 255, 255));
        title10.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title10.setForeground(new java.awt.Color(0, 0, 0));
        title10.setText("Perfil tercio inf");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(perfilTercioInf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(title10, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(title10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(perfilTercioInf)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel11.add(jPanel15);

        separator.setBackground(new java.awt.Color(204, 204, 204));
        separator.setForeground(new java.awt.Color(204, 204, 204));

        title2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        title2.setForeground(new java.awt.Color(0, 0, 0));
        title2.setText("Diagnostico ortodontico");

        text2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text2.setForeground(new java.awt.Color(153, 153, 153));
        text2.setText("Datos de diagnostico sobre el paciente");
        text2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jPanel16.setOpaque(false);
        jPanel16.setLayout(new javax.swing.BoxLayout(jPanel16, javax.swing.BoxLayout.LINE_AXIS));

        jPanel18.setOpaque(false);

        title8.setBackground(new java.awt.Color(255, 255, 255));
        title8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title8.setForeground(new java.awt.Color(0, 0, 0));
        title8.setText("RMD");

        rmd.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        rmd.setForeground(new java.awt.Color(153, 153, 153));
        rmd.setText("l");
        rmd.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title8, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(rmd, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(title8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rmd)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel16.add(jPanel18);

        jPanel19.setOpaque(false);

        title9.setBackground(new java.awt.Color(255, 255, 255));
        title9.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title9.setForeground(new java.awt.Color(0, 0, 0));
        title9.setText("RMI");

        rmi.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        rmi.setForeground(new java.awt.Color(153, 153, 153));
        rmi.setText("l");
        rmi.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title9, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(rmi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(title9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rmi)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel16.add(jPanel19);

        jPanel26.setOpaque(false);

        title15.setBackground(new java.awt.Color(255, 255, 255));
        title15.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title15.setForeground(new java.awt.Color(0, 0, 0));
        title15.setText("RCD");

        rcd.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        rcd.setForeground(new java.awt.Color(153, 153, 153));
        rcd.setText("l");
        rcd.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title15, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(rcd, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addComponent(title15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rcd)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel16.add(jPanel26);

        jPanel27.setOpaque(false);

        title16.setBackground(new java.awt.Color(255, 255, 255));
        title16.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title16.setForeground(new java.awt.Color(0, 0, 0));
        title16.setText("RCI");

        rci.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        rci.setForeground(new java.awt.Color(153, 153, 153));
        rci.setText("l");
        rci.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title16, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(rci, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addComponent(title16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rci)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel16.add(jPanel27);

        jPanel28.setOpaque(false);

        title17.setBackground(new java.awt.Color(255, 255, 255));
        title17.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title17.setForeground(new java.awt.Color(0, 0, 0));
        title17.setText("SMH");

        smh.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        smh.setForeground(new java.awt.Color(153, 153, 153));
        smh.setText("l");
        smh.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title17, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(smh, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addComponent(title17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(smh)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel16.add(jPanel28);

        jPanel29.setOpaque(false);

        title18.setBackground(new java.awt.Color(255, 255, 255));
        title18.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title18.setForeground(new java.awt.Color(0, 0, 0));
        title18.setText("SMV");

        smv.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        smv.setForeground(new java.awt.Color(153, 153, 153));
        smv.setText("l");
        smv.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title18, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(smv, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addComponent(title18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(smv)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel16.add(jPanel29);

        jPanel122.setBackground(new java.awt.Color(69, 98, 255));

        javax.swing.GroupLayout jPanel122Layout = new javax.swing.GroupLayout(jPanel122);
        jPanel122.setLayout(jPanel122Layout);
        jPanel122Layout.setHorizontalGroup(
            jPanel122Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel122Layout.setVerticalGroup(
            jPanel122Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel123.setBackground(new java.awt.Color(69, 98, 255));

        javax.swing.GroupLayout jPanel123Layout = new javax.swing.GroupLayout(jPanel123);
        jPanel123.setLayout(jPanel123Layout);
        jPanel123Layout.setHorizontalGroup(
            jPanel123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel123Layout.setVerticalGroup(
            jPanel123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setOpaque(false);
        jPanel17.setLayout(new java.awt.GridLayout(1, 0));

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setOpaque(false);

        anguloNasolabial.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        anguloNasolabial.setForeground(new java.awt.Color(153, 153, 153));
        anguloNasolabial.setText("Angulo nasolabial");
        anguloNasolabial.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        title11.setBackground(new java.awt.Color(255, 255, 255));
        title11.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title11.setForeground(new java.awt.Color(0, 0, 0));
        title11.setText("Angulo nasolabial");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(title11)
                .addGap(0, 101, Short.MAX_VALUE))
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(anguloNasolabial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(title11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(anguloNasolabial)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel17.add(jPanel21);

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setOpaque(false);

        anguloCuello.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        anguloCuello.setForeground(new java.awt.Color(153, 153, 153));
        anguloCuello.setText("Angulo cuello - mentón");
        anguloCuello.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        title12.setBackground(new java.awt.Color(255, 255, 255));
        title12.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title12.setForeground(new java.awt.Color(0, 0, 0));
        title12.setText("Angulo cuello - mentón");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(title12)
                .addGap(0, 66, Short.MAX_VALUE))
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(anguloCuello, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(title12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(anguloCuello)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel17.add(jPanel22);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setOpaque(false);
        jPanel23.setLayout(new java.awt.GridLayout(1, 0));

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setOpaque(false);

        encias.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        encias.setForeground(new java.awt.Color(153, 153, 153));
        encias.setText("Encías del paciente");
        encias.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        title13.setBackground(new java.awt.Color(255, 255, 255));
        title13.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title13.setForeground(new java.awt.Color(0, 0, 0));
        title13.setText("Encías");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(title13)
                .addGap(0, 175, Short.MAX_VALUE))
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(encias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(title13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(encias)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel23.add(jPanel24);

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setOpaque(false);

        frenillos.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        frenillos.setForeground(new java.awt.Color(153, 153, 153));
        frenillos.setText("Frenillos del paciente");
        frenillos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        title14.setBackground(new java.awt.Color(255, 255, 255));
        title14.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title14.setForeground(new java.awt.Color(0, 0, 0));
        title14.setText("Frenillos");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(title14)
                .addGap(0, 160, Short.MAX_VALUE))
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(frenillos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(title14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frenillos)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel23.add(jPanel25);

        jPanel20.setOpaque(false);
        jPanel20.setLayout(new java.awt.GridLayout());

        jPanel30.setOpaque(false);

        title19.setBackground(new java.awt.Color(255, 255, 255));
        title19.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title19.setForeground(new java.awt.Color(0, 0, 0));
        title19.setText("Lineas medias");

        lineasMedias.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        lineasMedias.setForeground(new java.awt.Color(153, 153, 153));
        lineasMedias.setText("Lineas medias");
        lineasMedias.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title19, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(lineasMedias, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addComponent(title19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lineasMedias)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel20.add(jPanel30);

        jPanel31.setOpaque(false);

        title20.setBackground(new java.awt.Color(255, 255, 255));
        title20.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title20.setForeground(new java.awt.Color(0, 0, 0));
        title20.setText("Tipo dentición");

        tipoDenticion.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        tipoDenticion.setForeground(new java.awt.Color(153, 153, 153));
        tipoDenticion.setText("Tipo dentición");
        tipoDenticion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title20, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(tipoDenticion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addComponent(title20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipoDenticion)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel20.add(jPanel31);

        jPanel32.setOpaque(false);

        title21.setBackground(new java.awt.Color(255, 255, 255));
        title21.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title21.setForeground(new java.awt.Color(0, 0, 0));
        title21.setText("Extracciones");

        extracciones.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        extracciones.setForeground(new java.awt.Color(153, 153, 153));
        extracciones.setText("Extracciones");
        extracciones.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title21, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(extracciones, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addComponent(title21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(extracciones)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel20.add(jPanel32);

        title24.setBackground(new java.awt.Color(255, 255, 255));
        title24.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title24.setForeground(new java.awt.Color(0, 0, 0));
        title24.setText("Observaciones");

        observaciones.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        observaciones.setForeground(new java.awt.Color(153, 153, 153));
        observaciones.setText("Observaciones de la ficha de ortodoncia");
        observaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentLayout.createSequentialGroup()
                                .addComponent(jPanel122, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text1)
                                    .addComponent(title1)))
                            .addGroup(contentLayout.createSequentialGroup()
                                .addComponent(jPanel123, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text2)
                                    .addComponent(title2))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(separator)
                    .addComponent(title24, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                    .addComponent(observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(title1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text1))
                    .addComponent(jPanel122, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(202, 202, 202)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(title2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text2))
                    .addComponent(jPanel123, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(title24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(observaciones)
                .addContainerGap(210, Short.MAX_VALUE))
            .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentLayout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(602, Short.MAX_VALUE)))
            .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentLayout.createSequentialGroup()
                    .addGap(127, 127, 127)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(545, Short.MAX_VALUE)))
            .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentLayout.createSequentialGroup()
                    .addGap(185, 185, 185)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(487, Short.MAX_VALUE)))
        );

        jPanel9.add(content, java.awt.BorderLayout.CENTER);

        scrollPanel.setViewportView(jPanel9);

        jPanel8.add(scrollPanel, java.awt.BorderLayout.CENTER);

        add(jPanel8, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anguloCuello;
    private javax.swing.JLabel anguloNasolabial;
    private javax.swing.JPanel content;
    private javax.swing.JLabel encias;
    private javax.swing.JLabel extracciones;
    private javax.swing.JLabel frenillos;
    private javax.swing.JLabel hm;
    private javax.swing.JLabel ho;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel122;
    private javax.swing.JPanel jPanel123;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lineasMedias;
    private javax.swing.JPanel needBorder;
    private javax.swing.JLabel observaciones;
    private javax.swing.JLabel perfilTercioInf;
    private javax.swing.JLabel perfilTotal;
    private javax.swing.JLabel rcd;
    private javax.swing.JLabel rci;
    private javax.swing.JLabel rmd;
    private javax.swing.JLabel rmi;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JSeparator separator;
    private javax.swing.JLabel smh;
    private javax.swing.JLabel smv;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel text4;
    private javax.swing.JLabel tipoDenticion;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title10;
    private javax.swing.JLabel title11;
    private javax.swing.JLabel title12;
    private javax.swing.JLabel title13;
    private javax.swing.JLabel title14;
    private javax.swing.JLabel title15;
    private javax.swing.JLabel title16;
    private javax.swing.JLabel title17;
    private javax.swing.JLabel title18;
    private javax.swing.JLabel title19;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title20;
    private javax.swing.JLabel title21;
    private javax.swing.JLabel title24;
    private javax.swing.JLabel title3;
    private javax.swing.JLabel title4;
    private javax.swing.JLabel title5;
    private javax.swing.JLabel title8;
    private javax.swing.JLabel title9;
    // End of variables declaration//GEN-END:variables

    
}
