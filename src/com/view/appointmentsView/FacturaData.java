package com.view.appointmentsView;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.helper.FacturaHelper;
import com.model.FacturaModel;
import com.model.MontosModel;
import com.utils.Tools;
import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author Daniel Batres
 */
public class FacturaData extends FacturaContext {
    private final ArrayList<JTextField> VALORES_MONTO = new ArrayList<>(4);
    private final ArrayList<JTextField> ANOTACIONES_MONTO = new ArrayList<>(4);
    private int id = 0;
    private String state;
    private FacturaModel factura;
    
    /**
     * Creates new form FacturaData
     */
    public FacturaData() {
        initComponents();
        styleMyComponentBaby();
    }
    
    public void setPacientName(String name, int idConsulta) {
        nombre.setText(name);
        id = idConsulta;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    
    public void setValues(FacturaModel factura) {
        this.factura = factura;
        textField3.setText(String.valueOf(factura.getSaldo()));
        textField2.setText(String.valueOf(factura.getTotales()));
        
        for (int i = 0; i < 4; i++) {
            VALORES_MONTO.get(i).setText(String.valueOf(factura.getMontos().get(i).getMonto()));
            ANOTACIONES_MONTO.get(i).setText(factura.getMontos().get(i).getAnotaciones());
        }
    }
    
    public void setStaticValues() {
        textField3.setText("Ingresar saldo");
        textField2.setText("Ingresar total");
        
        for (int i = 0; i < 4; i++) {
            VALORES_MONTO.get(i).setText("$0.00");
            ANOTACIONES_MONTO.get(i).setText("Ingresar anotaciones");
        }
    }
    
    @Override
    public void colorBasics() {
        setBorder(new LineBorder(ChoosedPalette.getGray()));
        setBackground(ChoosedPalette.getSecondaryBackground());
        Tools.setImageLabel(cross, "src/com/assets/cruz.png", 15, 15, ChoosedPalette.getDarkColor());
    }
    
    @Override
    public void addTitlesAndSubtitles() {
        TITLES_AND_SUBTITLES.add(title2);
        TITLES_AND_SUBTITLES.add(title3);
        TITLES_AND_SUBTITLES.add(title4);
        TITLES_AND_SUBTITLES.add(nombre);
    }
    
    @Override
    public void addPlainText() {
        PLAIN_TEXT.add(text);
    }
    
    @Override
    public void addContainers() {
        CONTAINERS.add(container1);
        CONTAINERS.add(container2);
        CONTAINERS.add(container3);
        CONTAINERS.add(container4);
        CONTAINERS.add(container5);
        CONTAINERS.add(container8);
        CONTAINERS.add(container9);
        CONTAINERS.add(container10);
        CONTAINERS.add(container11);
        CONTAINERS.add(container12);
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
    }
    
    private void addValoresMonto() {
        VALORES_MONTO.add(textField4);
        VALORES_MONTO.add(textField5);
        VALORES_MONTO.add(textField7);
        VALORES_MONTO.add(textField9);
    }
    
    private void addAnotacionesMonto() {
        ANOTACIONES_MONTO.add(textField1);
        ANOTACIONES_MONTO.add(textField6);
        ANOTACIONES_MONTO.add(textField8);
        ANOTACIONES_MONTO.add(textField10);
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
        paintOneContainer(container6, ChoosedPalette.getMidColor());
        paintOneContainer(container7, ChoosedPalette.getMidColor());
        paintOnePlainText(cancelText, ChoosedPalette.getMidColor());
        addValoresMonto();
        addAnotacionesMonto();
        Tools.addMouseListenerIngresa(TEXTFIELDS);
    }
    
    private FacturaModel devolverDatosCrear() {
        FacturaModel facturaLocal = new FacturaModel();
        
        facturaLocal.setSaldo(Float.parseFloat(emptyValue(textField3.getText())));
        
        for (int i = 0; i < 4; i++) {
            facturaLocal.getMontos().add(new MontosModel(Float.parseFloat(emptyValue(VALORES_MONTO.get(i).getText())), emptyString(ANOTACIONES_MONTO.get(i).getText())));
        }
        
        facturaLocal.setTotales(Float.parseFloat(emptyValue(textField2.getText())));
        
        return facturaLocal;
    }

    private FacturaModel devolverDatosActualizar() {
        factura.setSaldo(Float.parseFloat(emptyValue(textField3.getText())));
        
        ArrayList<MontosModel> montos = new ArrayList<>();
        
        for (int i = 0; i < 4; i++) {
            MontosModel monto = new MontosModel();
            
            monto.setIdMontos(factura.getMontos().get(i).getIdMontos());
            monto.setMonto(Float.parseFloat(emptyValue(VALORES_MONTO.get(i).getText())));
            monto.setAnotaciones(emptyString(ANOTACIONES_MONTO.get(i).getText()));
            
            montos.add(monto);
        }
        
        factura.setMontos(montos);
        factura.setTotales(Float.parseFloat(emptyValue(textField2.getText())));
        
        return factura;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        container3 = new com.k33ptoo.components.KGradientPanel();
        textField2 = new javax.swing.JTextField();
        title2 = new javax.swing.JLabel();
        container1 = new com.k33ptoo.components.KGradientPanel();
        textField1 = new javax.swing.JTextField();
        title3 = new javax.swing.JLabel();
        cross = new javax.swing.JLabel();
        title4 = new javax.swing.JLabel();
        container2 = new com.k33ptoo.components.KGradientPanel();
        textField3 = new javax.swing.JTextField();
        container4 = new com.k33ptoo.components.KGradientPanel();
        textField4 = new javax.swing.JTextField();
        container5 = new com.k33ptoo.components.KGradientPanel();
        textField5 = new javax.swing.JTextField();
        container8 = new com.k33ptoo.components.KGradientPanel();
        textField6 = new javax.swing.JTextField();
        container9 = new com.k33ptoo.components.KGradientPanel();
        textField7 = new javax.swing.JTextField();
        container10 = new com.k33ptoo.components.KGradientPanel();
        textField8 = new javax.swing.JTextField();
        container11 = new com.k33ptoo.components.KGradientPanel();
        textField9 = new javax.swing.JTextField();
        container12 = new com.k33ptoo.components.KGradientPanel();
        textField10 = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
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

        container3.setkEndColor(new java.awt.Color(204, 204, 204));
        container3.setkFillBackground(false);
        container3.setkStartColor(new java.awt.Color(204, 204, 204));
        container3.setOpaque(false);

        textField2.setBackground(new java.awt.Color(255, 255, 255));
        textField2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        textField2.setText("Ingresar total");
        textField2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        textField2.setOpaque(false);
        textField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField2KeyTyped(evt);
            }
        });

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

        jPanel4.add(container3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 420, 40));

        title2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        title2.setText("Montos");
        jPanel4.add(title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        container1.setkEndColor(new java.awt.Color(204, 204, 204));
        container1.setkFillBackground(false);
        container1.setkStartColor(new java.awt.Color(204, 204, 204));
        container1.setOpaque(false);

        textField1.setBackground(new java.awt.Color(255, 255, 255));
        textField1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        textField1.setText("Ingresar anotaciones");
        textField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        textField1.setOpaque(false);
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout container1Layout = new javax.swing.GroupLayout(container1);
        container1.setLayout(container1Layout);
        container1Layout.setHorizontalGroup(
            container1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addContainerGap())
        );
        container1Layout.setVerticalGroup(
            container1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel4.add(container1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 320, 40));

        title3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        title3.setText("Total");
        jPanel4.add(title3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        cross.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        cross.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cross.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crossMouseClicked(evt);
            }
        });
        jPanel4.add(cross, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 30, 30));

        title4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        title4.setText("Saldo");
        jPanel4.add(title4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        container2.setkEndColor(new java.awt.Color(204, 204, 204));
        container2.setkFillBackground(false);
        container2.setkStartColor(new java.awt.Color(204, 204, 204));
        container2.setOpaque(false);

        textField3.setBackground(new java.awt.Color(255, 255, 255));
        textField3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        textField3.setText("Ingresar saldo");
        textField3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        textField3.setOpaque(false);
        textField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textField3MouseClicked(evt);
            }
        });
        textField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField3KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout container2Layout = new javax.swing.GroupLayout(container2);
        container2.setLayout(container2Layout);
        container2Layout.setHorizontalGroup(
            container2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        container2Layout.setVerticalGroup(
            container2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textField3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel4.add(container2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 420, 40));

        container4.setkEndColor(new java.awt.Color(204, 204, 204));
        container4.setkFillBackground(false);
        container4.setkStartColor(new java.awt.Color(204, 204, 204));
        container4.setOpaque(false);

        textField4.setBackground(new java.awt.Color(255, 255, 255));
        textField4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        textField4.setText("$0.00");
        textField4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        textField4.setOpaque(false);
        textField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textField4MouseClicked(evt);
            }
        });
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

        javax.swing.GroupLayout container4Layout = new javax.swing.GroupLayout(container4);
        container4.setLayout(container4Layout);
        container4Layout.setHorizontalGroup(
            container4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(318, 318, 318))
        );
        container4Layout.setVerticalGroup(
            container4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textField4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel4.add(container4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 90, 40));

        container5.setkEndColor(new java.awt.Color(204, 204, 204));
        container5.setkFillBackground(false);
        container5.setkStartColor(new java.awt.Color(204, 204, 204));
        container5.setOpaque(false);

        textField5.setBackground(new java.awt.Color(255, 255, 255));
        textField5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        textField5.setText("$0.00");
        textField5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        textField5.setOpaque(false);
        textField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textField5MouseClicked(evt);
            }
        });
        textField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField5ActionPerformed(evt);
            }
        });
        textField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField5KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout container5Layout = new javax.swing.GroupLayout(container5);
        container5.setLayout(container5Layout);
        container5Layout.setHorizontalGroup(
            container5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textField5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(330, 330, 330))
        );
        container5Layout.setVerticalGroup(
            container5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textField5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel4.add(container5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 90, 40));

        container8.setkEndColor(new java.awt.Color(204, 204, 204));
        container8.setkFillBackground(false);
        container8.setkStartColor(new java.awt.Color(204, 204, 204));
        container8.setOpaque(false);

        textField6.setBackground(new java.awt.Color(255, 255, 255));
        textField6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        textField6.setText("Ingresar anotaciones");
        textField6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        textField6.setOpaque(false);
        textField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout container8Layout = new javax.swing.GroupLayout(container8);
        container8.setLayout(container8Layout);
        container8Layout.setHorizontalGroup(
            container8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container8Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(textField6, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addContainerGap())
        );
        container8Layout.setVerticalGroup(
            container8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textField6, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel4.add(container8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 320, 40));

        container9.setkEndColor(new java.awt.Color(204, 204, 204));
        container9.setkFillBackground(false);
        container9.setkStartColor(new java.awt.Color(204, 204, 204));
        container9.setOpaque(false);

        textField7.setBackground(new java.awt.Color(255, 255, 255));
        textField7.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        textField7.setText("$0.00");
        textField7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        textField7.setOpaque(false);
        textField7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textField7MouseClicked(evt);
            }
        });
        textField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField7ActionPerformed(evt);
            }
        });
        textField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField7KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout container9Layout = new javax.swing.GroupLayout(container9);
        container9.setLayout(container9Layout);
        container9Layout.setHorizontalGroup(
            container9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textField7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(330, 330, 330))
        );
        container9Layout.setVerticalGroup(
            container9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textField7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel4.add(container9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 90, 40));

        container10.setkEndColor(new java.awt.Color(204, 204, 204));
        container10.setkFillBackground(false);
        container10.setkStartColor(new java.awt.Color(204, 204, 204));
        container10.setOpaque(false);

        textField8.setBackground(new java.awt.Color(255, 255, 255));
        textField8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        textField8.setText("Ingresar anotaciones");
        textField8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        textField8.setOpaque(false);
        textField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout container10Layout = new javax.swing.GroupLayout(container10);
        container10.setLayout(container10Layout);
        container10Layout.setHorizontalGroup(
            container10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container10Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(textField8, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addContainerGap())
        );
        container10Layout.setVerticalGroup(
            container10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textField8, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel4.add(container10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 320, 40));

        container11.setkEndColor(new java.awt.Color(204, 204, 204));
        container11.setkFillBackground(false);
        container11.setkStartColor(new java.awt.Color(204, 204, 204));
        container11.setOpaque(false);

        textField9.setBackground(new java.awt.Color(255, 255, 255));
        textField9.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        textField9.setText("$0.00");
        textField9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        textField9.setOpaque(false);
        textField9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textField9MouseClicked(evt);
            }
        });
        textField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField9ActionPerformed(evt);
            }
        });
        textField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField9KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout container11Layout = new javax.swing.GroupLayout(container11);
        container11.setLayout(container11Layout);
        container11Layout.setHorizontalGroup(
            container11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textField9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(330, 330, 330))
        );
        container11Layout.setVerticalGroup(
            container11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textField9, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel4.add(container11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 90, 40));

        container12.setkEndColor(new java.awt.Color(204, 204, 204));
        container12.setkFillBackground(false);
        container12.setkStartColor(new java.awt.Color(204, 204, 204));
        container12.setOpaque(false);

        textField10.setBackground(new java.awt.Color(255, 255, 255));
        textField10.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        textField10.setText("Ingresar anotaciones");
        textField10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        textField10.setOpaque(false);
        textField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout container12Layout = new javax.swing.GroupLayout(container12);
        container12.setLayout(container12Layout);
        container12Layout.setHorizontalGroup(
            container12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container12Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(textField10, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addContainerGap())
        );
        container12Layout.setVerticalGroup(
            container12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textField10, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel4.add(container12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 320, 40));

        nombre.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        nombre.setText("Nombre del paciente");
        jPanel4.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 420, 30));

        text.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text.setText("Consulta");
        jPanel4.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

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
        ApplicationContext.registroFactura.dispose();
        counter = 0;
    }//GEN-LAST:event_crossMouseClicked

    private void container7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_container7MouseClicked
        ApplicationContext.registroFactura.dispose();
        counter = 0;
    }//GEN-LAST:event_container7MouseClicked

    private void container6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_container6MouseClicked
        switch (state) {
            case "crear":
                FacturaHelper.createFactura(devolverDatosCrear(), id);
                break;
            case "actualizar":
                FacturaHelper.updateFactura(devolverDatosActualizar());
                break;
        }
        
        ApplicationContext.registroFactura.dispose();
    }//GEN-LAST:event_container6MouseClicked

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed

    private void textField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField4ActionPerformed

    private void textField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField5ActionPerformed

    private void textField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField6ActionPerformed

    private void textField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField7ActionPerformed

    private void textField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField8ActionPerformed

    private void textField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField9ActionPerformed

    private void textField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField10ActionPerformed

    private void textField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField3MouseClicked
        
    }//GEN-LAST:event_textField3MouseClicked

    private void textField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField4MouseClicked
        Tools.deleteText(textField4);
    }//GEN-LAST:event_textField4MouseClicked

    private void textField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField5MouseClicked
        Tools.deleteText(textField5);
    }//GEN-LAST:event_textField5MouseClicked

    private void textField7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField7MouseClicked
        Tools.deleteText(textField7);
    }//GEN-LAST:event_textField7MouseClicked

    private void textField9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField9MouseClicked
        Tools.deleteText(textField9);
    }//GEN-LAST:event_textField9MouseClicked

    private void textField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField4KeyTyped
        Tools.onlyNumbers(textField4, evt, 8);
        if (Character.isDigit(evt.getKeyChar()) && textField4.getText().length() != 8 && !state.equals("actualizar")) {
            textField2.setText(String.valueOf(addTotal(textField2.getText(), textField4.getText(), textField4.getText() + evt.getKeyChar())));
        }
    }//GEN-LAST:event_textField4KeyTyped

    private void textField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField5KeyTyped
        Tools.onlyNumbers(textField5, evt, 8);
        if (Character.isDigit(evt.getKeyChar()) && textField5.getText().length() != 8 && !state.equals("actualizar")) {
            textField2.setText(String.valueOf(addTotal(textField2.getText(), textField5.getText(), textField5.getText() + evt.getKeyChar())));
        }
    }//GEN-LAST:event_textField5KeyTyped

    private void textField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField7KeyTyped
        Tools.onlyNumbers(textField7, evt, 8);
        if (Character.isDigit(evt.getKeyChar()) && textField7.getText().length() != 8 && !state.equals("actualizar")) {
            textField2.setText(String.valueOf(addTotal(textField2.getText(), textField7.getText(), textField7.getText() + evt.getKeyChar())));
        }
    }//GEN-LAST:event_textField7KeyTyped

    private void textField9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField9KeyTyped
        Tools.onlyNumbers(textField9, evt, 8);
        if (Character.isDigit(evt.getKeyChar()) && textField9.getText().length() != 8 && !state.equals("actualizar")) {
            textField2.setText(String.valueOf(addTotal(textField2.getText(), textField9.getText(), textField9.getText() + evt.getKeyChar())));
        }
    }//GEN-LAST:event_textField9KeyTyped

    private void textField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField2KeyTyped
        Tools.onlyNumbers(textField2, evt, 10);
    }//GEN-LAST:event_textField2KeyTyped

    private void textField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField3KeyTyped
        Tools.onlyNumbers(textField3, evt, 8);
        if (Character.isDigit(evt.getKeyChar()) && textField3.getText().length() != 8 && !state.equals("actualizar")) {
            textField2.setText(String.valueOf(addTotal(textField2.getText(), textField3.getText(), textField3.getText() + evt.getKeyChar())));
        }
    }//GEN-LAST:event_textField3KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancelText;
    private com.k33ptoo.components.KGradientPanel container1;
    private com.k33ptoo.components.KGradientPanel container10;
    private com.k33ptoo.components.KGradientPanel container11;
    private com.k33ptoo.components.KGradientPanel container12;
    private com.k33ptoo.components.KGradientPanel container2;
    private com.k33ptoo.components.KGradientPanel container3;
    private com.k33ptoo.components.KGradientPanel container4;
    private com.k33ptoo.components.KGradientPanel container5;
    private com.k33ptoo.components.KGradientPanel container6;
    private com.k33ptoo.components.KGradientPanel container7;
    private com.k33ptoo.components.KGradientPanel container8;
    private com.k33ptoo.components.KGradientPanel container9;
    private javax.swing.JLabel cross;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel text;
    private javax.swing.JTextField textField1;
    private javax.swing.JTextField textField10;
    private javax.swing.JTextField textField2;
    private javax.swing.JTextField textField3;
    private javax.swing.JTextField textField4;
    private javax.swing.JTextField textField5;
    private javax.swing.JTextField textField6;
    private javax.swing.JTextField textField7;
    private javax.swing.JTextField textField8;
    private javax.swing.JTextField textField9;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title3;
    private javax.swing.JLabel title4;
    // End of variables declaration//GEN-END:variables
}
