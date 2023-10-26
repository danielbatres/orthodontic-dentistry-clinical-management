package com.view.readPct;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.model.ControlMensualModel;
import com.utils.Styles;
import com.utils.Tools;
import com.view.createPacient.NewContext;
import static com.view.createPacient.NewContext.dateTimeFormatter;
import java.time.LocalDateTime;

/**
 *
 * @author Daniel Batres
 */
public class ModificarControlFields extends Styles {

    /**
     * Creates new form NuevoControlFields
     */
    public ModificarControlFields() {
        initComponents();
        styleMyComponentBaby();
    }
    
    public ControlMensualModel getData() {
        ControlMensualModel controlMensual = new ControlMensualModel();
        
        controlMensual.setId(ApplicationContext.selectedControlMensual.getId());
        controlMensual.setMd(NewContext.emptyMessage(textField1.getText()));
        controlMensual.setMx(NewContext.emptyMessage(textField4.getText()));
        controlMensual.setCadenas(NewContext.emptyMessage(textField5.getText()));
        controlMensual.setHules(NewContext.emptyMessage(textField6.getText()));
        controlMensual.setObservaciones(NewContext.emptyMessage(textField7.getText()));
        controlMensual.setDiaCreacion(LocalDateTime.now().getDayOfMonth());
        controlMensual.setMesCreacion(LocalDateTime.now().getMonthValue());
        controlMensual.setAnnioCreacion(LocalDateTime.now().getYear());
        controlMensual.setHoraCreacion(String.valueOf(LocalDateTime.now().getHour()) + ":" + String.valueOf(LocalDateTime.now().getMinute()) + " " + NewContext.localTime.format(dateTimeFormatter));
        controlMensual.setDiaModificacion(LocalDateTime.now().getDayOfMonth());
        controlMensual.setMesModificacion(LocalDateTime.now().getMonthValue());
        controlMensual.setAnnioModificacion(LocalDateTime.now().getYear());
        controlMensual.setHoraModificacion(String.valueOf(LocalDateTime.now().getHour()) + ":" + String.valueOf(LocalDateTime.now().getMinute()) + " " + NewContext.localTime.format(dateTimeFormatter));

        return controlMensual;
    }
    
    public void setData(ControlMensualModel controlMensual) {
        textField1.setText(controlMensual.getMd());
        textField4.setText(controlMensual.getMx());
        textField5.setText(controlMensual.getCadenas());
        textField6.setText(controlMensual.getHules());
        textField7.setText(controlMensual.getObservaciones());
    }
    
    @Override
    public void addTitlesAndSubtitles() {
        TITLES_AND_SUBTITLES.add(title1);
        TITLES_AND_SUBTITLES.add(title2);
        TITLES_AND_SUBTITLES.add(title3);
        TITLES_AND_SUBTITLES.add(title4);
        TITLES_AND_SUBTITLES.add(title5);
        TITLES_AND_SUBTITLES.add(title6);
    }
    
    @Override
    public void addPlainText() {
        PLAIN_TEXT.add(text1);
    }
    
    @Override
    public void addTextFields() {
        TEXTFIELDS.add(textField1);
        TEXTFIELDS.add(textField4);
        TEXTFIELDS.add(textField5);
        TEXTFIELDS.add(textField6);
        TEXTFIELDS.add(textField7);
    }
    
    @Override
    public void addContainers() {
        CONTAINERS.add(container1);
        CONTAINERS.add(container4);
        CONTAINERS.add(container5);
        CONTAINERS.add(container6);
        CONTAINERS.add(container7);
    }
    
    @Override
    public void initStyles() {
        Tools.setScroll(scrollPanel);
        Tools.addMouseListenerIngresa(TEXTFIELDS);
        informationIcon.setSize(50, 50);
        Tools.setImageLabel(informationIcon, "src/com/assets/documento.png", 25, 25, ChoosedPalette.getWhite());
    }
    
    @Override
    public void colorBasics() {
        paintAll();
        content.setBackground(ChoosedPalette.getPrimaryBackground());
    }
    
    @Override
    public void dark() {
        // 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cont = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        text1 = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        kGradientPanel3 = new com.k33ptoo.components.KGradientPanel();
        informationIcon = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        scrollPanel = new javax.swing.JScrollPane();
        content = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        container1 = new com.k33ptoo.components.KGradientPanel();
        jPanel44 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        textField1 = new javax.swing.JTextField();
        title2 = new javax.swing.JLabel();
        advertenciaMd = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        container4 = new com.k33ptoo.components.KGradientPanel();
        jPanel50 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        textField4 = new javax.swing.JTextField();
        title3 = new javax.swing.JLabel();
        advertenciaMx = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        container5 = new com.k33ptoo.components.KGradientPanel();
        jPanel52 = new javax.swing.JPanel();
        jPanel53 = new javax.swing.JPanel();
        textField5 = new javax.swing.JTextField();
        title4 = new javax.swing.JLabel();
        advertenciaCadenas = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        container6 = new com.k33ptoo.components.KGradientPanel();
        jPanel54 = new javax.swing.JPanel();
        jPanel55 = new javax.swing.JPanel();
        textField6 = new javax.swing.JTextField();
        title5 = new javax.swing.JLabel();
        advertenciaNombre5 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        container7 = new com.k33ptoo.components.KGradientPanel();
        jPanel56 = new javax.swing.JPanel();
        jPanel57 = new javax.swing.JPanel();
        textField7 = new javax.swing.JTextField();
        title6 = new javax.swing.JLabel();
        advertenciaNombre6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(550, 390));
        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        cont.setOpaque(false);
        cont.setLayout(new javax.swing.BoxLayout(cont, javax.swing.BoxLayout.X_AXIS));

        jPanel5.setOpaque(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );

        cont.add(jPanel5);

        jPanel7.setMaximumSize(new java.awt.Dimension(550, 2147483647));
        jPanel7.setMinimumSize(new java.awt.Dimension(550, 100));
        jPanel7.setOpaque(false);
        jPanel7.setPreferredSize(new java.awt.Dimension(550, 382));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel8.setMinimumSize(new java.awt.Dimension(80, 80));
        jPanel8.setOpaque(false);
        jPanel8.setPreferredSize(new java.awt.Dimension(616, 80));

        text1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text1.setForeground(new java.awt.Color(153, 153, 153));
        text1.setText("Editar control mensual del paciente");

        title1.setBackground(new java.awt.Color(0, 0, 0));
        title1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        title1.setForeground(new java.awt.Color(0, 0, 0));
        title1.setText("Editar control mensual");

        kGradientPanel3.setkBorderRadius(100);
        kGradientPanel3.setkEndColor(new java.awt.Color(69, 98, 255));
        kGradientPanel3.setkStartColor(new java.awt.Color(69, 98, 255));
        kGradientPanel3.setMaximumSize(new java.awt.Dimension(50, 50));
        kGradientPanel3.setMinimumSize(new java.awt.Dimension(50, 50));
        kGradientPanel3.setOpaque(false);
        kGradientPanel3.setLayout(new java.awt.BorderLayout());

        informationIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kGradientPanel3.add(informationIcon, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 217, Short.MAX_VALUE))
                    .addComponent(text1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(title1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text1)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel8, java.awt.BorderLayout.PAGE_START);

        jPanel9.setOpaque(false);
        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel10.setOpaque(false);

        scrollPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        scrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPanel.setMaximumSize(new java.awt.Dimension(550, 32767));
        scrollPanel.setMinimumSize(new java.awt.Dimension(550, 5));

        content.setMaximumSize(new java.awt.Dimension(550, 32767));
        content.setMinimumSize(new java.awt.Dimension(500, 0));
        content.setPreferredSize(new java.awt.Dimension(500, 321));
        content.setLayout(new java.awt.GridLayout(3, 1));

        jPanel18.setOpaque(false);
        jPanel18.setLayout(new java.awt.GridLayout(1, 0));

        jPanel21.setOpaque(false);

        container1.setkEndColor(new java.awt.Color(204, 204, 204));
        container1.setkFillBackground(false);
        container1.setkStartColor(new java.awt.Color(204, 204, 204));
        container1.setMaximumSize(new java.awt.Dimension(32767, 45));
        container1.setMinimumSize(new java.awt.Dimension(100, 45));
        container1.setOpaque(false);
        container1.setLayout(new java.awt.BorderLayout());

        jPanel44.setMaximumSize(new java.awt.Dimension(5, 32767));
        jPanel44.setMinimumSize(new java.awt.Dimension(5, 100));
        jPanel44.setOpaque(false);
        jPanel44.setPreferredSize(new java.awt.Dimension(5, 45));

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container1.add(jPanel44, java.awt.BorderLayout.LINE_END);

        jPanel45.setMaximumSize(new java.awt.Dimension(10, 32767));
        jPanel45.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel45.setOpaque(false);
        jPanel45.setPreferredSize(new java.awt.Dimension(10, 45));

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container1.add(jPanel45, java.awt.BorderLayout.LINE_START);

        textField1.setBackground(new java.awt.Color(255, 255, 255));
        textField1.setText("Ingresar MD");
        textField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textField1.setOpaque(false);
        textField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField1KeyTyped(evt);
            }
        });
        container1.add(textField1, java.awt.BorderLayout.CENTER);

        title2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title2.setForeground(new java.awt.Color(0, 0, 0));
        title2.setText("MD");

        advertenciaMd.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        advertenciaMd.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(container1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(title2)
                        .addGap(18, 18, 18)
                        .addComponent(advertenciaMd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(title2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(advertenciaMd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel18.add(jPanel21);

        jPanel22.setOpaque(false);
        jPanel22.setLayout(new java.awt.GridLayout(1, 0));

        jPanel23.setOpaque(false);

        container4.setkEndColor(new java.awt.Color(204, 204, 204));
        container4.setkFillBackground(false);
        container4.setkStartColor(new java.awt.Color(204, 204, 204));
        container4.setMaximumSize(new java.awt.Dimension(32767, 45));
        container4.setMinimumSize(new java.awt.Dimension(100, 45));
        container4.setOpaque(false);
        container4.setLayout(new java.awt.BorderLayout());

        jPanel50.setMaximumSize(new java.awt.Dimension(5, 32767));
        jPanel50.setMinimumSize(new java.awt.Dimension(5, 100));
        jPanel50.setOpaque(false);
        jPanel50.setPreferredSize(new java.awt.Dimension(5, 45));

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container4.add(jPanel50, java.awt.BorderLayout.LINE_END);

        jPanel51.setMaximumSize(new java.awt.Dimension(10, 32767));
        jPanel51.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel51.setOpaque(false);
        jPanel51.setPreferredSize(new java.awt.Dimension(10, 45));

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container4.add(jPanel51, java.awt.BorderLayout.LINE_START);

        textField4.setBackground(new java.awt.Color(255, 255, 255));
        textField4.setText("Ingresar MX");
        textField4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textField4.setOpaque(false);
        textField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField4KeyTyped(evt);
            }
        });
        container4.add(textField4, java.awt.BorderLayout.CENTER);

        title3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title3.setForeground(new java.awt.Color(0, 0, 0));
        title3.setText("MX");

        advertenciaMx.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        advertenciaMx.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(container4, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(title3)
                        .addGap(18, 18, 18)
                        .addComponent(advertenciaMx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(title3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(advertenciaMx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel22.add(jPanel23);

        jPanel18.add(jPanel22);

        content.add(jPanel18);

        jPanel19.setOpaque(false);
        jPanel19.setLayout(new java.awt.GridLayout(1, 0));

        jPanel24.setOpaque(false);
        jPanel24.setLayout(new java.awt.GridLayout(1, 0));

        jPanel26.setOpaque(false);
        jPanel26.setLayout(new java.awt.GridLayout(1, 0));

        jPanel27.setOpaque(false);

        container5.setkEndColor(new java.awt.Color(204, 204, 204));
        container5.setkFillBackground(false);
        container5.setkStartColor(new java.awt.Color(204, 204, 204));
        container5.setMaximumSize(new java.awt.Dimension(32767, 45));
        container5.setMinimumSize(new java.awt.Dimension(100, 45));
        container5.setOpaque(false);
        container5.setLayout(new java.awt.BorderLayout());

        jPanel52.setMaximumSize(new java.awt.Dimension(5, 32767));
        jPanel52.setMinimumSize(new java.awt.Dimension(5, 100));
        jPanel52.setOpaque(false);
        jPanel52.setPreferredSize(new java.awt.Dimension(5, 45));

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container5.add(jPanel52, java.awt.BorderLayout.LINE_END);

        jPanel53.setMaximumSize(new java.awt.Dimension(10, 32767));
        jPanel53.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel53.setOpaque(false);
        jPanel53.setPreferredSize(new java.awt.Dimension(10, 45));

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container5.add(jPanel53, java.awt.BorderLayout.LINE_START);

        textField5.setBackground(new java.awt.Color(255, 255, 255));
        textField5.setText("Ingresar cadenas");
        textField5.setToolTipText("");
        textField5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textField5.setOpaque(false);
        textField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField5KeyTyped(evt);
            }
        });
        container5.add(textField5, java.awt.BorderLayout.CENTER);

        title4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title4.setForeground(new java.awt.Color(0, 0, 0));
        title4.setText("Cadenas");

        advertenciaCadenas.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        advertenciaCadenas.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(container5, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(title4)
                        .addGap(18, 18, 18)
                        .addComponent(advertenciaCadenas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(title4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(advertenciaCadenas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel26.add(jPanel27);

        jPanel24.add(jPanel26);

        jPanel19.add(jPanel24);

        jPanel28.setOpaque(false);
        jPanel28.setLayout(new java.awt.GridLayout(1, 0));

        jPanel34.setOpaque(false);
        jPanel34.setLayout(new java.awt.GridLayout(1, 0));

        jPanel35.setOpaque(false);

        container6.setkEndColor(new java.awt.Color(204, 204, 204));
        container6.setkFillBackground(false);
        container6.setkStartColor(new java.awt.Color(204, 204, 204));
        container6.setMaximumSize(new java.awt.Dimension(32767, 45));
        container6.setMinimumSize(new java.awt.Dimension(100, 45));
        container6.setOpaque(false);
        container6.setLayout(new java.awt.BorderLayout());

        jPanel54.setMaximumSize(new java.awt.Dimension(5, 32767));
        jPanel54.setMinimumSize(new java.awt.Dimension(5, 100));
        jPanel54.setOpaque(false);
        jPanel54.setPreferredSize(new java.awt.Dimension(5, 45));

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container6.add(jPanel54, java.awt.BorderLayout.LINE_END);

        jPanel55.setMaximumSize(new java.awt.Dimension(10, 32767));
        jPanel55.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel55.setOpaque(false);
        jPanel55.setPreferredSize(new java.awt.Dimension(10, 45));

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container6.add(jPanel55, java.awt.BorderLayout.LINE_START);

        textField6.setBackground(new java.awt.Color(255, 255, 255));
        textField6.setText("Ingresar hules");
        textField6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textField6.setOpaque(false);
        textField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField6KeyTyped(evt);
            }
        });
        container6.add(textField6, java.awt.BorderLayout.CENTER);

        title5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title5.setForeground(new java.awt.Color(0, 0, 0));
        title5.setText("Hules");

        advertenciaNombre5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        advertenciaNombre5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(container6, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addComponent(title5)
                        .addGap(18, 18, 18)
                        .addComponent(advertenciaNombre5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(title5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(advertenciaNombre5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel34.add(jPanel35);

        jPanel28.add(jPanel34);

        jPanel19.add(jPanel28);

        content.add(jPanel19);

        jPanel20.setOpaque(false);

        container7.setkEndColor(new java.awt.Color(204, 204, 204));
        container7.setkFillBackground(false);
        container7.setkStartColor(new java.awt.Color(204, 204, 204));
        container7.setMaximumSize(new java.awt.Dimension(32767, 45));
        container7.setMinimumSize(new java.awt.Dimension(100, 45));
        container7.setOpaque(false);
        container7.setLayout(new java.awt.BorderLayout());

        jPanel56.setMaximumSize(new java.awt.Dimension(5, 32767));
        jPanel56.setMinimumSize(new java.awt.Dimension(5, 100));
        jPanel56.setOpaque(false);
        jPanel56.setPreferredSize(new java.awt.Dimension(5, 45));

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container7.add(jPanel56, java.awt.BorderLayout.LINE_END);

        jPanel57.setMaximumSize(new java.awt.Dimension(10, 32767));
        jPanel57.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel57.setOpaque(false);
        jPanel57.setPreferredSize(new java.awt.Dimension(10, 45));

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container7.add(jPanel57, java.awt.BorderLayout.LINE_START);

        textField7.setBackground(new java.awt.Color(255, 255, 255));
        textField7.setText("Ingresar observaciones");
        textField7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textField7.setOpaque(false);
        textField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField7KeyTyped(evt);
            }
        });
        container7.add(textField7, java.awt.BorderLayout.CENTER);

        title6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title6.setForeground(new java.awt.Color(0, 0, 0));
        title6.setText("Observaciones");

        advertenciaNombre6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        advertenciaNombre6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(container7, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(title6)
                        .addGap(18, 18, 18)
                        .addComponent(advertenciaNombre6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(title6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(advertenciaNombre6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        content.add(jPanel20);

        scrollPanel.setViewportView(content);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addComponent(scrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 19, Short.MAX_VALUE)))
        );

        jPanel9.add(jPanel10, java.awt.BorderLayout.PAGE_START);

        jPanel7.add(jPanel9, java.awt.BorderLayout.CENTER);

        cont.add(jPanel7);

        jPanel6.setOpaque(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );

        cont.add(jPanel6);

        add(cont, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void textField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField1KeyTyped

    }//GEN-LAST:event_textField1KeyTyped

    private void textField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textField4KeyTyped

    private void textField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textField5KeyTyped

    private void textField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField6KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textField6KeyTyped

    private void textField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField7KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textField7KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel advertenciaCadenas;
    private javax.swing.JLabel advertenciaMd;
    private javax.swing.JLabel advertenciaMx;
    private javax.swing.JLabel advertenciaNombre5;
    private javax.swing.JLabel advertenciaNombre6;
    private javax.swing.JPanel cont;
    private com.k33ptoo.components.KGradientPanel container1;
    private com.k33ptoo.components.KGradientPanel container4;
    private com.k33ptoo.components.KGradientPanel container5;
    private com.k33ptoo.components.KGradientPanel container6;
    private com.k33ptoo.components.KGradientPanel container7;
    private javax.swing.JPanel content;
    private javax.swing.JLabel informationIcon;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private com.k33ptoo.components.KGradientPanel kGradientPanel3;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JLabel text1;
    private javax.swing.JTextField textField1;
    private javax.swing.JTextField textField4;
    private javax.swing.JTextField textField5;
    private javax.swing.JTextField textField6;
    private javax.swing.JTextField textField7;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title3;
    private javax.swing.JLabel title4;
    private javax.swing.JLabel title5;
    private javax.swing.JLabel title6;
    // End of variables declaration//GEN-END:variables
}
