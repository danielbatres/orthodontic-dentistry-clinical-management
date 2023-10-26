package com.view.components;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.context.StateColors;
import com.k33ptoo.components.KGradientPanel;
import com.utils.PanelRound;
import com.utils.Styles;
import static com.utils.Styles.paintOneContainer;
import com.utils.Tools;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.border.MatteBorder;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 18/09/22
 */
public class SideBarClose extends Styles {
    private int selectedIndex = 1;
    private Color colorSelected = Color.white;
    private final ArrayList<KGradientPanel> buttonsKGradient = new ArrayList<>();
    private final ArrayList<PanelRound> buttonSideKGradient = new ArrayList<>();

    /**
     * Creates new form SiderBarClose
     */
    public SideBarClose() {
        initComponents();
        styleMyComponentBaby();
        
        if (!ApplicationContext.isDoctorSesionActual()) {
            links.remove(buttonDashboard);
            links.remove(buttonActividad);
            links.remove(buttonOrganizacion);
            links.remove(sideDashboard);
            links.remove(sideActividad);
            links.remove(sideOrganizacion);
            
            setSelectedIndex(2);
            setSelectedColor(2);
        }
    }
    
    private void addButtons() {
        buttonsKGradient.add(buttonDashboard);
        buttonsKGradient.add(buttonPacientes);
        buttonsKGradient.add(buttonAgenda);
        buttonsKGradient.add(buttonOrganizacion);
        buttonsKGradient.add(buttonActividad);
        
        buttonSideKGradient.add(sideDashboard);
        buttonSideKGradient.add(sidePacientes);
        buttonSideKGradient.add(sideAgenda);
        buttonSideKGradient.add(sideOrganizacion);
        buttonSideKGradient.add(sideActividad);
    };
    
    private void selectionButton(KGradientPanel background, PanelRound side, JLabel labelIcon, String root, int width, int height) {
        buttonsKGradient.forEach(button -> {
            button.setkStartColor(ChoosedPalette.getTerciaryBackground());
            button.setkEndColor(ChoosedPalette.getTerciaryBackground());
            button.repaint();
        });
        
        buttonSideKGradient.forEach(button -> {
            button.setBackground(ChoosedPalette.getTerciaryBackground());
            button.repaint();
        });
        setIcons();
        
        background.setkStartColor(ChoosedPalette.getPrimaryLightColor());
        background.setkEndColor(ChoosedPalette.getPrimaryLightColor());
        background.repaint();
        side.setBackground(ChoosedPalette.getMidColor());
        side.repaint();
        
        Tools.setImageLabel(labelIcon, "src/com/assets/" + root, width, height, colorSelected);
        
        SwingUtilities.updateComponentTreeUI(this);
    }
    
    @Override
    public void addTitlesAndSubtitles() {
        
    }

    @Override
    public void addPlainText() {
        
    }

    @Override
    public void addContainers() {
        
    }

    @Override
    public void initStyles() {
        addButtons();
        styles();
    }
    
    private void setIcons() {
        Tools.setImageLabel(dashboardIcon, "src/com/assets/aplicaciones.png", 15, 27, ChoosedPalette.getTextColor());
        Tools.setImageLabel(pacientesIcon, "src/com/assets/usuarios.png", 15, 27, ChoosedPalette.getTextColor());
        Tools.setImageLabel(agendaIcon, "src/com/assets/capas.png", 15, 27, ChoosedPalette.getTextColor());
        Tools.setImageLabel(organizacionIcon, "src/com/assets/diente.png", 15, 27, ChoosedPalette.getTextColor());
        Tools.setImageLabel(actividadIcon, "src/com/assets/actualizar.png", 15, 27, ChoosedPalette.getTextColor());
        Tools.setImageLabel(placeLogo, "src/com/images/icon-logo.png", 250, 250, ChoosedPalette.getDarkColor());
    }
    
    private void styles() {
        dashboardIcon.setSize(35, 50);
        pacientesIcon.setSize(35, 50);
        agendaIcon.setSize(35, 50);
        actividadIcon.setSize(35, 50);
        configuracionesIcon.setSize(35, 50);
        organizacionIcon.setSize(35, 50);
        setIcons();
        
        selectionButton(buttonDashboard, sideDashboard, dashboardIcon, "aplicaciones.png", 16, 26);
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
    }
    
    @Override
    public void light() {
        super.light();
        
        Tools.setImageLabel(configuracionesIcon, "src/com/assets/salida.png", 15, 27, StateColors.getDanger());
        paintOneContainer(buttonConfiguraciones, StateColors.getLightDanger());
        paintOnePanelRound(sideConfiguraciones, StateColors.getLightDanger());
    }
    
    @Override
    public void colorBasics() {
        paintOneContainer(buttonDashboard, ChoosedPalette.getPrimaryLightColor());
        configContainer.setBorder(new MatteBorder(1, 0, 0, 0, ChoosedPalette.getGray()));
        setBackground(ChoosedPalette.getTerciaryBackground());
        buttonsKGradient.forEach(button -> {
            button.setkStartColor(ChoosedPalette.getTerciaryBackground());
            button.setkEndColor(ChoosedPalette.getTerciaryBackground());
            button.repaint();
        });
        buttonSideKGradient.forEach(button -> {
            button.setBackground(ChoosedPalette.getTerciaryBackground());
            button.repaint();
        });
        
        setIcons();
    }
    
    public void setSelectedColor(int number) {
        switch (number) {
            case 1:
                selectionButton(buttonDashboard, sideDashboard, dashboardIcon, "aplicaciones.png", 16, 26);
                break;
            case 2:
                selectionButton(buttonPacientes, sidePacientes, pacientesIcon, "usuarios.png", 16, 26);
                break;
            case 3:
                selectionButton(buttonAgenda, sideAgenda, agendaIcon, "capas.png", 16, 26);
                break;
            case 4:
                selectionButton(buttonOrganizacion, sideOrganizacion, organizacionIcon, "diente.png", 16, 26);
                break;
            case 5:
                selectionButton(buttonActividad, sideActividad, actividadIcon, "actualizar.png", 16, 26);
                break;
            default:
                System.out.println("Opcion fuera de alcance");
        }
    }
    
    public void setSelected(int number) {
        switch (number) {
            case 1:
                selectionButton(buttonDashboard, sideDashboard, dashboardIcon, "aplicaciones.png", 16, 26);
                ApplicationContext.mainInterface.changeTitle("Dashboard");
                ApplicationContext.mainInterface.mostrarPanel(ApplicationContext.dashboard);
                break;
            case 2:
                selectionButton(buttonPacientes, sidePacientes, pacientesIcon, "usuarios.png", 16, 26);
                ApplicationContext.mainInterface.changeTitle("Pacientes");
                ApplicationContext.mainInterface.mostrarPanel(ApplicationContext.pacientes);
                break;
            case 3:
                selectionButton(buttonAgenda, sideAgenda, agendaIcon, "capas.png", 16, 26);
                ApplicationContext.mainInterface.changeTitle("Agenda");
                ApplicationContext.mainInterface.mostrarPanel(ApplicationContext.agendas);
                break;
            case 4:
                selectionButton(buttonOrganizacion, sideOrganizacion, organizacionIcon, "diente.png", 16, 26);
                ApplicationContext.mainInterface.changeTitle("Organización");
                ApplicationContext.mainInterface.mostrarPanel(ApplicationContext.asistentes);
                break;
            case 5:
                selectionButton(buttonActividad, sideActividad, actividadIcon, "actualizar.png", 16, 26);
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        placeLogo = new javax.swing.JLabel();
        configContainer = new javax.swing.JPanel();
        buttonConfiguraciones = new com.k33ptoo.components.KGradientPanel();
        configuracionesIcon = new javax.swing.JLabel();
        sideConfiguraciones = new com.utils.PanelRound();
        links = new javax.swing.JPanel();
        buttonDashboard = new com.k33ptoo.components.KGradientPanel();
        dashboardIcon = new javax.swing.JLabel();
        buttonPacientes = new com.k33ptoo.components.KGradientPanel();
        pacientesIcon = new javax.swing.JLabel();
        buttonAgenda = new com.k33ptoo.components.KGradientPanel();
        agendaIcon = new javax.swing.JLabel();
        buttonOrganizacion = new com.k33ptoo.components.KGradientPanel();
        organizacionIcon = new javax.swing.JLabel();
        buttonActividad = new com.k33ptoo.components.KGradientPanel();
        actividadIcon = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        sideActividad = new com.utils.PanelRound();
        sideOrganizacion = new com.utils.PanelRound();
        sideAgenda = new com.utils.PanelRound();
        sidePacientes = new com.utils.PanelRound();
        sideDashboard = new com.utils.PanelRound();

        setMaximumSize(new java.awt.Dimension(100, 21474));
        setMinimumSize(new java.awt.Dimension(100, 670));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(220, 80));
        jPanel1.setMinimumSize(new java.awt.Dimension(220, 80));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(220, 80));
        jPanel1.setLayout(new java.awt.BorderLayout());

        placeLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(placeLogo, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        configContainer.setBackground(new java.awt.Color(255, 255, 255));
        configContainer.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(204, 204, 204)));
        configContainer.setMaximumSize(new java.awt.Dimension(220, 80));
        configContainer.setMinimumSize(new java.awt.Dimension(220, 80));
        configContainer.setOpaque(false);
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
        configuracionesIcon.setMaximumSize(new java.awt.Dimension(37, 37));
        configuracionesIcon.setMinimumSize(new java.awt.Dimension(35, 37));

        javax.swing.GroupLayout buttonConfiguracionesLayout = new javax.swing.GroupLayout(buttonConfiguraciones);
        buttonConfiguraciones.setLayout(buttonConfiguracionesLayout);
        buttonConfiguracionesLayout.setHorizontalGroup(
            buttonConfiguracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonConfiguracionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(configuracionesIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );
        buttonConfiguracionesLayout.setVerticalGroup(
            buttonConfiguracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(configuracionesIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        configContainer.add(buttonConfiguraciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, 60, 49));

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

        links.setBackground(new java.awt.Color(255, 255, 255));
        links.setOpaque(false);
        links.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonDashboard.setkBorderRadius(14);
        buttonDashboard.setkEndColor(new java.awt.Color(0, 0, 0));
        buttonDashboard.setkStartColor(new java.awt.Color(0, 0, 0));
        buttonDashboard.setMaximumSize(new java.awt.Dimension(32767, 50));
        buttonDashboard.setOpaque(false);
        buttonDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonDashboardMouseClicked(evt);
            }
        });

        dashboardIcon.setForeground(new java.awt.Color(255, 255, 255));
        dashboardIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboardIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboardIcon.setMaximumSize(new java.awt.Dimension(37, 37));
        dashboardIcon.setMinimumSize(new java.awt.Dimension(35, 37));

        javax.swing.GroupLayout buttonDashboardLayout = new javax.swing.GroupLayout(buttonDashboard);
        buttonDashboard.setLayout(buttonDashboardLayout);
        buttonDashboardLayout.setHorizontalGroup(
            buttonDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dashboardIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );
        buttonDashboardLayout.setVerticalGroup(
            buttonDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboardIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        links.add(buttonDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 60, -1));

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

        javax.swing.GroupLayout buttonPacientesLayout = new javax.swing.GroupLayout(buttonPacientes);
        buttonPacientes.setLayout(buttonPacientesLayout);
        buttonPacientesLayout.setHorizontalGroup(
            buttonPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPacientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pacientesIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );
        buttonPacientesLayout.setVerticalGroup(
            buttonPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pacientesIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        links.add(buttonPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 60, -1));

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

        javax.swing.GroupLayout buttonAgendaLayout = new javax.swing.GroupLayout(buttonAgenda);
        buttonAgenda.setLayout(buttonAgendaLayout);
        buttonAgendaLayout.setHorizontalGroup(
            buttonAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonAgendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(agendaIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );
        buttonAgendaLayout.setVerticalGroup(
            buttonAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agendaIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        links.add(buttonAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 60, -1));

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

        javax.swing.GroupLayout buttonOrganizacionLayout = new javax.swing.GroupLayout(buttonOrganizacion);
        buttonOrganizacion.setLayout(buttonOrganizacionLayout);
        buttonOrganizacionLayout.setHorizontalGroup(
            buttonOrganizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonOrganizacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(organizacionIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );
        buttonOrganizacionLayout.setVerticalGroup(
            buttonOrganizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(organizacionIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        links.add(buttonOrganizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 60, -1));

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

        javax.swing.GroupLayout buttonActividadLayout = new javax.swing.GroupLayout(buttonActividad);
        buttonActividad.setLayout(buttonActividadLayout);
        buttonActividadLayout.setHorizontalGroup(
            buttonActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonActividadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(actividadIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );
        buttonActividadLayout.setVerticalGroup(
            buttonActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(actividadIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        links.add(buttonActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 60, -1));

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator2.setMaximumSize(new java.awt.Dimension(32767, 17));
        jSeparator2.setMinimumSize(new java.awt.Dimension(50, 17));
        links.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 40, 15));

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

        links.add(sideActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, -1, -1));

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

        links.add(sideOrganizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, -1));

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

        links.add(sideAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

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

        links.add(sidePacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

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

        links.add(sideDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        add(links, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonConfiguracionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonConfiguracionesMouseClicked
        ApplicationContext.exit.setVisible(true);
    }//GEN-LAST:event_buttonConfiguracionesMouseClicked

    private void buttonDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDashboardMouseClicked
        setSelected(1);
        setSelectedIndex(1);
    }//GEN-LAST:event_buttonDashboardMouseClicked

    private void buttonPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPacientesMouseClicked
        setSelected(2);
        setSelectedIndex(2);
    }//GEN-LAST:event_buttonPacientesMouseClicked

    private void buttonAgendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAgendaMouseClicked
        setSelected(3);
        setSelectedIndex(3);
    }//GEN-LAST:event_buttonAgendaMouseClicked

    private void buttonOrganizacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonOrganizacionMouseClicked
        setSelected(4);
        setSelectedIndex(4);
    }//GEN-LAST:event_buttonOrganizacionMouseClicked

    private void buttonActividadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonActividadMouseClicked
        setSelected(5);
        setSelectedIndex(5);
    }//GEN-LAST:event_buttonActividadMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actividadIcon;
    private javax.swing.JLabel agendaIcon;
    private com.k33ptoo.components.KGradientPanel buttonActividad;
    private com.k33ptoo.components.KGradientPanel buttonAgenda;
    private com.k33ptoo.components.KGradientPanel buttonConfiguraciones;
    private com.k33ptoo.components.KGradientPanel buttonDashboard;
    private com.k33ptoo.components.KGradientPanel buttonOrganizacion;
    private com.k33ptoo.components.KGradientPanel buttonPacientes;
    private javax.swing.JPanel configContainer;
    private javax.swing.JLabel configuracionesIcon;
    private javax.swing.JLabel dashboardIcon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel links;
    private javax.swing.JLabel organizacionIcon;
    private javax.swing.JLabel pacientesIcon;
    private javax.swing.JLabel placeLogo;
    private com.utils.PanelRound sideActividad;
    private com.utils.PanelRound sideAgenda;
    private com.utils.PanelRound sideConfiguraciones;
    private com.utils.PanelRound sideDashboard;
    private com.utils.PanelRound sideOrganizacion;
    private com.utils.PanelRound sidePacientes;
    // End of variables declaration//GEN-END:variables

    
}
