package com.view.components;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.context.StateColors;
import com.k33ptoo.components.KGradientPanel;
import com.utils.CustomScrollBar;
import com.utils.PanelRound;
import com.utils.Styles;
import com.utils.Tools;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.border.MatteBorder;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 18/09/22
 */
public class SideBarNavigation extends Styles {
    private int selectedIndex = 1;
    private Color colorSelected = Color.white;
    private final ArrayList<KGradientPanel> buttonsKGradient = new ArrayList<>();
    private final ArrayList<PanelRound> buttonSideKGradient = new ArrayList<>();
    private final ArrayList<JLabel> textJLabels = new ArrayList<>();
    private final ArrayList<JLabel> labelIcons = new ArrayList<>();
    
    /**
     * Creates new form SideBarNavigation
     */
    public SideBarNavigation() {
        initComponents();
        styleMyComponentBaby();
        
        if (!ApplicationContext.isDoctorSesionActual()) {
            links.remove(buttonDashBoard);
            links.remove(buttonActividad);
            links.remove(buttonOrganizacion);
            links.remove(sideDashboard);
            links.remove(sideActividad);
            links.remove(sideOrganizacion);
            
            setSelectedIndex(2);
            setSelectedColor(2);
        }
    }
    
    @Override
    public void addTitlesAndSubtitles() {
        TITLES_AND_SUBTITLES.add(menuPrincipal);
    }

    @Override
    public void addPlainText() {
        PLAIN_TEXT.add(dashboardLabel);
        PLAIN_TEXT.add(pacientesLabel);
        PLAIN_TEXT.add(agendaLabel);
        PLAIN_TEXT.add(organizacionLabel);
        PLAIN_TEXT.add(actividadLabel);
    }

    @Override
    public void addContainers() {
        
    }
    
    public void setSelectedColor(int number) {
        switch (number) {
            case 1:
                selectionButton(buttonDashBoard, sideDashboard, dashboardLabel, dashboardIcon, "aplicaciones.png", 15, 27);
                break;
            case 2:
                selectionButton(buttonPacientes, sidePacientes, pacientesLabel, pacientesIcon, "usuarios.png", 15, 27);
                break;
            case 3:
                selectionButton(buttonAgenda, sideAgenda, agendaLabel, agendaIcon, "capas.png", 15, 27);
                break;
            case 4:
                selectionButton(buttonOrganizacion, sideOrganizacion, organizacionLabel, organizacionIcon, "diente.png", 15, 27);
                break;
            case 5:
                selectionButton(buttonActividad, sideActividad, actividadLabel, actividadIcon, "actualizar.png", 15, 27);
                break;
            default:
                System.out.println("Opcion fuera de alcance");
        }
    }
    
    public void setSelected(int number) {
        switch (number) {
            case 1:
                selectionButton(buttonDashBoard, sideDashboard, dashboardLabel, dashboardIcon, "aplicaciones.png", 15, 27);
                ApplicationContext.mainInterface.changeTitle("Dashboard");
                ApplicationContext.mainInterface.mostrarPanel(ApplicationContext.dashboard);
                break;
            case 2:
                selectionButton(buttonPacientes, sidePacientes, pacientesLabel, pacientesIcon, "usuarios.png", 15, 27);
                ApplicationContext.mainInterface.changeTitle("Pacientes");
                ApplicationContext.mainInterface.mostrarPanel(ApplicationContext.pacientes);
                break;
            case 3:
                selectionButton(buttonAgenda, sideAgenda, agendaLabel, agendaIcon, "capas.png", 15, 27);
                ApplicationContext.mainInterface.changeTitle("Agenda");
                ApplicationContext.mainInterface.mostrarPanel(ApplicationContext.agendas);
                break;
            case 4:
                selectionButton(buttonOrganizacion, sideOrganizacion, organizacionLabel, organizacionIcon, "diente.png", 15, 27);
                ApplicationContext.mainInterface.changeTitle("Organización");
                ApplicationContext.mainInterface.mostrarPanel(ApplicationContext.asistentes);
                break;
            case 5:
                selectionButton(buttonActividad, sideActividad, actividadLabel, actividadIcon, "actualizar.png", 15, 27);
                ApplicationContext.mainInterface.changeTitle("Actividad");
                ApplicationContext.mainInterface.mostrarPanel(ApplicationContext.actividad);
                break;
            default:
                throw new Error("Opcion fuera de alcance");
        }
    }
    
    public int getSelectedIndex() {
        return selectedIndex;
    }

    public void setSelectedIndex(int selectedIndex) {
        this.selectedIndex = selectedIndex;
    }
    
    @Override
    public void initStyles() {
        addButtons();
        styles();
        scrollPanel.setVerticalScrollBar(new CustomScrollBar());
        scrollPanel.getVerticalScrollBar().setUnitIncrement(35);
    }
    
    public void styles() {
        dashboardIcon.setSize(35, 50);
        pacientesIcon.setSize(35, 50);
        agendaIcon.setSize(35, 50);
        actividadIcon.setSize(35, 50);
        configuracionesIcon.setSize(35, 50);
        organizacionIcon.setSize(35, 50);
        setIcons();
        selectionButton(buttonDashBoard, sideDashboard, dashboardLabel, dashboardIcon, "aplicaciones.png", 15, 27);
    }
    
    @Override
    public void colorComponent(String preferred) {
        switch (preferred) {
            case "light":
                colorSelected = ChoosedPalette.getMidColor();
                colorBasics();
                light();
                break;
            case "dark":
                colorSelected = ChoosedPalette.getWhite();
                colorBasics();
                dark();
                break;
            default:
                System.out.println("Invalido");
        }
    }

    @Override
    public void dark() {
        super.dark();
        
        Tools.setImageLabel(configuracionesIcon, "src/com/assets/salida.png", 15, 27, ChoosedPalette.getWhite());
        paintOneContainer(buttonConfiguraciones, StateColors.getDanger());
        paintOnePanelRound(sideConfiguraciones, StateColors.getDanger());
        paintOnePlainText(configuracionesLabel, ChoosedPalette.getWhite());
    }
    
    @Override
    public void light() {
        super.light();
        
        Tools.setImageLabel(configuracionesIcon, "src/com/assets/salida.png", 15, 27, StateColors.getDanger());
        paintOneContainer(buttonConfiguraciones, StateColors.getLightDanger());
        paintOnePanelRound(sideConfiguraciones, StateColors.getLightDanger());
        paintOnePlainText(configuracionesLabel, StateColors.getDanger());
    }
    
    @Override
    public void colorBasics() {
        paintOnePlainText(dashboardLabel, ChoosedPalette.getMidColor());
        paintOneContainer(buttonDashBoard, ChoosedPalette.getPrimaryLightColor());
        configContainer.setBorder(new MatteBorder(1, 0, 0, 0, ChoosedPalette.getGray()));
        
        buttonsKGradient.forEach(button -> {
            button.setkStartColor(ChoosedPalette.getTerciaryBackground());
            button.setkEndColor(ChoosedPalette.getTerciaryBackground());
            button.repaint();
        });
        
        buttonSideKGradient.forEach(button -> {
            button.setBackground(ChoosedPalette.getTerciaryBackground());
            button.repaint();
        });
        
        textJLabels.forEach(text -> {
           text.setForeground(ChoosedPalette.getTextColor());
        });
        
        configContainer.setBackground(ChoosedPalette.getTerciaryBackground());
        paintPanel.setBackground(ChoosedPalette.getTerciaryBackground());
        configContainer.repaint();
        paintPanel.repaint();
        
        paintTitlesAndSubtitles();
        paintPlainText();
        setIcons();
        setSelectedColor(selectedIndex);
    }
    
    private void setIcons() {
        Tools.setImageLabel(dashboardIcon, "src/com/assets/aplicaciones.png", 15, 27, ChoosedPalette.getTextColor());
        Tools.setImageLabel(pacientesIcon, "src/com/assets/usuarios.png", 15, 27, ChoosedPalette.getTextColor());
        Tools.setImageLabel(agendaIcon, "src/com/assets/capas.png", 15, 27, ChoosedPalette.getTextColor());
        Tools.setImageLabel(organizacionIcon, "src/com/assets/diente.png", 15, 27, ChoosedPalette.getTextColor());
        Tools.setImageLabel(actividadIcon, "src/com/assets/actualizar.png", 15, 27, ChoosedPalette.getTextColor());
    }
    
    public void selectionButton(KGradientPanel background, PanelRound side, JLabel label, JLabel labelIcon, String root, int width, int height) {
        buttonsKGradient.forEach(button -> {
            button.setkStartColor(ChoosedPalette.getTerciaryBackground());
            button.setkEndColor(ChoosedPalette.getTerciaryBackground());
            button.repaint();
        });
        
        buttonSideKGradient.forEach(button -> {
            button.setBackground(ChoosedPalette.getTerciaryBackground());
            button.repaint();
        });
        
        textJLabels.forEach(text -> {
           text.setForeground(ChoosedPalette.getTextColor());
        });
        
        setIcons();
        
        background.setkStartColor(ChoosedPalette.getPrimaryLightColor());
        background.setkEndColor(ChoosedPalette.getPrimaryLightColor());
        background.repaint();
        side.setBackground(ChoosedPalette.getMidColor());
        side.repaint();
        
        label.setForeground(colorSelected);
        Tools.setImageLabel(labelIcon, "src/com/assets/" + root, width, height, colorSelected);
    }
    
    private void addButtons() {
        buttonsKGradient.add(buttonDashBoard);
        buttonsKGradient.add(buttonPacientes);
        buttonsKGradient.add(buttonAgenda);
        buttonsKGradient.add(buttonOrganizacion);
        buttonsKGradient.add(buttonActividad);
        
        buttonSideKGradient.add(sideDashboard);
        buttonSideKGradient.add(sidePacientes);
        buttonSideKGradient.add(sideAgenda);
        buttonSideKGradient.add(sideOrganizacion);
        buttonSideKGradient.add(sideActividad);
        
        textJLabels.add(dashboardLabel);
        textJLabels.add(pacientesLabel);
        textJLabels.add(agendaLabel);
        textJLabels.add(organizacionLabel);
        textJLabels.add(actividadLabel);
        
        labelIcons.add(dashboardIcon);
        labelIcons.add(pacientesIcon);
        labelIcons.add(agendaIcon);
        labelIcons.add(organizacionIcon);
        labelIcons.add(actividadIcon);
    };
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        separador = new javax.swing.JSeparator();
        configContainer = new javax.swing.JPanel();
        buttonConfiguraciones = new com.k33ptoo.components.KGradientPanel();
        configuracionesIcon = new javax.swing.JLabel();
        configuracionesLabel = new javax.swing.JLabel();
        sideConfiguraciones = new com.utils.PanelRound();
        panel = new javax.swing.JPanel();
        scrollPanel = new javax.swing.JScrollPane();
        paintPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        placeLogo = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        titlePosition = new javax.swing.JPanel();
        menuPrincipal = new javax.swing.JLabel();
        deleteThis = new javax.swing.JPanel();
        links = new javax.swing.JPanel();
        sideDashboard = new com.utils.PanelRound();
        buttonDashBoard = new com.k33ptoo.components.KGradientPanel();
        dashboardIcon = new javax.swing.JLabel();
        dashboardLabel = new javax.swing.JLabel();
        buttonActividad = new com.k33ptoo.components.KGradientPanel();
        actividadIcon = new javax.swing.JLabel();
        actividadLabel = new javax.swing.JLabel();
        sideActividad = new com.utils.PanelRound();
        buttonOrganizacion = new com.k33ptoo.components.KGradientPanel();
        organizacionIcon = new javax.swing.JLabel();
        organizacionLabel = new javax.swing.JLabel();
        sideOrganizacion = new com.utils.PanelRound();
        buttonAgenda = new com.k33ptoo.components.KGradientPanel();
        agendaIcon = new javax.swing.JLabel();
        agendaLabel = new javax.swing.JLabel();
        sideAgenda = new com.utils.PanelRound();
        buttonPacientes = new com.k33ptoo.components.KGradientPanel();
        pacientesIcon = new javax.swing.JLabel();
        pacientesLabel = new javax.swing.JLabel();
        sidePacientes = new com.utils.PanelRound();

        separador.setForeground(new java.awt.Color(204, 204, 204));
        separador.setMaximumSize(new java.awt.Dimension(32767, 17));
        separador.setMinimumSize(new java.awt.Dimension(50, 17));

        setMaximumSize(new java.awt.Dimension(220, 32767));
        setMinimumSize(new java.awt.Dimension(100, 0));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(220, 300));
        setLayout(new java.awt.BorderLayout());

        configContainer.setMaximumSize(new java.awt.Dimension(220, 80));
        configContainer.setMinimumSize(new java.awt.Dimension(100, 80));
        configContainer.setPreferredSize(new java.awt.Dimension(220, 80));
        configContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonConfiguraciones.setkBorderRadius(14);
        buttonConfiguraciones.setkEndColor(new java.awt.Color(255, 255, 255));
        buttonConfiguraciones.setkStartColor(new java.awt.Color(255, 255, 255));
        buttonConfiguraciones.setMaximumSize(new java.awt.Dimension(32767, 50));
        buttonConfiguraciones.setOpaque(false);
        buttonConfiguraciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonConfiguracionesMouseClicked(evt);
            }
        });

        configuracionesIcon.setForeground(new java.awt.Color(255, 255, 255));
        configuracionesIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        configuracionesIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        configuracionesIcon.setMaximumSize(new java.awt.Dimension(37, 37));
        configuracionesIcon.setMinimumSize(new java.awt.Dimension(35, 37));

        configuracionesLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        configuracionesLabel.setText("Cerrar Sesión");
        configuracionesLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout buttonConfiguracionesLayout = new javax.swing.GroupLayout(buttonConfiguraciones);
        buttonConfiguraciones.setLayout(buttonConfiguracionesLayout);
        buttonConfiguracionesLayout.setHorizontalGroup(
            buttonConfiguracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonConfiguracionesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(configuracionesIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(configuracionesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );
        buttonConfiguracionesLayout.setVerticalGroup(
            buttonConfiguracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonConfiguracionesLayout.createSequentialGroup()
                .addGroup(buttonConfiguracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(configuracionesIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(configuracionesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addGap(1, 1, 1))
        );

        configContainer.add(buttonConfiguraciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        sideConfiguraciones.setBackground(new java.awt.Color(255, 255, 255));
        sideConfiguraciones.setMaximumSize(new java.awt.Dimension(9, 49));
        sideConfiguraciones.setMinimumSize(new java.awt.Dimension(9, 49));
        sideConfiguraciones.setRoundBottomRight(20);
        sideConfiguraciones.setRoundTopRight(20);

        javax.swing.GroupLayout sideConfiguracionesLayout = new javax.swing.GroupLayout(sideConfiguraciones);
        sideConfiguraciones.setLayout(sideConfiguracionesLayout);
        sideConfiguracionesLayout.setHorizontalGroup(
            sideConfiguracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        sideConfiguracionesLayout.setVerticalGroup(
            sideConfiguracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        configContainer.add(sideConfiguraciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        add(configContainer, java.awt.BorderLayout.PAGE_END);

        panel.setOpaque(false);
        panel.setLayout(new java.awt.BorderLayout());

        scrollPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        scrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPanel.setOpaque(false);

        paintPanel.setBackground(new java.awt.Color(255, 255, 255));
        paintPanel.setLayout(new java.awt.BorderLayout());

        jPanel4.setMaximumSize(new java.awt.Dimension(220, 80));
        jPanel4.setMinimumSize(new java.awt.Dimension(100, 80));
        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(218, 80));
        jPanel4.setLayout(new java.awt.BorderLayout());

        placeLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(placeLogo, java.awt.BorderLayout.CENTER);

        paintPanel.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setMaximumSize(new java.awt.Dimension(220, 20));
        jPanel6.setMinimumSize(new java.awt.Dimension(100, 20));
        jPanel6.setOpaque(false);
        jPanel6.setPreferredSize(new java.awt.Dimension(218, 20));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel7.setMaximumSize(new java.awt.Dimension(18, 32767));
        jPanel7.setMinimumSize(new java.awt.Dimension(18, 100));
        jPanel7.setOpaque(false);
        jPanel7.setPreferredSize(new java.awt.Dimension(18, 20));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel7, java.awt.BorderLayout.LINE_END);

        jPanel8.setMaximumSize(new java.awt.Dimension(18, 32767));
        jPanel8.setMinimumSize(new java.awt.Dimension(18, 100));
        jPanel8.setOpaque(false);
        jPanel8.setPreferredSize(new java.awt.Dimension(18, 20));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel8, java.awt.BorderLayout.LINE_START);

        jPanel9.setOpaque(false);
        jPanel9.setLayout(new javax.swing.BoxLayout(jPanel9, javax.swing.BoxLayout.LINE_AXIS));

        titlePosition.setOpaque(false);
        titlePosition.setLayout(new java.awt.BorderLayout());

        menuPrincipal.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        menuPrincipal.setForeground(new java.awt.Color(153, 153, 153));
        menuPrincipal.setText("Menu principal");
        titlePosition.add(menuPrincipal, java.awt.BorderLayout.CENTER);

        jPanel9.add(titlePosition);

        deleteThis.setOpaque(false);

        javax.swing.GroupLayout deleteThisLayout = new javax.swing.GroupLayout(deleteThis);
        deleteThis.setLayout(deleteThisLayout);
        deleteThisLayout.setHorizontalGroup(
            deleteThisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );
        deleteThisLayout.setVerticalGroup(
            deleteThisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel9.add(deleteThis);

        jPanel6.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        links.setOpaque(false);
        links.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sideDashboard.setBackground(new java.awt.Color(69, 98, 255));
        sideDashboard.setMaximumSize(new java.awt.Dimension(9, 49));
        sideDashboard.setMinimumSize(new java.awt.Dimension(9, 49));
        sideDashboard.setRoundBottomRight(20);
        sideDashboard.setRoundTopRight(20);

        javax.swing.GroupLayout sideDashboardLayout = new javax.swing.GroupLayout(sideDashboard);
        sideDashboard.setLayout(sideDashboardLayout);
        sideDashboardLayout.setHorizontalGroup(
            sideDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        sideDashboardLayout.setVerticalGroup(
            sideDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        links.add(sideDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        buttonDashBoard.setkBorderRadius(14);
        buttonDashBoard.setkEndColor(new java.awt.Color(0, 0, 0));
        buttonDashBoard.setkStartColor(new java.awt.Color(0, 0, 0));
        buttonDashBoard.setMaximumSize(new java.awt.Dimension(32767, 50));
        buttonDashBoard.setOpaque(false);
        buttonDashBoard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonDashBoardMouseClicked(evt);
            }
        });

        dashboardIcon.setForeground(new java.awt.Color(255, 255, 255));
        dashboardIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboardIcon.setMaximumSize(new java.awt.Dimension(37, 37));
        dashboardIcon.setMinimumSize(new java.awt.Dimension(35, 37));

        dashboardLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        dashboardLabel.setForeground(new java.awt.Color(69, 98, 255));
        dashboardLabel.setText("Dashboard");
        dashboardLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout buttonDashBoardLayout = new javax.swing.GroupLayout(buttonDashBoard);
        buttonDashBoard.setLayout(buttonDashBoardLayout);
        buttonDashBoardLayout.setHorizontalGroup(
            buttonDashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonDashBoardLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(dashboardIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dashboardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        buttonDashBoardLayout.setVerticalGroup(
            buttonDashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboardIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(dashboardLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        links.add(buttonDashBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 50));

        buttonActividad.setkBorderRadius(14);
        buttonActividad.setkEndColor(new java.awt.Color(255, 255, 255));
        buttonActividad.setkStartColor(new java.awt.Color(255, 255, 255));
        buttonActividad.setMaximumSize(new java.awt.Dimension(32767, 50));
        buttonActividad.setOpaque(false);
        buttonActividad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonActividadMouseClicked(evt);
            }
        });

        actividadIcon.setForeground(new java.awt.Color(255, 255, 255));
        actividadIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        actividadIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        actividadIcon.setMaximumSize(new java.awt.Dimension(37, 37));
        actividadIcon.setMinimumSize(new java.awt.Dimension(35, 37));

        actividadLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        actividadLabel.setText("Actividad");
        actividadLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout buttonActividadLayout = new javax.swing.GroupLayout(buttonActividad);
        buttonActividad.setLayout(buttonActividadLayout);
        buttonActividadLayout.setHorizontalGroup(
            buttonActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonActividadLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(actividadIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actividadLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );
        buttonActividadLayout.setVerticalGroup(
            buttonActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(actividadIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(actividadLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        links.add(buttonActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 50));

        sideActividad.setBackground(new java.awt.Color(255, 255, 255));
        sideActividad.setMaximumSize(new java.awt.Dimension(9, 49));
        sideActividad.setMinimumSize(new java.awt.Dimension(9, 49));
        sideActividad.setRoundBottomRight(20);
        sideActividad.setRoundTopRight(20);

        javax.swing.GroupLayout sideActividadLayout = new javax.swing.GroupLayout(sideActividad);
        sideActividad.setLayout(sideActividadLayout);
        sideActividadLayout.setHorizontalGroup(
            sideActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        sideActividadLayout.setVerticalGroup(
            sideActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        links.add(sideActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, -1));

        buttonOrganizacion.setkBorderRadius(14);
        buttonOrganizacion.setkEndColor(new java.awt.Color(255, 255, 255));
        buttonOrganizacion.setkStartColor(new java.awt.Color(255, 255, 255));
        buttonOrganizacion.setMaximumSize(new java.awt.Dimension(32767, 50));
        buttonOrganizacion.setOpaque(false);
        buttonOrganizacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonOrganizacionMouseClicked(evt);
            }
        });

        organizacionIcon.setForeground(new java.awt.Color(255, 255, 255));
        organizacionIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        organizacionIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        organizacionIcon.setMaximumSize(new java.awt.Dimension(37, 37));
        organizacionIcon.setMinimumSize(new java.awt.Dimension(35, 37));

        organizacionLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        organizacionLabel.setText("Organización");
        organizacionLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout buttonOrganizacionLayout = new javax.swing.GroupLayout(buttonOrganizacion);
        buttonOrganizacion.setLayout(buttonOrganizacionLayout);
        buttonOrganizacionLayout.setHorizontalGroup(
            buttonOrganizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonOrganizacionLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(organizacionIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(organizacionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );
        buttonOrganizacionLayout.setVerticalGroup(
            buttonOrganizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(organizacionLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(organizacionIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        links.add(buttonOrganizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 50));

        sideOrganizacion.setBackground(new java.awt.Color(255, 255, 255));
        sideOrganizacion.setMaximumSize(new java.awt.Dimension(9, 49));
        sideOrganizacion.setMinimumSize(new java.awt.Dimension(9, 49));
        sideOrganizacion.setRoundBottomRight(20);
        sideOrganizacion.setRoundTopRight(20);

        javax.swing.GroupLayout sideOrganizacionLayout = new javax.swing.GroupLayout(sideOrganizacion);
        sideOrganizacion.setLayout(sideOrganizacionLayout);
        sideOrganizacionLayout.setHorizontalGroup(
            sideOrganizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        sideOrganizacionLayout.setVerticalGroup(
            sideOrganizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        links.add(sideOrganizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));

        buttonAgenda.setkBorderRadius(14);
        buttonAgenda.setkEndColor(new java.awt.Color(255, 255, 255));
        buttonAgenda.setkStartColor(new java.awt.Color(255, 255, 255));
        buttonAgenda.setMaximumSize(new java.awt.Dimension(32767, 50));
        buttonAgenda.setOpaque(false);
        buttonAgenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonAgendaMouseClicked(evt);
            }
        });

        agendaIcon.setForeground(new java.awt.Color(255, 255, 255));
        agendaIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agendaIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agendaIcon.setMaximumSize(new java.awt.Dimension(37, 37));
        agendaIcon.setMinimumSize(new java.awt.Dimension(35, 37));

        agendaLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        agendaLabel.setText("Agenda");
        agendaLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout buttonAgendaLayout = new javax.swing.GroupLayout(buttonAgenda);
        buttonAgenda.setLayout(buttonAgendaLayout);
        buttonAgendaLayout.setHorizontalGroup(
            buttonAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonAgendaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(agendaIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agendaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );
        buttonAgendaLayout.setVerticalGroup(
            buttonAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agendaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(agendaIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        links.add(buttonAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 50));

        sideAgenda.setBackground(new java.awt.Color(255, 255, 255));
        sideAgenda.setMaximumSize(new java.awt.Dimension(9, 49));
        sideAgenda.setMinimumSize(new java.awt.Dimension(9, 49));
        sideAgenda.setRoundBottomRight(20);
        sideAgenda.setRoundTopRight(20);

        javax.swing.GroupLayout sideAgendaLayout = new javax.swing.GroupLayout(sideAgenda);
        sideAgenda.setLayout(sideAgendaLayout);
        sideAgendaLayout.setHorizontalGroup(
            sideAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        sideAgendaLayout.setVerticalGroup(
            sideAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        links.add(sideAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        buttonPacientes.setBackground(new java.awt.Color(51, 51, 51));
        buttonPacientes.setkBorderRadius(14);
        buttonPacientes.setkEndColor(new java.awt.Color(255, 255, 255));
        buttonPacientes.setkStartColor(new java.awt.Color(255, 255, 255));
        buttonPacientes.setMaximumSize(new java.awt.Dimension(32767, 50));
        buttonPacientes.setOpaque(false);
        buttonPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPacientesMouseClicked(evt);
            }
        });

        pacientesIcon.setForeground(new java.awt.Color(255, 255, 255));
        pacientesIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pacientesIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pacientesIcon.setMaximumSize(new java.awt.Dimension(37, 37));
        pacientesIcon.setMinimumSize(new java.awt.Dimension(35, 37));

        pacientesLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        pacientesLabel.setText("Pacientes");
        pacientesLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout buttonPacientesLayout = new javax.swing.GroupLayout(buttonPacientes);
        buttonPacientes.setLayout(buttonPacientesLayout);
        buttonPacientesLayout.setHorizontalGroup(
            buttonPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPacientesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(pacientesIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pacientesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );
        buttonPacientesLayout.setVerticalGroup(
            buttonPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pacientesIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(pacientesLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        links.add(buttonPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 50));

        sidePacientes.setBackground(new java.awt.Color(255, 255, 255));
        sidePacientes.setMaximumSize(new java.awt.Dimension(9, 49));
        sidePacientes.setMinimumSize(new java.awt.Dimension(9, 49));
        sidePacientes.setRoundBottomRight(20);
        sidePacientes.setRoundTopRight(20);

        javax.swing.GroupLayout sidePacientesLayout = new javax.swing.GroupLayout(sidePacientes);
        sidePacientes.setLayout(sidePacientesLayout);
        sidePacientesLayout.setHorizontalGroup(
            sidePacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        sidePacientesLayout.setVerticalGroup(
            sidePacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        links.add(sidePacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        jPanel5.add(links, java.awt.BorderLayout.CENTER);

        paintPanel.add(jPanel5, java.awt.BorderLayout.CENTER);

        scrollPanel.setViewportView(paintPanel);

        panel.add(scrollPanel, java.awt.BorderLayout.CENTER);

        add(panel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonDashBoardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDashBoardMouseClicked
        setSelected(1);
        setSelectedIndex(1);
    }//GEN-LAST:event_buttonDashBoardMouseClicked

    private void buttonActividadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonActividadMouseClicked
        setSelected(5);
        setSelectedIndex(5);
    }//GEN-LAST:event_buttonActividadMouseClicked

    private void buttonOrganizacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonOrganizacionMouseClicked
        setSelected(4);
        setSelectedIndex(4);
    }//GEN-LAST:event_buttonOrganizacionMouseClicked

    private void buttonAgendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAgendaMouseClicked
        setSelected(3);
        setSelectedIndex(3);
    }//GEN-LAST:event_buttonAgendaMouseClicked

    private void buttonPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPacientesMouseClicked
        setSelected(2);
        setSelectedIndex(2);
    }//GEN-LAST:event_buttonPacientesMouseClicked

    private void buttonConfiguracionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonConfiguracionesMouseClicked
        ApplicationContext.exit.setVisible(true);
    }//GEN-LAST:event_buttonConfiguracionesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actividadIcon;
    private javax.swing.JLabel actividadLabel;
    private javax.swing.JLabel agendaIcon;
    private javax.swing.JLabel agendaLabel;
    private com.k33ptoo.components.KGradientPanel buttonActividad;
    private com.k33ptoo.components.KGradientPanel buttonAgenda;
    private com.k33ptoo.components.KGradientPanel buttonConfiguraciones;
    private com.k33ptoo.components.KGradientPanel buttonDashBoard;
    private com.k33ptoo.components.KGradientPanel buttonOrganizacion;
    private com.k33ptoo.components.KGradientPanel buttonPacientes;
    private javax.swing.JPanel configContainer;
    private javax.swing.JLabel configuracionesIcon;
    private javax.swing.JLabel configuracionesLabel;
    private javax.swing.JLabel dashboardIcon;
    private javax.swing.JLabel dashboardLabel;
    private javax.swing.JPanel deleteThis;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel links;
    private javax.swing.JLabel menuPrincipal;
    private javax.swing.JLabel organizacionIcon;
    private javax.swing.JLabel organizacionLabel;
    private javax.swing.JLabel pacientesIcon;
    private javax.swing.JLabel pacientesLabel;
    private javax.swing.JPanel paintPanel;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel placeLogo;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JSeparator separador;
    private com.utils.PanelRound sideActividad;
    private com.utils.PanelRound sideAgenda;
    private com.utils.PanelRound sideConfiguraciones;
    private com.utils.PanelRound sideDashboard;
    private com.utils.PanelRound sideOrganizacion;
    private com.utils.PanelRound sidePacientes;
    private javax.swing.JPanel titlePosition;
    // End of variables declaration//GEN-END:variables

    
}
