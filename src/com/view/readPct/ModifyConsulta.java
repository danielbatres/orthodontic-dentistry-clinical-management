package com.view.readPct;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.helper.ConsultasHelper;
import com.model.ConsultaModel;
import com.utils.Styles;
import com.utils.Tools;
import com.view.createPacient.NewContext;
import static com.view.createPacient.NewContext.dateTimeFormatter;
import static com.view.readPct.AgendaContext.validateCombo;
import static com.view.readPct.AgendaContext.validateComplete;
import static com.view.readPct.AgendaContext.validateHour;
import java.time.LocalDateTime;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 2/10/22
 */
public class ModifyConsulta extends Styles {
    private int idConsulta;
    
    /**
     * Creates new form ModificarConsulta
     */
    public ModifyConsulta() {
        initComponents();
        styleMyComponentBaby();
    }
    
    private ConsultaModel devolverDatos() {
        ConsultaModel consultaModel = new ConsultaModel();
        
        try {
            consultaModel.setId(idConsulta);
            consultaModel.setDiaDeConsulta(Integer.parseInt(textField1.getText()));
            consultaModel.setMesDeConsulta(Integer.parseInt(textField2.getText()));
            consultaModel.setAnnioDeConsulta(Integer.parseInt(textField3.getText()));
            consultaModel.setHoraDeConsulta(textField4.getText());
            consultaModel.setConsultaRealizada(false);
            consultaModel.setTratamientoDeConsulta(tratamientoCombo.getSelectedItem().toString());
            consultaModel.setDiaModificacion(LocalDateTime.now().getDayOfMonth());
            consultaModel.setMesModificacion(LocalDateTime.now().getMonthValue());
            consultaModel.setAnnioModificacion(LocalDateTime.now().getYear());
            consultaModel.setHoraModificacion(String.valueOf(LocalDateTime.now().getHour()) + ":" + String.valueOf(LocalDateTime.now().getMinute()) + " " + NewContext.localTime.format(dateTimeFormatter));
        } catch (NumberFormatException e) {
            System.out.println(e);
            return null;
        }
        
        return consultaModel;
    }
    
    public void setData(ConsultaModel consulta) {
        idConsulta = consulta.getId();
        textField1.setText(String.valueOf(consulta.getDiaDeConsulta()));
        textField2.setText(String.valueOf(consulta.getMesDeConsulta()));
        textField3.setText(String.valueOf(consulta.getAnnioDeConsulta()));
        textField4.setText(consulta.getHoraDeConsulta());
        
        switch (consulta.getTratamientoDeConsulta()) {
            case "Odontolog\u00eda":
                tratamientoCombo.setSelectedIndex(1);
                break;
            case "Ortodoncia":
                tratamientoCombo.setSelectedIndex(2);
                break;
        }
    }
    
    private void addItems() {
        tratamientoCombo.addItem("Elegir tratamiento");
        tratamientoCombo.addItem("Odontolog\u00eda");
        tratamientoCombo.addItem("Ortodoncia");
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
    public void addContainers() {
        CONTAINERS.add(container);
        CONTAINERS.add(container1);
        CONTAINERS.add(container2);
        CONTAINERS.add(container3);
        CONTAINERS.add(container5);
    }
    
    @Override
    public void addTextFields() {
        TEXTFIELDS.add(textField1);
        TEXTFIELDS.add(textField2);
        TEXTFIELDS.add(textField3);
        TEXTFIELDS.add(textField4);
    }
    
    @Override
    public void colorBasics() {
        paintAll();
        paintOneContainer(saveButton, ChoosedPalette.getMidColor());
        paintOneContainer(cancelButton, ChoosedPalette.getMidColor());
        cancel.setForeground(ChoosedPalette.getMidColor());
    }
    
    @Override
    public void initStyles(){
        addItems();
        informationIcon.setSize(50, 50);
        Tools.addMouseListenerIngresa(TEXTFIELDS);
        Tools.setImageLabel(informationIcon, "src/com/assets/documento.png", 25, 25, ChoosedPalette.getWhite());
    }
    
    @Override
    public void dark() {
        paintAll();
        paintOneContainer(container, ChoosedPalette.getSecondaryBackground());
    }
    
    @Override
    public void addComboBox() {
        COMBOBOX.add(tratamientoCombo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        container = new com.k33ptoo.components.KGradientPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        saveButton = new com.k33ptoo.components.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        cancelButton = new com.k33ptoo.components.KGradientPanel();
        cancel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        text1 = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        kGradientPanel3 = new com.k33ptoo.components.KGradientPanel();
        informationIcon = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        container1 = new com.k33ptoo.components.KGradientPanel();
        jPanel44 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        textField1 = new javax.swing.JTextField();
        title2 = new javax.swing.JLabel();
        advertenciaDia = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        container2 = new com.k33ptoo.components.KGradientPanel();
        jPanel46 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        textField2 = new javax.swing.JTextField();
        title3 = new javax.swing.JLabel();
        advertenciaMes = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        container3 = new com.k33ptoo.components.KGradientPanel();
        jPanel48 = new javax.swing.JPanel();
        jPanel49 = new javax.swing.JPanel();
        textField3 = new javax.swing.JTextField();
        title4 = new javax.swing.JLabel();
        advertenciaAnnio = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        advertenciaGenero = new javax.swing.JLabel();
        container5 = new com.k33ptoo.components.KGradientPanel();
        jPanel51 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        textField4 = new javax.swing.JTextField();
        title5 = new javax.swing.JLabel();
        advertenciaHora = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        tratamientoCombo = new javax.swing.JComboBox<>();
        title6 = new javax.swing.JLabel();
        advertenciaCombo = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(976, 522));
        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

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
            .addGap(0, 477, Short.MAX_VALUE)
        );

        add(jPanel13, java.awt.BorderLayout.LINE_END);

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
            .addGap(0, 477, Short.MAX_VALUE)
        );

        add(jPanel14, java.awt.BorderLayout.LINE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(100, 20));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(976, 20));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 977, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(100, 25));
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(976, 25));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 977, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.BorderLayout());

        container.setkEndColor(new java.awt.Color(204, 204, 204));
        container.setkFillBackground(false);
        container.setkStartColor(new java.awt.Color(204, 204, 204));
        container.setMinimumSize(new java.awt.Dimension(28, 80));
        container.setOpaque(false);
        container.setPreferredSize(new java.awt.Dimension(949, 80));
        container.setLayout(new java.awt.BorderLayout());

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setMinimumSize(new java.awt.Dimension(14, 100));
        jPanel30.setOpaque(false);
        jPanel30.setPreferredSize(new java.awt.Dimension(14, 150));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container.add(jPanel30, java.awt.BorderLayout.LINE_END);

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setMinimumSize(new java.awt.Dimension(14, 100));
        jPanel31.setOpaque(false);
        jPanel31.setPreferredSize(new java.awt.Dimension(14, 150));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container.add(jPanel31, java.awt.BorderLayout.LINE_START);

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setMinimumSize(new java.awt.Dimension(14, 14));
        jPanel32.setOpaque(false);

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 949, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        container.add(jPanel32, java.awt.BorderLayout.PAGE_END);

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.setMinimumSize(new java.awt.Dimension(14, 14));
        jPanel33.setOpaque(false);

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 949, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        container.add(jPanel33, java.awt.BorderLayout.PAGE_START);

        jPanel17.setOpaque(false);

        saveButton.setkEndColor(new java.awt.Color(0, 0, 0));
        saveButton.setkStartColor(new java.awt.Color(0, 0, 0));
        saveButton.setOpaque(false);
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Guardar");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout saveButtonLayout = new javax.swing.GroupLayout(saveButton);
        saveButton.setLayout(saveButtonLayout);
        saveButtonLayout.setHorizontalGroup(
            saveButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saveButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );
        saveButtonLayout.setVerticalGroup(
            saveButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saveButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        cancelButton.setkEndColor(new java.awt.Color(0, 0, 0));
        cancelButton.setkFillBackground(false);
        cancelButton.setkStartColor(new java.awt.Color(0, 0, 0));
        cancelButton.setOpaque(false);
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancel.setText("Cancelar");
        cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout cancelButtonLayout = new javax.swing.GroupLayout(cancelButton);
        cancelButton.setLayout(cancelButtonLayout);
        cancelButtonLayout.setHorizontalGroup(
            cancelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cancelButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancel, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );
        cancelButtonLayout.setVerticalGroup(
            cancelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cancelButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(537, Short.MAX_VALUE)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cancelButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        container.add(jPanel17, java.awt.BorderLayout.CENTER);

        jPanel4.add(container, java.awt.BorderLayout.PAGE_END);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jPanel5.setOpaque(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 199, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 397, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5);

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
        text1.setText("Edita la información de esta consulta");

        title1.setBackground(new java.awt.Color(0, 0, 0));
        title1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        title1.setForeground(new java.awt.Color(0, 0, 0));
        title1.setText("Modificar consulta");

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

        jPanel10.setOpaque(false);
        jPanel10.setLayout(new java.awt.GridLayout(3, 2));

        jPanel11.setOpaque(false);

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
        textField1.setText("Ingresar dia de la consulta");
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
        title2.setText("Dia");

        advertenciaDia.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        advertenciaDia.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(container1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(title2)
                        .addGap(18, 18, 18)
                        .addComponent(advertenciaDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(title2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(advertenciaDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.add(jPanel11);

        jPanel12.setOpaque(false);

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
        textField2.setText("Ingresar mes de la consulta");
        textField2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textField2.setOpaque(false);
        textField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField2KeyTyped(evt);
            }
        });
        container2.add(textField2, java.awt.BorderLayout.CENTER);

        title3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title3.setForeground(new java.awt.Color(0, 0, 0));
        title3.setText("Mes");

        advertenciaMes.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        advertenciaMes.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(container2, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(title3)
                        .addGap(18, 18, 18)
                        .addComponent(advertenciaMes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(title3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(advertenciaMes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.add(jPanel12);

        jPanel15.setOpaque(false);

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
        textField3.setText("Ingresar año de la consulta");
        textField3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textField3.setOpaque(false);
        textField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField3KeyTyped(evt);
            }
        });
        container3.add(textField3, java.awt.BorderLayout.CENTER);

        title4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title4.setForeground(new java.awt.Color(0, 0, 0));
        title4.setText("Año");

        advertenciaAnnio.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        advertenciaAnnio.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(container3, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(title4)
                        .addGap(18, 18, 18)
                        .addComponent(advertenciaAnnio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(title4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(advertenciaAnnio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.add(jPanel15);

        jPanel16.setOpaque(false);

        advertenciaGenero.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        advertenciaGenero.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        container5.setkEndColor(new java.awt.Color(204, 204, 204));
        container5.setkFillBackground(false);
        container5.setkStartColor(new java.awt.Color(204, 204, 204));
        container5.setMaximumSize(new java.awt.Dimension(32767, 45));
        container5.setMinimumSize(new java.awt.Dimension(100, 45));
        container5.setOpaque(false);
        container5.setLayout(new java.awt.BorderLayout());

        jPanel51.setMaximumSize(new java.awt.Dimension(5, 32767));
        jPanel51.setMinimumSize(new java.awt.Dimension(5, 100));
        jPanel51.setOpaque(false);
        jPanel51.setPreferredSize(new java.awt.Dimension(5, 45));

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container5.add(jPanel51, java.awt.BorderLayout.LINE_END);

        jPanel52.setMaximumSize(new java.awt.Dimension(10, 32767));
        jPanel52.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel52.setOpaque(false);
        jPanel52.setPreferredSize(new java.awt.Dimension(10, 45));

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        container5.add(jPanel52, java.awt.BorderLayout.LINE_START);

        textField4.setBackground(new java.awt.Color(255, 255, 255));
        textField4.setText("Ingresar hora de la consulta");
        textField4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        textField4.setOpaque(false);
        textField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField4KeyTyped(evt);
            }
        });
        container5.add(textField4, java.awt.BorderLayout.CENTER);

        title5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title5.setForeground(new java.awt.Color(0, 0, 0));
        title5.setText("Hora");

        advertenciaHora.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        advertenciaHora.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(advertenciaGenero, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel16Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(container5, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                        .addGroup(jPanel16Layout.createSequentialGroup()
                            .addComponent(title5)
                            .addGap(18, 18, 18)
                            .addComponent(advertenciaHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(advertenciaGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel16Layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(title5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(advertenciaHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(container5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(9, Short.MAX_VALUE)))
        );

        jPanel10.add(jPanel16);

        jPanel18.setOpaque(false);

        tratamientoCombo.setBackground(new java.awt.Color(255, 255, 255));
        tratamientoCombo.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        tratamientoCombo.setBorder(null);
        tratamientoCombo.setFocusable(false);
        tratamientoCombo.setOpaque(false);
        tratamientoCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tratamientoComboItemStateChanged(evt);
            }
        });
        tratamientoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tratamientoComboActionPerformed(evt);
            }
        });

        title6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title6.setForeground(new java.awt.Color(0, 0, 0));
        title6.setText("Tratamientos");

        advertenciaCombo.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        advertenciaCombo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tratamientoCombo, 0, 263, Short.MAX_VALUE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(title6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(advertenciaCombo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(title6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(advertenciaCombo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tratamientoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.add(jPanel18);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 57, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel7);

        jPanel6.setOpaque(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 199, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 397, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6);

        jPanel4.add(jPanel1, java.awt.BorderLayout.CENTER);

        add(jPanel4, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void textField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField1KeyTyped
        
    }//GEN-LAST:event_textField1KeyTyped

    private void textField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textField2KeyTyped

    private void textField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textField3KeyTyped

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseClicked
        validateComplete(container1, textField1, advertenciaDia, 31);
        validateComplete(container2, textField2, advertenciaMes, 12);
        validateComplete(container3, textField3, advertenciaAnnio, 10000);
        validateHour(container5, textField4, advertenciaHora);
        validateCombo(tratamientoCombo, advertenciaCombo);
        
        if (AgendaContext.countedErrors == 0) {
            ConsultasHelper.updateConsulta(devolverDatos());
            ApplicationContext.agendaPaciente.addTargets(ApplicationContext.selectedPacient.getId());

            ApplicationContext.paciente.mostrarPanel(ApplicationContext.agendaPaciente);
            ApplicationContext.agendaTargets.forEach(target -> target.colorComponent(ApplicationContext.selectedAppereance));
        }
        
        AgendaContext.countedErrors = 0;
    }//GEN-LAST:event_saveButtonMouseClicked

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        ApplicationContext.paciente.mostrarPanel(ApplicationContext.agendaPaciente);
    }//GEN-LAST:event_cancelButtonMouseClicked

    private void textField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField4KeyTyped
        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != ':' && evt.getKeyChar() != 'a' && evt.getKeyChar() != 'A' && evt.getKeyChar() != 'p' && evt.getKeyChar() != 'P' && evt.getKeyChar() != 'm' && evt.getKeyChar() != 'M' && evt.getKeyChar() != ' ') {
            evt.consume();
        } else if (evt.getKeyChar() == ':' && textField4.getText().contains(":")) {
            evt.consume();
        }
    }//GEN-LAST:event_textField4KeyTyped

    private void tratamientoComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tratamientoComboItemStateChanged
        
    }//GEN-LAST:event_tratamientoComboItemStateChanged

    private void tratamientoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tratamientoComboActionPerformed

    }//GEN-LAST:event_tratamientoComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel advertenciaAnnio;
    private javax.swing.JLabel advertenciaCombo;
    private javax.swing.JLabel advertenciaDia;
    private javax.swing.JLabel advertenciaGenero;
    private javax.swing.JLabel advertenciaHora;
    private javax.swing.JLabel advertenciaMes;
    private javax.swing.JLabel cancel;
    private com.k33ptoo.components.KGradientPanel cancelButton;
    private com.k33ptoo.components.KGradientPanel container;
    private com.k33ptoo.components.KGradientPanel container1;
    private com.k33ptoo.components.KGradientPanel container2;
    private com.k33ptoo.components.KGradientPanel container3;
    private com.k33ptoo.components.KGradientPanel container5;
    private javax.swing.JLabel informationIcon;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private com.k33ptoo.components.KGradientPanel kGradientPanel3;
    private com.k33ptoo.components.KGradientPanel saveButton;
    private javax.swing.JLabel text1;
    private javax.swing.JTextField textField1;
    private javax.swing.JTextField textField2;
    private javax.swing.JTextField textField3;
    private javax.swing.JTextField textField4;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title3;
    private javax.swing.JLabel title4;
    private javax.swing.JLabel title5;
    private javax.swing.JLabel title6;
    private javax.swing.JComboBox<String> tratamientoCombo;
    // End of variables declaration//GEN-END:variables
}
