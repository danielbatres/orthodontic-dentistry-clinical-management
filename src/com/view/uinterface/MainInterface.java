package com.view.uinterface;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.utils.IPanelRepintable;
import com.utils.Styles;
import com.utils.Tools;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.MatteBorder;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 15/09/22
 */
public class MainInterface extends Styles implements IPanelRepintable {
    private boolean menuSideBar = false;

    /**
     * Creates new form MainInterface
     */
    public MainInterface() {
        initComponents();
        styleMyComponentBaby();
        
        String nombre;
        String especialidad;
        
        if (ApplicationContext.isDoctorSesionActual()) {
            nombre = ApplicationContext.getDoctor().getNombres();
            especialidad = "Doctor";
        } else{
            nombre = ApplicationContext.getAsistente().getNombres();
            especialidad = "Asistente";
        }
        
        name.setText(nombre);
        descripcion.setText(especialidad);
    }
    
    public void changeTitle(String newTitle) {
        mainTitle.setText(newTitle);
    }
    
    public void setProfile(String username, String description) {
        name.setText(username);
        descripcion.setText(description);
    }
    
    @Override
    public void mostrarPanel(JPanel panel) {
        Tools.showPanel(dynamicContainer, panel, 1060, 569);
    }
    
    @Override
    public void addTitlesAndSubtitles() {
        TITLES_AND_SUBTITLES.add(mainTitle);
        TITLES_AND_SUBTITLES.add(name);
    }

    @Override
    public void addPlainText() {
       PLAIN_TEXT.add(descripcion);
    }

    @Override
    public void addContainers() {
        
    }

    @Override
    public void initStyles() {
        styles();
        Tools.showPanel(navBar, ApplicationContext.sideBarNavigation, 220, 720);
        if (ApplicationContext.isDoctorSesionActual()) {
            Tools.showPanel(dynamicContainer, ApplicationContext.dashboard, 1060, 569);
        } else {
            Tools.showPanel(dynamicContainer, ApplicationContext.pacientes, 1060, 569);
        }
    }
    
    private void styles() {
        navBar.setSize(220, 700);
        tab.setSize(50, 77);
        apariencia.setSize(50, 64);
        image.setSize(50, 50);
        
    }
    
    private void setIcons() {
        apariencia.setSize(50, 64);
        Tools.setImageLabel(tab, "src/com/assets/menu-hamburguesa.png", 25, 50, ChoosedPalette.getDarkColor());
        Tools.setImageLabel(apariencia, "src/com/assets/paleta.png", 25, 40, ChoosedPalette.getDarkColor());
    }
    
    @Override
    public void colorComponent(String palette) {
        switch (palette) {
            case "light":
                light();
                break;
            case "dark":
                dark();
                break;
        }
        setBackground(ChoosedPalette.getSecondaryBackground());
        container1.setBackground(ChoosedPalette.getPrimaryBackground());
        changeMatteBorder(container1);
        separator.setForeground(ChoosedPalette.getGray());
        separator.setBackground(ChoosedPalette.getGray());
        navBar.setBorder(new MatteBorder(0, 0, 0, 1, ChoosedPalette.getGray()));
        paintTitlesAndSubtitles();
        paintPlainText();
        setIcons();
    }
    
    @Override
    public void dark() {
        Tools.setImage(image, "src/com/images/dark-user.png", 0, 0);
    }
    
    @Override
    public void light() {
        Tools.setImage(image, "src/com/images/user.png", 0, 0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navBar = new javax.swing.JPanel();
        container = new javax.swing.JPanel();
        container1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        tab = new javax.swing.JLabel();
        mainTitle = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        descripcion = new javax.swing.JLabel();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        image = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        apariencia = new javax.swing.JLabel();
        dynamicContainer = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1280, 670));
        setMinimumSize(new java.awt.Dimension(1280, 670));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        navBar.setBackground(new java.awt.Color(255, 255, 255));
        navBar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        navBar.setMinimumSize(new java.awt.Dimension(220, 670));
        navBar.setOpaque(false);
        navBar.setPreferredSize(new java.awt.Dimension(220, 670));
        navBar.setLayout(new java.awt.GridLayout(1, 1));
        add(navBar);

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setOpaque(false);
        container.setLayout(new java.awt.BorderLayout());

        container1.setBackground(new java.awt.Color(255, 255, 255));
        container1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        container1.setMaximumSize(new java.awt.Dimension(389456, 90));
        container1.setMinimumSize(new java.awt.Dimension(1080, 90));
        container1.setPreferredSize(new java.awt.Dimension(1058, 90));
        container1.setLayout(new java.awt.GridLayout(1, 3));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setOpaque(false);
        jPanel15.setPreferredSize(new java.awt.Dimension(820, 12));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel15, java.awt.BorderLayout.PAGE_START);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setMinimumSize(new java.awt.Dimension(0, 14));
        jPanel16.setOpaque(false);
        jPanel16.setPreferredSize(new java.awt.Dimension(820, 14));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel16, java.awt.BorderLayout.PAGE_END);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setOpaque(false);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 63, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel10, java.awt.BorderLayout.LINE_START);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setOpaque(false);

        tab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tab.setMaximumSize(new java.awt.Dimension(50, 77));
        tab.setMinimumSize(new java.awt.Dimension(50, 77));
        tab.setPreferredSize(new java.awt.Dimension(50, 77));
        tab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabMouseClicked(evt);
            }
        });

        mainTitle.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        mainTitle.setForeground(new java.awt.Color(0, 0, 0));
        mainTitle.setText("Dashboard");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mainTitle)
                .addContainerGap(312, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.add(jPanel5, java.awt.BorderLayout.CENTER);

        container1.add(jPanel4);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setMinimumSize(new java.awt.Dimension(0, 14));
        jPanel12.setOpaque(false);
        jPanel12.setPreferredSize(new java.awt.Dimension(820, 14));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel12, java.awt.BorderLayout.PAGE_END);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setOpaque(false);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 63, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel14, java.awt.BorderLayout.LINE_END);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setOpaque(false);
        jPanel13.setPreferredSize(new java.awt.Dimension(820, 12));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel13, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);

        name.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));
        name.setText("Daniel Alessandro");

        descripcion.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        descripcion.setForeground(new java.awt.Color(153, 153, 153));
        descripcion.setText("Software engineer");
        descripcion.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        kGradientPanel1.setkBorderRadius(50);
        kGradientPanel1.setkEndColor(new java.awt.Color(204, 204, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 204, 204));
        kGradientPanel1.setMaximumSize(new java.awt.Dimension(50, 50));
        kGradientPanel1.setMinimumSize(new java.awt.Dimension(50, 50));
        kGradientPanel1.setOpaque(false);
        kGradientPanel1.setLayout(new java.awt.BorderLayout());
        kGradientPanel1.add(image, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name)
                    .addComponent(descripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        separator.setOrientation(javax.swing.SwingConstants.VERTICAL);

        apariencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        apariencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        apariencia.setMaximumSize(new java.awt.Dimension(50, 64));
        apariencia.setMinimumSize(new java.awt.Dimension(50, 64));
        apariencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aparienciaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addComponent(apariencia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(apariencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel1, java.awt.BorderLayout.CENTER);

        container1.add(jPanel6);

        container.add(container1, java.awt.BorderLayout.PAGE_START);

        dynamicContainer.setOpaque(false);
        dynamicContainer.setLayout(new javax.swing.BoxLayout(dynamicContainer, javax.swing.BoxLayout.LINE_AXIS));
        container.add(dynamicContainer, java.awt.BorderLayout.CENTER);

        add(container);
    }// </editor-fold>//GEN-END:initComponents

    private void tabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMouseClicked
        if (!menuSideBar) {
            navBar.setPreferredSize(new Dimension(100, this.getHeight()));
            Tools.showPanel(navBar, ApplicationContext.sideBarClose, 100, 720);
            ApplicationContext.sideBarClose.setSelectedIndex(ApplicationContext.sideBarNavigation.getSelectedIndex());
            ApplicationContext.sideBarClose.setSelected(ApplicationContext.sideBarClose.getSelectedIndex());
            menuSideBar = true;
        } else {
            navBar.setPreferredSize(new Dimension(220, this.getHeight()));
            Tools.showPanel(navBar, ApplicationContext.sideBarNavigation, 220, 720);
            ApplicationContext.sideBarNavigation.setSelectedIndex(ApplicationContext.sideBarClose.getSelectedIndex());
            ApplicationContext.sideBarNavigation.setSelected(ApplicationContext.sideBarNavigation.getSelectedIndex());
            menuSideBar = false;
        }

        SwingUtilities.updateComponentTreeUI(this);
    }//GEN-LAST:event_tabMouseClicked

    private void aparienciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aparienciaMouseClicked
        ApplicationContext.appearance.setVisible(true);
    }//GEN-LAST:event_aparienciaMouseClicked
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apariencia;
    private javax.swing.JPanel container;
    private javax.swing.JPanel container1;
    private javax.swing.JLabel descripcion;
    private javax.swing.JPanel dynamicContainer;
    private javax.swing.JLabel image;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel mainTitle;
    private javax.swing.JLabel name;
    private javax.swing.JPanel navBar;
    private javax.swing.JSeparator separator;
    private javax.swing.JLabel tab;
    // End of variables declaration//GEN-END:variables

    
}
