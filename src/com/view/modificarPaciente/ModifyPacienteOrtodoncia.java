package com.view.modificarPaciente;

import com.view.createPacient.*;
import com.context.ChoosedPalette;
import com.model.FichaOrtodonciaModel;
import com.model.PacienteModel;
import com.utils.Tools;
import static com.view.createPacient.NewContext.dateTimeFormatter;
import java.time.LocalDateTime;

/**
 *
 * @author Daniel Batres
 */
public class ModifyPacienteOrtodoncia extends NewContext {
        
    /**
     * Creates new form NewPacienteOrtodoncia
     */
    public ModifyPacienteOrtodoncia() {
        initComponents();
        styleMyComponentBaby();
    }
    
    public FichaOrtodonciaModel devolverFicha() {
        FichaOrtodonciaModel fichaOrtodoncia = new FichaOrtodonciaModel();
        
        fichaOrtodoncia.setHO(emptyMessage(textField1.getText()));
        fichaOrtodoncia.setHM(emptyMessage(textField2.getText()));
        fichaOrtodoncia.setPerfilTotal(emptyMessage(textField3.getText()));
        fichaOrtodoncia.setPerfilTercioInf(emptyMessage(textField4.getText()));
        fichaOrtodoncia.setAnguloNasolabial(emptyMessage(textField5.getText()));
        fichaOrtodoncia.setAnguloCuelloMenton(emptyMessage(textField6.getText()));
        fichaOrtodoncia.setEncias(emptyMessage(textField7.getText()));
        fichaOrtodoncia.setFrenillos(emptyMessage(textField8.getText()));
        fichaOrtodoncia.setRMD(emptyMessage(textField9.getText()));
        fichaOrtodoncia.setRMI(emptyMessage(textField10.getText()));
        fichaOrtodoncia.setRCD(emptyMessage(textField11.getText()));
        fichaOrtodoncia.setRCI(emptyMessage(textField12.getText()));
        fichaOrtodoncia.setSMH(emptyMessage(textField13.getText()));
        fichaOrtodoncia.setSMV(emptyMessage(textField14.getText()));
        fichaOrtodoncia.setLineasMedias(emptyMessage(textField15.getText()));
        fichaOrtodoncia.setTipoDenticion(emptyMessage(textField16.getText()));
        fichaOrtodoncia.setDiaCreacion(LocalDateTime.now().getDayOfMonth());
        fichaOrtodoncia.setMesCreacion(LocalDateTime.now().getMonthValue());
        fichaOrtodoncia.setAnnioCreacion(LocalDateTime.now().getYear());
        fichaOrtodoncia.setHoraCreacion(String.valueOf(LocalDateTime.now().getHour()) + ":" + String.valueOf(LocalDateTime.now().getMinute()) + " " + NewContext.localTime.format(dateTimeFormatter));
        fichaOrtodoncia.setDiaModificacion(LocalDateTime.now().getDayOfMonth());
        fichaOrtodoncia.setMesModificacion(LocalDateTime.now().getMonthValue());
        fichaOrtodoncia.setAnnioModificacion(LocalDateTime.now().getYear());
        fichaOrtodoncia.setHoraModificacion(String.valueOf(LocalDateTime.now().getHour()) + ":" + String.valueOf(LocalDateTime.now().getMinute()) + " " + NewContext.localTime.format(dateTimeFormatter));
        fichaOrtodoncia.setExtracciones(comboExtracciones.getSelectedItem().toString().equals("SI"));
        fichaOrtodoncia.setObservaciones(emptyMessage(textField17.getText()));
    
        return fichaOrtodoncia;
    }
    
    public void setData(PacienteModel paciente) {
        textField1.setText(paciente.getFichaOrtodoncia().getHO());
        textField2.setText(paciente.getFichaOrtodoncia().getHM());
        textField3.setText(paciente.getFichaOrtodoncia().getPerfilTotal());
        textField4.setText(paciente.getFichaOrtodoncia().getPerfilTercioInf());
        textField5.setText(paciente.getFichaOrtodoncia().getAnguloNasolabial());
        textField6.setText(paciente.getFichaOrtodoncia().getAnguloCuelloMenton());
        textField7.setText(paciente.getFichaOrtodoncia().getEncias());
        textField8.setText(paciente.getFichaOrtodoncia().getFrenillos());
        textField9.setText(paciente.getFichaOrtodoncia().getRMD());
        textField10.setText(paciente.getFichaOrtodoncia().getRMI());
        textField11.setText(paciente.getFichaOrtodoncia().getRCD());
        textField12.setText(paciente.getFichaOrtodoncia().getRCI());
        textField13.setText(paciente.getFichaOrtodoncia().getSMH());
        textField14.setText(paciente.getFichaOrtodoncia().getSMV());
        textField15.setText(paciente.getFichaOrtodoncia().getLineasMedias());
        textField16.setText(paciente.getFichaOrtodoncia().getTipoDenticion());
        textField17.setText(paciente.getFichaOrtodoncia().getObservaciones());
        comboExtracciones.setSelectedIndex(paciente.getFichaOrtodoncia().isExtracciones() ? 0 : 1);
    }
    
    @Override
    public void addTitlesAndSubtitles() {
        TITLES_AND_SUBTITLES.add(title1);
        TITLES_AND_SUBTITLES.add(title2);
        TITLES_AND_SUBTITLES.add(title3);
        TITLES_AND_SUBTITLES.add(title4);
        TITLES_AND_SUBTITLES.add(title5);
        TITLES_AND_SUBTITLES.add(title6);
        TITLES_AND_SUBTITLES.add(title7);
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
        TITLES_AND_SUBTITLES.add(title18);
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
        CONTAINERS.add(container3);
        CONTAINERS.add(container4);
        CONTAINERS.add(container5);
        CONTAINERS.add(container6);
        CONTAINERS.add(container4);
        CONTAINERS.add(container7);
        CONTAINERS.add(container8);
        CONTAINERS.add(container9);
        CONTAINERS.add(container10);
        CONTAINERS.add(container11);
        CONTAINERS.add(container12);
        CONTAINERS.add(container13);
        CONTAINERS.add(container14);
        CONTAINERS.add(container15);
        CONTAINERS.add(container16);
        CONTAINERS.add(container17);
    }
    
    @Override
    public void addTextFields() {
        TEXTFIELDS.add(textField1);
        TEXTFIELDS.add(textField2);
        TEXTFIELDS.add(textField3);
        TEXTFIELDS.add(textField4);
        TEXTFIELDS.add(textField5);
        TEXTFIELDS.add(textField6);
        TEXTFIELDS.add(textField7);
        TEXTFIELDS.add(textField8);
        TEXTFIELDS.add(textField9);
        TEXTFIELDS.add(textField10);
        TEXTFIELDS.add(textField11);
        TEXTFIELDS.add(textField12);
        TEXTFIELDS.add(textField13);
        TEXTFIELDS.add(textField14);
        TEXTFIELDS.add(textField15);
        TEXTFIELDS.add(textField16);
        TEXTFIELDS.add(textField17);
    }
    
    @Override
    public void initStyles() {
        datosDiagnosticoIcon.setSize(50, 50);
        diagnosticoOrtodonticoIcon.setSize(50, 50);
        
        Tools.setImageLabel(datosDiagnosticoIcon, "src/com/assets/documento.png", 30, 30, ChoosedPalette.getWhite());
        Tools.setImageLabel(diagnosticoOrtodonticoIcon, "src/com/assets/documento.png", 30, 30, ChoosedPalette.getWhite());
        Tools.addMouseListenerIngresa(TEXTFIELDS);
    }
    
    @Override
    public void colorComponent(String preferred) {
        switch (preferred) {
            case "light":
                light();
                break;
            case "dark":
                dark();
                break;
            default:
                System.out.println("Inv\u00e1lido");
        }
    }
    
    @Override
    public void light() {
        paintAll();
    }
    
    @Override
    public void dark() {
        paintAll();
    }
    
    @Override
    public void addComboBox() {
        COMBOBOX.add(comboExtracciones);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        text1 = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        kGradientPanel3 = new com.k33ptoo.components.KGradientPanel();
        datosDiagnosticoIcon = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        container1 = new com.k33ptoo.components.KGradientPanel();
        jPanel44 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        textField1 = new javax.swing.JTextField();
        title4 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        container2 = new com.k33ptoo.components.KGradientPanel();
        jPanel46 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        textField2 = new javax.swing.JTextField();
        title20 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        container3 = new com.k33ptoo.components.KGradientPanel();
        jPanel48 = new javax.swing.JPanel();
        jPanel49 = new javax.swing.JPanel();
        textField3 = new javax.swing.JTextField();
        title3 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        container4 = new com.k33ptoo.components.KGradientPanel();
        jPanel50 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        textField4 = new javax.swing.JTextField();
        title5 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        container5 = new com.k33ptoo.components.KGradientPanel();
        jPanel52 = new javax.swing.JPanel();
        jPanel53 = new javax.swing.JPanel();
        textField5 = new javax.swing.JTextField();
        title6 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        container6 = new com.k33ptoo.components.KGradientPanel();
        jPanel54 = new javax.swing.JPanel();
        jPanel55 = new javax.swing.JPanel();
        textField6 = new javax.swing.JTextField();
        title7 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        container7 = new com.k33ptoo.components.KGradientPanel();
        jPanel56 = new javax.swing.JPanel();
        jPanel57 = new javax.swing.JPanel();
        textField7 = new javax.swing.JTextField();
        title8 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        container8 = new com.k33ptoo.components.KGradientPanel();
        jPanel58 = new javax.swing.JPanel();
        jPanel59 = new javax.swing.JPanel();
        textField8 = new javax.swing.JTextField();
        title9 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        text2 = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        kGradientPanel5 = new com.k33ptoo.components.KGradientPanel();
        diagnosticoOrtodonticoIcon = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        container9 = new com.k33ptoo.components.KGradientPanel();
        jPanel60 = new javax.swing.JPanel();
        jPanel61 = new javax.swing.JPanel();
        textField9 = new javax.swing.JTextField();
        title10 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        container10 = new com.k33ptoo.components.KGradientPanel();
        jPanel62 = new javax.swing.JPanel();
        jPanel63 = new javax.swing.JPanel();
        textField10 = new javax.swing.JTextField();
        title11 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        container11 = new com.k33ptoo.components.KGradientPanel();
        jPanel64 = new javax.swing.JPanel();
        jPanel65 = new javax.swing.JPanel();
        textField11 = new javax.swing.JTextField();
        title12 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        container12 = new com.k33ptoo.components.KGradientPanel();
        jPanel66 = new javax.swing.JPanel();
        jPanel67 = new javax.swing.JPanel();
        textField12 = new javax.swing.JTextField();
        title13 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        container13 = new com.k33ptoo.components.KGradientPanel();
        jPanel68 = new javax.swing.JPanel();
        jPanel69 = new javax.swing.JPanel();
        textField13 = new javax.swing.JTextField();
        title14 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        container14 = new com.k33ptoo.components.KGradientPanel();
        jPanel70 = new javax.swing.JPanel();
        jPanel71 = new javax.swing.JPanel();
        textField14 = new javax.swing.JTextField();
        title15 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        container15 = new com.k33ptoo.components.KGradientPanel();
        jPanel72 = new javax.swing.JPanel();
        jPanel73 = new javax.swing.JPanel();
        textField15 = new javax.swing.JTextField();
        title16 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        container16 = new com.k33ptoo.components.KGradientPanel();
        jPanel74 = new javax.swing.JPanel();
        jPanel75 = new javax.swing.JPanel();
        textField16 = new javax.swing.JTextField();
        title17 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        title18 = new javax.swing.JLabel();
        comboExtracciones = new javax.swing.JComboBox<>();
        jPanel43 = new javax.swing.JPanel();
        container17 = new com.k33ptoo.components.KGradientPanel();
        jPanel76 = new javax.swing.JPanel();
        jPanel77 = new javax.swing.JPanel();
        textField17 = new javax.swing.JTextField();
        title19 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(950, 600));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(950, 600));
        setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setMaximumSize(new java.awt.Dimension(0, 32767));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jPanel3.setMinimumSize(new java.awt.Dimension(7, 0));
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(7, 551));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);

        jPanel7.setOpaque(false);
        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.Y_AXIS));

        jPanel8.setMaximumSize(new java.awt.Dimension(32767, 16));
        jPanel8.setMinimumSize(new java.awt.Dimension(0, 16));
        jPanel8.setOpaque(false);
        jPanel8.setPreferredSize(new java.awt.Dimension(484, 16));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel8);

        jPanel10.setMaximumSize(new java.awt.Dimension(850, 32767));
        jPanel10.setMinimumSize(new java.awt.Dimension(480, 450));
        jPanel10.setOpaque(false);
        jPanel10.setPreferredSize(new java.awt.Dimension(493, 450));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel2.setMinimumSize(new java.awt.Dimension(100, 80));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(493, 80));

        text1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text1.setForeground(new java.awt.Color(153, 153, 153));
        text1.setText("Datos de diagnostico sobre el paciente");

        title1.setBackground(new java.awt.Color(0, 0, 0));
        title1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        title1.setForeground(new java.awt.Color(0, 0, 0));
        title1.setText("Datos de diagnóstico");

        kGradientPanel3.setkBorderRadius(100);
        kGradientPanel3.setkEndColor(new java.awt.Color(69, 98, 255));
        kGradientPanel3.setkStartColor(new java.awt.Color(69, 98, 255));
        kGradientPanel3.setMaximumSize(new java.awt.Dimension(50, 50));
        kGradientPanel3.setMinimumSize(new java.awt.Dimension(50, 50));
        kGradientPanel3.setOpaque(false);
        kGradientPanel3.setLayout(new java.awt.BorderLayout());

        datosDiagnosticoIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kGradientPanel3.add(datosDiagnosticoIcon, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(title1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(text1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(title1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text1)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel10.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel19.setMaximumSize(new java.awt.Dimension(32767, 392));
        jPanel19.setMinimumSize(new java.awt.Dimension(0, 392));
        jPanel19.setOpaque(false);
        jPanel19.setPreferredSize(new java.awt.Dimension(400, 392));
        jPanel19.setLayout(new java.awt.GridLayout(4, 2));

        jPanel20.setOpaque(false);
        jPanel20.setLayout(new java.awt.GridLayout(1, 0));

        jPanel27.setOpaque(false);

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
        textField1.setText("Ingresar HO");
        textField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textField1.setOpaque(false);
        container1.add(textField1, java.awt.BorderLayout.CENTER);

        title4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title4.setForeground(new java.awt.Color(0, 0, 0));
        title4.setText("HO");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(container1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(title4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel20.add(jPanel27);

        jPanel28.setOpaque(false);

        container2.setkEndColor(new java.awt.Color(204, 204, 204));
        container2.setkFillBackground(false);
        container2.setkStartColor(new java.awt.Color(204, 204, 204));
        container2.setMaximumSize(new java.awt.Dimension(32767, 45));
        container2.setMinimumSize(new java.awt.Dimension(100, 45));
        container2.setOpaque(false);
        container2.setLayout(new java.awt.BorderLayout());

        jPanel46.setMaximumSize(new java.awt.Dimension(5, 32767));
        jPanel46.setMinimumSize(new java.awt.Dimension(5, 100));
        jPanel46.setOpaque(false);
        jPanel46.setPreferredSize(new java.awt.Dimension(5, 45));

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container2.add(jPanel46, java.awt.BorderLayout.LINE_END);

        jPanel47.setMaximumSize(new java.awt.Dimension(10, 32767));
        jPanel47.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel47.setOpaque(false);
        jPanel47.setPreferredSize(new java.awt.Dimension(10, 45));

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container2.add(jPanel47, java.awt.BorderLayout.LINE_START);

        textField2.setBackground(new java.awt.Color(255, 255, 255));
        textField2.setText("Ingresar HM");
        textField2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textField2.setOpaque(false);
        container2.add(textField2, java.awt.BorderLayout.CENTER);

        title20.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title20.setForeground(new java.awt.Color(0, 0, 0));
        title20.setText("HM");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(container2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(title20)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel20.add(jPanel28);

        jPanel19.add(jPanel20);

        jPanel21.setOpaque(false);

        container3.setkEndColor(new java.awt.Color(204, 204, 204));
        container3.setkFillBackground(false);
        container3.setkStartColor(new java.awt.Color(204, 204, 204));
        container3.setMaximumSize(new java.awt.Dimension(32767, 45));
        container3.setMinimumSize(new java.awt.Dimension(100, 45));
        container3.setOpaque(false);
        container3.setLayout(new java.awt.BorderLayout());

        jPanel48.setMaximumSize(new java.awt.Dimension(5, 32767));
        jPanel48.setMinimumSize(new java.awt.Dimension(5, 100));
        jPanel48.setOpaque(false);
        jPanel48.setPreferredSize(new java.awt.Dimension(5, 45));

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container3.add(jPanel48, java.awt.BorderLayout.LINE_END);

        jPanel49.setMaximumSize(new java.awt.Dimension(10, 32767));
        jPanel49.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel49.setOpaque(false);
        jPanel49.setPreferredSize(new java.awt.Dimension(10, 45));

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container3.add(jPanel49, java.awt.BorderLayout.LINE_START);

        textField3.setBackground(new java.awt.Color(255, 255, 255));
        textField3.setText("Ingresar perfil total");
        textField3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textField3.setOpaque(false);
        container3.add(textField3, java.awt.BorderLayout.CENTER);

        title3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title3.setForeground(new java.awt.Color(0, 0, 0));
        title3.setText("Perfil total");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(container3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(title3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel19.add(jPanel21);

        jPanel22.setOpaque(false);

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
        textField4.setText("Ingresar perfil tercio inf");
        textField4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textField4.setOpaque(false);
        container4.add(textField4, java.awt.BorderLayout.CENTER);

        title5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title5.setForeground(new java.awt.Color(0, 0, 0));
        title5.setText("Perfil tercio inf");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(container4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(title5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel19.add(jPanel22);

        jPanel23.setOpaque(false);

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
        textField5.setText("Ingresar ángulo nasolabial");
        textField5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textField5.setOpaque(false);
        container5.add(textField5, java.awt.BorderLayout.CENTER);

        title6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title6.setForeground(new java.awt.Color(0, 0, 0));
        title6.setText("Ángulo nasolabial");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(container5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(title6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel19.add(jPanel23);

        jPanel24.setOpaque(false);

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
        textField6.setText("Ingresar ángulo cuello mentón");
        textField6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textField6.setOpaque(false);
        container6.add(textField6, java.awt.BorderLayout.CENTER);

        title7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title7.setForeground(new java.awt.Color(0, 0, 0));
        title7.setText("Ángulo cuello-mentón");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(container6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(title7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel19.add(jPanel24);

        jPanel25.setOpaque(false);

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
        textField7.setText("Ingresar encías");
        textField7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textField7.setOpaque(false);
        container7.add(textField7, java.awt.BorderLayout.CENTER);

        title8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title8.setForeground(new java.awt.Color(0, 0, 0));
        title8.setText("Encías");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(container7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(title8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel19.add(jPanel25);

        jPanel26.setOpaque(false);

        container8.setkEndColor(new java.awt.Color(204, 204, 204));
        container8.setkFillBackground(false);
        container8.setkStartColor(new java.awt.Color(204, 204, 204));
        container8.setMaximumSize(new java.awt.Dimension(32767, 45));
        container8.setMinimumSize(new java.awt.Dimension(100, 45));
        container8.setOpaque(false);
        container8.setLayout(new java.awt.BorderLayout());

        jPanel58.setMaximumSize(new java.awt.Dimension(5, 32767));
        jPanel58.setMinimumSize(new java.awt.Dimension(5, 100));
        jPanel58.setOpaque(false);
        jPanel58.setPreferredSize(new java.awt.Dimension(5, 45));

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container8.add(jPanel58, java.awt.BorderLayout.LINE_END);

        jPanel59.setMaximumSize(new java.awt.Dimension(10, 32767));
        jPanel59.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel59.setOpaque(false);
        jPanel59.setPreferredSize(new java.awt.Dimension(10, 45));

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container8.add(jPanel59, java.awt.BorderLayout.LINE_START);

        textField8.setBackground(new java.awt.Color(255, 255, 255));
        textField8.setText("Ingresar frenillos");
        textField8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textField8.setOpaque(false);
        container8.add(textField8, java.awt.BorderLayout.CENTER);

        title9.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title9.setForeground(new java.awt.Color(0, 0, 0));
        title9.setText("Frenillos");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(container8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(title9)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel19.add(jPanel26);

        jPanel29.setOpaque(false);

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 245, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );

        jPanel19.add(jPanel29);

        jPanel5.add(jPanel19, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel10);

        jPanel9.setOpaque(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 109, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel9);

        jPanel1.add(jPanel7);

        jPanel4.setMinimumSize(new java.awt.Dimension(7, 0));
        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(7, 551));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4);

        add(jPanel1);

        jPanel11.setMaximumSize(new java.awt.Dimension(0, 32767));
        jPanel11.setOpaque(false);
        jPanel11.setLayout(new javax.swing.BoxLayout(jPanel11, javax.swing.BoxLayout.LINE_AXIS));

        jPanel12.setMinimumSize(new java.awt.Dimension(7, 0));
        jPanel12.setOpaque(false);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel12);

        jPanel13.setOpaque(false);
        jPanel13.setLayout(new javax.swing.BoxLayout(jPanel13, javax.swing.BoxLayout.Y_AXIS));

        jPanel14.setMaximumSize(new java.awt.Dimension(32767, 16));
        jPanel14.setMinimumSize(new java.awt.Dimension(0, 16));
        jPanel14.setOpaque(false);
        jPanel14.setPreferredSize(new java.awt.Dimension(484, 16));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel14);

        jPanel15.setMaximumSize(new java.awt.Dimension(850, 32767));
        jPanel15.setMinimumSize(new java.awt.Dimension(480, 450));
        jPanel15.setOpaque(false);
        jPanel15.setPreferredSize(new java.awt.Dimension(484, 450));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jPanel6.setMinimumSize(new java.awt.Dimension(100, 80));
        jPanel6.setOpaque(false);
        jPanel6.setPreferredSize(new java.awt.Dimension(493, 80));

        text2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text2.setForeground(new java.awt.Color(153, 153, 153));
        text2.setText("Datos de diagnostico sobre el paciente");

        title2.setBackground(new java.awt.Color(0, 0, 0));
        title2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        title2.setForeground(new java.awt.Color(0, 0, 0));
        title2.setText("Diagnóstico Ortodontico");

        kGradientPanel5.setkBorderRadius(100);
        kGradientPanel5.setkEndColor(new java.awt.Color(69, 98, 255));
        kGradientPanel5.setkStartColor(new java.awt.Color(69, 98, 255));
        kGradientPanel5.setMaximumSize(new java.awt.Dimension(50, 50));
        kGradientPanel5.setMinimumSize(new java.awt.Dimension(50, 50));
        kGradientPanel5.setOpaque(false);
        kGradientPanel5.setLayout(new java.awt.BorderLayout());

        diagnosticoOrtodonticoIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kGradientPanel5.add(diagnosticoOrtodonticoIcon, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(title2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(text2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kGradientPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(title2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text2)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel15.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel18.setOpaque(false);
        jPanel18.setLayout(new java.awt.BorderLayout());

        jPanel30.setOpaque(false);
        jPanel30.setLayout(new java.awt.GridLayout(4, 2));

        jPanel31.setOpaque(false);
        jPanel31.setLayout(new java.awt.GridLayout(1, 0));

        jPanel37.setOpaque(false);

        container9.setkEndColor(new java.awt.Color(204, 204, 204));
        container9.setkFillBackground(false);
        container9.setkStartColor(new java.awt.Color(204, 204, 204));
        container9.setMaximumSize(new java.awt.Dimension(32767, 45));
        container9.setMinimumSize(new java.awt.Dimension(100, 45));
        container9.setOpaque(false);
        container9.setLayout(new java.awt.BorderLayout());

        jPanel60.setMaximumSize(new java.awt.Dimension(5, 32767));
        jPanel60.setMinimumSize(new java.awt.Dimension(5, 100));
        jPanel60.setOpaque(false);
        jPanel60.setPreferredSize(new java.awt.Dimension(5, 45));

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container9.add(jPanel60, java.awt.BorderLayout.LINE_END);

        jPanel61.setMaximumSize(new java.awt.Dimension(10, 32767));
        jPanel61.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel61.setOpaque(false);
        jPanel61.setPreferredSize(new java.awt.Dimension(10, 45));

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container9.add(jPanel61, java.awt.BorderLayout.LINE_START);

        textField9.setBackground(new java.awt.Color(255, 255, 255));
        textField9.setText("Ingresar RMD");
        textField9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textField9.setOpaque(false);
        container9.add(textField9, java.awt.BorderLayout.CENTER);

        title10.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title10.setForeground(new java.awt.Color(0, 0, 0));
        title10.setText("RMD");

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(container9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(title10)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel31.add(jPanel37);

        jPanel38.setOpaque(false);

        container10.setkEndColor(new java.awt.Color(204, 204, 204));
        container10.setkFillBackground(false);
        container10.setkStartColor(new java.awt.Color(204, 204, 204));
        container10.setMaximumSize(new java.awt.Dimension(32767, 45));
        container10.setMinimumSize(new java.awt.Dimension(100, 45));
        container10.setOpaque(false);
        container10.setLayout(new java.awt.BorderLayout());

        jPanel62.setMaximumSize(new java.awt.Dimension(5, 32767));
        jPanel62.setMinimumSize(new java.awt.Dimension(5, 100));
        jPanel62.setOpaque(false);
        jPanel62.setPreferredSize(new java.awt.Dimension(5, 45));

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container10.add(jPanel62, java.awt.BorderLayout.LINE_END);

        jPanel63.setMaximumSize(new java.awt.Dimension(10, 32767));
        jPanel63.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel63.setOpaque(false);
        jPanel63.setPreferredSize(new java.awt.Dimension(10, 45));

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container10.add(jPanel63, java.awt.BorderLayout.LINE_START);

        textField10.setBackground(new java.awt.Color(255, 255, 255));
        textField10.setText("Ingresar RMI");
        textField10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textField10.setOpaque(false);
        container10.add(textField10, java.awt.BorderLayout.CENTER);

        title11.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title11.setForeground(new java.awt.Color(0, 0, 0));
        title11.setText("RMI");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(container10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addComponent(title11)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel31.add(jPanel38);

        jPanel30.add(jPanel31);

        jPanel32.setOpaque(false);
        jPanel32.setLayout(new java.awt.GridLayout(1, 0));

        jPanel39.setOpaque(false);

        container11.setkEndColor(new java.awt.Color(204, 204, 204));
        container11.setkFillBackground(false);
        container11.setkStartColor(new java.awt.Color(204, 204, 204));
        container11.setMaximumSize(new java.awt.Dimension(32767, 45));
        container11.setMinimumSize(new java.awt.Dimension(100, 45));
        container11.setOpaque(false);
        container11.setLayout(new java.awt.BorderLayout());

        jPanel64.setMaximumSize(new java.awt.Dimension(5, 32767));
        jPanel64.setMinimumSize(new java.awt.Dimension(5, 100));
        jPanel64.setOpaque(false);
        jPanel64.setPreferredSize(new java.awt.Dimension(5, 45));

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container11.add(jPanel64, java.awt.BorderLayout.LINE_END);

        jPanel65.setMaximumSize(new java.awt.Dimension(10, 32767));
        jPanel65.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel65.setOpaque(false);
        jPanel65.setPreferredSize(new java.awt.Dimension(10, 45));

        javax.swing.GroupLayout jPanel65Layout = new javax.swing.GroupLayout(jPanel65);
        jPanel65.setLayout(jPanel65Layout);
        jPanel65Layout.setHorizontalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel65Layout.setVerticalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container11.add(jPanel65, java.awt.BorderLayout.LINE_START);

        textField11.setBackground(new java.awt.Color(255, 255, 255));
        textField11.setText("Ingresar RCD");
        textField11.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textField11.setOpaque(false);
        container11.add(textField11, java.awt.BorderLayout.CENTER);

        title12.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title12.setForeground(new java.awt.Color(0, 0, 0));
        title12.setText("RCD");

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(container11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addComponent(title12)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel32.add(jPanel39);

        jPanel40.setOpaque(false);

        container12.setkEndColor(new java.awt.Color(204, 204, 204));
        container12.setkFillBackground(false);
        container12.setkStartColor(new java.awt.Color(204, 204, 204));
        container12.setMaximumSize(new java.awt.Dimension(32767, 45));
        container12.setMinimumSize(new java.awt.Dimension(100, 45));
        container12.setOpaque(false);
        container12.setLayout(new java.awt.BorderLayout());

        jPanel66.setMaximumSize(new java.awt.Dimension(5, 32767));
        jPanel66.setMinimumSize(new java.awt.Dimension(5, 100));
        jPanel66.setOpaque(false);
        jPanel66.setPreferredSize(new java.awt.Dimension(5, 45));

        javax.swing.GroupLayout jPanel66Layout = new javax.swing.GroupLayout(jPanel66);
        jPanel66.setLayout(jPanel66Layout);
        jPanel66Layout.setHorizontalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel66Layout.setVerticalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container12.add(jPanel66, java.awt.BorderLayout.LINE_END);

        jPanel67.setMaximumSize(new java.awt.Dimension(10, 32767));
        jPanel67.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel67.setOpaque(false);
        jPanel67.setPreferredSize(new java.awt.Dimension(10, 45));

        javax.swing.GroupLayout jPanel67Layout = new javax.swing.GroupLayout(jPanel67);
        jPanel67.setLayout(jPanel67Layout);
        jPanel67Layout.setHorizontalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel67Layout.setVerticalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container12.add(jPanel67, java.awt.BorderLayout.LINE_START);

        textField12.setBackground(new java.awt.Color(255, 255, 255));
        textField12.setText("Ingresar RCI");
        textField12.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textField12.setOpaque(false);
        container12.add(textField12, java.awt.BorderLayout.CENTER);

        title13.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title13.setForeground(new java.awt.Color(0, 0, 0));
        title13.setText("RCI");

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(container12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addComponent(title13)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel32.add(jPanel40);

        jPanel30.add(jPanel32);

        jPanel33.setOpaque(false);
        jPanel33.setLayout(new java.awt.GridLayout(1, 0));

        jPanel41.setOpaque(false);

        container13.setkEndColor(new java.awt.Color(204, 204, 204));
        container13.setkFillBackground(false);
        container13.setkStartColor(new java.awt.Color(204, 204, 204));
        container13.setMaximumSize(new java.awt.Dimension(32767, 45));
        container13.setMinimumSize(new java.awt.Dimension(100, 45));
        container13.setOpaque(false);
        container13.setLayout(new java.awt.BorderLayout());

        jPanel68.setMaximumSize(new java.awt.Dimension(5, 32767));
        jPanel68.setMinimumSize(new java.awt.Dimension(5, 100));
        jPanel68.setOpaque(false);
        jPanel68.setPreferredSize(new java.awt.Dimension(5, 45));

        javax.swing.GroupLayout jPanel68Layout = new javax.swing.GroupLayout(jPanel68);
        jPanel68.setLayout(jPanel68Layout);
        jPanel68Layout.setHorizontalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel68Layout.setVerticalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container13.add(jPanel68, java.awt.BorderLayout.LINE_END);

        jPanel69.setMaximumSize(new java.awt.Dimension(10, 32767));
        jPanel69.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel69.setOpaque(false);
        jPanel69.setPreferredSize(new java.awt.Dimension(10, 45));

        javax.swing.GroupLayout jPanel69Layout = new javax.swing.GroupLayout(jPanel69);
        jPanel69.setLayout(jPanel69Layout);
        jPanel69Layout.setHorizontalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel69Layout.setVerticalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container13.add(jPanel69, java.awt.BorderLayout.LINE_START);

        textField13.setBackground(new java.awt.Color(255, 255, 255));
        textField13.setText("Ingresar SMH");
        textField13.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textField13.setOpaque(false);
        container13.add(textField13, java.awt.BorderLayout.CENTER);

        title14.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title14.setForeground(new java.awt.Color(0, 0, 0));
        title14.setText("SMH");

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(container13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addComponent(title14)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel33.add(jPanel41);

        jPanel42.setOpaque(false);

        container14.setkEndColor(new java.awt.Color(204, 204, 204));
        container14.setkFillBackground(false);
        container14.setkStartColor(new java.awt.Color(204, 204, 204));
        container14.setMaximumSize(new java.awt.Dimension(32767, 45));
        container14.setMinimumSize(new java.awt.Dimension(100, 45));
        container14.setOpaque(false);
        container14.setLayout(new java.awt.BorderLayout());

        jPanel70.setMaximumSize(new java.awt.Dimension(5, 32767));
        jPanel70.setMinimumSize(new java.awt.Dimension(5, 100));
        jPanel70.setOpaque(false);
        jPanel70.setPreferredSize(new java.awt.Dimension(5, 45));

        javax.swing.GroupLayout jPanel70Layout = new javax.swing.GroupLayout(jPanel70);
        jPanel70.setLayout(jPanel70Layout);
        jPanel70Layout.setHorizontalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel70Layout.setVerticalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container14.add(jPanel70, java.awt.BorderLayout.LINE_END);

        jPanel71.setMaximumSize(new java.awt.Dimension(10, 32767));
        jPanel71.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel71.setOpaque(false);
        jPanel71.setPreferredSize(new java.awt.Dimension(10, 45));

        javax.swing.GroupLayout jPanel71Layout = new javax.swing.GroupLayout(jPanel71);
        jPanel71.setLayout(jPanel71Layout);
        jPanel71Layout.setHorizontalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel71Layout.setVerticalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container14.add(jPanel71, java.awt.BorderLayout.LINE_START);

        textField14.setBackground(new java.awt.Color(255, 255, 255));
        textField14.setText("Ingresar SMV");
        textField14.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textField14.setOpaque(false);
        container14.add(textField14, java.awt.BorderLayout.CENTER);

        title15.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title15.setForeground(new java.awt.Color(0, 0, 0));
        title15.setText("SMV");

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(container14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(title15)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container14, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel33.add(jPanel42);

        jPanel30.add(jPanel33);

        jPanel34.setOpaque(false);

        container15.setkEndColor(new java.awt.Color(204, 204, 204));
        container15.setkFillBackground(false);
        container15.setkStartColor(new java.awt.Color(204, 204, 204));
        container15.setMaximumSize(new java.awt.Dimension(32767, 45));
        container15.setMinimumSize(new java.awt.Dimension(100, 45));
        container15.setOpaque(false);
        container15.setLayout(new java.awt.BorderLayout());

        jPanel72.setMaximumSize(new java.awt.Dimension(5, 32767));
        jPanel72.setMinimumSize(new java.awt.Dimension(5, 100));
        jPanel72.setOpaque(false);
        jPanel72.setPreferredSize(new java.awt.Dimension(5, 45));

        javax.swing.GroupLayout jPanel72Layout = new javax.swing.GroupLayout(jPanel72);
        jPanel72.setLayout(jPanel72Layout);
        jPanel72Layout.setHorizontalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel72Layout.setVerticalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container15.add(jPanel72, java.awt.BorderLayout.LINE_END);

        jPanel73.setMaximumSize(new java.awt.Dimension(10, 32767));
        jPanel73.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel73.setOpaque(false);
        jPanel73.setPreferredSize(new java.awt.Dimension(10, 45));

        javax.swing.GroupLayout jPanel73Layout = new javax.swing.GroupLayout(jPanel73);
        jPanel73.setLayout(jPanel73Layout);
        jPanel73Layout.setHorizontalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel73Layout.setVerticalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container15.add(jPanel73, java.awt.BorderLayout.LINE_START);

        textField15.setBackground(new java.awt.Color(255, 255, 255));
        textField15.setText("Ingresar líneas medias");
        textField15.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textField15.setOpaque(false);
        container15.add(textField15, java.awt.BorderLayout.CENTER);

        title16.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title16.setForeground(new java.awt.Color(0, 0, 0));
        title16.setText("Líneas medias");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(container15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addComponent(title16)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel30.add(jPanel34);

        jPanel35.setOpaque(false);

        container16.setkEndColor(new java.awt.Color(204, 204, 204));
        container16.setkFillBackground(false);
        container16.setkStartColor(new java.awt.Color(204, 204, 204));
        container16.setMaximumSize(new java.awt.Dimension(32767, 45));
        container16.setMinimumSize(new java.awt.Dimension(100, 45));
        container16.setOpaque(false);
        container16.setLayout(new java.awt.BorderLayout());

        jPanel74.setMaximumSize(new java.awt.Dimension(5, 32767));
        jPanel74.setMinimumSize(new java.awt.Dimension(5, 100));
        jPanel74.setOpaque(false);
        jPanel74.setPreferredSize(new java.awt.Dimension(5, 45));

        javax.swing.GroupLayout jPanel74Layout = new javax.swing.GroupLayout(jPanel74);
        jPanel74.setLayout(jPanel74Layout);
        jPanel74Layout.setHorizontalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel74Layout.setVerticalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container16.add(jPanel74, java.awt.BorderLayout.LINE_END);

        jPanel75.setMaximumSize(new java.awt.Dimension(10, 32767));
        jPanel75.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel75.setOpaque(false);
        jPanel75.setPreferredSize(new java.awt.Dimension(10, 45));

        javax.swing.GroupLayout jPanel75Layout = new javax.swing.GroupLayout(jPanel75);
        jPanel75.setLayout(jPanel75Layout);
        jPanel75Layout.setHorizontalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel75Layout.setVerticalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container16.add(jPanel75, java.awt.BorderLayout.LINE_START);

        textField16.setBackground(new java.awt.Color(255, 255, 255));
        textField16.setText("Ingresar tipo de dentición");
        textField16.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textField16.setOpaque(false);
        container16.add(textField16, java.awt.BorderLayout.CENTER);

        title17.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title17.setForeground(new java.awt.Color(0, 0, 0));
        title17.setText("Tipo de dentición");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(container16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addComponent(title17)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel30.add(jPanel35);

        jPanel36.setOpaque(false);

        title18.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title18.setForeground(new java.awt.Color(0, 0, 0));
        title18.setText("Extracciones");

        comboExtracciones.setBackground(new java.awt.Color(255, 255, 255));
        comboExtracciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        comboExtracciones.setBorder(null);
        comboExtracciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addComponent(title18)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(comboExtracciones, 0, 231, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboExtracciones, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel30.add(jPanel36);

        jPanel43.setOpaque(false);

        container17.setkEndColor(new java.awt.Color(204, 204, 204));
        container17.setkFillBackground(false);
        container17.setkStartColor(new java.awt.Color(204, 204, 204));
        container17.setMaximumSize(new java.awt.Dimension(32767, 45));
        container17.setMinimumSize(new java.awt.Dimension(100, 45));
        container17.setOpaque(false);
        container17.setLayout(new java.awt.BorderLayout());

        jPanel76.setMaximumSize(new java.awt.Dimension(5, 32767));
        jPanel76.setMinimumSize(new java.awt.Dimension(5, 100));
        jPanel76.setOpaque(false);
        jPanel76.setPreferredSize(new java.awt.Dimension(5, 45));

        javax.swing.GroupLayout jPanel76Layout = new javax.swing.GroupLayout(jPanel76);
        jPanel76.setLayout(jPanel76Layout);
        jPanel76Layout.setHorizontalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel76Layout.setVerticalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container17.add(jPanel76, java.awt.BorderLayout.LINE_END);

        jPanel77.setMaximumSize(new java.awt.Dimension(10, 32767));
        jPanel77.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel77.setOpaque(false);
        jPanel77.setPreferredSize(new java.awt.Dimension(10, 45));

        javax.swing.GroupLayout jPanel77Layout = new javax.swing.GroupLayout(jPanel77);
        jPanel77.setLayout(jPanel77Layout);
        jPanel77Layout.setHorizontalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel77Layout.setVerticalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container17.add(jPanel77, java.awt.BorderLayout.LINE_START);

        textField17.setBackground(new java.awt.Color(255, 255, 255));
        textField17.setText("Ingresar observaciones");
        textField17.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textField17.setOpaque(false);
        container17.add(textField17, java.awt.BorderLayout.CENTER);

        title19.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title19.setForeground(new java.awt.Color(0, 0, 0));
        title19.setText("Observaciones");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(container17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(title19)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel30.add(jPanel43);

        jPanel18.add(jPanel30, java.awt.BorderLayout.CENTER);

        jPanel15.add(jPanel18, java.awt.BorderLayout.CENTER);

        jPanel13.add(jPanel15);

        jPanel16.setOpaque(false);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 109, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel16);

        jPanel11.add(jPanel13);

        jPanel17.setMinimumSize(new java.awt.Dimension(7, 0));
        jPanel17.setOpaque(false);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel17);

        add(jPanel11);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboExtracciones;
    private com.k33ptoo.components.KGradientPanel container1;
    private com.k33ptoo.components.KGradientPanel container10;
    private com.k33ptoo.components.KGradientPanel container11;
    private com.k33ptoo.components.KGradientPanel container12;
    private com.k33ptoo.components.KGradientPanel container13;
    private com.k33ptoo.components.KGradientPanel container14;
    private com.k33ptoo.components.KGradientPanel container15;
    private com.k33ptoo.components.KGradientPanel container16;
    private com.k33ptoo.components.KGradientPanel container17;
    private com.k33ptoo.components.KGradientPanel container2;
    private com.k33ptoo.components.KGradientPanel container3;
    private com.k33ptoo.components.KGradientPanel container4;
    private com.k33ptoo.components.KGradientPanel container5;
    private com.k33ptoo.components.KGradientPanel container6;
    private com.k33ptoo.components.KGradientPanel container7;
    private com.k33ptoo.components.KGradientPanel container8;
    private com.k33ptoo.components.KGradientPanel container9;
    private javax.swing.JLabel datosDiagnosticoIcon;
    private javax.swing.JLabel diagnosticoOrtodonticoIcon;
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
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private com.k33ptoo.components.KGradientPanel kGradientPanel3;
    private com.k33ptoo.components.KGradientPanel kGradientPanel5;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JTextField textField1;
    private javax.swing.JTextField textField10;
    private javax.swing.JTextField textField11;
    private javax.swing.JTextField textField12;
    private javax.swing.JTextField textField13;
    private javax.swing.JTextField textField14;
    private javax.swing.JTextField textField15;
    private javax.swing.JTextField textField16;
    private javax.swing.JTextField textField17;
    private javax.swing.JTextField textField2;
    private javax.swing.JTextField textField3;
    private javax.swing.JTextField textField4;
    private javax.swing.JTextField textField5;
    private javax.swing.JTextField textField6;
    private javax.swing.JTextField textField7;
    private javax.swing.JTextField textField8;
    private javax.swing.JTextField textField9;
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
    private javax.swing.JLabel title3;
    private javax.swing.JLabel title4;
    private javax.swing.JLabel title5;
    private javax.swing.JLabel title6;
    private javax.swing.JLabel title7;
    private javax.swing.JLabel title8;
    private javax.swing.JLabel title9;
    // End of variables declaration//GEN-END:variables
}
