package com.view.viewOdontograma;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.helper.OdontogramaHelper;
import com.model.DienteOdontogramaModel;
import com.utils.CustomScrollBar;
import com.utils.Styles;
import com.utils.Tools;
import static com.view.createPacient.NewContext.emptyMessage;
import java.util.ArrayList;
import javax.swing.border.LineBorder;

/**
 *
 * @author Daniel Batres
 */
public class OdontogramaData extends Styles {
    private boolean isCreate = true;
    private OdontogramaSelection selection;
    private int id;
    
    /**
     * Creates new form OdontogramaData
     */
    public OdontogramaData() {
        initComponents();
        styleMyComponentBaby();
    }
    
    public void setValues() {
        switch (OdontogramaContext.getOdontogramaSelection()) {
            case CORONA_BUEN_ESTADO:
            case CORONA_MAL_ESTADO:
            case DIENTE_AUSENTE:
            case DIENTE_INDICADO_EXTRACCION:
                comboCara.setSelectedItem("Completo");
                break;
            default:
                comboCara.setSelectedItem(OdontogramaContext.getDienteOdontogramaModel().getCara());
        }
        
        comboPieza.setSelectedItem(OdontogramaContext.getDienteOdontogramaModel().getPieza());
        isCreate = true;
    }
    
    public void setValuesUpdate(DienteOdontogramaModel diente) {
        comboPieza.setSelectedItem(diente.getPieza());
        comboCara.setSelectedItem(diente.getCara());
        
        textField1.setText(diente.getDiagnostico());
        observaciones.setText(diente.getDescripcionDiagnostico());
        textField2.setText(diente.getProcedimiento());
        id = diente.getId();
        isCreate = false;
        selection = OdontogramaContext.parseSeleccion(diente.getSeleccion());
    }
    
    @Override
    public void colorBasics() {
        setBorder(new LineBorder(ChoosedPalette.getGray()));
        setBackground(ChoosedPalette.getSecondaryBackground());
        observaciones.setBackground(ChoosedPalette.getSecondaryBackground());
        observaciones.setForeground(ChoosedPalette.getTextColor());
        Tools.setImageLabel(cross, "src/com/assets/cruz.png", 25, 25, ChoosedPalette.getDarkColor());
    }
    
    @Override
    public void addTitlesAndSubtitles() {
        TITLES_AND_SUBTITLES.add(title);
        TITLES_AND_SUBTITLES.add(title2);
        TITLES_AND_SUBTITLES.add(title3);
        TITLES_AND_SUBTITLES.add(title4);
        TITLES_AND_SUBTITLES.add(title5);
    }
    
    @Override
    public void addContainers() {
        CONTAINERS.add(container1);
        CONTAINERS.add(container2);
        CONTAINERS.add(container3);
    }
    
    @Override
    public void addTextFields() {
        TEXTFIELDS.add(textField1);
        TEXTFIELDS.add(textField2);
    }
    
    @Override
    public void addComboBox() {
        COMBOBOX.add(comboPieza);
        COMBOBOX.add(comboCara);
    }

    
    @Override
    public void dark() {
        paintAll();
    }
    
    @Override
    public void light() {
        paintAll();
    }
    
    @Override
    public void initStyles() {
        cross.setSize(50, 50);
        scroll.setVerticalScrollBar(new CustomScrollBar());
        scroll.getVerticalScrollBar().setUnitIncrement(35);
        addComboItems();
        paintOneContainer(container6, ChoosedPalette.getMidColor());
        paintOneContainer(container7, ChoosedPalette.getMidColor());
        paintOnePlainText(cancelText, ChoosedPalette.getMidColor());
    }
    
    private void addComboItems() {
        for (int i = 11; i <= 48; i++) {
            if (i == 19 || i == 29 || i == 39) {
                i++;
            } else {
                comboPieza.addItem("Pieza " + i);
            }
        }
        
        for (int i = 51; i <= 85; i++) {
            if (i == 56 || i == 66 || i == 76) {
                i += 4;
            } else {
                comboPieza.addItem("Pieza " + i);
            }
        }
        
        comboCara.addItem("Vestibular");
        comboCara.addItem("Lingual");
        comboCara.addItem("Distal");
        comboCara.addItem("Mesial");
        comboCara.addItem("Oclusal");
        comboCara.addItem("Completo");
    }
    
    private String setSide(String switchedSide, String side, String side1, String side2, String side3, String side4, String side5) {
        String finalSide;
        
        switch(switchedSide) {
            case "Vestibular":
                finalSide = side;
                break;
            case "Lingual":
                finalSide = side1;
                break;
            case "Distal":
                finalSide = side2;
                break;
            case "Mesial":
                finalSide = side3;
                break;
            case "Oclusal":
                finalSide = side4;
                break;
            case "Completo":
                finalSide = side5;
                break;
            default:
                finalSide = "";
        }
        
        return finalSide;
    }
    
    private DienteOdontogramaModel devolverDatosUpdate() {
        DienteOdontogramaModel dienteOdontograma = new DienteOdontogramaModel();
        
        dienteOdontograma.setId(id);
        dienteOdontograma.setDiagnostico(emptyMessage(textField1.getText()));
        dienteOdontograma.setDescripcionDiagnostico(emptyMessage(observaciones.getText()));
        dienteOdontograma.setProcedimiento(emptyMessage(textField2.getText()));
        dienteOdontograma.setPieza(comboPieza.getSelectedItem().toString());
        dienteOdontograma.setNumeroPieza(Integer.parseInt(comboPieza.getSelectedItem().toString().substring(6, 8)));
        dienteOdontograma.setSeleccion(String.valueOf(selection));
        dienteOdontograma.setCara(comboCara.getSelectedItem().toString());
        
        int num = dienteOdontograma.getNumeroPieza();
        
        if ((num > 10 && num < 19) || (num > 50 && num < 56)) {
            dienteOdontograma.setSide(setSide(dienteOdontograma.getCara(), "up", "down", "left", "right", "center", "all"));
        } else if ((num > 20 && num < 29) || (num > 60 && num < 66)) {
            dienteOdontograma.setSide(setSide(dienteOdontograma.getCara(), "up", "down", "right", "left", "center", "all"));
        } else if ((num > 40 && num < 49) || (num > 80 && num < 86)) {
            dienteOdontograma.setSide(setSide(dienteOdontograma.getCara(), "down", "up", "left", "right", "center", "all"));
        } else if ((num > 30 && num < 39) || (num > 70 && num < 76)) {
            dienteOdontograma.setSide(setSide(dienteOdontograma.getCara(), "down", "up", "right", "left", "center", "all"));
        }
        
        return dienteOdontograma;
    }
    
    private DienteOdontogramaModel devolverDatos() {
        DienteOdontogramaModel dienteOdontograma = new DienteOdontogramaModel();
        
        dienteOdontograma.setDiagnostico(emptyMessage(textField1.getText()));
        dienteOdontograma.setDescripcionDiagnostico(emptyMessage(observaciones.getText()));
        dienteOdontograma.setProcedimiento(emptyMessage(textField2.getText()));
        dienteOdontograma.setPieza(comboPieza.getSelectedItem().toString());
        dienteOdontograma.setNumeroPieza(Integer.parseInt(comboPieza.getSelectedItem().toString().substring(6, 8)));
        dienteOdontograma.setSeleccion(String.valueOf(OdontogramaContext.getOdontogramaSelection()));
        
        switch (OdontogramaContext.getOdontogramaSelection()) {
            case CORONA_BUEN_ESTADO:
            case CORONA_MAL_ESTADO:
            case DIENTE_AUSENTE:
            case DIENTE_INDICADO_EXTRACCION:
                OdontogramaContext.getDienteOdontogramaModel().setCara("Completo");
                break;
        }
        
        if (!OdontogramaContext.getDienteOdontogramaModel().getCara().equals("Completo")) {
            dienteOdontograma.setCara(comboCara.getSelectedItem().toString());
        } else {
            dienteOdontograma.setCara(OdontogramaContext.getDienteOdontogramaModel().getCara());
        }
        
        dienteOdontograma.setSide(OdontogramaContext.getSelectedSide());
        
        return dienteOdontograma;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        container2 = new com.k33ptoo.components.KGradientPanel();
        scroll = new javax.swing.JScrollPane();
        observaciones = new javax.swing.JTextArea();
        container3 = new com.k33ptoo.components.KGradientPanel();
        textField2 = new javax.swing.JTextField();
        title2 = new javax.swing.JLabel();
        container1 = new com.k33ptoo.components.KGradientPanel();
        textField1 = new javax.swing.JTextField();
        title3 = new javax.swing.JLabel();
        comboPieza = new javax.swing.JComboBox<>();
        title4 = new javax.swing.JLabel();
        title5 = new javax.swing.JLabel();
        comboCara = new javax.swing.JComboBox<>();
        cross = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        container6 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        container7 = new com.k33ptoo.components.KGradientPanel();
        cancelText = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(500, 625));
        setMinimumSize(new java.awt.Dimension(500, 625));
        setPreferredSize(new java.awt.Dimension(500, 625));
        setLayout(new java.awt.BorderLayout());

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        title.setText("Descripcion - diagnostico");
        jPanel4.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        container2.setkEndColor(new java.awt.Color(204, 204, 204));
        container2.setkFillBackground(false);
        container2.setkStartColor(new java.awt.Color(204, 204, 204));
        container2.setOpaque(false);

        scroll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        observaciones.setBackground(new java.awt.Color(255, 255, 255));
        observaciones.setColumns(20);
        observaciones.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        observaciones.setLineWrap(true);
        observaciones.setRows(5);
        observaciones.setText("Ingresar descripción del diagnostico...");
        observaciones.setToolTipText("");
        observaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        scroll.setViewportView(observaciones);

        javax.swing.GroupLayout container2Layout = new javax.swing.GroupLayout(container2);
        container2.setLayout(container2Layout);
        container2Layout.setHorizontalGroup(
            container2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        container2Layout.setVerticalGroup(
            container2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(container2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 420, 80));

        container3.setkEndColor(new java.awt.Color(204, 204, 204));
        container3.setkFillBackground(false);
        container3.setkStartColor(new java.awt.Color(204, 204, 204));
        container3.setOpaque(false);

        textField2.setBackground(new java.awt.Color(255, 255, 255));
        textField2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        textField2.setText("Ingresar procedimiento");
        textField2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        textField2.setOpaque(false);

        javax.swing.GroupLayout container3Layout = new javax.swing.GroupLayout(container3);
        container3.setLayout(container3Layout);
        container3Layout.setHorizontalGroup(
            container3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        container3Layout.setVerticalGroup(
            container3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textField2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel4.add(container3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 420, 40));

        title2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        title2.setText("Diagnostico");
        jPanel4.add(title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        container1.setkEndColor(new java.awt.Color(204, 204, 204));
        container1.setkFillBackground(false);
        container1.setkStartColor(new java.awt.Color(204, 204, 204));
        container1.setOpaque(false);

        textField1.setBackground(new java.awt.Color(255, 255, 255));
        textField1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        textField1.setText("Ingresar diagnostico");
        textField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        textField1.setOpaque(false);

        javax.swing.GroupLayout container1Layout = new javax.swing.GroupLayout(container1);
        container1.setLayout(container1Layout);
        container1Layout.setHorizontalGroup(
            container1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        container1Layout.setVerticalGroup(
            container1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel4.add(container1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 420, 40));

        title3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        title3.setText("Procedimiento");
        jPanel4.add(title3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        comboPieza.setBackground(new java.awt.Color(255, 255, 255));
        comboPieza.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jPanel4.add(comboPieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 420, 40));

        title4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        title4.setText("Pieza");
        jPanel4.add(title4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        title5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        title5.setText("Cara");
        jPanel4.add(title5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        comboCara.setBackground(new java.awt.Color(255, 255, 255));
        comboCara.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        comboCara.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        comboCara.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(comboCara, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 420, 40));

        cross.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        cross.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cross.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crossMouseClicked(evt);
            }
        });
        jPanel4.add(cross, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 30, 30));

        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel1.setMinimumSize(new java.awt.Dimension(0, 100));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        container6.setkEndColor(new java.awt.Color(0, 0, 0));
        container6.setkStartColor(new java.awt.Color(0, 0, 0));
        container6.setOpaque(false);
        container6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                container6MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Guardar");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout container6Layout = new javax.swing.GroupLayout(container6);
        container6.setLayout(container6Layout);
        container6Layout.setHorizontalGroup(
            container6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );
        container6Layout.setVerticalGroup(
            container6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(container6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 140, 40));

        jPanel3.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 140, 30));

        jPanel5.setOpaque(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 140, 30));

        container7.setkEndColor(new java.awt.Color(0, 0, 0));
        container7.setkFillBackground(false);
        container7.setkStartColor(new java.awt.Color(0, 0, 0));
        container7.setOpaque(false);
        container7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                container7MouseClicked(evt);
            }
        });

        cancelText.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        cancelText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelText.setText("Cancelar");
        cancelText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout container7Layout = new javax.swing.GroupLayout(container7);
        container7.setLayout(container7Layout);
        container7Layout.setHorizontalGroup(
            container7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancelText, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );
        container7Layout.setVerticalGroup(
            container7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancelText, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(container7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 140, 40));

        add(jPanel1, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void crossMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crossMouseClicked
        ApplicationContext.registroOdontograma.dispose();
    }//GEN-LAST:event_crossMouseClicked

    private void container7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_container7MouseClicked
        ApplicationContext.registroOdontograma.dispose();
    }//GEN-LAST:event_container7MouseClicked

    private void dientesArriba(ArrayList<DienteArriba> array) {
        for (DienteArriba diente : array) {
            if (devolverDatos().getNumeroPieza() != diente.getDIENTE_ARRIBA().getNumPieza()) {
                continue;
            }
            
            switch (OdontogramaContext.getSelectedSide()) {
                case "up":
                    diente.getDIENTE_ARRIBA().clickedEvent("up", 11, 0);
                    break;
                case "left":
                    diente.getDIENTE_ARRIBA().clickedEvent("left", 11, 0);
                    break;
                case "right":
                    diente.getDIENTE_ARRIBA().clickedEvent("right", 11, 0);
                    break;
                case "down":
                    diente.getDIENTE_ARRIBA().clickedEvent("down", 11, 0);
                    break;
                case "center":
                    diente.getDIENTE_ARRIBA().centerClickedEvent();
            }
        }
    }
    
    private void dientesAbajo(ArrayList<DienteAbajo> array) {
        for (DienteAbajo diente : array) {
            if (devolverDatos().getNumeroPieza() != diente.getDIENTE_ABAJO().getNumPieza()) {
                continue;
            }
            
            switch (OdontogramaContext.getSelectedSide()) {
                case "up":
                    diente.getDIENTE_ABAJO().clickedEvent("up", 11, 0);
                    break;
                case "left":
                    diente.getDIENTE_ABAJO().clickedEvent("left", 11, 0);
                    break;
                case "right":
                    diente.getDIENTE_ABAJO().clickedEvent("right", 11, 0);
                    break;
                case "down":
                    diente.getDIENTE_ABAJO().clickedEvent("down", 11, 0);
                    break;
                case "center":
                    diente.getDIENTE_ABAJO().centerClickedEvent();
            }
        }
    }
    
    private void container6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_container6MouseClicked
        System.out.println(OdontogramaContext.getOdontogramaSelection());
        
        if (isCreate) {
            dientesArriba(ApplicationContext.odontogramaAdulto.getDIENTES_ARRIBA());
            dientesArriba(ApplicationContext.odontogramaJunior.getDIENTES_ARRIBA());
            dientesAbajo(ApplicationContext.odontogramaAdulto.getDIENTES_ABAJO());
            dientesAbajo(ApplicationContext.odontogramaJunior.getDIENTES_ABAJO());
            
            for (DienteOdontogramaModel diente : ApplicationContext.dienteOdontogramaModels) {
                boolean firstStatement = diente.getNumeroPieza() == devolverDatos().getNumeroPieza() && diente.getCara().equals(devolverDatos().getCara());
                boolean secondStatement = diente.getNumeroPieza() == devolverDatos().getNumeroPieza() && devolverDatos().getCara().equals("Completo");
                boolean thirdStatement = diente.getNumeroPieza() == devolverDatos().getNumeroPieza() && diente.getCara().equals("Completo") && !devolverDatos().getCara().equals("Completo");
                
                if (firstStatement || secondStatement || thirdStatement) {
                    OdontogramaHelper.deleteRegistro(diente.getId());
                }
            }
            
            OdontogramaHelper.registrarValor(devolverDatos(), ApplicationContext.selectedPacient.getId());
        } else {
            OdontogramaHelper.updateRegistro(devolverDatosUpdate());
            ApplicationContext.odontogramaAdulto.addValuesTargets();
            ApplicationContext.odontogramaJunior.addValuesTargets();
        }
        
        ApplicationContext.registroOdontograma.dispose();
        ApplicationContext.odontograma.addTargets();
    }//GEN-LAST:event_container6MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancelText;
    private javax.swing.JComboBox<String> comboCara;
    private javax.swing.JComboBox<String> comboPieza;
    private com.k33ptoo.components.KGradientPanel container1;
    private com.k33ptoo.components.KGradientPanel container2;
    private com.k33ptoo.components.KGradientPanel container3;
    private com.k33ptoo.components.KGradientPanel container6;
    private com.k33ptoo.components.KGradientPanel container7;
    private javax.swing.JLabel cross;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextArea observaciones;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTextField textField1;
    private javax.swing.JTextField textField2;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title3;
    private javax.swing.JLabel title4;
    private javax.swing.JLabel title5;
    // End of variables declaration//GEN-END:variables
}
