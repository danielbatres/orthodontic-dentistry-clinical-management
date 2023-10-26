package com.view.welcomeView;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.context.SesionUsuario;
import com.model.AsistenteModel;
import com.model.DoctorModel;
import com.utils.Styles;
import com.utils.Tools;

/**
 * <h2>Welcome</h2>
 * 
 * @author Daniel Batres
 * @version 1.0.0
 * @since 17/09/22
 */
public final class Welcome extends Styles {

    /**
     * Creates new form Welcome
     */
    public Welcome() {
        initComponents();
        styleMyComponentBaby();
    }
    
    @Override
    public void addTitlesAndSubtitles() {
        TITLES_AND_SUBTITLES.add(textBienvenido);
        TITLES_AND_SUBTITLES.add(textClinica);
        TITLES_AND_SUBTITLES.add(textComencemos);
        TITLES_AND_SUBTITLES.add(soyDoctor);
        TITLES_AND_SUBTITLES.add(soyAsistente);
    }
    
    @Override
    public void addPlainText() {
        PLAIN_TEXT.add(textGestion);
        PLAIN_TEXT.add(textGestion2);
        PLAIN_TEXT.add(textDoctor);
        PLAIN_TEXT.add(textAsistente);
    }
    
    @Override
    public void addContainers() {
        CONTAINERS.add(mainDoctorButton);
        CONTAINERS.add(mainAsistentButton);
        CONTAINERS.add(doctorButton);
        CONTAINERS.add(asistenteButton);
    }
    
    @Override
    public void addIconContainers() {
        ICON_CONTAINERS.add(doctorIcon);
        ICON_CONTAINERS.add(asistenteIcon);
    }
    
    @Override
    public void initStyles() {
        doctorButtonContainer.setSize(58, 63);
        asistenteButtonContainer.setSize(58, 63);
        anguloDerecho.setSize(58, 63);
        anguloDerecho1.setSize(58, 63);
        diente.setSize(41, 45);
        asistente.setSize(41, 45);
        Tools.setImageLabel(anguloDerecho, "src/com/assets/anguloderecho.png", 32, 40, ChoosedPalette.getDarkColor());
        Tools.setImageLabel(diente, "src/com/assets/diente.png", 22, 27, ChoosedPalette.getWhite());
        Tools.setImageLabel(anguloDerecho1, "src/com/assets/anguloderecho.png", 32, 40, ChoosedPalette.getDarkColor());
        Tools.setImageLabel(asistente, "src/com/assets/usuario.png", 22, 27, ChoosedPalette.getWhite());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeView = new javax.swing.JPanel();
        marginLeft = new javax.swing.JPanel();
        marginRigth = new javax.swing.JPanel();
        marginTop = new javax.swing.JPanel();
        marginBottom = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        mainTitle = new javax.swing.JPanel();
        contentInfo = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        contentInfo2 = new javax.swing.JPanel();
        textClinica = new javax.swing.JLabel();
        textBienvenido = new javax.swing.JLabel();
        textComencemos = new javax.swing.JLabel();
        textInfo2 = new javax.swing.JPanel();
        textGestion = new javax.swing.JLabel();
        textGestion2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        buttons = new javax.swing.JPanel();
        contentButtons = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        contentButtons3 = new javax.swing.JPanel();
        mainDoctorButton = new com.k33ptoo.components.KGradientPanel();
        doctorButton = new com.k33ptoo.components.KGradientPanel();
        doctorButtonContainer = new javax.swing.JPanel();
        anguloDerecho = new javax.swing.JLabel();
        infoDoctorButton = new javax.swing.JPanel();
        soyDoctor = new javax.swing.JLabel();
        textDoctor = new javax.swing.JLabel();
        doctorIcon = new com.k33ptoo.components.KGradientPanel();
        diente = new javax.swing.JLabel();
        mainAsistentButton = new com.k33ptoo.components.KGradientPanel();
        asistenteButton = new com.k33ptoo.components.KGradientPanel();
        asistenteButtonContainer = new javax.swing.JPanel();
        anguloDerecho1 = new javax.swing.JLabel();
        infoAsistentButton = new javax.swing.JPanel();
        soyAsistente = new javax.swing.JLabel();
        textAsistente = new javax.swing.JLabel();
        asistenteIcon = new com.k33ptoo.components.KGradientPanel();
        asistente = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setForeground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(640, 670));
        setMinimumSize(new java.awt.Dimension(640, 670));
        setLayout(new java.awt.BorderLayout());

        welcomeView.setBackground(new java.awt.Color(255, 255, 255));
        welcomeView.setLayout(new java.awt.BorderLayout());

        marginLeft.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout marginLeftLayout = new javax.swing.GroupLayout(marginLeft);
        marginLeft.setLayout(marginLeftLayout);
        marginLeftLayout.setHorizontalGroup(
            marginLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        marginLeftLayout.setVerticalGroup(
            marginLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        welcomeView.add(marginLeft, java.awt.BorderLayout.LINE_START);

        marginRigth.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout marginRigthLayout = new javax.swing.GroupLayout(marginRigth);
        marginRigth.setLayout(marginRigthLayout);
        marginRigthLayout.setHorizontalGroup(
            marginRigthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        marginRigthLayout.setVerticalGroup(
            marginRigthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        welcomeView.add(marginRigth, java.awt.BorderLayout.LINE_END);

        marginTop.setBackground(new java.awt.Color(255, 255, 255));
        marginTop.setMinimumSize(new java.awt.Dimension(100, 50));
        marginTop.setPreferredSize(new java.awt.Dimension(640, 50));

        javax.swing.GroupLayout marginTopLayout = new javax.swing.GroupLayout(marginTop);
        marginTop.setLayout(marginTopLayout);
        marginTopLayout.setHorizontalGroup(
            marginTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        marginTopLayout.setVerticalGroup(
            marginTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        welcomeView.add(marginTop, java.awt.BorderLayout.PAGE_START);

        marginBottom.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout marginBottomLayout = new javax.swing.GroupLayout(marginBottom);
        marginBottom.setLayout(marginBottomLayout);
        marginBottomLayout.setHorizontalGroup(
            marginBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        marginBottomLayout.setVerticalGroup(
            marginBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        welcomeView.add(marginBottom, java.awt.BorderLayout.PAGE_END);

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setForeground(new java.awt.Color(0, 0, 0));
        content.setLayout(new java.awt.GridLayout(2, 1));

        mainTitle.setBackground(new java.awt.Color(255, 255, 255));
        mainTitle.setForeground(new java.awt.Color(0, 0, 0));
        mainTitle.setLayout(new java.awt.BorderLayout());

        contentInfo.setBackground(new java.awt.Color(255, 255, 255));
        contentInfo.setForeground(new java.awt.Color(0, 0, 0));
        contentInfo.setMaximumSize(new java.awt.Dimension(32767, 200));
        contentInfo.setLayout(new javax.swing.BoxLayout(contentInfo, javax.swing.BoxLayout.X_AXIS));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        contentInfo.add(jPanel4);

        contentInfo2.setBackground(new java.awt.Color(255, 255, 255));
        contentInfo2.setForeground(new java.awt.Color(0, 0, 0));
        contentInfo2.setMaximumSize(new java.awt.Dimension(32767, 200));
        contentInfo2.setMinimumSize(new java.awt.Dimension(250, 200));
        contentInfo2.setPreferredSize(new java.awt.Dimension(440, 200));

        textClinica.setBackground(new java.awt.Color(255, 255, 255));
        textClinica.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 30)); // NOI18N
        textClinica.setForeground(new java.awt.Color(0, 0, 0));
        textClinica.setText("Gestión clínica");

        textBienvenido.setBackground(new java.awt.Color(255, 255, 255));
        textBienvenido.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 30)); // NOI18N
        textBienvenido.setForeground(new java.awt.Color(102, 51, 255));
        textBienvenido.setText("Bienvenido a");
        textBienvenido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textBienvenidoMouseEntered(evt);
            }
        });

        textComencemos.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        textComencemos.setForeground(new java.awt.Color(0, 0, 0));
        textComencemos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textComencemos.setText("¡Comencemos!");

        textInfo2.setBackground(new java.awt.Color(255, 255, 255));
        textInfo2.setForeground(new java.awt.Color(102, 102, 102));
        textInfo2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textGestion.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        textGestion.setForeground(new java.awt.Color(153, 153, 153));
        textGestion.setText("Gestion clinica especializada, seleccione una de las opciones");
        textGestion.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        textInfo2.add(textGestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, -1));

        textGestion2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        textGestion2.setForeground(new java.awt.Color(153, 153, 153));
        textGestion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textGestion2.setText("a continuación para ingresar");
        textGestion2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        textInfo2.add(textGestion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 20));

        javax.swing.GroupLayout contentInfo2Layout = new javax.swing.GroupLayout(contentInfo2);
        contentInfo2.setLayout(contentInfo2Layout);
        contentInfo2Layout.setHorizontalGroup(
            contentInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentInfo2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textInfo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textClinica)
                    .addComponent(textBienvenido)
                    .addComponent(textComencemos))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        contentInfo2Layout.setVerticalGroup(
            contentInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentInfo2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(textBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textClinica)
                .addGap(18, 18, 18)
                .addComponent(textComencemos)
                .addGap(12, 12, 12)
                .addComponent(textInfo2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        contentInfo.add(contentInfo2);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        contentInfo.add(jPanel6);

        mainTitle.add(contentInfo, java.awt.BorderLayout.PAGE_END);

        content.add(mainTitle);

        buttons.setBackground(new java.awt.Color(255, 255, 255));
        buttons.setForeground(new java.awt.Color(0, 0, 0));
        buttons.setLayout(new java.awt.BorderLayout());

        contentButtons.setBackground(new java.awt.Color(255, 255, 255));
        contentButtons.setForeground(new java.awt.Color(0, 0, 0));
        contentButtons.setMaximumSize(new java.awt.Dimension(32767, 200));
        contentButtons.setLayout(new javax.swing.BoxLayout(contentButtons, javax.swing.BoxLayout.X_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        contentButtons.add(jPanel1);

        contentButtons3.setBackground(new java.awt.Color(255, 255, 255));
        contentButtons3.setForeground(new java.awt.Color(0, 0, 0));
        contentButtons3.setMaximumSize(new java.awt.Dimension(32767, 200));
        contentButtons3.setMinimumSize(new java.awt.Dimension(250, 200));
        contentButtons3.setPreferredSize(new java.awt.Dimension(440, 200));

        mainDoctorButton.setBackground(new java.awt.Color(255, 255, 255));
        mainDoctorButton.setForeground(new java.awt.Color(0, 0, 0));
        mainDoctorButton.setkEndColor(new java.awt.Color(0, 0, 0));
        mainDoctorButton.setkFillBackground(false);
        mainDoctorButton.setkStartColor(new java.awt.Color(0, 0, 0));
        mainDoctorButton.setMaximumSize(new java.awt.Dimension(370, 75));
        mainDoctorButton.setMinimumSize(new java.awt.Dimension(370, 75));
        mainDoctorButton.setPreferredSize(new java.awt.Dimension(370, 75));
        mainDoctorButton.setLayout(new java.awt.BorderLayout());

        doctorButton.setBackground(new java.awt.Color(255, 255, 255));
        doctorButton.setForeground(new java.awt.Color(0, 0, 0));
        doctorButton.setkEndColor(new java.awt.Color(0, 0, 0));
        doctorButton.setkFillBackground(false);
        doctorButton.setkStartColor(new java.awt.Color(0, 0, 0));
        doctorButton.setMaximumSize(new java.awt.Dimension(70, 75));
        doctorButton.setMinimumSize(new java.awt.Dimension(70, 75));
        doctorButton.setNextFocusableComponent(doctorButtonContainer);
        doctorButton.setOpaque(false);
        doctorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doctorButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                doctorButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                doctorButtonMouseExited(evt);
            }
        });
        doctorButton.setLayout(new java.awt.BorderLayout());

        doctorButtonContainer.setBackground(new java.awt.Color(255, 255, 255));
        doctorButtonContainer.setForeground(new java.awt.Color(0, 0, 0));
        doctorButtonContainer.setMaximumSize(new java.awt.Dimension(58, 63));
        doctorButtonContainer.setOpaque(false);
        doctorButtonContainer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doctorButtonContainerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                doctorButtonContainerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                doctorButtonContainerMouseExited(evt);
            }
        });
        doctorButtonContainer.setLayout(new java.awt.BorderLayout());

        anguloDerecho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        anguloDerecho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        anguloDerecho.setMaximumSize(new java.awt.Dimension(75, 63));
        anguloDerecho.setMinimumSize(new java.awt.Dimension(75, 63));
        anguloDerecho.setPreferredSize(new java.awt.Dimension(75, 63));
        anguloDerecho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anguloDerechoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                anguloDerechoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                anguloDerechoMouseExited(evt);
            }
        });
        doctorButtonContainer.add(anguloDerecho, java.awt.BorderLayout.CENTER);

        doctorButton.add(doctorButtonContainer, java.awt.BorderLayout.CENTER);

        mainDoctorButton.add(doctorButton, java.awt.BorderLayout.LINE_END);

        infoDoctorButton.setBackground(new java.awt.Color(255, 255, 255));
        infoDoctorButton.setForeground(new java.awt.Color(0, 0, 0));
        infoDoctorButton.setOpaque(false);

        soyDoctor.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        soyDoctor.setForeground(new java.awt.Color(0, 0, 0));
        soyDoctor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soyDoctor.setText("Soy, Doctor");

        textDoctor.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        textDoctor.setForeground(new java.awt.Color(153, 153, 153));
        textDoctor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textDoctor.setText("Gestion general para doctores");

        doctorIcon.setkBorderRadius(100);
        doctorIcon.setkEndColor(new java.awt.Color(153, 0, 153));
        doctorIcon.setkStartColor(new java.awt.Color(102, 255, 102));
        doctorIcon.setMinimumSize(new java.awt.Dimension(40, 40));
        doctorIcon.setOpaque(false);
        doctorIcon.setLayout(new java.awt.BorderLayout());

        diente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doctorIcon.add(diente, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout infoDoctorButtonLayout = new javax.swing.GroupLayout(infoDoctorButton);
        infoDoctorButton.setLayout(infoDoctorButtonLayout);
        infoDoctorButtonLayout.setHorizontalGroup(
            infoDoctorButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoDoctorButtonLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(infoDoctorButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(soyDoctor)
                    .addComponent(textDoctor))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(infoDoctorButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(infoDoctorButtonLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(doctorIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(239, Short.MAX_VALUE)))
        );
        infoDoctorButtonLayout.setVerticalGroup(
            infoDoctorButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoDoctorButtonLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(soyDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textDoctor)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(infoDoctorButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(infoDoctorButtonLayout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(doctorIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(18, Short.MAX_VALUE)))
        );

        mainDoctorButton.add(infoDoctorButton, java.awt.BorderLayout.CENTER);

        mainAsistentButton.setBackground(new java.awt.Color(255, 255, 255));
        mainAsistentButton.setForeground(new java.awt.Color(0, 0, 0));
        mainAsistentButton.setkEndColor(new java.awt.Color(0, 0, 0));
        mainAsistentButton.setkFillBackground(false);
        mainAsistentButton.setkStartColor(new java.awt.Color(0, 0, 0));
        mainAsistentButton.setMaximumSize(new java.awt.Dimension(370, 75));
        mainAsistentButton.setMinimumSize(new java.awt.Dimension(370, 75));
        mainAsistentButton.setPreferredSize(new java.awt.Dimension(370, 75));
        mainAsistentButton.setLayout(new java.awt.BorderLayout());

        asistenteButton.setBackground(new java.awt.Color(255, 255, 255));
        asistenteButton.setForeground(new java.awt.Color(0, 0, 0));
        asistenteButton.setkEndColor(new java.awt.Color(0, 0, 0));
        asistenteButton.setkFillBackground(false);
        asistenteButton.setkStartColor(new java.awt.Color(0, 0, 0));
        asistenteButton.setMaximumSize(new java.awt.Dimension(75, 75));
        asistenteButton.setMinimumSize(new java.awt.Dimension(75, 75));
        asistenteButton.setOpaque(false);
        asistenteButton.setPreferredSize(new java.awt.Dimension(75, 75));
        asistenteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                asistenteButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                asistenteButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                asistenteButtonMouseExited(evt);
            }
        });
        asistenteButton.setLayout(new java.awt.BorderLayout());

        asistenteButtonContainer.setBackground(new java.awt.Color(255, 255, 255));
        asistenteButtonContainer.setForeground(new java.awt.Color(0, 0, 0));
        asistenteButtonContainer.setMaximumSize(new java.awt.Dimension(58, 63));
        asistenteButtonContainer.setOpaque(false);
        asistenteButtonContainer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                asistenteButtonContainerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                asistenteButtonContainerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                asistenteButtonContainerMouseExited(evt);
            }
        });
        asistenteButtonContainer.setLayout(new java.awt.BorderLayout());

        anguloDerecho1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        anguloDerecho1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        anguloDerecho1.setMaximumSize(new java.awt.Dimension(58, 63));
        anguloDerecho1.setMinimumSize(new java.awt.Dimension(58, 63));
        anguloDerecho1.setPreferredSize(new java.awt.Dimension(58, 63));
        anguloDerecho1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anguloDerecho1MouseClicked(evt);
            }
        });
        asistenteButtonContainer.add(anguloDerecho1, java.awt.BorderLayout.CENTER);

        asistenteButton.add(asistenteButtonContainer, java.awt.BorderLayout.CENTER);

        mainAsistentButton.add(asistenteButton, java.awt.BorderLayout.LINE_END);

        infoAsistentButton.setBackground(new java.awt.Color(255, 255, 255));
        infoAsistentButton.setForeground(new java.awt.Color(0, 0, 0));
        infoAsistentButton.setOpaque(false);

        soyAsistente.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        soyAsistente.setForeground(new java.awt.Color(0, 0, 0));
        soyAsistente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soyAsistente.setText("Soy, Asistente");

        textAsistente.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        textAsistente.setForeground(new java.awt.Color(153, 153, 153));
        textAsistente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textAsistente.setText("Gestion general para asistentes");

        asistenteIcon.setkBorderRadius(100);
        asistenteIcon.setkStartColor(new java.awt.Color(0, 102, 204));
        asistenteIcon.setMinimumSize(new java.awt.Dimension(40, 40));
        asistenteIcon.setOpaque(false);
        asistenteIcon.setLayout(new java.awt.BorderLayout());

        asistente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asistenteIcon.add(asistente, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout infoAsistentButtonLayout = new javax.swing.GroupLayout(infoAsistentButton);
        infoAsistentButton.setLayout(infoAsistentButtonLayout);
        infoAsistentButtonLayout.setHorizontalGroup(
            infoAsistentButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoAsistentButtonLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(asistenteIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(infoAsistentButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(soyAsistente)
                    .addComponent(textAsistente))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        infoAsistentButtonLayout.setVerticalGroup(
            infoAsistentButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoAsistentButtonLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(infoAsistentButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(asistenteIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(infoAsistentButtonLayout.createSequentialGroup()
                        .addComponent(soyAsistente, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textAsistente)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        mainAsistentButton.add(infoAsistentButton, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout contentButtons3Layout = new javax.swing.GroupLayout(contentButtons3);
        contentButtons3.setLayout(contentButtons3Layout);
        contentButtons3Layout.setHorizontalGroup(
            contentButtons3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentButtons3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentButtons3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainDoctorButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainAsistentButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        contentButtons3Layout.setVerticalGroup(
            contentButtons3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentButtons3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(mainDoctorButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mainAsistentButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        contentButtons.add(contentButtons3);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        contentButtons.add(jPanel3);

        buttons.add(contentButtons, java.awt.BorderLayout.PAGE_START);

        content.add(buttons);

        welcomeView.add(content, java.awt.BorderLayout.CENTER);

        add(welcomeView, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void doctorButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorButtonMouseEntered

    private void doctorButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorButtonMouseExited

    private void asistenteButtonContainerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asistenteButtonContainerMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_asistenteButtonContainerMouseEntered

    private void asistenteButtonContainerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asistenteButtonContainerMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_asistenteButtonContainerMouseExited

    private void asistenteButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asistenteButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_asistenteButtonMouseEntered

    private void asistenteButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asistenteButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_asistenteButtonMouseExited

    private void textBienvenidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textBienvenidoMouseEntered

    }//GEN-LAST:event_textBienvenidoMouseEntered

    private void anguloDerecho1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anguloDerecho1MouseClicked
        ApplicationContext.welcomeScreen.mostrarPanel(ApplicationContext.login);
        ApplicationContext.sesionUsuario = new SesionUsuario<>(new AsistenteModel());
    }//GEN-LAST:event_anguloDerecho1MouseClicked

    private void doctorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorButtonMouseClicked
        
    }//GEN-LAST:event_doctorButtonMouseClicked

    private void asistenteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asistenteButtonMouseClicked

    }//GEN-LAST:event_asistenteButtonMouseClicked

    private void doctorButtonContainerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorButtonContainerMouseExited
        
    }//GEN-LAST:event_doctorButtonContainerMouseExited

    private void doctorButtonContainerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorButtonContainerMouseEntered
        
    }//GEN-LAST:event_doctorButtonContainerMouseEntered

    private void anguloDerechoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anguloDerechoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_anguloDerechoMouseExited

    private void anguloDerechoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anguloDerechoMouseEntered

    }//GEN-LAST:event_anguloDerechoMouseEntered

    private void anguloDerechoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anguloDerechoMouseClicked
        ApplicationContext.welcomeScreen.mostrarPanel(ApplicationContext.login);
        ApplicationContext.sesionUsuario = new SesionUsuario(new DoctorModel());
    }//GEN-LAST:event_anguloDerechoMouseClicked

    private void doctorButtonContainerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorButtonContainerMouseClicked
        
    }//GEN-LAST:event_doctorButtonContainerMouseClicked

    private void asistenteButtonContainerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asistenteButtonContainerMouseClicked
        
    }//GEN-LAST:event_asistenteButtonContainerMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anguloDerecho;
    private javax.swing.JLabel anguloDerecho1;
    private javax.swing.JLabel asistente;
    private com.k33ptoo.components.KGradientPanel asistenteButton;
    private javax.swing.JPanel asistenteButtonContainer;
    private com.k33ptoo.components.KGradientPanel asistenteIcon;
    private javax.swing.JPanel buttons;
    private javax.swing.JPanel content;
    private javax.swing.JPanel contentButtons;
    private javax.swing.JPanel contentButtons3;
    private javax.swing.JPanel contentInfo;
    private javax.swing.JPanel contentInfo2;
    private javax.swing.JLabel diente;
    private com.k33ptoo.components.KGradientPanel doctorButton;
    private javax.swing.JPanel doctorButtonContainer;
    private com.k33ptoo.components.KGradientPanel doctorIcon;
    private javax.swing.JPanel infoAsistentButton;
    private javax.swing.JPanel infoDoctorButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private com.k33ptoo.components.KGradientPanel mainAsistentButton;
    private com.k33ptoo.components.KGradientPanel mainDoctorButton;
    private javax.swing.JPanel mainTitle;
    private javax.swing.JPanel marginBottom;
    private javax.swing.JPanel marginLeft;
    private javax.swing.JPanel marginRigth;
    private javax.swing.JPanel marginTop;
    private javax.swing.JLabel soyAsistente;
    private javax.swing.JLabel soyDoctor;
    private javax.swing.JLabel textAsistente;
    private javax.swing.JLabel textBienvenido;
    private javax.swing.JLabel textClinica;
    private javax.swing.JLabel textComencemos;
    private javax.swing.JLabel textDoctor;
    private javax.swing.JLabel textGestion;
    private javax.swing.JLabel textGestion2;
    private javax.swing.JPanel textInfo2;
    private javax.swing.JPanel welcomeView;
    // End of variables declaration//GEN-END:variables

}
