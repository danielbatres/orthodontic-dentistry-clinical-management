package com.view.readPct;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.utils.Styles;
import com.utils.Tools;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 19/09/22
 */
public class Paciente extends Styles {
    ArrayList<JPanel> containerButton = new ArrayList<>();
    
    /**
     * Creates new form Paciente
     */
    public Paciente() {
        initComponents();
        styleMyComponentBaby();  
    }
    
    public void setValues() {
        nombrePaciente.setText(ApplicationContext.selectedPacient.getNombres() + " " + ApplicationContext.selectedPacient.getApellidos());
        nombrePacienteLink.setText(ApplicationContext.selectedPacient.getNombres() + " " + ApplicationContext.selectedPacient.getApellidos());
    }
    
    public void addContainerButtons() {
        containerButton.add(datosContainer);
        containerButton.add(agendaContainer);
        containerButton.add(odontologiaContainer);
        containerButton.add(ortodonciaContainer);
    }
    
    @Override
    public void colorBasics() {
        paintAll();
        needBorder.setBorder(new MatteBorder(0, 0, 1, 0, ChoosedPalette.getGray()));
    }
    
    @Override
    public void addTitlesAndSubtitles() {
        TITLES_AND_SUBTITLES.add(nombrePaciente);
    }

    @Override
    public void addPlainText() {
        PLAIN_TEXT.add(nombrePacienteLink);
        PLAIN_TEXT.add(text2);
        PLAIN_TEXT.add(text3);
        PLAIN_TEXT.add(text4);
        PLAIN_TEXT.add(text5);
        PLAIN_TEXT.add(text6);
    }

    @Override
    public void addContainers() {
        CONTAINERS.add(container1);
    }
    
    public void setFirstPanel() {
        ApplicationContext.pacienteProfile.addPanels(ApplicationContext.generales, ApplicationContext.datosGenerales);
    }

    @Override
    public void initStyles() {
        editIcon.setSize(30, 28);
        Tools.setImageLabel(editIcon, "src/com/assets/editar.png", 12, 10, ChoosedPalette.getWhite());
        paintOneContainer(editButton, ChoosedPalette.getMidColor());
        addContainerButtons();
        ApplicationContext.pacienteProfile.addPanels(ApplicationContext.generales, ApplicationContext.datosGenerales);
        Tools.showPanel(contentPacient, ApplicationContext.pacienteProfile, 10, 10);
        text6.setForeground(ChoosedPalette.getMidColor());
        datosContainer.setBorder(new MatteBorder(0, 0, 3, 0, ChoosedPalette.getMidColor()));
        image.setSize(50, 50);
    }
    
    @Override
    public void light() {
        CONTAINERS.forEach(container -> {
            container.setkFillBackground(false);
            container.setkStartColor(ChoosedPalette.getGray());
            container.setkEndColor(ChoosedPalette.getGray());
            container.repaint();
        });
        
        Tools.setImage(image, "src/com/images/user.png", 0, 0);
    }
    
    @Override
    public void dark() {
        CONTAINERS.forEach(container -> {
            container.setkFillBackground(true);
            container.setkStartColor(ChoosedPalette.getPrimaryBackground());
            container.setkEndColor(ChoosedPalette.getPrimaryBackground());
            container.repaint();
        });
        
        Tools.setImage(image, "src/com/images/dark-user.png", 0, 0);
    }
     
    public void mostrarPanel(JPanel panel) {
        Tools.showPanel(contentPacient, panel, 10, 10);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        text2 = new javax.swing.JLabel();
        nombrePacienteLink = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        container1 = new com.k33ptoo.components.KGradientPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        image = new javax.swing.JLabel();
        nombrePaciente = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        editButton = new com.k33ptoo.components.KGradientPanel();
        editIcon = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        needBorder = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        ortodonciaContainer = new javax.swing.JPanel();
        text5 = new javax.swing.JLabel();
        datosContainer = new javax.swing.JPanel();
        text6 = new javax.swing.JLabel();
        odontologiaContainer = new javax.swing.JPanel();
        text4 = new javax.swing.JLabel();
        agendaContainer = new javax.swing.JPanel();
        text3 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        contentPacient = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(900, 569));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1060, 569));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 35));
        jPanel1.setMinimumSize(new java.awt.Dimension(1060, 35));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1060, 35));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setMinimumSize(new java.awt.Dimension(14, 0));
        jPanel10.setOpaque(false);
        jPanel10.setPreferredSize(new java.awt.Dimension(14, 35));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel10, java.awt.BorderLayout.LINE_END);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setMinimumSize(new java.awt.Dimension(14, 0));
        jPanel11.setOpaque(false);
        jPanel11.setPreferredSize(new java.awt.Dimension(14, 35));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel11, java.awt.BorderLayout.LINE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setOpaque(false);

        text2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text2.setForeground(new java.awt.Color(102, 102, 102));
        text2.setText("Pacientes  /");
        text2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        text2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                text2MouseClicked(evt);
            }
        });

        nombrePacienteLink.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        nombrePacienteLink.setForeground(new java.awt.Color(102, 102, 102));
        nombrePacienteLink.setText(" Daniel Alessandro Garcia Batres");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombrePacienteLink)
                .addContainerGap(762, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text2)
                    .addComponent(nombrePacienteLink))
                .addContainerGap())
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setMinimumSize(new java.awt.Dimension(14, 0));
        jPanel12.setOpaque(false);
        jPanel12.setPreferredSize(new java.awt.Dimension(14, 35));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel12, java.awt.BorderLayout.LINE_START);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setMinimumSize(new java.awt.Dimension(14, 0));
        jPanel13.setOpaque(false);
        jPanel13.setPreferredSize(new java.awt.Dimension(14, 35));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel13, java.awt.BorderLayout.LINE_END);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setOpaque(false);
        jPanel18.setPreferredSize(new java.awt.Dimension(200, 8));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
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

        container1.setBackground(new java.awt.Color(255, 255, 255));
        container1.setkEndColor(new java.awt.Color(204, 204, 204));
        container1.setkFillBackground(false);
        container1.setkStartColor(new java.awt.Color(204, 204, 204));
        container1.setOpaque(false);
        container1.setLayout(new java.awt.BorderLayout());

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setMinimumSize(new java.awt.Dimension(14, 0));
        jPanel14.setOpaque(false);
        jPanel14.setPreferredSize(new java.awt.Dimension(14, 35));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );

        container1.add(jPanel14, java.awt.BorderLayout.LINE_START);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setMinimumSize(new java.awt.Dimension(14, 0));
        jPanel15.setOpaque(false);
        jPanel15.setPreferredSize(new java.awt.Dimension(14, 35));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );

        container1.add(jPanel15, java.awt.BorderLayout.LINE_END);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setOpaque(false);
        jPanel20.setPreferredSize(new java.awt.Dimension(820, 12));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1032, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        container1.add(jPanel20, java.awt.BorderLayout.PAGE_END);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setOpaque(false);
        jPanel21.setPreferredSize(new java.awt.Dimension(200, 14));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1032, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        container1.add(jPanel21, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setMinimumSize(new java.awt.Dimension(1004, 65));
        jPanel5.setOpaque(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(1004, 65));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setOpaque(false);
        jPanel22.setPreferredSize(new java.awt.Dimension(200, 5));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1004, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel22, java.awt.BorderLayout.PAGE_START);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setOpaque(false);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1004, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel23, java.awt.BorderLayout.PAGE_END);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.GridLayout(1, 2));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setMinimumSize(new java.awt.Dimension(14, 0));
        jPanel16.setOpaque(false);
        jPanel16.setPreferredSize(new java.awt.Dimension(14, 35));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 59, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel16, java.awt.BorderLayout.LINE_END);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setMinimumSize(new java.awt.Dimension(14, 0));
        jPanel17.setOpaque(false);
        jPanel17.setPreferredSize(new java.awt.Dimension(14, 35));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkBorderRadius(50);
        kGradientPanel2.setkEndColor(new java.awt.Color(153, 153, 153));
        kGradientPanel2.setkStartColor(new java.awt.Color(153, 153, 153));
        kGradientPanel2.setOpaque(false);
        kGradientPanel2.setPreferredSize(new java.awt.Dimension(50, 50));
        kGradientPanel2.setLayout(new java.awt.BorderLayout());
        kGradientPanel2.add(image, java.awt.BorderLayout.CENTER);

        jPanel17.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 51));

        nombrePaciente.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        nombrePaciente.setForeground(new java.awt.Color(0, 0, 0));
        nombrePaciente.setText("Daniel Alessandro Garcia Batres");
        jPanel17.add(nombrePaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, 50));

        jPanel8.add(jPanel17, java.awt.BorderLayout.CENTER);

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setMinimumSize(new java.awt.Dimension(14, 0));
        jPanel24.setOpaque(false);
        jPanel24.setPreferredSize(new java.awt.Dimension(14, 35));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 59, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel24, java.awt.BorderLayout.LINE_START);

        jPanel7.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setOpaque(false);
        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setMinimumSize(new java.awt.Dimension(14, 0));
        jPanel25.setOpaque(false);
        jPanel25.setPreferredSize(new java.awt.Dimension(14, 35));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 59, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel25, java.awt.BorderLayout.LINE_END);

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setMinimumSize(new java.awt.Dimension(14, 0));
        jPanel26.setOpaque(false);
        jPanel26.setPreferredSize(new java.awt.Dimension(14, 35));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 59, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel26, java.awt.BorderLayout.LINE_START);

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setOpaque(false);
        jPanel27.setLayout(new java.awt.BorderLayout());

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setOpaque(false);
        jPanel28.setPreferredSize(new java.awt.Dimension(820, 6));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        jPanel27.add(jPanel28, java.awt.BorderLayout.PAGE_START);

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setOpaque(false);
        jPanel29.setPreferredSize(new java.awt.Dimension(820, 5));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel27.add(jPanel29, java.awt.BorderLayout.PAGE_END);

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setMaximumSize(new java.awt.Dimension(14, 32767));
        jPanel31.setMinimumSize(new java.awt.Dimension(14, 0));
        jPanel31.setOpaque(false);
        jPanel31.setPreferredSize(new java.awt.Dimension(14, 35));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel27.add(jPanel31, java.awt.BorderLayout.LINE_END);

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setOpaque(false);

        editButton.setkEndColor(new java.awt.Color(0, 0, 0));
        editButton.setkStartColor(new java.awt.Color(0, 0, 0));
        editButton.setOpaque(false);
        editButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editButtonMouseClicked(evt);
            }
        });

        editIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Editar informacion");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout editButtonLayout = new javax.swing.GroupLayout(editButton);
        editButton.setLayout(editButtonLayout);
        editButtonLayout.setHorizontalGroup(
            editButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editButtonLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(editIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        editButtonLayout.setVerticalGroup(
            editButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addContainerGap(274, Short.MAX_VALUE)
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel27.add(jPanel32, java.awt.BorderLayout.CENTER);

        jPanel9.add(jPanel27, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel9);

        jPanel5.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.BorderLayout());

        needBorder.setBackground(new java.awt.Color(255, 255, 255));
        needBorder.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        needBorder.setOpaque(false);
        needBorder.setPreferredSize(new java.awt.Dimension(1004, 30));
        needBorder.setLayout(new java.awt.GridLayout(1, 2));

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.setOpaque(false);
        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ortodonciaContainer.setBackground(new java.awt.Color(255, 255, 255));
        ortodonciaContainer.setOpaque(false);
        ortodonciaContainer.setPreferredSize(new java.awt.Dimension(100, 30));

        text5.setBackground(new java.awt.Color(153, 153, 153));
        text5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text5.setForeground(new java.awt.Color(153, 153, 153));
        text5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text5.setText("Ficha de ortodoncia");
        text5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        text5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                text5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ortodonciaContainerLayout = new javax.swing.GroupLayout(ortodonciaContainer);
        ortodonciaContainer.setLayout(ortodonciaContainerLayout);
        ortodonciaContainerLayout.setHorizontalGroup(
            ortodonciaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ortodonciaContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ortodonciaContainerLayout.setVerticalGroup(
            ortodonciaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ortodonciaContainerLayout.createSequentialGroup()
                .addComponent(text5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel33.add(ortodonciaContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 128, -1));

        datosContainer.setBackground(new java.awt.Color(255, 255, 255));
        datosContainer.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        datosContainer.setOpaque(false);
        datosContainer.setPreferredSize(new java.awt.Dimension(100, 30));

        text6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text6.setForeground(new java.awt.Color(0, 0, 0));
        text6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text6.setText("Datos generales");
        text6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        text6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                text6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout datosContainerLayout = new javax.swing.GroupLayout(datosContainer);
        datosContainer.setLayout(datosContainerLayout);
        datosContainerLayout.setHorizontalGroup(
            datosContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text6, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );
        datosContainerLayout.setVerticalGroup(
            datosContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosContainerLayout.createSequentialGroup()
                .addComponent(text6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        jPanel33.add(datosContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 110, -1));

        odontologiaContainer.setBackground(new java.awt.Color(255, 255, 255));
        odontologiaContainer.setOpaque(false);
        odontologiaContainer.setPreferredSize(new java.awt.Dimension(100, 30));

        text4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text4.setForeground(new java.awt.Color(153, 153, 153));
        text4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text4.setText("Ficha de odontología");
        text4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        text4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                text4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout odontologiaContainerLayout = new javax.swing.GroupLayout(odontologiaContainer);
        odontologiaContainer.setLayout(odontologiaContainerLayout);
        odontologiaContainerLayout.setHorizontalGroup(
            odontologiaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, odontologiaContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text4, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );
        odontologiaContainerLayout.setVerticalGroup(
            odontologiaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(odontologiaContainerLayout.createSequentialGroup()
                .addComponent(text4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel33.add(odontologiaContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 140, -1));

        agendaContainer.setBackground(new java.awt.Color(255, 255, 255));
        agendaContainer.setOpaque(false);
        agendaContainer.setPreferredSize(new java.awt.Dimension(100, 30));

        text3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text3.setForeground(new java.awt.Color(153, 153, 153));
        text3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text3.setText("Agenda");
        text3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        text3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                text3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout agendaContainerLayout = new javax.swing.GroupLayout(agendaContainer);
        agendaContainer.setLayout(agendaContainerLayout);
        agendaContainerLayout.setHorizontalGroup(
            agendaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agendaContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        agendaContainerLayout.setVerticalGroup(
            agendaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agendaContainerLayout.createSequentialGroup()
                .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel33.add(agendaContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 90, -1));

        needBorder.add(jPanel33);

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));
        jPanel34.setOpaque(false);

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        needBorder.add(jPanel34);

        jPanel6.add(needBorder, java.awt.BorderLayout.PAGE_START);

        contentPacient.setBackground(new java.awt.Color(255, 255, 255));
        contentPacient.setOpaque(false);
        contentPacient.setLayout(new java.awt.GridLayout(1, 1));
        jPanel6.add(contentPacient, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel6, java.awt.BorderLayout.CENTER);

        container1.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel2.add(container1, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void text6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text6MouseClicked
        setSelectionNavigation(containerButton, text6, datosContainer);
        ApplicationContext.pacienteProfile.addPanels(ApplicationContext.generales, ApplicationContext.datosGenerales);
        Tools.showPanel(contentPacient, ApplicationContext.pacienteProfile, 10, 10);
    }//GEN-LAST:event_text6MouseClicked

    private void text3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text3MouseClicked
        setSelectionNavigation(containerButton, text3, agendaContainer);
        Tools.showPanel(contentPacient, ApplicationContext.agendaPaciente, 10, 10);
    }//GEN-LAST:event_text3MouseClicked

    private void text4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text4MouseClicked
        setSelectionNavigation(containerButton, text4, odontologiaContainer);
        if (ApplicationContext.selectedPacient.isTratamientoOdontologico()) {
            ApplicationContext.selectedTreatment = "odontologia";
            ApplicationContext.selectedTreatmentInOut = "odontologiaOut";
            ApplicationContext.pacienteProfile.addPanels(ApplicationContext.datosOdontologia, ApplicationContext.odontologiaDatos);
            Tools.showPanel(contentPacient, ApplicationContext.pacienteProfile, 10, 10);
            ApplicationContext.odontologiaDatos.addTargets();
        } else {
            Tools.showPanel(contentPacient, ApplicationContext.noPerteneceOdontologia, 10, 10);
        }
    }//GEN-LAST:event_text4MouseClicked

    private void text5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text5MouseClicked
        setSelectionNavigation(containerButton, text5, ortodonciaContainer);
        if (ApplicationContext.selectedPacient.isTratamientoOrtodontico()) {
            ApplicationContext.selectedTreatment = "ortodoncia";
            ApplicationContext.selectedTreatmentInOut = "ortodonciaOut";
            ApplicationContext.pacienteProfile.addPanels(ApplicationContext.datosOrtodoncia, ApplicationContext.ortodonciaDatos);
            Tools.showPanel(contentPacient, ApplicationContext.pacienteProfile, 10, 10);
            ApplicationContext.ortodonciaDatos.addTargets();
        } else {
            Tools.showPanel(contentPacient, ApplicationContext.noPerteneceOrtodoncia, 10, 10);
        }
    }//GEN-LAST:event_text5MouseClicked

    private void text2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text2MouseClicked
        ApplicationContext.mainInterface.mostrarPanel(ApplicationContext.pacientes);
    }//GEN-LAST:event_text2MouseClicked

    private void editButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseClicked
        ApplicationContext.modificarInformacionPaciente.setData(ApplicationContext.selectedPacient);
        ApplicationContext.mainInterface.mostrarPanel(ApplicationContext.modificarPaciente);
    }//GEN-LAST:event_editButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel agendaContainer;
    private com.k33ptoo.components.KGradientPanel container1;
    private javax.swing.JPanel contentPacient;
    private javax.swing.JPanel datosContainer;
    private com.k33ptoo.components.KGradientPanel editButton;
    private javax.swing.JLabel editIcon;
    private javax.swing.JLabel image;
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
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JPanel needBorder;
    private javax.swing.JLabel nombrePaciente;
    private javax.swing.JLabel nombrePacienteLink;
    private javax.swing.JPanel odontologiaContainer;
    private javax.swing.JPanel ortodonciaContainer;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel text4;
    private javax.swing.JLabel text5;
    private javax.swing.JLabel text6;
    // End of variables declaration//GEN-END:variables

    
}
