package com.view.dashboard;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.helper.AsistenteHelper;
import com.helper.ConsultasHelper;
import com.helper.FacturaHelper;
import com.helper.PacienteHelper;
import com.k33ptoo.components.KGradientPanel;
import com.model.PacienteModel;
import com.utils.Styles;
import com.utils.Tools;
import java.util.ArrayList;
import javax.swing.border.MatteBorder;


/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 19/09/22
 */
public class DashboardScroll extends Styles {
    private ArrayList<KGradientPanel> containers = new ArrayList<>();
    private ArrayList<PacienteModel> recentPacients = new ArrayList<>();

    /**
     * Creates new form DashboardScroll
     */
    public DashboardScroll() {
        initComponents();
        styleMyComponentBaby();
        if (ApplicationContext.isDoctorSesionActual()) {
            greeting.setText("Hola, " + ApplicationContext.getDoctor().getNombres());
        }
    }
    
    public void setData() {
        if (ApplicationContext.isDoctorSesionActual()) {
            contadorPacientes.setText(String.valueOf(PacienteHelper.countPacientes()));
            contadorConsultas.setText(String.valueOf(ConsultasHelper.countConsultas()));
            contadorOrganizacion.setText(String.valueOf(AsistenteHelper.countAsistentes()));
            contador.setText("$" + FacturaHelper.getTotales());
        }
        
        recentPacients = PacienteHelper.listRecientPacients();
        place.removeAll();
        
        ApplicationContext.recentPacientTable.listPacients(recentPacients);
        Tools.showPanel(place, ApplicationContext.recentPacientTable, 10, 10);
        
        recentPacients.clear();
    }
    
    @Override
    public void addTitlesAndSubtitles() {
        TITLES_AND_SUBTITLES.add(contadorPacientes);
        TITLES_AND_SUBTITLES.add(contadorConsultas);
        TITLES_AND_SUBTITLES.add(contadorOrganizacion);
        TITLES_AND_SUBTITLES.add(contador);
        TITLES_AND_SUBTITLES.add(title1);
        TITLES_AND_SUBTITLES.add(title2);
        TITLES_AND_SUBTITLES.add(title3);
        TITLES_AND_SUBTITLES.add(title5);
    }

    @Override
    public void addPlainText() {
        PLAIN_TEXT.add(text1);
        PLAIN_TEXT.add(text2);
        PLAIN_TEXT.add(text3);
        PLAIN_TEXT.add(text4);
        PLAIN_TEXT.add(text5);
        PLAIN_TEXT.add(text6);
        PLAIN_TEXT.add(text7);
        PLAIN_TEXT.add(text8);
        PLAIN_TEXT.add(text9);
        PLAIN_TEXT.add(text10);
        PLAIN_TEXT.add(text11);
        PLAIN_TEXT.add(text12);
        PLAIN_TEXT.add(text13);
        PLAIN_TEXT.add(text14);
        PLAIN_TEXT.add(text15);
        PLAIN_TEXT.add(text16);
        PLAIN_TEXT.add(text17);
        PLAIN_TEXT.add(text19);
        PLAIN_TEXT.add(text20);
    }

    @Override
    public void addContainers() {
        CONTAINERS.add(content1);
        CONTAINERS.add(content2);
        CONTAINERS.add(content4);
        CONTAINERS.add(content5);
        CONTAINERS.add(content6);
        CONTAINERS.add(content7);
        CONTAINERS.add(container8);
        CONTAINERS.add(container9);
    }

    @Override
    public void initStyles() {
        addLighterContainers();
        styles();
        setData();
    }
    
    private void styles() {
        pacientesIcon.setSize(60, 60);
        consultasIcon.setSize(60, 60);
        organizacionIcon.setSize(60, 60);
        counterIcon.setSize(60, 60);
        busquedaIcon.setSize(30, 32);
        agregarPaciente.setSize(50, 50);
        agregarAsistente.setSize(50, 50);
        Tools.setImageLabel(busquedaIcon, "src/com/assets/busqueda.png", 10, 12, ChoosedPalette.getWhite());
        paintOneContainer(container1, ChoosedPalette.getMidColor());
        Tools.setImageLabel(agregarPaciente, "src/com/assets/agregar-usuario.png", 30, 30, ChoosedPalette.getWhite());
        Tools.setImageLabel(agregarAsistente, "src/com/assets/agregar-usuario.png", 30, 30, ChoosedPalette.getWhite());
    }

    @Override
    public void colorBasics() {
        paintSpecifiedContainers(containers, ChoosedPalette.getPrimaryLightColor());
        needBorder1.setBorder(new MatteBorder(0, 0, 1, 0, ChoosedPalette.getGray()));
        paintTitlesAndSubtitles();
        paintPlainText();
        paintOneContainer(container2, ChoosedPalette.getPrimaryLightColor());
        paintOneContainer(container3, ChoosedPalette.getPrimaryLightColor());
    }
    
    @Override
    public void light() {
        CONTAINERS.forEach(container -> {
            container.setkFillBackground(false);
            container.setkStartColor(ChoosedPalette.getGray());
            container.setkEndColor(ChoosedPalette.getGray());
            container.repaint();
        });
        
        textoPaciente.setForeground(ChoosedPalette.getMidColor());
        textoAsistente.setForeground(ChoosedPalette.getMidColor());
        
        Tools.setImageLabel(pacientesIcon, "src/com/assets/usuarios.png", 36, 36, ChoosedPalette.getMidColor());
        Tools.setImageLabel(consultasIcon, "src/com/assets/carpeta.png", 36, 36, ChoosedPalette.getMidColor());
        Tools.setImageLabel(organizacionIcon, "src/com/assets/diente.png", 36, 36, ChoosedPalette.getMidColor());
        Tools.setImageLabel(counterIcon, "src/com/assets/dolar.png", 36, 36, ChoosedPalette.getMidColor());
    }
    
    @Override
    public void dark() {
        CONTAINERS.forEach(container -> {
            container.setkFillBackground(true);
            container.setkStartColor(ChoosedPalette.getPrimaryBackground());
            container.setkEndColor(ChoosedPalette.getPrimaryBackground());
            container.repaint();
        });
        
        textoPaciente.setForeground(ChoosedPalette.getWhite());
        textoAsistente.setForeground(ChoosedPalette.getWhite());
        
        container8.setkStartColor(ChoosedPalette.getSecondaryBackground());
        container8.setkEndColor(ChoosedPalette.getSecondaryBackground());
        
        container9.setkStartColor(ChoosedPalette.getSecondaryBackground());
        container9.setkEndColor(ChoosedPalette.getSecondaryBackground());
        
        Tools.setImageLabel(pacientesIcon, "src/com/assets/usuarios.png", 36, 36, ChoosedPalette.getDarkColor());
        Tools.setImageLabel(consultasIcon, "src/com/assets/carpeta.png", 36, 36, ChoosedPalette.getDarkColor());
        Tools.setImageLabel(organizacionIcon, "src/com/assets/diente.png", 36, 36, ChoosedPalette.getDarkColor());
        Tools.setImageLabel(counterIcon, "src/com/assets/dolar.png", 36, 36, ChoosedPalette.getDarkColor());
    }
    
    public void addLighterContainers() {
        containers.add(pacientesContainer);
        containers.add(consultasContainer);
        containers.add(organizacionContainer);
        containers.add(counterContainer);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        placeDashboard = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        content1 = new com.k33ptoo.components.KGradientPanel();
        jPanel70 = new javax.swing.JPanel();
        jPanel86 = new javax.swing.JPanel();
        jPanel87 = new javax.swing.JPanel();
        jPanel88 = new javax.swing.JPanel();
        jPanel89 = new javax.swing.JPanel();
        jPanel101 = new javax.swing.JPanel();
        jPanel103 = new javax.swing.JPanel();
        jPanel104 = new javax.swing.JPanel();
        jPanel105 = new javax.swing.JPanel();
        jPanel106 = new javax.swing.JPanel();
        title2 = new javax.swing.JLabel();
        text19 = new javax.swing.JLabel();
        add = new javax.swing.JPanel();
        jPanel68 = new javax.swing.JPanel();
        jPanel94 = new javax.swing.JPanel();
        container8 = new com.k33ptoo.components.KGradientPanel();
        jPanel98 = new javax.swing.JPanel();
        jPanel92 = new javax.swing.JPanel();
        jPanel93 = new javax.swing.JPanel();
        jPanel96 = new javax.swing.JPanel();
        jPanel97 = new javax.swing.JPanel();
        jPanel69 = new javax.swing.JPanel();
        text17 = new javax.swing.JLabel();
        title3 = new javax.swing.JLabel();
        kGradientPanel3 = new com.k33ptoo.components.KGradientPanel();
        agregarPaciente = new javax.swing.JLabel();
        container2 = new com.k33ptoo.components.KGradientPanel();
        textoPaciente = new javax.swing.JLabel();
        addAsistente = new javax.swing.JPanel();
        jPanel95 = new javax.swing.JPanel();
        container9 = new com.k33ptoo.components.KGradientPanel();
        newPacientIcon1 = new javax.swing.JLabel();
        jPanel99 = new javax.swing.JPanel();
        newPacientIcon2 = new javax.swing.JLabel();
        jPanel100 = new javax.swing.JPanel();
        jpanel = new javax.swing.JPanel();
        jPanel107 = new javax.swing.JPanel();
        jPanel109 = new javax.swing.JPanel();
        jPanel110 = new javax.swing.JPanel();
        jPanel113 = new javax.swing.JPanel();
        jPanel114 = new javax.swing.JPanel();
        text20 = new javax.swing.JLabel();
        title5 = new javax.swing.JLabel();
        kGradientPanel5 = new com.k33ptoo.components.KGradientPanel();
        agregarAsistente = new javax.swing.JLabel();
        container3 = new com.k33ptoo.components.KGradientPanel();
        textoAsistente = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        mainly = new javax.swing.JPanel();
        kGradientPanel4 = new com.k33ptoo.components.KGradientPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        greeting = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        targets = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        targts = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        content2 = new com.k33ptoo.components.KGradientPanel();
        jPanel41 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jPanel49 = new javax.swing.JPanel();
        jPanel53 = new javax.swing.JPanel();
        jPanel57 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        pacientesContainer = new com.k33ptoo.components.KGradientPanel();
        pacientesIcon = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        text1 = new javax.swing.JLabel();
        contadorPacientes = new javax.swing.JLabel();
        text5 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        content4 = new com.k33ptoo.components.KGradientPanel();
        jPanel43 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jPanel50 = new javax.swing.JPanel();
        jPanel56 = new javax.swing.JPanel();
        jPanel61 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        consultasContainer = new com.k33ptoo.components.KGradientPanel();
        consultasIcon = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        text2 = new javax.swing.JLabel();
        contadorConsultas = new javax.swing.JLabel();
        text6 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        content5 = new com.k33ptoo.components.KGradientPanel();
        jPanel42 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        jPanel54 = new javax.swing.JPanel();
        jPanel62 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        counterContainer = new com.k33ptoo.components.KGradientPanel();
        counterIcon = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        text3 = new javax.swing.JLabel();
        contador = new javax.swing.JLabel();
        text7 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        content6 = new com.k33ptoo.components.KGradientPanel();
        jPanel44 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jPanel55 = new javax.swing.JPanel();
        jPanel63 = new javax.swing.JPanel();
        jPanel64 = new javax.swing.JPanel();
        organizacionContainer = new com.k33ptoo.components.KGradientPanel();
        organizacionIcon = new javax.swing.JLabel();
        jPanel65 = new javax.swing.JPanel();
        text4 = new javax.swing.JLabel();
        contadorOrganizacion = new javax.swing.JLabel();
        text8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        content7 = new com.k33ptoo.components.KGradientPanel();
        jPanel58 = new javax.swing.JPanel();
        jPanel59 = new javax.swing.JPanel();
        jPanel60 = new javax.swing.JPanel();
        jPanel66 = new javax.swing.JPanel();
        jPanel67 = new javax.swing.JPanel();
        needBorder1 = new javax.swing.JPanel();
        jPanel71 = new javax.swing.JPanel();
        jPanel72 = new javax.swing.JPanel();
        jPanel73 = new javax.swing.JPanel();
        jPanel75 = new javax.swing.JPanel();
        jPanel76 = new javax.swing.JPanel();
        jPanel74 = new javax.swing.JPanel();
        title1 = new javax.swing.JLabel();
        text9 = new javax.swing.JLabel();
        jPanel77 = new javax.swing.JPanel();
        jPanel91 = new javax.swing.JPanel();
        container1 = new com.k33ptoo.components.KGradientPanel();
        busquedaIcon = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        needBorder = new javax.swing.JPanel();
        jPanel78 = new javax.swing.JPanel();
        text10 = new javax.swing.JLabel();
        text11 = new javax.swing.JLabel();
        jPanel79 = new javax.swing.JPanel();
        jPanel81 = new javax.swing.JPanel();
        text12 = new javax.swing.JLabel();
        jPanel82 = new javax.swing.JPanel();
        text13 = new javax.swing.JLabel();
        jPanel83 = new javax.swing.JPanel();
        text14 = new javax.swing.JLabel();
        jPanel80 = new javax.swing.JPanel();
        jPanel84 = new javax.swing.JPanel();
        text15 = new javax.swing.JLabel();
        jPanel85 = new javax.swing.JPanel();
        text16 = new javax.swing.JLabel();
        jPanel111 = new javax.swing.JPanel();
        jPanel112 = new javax.swing.JPanel();
        place = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(650, 920));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(600, 920));
        setLayout(new java.awt.GridLayout(1, 0));

        placeDashboard.setBackground(new java.awt.Color(255, 255, 255));
        placeDashboard.setOpaque(false);
        placeDashboard.setPreferredSize(new java.awt.Dimension(600, 800));
        placeDashboard.setLayout(new java.awt.BorderLayout());

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setMaximumSize(new java.awt.Dimension(24, 90));
        jPanel17.setMinimumSize(new java.awt.Dimension(24, 90));
        jPanel17.setOpaque(false);
        jPanel17.setPreferredSize(new java.awt.Dimension(24, 569));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 876, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel17, java.awt.BorderLayout.LINE_END);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setMaximumSize(new java.awt.Dimension(24, 90));
        jPanel20.setMinimumSize(new java.awt.Dimension(24, 90));
        jPanel20.setOpaque(false);
        jPanel20.setPreferredSize(new java.awt.Dimension(24, 555));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 876, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel20, java.awt.BorderLayout.LINE_START);

        jPanel8.setMaximumSize(new java.awt.Dimension(32767, 20));
        jPanel8.setMinimumSize(new java.awt.Dimension(100, 20));
        jPanel8.setOpaque(false);
        jPanel8.setPreferredSize(new java.awt.Dimension(365, 20));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel8, java.awt.BorderLayout.PAGE_START);

        jPanel9.setMaximumSize(new java.awt.Dimension(32767, 24));
        jPanel9.setMinimumSize(new java.awt.Dimension(100, 24));
        jPanel9.setOpaque(false);
        jPanel9.setPreferredSize(new java.awt.Dimension(365, 24));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel9, java.awt.BorderLayout.PAGE_END);

        jPanel10.setOpaque(false);
        jPanel10.setLayout(new java.awt.GridLayout(2, 1));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel13.setOpaque(false);
        jPanel13.setLayout(new java.awt.BorderLayout());

        jPanel14.setMinimumSize(new java.awt.Dimension(250, 100));
        jPanel14.setOpaque(false);
        jPanel14.setPreferredSize(new java.awt.Dimension(250, 279));
        jPanel14.setLayout(new java.awt.BorderLayout());

        content1.setkEndColor(new java.awt.Color(204, 204, 204));
        content1.setkFillBackground(false);
        content1.setkStartColor(new java.awt.Color(204, 204, 204));
        content1.setOpaque(false);
        content1.setLayout(new java.awt.BorderLayout());

        jPanel70.setMaximumSize(new java.awt.Dimension(32767, 14));
        jPanel70.setMinimumSize(new java.awt.Dimension(100, 14));
        jPanel70.setOpaque(false);
        jPanel70.setPreferredSize(new java.awt.Dimension(365, 14));

        javax.swing.GroupLayout jPanel70Layout = new javax.swing.GroupLayout(jPanel70);
        jPanel70.setLayout(jPanel70Layout);
        jPanel70Layout.setHorizontalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel70Layout.setVerticalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        content1.add(jPanel70, java.awt.BorderLayout.PAGE_START);

        jPanel86.setBackground(new java.awt.Color(255, 255, 255));
        jPanel86.setMaximumSize(new java.awt.Dimension(14, 90));
        jPanel86.setMinimumSize(new java.awt.Dimension(14, 90));
        jPanel86.setOpaque(false);
        jPanel86.setPreferredSize(new java.awt.Dimension(14, 569));

        javax.swing.GroupLayout jPanel86Layout = new javax.swing.GroupLayout(jPanel86);
        jPanel86.setLayout(jPanel86Layout);
        jPanel86Layout.setHorizontalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel86Layout.setVerticalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        content1.add(jPanel86, java.awt.BorderLayout.LINE_START);

        jPanel87.setBackground(new java.awt.Color(255, 255, 255));
        jPanel87.setMaximumSize(new java.awt.Dimension(14, 90));
        jPanel87.setMinimumSize(new java.awt.Dimension(14, 90));
        jPanel87.setOpaque(false);
        jPanel87.setPreferredSize(new java.awt.Dimension(14, 569));

        javax.swing.GroupLayout jPanel87Layout = new javax.swing.GroupLayout(jPanel87);
        jPanel87.setLayout(jPanel87Layout);
        jPanel87Layout.setHorizontalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel87Layout.setVerticalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        content1.add(jPanel87, java.awt.BorderLayout.LINE_END);

        jPanel88.setMaximumSize(new java.awt.Dimension(32767, 14));
        jPanel88.setMinimumSize(new java.awt.Dimension(100, 14));
        jPanel88.setOpaque(false);
        jPanel88.setPreferredSize(new java.awt.Dimension(365, 14));

        javax.swing.GroupLayout jPanel88Layout = new javax.swing.GroupLayout(jPanel88);
        jPanel88.setLayout(jPanel88Layout);
        jPanel88Layout.setHorizontalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel88Layout.setVerticalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        content1.add(jPanel88, java.awt.BorderLayout.PAGE_END);

        jPanel89.setOpaque(false);
        jPanel89.setLayout(new java.awt.BorderLayout());

        jPanel101.setMinimumSize(new java.awt.Dimension(100, 80));
        jPanel101.setOpaque(false);
        jPanel101.setPreferredSize(new java.awt.Dimension(236, 80));
        jPanel101.setLayout(new java.awt.BorderLayout());

        jPanel103.setBackground(new java.awt.Color(255, 255, 255));
        jPanel103.setMaximumSize(new java.awt.Dimension(7, 90));
        jPanel103.setMinimumSize(new java.awt.Dimension(7, 90));
        jPanel103.setOpaque(false);
        jPanel103.setPreferredSize(new java.awt.Dimension(7, 569));

        javax.swing.GroupLayout jPanel103Layout = new javax.swing.GroupLayout(jPanel103);
        jPanel103.setLayout(jPanel103Layout);
        jPanel103Layout.setHorizontalGroup(
            jPanel103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel103Layout.setVerticalGroup(
            jPanel103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel101.add(jPanel103, java.awt.BorderLayout.LINE_START);

        jPanel104.setBackground(new java.awt.Color(255, 255, 255));
        jPanel104.setMaximumSize(new java.awt.Dimension(7, 90));
        jPanel104.setMinimumSize(new java.awt.Dimension(7, 90));
        jPanel104.setOpaque(false);
        jPanel104.setPreferredSize(new java.awt.Dimension(7, 569));

        javax.swing.GroupLayout jPanel104Layout = new javax.swing.GroupLayout(jPanel104);
        jPanel104.setLayout(jPanel104Layout);
        jPanel104Layout.setHorizontalGroup(
            jPanel104Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel104Layout.setVerticalGroup(
            jPanel104Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel101.add(jPanel104, java.awt.BorderLayout.LINE_END);

        jPanel105.setOpaque(false);

        jPanel106.setBackground(new java.awt.Color(69, 98, 255));

        javax.swing.GroupLayout jPanel106Layout = new javax.swing.GroupLayout(jPanel106);
        jPanel106.setLayout(jPanel106Layout);
        jPanel106Layout.setHorizontalGroup(
            jPanel106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel106Layout.setVerticalGroup(
            jPanel106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        title2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        title2.setForeground(new java.awt.Color(0, 0, 0));
        title2.setText("Acciones");

        text19.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text19.setForeground(new java.awt.Color(102, 102, 102));
        text19.setText("Realiza nuevas acciones");

        javax.swing.GroupLayout jPanel105Layout = new javax.swing.GroupLayout(jPanel105);
        jPanel105.setLayout(jPanel105Layout);
        jPanel105Layout.setHorizontalGroup(
            jPanel105Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel105Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel105Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text19, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(title2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel105Layout.setVerticalGroup(
            jPanel105Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel105Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel105Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel106, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel105Layout.createSequentialGroup()
                        .addComponent(title2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text19)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel101.add(jPanel105, java.awt.BorderLayout.CENTER);

        jPanel89.add(jPanel101, java.awt.BorderLayout.PAGE_START);

        add.setOpaque(false);
        add.setLayout(new java.awt.GridLayout(2, 1));

        jPanel68.setOpaque(false);
        jPanel68.setLayout(new java.awt.BorderLayout());

        jPanel94.setMaximumSize(new java.awt.Dimension(32767, 14));
        jPanel94.setMinimumSize(new java.awt.Dimension(100, 14));
        jPanel94.setOpaque(false);
        jPanel94.setPreferredSize(new java.awt.Dimension(365, 14));

        javax.swing.GroupLayout jPanel94Layout = new javax.swing.GroupLayout(jPanel94);
        jPanel94.setLayout(jPanel94Layout);
        jPanel94Layout.setHorizontalGroup(
            jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
        );
        jPanel94Layout.setVerticalGroup(
            jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jPanel68.add(jPanel94, java.awt.BorderLayout.PAGE_END);

        container8.setkEndColor(new java.awt.Color(204, 204, 204));
        container8.setkFillBackground(false);
        container8.setkStartColor(new java.awt.Color(204, 204, 204));
        container8.setOpaque(false);
        container8.setLayout(new java.awt.BorderLayout());

        jPanel98.setOpaque(false);
        jPanel98.setLayout(new java.awt.BorderLayout());

        jPanel92.setBackground(new java.awt.Color(255, 255, 255));
        jPanel92.setMaximumSize(new java.awt.Dimension(14, 90));
        jPanel92.setMinimumSize(new java.awt.Dimension(14, 90));
        jPanel92.setOpaque(false);
        jPanel92.setPreferredSize(new java.awt.Dimension(14, 569));

        javax.swing.GroupLayout jPanel92Layout = new javax.swing.GroupLayout(jPanel92);
        jPanel92.setLayout(jPanel92Layout);
        jPanel92Layout.setHorizontalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel92Layout.setVerticalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
        );

        jPanel98.add(jPanel92, java.awt.BorderLayout.LINE_END);

        jPanel93.setBackground(new java.awt.Color(255, 255, 255));
        jPanel93.setMaximumSize(new java.awt.Dimension(14, 90));
        jPanel93.setMinimumSize(new java.awt.Dimension(14, 90));
        jPanel93.setOpaque(false);
        jPanel93.setPreferredSize(new java.awt.Dimension(14, 569));

        javax.swing.GroupLayout jPanel93Layout = new javax.swing.GroupLayout(jPanel93);
        jPanel93.setLayout(jPanel93Layout);
        jPanel93Layout.setHorizontalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel93Layout.setVerticalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
        );

        jPanel98.add(jPanel93, java.awt.BorderLayout.LINE_START);

        jPanel96.setMaximumSize(new java.awt.Dimension(32767, 14));
        jPanel96.setMinimumSize(new java.awt.Dimension(100, 14));
        jPanel96.setOpaque(false);
        jPanel96.setPreferredSize(new java.awt.Dimension(365, 14));

        javax.swing.GroupLayout jPanel96Layout = new javax.swing.GroupLayout(jPanel96);
        jPanel96.setLayout(jPanel96Layout);
        jPanel96Layout.setHorizontalGroup(
            jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
        );
        jPanel96Layout.setVerticalGroup(
            jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jPanel98.add(jPanel96, java.awt.BorderLayout.PAGE_START);

        jPanel97.setMaximumSize(new java.awt.Dimension(32767, 14));
        jPanel97.setMinimumSize(new java.awt.Dimension(100, 14));
        jPanel97.setOpaque(false);
        jPanel97.setPreferredSize(new java.awt.Dimension(365, 14));

        javax.swing.GroupLayout jPanel97Layout = new javax.swing.GroupLayout(jPanel97);
        jPanel97.setLayout(jPanel97Layout);
        jPanel97Layout.setHorizontalGroup(
            jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
        );
        jPanel97Layout.setVerticalGroup(
            jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jPanel98.add(jPanel97, java.awt.BorderLayout.PAGE_END);

        jPanel69.setOpaque(false);

        text17.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        text17.setForeground(new java.awt.Color(102, 102, 102));
        text17.setText("Crear paciente");
        text17.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        title3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title3.setForeground(new java.awt.Color(51, 51, 51));
        title3.setText("Nuevo paciente");
        title3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        kGradientPanel3.setkBorderRadius(100);
        kGradientPanel3.setkEndColor(new java.awt.Color(69, 98, 255));
        kGradientPanel3.setkStartColor(new java.awt.Color(69, 98, 255));
        kGradientPanel3.setMaximumSize(new java.awt.Dimension(50, 50));
        kGradientPanel3.setMinimumSize(new java.awt.Dimension(50, 50));
        kGradientPanel3.setOpaque(false);
        kGradientPanel3.setLayout(new java.awt.BorderLayout());

        agregarPaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kGradientPanel3.add(agregarPaciente, java.awt.BorderLayout.CENTER);

        container2.setkEndColor(new java.awt.Color(0, 0, 0));
        container2.setkStartColor(new java.awt.Color(0, 0, 0));
        container2.setOpaque(false);
        container2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                container2MouseClicked(evt);
            }
        });

        textoPaciente.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        textoPaciente.setForeground(new java.awt.Color(255, 255, 255));
        textoPaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoPaciente.setText("Agregar paciente");
        textoPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout container2Layout = new javax.swing.GroupLayout(container2);
        container2.setLayout(container2Layout);
        container2Layout.setHorizontalGroup(
            container2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        container2Layout.setVerticalGroup(
            container2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel69Layout = new javax.swing.GroupLayout(jPanel69);
        jPanel69.setLayout(jPanel69Layout);
        jPanel69Layout.setHorizontalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel69Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text17))
                .addGap(0, 14, Short.MAX_VALUE))
            .addComponent(container2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel69Layout.setVerticalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel69Layout.createSequentialGroup()
                .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel69Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(title3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text17)))
                .addGap(24, 24, 24)
                .addComponent(container2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel98.add(jPanel69, java.awt.BorderLayout.CENTER);

        container8.add(jPanel98, java.awt.BorderLayout.CENTER);

        jPanel68.add(container8, java.awt.BorderLayout.CENTER);

        add.add(jPanel68);

        addAsistente.setOpaque(false);
        addAsistente.setLayout(new java.awt.BorderLayout());

        jPanel95.setMaximumSize(new java.awt.Dimension(32767, 14));
        jPanel95.setMinimumSize(new java.awt.Dimension(100, 14));
        jPanel95.setOpaque(false);
        jPanel95.setPreferredSize(new java.awt.Dimension(365, 14));

        javax.swing.GroupLayout jPanel95Layout = new javax.swing.GroupLayout(jPanel95);
        jPanel95.setLayout(jPanel95Layout);
        jPanel95Layout.setHorizontalGroup(
            jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
        );
        jPanel95Layout.setVerticalGroup(
            jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        addAsistente.add(jPanel95, java.awt.BorderLayout.PAGE_END);

        container9.setkEndColor(new java.awt.Color(204, 204, 204));
        container9.setkFillBackground(false);
        container9.setkStartColor(new java.awt.Color(204, 204, 204));
        container9.setOpaque(false);
        container9.setLayout(new java.awt.BorderLayout());

        newPacientIcon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        container9.add(newPacientIcon1, java.awt.BorderLayout.CENTER);

        jPanel99.setOpaque(false);

        javax.swing.GroupLayout jPanel99Layout = new javax.swing.GroupLayout(jPanel99);
        jPanel99.setLayout(jPanel99Layout);
        jPanel99Layout.setHorizontalGroup(
            jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel99Layout.setVerticalGroup(
            jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        container9.add(jPanel99, java.awt.BorderLayout.CENTER);

        newPacientIcon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        container9.add(newPacientIcon2, java.awt.BorderLayout.CENTER);

        jPanel100.setOpaque(false);
        jPanel100.setLayout(new java.awt.BorderLayout());

        jpanel.setOpaque(false);
        jpanel.setLayout(new java.awt.BorderLayout());

        jPanel107.setBackground(new java.awt.Color(255, 255, 255));
        jPanel107.setMaximumSize(new java.awt.Dimension(14, 90));
        jPanel107.setMinimumSize(new java.awt.Dimension(14, 90));
        jPanel107.setOpaque(false);
        jPanel107.setPreferredSize(new java.awt.Dimension(14, 569));

        javax.swing.GroupLayout jPanel107Layout = new javax.swing.GroupLayout(jPanel107);
        jPanel107.setLayout(jPanel107Layout);
        jPanel107Layout.setHorizontalGroup(
            jPanel107Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel107Layout.setVerticalGroup(
            jPanel107Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
        );

        jpanel.add(jPanel107, java.awt.BorderLayout.LINE_END);

        jPanel109.setBackground(new java.awt.Color(255, 255, 255));
        jPanel109.setMaximumSize(new java.awt.Dimension(14, 90));
        jPanel109.setMinimumSize(new java.awt.Dimension(14, 90));
        jPanel109.setOpaque(false);
        jPanel109.setPreferredSize(new java.awt.Dimension(14, 569));

        javax.swing.GroupLayout jPanel109Layout = new javax.swing.GroupLayout(jPanel109);
        jPanel109.setLayout(jPanel109Layout);
        jPanel109Layout.setHorizontalGroup(
            jPanel109Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel109Layout.setVerticalGroup(
            jPanel109Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
        );

        jpanel.add(jPanel109, java.awt.BorderLayout.LINE_START);

        jPanel110.setMaximumSize(new java.awt.Dimension(32767, 14));
        jPanel110.setMinimumSize(new java.awt.Dimension(100, 14));
        jPanel110.setOpaque(false);
        jPanel110.setPreferredSize(new java.awt.Dimension(365, 14));

        javax.swing.GroupLayout jPanel110Layout = new javax.swing.GroupLayout(jPanel110);
        jPanel110.setLayout(jPanel110Layout);
        jPanel110Layout.setHorizontalGroup(
            jPanel110Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
        );
        jPanel110Layout.setVerticalGroup(
            jPanel110Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jpanel.add(jPanel110, java.awt.BorderLayout.PAGE_START);

        jPanel113.setMaximumSize(new java.awt.Dimension(32767, 14));
        jPanel113.setMinimumSize(new java.awt.Dimension(100, 14));
        jPanel113.setOpaque(false);
        jPanel113.setPreferredSize(new java.awt.Dimension(365, 14));

        javax.swing.GroupLayout jPanel113Layout = new javax.swing.GroupLayout(jPanel113);
        jPanel113.setLayout(jPanel113Layout);
        jPanel113Layout.setHorizontalGroup(
            jPanel113Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
        );
        jPanel113Layout.setVerticalGroup(
            jPanel113Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jpanel.add(jPanel113, java.awt.BorderLayout.PAGE_END);

        jPanel114.setOpaque(false);

        text20.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        text20.setForeground(new java.awt.Color(102, 102, 102));
        text20.setText("Crear asistente");
        text20.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        title5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title5.setForeground(new java.awt.Color(51, 51, 51));
        title5.setText("Nuevo asistente");
        title5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        kGradientPanel5.setkBorderRadius(100);
        kGradientPanel5.setkEndColor(new java.awt.Color(69, 98, 255));
        kGradientPanel5.setkStartColor(new java.awt.Color(69, 98, 255));
        kGradientPanel5.setMaximumSize(new java.awt.Dimension(50, 50));
        kGradientPanel5.setMinimumSize(new java.awt.Dimension(50, 50));
        kGradientPanel5.setOpaque(false);
        kGradientPanel5.setLayout(new java.awt.BorderLayout());

        agregarAsistente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kGradientPanel5.add(agregarAsistente, java.awt.BorderLayout.CENTER);

        container3.setkEndColor(new java.awt.Color(0, 0, 0));
        container3.setkStartColor(new java.awt.Color(0, 0, 0));
        container3.setOpaque(false);
        container3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                container3MouseClicked(evt);
            }
        });

        textoAsistente.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        textoAsistente.setForeground(new java.awt.Color(255, 255, 255));
        textoAsistente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoAsistente.setText("Agregar asistente");
        textoAsistente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textoAsistente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoAsistenteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout container3Layout = new javax.swing.GroupLayout(container3);
        container3.setLayout(container3Layout);
        container3Layout.setHorizontalGroup(
            container3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textoAsistente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        container3Layout.setVerticalGroup(
            container3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textoAsistente, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel114Layout = new javax.swing.GroupLayout(jPanel114);
        jPanel114.setLayout(jPanel114Layout);
        jPanel114Layout.setHorizontalGroup(
            jPanel114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel114Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text20))
                .addGap(0, 14, Short.MAX_VALUE))
            .addComponent(container3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel114Layout.setVerticalGroup(
            jPanel114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel114Layout.createSequentialGroup()
                .addGroup(jPanel114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kGradientPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel114Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(title5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text20)))
                .addGap(24, 24, 24)
                .addComponent(container3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpanel.add(jPanel114, java.awt.BorderLayout.CENTER);

        jPanel100.add(jpanel, java.awt.BorderLayout.CENTER);

        container9.add(jPanel100, java.awt.BorderLayout.CENTER);

        addAsistente.add(container9, java.awt.BorderLayout.CENTER);

        add.add(addAsistente);

        jPanel89.add(add, java.awt.BorderLayout.CENTER);

        content1.add(jPanel89, java.awt.BorderLayout.CENTER);

        jPanel14.add(content1, java.awt.BorderLayout.CENTER);

        jPanel13.add(jPanel14, java.awt.BorderLayout.LINE_END);

        jPanel15.setOpaque(false);
        jPanel15.setLayout(new java.awt.BorderLayout());

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setMaximumSize(new java.awt.Dimension(14, 90));
        jPanel21.setMinimumSize(new java.awt.Dimension(14, 90));
        jPanel21.setOpaque(false);
        jPanel21.setPreferredSize(new java.awt.Dimension(14, 569));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel21, java.awt.BorderLayout.LINE_END);

        mainly.setOpaque(false);
        mainly.setLayout(new java.awt.GridLayout(2, 1));

        kGradientPanel4.setkEndColor(new java.awt.Color(156, 172, 255));
        kGradientPanel4.setkStartColor(new java.awt.Color(69, 98, 255));
        kGradientPanel4.setOpaque(false);
        kGradientPanel4.setLayout(new java.awt.BorderLayout());

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));
        jPanel37.setDoubleBuffered(false);
        jPanel37.setMaximumSize(new java.awt.Dimension(14, 90));
        jPanel37.setMinimumSize(new java.awt.Dimension(14, 90));
        jPanel37.setOpaque(false);
        jPanel37.setPreferredSize(new java.awt.Dimension(14, 569));

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 191, Short.MAX_VALUE)
        );

        kGradientPanel4.add(jPanel37, java.awt.BorderLayout.LINE_START);

        jPanel38.setBackground(new java.awt.Color(255, 255, 255));
        jPanel38.setMaximumSize(new java.awt.Dimension(14, 90));
        jPanel38.setMinimumSize(new java.awt.Dimension(14, 90));
        jPanel38.setOpaque(false);
        jPanel38.setPreferredSize(new java.awt.Dimension(14, 569));

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 191, Short.MAX_VALUE)
        );

        kGradientPanel4.add(jPanel38, java.awt.BorderLayout.LINE_END);

        jPanel39.setMaximumSize(new java.awt.Dimension(32767, 14));
        jPanel39.setMinimumSize(new java.awt.Dimension(100, 14));
        jPanel39.setOpaque(false);
        jPanel39.setPreferredSize(new java.awt.Dimension(365, 14));

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        kGradientPanel4.add(jPanel39, java.awt.BorderLayout.PAGE_START);

        jPanel40.setMaximumSize(new java.awt.Dimension(32767, 14));
        jPanel40.setMinimumSize(new java.awt.Dimension(100, 14));
        jPanel40.setOpaque(false);
        jPanel40.setPreferredSize(new java.awt.Dimension(365, 14));

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        kGradientPanel4.add(jPanel40, java.awt.BorderLayout.PAGE_END);

        jPanel12.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Doctor");

        greeting.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        greeting.setForeground(new java.awt.Color(255, 255, 255));
        greeting.setText("Hola, Daniel Alessandro");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Panel de control, gestión clínica");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(greeting, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(greeting)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        kGradientPanel4.add(jPanel12, java.awt.BorderLayout.CENTER);

        mainly.add(kGradientPanel4);

        targets.setOpaque(false);
        targets.setLayout(new java.awt.BorderLayout());

        jPanel23.setMaximumSize(new java.awt.Dimension(32767, 14));
        jPanel23.setMinimumSize(new java.awt.Dimension(100, 14));
        jPanel23.setOpaque(false);
        jPanel23.setPreferredSize(new java.awt.Dimension(365, 14));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        targets.add(jPanel23, java.awt.BorderLayout.PAGE_START);

        targts.setOpaque(false);
        targts.setLayout(new java.awt.GridLayout(2, 2));

        jPanel25.setOpaque(false);
        jPanel25.setLayout(new java.awt.BorderLayout());

        jPanel29.setMaximumSize(new java.awt.Dimension(32767, 7));
        jPanel29.setMinimumSize(new java.awt.Dimension(100, 7));
        jPanel29.setOpaque(false);
        jPanel29.setPreferredSize(new java.awt.Dimension(365, 7));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 169, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        jPanel25.add(jPanel29, java.awt.BorderLayout.PAGE_END);

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.setMaximumSize(new java.awt.Dimension(7, 90));
        jPanel33.setMinimumSize(new java.awt.Dimension(7, 90));
        jPanel33.setOpaque(false);
        jPanel33.setPreferredSize(new java.awt.Dimension(7, 569));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 95, Short.MAX_VALUE)
        );

        jPanel25.add(jPanel33, java.awt.BorderLayout.LINE_END);

        content2.setkEndColor(new java.awt.Color(204, 204, 204));
        content2.setkFillBackground(false);
        content2.setkStartColor(new java.awt.Color(204, 204, 204));
        content2.setOpaque(false);
        content2.setLayout(new java.awt.BorderLayout());

        jPanel41.setBackground(new java.awt.Color(255, 255, 255));
        jPanel41.setMaximumSize(new java.awt.Dimension(7, 90));
        jPanel41.setMinimumSize(new java.awt.Dimension(7, 90));
        jPanel41.setOpaque(false);
        jPanel41.setPreferredSize(new java.awt.Dimension(7, 569));

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        content2.add(jPanel41, java.awt.BorderLayout.LINE_END);

        jPanel45.setMaximumSize(new java.awt.Dimension(32767, 7));
        jPanel45.setMinimumSize(new java.awt.Dimension(100, 7));
        jPanel45.setOpaque(false);
        jPanel45.setPreferredSize(new java.awt.Dimension(365, 7));

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        content2.add(jPanel45, java.awt.BorderLayout.PAGE_START);

        jPanel49.setBackground(new java.awt.Color(255, 255, 255));
        jPanel49.setMaximumSize(new java.awt.Dimension(7, 90));
        jPanel49.setMinimumSize(new java.awt.Dimension(7, 90));
        jPanel49.setOpaque(false);
        jPanel49.setPreferredSize(new java.awt.Dimension(7, 569));

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        content2.add(jPanel49, java.awt.BorderLayout.LINE_START);

        jPanel53.setMaximumSize(new java.awt.Dimension(32767, 7));
        jPanel53.setMinimumSize(new java.awt.Dimension(100, 7));
        jPanel53.setOpaque(false);
        jPanel53.setPreferredSize(new java.awt.Dimension(365, 7));

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        content2.add(jPanel53, java.awt.BorderLayout.PAGE_END);

        jPanel57.setOpaque(false);
        jPanel57.setLayout(new java.awt.BorderLayout());

        jPanel3.setMinimumSize(new java.awt.Dimension(75, 100));
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(75, 72));

        pacientesContainer.setkBorderRadius(15);
        pacientesContainer.setkEndColor(new java.awt.Color(204, 204, 204));
        pacientesContainer.setkStartColor(new java.awt.Color(204, 204, 204));
        pacientesContainer.setMinimumSize(new java.awt.Dimension(50, 50));
        pacientesContainer.setOpaque(false);
        pacientesContainer.setPreferredSize(new java.awt.Dimension(60, 60));
        pacientesContainer.setLayout(new java.awt.BorderLayout());

        pacientesIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pacientesContainer.add(pacientesIcon, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pacientesContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pacientesContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel57.add(jPanel3, java.awt.BorderLayout.LINE_END);

        jPanel5.setOpaque(false);

        text1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text1.setForeground(new java.awt.Color(153, 153, 153));
        text1.setText("Pacientes");

        contadorPacientes.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 28)); // NOI18N
        contadorPacientes.setForeground(new java.awt.Color(0, 0, 0));
        contadorPacientes.setText("0");

        text5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text5.setForeground(new java.awt.Color(153, 153, 153));
        text5.setText("Pacientes totales registrados");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text1)
                            .addComponent(contadorPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(text1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contadorPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(text5)
                .addContainerGap())
        );

        jPanel57.add(jPanel5, java.awt.BorderLayout.CENTER);

        content2.add(jPanel57, java.awt.BorderLayout.CENTER);

        jPanel25.add(content2, java.awt.BorderLayout.CENTER);

        targts.add(jPanel25);

        jPanel26.setOpaque(false);
        jPanel26.setLayout(new java.awt.BorderLayout());

        jPanel30.setMaximumSize(new java.awt.Dimension(32767, 7));
        jPanel30.setMinimumSize(new java.awt.Dimension(100, 7));
        jPanel30.setOpaque(false);
        jPanel30.setPreferredSize(new java.awt.Dimension(365, 7));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 169, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        jPanel26.add(jPanel30, java.awt.BorderLayout.PAGE_END);

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));
        jPanel34.setMaximumSize(new java.awt.Dimension(7, 90));
        jPanel34.setMinimumSize(new java.awt.Dimension(7, 90));
        jPanel34.setOpaque(false);
        jPanel34.setPreferredSize(new java.awt.Dimension(7, 569));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 95, Short.MAX_VALUE)
        );

        jPanel26.add(jPanel34, java.awt.BorderLayout.LINE_START);

        content4.setkEndColor(new java.awt.Color(204, 204, 204));
        content4.setkFillBackground(false);
        content4.setkStartColor(new java.awt.Color(204, 204, 204));
        content4.setOpaque(false);
        content4.setLayout(new java.awt.BorderLayout());

        jPanel43.setBackground(new java.awt.Color(255, 255, 255));
        jPanel43.setMaximumSize(new java.awt.Dimension(7, 90));
        jPanel43.setMinimumSize(new java.awt.Dimension(7, 90));
        jPanel43.setOpaque(false);
        jPanel43.setPreferredSize(new java.awt.Dimension(7, 569));

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        content4.add(jPanel43, java.awt.BorderLayout.LINE_START);

        jPanel46.setMaximumSize(new java.awt.Dimension(32767, 7));
        jPanel46.setMinimumSize(new java.awt.Dimension(100, 7));
        jPanel46.setOpaque(false);
        jPanel46.setPreferredSize(new java.awt.Dimension(365, 7));

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        content4.add(jPanel46, java.awt.BorderLayout.PAGE_START);

        jPanel50.setBackground(new java.awt.Color(255, 255, 255));
        jPanel50.setMaximumSize(new java.awt.Dimension(7, 90));
        jPanel50.setMinimumSize(new java.awt.Dimension(7, 90));
        jPanel50.setOpaque(false);
        jPanel50.setPreferredSize(new java.awt.Dimension(7, 569));

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        content4.add(jPanel50, java.awt.BorderLayout.LINE_END);

        jPanel56.setMaximumSize(new java.awt.Dimension(32767, 7));
        jPanel56.setMinimumSize(new java.awt.Dimension(100, 7));
        jPanel56.setOpaque(false);
        jPanel56.setPreferredSize(new java.awt.Dimension(365, 7));

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        content4.add(jPanel56, java.awt.BorderLayout.PAGE_END);

        jPanel61.setOpaque(false);
        jPanel61.setLayout(new java.awt.BorderLayout());

        jPanel6.setMinimumSize(new java.awt.Dimension(75, 100));
        jPanel6.setOpaque(false);
        jPanel6.setPreferredSize(new java.awt.Dimension(75, 72));

        consultasContainer.setkBorderRadius(15);
        consultasContainer.setkEndColor(new java.awt.Color(204, 204, 204));
        consultasContainer.setkStartColor(new java.awt.Color(204, 204, 204));
        consultasContainer.setMinimumSize(new java.awt.Dimension(50, 50));
        consultasContainer.setOpaque(false);
        consultasContainer.setPreferredSize(new java.awt.Dimension(60, 60));
        consultasContainer.setLayout(new java.awt.BorderLayout());

        consultasIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        consultasContainer.add(consultasIcon, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(consultasContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(consultasContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel61.add(jPanel6, java.awt.BorderLayout.LINE_END);

        jPanel7.setOpaque(false);

        text2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text2.setForeground(new java.awt.Color(153, 153, 153));
        text2.setText("Consultas");

        contadorConsultas.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 28)); // NOI18N
        contadorConsultas.setForeground(new java.awt.Color(0, 0, 0));
        contadorConsultas.setText("0");

        text6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text6.setForeground(new java.awt.Color(153, 153, 153));
        text6.setText("Consultas totales");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text2)
                            .addComponent(contadorConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(text2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contadorConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(text6)
                .addContainerGap())
        );

        jPanel61.add(jPanel7, java.awt.BorderLayout.CENTER);

        content4.add(jPanel61, java.awt.BorderLayout.CENTER);

        jPanel26.add(content4, java.awt.BorderLayout.CENTER);

        targts.add(jPanel26);

        jPanel27.setOpaque(false);
        jPanel27.setLayout(new java.awt.BorderLayout());

        jPanel32.setMaximumSize(new java.awt.Dimension(32767, 7));
        jPanel32.setMinimumSize(new java.awt.Dimension(100, 7));
        jPanel32.setOpaque(false);
        jPanel32.setPreferredSize(new java.awt.Dimension(365, 7));

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 169, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        jPanel27.add(jPanel32, java.awt.BorderLayout.PAGE_START);

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));
        jPanel36.setMaximumSize(new java.awt.Dimension(7, 90));
        jPanel36.setMinimumSize(new java.awt.Dimension(7, 90));
        jPanel36.setOpaque(false);
        jPanel36.setPreferredSize(new java.awt.Dimension(7, 569));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 95, Short.MAX_VALUE)
        );

        jPanel27.add(jPanel36, java.awt.BorderLayout.LINE_END);

        content5.setkEndColor(new java.awt.Color(204, 204, 204));
        content5.setkFillBackground(false);
        content5.setkStartColor(new java.awt.Color(204, 204, 204));
        content5.setOpaque(false);
        content5.setLayout(new java.awt.BorderLayout());

        jPanel42.setBackground(new java.awt.Color(255, 255, 255));
        jPanel42.setMaximumSize(new java.awt.Dimension(7, 90));
        jPanel42.setMinimumSize(new java.awt.Dimension(7, 90));
        jPanel42.setOpaque(false);
        jPanel42.setPreferredSize(new java.awt.Dimension(7, 569));

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        content5.add(jPanel42, java.awt.BorderLayout.LINE_START);

        jPanel47.setMaximumSize(new java.awt.Dimension(32767, 7));
        jPanel47.setMinimumSize(new java.awt.Dimension(100, 7));
        jPanel47.setOpaque(false);
        jPanel47.setPreferredSize(new java.awt.Dimension(365, 7));

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        content5.add(jPanel47, java.awt.BorderLayout.PAGE_START);

        jPanel52.setBackground(new java.awt.Color(255, 255, 255));
        jPanel52.setMaximumSize(new java.awt.Dimension(7, 90));
        jPanel52.setMinimumSize(new java.awt.Dimension(7, 90));
        jPanel52.setOpaque(false);
        jPanel52.setPreferredSize(new java.awt.Dimension(7, 569));

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        content5.add(jPanel52, java.awt.BorderLayout.LINE_END);

        jPanel54.setMaximumSize(new java.awt.Dimension(32767, 7));
        jPanel54.setMinimumSize(new java.awt.Dimension(100, 7));
        jPanel54.setOpaque(false);
        jPanel54.setPreferredSize(new java.awt.Dimension(365, 7));

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        content5.add(jPanel54, java.awt.BorderLayout.PAGE_END);

        jPanel62.setOpaque(false);
        jPanel62.setLayout(new java.awt.BorderLayout());

        jPanel18.setMinimumSize(new java.awt.Dimension(75, 100));
        jPanel18.setOpaque(false);
        jPanel18.setPreferredSize(new java.awt.Dimension(75, 72));

        counterContainer.setkBorderRadius(15);
        counterContainer.setkEndColor(new java.awt.Color(204, 204, 204));
        counterContainer.setkStartColor(new java.awt.Color(204, 204, 204));
        counterContainer.setMinimumSize(new java.awt.Dimension(50, 50));
        counterContainer.setOpaque(false);
        counterContainer.setPreferredSize(new java.awt.Dimension(60, 60));
        counterContainer.setLayout(new java.awt.BorderLayout());

        counterIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        counterContainer.add(counterIcon, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(counterContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(counterContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel62.add(jPanel18, java.awt.BorderLayout.LINE_END);

        jPanel19.setOpaque(false);

        text3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text3.setForeground(new java.awt.Color(153, 153, 153));
        text3.setText("Ingresos");

        contador.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 28)); // NOI18N
        contador.setForeground(new java.awt.Color(0, 0, 0));
        contador.setText("$0");

        text7.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text7.setForeground(new java.awt.Color(153, 153, 153));
        text7.setText("Ingresos totales por consultas");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(text3)
                                .addGap(0, 6, Short.MAX_VALUE))
                            .addComponent(contador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(text3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contador, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(text7)
                .addContainerGap())
        );

        jPanel62.add(jPanel19, java.awt.BorderLayout.CENTER);

        content5.add(jPanel62, java.awt.BorderLayout.CENTER);

        jPanel27.add(content5, java.awt.BorderLayout.CENTER);

        targts.add(jPanel27);

        jPanel28.setOpaque(false);
        jPanel28.setLayout(new java.awt.BorderLayout());

        jPanel31.setMaximumSize(new java.awt.Dimension(32767, 7));
        jPanel31.setMinimumSize(new java.awt.Dimension(100, 7));
        jPanel31.setOpaque(false);
        jPanel31.setPreferredSize(new java.awt.Dimension(365, 7));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 169, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        jPanel28.add(jPanel31, java.awt.BorderLayout.PAGE_START);

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));
        jPanel35.setMaximumSize(new java.awt.Dimension(7, 90));
        jPanel35.setMinimumSize(new java.awt.Dimension(7, 90));
        jPanel35.setOpaque(false);
        jPanel35.setPreferredSize(new java.awt.Dimension(7, 569));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 95, Short.MAX_VALUE)
        );

        jPanel28.add(jPanel35, java.awt.BorderLayout.LINE_START);

        content6.setkEndColor(new java.awt.Color(204, 204, 204));
        content6.setkFillBackground(false);
        content6.setkStartColor(new java.awt.Color(204, 204, 204));
        content6.setOpaque(false);
        content6.setLayout(new java.awt.BorderLayout());

        jPanel44.setBackground(new java.awt.Color(255, 255, 255));
        jPanel44.setMaximumSize(new java.awt.Dimension(7, 90));
        jPanel44.setMinimumSize(new java.awt.Dimension(7, 90));
        jPanel44.setOpaque(false);
        jPanel44.setPreferredSize(new java.awt.Dimension(7, 569));

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        content6.add(jPanel44, java.awt.BorderLayout.LINE_START);

        jPanel48.setMaximumSize(new java.awt.Dimension(32767, 7));
        jPanel48.setMinimumSize(new java.awt.Dimension(100, 7));
        jPanel48.setOpaque(false);
        jPanel48.setPreferredSize(new java.awt.Dimension(365, 7));

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        content6.add(jPanel48, java.awt.BorderLayout.PAGE_START);

        jPanel51.setBackground(new java.awt.Color(255, 255, 255));
        jPanel51.setMaximumSize(new java.awt.Dimension(7, 90));
        jPanel51.setMinimumSize(new java.awt.Dimension(7, 90));
        jPanel51.setOpaque(false);
        jPanel51.setPreferredSize(new java.awt.Dimension(7, 569));

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        content6.add(jPanel51, java.awt.BorderLayout.LINE_END);

        jPanel55.setMaximumSize(new java.awt.Dimension(32767, 7));
        jPanel55.setMinimumSize(new java.awt.Dimension(100, 7));
        jPanel55.setOpaque(false);
        jPanel55.setPreferredSize(new java.awt.Dimension(365, 7));

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        content6.add(jPanel55, java.awt.BorderLayout.PAGE_END);

        jPanel63.setOpaque(false);
        jPanel63.setLayout(new java.awt.BorderLayout());

        jPanel64.setMinimumSize(new java.awt.Dimension(75, 100));
        jPanel64.setOpaque(false);
        jPanel64.setPreferredSize(new java.awt.Dimension(75, 72));

        organizacionContainer.setkBorderRadius(15);
        organizacionContainer.setkEndColor(new java.awt.Color(204, 204, 204));
        organizacionContainer.setkStartColor(new java.awt.Color(204, 204, 204));
        organizacionContainer.setMinimumSize(new java.awt.Dimension(50, 50));
        organizacionContainer.setOpaque(false);
        organizacionContainer.setPreferredSize(new java.awt.Dimension(60, 60));
        organizacionContainer.setLayout(new java.awt.BorderLayout());

        organizacionIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        organizacionContainer.add(organizacionIcon, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel64Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(organizacionContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(organizacionContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel63.add(jPanel64, java.awt.BorderLayout.LINE_END);

        jPanel65.setOpaque(false);

        text4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text4.setForeground(new java.awt.Color(153, 153, 153));
        text4.setText("Organización");

        contadorOrganizacion.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 28)); // NOI18N
        contadorOrganizacion.setForeground(new java.awt.Color(0, 0, 0));
        contadorOrganizacion.setText("0");

        text8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text8.setForeground(new java.awt.Color(153, 153, 153));
        text8.setText("Asistentes totales de organización");

        javax.swing.GroupLayout jPanel65Layout = new javax.swing.GroupLayout(jPanel65);
        jPanel65.setLayout(jPanel65Layout);
        jPanel65Layout.setHorizontalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel65Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel65Layout.createSequentialGroup()
                        .addComponent(contadorOrganizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(text4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel65Layout.setVerticalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel65Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(text4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contadorOrganizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(text8)
                .addContainerGap())
        );

        jPanel63.add(jPanel65, java.awt.BorderLayout.CENTER);

        content6.add(jPanel63, java.awt.BorderLayout.CENTER);

        jPanel28.add(content6, java.awt.BorderLayout.CENTER);

        targts.add(jPanel28);

        targets.add(targts, java.awt.BorderLayout.CENTER);

        mainly.add(targets);

        jPanel15.add(mainly, java.awt.BorderLayout.CENTER);

        jPanel13.add(jPanel15, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel2);

        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 400));
        jPanel1.setMinimumSize(new java.awt.Dimension(100, 200));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(673, 400));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel11.setMaximumSize(new java.awt.Dimension(32767, 14));
        jPanel11.setMinimumSize(new java.awt.Dimension(100, 14));
        jPanel11.setOpaque(false);
        jPanel11.setPreferredSize(new java.awt.Dimension(365, 14));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel11, java.awt.BorderLayout.PAGE_START);

        content7.setkEndColor(new java.awt.Color(204, 204, 204));
        content7.setkFillBackground(false);
        content7.setkStartColor(new java.awt.Color(204, 204, 204));
        content7.setOpaque(false);
        content7.setLayout(new java.awt.BorderLayout());

        jPanel58.setMaximumSize(new java.awt.Dimension(32767, 14));
        jPanel58.setMinimumSize(new java.awt.Dimension(100, 14));
        jPanel58.setOpaque(false);
        jPanel58.setPreferredSize(new java.awt.Dimension(365, 14));

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        content7.add(jPanel58, java.awt.BorderLayout.PAGE_END);

        jPanel59.setMaximumSize(new java.awt.Dimension(32767, 14));
        jPanel59.setMinimumSize(new java.awt.Dimension(100, 14));
        jPanel59.setOpaque(false);
        jPanel59.setPreferredSize(new java.awt.Dimension(365, 14));

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        content7.add(jPanel59, java.awt.BorderLayout.PAGE_START);

        jPanel60.setBackground(new java.awt.Color(255, 255, 255));
        jPanel60.setMaximumSize(new java.awt.Dimension(14, 90));
        jPanel60.setMinimumSize(new java.awt.Dimension(14, 90));
        jPanel60.setOpaque(false);
        jPanel60.setPreferredSize(new java.awt.Dimension(14, 569));

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );

        content7.add(jPanel60, java.awt.BorderLayout.LINE_START);

        jPanel66.setBackground(new java.awt.Color(255, 255, 255));
        jPanel66.setMaximumSize(new java.awt.Dimension(14, 90));
        jPanel66.setMinimumSize(new java.awt.Dimension(14, 90));
        jPanel66.setOpaque(false);
        jPanel66.setPreferredSize(new java.awt.Dimension(14, 569));

        javax.swing.GroupLayout jPanel66Layout = new javax.swing.GroupLayout(jPanel66);
        jPanel66.setLayout(jPanel66Layout);
        jPanel66Layout.setHorizontalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel66Layout.setVerticalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );

        content7.add(jPanel66, java.awt.BorderLayout.LINE_END);

        jPanel67.setOpaque(false);
        jPanel67.setLayout(new java.awt.BorderLayout());

        needBorder1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        needBorder1.setMinimumSize(new java.awt.Dimension(100, 110));
        needBorder1.setOpaque(false);
        needBorder1.setPreferredSize(new java.awt.Dimension(574, 110));
        needBorder1.setLayout(new java.awt.BorderLayout());

        jPanel71.setOpaque(false);
        jPanel71.setPreferredSize(new java.awt.Dimension(59, 59));
        jPanel71.setLayout(new java.awt.BorderLayout());

        jPanel72.setBackground(new java.awt.Color(255, 255, 255));
        jPanel72.setMaximumSize(new java.awt.Dimension(7, 90));
        jPanel72.setMinimumSize(new java.awt.Dimension(7, 90));
        jPanel72.setOpaque(false);
        jPanel72.setPreferredSize(new java.awt.Dimension(7, 569));

        javax.swing.GroupLayout jPanel72Layout = new javax.swing.GroupLayout(jPanel72);
        jPanel72.setLayout(jPanel72Layout);
        jPanel72Layout.setHorizontalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel72Layout.setVerticalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel71.add(jPanel72, java.awt.BorderLayout.LINE_START);

        jPanel73.setBackground(new java.awt.Color(255, 255, 255));
        jPanel73.setMaximumSize(new java.awt.Dimension(14, 90));
        jPanel73.setMinimumSize(new java.awt.Dimension(14, 90));
        jPanel73.setOpaque(false);
        jPanel73.setPreferredSize(new java.awt.Dimension(7, 569));

        javax.swing.GroupLayout jPanel73Layout = new javax.swing.GroupLayout(jPanel73);
        jPanel73.setLayout(jPanel73Layout);
        jPanel73Layout.setHorizontalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel73Layout.setVerticalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel71.add(jPanel73, java.awt.BorderLayout.LINE_END);

        jPanel75.setOpaque(false);
        jPanel75.setLayout(new java.awt.GridLayout(1, 0));

        jPanel76.setOpaque(false);

        jPanel74.setBackground(new java.awt.Color(69, 98, 255));

        javax.swing.GroupLayout jPanel74Layout = new javax.swing.GroupLayout(jPanel74);
        jPanel74.setLayout(jPanel74Layout);
        jPanel74Layout.setHorizontalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel74Layout.setVerticalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        title1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        title1.setForeground(new java.awt.Color(0, 0, 0));
        title1.setText("Pacientes agregados recientemente");

        text9.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text9.setForeground(new java.awt.Color(102, 102, 102));
        text9.setText("Registros agregados recientemente");

        javax.swing.GroupLayout jPanel76Layout = new javax.swing.GroupLayout(jPanel76);
        jPanel76.setLayout(jPanel76Layout);
        jPanel76Layout.setHorizontalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel76Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(text9, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel76Layout.setVerticalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel76Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel76Layout.createSequentialGroup()
                        .addComponent(title1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text9)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel75.add(jPanel76);

        jPanel77.setOpaque(false);

        jPanel91.setMaximumSize(new java.awt.Dimension(32767, 50));
        jPanel91.setMinimumSize(new java.awt.Dimension(100, 50));
        jPanel91.setOpaque(false);
        jPanel91.setPreferredSize(new java.awt.Dimension(274, 50));

        container1.setkEndColor(new java.awt.Color(0, 0, 0));
        container1.setkStartColor(new java.awt.Color(0, 0, 0));
        container1.setOpaque(false);
        container1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                container1MouseClicked(evt);
            }
        });

        busquedaIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        busquedaIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Buscar pacientes");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout container1Layout = new javax.swing.GroupLayout(container1);
        container1.setLayout(container1Layout);
        container1Layout.setHorizontalGroup(
            container1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(busquedaIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        container1Layout.setVerticalGroup(
            container1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(container1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(busquedaIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel91Layout = new javax.swing.GroupLayout(jPanel91);
        jPanel91.setLayout(jPanel91Layout);
        jPanel91Layout.setHorizontalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel91Layout.createSequentialGroup()
                .addGap(0, 100, Short.MAX_VALUE)
                .addComponent(container1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel91Layout.setVerticalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel91Layout.createSequentialGroup()
                .addComponent(container1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel77Layout = new javax.swing.GroupLayout(jPanel77);
        jPanel77.setLayout(jPanel77Layout);
        jPanel77Layout.setHorizontalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel91, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        jPanel77Layout.setVerticalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel77Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jPanel91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel75.add(jPanel77);

        jPanel71.add(jPanel75, java.awt.BorderLayout.CENTER);

        needBorder1.add(jPanel71, java.awt.BorderLayout.CENTER);

        needBorder.setMinimumSize(new java.awt.Dimension(100, 40));
        needBorder.setOpaque(false);
        needBorder.setPreferredSize(new java.awt.Dimension(20, 40));
        needBorder.setLayout(new java.awt.GridLayout(1, 0));

        jPanel78.setOpaque(false);

        text10.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text10.setForeground(new java.awt.Color(153, 153, 153));
        text10.setText("Foto");

        text11.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text11.setForeground(new java.awt.Color(153, 153, 153));
        text11.setText("Nombre completo");

        javax.swing.GroupLayout jPanel78Layout = new javax.swing.GroupLayout(jPanel78);
        jPanel78.setLayout(jPanel78Layout);
        jPanel78Layout.setHorizontalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel78Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(text11)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel78Layout.setVerticalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel78Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text11, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(text10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        needBorder.add(jPanel78);

        jPanel79.setOpaque(false);
        jPanel79.setLayout(new java.awt.GridLayout(1, 0));

        jPanel81.setOpaque(false);

        text12.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text12.setForeground(new java.awt.Color(153, 153, 153));
        text12.setText("Edad");

        javax.swing.GroupLayout jPanel81Layout = new javax.swing.GroupLayout(jPanel81);
        jPanel81.setLayout(jPanel81Layout);
        jPanel81Layout.setHorizontalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel81Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text12, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel81Layout.setVerticalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel81Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel79.add(jPanel81);

        jPanel82.setOpaque(false);

        text13.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text13.setForeground(new java.awt.Color(153, 153, 153));
        text13.setText("Género");

        javax.swing.GroupLayout jPanel82Layout = new javax.swing.GroupLayout(jPanel82);
        jPanel82.setLayout(jPanel82Layout);
        jPanel82Layout.setHorizontalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel82Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text13, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel82Layout.setVerticalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel82Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel79.add(jPanel82);

        jPanel83.setOpaque(false);

        text14.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text14.setForeground(new java.awt.Color(153, 153, 153));
        text14.setText("Contacto");

        javax.swing.GroupLayout jPanel83Layout = new javax.swing.GroupLayout(jPanel83);
        jPanel83.setLayout(jPanel83Layout);
        jPanel83Layout.setHorizontalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel83Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text14, javax.swing.GroupLayout.PREFERRED_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel83Layout.setVerticalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel83Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel79.add(jPanel83);

        needBorder.add(jPanel79);

        jPanel80.setOpaque(false);
        jPanel80.setLayout(new java.awt.GridLayout(1, 0));

        jPanel84.setOpaque(false);

        text15.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text15.setForeground(new java.awt.Color(153, 153, 153));
        text15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text15.setText("Tratamiento");

        javax.swing.GroupLayout jPanel84Layout = new javax.swing.GroupLayout(jPanel84);
        jPanel84.setLayout(jPanel84Layout);
        jPanel84Layout.setHorizontalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel84Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text15, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel84Layout.setVerticalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel84Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel80.add(jPanel84);

        jPanel85.setOpaque(false);

        text16.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text16.setForeground(new java.awt.Color(153, 153, 153));
        text16.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        text16.setText("Acciones");

        javax.swing.GroupLayout jPanel85Layout = new javax.swing.GroupLayout(jPanel85);
        jPanel85.setLayout(jPanel85Layout);
        jPanel85Layout.setHorizontalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel85Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text16, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel85Layout.setVerticalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel85Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel80.add(jPanel85);

        needBorder.add(jPanel80);

        needBorder1.add(needBorder, java.awt.BorderLayout.PAGE_END);

        jPanel67.add(needBorder1, java.awt.BorderLayout.PAGE_START);

        jPanel111.setOpaque(false);
        jPanel111.setLayout(new java.awt.BorderLayout());

        jPanel112.setMaximumSize(new java.awt.Dimension(32767, 14));
        jPanel112.setMinimumSize(new java.awt.Dimension(100, 14));
        jPanel112.setOpaque(false);
        jPanel112.setPreferredSize(new java.awt.Dimension(365, 14));

        javax.swing.GroupLayout jPanel112Layout = new javax.swing.GroupLayout(jPanel112);
        jPanel112.setLayout(jPanel112Layout);
        jPanel112Layout.setHorizontalGroup(
            jPanel112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
        );
        jPanel112Layout.setVerticalGroup(
            jPanel112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jPanel111.add(jPanel112, java.awt.BorderLayout.PAGE_START);

        place.setOpaque(false);
        place.setLayout(new java.awt.GridLayout(1, 0));
        jPanel111.add(place, java.awt.BorderLayout.CENTER);

        jPanel67.add(jPanel111, java.awt.BorderLayout.CENTER);

        content7.add(jPanel67, java.awt.BorderLayout.CENTER);

        jPanel1.add(content7, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel1);

        jPanel4.add(jPanel10, java.awt.BorderLayout.CENTER);

        placeDashboard.add(jPanel4, java.awt.BorderLayout.CENTER);

        add(placeDashboard);
    }// </editor-fold>//GEN-END:initComponents

    private void container1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_container1MouseClicked
        ApplicationContext.sideBarNavigation.setSelected(2);
    }//GEN-LAST:event_container1MouseClicked

    private void container2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_container2MouseClicked
        ApplicationContext.mainInterface.mostrarPanel(ApplicationContext.nuevoPaciente);
        ApplicationContext.mainInterface.changeTitle("Nuevo Paciente");
    }//GEN-LAST:event_container2MouseClicked

    private void container3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_container3MouseClicked
        
    }//GEN-LAST:event_container3MouseClicked

    private void textoAsistenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoAsistenteMouseClicked
        ApplicationContext.mainInterface.mostrarPanel(ApplicationContext.nuevoAsistente);
        ApplicationContext.mainInterface.changeTitle("Nuevo Asistente");
    }//GEN-LAST:event_textoAsistenteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add;
    private javax.swing.JPanel addAsistente;
    private javax.swing.JLabel agregarAsistente;
    private javax.swing.JLabel agregarPaciente;
    private javax.swing.JLabel busquedaIcon;
    private com.k33ptoo.components.KGradientPanel consultasContainer;
    private javax.swing.JLabel consultasIcon;
    private javax.swing.JLabel contador;
    private javax.swing.JLabel contadorConsultas;
    private javax.swing.JLabel contadorOrganizacion;
    private javax.swing.JLabel contadorPacientes;
    private com.k33ptoo.components.KGradientPanel container1;
    private com.k33ptoo.components.KGradientPanel container2;
    private com.k33ptoo.components.KGradientPanel container3;
    private com.k33ptoo.components.KGradientPanel container8;
    private com.k33ptoo.components.KGradientPanel container9;
    private com.k33ptoo.components.KGradientPanel content1;
    private com.k33ptoo.components.KGradientPanel content2;
    private com.k33ptoo.components.KGradientPanel content4;
    private com.k33ptoo.components.KGradientPanel content5;
    private com.k33ptoo.components.KGradientPanel content6;
    private com.k33ptoo.components.KGradientPanel content7;
    private com.k33ptoo.components.KGradientPanel counterContainer;
    private javax.swing.JLabel counterIcon;
    private javax.swing.JLabel greeting;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel100;
    private javax.swing.JPanel jPanel101;
    private javax.swing.JPanel jPanel103;
    private javax.swing.JPanel jPanel104;
    private javax.swing.JPanel jPanel105;
    private javax.swing.JPanel jPanel106;
    private javax.swing.JPanel jPanel107;
    private javax.swing.JPanel jPanel109;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel110;
    private javax.swing.JPanel jPanel111;
    private javax.swing.JPanel jPanel112;
    private javax.swing.JPanel jPanel113;
    private javax.swing.JPanel jPanel114;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel23;
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
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel79;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel83;
    private javax.swing.JPanel jPanel84;
    private javax.swing.JPanel jPanel85;
    private javax.swing.JPanel jPanel86;
    private javax.swing.JPanel jPanel87;
    private javax.swing.JPanel jPanel88;
    private javax.swing.JPanel jPanel89;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel91;
    private javax.swing.JPanel jPanel92;
    private javax.swing.JPanel jPanel93;
    private javax.swing.JPanel jPanel94;
    private javax.swing.JPanel jPanel95;
    private javax.swing.JPanel jPanel96;
    private javax.swing.JPanel jPanel97;
    private javax.swing.JPanel jPanel98;
    private javax.swing.JPanel jPanel99;
    private javax.swing.JPanel jpanel;
    private com.k33ptoo.components.KGradientPanel kGradientPanel3;
    private com.k33ptoo.components.KGradientPanel kGradientPanel4;
    private com.k33ptoo.components.KGradientPanel kGradientPanel5;
    private javax.swing.JPanel mainly;
    private javax.swing.JPanel needBorder;
    private javax.swing.JPanel needBorder1;
    private javax.swing.JLabel newPacientIcon1;
    private javax.swing.JLabel newPacientIcon2;
    private com.k33ptoo.components.KGradientPanel organizacionContainer;
    private javax.swing.JLabel organizacionIcon;
    private com.k33ptoo.components.KGradientPanel pacientesContainer;
    private javax.swing.JLabel pacientesIcon;
    private javax.swing.JPanel place;
    private javax.swing.JPanel placeDashboard;
    private javax.swing.JPanel targets;
    private javax.swing.JPanel targts;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text10;
    private javax.swing.JLabel text11;
    private javax.swing.JLabel text12;
    private javax.swing.JLabel text13;
    private javax.swing.JLabel text14;
    private javax.swing.JLabel text15;
    private javax.swing.JLabel text16;
    private javax.swing.JLabel text17;
    private javax.swing.JLabel text19;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text20;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel text4;
    private javax.swing.JLabel text5;
    private javax.swing.JLabel text6;
    private javax.swing.JLabel text7;
    private javax.swing.JLabel text8;
    private javax.swing.JLabel text9;
    private javax.swing.JLabel textoAsistente;
    private javax.swing.JLabel textoPaciente;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title3;
    private javax.swing.JLabel title5;
    // End of variables declaration//GEN-END:variables

}
