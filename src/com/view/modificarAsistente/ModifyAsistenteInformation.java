package com.view.modificarAsistente;

import com.context.ChoosedPalette;
import com.k33ptoo.components.KGradientPanel;
import com.model.AsistenteModel;
import com.utils.Tools;
import com.view.createPacient.NewContext;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 23/09/22
 */
public class ModifyAsistenteInformation extends NewContext {
    ArrayList<JTextField> deleteIngresa = new ArrayList<>();
    ArrayList<JTextField> deleteDate = new ArrayList<>();
    ArrayList<JTextField> dayAndMonth = new ArrayList<>();
    ArrayList<KGradientPanel> contenedoresFechaNacimiento = new ArrayList<>();
    ArrayList<JTextField> camposFechaNacimiento = new ArrayList<>();
    int id;
    
    /**
     * Creates new form ModifyAsistenteInformation
     */
    public ModifyAsistenteInformation() {
        initComponents();
        styleMyComponentBaby();
    }
    
    public AsistenteModel devolverDatos() {
        AsistenteModel asistente = new AsistenteModel();
        
        asistente.setId(id);
        asistente.setEstadoActividad("activo");
        asistente.setEspecialidad("asistente");
        asistente.setEdad(Integer.parseInt(textField6.getText()));
        asistente.setDiaNacimiento(Integer.parseInt(textField2.getText()));
        asistente.setMesNacimiento(Integer.parseInt(textField3.getText()));
        asistente.setAnnioNacimiento(Integer.parseInt(textField4.getText()));
        asistente.setNombres(emptyMessage(textField1.getText()));
        asistente.setApellidos(emptyMessage(textField5.getText()));
        asistente.setGenero(generoCombo.getSelectedItem().toString());
        asistente.setTelefonoCelular(emptyMessage(textField9.getText()));
        asistente.setTelefonoCasa(emptyMessage(textField10.getText()));
        asistente.setDireccion(emptyMessage(textField11.getText()));
        asistente.setDepartamento(comboDepartamento.getSelectedItem().toString());
        asistente.setMunicipio(emptyMessage(textField12.getText()));
        asistente.setDiaCreacion(LocalDateTime.now().getDayOfMonth());
        asistente.setMesCreacion(LocalDateTime.now().getMonthValue());
        asistente.setAnnioCreacion(LocalDateTime.now().getYear());
        asistente.setCorreoElectronico(textField7.getText());
        asistente.setContrasena(textField8.getText());
        asistente.setHoraCreacion(String.valueOf(LocalDateTime.now().getHour()) + ":" + String.valueOf(LocalDateTime.now().getMinute()) + " " + NewContext.localTime.format(dateTimeFormatter));
        asistente.setDiaModificacion(LocalDateTime.now().getDayOfMonth());
        asistente.setMesModificacion(LocalDateTime.now().getMonthValue());
        asistente.setAnnioModificacion(LocalDateTime.now().getYear());
        asistente.setHoraModificacion(String.valueOf(LocalDateTime.now().getHour()) + ":" + String.valueOf(LocalDateTime.now().getMinute()) + " " + NewContext.localTime.format(dateTimeFormatter));
        
        return asistente;
    }
    
    public void setData(AsistenteModel asistente) {
        id = asistente.getId();
        textField1.setText(asistente.getNombres());
        textField5.setText(asistente.getApellidos());
        textField2.setText(String.valueOf(asistente.getDiaNacimiento()));
        textField3.setText(String.valueOf(asistente.getMesNacimiento()));
        textField4.setText(String.valueOf(asistente.getAnnioNacimiento()));
        textField6.setText(String.valueOf(asistente.getEdad()));
        textField7.setText(asistente.getCorreoElectronico());
        textField8.setText(asistente.getContrasena());
        
        if (asistente.getGenero().equals("Masculino")) {
            generoCombo.setSelectedIndex(1);
        } else {
            generoCombo.setSelectedIndex(2);
        }
        
        textField9.setText(asistente.getTelefonoCelular());
        textField10.setText(asistente.getTelefonoCasa());
        textField11.setText(asistente.getDireccion());
        textField12.setText(asistente.getMunicipio());
        
        switch (asistente.getDepartamento()) {
            case "Sonsonate":
                comboDepartamento.setSelectedIndex(0);
                break;
            case "Ahuachapan":
                comboDepartamento.setSelectedIndex(1);
                break;
            case "Santa Ana":
                comboDepartamento.setSelectedIndex(2);
                break;
            case "Chalatenango":
                comboDepartamento.setSelectedIndex(3);
                break;
            case "La libertad":
                comboDepartamento.setSelectedIndex(4);
                break;
            case "La paz":
                comboDepartamento.setSelectedIndex(5);
                break;
            case "San Salvador":
                comboDepartamento.setSelectedIndex(6);
                break;
            case "Cuscatlan":
                comboDepartamento.setSelectedIndex(7);
                break;
            case "San Vicente":
                comboDepartamento.setSelectedIndex(8);
                break;
            case "Caba\u00f1as":
                comboDepartamento.setSelectedIndex(9);
                break;
            case "San Miguel":
                comboDepartamento.setSelectedIndex(10);
                break;
            case "Morazan":
                comboDepartamento.setSelectedIndex(11);
                break;
            case "Usulutan":
                comboDepartamento.setSelectedIndex(12);
                break;
            case "La Union":
                comboDepartamento.setSelectedIndex(13);
                break;
            default:
                System.out.println("Departamento invalido");
        }
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
        TITLES_AND_SUBTITLES.add(title9);
        TITLES_AND_SUBTITLES.add(title10);
        TITLES_AND_SUBTITLES.add(title11);
        TITLES_AND_SUBTITLES.add(title12);
        TITLES_AND_SUBTITLES.add(title13);
        TITLES_AND_SUBTITLES.add(title14);
        TITLES_AND_SUBTITLES.add(title15);
    }

    @Override
    public void addPlainText() {
        PLAIN_TEXT.add(text1);
    }

    @Override
    public void addContainers() {
        CONTAINERS.add(container1);
        CONTAINERS.add(container2);
        CONTAINERS.add(container4);
        CONTAINERS.add(container5);
        CONTAINERS.add(container6);
        CONTAINERS.add(container7);
        CONTAINERS.add(container8);
        CONTAINERS.add(container9);
        CONTAINERS.add(container10);
        CONTAINERS.add(container11);
        CONTAINERS.add(container12);
        CONTAINERS.add(container13);
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
    }
    
    @Override
    public void initStyles() {
        styles();
        
        camposFechaNacimiento.add(textField2);
        camposFechaNacimiento.add(textField3);
        camposFechaNacimiento.add(textField4);
        contenedoresFechaNacimiento.add(container2);
        contenedoresFechaNacimiento.add(container4);
        contenedoresFechaNacimiento.add(container5);
        
        camposTexto.add(textField1);
        camposTexto.add(textField5);
        camposTexto.add(textField7);
        camposTexto.add(textField8);
        containersTexto.add(container1);
        containersTexto.add(container7);
        containersTexto.add(container9);
        containersTexto.add(container6);
        advertenciasTexto.add(advertenciaNombre);
        advertenciasTexto.add(advertenciaApellidos);
        advertenciasTexto.add(advertenciaCorreo);
        advertenciasTexto.add(advertenciaContrasena);
        
        addItemsDepartamento();
    }
    
    private void styles() {
        informationIcon.setSize(50, 50);
        direccionIcon.setSize(50, 50);
        Tools.setImageLabel(informationIcon, "src/com/assets/usuario.png", 30, 30, ChoosedPalette.getWhite());
        Tools.setImageLabel(direccionIcon, "src/com/assets/marcador.png", 30, 30, ChoosedPalette.getWhite());
        addItemsComboBox();
        addDeleteIngresaItems();
        addDeleteDate();
        Tools.addMouseListenerIngresa(deleteIngresa);
        Tools.addMouseListenerDate(deleteDate);
        Tools.addKeyTypedListener(dayAndMonth, 2);
        colorComponent("light");
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
    
    private void addItemsComboBox() {
        generoCombo.addItem("Elegir g\u00e9nero");
        generoCombo.addItem("Masculino");
        generoCombo.addItem("Femenino");
    }
    
    public void addDeleteIngresaItems() {
        deleteIngresa.add(textField1);
        deleteIngresa.add(textField5);
        deleteIngresa.add(textField6);
        deleteIngresa.add(textField7);
        deleteIngresa.add(textField8);
        deleteIngresa.add(textField9);
        deleteIngresa.add(textField10);
        deleteIngresa.add(textField11);
        deleteIngresa.add(textField12);
    }
    
    public void addDeleteDate() {
        deleteDate.add(textField2);
        deleteDate.add(textField3);
        deleteDate.add(textField4);
        dayAndMonth.add(textField2);
        dayAndMonth.add(textField3);
    }
    
    public void validarCombo() {
        validacionCombo(generoCombo, advertenciaGenero, "Elegir g\u00e9nero");
    }
    
    public void validarEdad() {
        validacionCampo(container8, textField6, advertenciaEdad, 1);
    }
    
    public void validarFechaNacimiento() {
        validarFechaNacimiento(contenedoresFechaNacimiento, camposFechaNacimiento, advertenciaNacimiento);
    }
    
    @Override
    public void addComboBox() {
        COMBOBOX.add(generoCombo);
        COMBOBOX.add(comboDepartamento);
    }
    
    private void addItemsDepartamento() {
        comboDepartamento.addItem("Sonsonate");
        comboDepartamento.addItem("Ahuachapan");
        comboDepartamento.addItem("Santa Ana");
        comboDepartamento.addItem("Chalatenango");
        comboDepartamento.addItem("La libertad");
        comboDepartamento.addItem("La paz");
        comboDepartamento.addItem("San Salvador");
        comboDepartamento.addItem("Cuscatlan");
        comboDepartamento.addItem("San Vicente");
        comboDepartamento.addItem("Cabanas");
        comboDepartamento.addItem("San Miguel");
        comboDepartamento.addItem("Morazan");
        comboDepartamento.addItem("Usulutan");
        comboDepartamento.addItem("La Union");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jpanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        text1 = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        kGradientPanel3 = new com.k33ptoo.components.KGradientPanel();
        informationIcon = new javax.swing.JLabel();
        jpanel = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        container1 = new com.k33ptoo.components.KGradientPanel();
        jPanel44 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        textField1 = new javax.swing.JTextField();
        title3 = new javax.swing.JLabel();
        advertenciaNombre = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        container7 = new com.k33ptoo.components.KGradientPanel();
        jPanel46 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        textField5 = new javax.swing.JTextField();
        title2 = new javax.swing.JLabel();
        advertenciaApellidos = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        title9 = new javax.swing.JLabel();
        container2 = new com.k33ptoo.components.KGradientPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        textField2 = new javax.swing.JTextField();
        container4 = new com.k33ptoo.components.KGradientPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        textField3 = new javax.swing.JTextField();
        container5 = new com.k33ptoo.components.KGradientPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        textField4 = new javax.swing.JTextField();
        advertenciaNacimiento = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        container8 = new com.k33ptoo.components.KGradientPanel();
        jPanel48 = new javax.swing.JPanel();
        jPanel49 = new javax.swing.JPanel();
        textField6 = new javax.swing.JTextField();
        title4 = new javax.swing.JLabel();
        advertenciaEdad = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        container9 = new com.k33ptoo.components.KGradientPanel();
        jPanel50 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        textField7 = new javax.swing.JTextField();
        title5 = new javax.swing.JLabel();
        advertenciaCorreo = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        container6 = new com.k33ptoo.components.KGradientPanel();
        jPanel52 = new javax.swing.JPanel();
        jPanel53 = new javax.swing.JPanel();
        textField8 = new javax.swing.JTextField();
        title6 = new javax.swing.JLabel();
        advertenciaContrasena = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        title7 = new javax.swing.JLabel();
        generoCombo = new javax.swing.JComboBox<>();
        advertenciaGenero = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        advertenciaTratamiento = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jpanel2 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        text2 = new javax.swing.JLabel();
        title10 = new javax.swing.JLabel();
        kGradientPanel4 = new com.k33ptoo.components.KGradientPanel();
        direccionIcon = new javax.swing.JLabel();
        jpanel3 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        container10 = new com.k33ptoo.components.KGradientPanel();
        jPanel67 = new javax.swing.JPanel();
        jPanel68 = new javax.swing.JPanel();
        textField9 = new javax.swing.JTextField();
        title11 = new javax.swing.JLabel();
        jPanel64 = new javax.swing.JPanel();
        container11 = new com.k33ptoo.components.KGradientPanel();
        jPanel69 = new javax.swing.JPanel();
        jPanel70 = new javax.swing.JPanel();
        textField10 = new javax.swing.JTextField();
        title12 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jPanel65 = new javax.swing.JPanel();
        title13 = new javax.swing.JLabel();
        comboDepartamento = new javax.swing.JComboBox<>();
        jPanel66 = new javax.swing.JPanel();
        title14 = new javax.swing.JLabel();
        container13 = new com.k33ptoo.components.KGradientPanel();
        jPanel73 = new javax.swing.JPanel();
        jPanel74 = new javax.swing.JPanel();
        textField12 = new javax.swing.JTextField();
        jPanel25 = new javax.swing.JPanel();
        container12 = new com.k33ptoo.components.KGradientPanel();
        jPanel71 = new javax.swing.JPanel();
        jPanel72 = new javax.swing.JPanel();
        textField11 = new javax.swing.JTextField();
        title15 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        advertenciaGenero1 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(950, 0));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(950, 534));
        setLayout(new java.awt.GridLayout(1, 0));

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 534, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel1);

        jpanel1.setMaximumSize(new java.awt.Dimension(550, 32767));
        jpanel1.setMinimumSize(new java.awt.Dimension(480, 0));
        jpanel1.setOpaque(false);
        jpanel1.setPreferredSize(new java.awt.Dimension(480, 300));
        jpanel1.setLayout(new javax.swing.BoxLayout(jpanel1, javax.swing.BoxLayout.Y_AXIS));

        jPanel4.setMaximumSize(new java.awt.Dimension(32767, 16));
        jPanel4.setMinimumSize(new java.awt.Dimension(100, 16));
        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(522, 16));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        jpanel1.add(jPanel4);

        jPanel6.setMaximumSize(new java.awt.Dimension(2147483647, 450));
        jPanel6.setMinimumSize(new java.awt.Dimension(100, 450));
        jPanel6.setOpaque(false);
        jPanel6.setPreferredSize(new java.awt.Dimension(550, 450));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel7.setOpaque(false);

        text1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text1.setForeground(new java.awt.Color(153, 153, 153));
        text1.setText("Datos e información sobre el paciente");

        title1.setBackground(new java.awt.Color(0, 0, 0));
        title1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        title1.setForeground(new java.awt.Color(0, 0, 0));
        title1.setText("Datos e información");

        kGradientPanel3.setkBorderRadius(100);
        kGradientPanel3.setkEndColor(new java.awt.Color(69, 98, 255));
        kGradientPanel3.setkStartColor(new java.awt.Color(69, 98, 255));
        kGradientPanel3.setMaximumSize(new java.awt.Dimension(50, 50));
        kGradientPanel3.setMinimumSize(new java.awt.Dimension(50, 50));
        kGradientPanel3.setOpaque(false);
        kGradientPanel3.setLayout(new java.awt.BorderLayout());

        informationIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kGradientPanel3.add(informationIcon, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(title1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(text1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(title1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text1)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jpanel.setMaximumSize(new java.awt.Dimension(32767, 348));
        jpanel.setMinimumSize(new java.awt.Dimension(0, 348));
        jpanel.setOpaque(false);
        jpanel.setLayout(new java.awt.GridLayout(4, 2));

        jPanel9.setOpaque(false);

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
        textField1.setText("Ingresar nombres");
        textField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textField1.setOpaque(false);
        textField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField1KeyTyped(evt);
            }
        });
        container1.add(textField1, java.awt.BorderLayout.CENTER);

        title3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title3.setForeground(new java.awt.Color(0, 0, 0));
        title3.setText("Nombres");

        advertenciaNombre.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        advertenciaNombre.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(container1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(title3)
                        .addGap(18, 18, 18)
                        .addComponent(advertenciaNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(title3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(advertenciaNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jpanel.add(jPanel9);

        jPanel10.setOpaque(false);

        container7.setkEndColor(new java.awt.Color(204, 204, 204));
        container7.setkFillBackground(false);
        container7.setkStartColor(new java.awt.Color(204, 204, 204));
        container7.setMaximumSize(new java.awt.Dimension(32767, 45));
        container7.setMinimumSize(new java.awt.Dimension(100, 45));
        container7.setOpaque(false);
        container7.setLayout(new java.awt.BorderLayout());

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

        container7.add(jPanel46, java.awt.BorderLayout.LINE_END);

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

        container7.add(jPanel47, java.awt.BorderLayout.LINE_START);

        textField5.setBackground(new java.awt.Color(255, 255, 255));
        textField5.setText("Ingresar apellidos");
        textField5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textField5.setOpaque(false);
        textField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField5KeyTyped(evt);
            }
        });
        container7.add(textField5, java.awt.BorderLayout.CENTER);

        title2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title2.setForeground(new java.awt.Color(0, 0, 0));
        title2.setText("Apellidos");

        advertenciaApellidos.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        advertenciaApellidos.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(container7, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(title2)
                        .addGap(18, 18, 18)
                        .addComponent(advertenciaApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(title2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(advertenciaApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jpanel.add(jPanel10);

        jPanel11.setOpaque(false);

        title9.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title9.setForeground(new java.awt.Color(0, 0, 0));
        title9.setText("Fecha de nacimiento");

        container2.setkEndColor(new java.awt.Color(204, 204, 204));
        container2.setkFillBackground(false);
        container2.setkStartColor(new java.awt.Color(204, 204, 204));
        container2.setMaximumSize(new java.awt.Dimension(32767, 45));
        container2.setMinimumSize(new java.awt.Dimension(100, 45));
        container2.setOpaque(false);
        container2.setLayout(new java.awt.BorderLayout());

        jPanel28.setMaximumSize(new java.awt.Dimension(10, 32767));
        jPanel28.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel28.setOpaque(false);
        jPanel28.setPreferredSize(new java.awt.Dimension(10, 45));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container2.add(jPanel28, java.awt.BorderLayout.LINE_END);

        jPanel29.setMaximumSize(new java.awt.Dimension(10, 32767));
        jPanel29.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel29.setOpaque(false);
        jPanel29.setPreferredSize(new java.awt.Dimension(10, 45));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container2.add(jPanel29, java.awt.BorderLayout.LINE_START);

        textField2.setBackground(new java.awt.Color(255, 255, 255));
        textField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textField2.setText("dd");
        textField2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textField2.setOpaque(false);
        textField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField2ActionPerformed(evt);
            }
        });
        textField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField2KeyTyped(evt);
            }
        });
        container2.add(textField2, java.awt.BorderLayout.CENTER);

        container4.setkEndColor(new java.awt.Color(204, 204, 204));
        container4.setkFillBackground(false);
        container4.setkStartColor(new java.awt.Color(204, 204, 204));
        container4.setMaximumSize(new java.awt.Dimension(32767, 45));
        container4.setMinimumSize(new java.awt.Dimension(100, 45));
        container4.setOpaque(false);
        container4.setLayout(new java.awt.BorderLayout());

        jPanel31.setMaximumSize(new java.awt.Dimension(10, 32767));
        jPanel31.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel31.setOpaque(false);
        jPanel31.setPreferredSize(new java.awt.Dimension(10, 45));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container4.add(jPanel31, java.awt.BorderLayout.LINE_END);

        jPanel32.setMaximumSize(new java.awt.Dimension(10, 32767));
        jPanel32.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel32.setOpaque(false);
        jPanel32.setPreferredSize(new java.awt.Dimension(10, 45));

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container4.add(jPanel32, java.awt.BorderLayout.LINE_START);

        textField3.setBackground(new java.awt.Color(255, 255, 255));
        textField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textField3.setText("mm");
        textField3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textField3.setOpaque(false);
        textField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField3ActionPerformed(evt);
            }
        });
        textField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField3KeyTyped(evt);
            }
        });
        container4.add(textField3, java.awt.BorderLayout.CENTER);

        container5.setkEndColor(new java.awt.Color(204, 204, 204));
        container5.setkFillBackground(false);
        container5.setkStartColor(new java.awt.Color(204, 204, 204));
        container5.setMaximumSize(new java.awt.Dimension(32767, 45));
        container5.setMinimumSize(new java.awt.Dimension(100, 45));
        container5.setOpaque(false);
        container5.setLayout(new java.awt.BorderLayout());

        jPanel33.setMaximumSize(new java.awt.Dimension(10, 32767));
        jPanel33.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel33.setOpaque(false);
        jPanel33.setPreferredSize(new java.awt.Dimension(10, 45));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container5.add(jPanel33, java.awt.BorderLayout.LINE_END);

        jPanel34.setMaximumSize(new java.awt.Dimension(10, 32767));
        jPanel34.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel34.setOpaque(false);
        jPanel34.setPreferredSize(new java.awt.Dimension(10, 45));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container5.add(jPanel34, java.awt.BorderLayout.LINE_START);

        textField4.setBackground(new java.awt.Color(255, 255, 255));
        textField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textField4.setText("aaaa");
        textField4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textField4.setOpaque(false);
        textField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField4ActionPerformed(evt);
            }
        });
        textField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField4KeyTyped(evt);
            }
        });
        container5.add(textField4, java.awt.BorderLayout.CENTER);

        advertenciaNacimiento.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        advertenciaNacimiento.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title9)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(container2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(container4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(advertenciaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(container5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(title9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(advertenciaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(container2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(container4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(container5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jpanel.add(jPanel11);

        jPanel12.setOpaque(false);

        container8.setkEndColor(new java.awt.Color(204, 204, 204));
        container8.setkFillBackground(false);
        container8.setkStartColor(new java.awt.Color(204, 204, 204));
        container8.setMaximumSize(new java.awt.Dimension(32767, 45));
        container8.setMinimumSize(new java.awt.Dimension(100, 45));
        container8.setOpaque(false);
        container8.setLayout(new java.awt.BorderLayout());

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

        container8.add(jPanel48, java.awt.BorderLayout.LINE_END);

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

        container8.add(jPanel49, java.awt.BorderLayout.LINE_START);

        textField6.setBackground(new java.awt.Color(255, 255, 255));
        textField6.setText("Ingresar edad");
        textField6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textField6.setOpaque(false);
        textField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField6KeyTyped(evt);
            }
        });
        container8.add(textField6, java.awt.BorderLayout.CENTER);

        title4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title4.setForeground(new java.awt.Color(0, 0, 0));
        title4.setText("Edad");

        advertenciaEdad.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        advertenciaEdad.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(container8, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(title4)
                        .addGap(18, 18, 18)
                        .addComponent(advertenciaEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(title4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(advertenciaEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jpanel.add(jPanel12);

        jPanel13.setOpaque(false);

        container9.setkEndColor(new java.awt.Color(204, 204, 204));
        container9.setkFillBackground(false);
        container9.setkStartColor(new java.awt.Color(204, 204, 204));
        container9.setMaximumSize(new java.awt.Dimension(32767, 45));
        container9.setMinimumSize(new java.awt.Dimension(100, 45));
        container9.setOpaque(false);
        container9.setLayout(new java.awt.BorderLayout());

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

        container9.add(jPanel50, java.awt.BorderLayout.LINE_END);

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

        container9.add(jPanel51, java.awt.BorderLayout.LINE_START);

        textField7.setBackground(new java.awt.Color(255, 255, 255));
        textField7.setText("Ingresar correo electronico");
        textField7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textField7.setOpaque(false);
        textField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField7ActionPerformed(evt);
            }
        });
        container9.add(textField7, java.awt.BorderLayout.CENTER);

        title5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title5.setForeground(new java.awt.Color(0, 0, 0));
        title5.setText("Correo Electronico");

        advertenciaCorreo.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        advertenciaCorreo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(container9, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(title5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(advertenciaCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(title5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(advertenciaCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jpanel.add(jPanel13);

        jPanel14.setOpaque(false);

        container6.setkEndColor(new java.awt.Color(204, 204, 204));
        container6.setkFillBackground(false);
        container6.setkStartColor(new java.awt.Color(204, 204, 204));
        container6.setMaximumSize(new java.awt.Dimension(32767, 45));
        container6.setMinimumSize(new java.awt.Dimension(100, 45));
        container6.setOpaque(false);
        container6.setLayout(new java.awt.BorderLayout());

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

        container6.add(jPanel52, java.awt.BorderLayout.LINE_END);

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

        container6.add(jPanel53, java.awt.BorderLayout.LINE_START);

        textField8.setBackground(new java.awt.Color(255, 255, 255));
        textField8.setText("Ingresar contraseña");
        textField8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textField8.setOpaque(false);
        container6.add(textField8, java.awt.BorderLayout.CENTER);

        title6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title6.setForeground(new java.awt.Color(0, 0, 0));
        title6.setText("Contraseña");

        advertenciaContrasena.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        advertenciaContrasena.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(container6, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(title6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(advertenciaContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title6)
                    .addComponent(advertenciaContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jpanel.add(jPanel14);

        jPanel15.setOpaque(false);

        title7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title7.setForeground(new java.awt.Color(0, 0, 0));
        title7.setText("Género");

        generoCombo.setBackground(new java.awt.Color(255, 255, 255));
        generoCombo.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        generoCombo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        generoCombo.setFocusable(false);
        generoCombo.setOpaque(false);
        generoCombo.setRequestFocusEnabled(false);
        generoCombo.setVerifyInputWhenFocusTarget(false);
        generoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoComboActionPerformed(evt);
            }
        });

        advertenciaGenero.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        advertenciaGenero.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(generoCombo, 0, 228, Short.MAX_VALUE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(title7)
                        .addGap(18, 18, 18)
                        .addComponent(advertenciaGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(title7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(advertenciaGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jpanel.add(jPanel15);

        jPanel16.setOpaque(false);

        advertenciaTratamiento.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        advertenciaTratamiento.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(advertenciaTratamiento, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(advertenciaTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jpanel.add(jPanel16);

        jPanel6.add(jpanel, java.awt.BorderLayout.CENTER);

        jpanel1.add(jPanel6);

        jPanel5.setOpaque(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );

        jpanel1.add(jPanel5);

        jPanel3.add(jpanel1);

        jPanel2.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 534, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel2);

        add(jPanel3);

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new javax.swing.BoxLayout(jPanel8, javax.swing.BoxLayout.LINE_AXIS));

        jPanel17.setOpaque(false);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 534, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel17);

        jpanel2.setMaximumSize(new java.awt.Dimension(550, 32767));
        jpanel2.setMinimumSize(new java.awt.Dimension(480, 0));
        jpanel2.setOpaque(false);
        jpanel2.setPreferredSize(new java.awt.Dimension(480, 300));
        jpanel2.setLayout(new javax.swing.BoxLayout(jpanel2, javax.swing.BoxLayout.Y_AXIS));

        jPanel18.setMaximumSize(new java.awt.Dimension(32767, 16));
        jPanel18.setMinimumSize(new java.awt.Dimension(100, 16));
        jPanel18.setOpaque(false);
        jPanel18.setPreferredSize(new java.awt.Dimension(522, 16));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        jpanel2.add(jPanel18);

        jPanel19.setMaximumSize(new java.awt.Dimension(2147483647, 450));
        jPanel19.setMinimumSize(new java.awt.Dimension(480, 450));
        jPanel19.setOpaque(false);
        jPanel19.setPreferredSize(new java.awt.Dimension(480, 450));
        jPanel19.setLayout(new java.awt.BorderLayout());

        jPanel20.setOpaque(false);

        text2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text2.setForeground(new java.awt.Color(153, 153, 153));
        text2.setText("Dirección y contacto sobre el paciente");

        title10.setBackground(new java.awt.Color(0, 0, 0));
        title10.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        title10.setForeground(new java.awt.Color(0, 0, 0));
        title10.setText("Dirección y contacto");

        kGradientPanel4.setkBorderRadius(100);
        kGradientPanel4.setkEndColor(new java.awt.Color(69, 98, 255));
        kGradientPanel4.setkStartColor(new java.awt.Color(69, 98, 255));
        kGradientPanel4.setMaximumSize(new java.awt.Dimension(50, 50));
        kGradientPanel4.setMinimumSize(new java.awt.Dimension(50, 50));
        kGradientPanel4.setOpaque(false);
        kGradientPanel4.setLayout(new java.awt.BorderLayout());

        direccionIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kGradientPanel4.add(direccionIcon, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(title10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(text2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(title10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text2)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel19.add(jPanel20, java.awt.BorderLayout.PAGE_START);

        jpanel3.setMaximumSize(new java.awt.Dimension(32767, 348));
        jpanel3.setMinimumSize(new java.awt.Dimension(0, 348));
        jpanel3.setOpaque(false);
        jpanel3.setLayout(new java.awt.GridLayout(4, 1));

        jPanel21.setOpaque(false);
        jPanel21.setLayout(new java.awt.GridLayout(1, 0));

        jPanel43.setOpaque(false);

        container10.setkEndColor(new java.awt.Color(204, 204, 204));
        container10.setkFillBackground(false);
        container10.setkStartColor(new java.awt.Color(204, 204, 204));
        container10.setMaximumSize(new java.awt.Dimension(32767, 45));
        container10.setMinimumSize(new java.awt.Dimension(100, 45));
        container10.setOpaque(false);
        container10.setLayout(new java.awt.BorderLayout());

        jPanel67.setMaximumSize(new java.awt.Dimension(5, 32767));
        jPanel67.setMinimumSize(new java.awt.Dimension(5, 100));
        jPanel67.setOpaque(false);
        jPanel67.setPreferredSize(new java.awt.Dimension(5, 45));

        javax.swing.GroupLayout jPanel67Layout = new javax.swing.GroupLayout(jPanel67);
        jPanel67.setLayout(jPanel67Layout);
        jPanel67Layout.setHorizontalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel67Layout.setVerticalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container10.add(jPanel67, java.awt.BorderLayout.LINE_END);

        jPanel68.setMaximumSize(new java.awt.Dimension(10, 32767));
        jPanel68.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel68.setOpaque(false);
        jPanel68.setPreferredSize(new java.awt.Dimension(10, 45));

        javax.swing.GroupLayout jPanel68Layout = new javax.swing.GroupLayout(jPanel68);
        jPanel68.setLayout(jPanel68Layout);
        jPanel68Layout.setHorizontalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel68Layout.setVerticalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container10.add(jPanel68, java.awt.BorderLayout.LINE_START);

        textField9.setBackground(new java.awt.Color(255, 255, 255));
        textField9.setText("Ingresar telefono celular");
        textField9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textField9.setOpaque(false);
        textField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField9KeyTyped(evt);
            }
        });
        container10.add(textField9, java.awt.BorderLayout.CENTER);

        title11.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title11.setForeground(new java.awt.Color(0, 0, 0));
        title11.setText("Teléfono celular");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
            .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel43Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel43Layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addComponent(container10, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                        .addGroup(jPanel43Layout.createSequentialGroup()
                            .addComponent(title11)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 87, Short.MAX_VALUE)
            .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel43Layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(title11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(container10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)))
        );

        jPanel21.add(jPanel43);

        jPanel64.setOpaque(false);

        container11.setkEndColor(new java.awt.Color(204, 204, 204));
        container11.setkFillBackground(false);
        container11.setkStartColor(new java.awt.Color(204, 204, 204));
        container11.setMaximumSize(new java.awt.Dimension(32767, 45));
        container11.setMinimumSize(new java.awt.Dimension(100, 45));
        container11.setOpaque(false);
        container11.setLayout(new java.awt.BorderLayout());

        jPanel69.setMaximumSize(new java.awt.Dimension(5, 32767));
        jPanel69.setMinimumSize(new java.awt.Dimension(5, 100));
        jPanel69.setOpaque(false);
        jPanel69.setPreferredSize(new java.awt.Dimension(5, 45));

        javax.swing.GroupLayout jPanel69Layout = new javax.swing.GroupLayout(jPanel69);
        jPanel69.setLayout(jPanel69Layout);
        jPanel69Layout.setHorizontalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel69Layout.setVerticalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container11.add(jPanel69, java.awt.BorderLayout.LINE_END);

        jPanel70.setMaximumSize(new java.awt.Dimension(10, 32767));
        jPanel70.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel70.setOpaque(false);
        jPanel70.setPreferredSize(new java.awt.Dimension(10, 45));

        javax.swing.GroupLayout jPanel70Layout = new javax.swing.GroupLayout(jPanel70);
        jPanel70.setLayout(jPanel70Layout);
        jPanel70Layout.setHorizontalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel70Layout.setVerticalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container11.add(jPanel70, java.awt.BorderLayout.LINE_START);

        textField10.setBackground(new java.awt.Color(255, 255, 255));
        textField10.setText("Ingresar teléfono de casa");
        textField10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textField10.setOpaque(false);
        textField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField10KeyTyped(evt);
            }
        });
        container11.add(textField10, java.awt.BorderLayout.CENTER);

        title12.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title12.setForeground(new java.awt.Color(0, 0, 0));
        title12.setText("Teléfono de casa");

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
            .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel64Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel64Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(container11, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                        .addGroup(jPanel64Layout.createSequentialGroup()
                            .addComponent(title12)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 87, Short.MAX_VALUE)
            .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel64Layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(title12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(container11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)))
        );

        jPanel21.add(jPanel64);

        jpanel3.add(jPanel21);

        jPanel22.setOpaque(false);
        jPanel22.setLayout(new java.awt.GridLayout(1, 0));

        jPanel65.setOpaque(false);

        title13.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title13.setForeground(new java.awt.Color(0, 0, 0));
        title13.setText("Departamento");

        comboDepartamento.setBackground(new java.awt.Color(255, 255, 255));
        comboDepartamento.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        comboDepartamento.setBorder(null);
        comboDepartamento.setFocusable(false);
        comboDepartamento.setOpaque(false);
        comboDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDepartamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel65Layout = new javax.swing.GroupLayout(jPanel65);
        jPanel65.setLayout(jPanel65Layout);
        jPanel65Layout.setHorizontalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
            .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel65Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel65Layout.createSequentialGroup()
                            .addComponent(title13)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(comboDepartamento, 0, 228, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel65Layout.setVerticalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 87, Short.MAX_VALUE)
            .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel65Layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(title13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(comboDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)))
        );

        jPanel22.add(jPanel65);

        jPanel66.setOpaque(false);

        title14.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title14.setForeground(new java.awt.Color(0, 0, 0));
        title14.setText("Municipio");

        container13.setkEndColor(new java.awt.Color(204, 204, 204));
        container13.setkFillBackground(false);
        container13.setkStartColor(new java.awt.Color(204, 204, 204));
        container13.setMaximumSize(new java.awt.Dimension(32767, 45));
        container13.setMinimumSize(new java.awt.Dimension(100, 45));
        container13.setOpaque(false);
        container13.setLayout(new java.awt.BorderLayout());

        jPanel73.setMaximumSize(new java.awt.Dimension(5, 32767));
        jPanel73.setMinimumSize(new java.awt.Dimension(5, 100));
        jPanel73.setOpaque(false);
        jPanel73.setPreferredSize(new java.awt.Dimension(5, 45));

        javax.swing.GroupLayout jPanel73Layout = new javax.swing.GroupLayout(jPanel73);
        jPanel73.setLayout(jPanel73Layout);
        jPanel73Layout.setHorizontalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel73Layout.setVerticalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container13.add(jPanel73, java.awt.BorderLayout.LINE_END);

        jPanel74.setMaximumSize(new java.awt.Dimension(10, 32767));
        jPanel74.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel74.setOpaque(false);
        jPanel74.setPreferredSize(new java.awt.Dimension(10, 45));

        javax.swing.GroupLayout jPanel74Layout = new javax.swing.GroupLayout(jPanel74);
        jPanel74.setLayout(jPanel74Layout);
        jPanel74Layout.setHorizontalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel74Layout.setVerticalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container13.add(jPanel74, java.awt.BorderLayout.LINE_START);

        textField12.setBackground(new java.awt.Color(255, 255, 255));
        textField12.setText("Ingresar municipio");
        textField12.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textField12.setOpaque(false);
        textField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField12ActionPerformed(evt);
            }
        });
        textField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField12KeyTyped(evt);
            }
        });
        container13.add(textField12, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel66Layout = new javax.swing.GroupLayout(jPanel66);
        jPanel66.setLayout(jPanel66Layout);
        jPanel66Layout.setHorizontalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
            .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel66Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(title14)
                    .addContainerGap(172, Short.MAX_VALUE)))
            .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel66Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(container13, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addGap(7, 7, 7)))
        );
        jPanel66Layout.setVerticalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 87, Short.MAX_VALUE)
            .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel66Layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(title14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(61, 61, 61)))
            .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel66Layout.createSequentialGroup()
                    .addContainerGap(36, Short.MAX_VALUE)
                    .addComponent(container13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jPanel22.add(jPanel66);

        jpanel3.add(jPanel22);

        jPanel25.setOpaque(false);

        container12.setkEndColor(new java.awt.Color(204, 204, 204));
        container12.setkFillBackground(false);
        container12.setkStartColor(new java.awt.Color(204, 204, 204));
        container12.setMaximumSize(new java.awt.Dimension(32767, 45));
        container12.setMinimumSize(new java.awt.Dimension(100, 45));
        container12.setOpaque(false);
        container12.setLayout(new java.awt.BorderLayout());

        jPanel71.setMaximumSize(new java.awt.Dimension(5, 32767));
        jPanel71.setMinimumSize(new java.awt.Dimension(5, 100));
        jPanel71.setOpaque(false);
        jPanel71.setPreferredSize(new java.awt.Dimension(5, 45));

        javax.swing.GroupLayout jPanel71Layout = new javax.swing.GroupLayout(jPanel71);
        jPanel71.setLayout(jPanel71Layout);
        jPanel71Layout.setHorizontalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel71Layout.setVerticalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container12.add(jPanel71, java.awt.BorderLayout.LINE_END);

        jPanel72.setMaximumSize(new java.awt.Dimension(10, 32767));
        jPanel72.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel72.setOpaque(false);
        jPanel72.setPreferredSize(new java.awt.Dimension(10, 45));

        javax.swing.GroupLayout jPanel72Layout = new javax.swing.GroupLayout(jPanel72);
        jPanel72.setLayout(jPanel72Layout);
        jPanel72Layout.setHorizontalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel72Layout.setVerticalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container12.add(jPanel72, java.awt.BorderLayout.LINE_START);

        textField11.setBackground(new java.awt.Color(255, 255, 255));
        textField11.setText("Ingresar dirección");
        textField11.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textField11.setOpaque(false);
        textField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField11KeyTyped(evt);
            }
        });
        container12.add(textField11, java.awt.BorderLayout.CENTER);

        title15.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title15.setForeground(new java.awt.Color(0, 0, 0));
        title15.setText("Dirección");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel25Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(container12, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                        .addGroup(jPanel25Layout.createSequentialGroup()
                            .addComponent(title15)
                            .addGap(172, 172, 172)))
                    .addContainerGap()))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 87, Short.MAX_VALUE)
            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel25Layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(title15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(container12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)))
        );

        jpanel3.add(jPanel25);

        jPanel27.setOpaque(false);

        advertenciaGenero1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        advertenciaGenero1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(advertenciaGenero1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(advertenciaGenero1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jpanel3.add(jPanel27);

        jPanel19.add(jpanel3, java.awt.BorderLayout.CENTER);

        jpanel2.add(jPanel19);

        jPanel41.setOpaque(false);

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );

        jpanel2.add(jPanel41);

        jPanel8.add(jpanel2);

        jPanel42.setOpaque(false);

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 534, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel42);

        add(jPanel8);
    }// </editor-fold>//GEN-END:initComponents

    private void generoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generoComboActionPerformed

    private void textField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField2ActionPerformed

    private void textField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField3ActionPerformed

    private void textField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField4ActionPerformed

    private void textField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField4KeyTyped
        Tools.numbersForDate(textField4, evt, 4);
        validarFechaNacimiento(contenedoresFechaNacimiento, camposFechaNacimiento, advertenciaNacimiento);
    }//GEN-LAST:event_textField4KeyTyped

    private void textField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField6KeyTyped
        Tools.numbersForDate(textField6, evt, 3);
        validacionCampo(container8, textField6, advertenciaEdad, 1);
    }//GEN-LAST:event_textField6KeyTyped

    private void textField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField1KeyTyped
        validacionCampo(container1, textField1, advertenciaNombre, 3);
    }//GEN-LAST:event_textField1KeyTyped

    private void textField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField5KeyTyped
        validacionCampo(container7, textField5, advertenciaApellidos, 3);
    }//GEN-LAST:event_textField5KeyTyped

    private void textField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField2KeyTyped
        validarFechaNacimiento(contenedoresFechaNacimiento, camposFechaNacimiento, advertenciaNacimiento);
    }//GEN-LAST:event_textField2KeyTyped

    private void textField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField3KeyTyped
        validarFechaNacimiento(contenedoresFechaNacimiento, camposFechaNacimiento, advertenciaNacimiento);
    }//GEN-LAST:event_textField3KeyTyped

    private void textField9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField9KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textField9KeyTyped

    private void textField10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField10KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textField10KeyTyped

    private void textField11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField11KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textField11KeyTyped

    private void comboDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboDepartamentoActionPerformed

    private void textField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField7ActionPerformed

    private void textField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField12ActionPerformed

    private void textField12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField12KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textField12KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel advertenciaApellidos;
    private javax.swing.JLabel advertenciaContrasena;
    private javax.swing.JLabel advertenciaCorreo;
    private javax.swing.JLabel advertenciaEdad;
    private javax.swing.JLabel advertenciaGenero;
    private javax.swing.JLabel advertenciaGenero1;
    private javax.swing.JLabel advertenciaNacimiento;
    private javax.swing.JLabel advertenciaNombre;
    private javax.swing.JLabel advertenciaTratamiento;
    private javax.swing.JComboBox<String> comboDepartamento;
    private com.k33ptoo.components.KGradientPanel container1;
    private com.k33ptoo.components.KGradientPanel container10;
    private com.k33ptoo.components.KGradientPanel container11;
    private com.k33ptoo.components.KGradientPanel container12;
    private com.k33ptoo.components.KGradientPanel container13;
    private com.k33ptoo.components.KGradientPanel container2;
    private com.k33ptoo.components.KGradientPanel container4;
    private com.k33ptoo.components.KGradientPanel container5;
    private com.k33ptoo.components.KGradientPanel container6;
    private com.k33ptoo.components.KGradientPanel container7;
    private com.k33ptoo.components.KGradientPanel container8;
    private com.k33ptoo.components.KGradientPanel container9;
    private javax.swing.JLabel direccionIcon;
    private javax.swing.JComboBox<String> generoCombo;
    private javax.swing.JLabel informationIcon;
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
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel4;
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
    private javax.swing.JPanel jPanel6;
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
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jpanel;
    private javax.swing.JPanel jpanel1;
    private javax.swing.JPanel jpanel2;
    private javax.swing.JPanel jpanel3;
    private com.k33ptoo.components.KGradientPanel kGradientPanel3;
    private com.k33ptoo.components.KGradientPanel kGradientPanel4;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JTextField textField1;
    private javax.swing.JTextField textField10;
    private javax.swing.JTextField textField11;
    private javax.swing.JTextField textField12;
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
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title3;
    private javax.swing.JLabel title4;
    private javax.swing.JLabel title5;
    private javax.swing.JLabel title6;
    private javax.swing.JLabel title7;
    private javax.swing.JLabel title9;
    // End of variables declaration//GEN-END:variables

    
}
