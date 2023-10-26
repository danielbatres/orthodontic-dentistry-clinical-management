package com.view.ingresar;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.context.SesionUsuario;
import com.context.StateColors;
import com.helper.AsistenteHelper;
import com.helper.DoctorHelper;
import com.k33ptoo.components.KGradientPanel;
import com.model.AsistenteModel;
import com.model.Registro;
import com.utils.Styles;
import com.utils.Tools;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.MatteBorder;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 17/09/22
 */
public class Login extends Styles {
    private boolean eye = false;
    private boolean stateCorreoLogin;
    private boolean stateContrasenaLogin;
    private String actualCorreoDoctor;
    private final ArrayList<Registro> DOCTORES;
    private final ArrayList<Registro> ASISTENTES;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        initStyles();
        
        DOCTORES = DoctorHelper.readDoctorsRegister();
        ASISTENTES = AsistenteHelper.readAsistentesRegister();
    }
    
    private void validateComplete(ArrayList<Registro> registros, String usuarioSesion) {
        paintOneContainer(container1, StateColors.getDanger());
        advertenciaCorreo.setForeground(StateColors.getDanger());
        advertenciaCorreo.setText("Correo inv\u00e1lido");
        textField.setBorder(new MatteBorder(1, 0, 1, 0, StateColors.getDanger()));
        
        paintOneContainer(container2, StateColors.getDanger());
        advertenciaContrasena.setForeground(StateColors.getDanger());
        advertenciaContrasena.setText("Contrase\u00f1a inv\u00e1lida");
        passwordField.setBorder(new MatteBorder(1, 0, 1, 0, StateColors.getDanger()));
        
        String correoElectronico = textField.getText();
        String contrasena = new String(passwordField.getPassword());
        
        for (Registro registro : registros) {
            if (correoElectronico.equals(registro.getCorreElectronico())) {
                actualCorreoDoctor = correoElectronico;
                stateCorreoLogin = true;
                advertenciaCorreo.setText("");
                paintOneContainer(container1, ChoosedPalette.getWHITE_PALETTE().getGray());
                textField.setBorder(new MatteBorder(1, 0, 1, 0, ChoosedPalette.getWHITE_PALETTE().getGray()));
            }
            
            if (registro.getContrasena().equals(contrasena)) {
                stateContrasenaLogin = true;
            }
            
            if (stateCorreoLogin && stateContrasenaLogin) {
                switch (usuarioSesion) {
                    case "doctor":
                        ApplicationContext.sesionUsuario = new SesionUsuario(DoctorHelper.listDoctor(registro.getIdUser()));
                        ApplicationContext.application.setVisible(false);
                        ApplicationContext.iniciar();
                        
                        ApplicationContext.application.mostrarPanel(ApplicationContext.mainInterface);
                        break;
                    case "asistente":
                        for (AsistenteModel asistente : ApplicationContext.asistentesListados) {
                            if (asistente.getId() != registro.getIdUser()) {
                                continue;
                            }
                            
                            ApplicationContext.sesionUsuario = new SesionUsuario(asistente);
                        }
                        
                        ApplicationContext.application.setVisible(false);
                        ApplicationContext.iniciar();
                        ApplicationContext.application.mostrarPanel(ApplicationContext.mainInterface);
                        break;
                }
                break;
            }
        }
    }
    
    private void validateEmail(JTextField emailField, JLabel warning, KGradientPanel container) {
        paintOneContainer(container, StateColors.getDanger());
        warning.setForeground(StateColors.getDanger());
        emailField.setBorder(new MatteBorder(1, 0, 1, 0, StateColors.getDanger()));
        
        SwingUtilities.updateComponentTreeUI(this);
        
        if (!emailField.getText().contains("@")) {
            warning.setText("Correo invalido");
        } else if (emailField.getText().length() < 10) {
            warning.setText("Minimo 10 caracteres");
        } else if (emailField.getText().length() > 50) {
            warning.setText("Maximo 50 caracteres");
        } else {
            warning.setText("");
            paintOneContainer(container, ChoosedPalette.getWHITE_PALETTE().getGray());
            emailField.setBorder(new MatteBorder(1, 0, 1, 0, ChoosedPalette.getWHITE_PALETTE().getGray()));
        }
    }
    
    private void validatePassword(JPasswordField passwordField, JLabel warning, KGradientPanel container) {
        paintOneContainer(container, StateColors.getDanger());
        warning.setForeground(StateColors.getDanger());
        passwordField.setBorder(new MatteBorder(1, 0, 1, 0, StateColors.getDanger()));
        
        if (actualCorreoDoctor != null) {
            warning.setText("Contraseña incorrecta");
        } else {
            warning.setText("");
            paintOneContainer(container, ChoosedPalette.getGray());
            passwordField.setBorder(new MatteBorder(1, 0, 1, 0, ChoosedPalette.getWHITE_PALETTE().getGray()));
        }
    }
    
    @Override
    public void addTitlesAndSubtitles() {
        TITLES_AND_SUBTITLES.add(title1);
        TITLES_AND_SUBTITLES.add(title2);
        TITLES_AND_SUBTITLES.add(title3);
        TITLES_AND_SUBTITLES.add(title4);
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
    }
    
    @Override
    public void addTextFields() {
        TEXTFIELDS.add(textField);
    }

    @Override
    public void initStyles() {
        emailIcon.setSize(30, 30);
        passwordIcon.setSize(30, 30);
        eyeIcon.setSize(30, 30);
        back.setSize(50, 50);
        
        Tools.setImageLabel(back, "src/com/assets/angulo-izquierdo.png", 28, 30, ChoosedPalette.getWHITE_PALETTE().getGray());
        Tools.setImageLabel(emailIcon, "src/com/assets/en.png", 10, 10, ChoosedPalette.getWHITE_PALETTE().getMidColor());
        Tools.setImageLabel(passwordIcon, "src/com/assets/cerrar.png", 10, 10, ChoosedPalette.getWHITE_PALETTE().getMidColor());
        Tools.setImageLabel(eyeIcon, "src/com/assets/ojos-cruzados.png", 10, 10, ChoosedPalette.getWHITE_PALETTE().getMidColor());
        
        addAll();
        
        paintPlainText();
        paintTitlesAndSubtitles();
        paintContainers();
        paintOnePasswordField(passwordField);
        paintOneContainer(container4, ChoosedPalette.getWHITE_PALETTE().getMidColor());
        paintTextFields();
        passwordField.setBorder(new MatteBorder(1, 0, 1, 0, ChoosedPalette.getWHITE_PALETTE().getGray()));
    }
    
    @Override
    public void paintOnePasswordField(JPasswordField passwordField) {
        passwordField.setForeground(ChoosedPalette.getWHITE_PALETTE().getTextColor());
    }
    
    @Override
    public void paintTitlesAndSubtitles() {
        TITLES_AND_SUBTITLES.forEach((JLabel title) -> {
            if (title != null) 
                title.setForeground(ChoosedPalette.getWHITE_PALETTE().getDarkColor());
        });
    }
    
    @Override
    public void paintPlainText() {
        PLAIN_TEXT.forEach(plain -> {
            plain.setForeground(ChoosedPalette.getWHITE_PALETTE().getTextColor());
        });
    }
    
    @Override
    public void paintContainers() {
        CONTAINERS.forEach(container -> {
            container.setkStartColor(ChoosedPalette.getWHITE_PALETTE().getGray());
            container.setkEndColor(ChoosedPalette.getWHITE_PALETTE().getGray());
        });
    }
    
    @Override
    public void paintTextFields() {
        TEXTFIELDS.forEach(textFieldd -> {
            textFieldd.setBackground(ChoosedPalette.getWHITE_PALETTE().getPrimaryBackground());
            textFieldd.setForeground(ChoosedPalette.getWHITE_PALETTE().getTextColor());
            textFieldd.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
            textFieldd.setBorder(new MatteBorder(1, 0, 1, 0, ChoosedPalette.getWHITE_PALETTE().getGray()));
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        container3 = new com.k33ptoo.components.KGradientPanel();
        jPanel6 = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        title1 = new javax.swing.JLabel();
        textInfo2 = new javax.swing.JPanel();
        text1 = new javax.swing.JLabel();
        text2 = new javax.swing.JLabel();
        emailIcon = new javax.swing.JLabel();
        title3 = new javax.swing.JLabel();
        passwordIcon = new javax.swing.JLabel();
        title4 = new javax.swing.JLabel();
        container1 = new com.k33ptoo.components.KGradientPanel();
        textField = new javax.swing.JTextField();
        container2 = new com.k33ptoo.components.KGradientPanel();
        jPanel8 = new javax.swing.JPanel();
        eyeIcon = new javax.swing.JLabel();
        jpanel = new javax.swing.JPanel();
        passwordField = new javax.swing.JPasswordField();
        container4 = new com.k33ptoo.components.KGradientPanel();
        ingresar = new javax.swing.JLabel();
        advertenciaCorreo = new javax.swing.JLabel();
        advertenciaContrasena = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(640, 670));
        setMinimumSize(new java.awt.Dimension(640, 670));
        setPreferredSize(new java.awt.Dimension(640, 670));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );

        add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );

        add(jPanel3, java.awt.BorderLayout.LINE_END);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(100, 75));
        jPanel4.setPreferredSize(new java.awt.Dimension(640, 75));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(32767, 50));
        jPanel2.setMinimumSize(new java.awt.Dimension(100, 50));
        jPanel2.setPreferredSize(new java.awt.Dimension(640, 100));

        container3.setkEndColor(new java.awt.Color(102, 102, 102));
        container3.setkFillBackground(false);
        container3.setkStartColor(new java.awt.Color(102, 102, 102));
        container3.setMaximumSize(new java.awt.Dimension(50, 50));
        container3.setOpaque(false);
        container3.setPreferredSize(new java.awt.Dimension(50, 50));
        container3.setLayout(new java.awt.BorderLayout());

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.BorderLayout());

        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setMaximumSize(new java.awt.Dimension(50, 50));
        back.setMinimumSize(new java.awt.Dimension(50, 50));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel6.add(back, java.awt.BorderLayout.CENTER);

        container3.add(jPanel6, java.awt.BorderLayout.CENTER);

        title2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        title2.setForeground(new java.awt.Color(153, 153, 153));
        title2.setText("Volver al menu principal");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(container3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(title2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(400, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(container3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(title2)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.LINE_AXIS));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel10);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new javax.swing.BoxLayout(jPanel12, javax.swing.BoxLayout.Y_AXIS));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        jPanel12.add(jPanel13);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        title1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        title1.setText("¡Bienvenido de vuelta!");

        textInfo2.setBackground(new java.awt.Color(255, 255, 255));
        textInfo2.setForeground(new java.awt.Color(102, 102, 102));
        textInfo2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text1.setForeground(new java.awt.Color(153, 153, 153));
        text1.setText("Acceso directo a tu panel de control, ingresa los datos");
        text1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        textInfo2.add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, -1));

        text2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text2.setForeground(new java.awt.Color(153, 153, 153));
        text2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text2.setText("correspondientes para continuar");
        text2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        textInfo2.add(text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 20));

        emailIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emailIcon.setMaximumSize(new java.awt.Dimension(30, 30));
        emailIcon.setMinimumSize(new java.awt.Dimension(30, 30));
        emailIcon.setPreferredSize(new java.awt.Dimension(30, 30));

        title3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        title3.setText("Correo Electronico");

        passwordIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordIcon.setMaximumSize(new java.awt.Dimension(30, 30));
        passwordIcon.setMinimumSize(new java.awt.Dimension(30, 30));
        passwordIcon.setPreferredSize(new java.awt.Dimension(30, 30));

        title4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        title4.setText("Contraseña");

        container1.setBackground(new java.awt.Color(255, 255, 255));
        container1.setkEndColor(new java.awt.Color(0, 0, 0));
        container1.setkFillBackground(false);
        container1.setkStartColor(new java.awt.Color(0, 0, 0));
        container1.setMaximumSize(new java.awt.Dimension(330, 45));
        container1.setMinimumSize(new java.awt.Dimension(330, 45));
        container1.setPreferredSize(new java.awt.Dimension(330, 45));

        textField.setBackground(new java.awt.Color(255, 255, 255));
        textField.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        textField.setForeground(new java.awt.Color(102, 102, 102));
        textField.setText("ejemplo@email.com");
        textField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        textField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout container1Layout = new javax.swing.GroupLayout(container1);
        container1.setLayout(container1Layout);
        container1Layout.setHorizontalGroup(
            container1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        container1Layout.setVerticalGroup(
            container1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textField, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        container2.setBackground(new java.awt.Color(255, 255, 255));
        container2.setkEndColor(new java.awt.Color(0, 0, 0));
        container2.setkFillBackground(false);
        container2.setkStartColor(new java.awt.Color(0, 0, 0));
        container2.setMaximumSize(new java.awt.Dimension(330, 45));
        container2.setMinimumSize(new java.awt.Dimension(330, 45));
        container2.setLayout(new java.awt.BorderLayout());

        jPanel8.setMaximumSize(new java.awt.Dimension(45, 45));
        jPanel8.setMinimumSize(new java.awt.Dimension(45, 45));
        jPanel8.setOpaque(false);
        jPanel8.setPreferredSize(new java.awt.Dimension(45, 45));
        jPanel8.setLayout(new java.awt.BorderLayout());

        eyeIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eyeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eyeIconMouseClicked(evt);
            }
        });
        jPanel8.add(eyeIcon, java.awt.BorderLayout.CENTER);

        container2.add(jPanel8, java.awt.BorderLayout.LINE_END);

        jpanel.setOpaque(false);

        passwordField.setText("password");
        passwordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        passwordField.setOpaque(false);
        passwordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordFieldMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpanelLayout = new javax.swing.GroupLayout(jpanel);
        jpanel.setLayout(jpanelLayout);
        jpanelLayout.setHorizontalGroup(
            jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpanelLayout.setVerticalGroup(
            jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        container2.add(jpanel, java.awt.BorderLayout.CENTER);

        container4.setkEndColor(new java.awt.Color(0, 0, 0));
        container4.setkStartColor(new java.awt.Color(0, 0, 0));
        container4.setMaximumSize(new java.awt.Dimension(32767, 45));
        container4.setMinimumSize(new java.awt.Dimension(100, 45));
        container4.setOpaque(false);
        container4.setPreferredSize(new java.awt.Dimension(45, 45));
        container4.setLayout(new java.awt.BorderLayout());

        ingresar.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        ingresar.setForeground(new java.awt.Color(255, 255, 255));
        ingresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ingresar.setText("Ingresar");
        ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarMouseClicked(evt);
            }
        });
        container4.add(ingresar, java.awt.BorderLayout.CENTER);

        advertenciaCorreo.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        advertenciaCorreo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        advertenciaCorreo.setText("  ");

        advertenciaContrasena.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        advertenciaContrasena.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        advertenciaContrasena.setText("  ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title1)
                    .addComponent(textInfo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addComponent(emailIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(title3)
                            .addGap(18, 18, 18)
                            .addComponent(advertenciaCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(container1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addComponent(passwordIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(title4)
                            .addGap(18, 18, 18)
                            .addComponent(advertenciaContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(container4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(container2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(title1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(textInfo2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(title3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(advertenciaCorreo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(container1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(title4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(advertenciaContrasena))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(container4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel12.add(jPanel5);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setForeground(new java.awt.Color(255, 255, 255));
        jPanel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel14.setOpaque(false);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        jPanel12.add(jPanel14);

        jPanel7.add(jPanel12);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel11);

        add(jPanel7, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        ApplicationContext.welcomeScreen.mostrarPanel(ApplicationContext.welcome);
    }//GEN-LAST:event_backMouseClicked

    private void eyeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eyeIconMouseClicked
        if (!eye) {
            Tools.setImageLabel(eyeIcon, "src/com/assets/ojo.png", 20, 20, ChoosedPalette.getWHITE_PALETTE().getMidColor());
            passwordField.setEchoChar((char)0);
            eye = true;
        } else {
            Tools.setImageLabel(eyeIcon, "src/com/assets/ojos-cruzados.png", 20, 20, ChoosedPalette.getWHITE_PALETTE().getMidColor());
            passwordField.setEchoChar('*');
            eye = false;
        }
    }//GEN-LAST:event_eyeIconMouseClicked

    private void ingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMouseClicked
        if (ApplicationContext.isDoctorSesionActual()) {
            validateEmail(textField, advertenciaCorreo, container1);
            validatePassword(passwordField, advertenciaContrasena, container2);
            validateComplete(DOCTORES, "doctor");
        } else {
            validateEmail(textField, advertenciaCorreo, container1);
            validatePassword(passwordField, advertenciaContrasena, container2);
            validateComplete(ASISTENTES, "asistente");
        }
        
        stateCorreoLogin = false;
        stateContrasenaLogin = false;
    }//GEN-LAST:event_ingresarMouseClicked

    private void textFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldMouseClicked
        if (textField.getText().contains("ejemplo")) textField.setText("");
    }//GEN-LAST:event_textFieldMouseClicked

    private void passwordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFieldMouseClicked
        if (String.valueOf(passwordField.getPassword()).contains("password")) passwordField.setText("");
    }//GEN-LAST:event_passwordFieldMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel advertenciaContrasena;
    private javax.swing.JLabel advertenciaCorreo;
    private javax.swing.JLabel back;
    private com.k33ptoo.components.KGradientPanel container1;
    private com.k33ptoo.components.KGradientPanel container2;
    private com.k33ptoo.components.KGradientPanel container3;
    private com.k33ptoo.components.KGradientPanel container4;
    private javax.swing.JLabel emailIcon;
    private javax.swing.JLabel eyeIcon;
    private javax.swing.JLabel ingresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jpanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordIcon;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JTextField textField;
    private javax.swing.JPanel textInfo2;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title3;
    private javax.swing.JLabel title4;
    // End of variables declaration//GEN-END:variables

}
