package com.view.dashboard;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.context.StateColors;
import com.model.PacienteModel;
import com.utils.Styles;
import com.utils.Tools;
import javax.swing.SwingUtilities;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 18/09/22
 */
public class RecentPacientTarget extends Styles {
    private PacienteModel paciente;

    /**
     * Creates new form PacienteTarget
     * @param pacienteModel
     */
    public RecentPacientTarget(PacienteModel pacienteModel) {
        initComponents();
        paciente = pacienteModel;
        styleMyComponentBaby();
        nombreText.setText(pacienteModel.getNombres() + " " + pacienteModel.getApellidos());
        edadText.setText(String.valueOf(pacienteModel.getEdad()));
        generoText.setText(pacienteModel.getGenero());
        contactoText.setText(pacienteModel.getTelefonoCelular());
        if (paciente.isTratamientoOdontologico()) tratamientoText.setText("Odontologia");
        if (paciente.isTratamientoOrtodontico()) tratamientoText.setText("Ortodoncia");
    }
    
    @Override
    public void colorBasics() {
        paintAll();
        
        Tools.setImage(image, "src/com/images/dark-user.png", 0, 0);
    }
    
    @Override
    public void light() {
        CONTAINERS.forEach(container -> {
            container.setkFillBackground(false);
            container.setkStartColor(ChoosedPalette.getGray());
            container.setkEndColor(ChoosedPalette.getGray());
            container.repaint();
        });
        
        Tools.setImage(image, "src/com/images/user.png", 0, 0);
        
        if (paciente.isTratamientoOdontologico()) {
            tratamientoText.setText("Odontologia");
            paintOnePlainText(tratamientoText, ChoosedPalette.getMidColor());
            paintOneContainer(container2, ChoosedPalette.getPrimaryLightColor());
        } else if (paciente.isTratamientoOrtodontico()) {
            tratamientoText.setText("Ortodoncia");
            paintOnePlainText(tratamientoText, StateColors.getSuccess());
            paintOneContainer(container2, ChoosedPalette.getSecondaryLightColor());
        } 
        
        if (paciente.isTratamientoOdontologico() && paciente.isTratamientoOrtodontico()) {
            tratamientoText.setText("Ambos");
            paintOnePlainText(tratamientoText, ChoosedPalette.getTerciaryTextColor());
            paintOneContainer(container2, ChoosedPalette.getTerciaryLightColor());
        }
    }
    
    @Override
    public void dark() {
        CONTAINERS.forEach(container -> {
            container.setkFillBackground(true);
            container.setkStartColor(ChoosedPalette.getSecondaryBackground());
            container.setkEndColor(ChoosedPalette.getSecondaryBackground());
            container.repaint();
        });
        
        
        Tools.setImage(image, "src/com/images/dark-user.png", 0, 0);
        
        if (paciente.isTratamientoOdontologico()) {
            tratamientoText.setText("Odontologia");
            paintOnePlainText(tratamientoText, ChoosedPalette.getTerciaryTextColor());
            paintOneContainer(container2, ChoosedPalette.getPrimaryLightColor());
        } else if (paciente.isTratamientoOrtodontico()) {
            tratamientoText.setText("Ortodoncia");
            paintOnePlainText(tratamientoText, ChoosedPalette.getTerciaryTextColor());
            paintOneContainer(container2, ChoosedPalette.getSecondaryLightColor());
        } 
        
        if (paciente.isTratamientoOdontologico() && paciente.isTratamientoOrtodontico()) {
            tratamientoText.setText("Ambos");
            paintOnePlainText(tratamientoText, ChoosedPalette.getTerciaryTextColor());
            paintOneContainer(container2, ChoosedPalette.getTerciaryLightColor());
        }
    }
    
    @Override
    public void addTitlesAndSubtitles() {
        TITLES_AND_SUBTITLES.add(nombreText);
        TITLES_AND_SUBTITLES.add(edadText);
        TITLES_AND_SUBTITLES.add(generoText);
        TITLES_AND_SUBTITLES.add(contactoText);
    }

    @Override
    public void addPlainText() {
        
    }

    @Override
    public void addContainers() {
        CONTAINERS.add(container1);
    }

    @Override
    public void initStyles() {
        editIcon.setSize(34, 58);
        image.setSize(48, 48);
        Tools.setImageLabel(editIcon, "src/com/assets/editar.png", 10, 32, ChoosedPalette.getMidColor());
    }
    
    public PacienteModel getPaciente() {
        return paciente;
    }

    public void setPaciente(PacienteModel paciente) {
        this.paciente = paciente;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        container1 = new com.k33ptoo.components.KGradientPanel();
        jPanel2 = new javax.swing.JPanel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        image = new javax.swing.JLabel();
        nombreText = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        edadText = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        generoText = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        contactoText = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        container2 = new com.k33ptoo.components.KGradientPanel();
        tratamientoText = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        editIcon = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(32676, 80));
        setMinimumSize(new java.awt.Dimension(574, 80));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(574, 80));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(100, 10));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 10));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_END);

        container1.setkEndColor(new java.awt.Color(204, 204, 204));
        container1.setkFillBackground(false);
        container1.setkStartColor(new java.awt.Color(204, 204, 204));
        container1.setMaximumSize(new java.awt.Dimension(32767, 70));
        container1.setMinimumSize(new java.awt.Dimension(0, 70));
        container1.setOpaque(false);
        container1.setPreferredSize(new java.awt.Dimension(0, 70));
        container1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                container1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                container1MouseExited(evt);
            }
        });
        container1.setLayout(new java.awt.GridLayout(1, 3));

        jPanel2.setOpaque(false);

        kGradientPanel2.setkBorderRadius(100);
        kGradientPanel2.setkEndColor(new java.awt.Color(204, 204, 204));
        kGradientPanel2.setkStartColor(new java.awt.Color(204, 204, 204));
        kGradientPanel2.setMaximumSize(new java.awt.Dimension(48, 48));
        kGradientPanel2.setMinimumSize(new java.awt.Dimension(48, 48));
        kGradientPanel2.setOpaque(false);
        kGradientPanel2.setPreferredSize(new java.awt.Dimension(48, 48));
        kGradientPanel2.setLayout(new java.awt.BorderLayout());
        kGradientPanel2.add(image, java.awt.BorderLayout.CENTER);

        nombreText.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        nombreText.setText("Daniel Alessandro Garcia Batres");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, 99, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombreText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        container1.add(jPanel2);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jPanel8.setOpaque(false);

        edadText.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        edadText.setText("17");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 63, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(edadText, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(edadText, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addGap(11, 11, 11)))
        );

        jPanel3.add(jPanel8);

        jPanel9.setOpaque(false);

        generoText.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        generoText.setText("M");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 63, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(generoText, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(generoText, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addGap(11, 11, 11)))
        );

        jPanel3.add(jPanel9);

        jPanel10.setOpaque(false);

        contactoText.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        contactoText.setText("6450 0770");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 63, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(contactoText, javax.swing.GroupLayout.PREFERRED_SIZE, 51, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(contactoText, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addGap(11, 11, 11)))
        );

        jPanel3.add(jPanel10);

        container1.add(jPanel3);

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jPanel6.setOpaque(false);

        container2.setkEndColor(new java.awt.Color(204, 204, 204));
        container2.setkStartColor(new java.awt.Color(204, 204, 204));
        container2.setMaximumSize(new java.awt.Dimension(100, 50));
        container2.setMinimumSize(new java.awt.Dimension(100, 50));
        container2.setOpaque(false);
        container2.setLayout(new java.awt.BorderLayout());

        tratamientoText.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        tratamientoText.setForeground(new java.awt.Color(0, 0, 0));
        tratamientoText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tratamientoText.setText("Tratamiento");
        container2.add(tratamientoText, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(container2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(container2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.add(jPanel6);

        jPanel7.setOpaque(false);

        editIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(editIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(jPanel7);

        container1.add(jPanel4);

        add(container1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void container1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_container1MouseEntered
        paintOneContainer(container1, ChoosedPalette.getLightHover());
        if (ApplicationContext.selectedAppereance.equals("light")) {
            container1.setkFillBackground(true);
        } else if (ApplicationContext.selectedAppereance.equals("dark")) {
            paintOneContainer(container1, ChoosedPalette.getPrimaryBackground());
        }
        SwingUtilities.updateComponentTreeUI(this);
    }//GEN-LAST:event_container1MouseEntered

    private void container1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_container1MouseExited
        if (ApplicationContext.selectedAppereance.equals("light")) {
            paintOneContainer(container1, ChoosedPalette.getGray());
            container1.setkFillBackground(false);
        } else if (ApplicationContext.selectedAppereance.equals("dark")) {
            paintOneContainer(container1, ChoosedPalette.getSecondaryBackground());
        }
        SwingUtilities.updateComponentTreeUI(this);
    }//GEN-LAST:event_container1MouseExited

    private void editIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editIconMouseClicked
        ApplicationContext.selectedPacient = paciente;
        ApplicationContext.paciente.setValues();
        ApplicationContext.generales.setValues();
        ApplicationContext.agendaGeneral.addTargets();
        ApplicationContext.datosGenerales.setValues();
        ApplicationContext.agendaPaciente.addTargets(ApplicationContext.selectedPacient.getId());
        ApplicationContext.agendaTargets.forEach(target -> target.colorComponent(ApplicationContext.selectedAppereance));
        if (ApplicationContext.selectedPacient.isTratamientoOdontologico()) ApplicationContext.datosOdontologia.setValues();
        if (ApplicationContext.selectedPacient.isTratamientoOrtodontico()) ApplicationContext.datosOrtodoncia.setValues();
        ApplicationContext.tratamientosTargets.forEach(target -> target.colorComponent(ApplicationContext.selectedAppereance));
        ApplicationContext.controlMensual.addTargets("");
        ApplicationContext.controlTargets.forEach(target -> target.colorComponent(ApplicationContext.selectedAppereance));
        ApplicationContext.odontogramaAdulto.addValuesTargets();
        ApplicationContext.odontogramaJunior.addValuesTargets();
        ApplicationContext.odontograma.addTargets();
        SwingUtilities.updateComponentTreeUI(ApplicationContext.odontogramaAdulto);
        ApplicationContext.paciente.setFirstPanel();
        ApplicationContext.paciente.mostrarPanel(ApplicationContext.pacienteProfile);
        ApplicationContext.mainInterface.mostrarPanel(ApplicationContext.paciente);
    }//GEN-LAST:event_editIconMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contactoText;
    private com.k33ptoo.components.KGradientPanel container1;
    private com.k33ptoo.components.KGradientPanel container2;
    private javax.swing.JLabel edadText;
    private javax.swing.JLabel editIcon;
    private javax.swing.JLabel generoText;
    private javax.swing.JLabel image;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel nombreText;
    private javax.swing.JLabel tratamientoText;
    // End of variables declaration//GEN-END:variables

}
