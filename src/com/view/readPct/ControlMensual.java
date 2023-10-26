package com.view.readPct;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.helper.ControlMensualHelper;
import com.utils.CustomScrollBar;
import com.utils.Styles;
import com.utils.Tools;
import java.time.LocalDateTime;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.MatteBorder;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 16/09/22
 */
public class ControlMensual extends Styles {
    
    /**
     * Creates new form ControlMensual
     */
    public ControlMensual() {
        initComponents();
        styleMyComponentBaby();
    }
    
    public void mostrarControl(JPanel panel) {
        Tools.showPanel(container2, panel, 10, 10);
    }
    
    public void addTargets(String add) {
        targetsControl.removeAll();
        ApplicationContext.controlTargets.clear();
        ApplicationContext.controlMensualListado.clear();
        ApplicationContext.controlMensualListado = ControlMensualHelper.obtenerControlMensual(ControlMensualHelper.getQUERY_GET_CONTROL_MENSUAL() + ApplicationContext.selectedPacient.getId() + add);
        
        ApplicationContext.controlMensualListado.forEach(control -> {
            ApplicationContext.controlTargets.add(new ControlMensualTarget(control));
        });
        
        ApplicationContext.controlTargets.forEach(target -> {
            target.colorComponent(ApplicationContext.selectedAppereance);
            targetsControl.add(target);
        });
        
        SwingUtilities.updateComponentTreeUI(this);
    }

    @Override
    public void addPlainText() {
        PLAIN_TEXT.add(text1);
        PLAIN_TEXT.add(text2);
        PLAIN_TEXT.add(text3);
        PLAIN_TEXT.add(text4);
        PLAIN_TEXT.add(text5);
    }

    @Override
    public void addContainers() {
        CONTAINERS.add(container2);
        CONTAINERS.add(container3);
    }
    
    @Override
    public void addComboBox() {
        COMBOBOX.add(mesCombo);
        COMBOBOX.add(annioCombo);
    }
    
    private void addComboBoxItems() {
        mesCombo.addItem("Enero");
        mesCombo.addItem("Febrero");
        mesCombo.addItem("Marzo");
        mesCombo.addItem("Abril");
        mesCombo.addItem("Mayo");
        mesCombo.addItem("Junio");
        mesCombo.addItem("Julio");
        mesCombo.addItem("Agosto");
        mesCombo.addItem("Septiembre");
        mesCombo.addItem("Octubre");
        mesCombo.addItem("Noviembre");
        mesCombo.addItem("Diciembre");
        
        int actualYear = LocalDateTime.now().getYear();
        
        for (int i = 8; i > 0; i--) {
            annioCombo.addItem(String.valueOf(actualYear - i));
        }
        
        annioCombo.addItem(String.valueOf(actualYear));
        annioCombo.setSelectedIndex(annioCombo.getItemCount() - 1);
        
        switch (LocalDateTime.now().getMonthValue()) {
            case 1:
                mesCombo.setSelectedIndex(0);
                break;
            case 2:
                mesCombo.setSelectedIndex(1);
                break;
            case 3:
                mesCombo.setSelectedIndex(2);
                break;
            case 4:
                mesCombo.setSelectedIndex(3);
                break;
            case 5:
                mesCombo.setSelectedIndex(4);
                break;
            case 6:
                mesCombo.setSelectedIndex(5);
                break;
            case 7:
                mesCombo.setSelectedIndex(6);
                break;
            case 8:
                mesCombo.setSelectedIndex(7);
                break;
            case 9:
                mesCombo.setSelectedIndex(8);
                break;
            case 10:
                mesCombo.setSelectedIndex(9);
                break;
            case 11:
                mesCombo.setSelectedIndex(10);
                break;
            case 12:
                mesCombo.setSelectedIndex(11);
                break;
        }
    }

    @Override
    public void initStyles() {
        back.setSize(32, 38);
        addIcon.setSize(32, 38);
        reload.setSize(45, 45);
        setIcons();
        Tools.setScroll(scrollPanel);
        addComboBoxItems();
        Tools.setImageLabel(reload, "src/com/assets/actualizar.png", 25, 25, ChoosedPalette.getWhite());
        paintOneContainer(containerButton1, ChoosedPalette.getMidColor());
        paintOneContainer(container1, ChoosedPalette.getMidColor());
    }
    
    private void setIcons() {
        Tools.setImageLabel(back, "src/com/assets/angulo-izquierdo.png", 12, 20, ChoosedPalette.getWhite());
    }
    
    @Override
    public void colorBasics() {
        paintAll();
        paintOneContainer(container4, ChoosedPalette.getPrimaryLightColor());
        needBorder.setBorder(new MatteBorder(0, 0, 1, 0, ChoosedPalette.getGray()));
        content.setBackground(ChoosedPalette.getSecondaryBackground());
    }
    
    @Override
    public void light() {
        CONTAINERS.forEach(container -> {
            container.setkFillBackground(false);
            container.setkStartColor(ChoosedPalette.getGray());
            container.setkEndColor(ChoosedPalette.getGray());
            container.repaint();
        });
        
        addText.setForeground(ChoosedPalette.getMidColor());
        Tools.setImageLabel(addIcon, "src/com/assets/agregar.png", 14, 20, ChoosedPalette.getMidColor());
    }
    
    @Override
    public void dark() {
        CONTAINERS.forEach(container -> {
            container.setkFillBackground(true);
            container.setkStartColor(ChoosedPalette.getSecondaryBackground());
            container.setkEndColor(ChoosedPalette.getSecondaryBackground());
            container.repaint();
        });
        
        addText.setForeground(ChoosedPalette.getWhite());
        Tools.setImageLabel(addIcon, "src/com/assets/agregar.png", 14, 20, ChoosedPalette.getWhite());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        text2 = new javax.swing.JLabel();
        text1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        container1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        mesCombo = new javax.swing.JComboBox<>();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        annioCombo = new javax.swing.JComboBox<>();
        jPanel15 = new javax.swing.JPanel();
        container3 = new com.k33ptoo.components.KGradientPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        needBorder = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        text3 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        text4 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        text5 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        controlMensualTargets = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        container4 = new com.k33ptoo.components.KGradientPanel();
        addText = new javax.swing.JLabel();
        addIcon = new javax.swing.JLabel();
        containerButton1 = new com.k33ptoo.components.KGradientPanel();
        reload = new javax.swing.JLabel();
        scrollPanel = new javax.swing.JScrollPane();
        content = new javax.swing.JPanel();
        targetsControl = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        container2 = new com.k33ptoo.components.KGradientPanel();

        setMinimumSize(new java.awt.Dimension(976, 388));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(976, 388));
        setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(100, 35));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(976, 35));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setMinimumSize(new java.awt.Dimension(14, 0));
        jPanel11.setOpaque(false);
        jPanel11.setPreferredSize(new java.awt.Dimension(14, 35));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel11, java.awt.BorderLayout.LINE_END);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setMinimumSize(new java.awt.Dimension(14, 0));
        jPanel12.setOpaque(false);
        jPanel12.setPreferredSize(new java.awt.Dimension(14, 35));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel12, java.awt.BorderLayout.LINE_START);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setOpaque(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(948, 35));

        text2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text2.setForeground(new java.awt.Color(102, 102, 102));
        text2.setText("Control mensual");

        text1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text1.setForeground(new java.awt.Color(102, 102, 102));
        text1.setText("Ficha de ortodoncia  /");
        text1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        text1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                text1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text2)
                .addContainerGap(712, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text1)
                    .addComponent(text2))
                .addContainerGap())
        );

        jPanel2.add(jPanel5, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(14, 100));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(14, 253));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
        );

        add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(14, 0));
        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(14, 253));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
        );

        add(jPanel4, java.awt.BorderLayout.LINE_END);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(100, 7));
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(976, 7));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 976, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel7.setMinimumSize(new java.awt.Dimension(307, 100));
        jPanel7.setOpaque(false);
        jPanel7.setPreferredSize(new java.awt.Dimension(307, 346));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setMinimumSize(new java.awt.Dimension(7, 100));
        jPanel9.setOpaque(false);
        jPanel9.setPreferredSize(new java.awt.Dimension(7, 425));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 549, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel9, java.awt.BorderLayout.LINE_END);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setMinimumSize(new java.awt.Dimension(14, 7));
        jPanel17.setOpaque(false);
        jPanel17.setPreferredSize(new java.awt.Dimension(307, 7));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 307, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel17, java.awt.BorderLayout.PAGE_START);

        jPanel13.setOpaque(false);
        jPanel13.setLayout(new java.awt.BorderLayout());

        jPanel14.setOpaque(false);
        jPanel14.setPreferredSize(new java.awt.Dimension(300, 120));

        container1.setkEndColor(new java.awt.Color(0, 0, 0));
        container1.setkStartColor(new java.awt.Color(0, 0, 0));
        container1.setMaximumSize(new java.awt.Dimension(32767, 45));
        container1.setMinimumSize(new java.awt.Dimension(0, 45));
        container1.setOpaque(false);
        container1.setPreferredSize(new java.awt.Dimension(300, 45));
        container1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                container1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Volver");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout container1Layout = new javax.swing.GroupLayout(container1);
        container1.setLayout(container1Layout);
        container1Layout.setHorizontalGroup(
            container1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        container1Layout.setVerticalGroup(
            container1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(container1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel16.setOpaque(false);
        jPanel16.setLayout(new java.awt.GridLayout(1, 0));

        jPanel19.setOpaque(false);
        jPanel19.setLayout(new java.awt.BorderLayout());

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setMinimumSize(new java.awt.Dimension(7, 0));
        jPanel22.setOpaque(false);
        jPanel22.setPreferredSize(new java.awt.Dimension(7, 35));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        jPanel19.add(jPanel22, java.awt.BorderLayout.LINE_END);

        mesCombo.setBackground(new java.awt.Color(255, 255, 255));
        mesCombo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        mesCombo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                mesComboPropertyChange(evt);
            }
        });
        jPanel19.add(mesCombo, java.awt.BorderLayout.CENTER);

        jPanel16.add(jPanel19);

        jPanel20.setOpaque(false);
        jPanel20.setLayout(new java.awt.BorderLayout());

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setMinimumSize(new java.awt.Dimension(7, 0));
        jPanel21.setOpaque(false);
        jPanel21.setPreferredSize(new java.awt.Dimension(7, 35));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        jPanel20.add(jPanel21, java.awt.BorderLayout.LINE_START);

        annioCombo.setBackground(new java.awt.Color(255, 255, 255));
        annioCombo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        annioCombo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                annioComboPropertyChange(evt);
            }
        });
        jPanel20.add(annioCombo, java.awt.BorderLayout.CENTER);

        jPanel16.add(jPanel20);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(container1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(container1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        jPanel13.add(jPanel14, java.awt.BorderLayout.PAGE_START);

        jPanel15.setOpaque(false);
        jPanel15.setLayout(new java.awt.BorderLayout());

        container3.setkEndColor(new java.awt.Color(204, 204, 204));
        container3.setkFillBackground(false);
        container3.setkStartColor(new java.awt.Color(204, 204, 204));
        container3.setOpaque(false);
        container3.setLayout(new java.awt.BorderLayout());

        jPanel23.setMinimumSize(new java.awt.Dimension(100, 50));
        jPanel23.setOpaque(false);
        jPanel23.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel23.setLayout(new java.awt.BorderLayout());

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setMinimumSize(new java.awt.Dimension(14, 0));
        jPanel25.setOpaque(false);
        jPanel25.setPreferredSize(new java.awt.Dimension(14, 35));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel23.add(jPanel25, java.awt.BorderLayout.LINE_END);

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setMinimumSize(new java.awt.Dimension(14, 0));
        jPanel26.setOpaque(false);
        jPanel26.setPreferredSize(new java.awt.Dimension(14, 35));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel23.add(jPanel26, java.awt.BorderLayout.LINE_START);

        needBorder.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        needBorder.setOpaque(false);
        needBorder.setLayout(new java.awt.GridLayout(1, 0));

        jPanel28.setOpaque(false);

        text3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text3.setForeground(new java.awt.Color(153, 153, 153));
        text3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text3.setText("Fecha");
        text3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text3, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        needBorder.add(jPanel28);

        jPanel29.setOpaque(false);

        text4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text4.setForeground(new java.awt.Color(153, 153, 153));
        text4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text4.setText("Hora");
        text4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text4, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        needBorder.add(jPanel29);

        jPanel30.setOpaque(false);

        text5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text5.setForeground(new java.awt.Color(153, 153, 153));
        text5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text5.setText("Acciones");
        text5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text5, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        needBorder.add(jPanel30);

        jPanel23.add(needBorder, java.awt.BorderLayout.CENTER);

        container3.add(jPanel23, java.awt.BorderLayout.PAGE_START);

        jPanel24.setOpaque(false);
        jPanel24.setLayout(new java.awt.BorderLayout());

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setMinimumSize(new java.awt.Dimension(14, 0));
        jPanel31.setOpaque(false);
        jPanel31.setPreferredSize(new java.awt.Dimension(14, 35));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
        );

        jPanel24.add(jPanel31, java.awt.BorderLayout.LINE_END);

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setMinimumSize(new java.awt.Dimension(14, 0));
        jPanel32.setOpaque(false);
        jPanel32.setPreferredSize(new java.awt.Dimension(14, 35));

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
        );

        jPanel24.add(jPanel32, java.awt.BorderLayout.LINE_START);

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.setMinimumSize(new java.awt.Dimension(14, 7));
        jPanel33.setOpaque(false);
        jPanel33.setPreferredSize(new java.awt.Dimension(307, 7));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        jPanel24.add(jPanel33, java.awt.BorderLayout.PAGE_START);

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));
        jPanel34.setMinimumSize(new java.awt.Dimension(100, 7));
        jPanel34.setOpaque(false);
        jPanel34.setPreferredSize(new java.awt.Dimension(976, 7));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        jPanel24.add(jPanel34, java.awt.BorderLayout.PAGE_END);

        controlMensualTargets.setOpaque(false);
        controlMensualTargets.setLayout(new java.awt.BorderLayout());

        jPanel27.setMinimumSize(new java.awt.Dimension(100, 80));
        jPanel27.setOpaque(false);
        jPanel27.setPreferredSize(new java.awt.Dimension(272, 80));

        container4.setkEndColor(new java.awt.Color(0, 0, 0));
        container4.setkStartColor(new java.awt.Color(0, 0, 0));
        container4.setMaximumSize(new java.awt.Dimension(32767, 45));
        container4.setOpaque(false);
        container4.setPreferredSize(new java.awt.Dimension(196, 45));
        container4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                container4MouseClicked(evt);
            }
        });

        addText.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        addText.setForeground(new java.awt.Color(69, 98, 255));
        addText.setText("Nuevo control mensual");
        addText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        addIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout container4Layout = new javax.swing.GroupLayout(container4);
        container4.setLayout(container4Layout);
        container4Layout.setHorizontalGroup(
            container4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addText)
                .addGap(19, 19, 19))
        );
        container4Layout.setVerticalGroup(
            container4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(container4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addText, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addContainerGap())
        );

        containerButton1.setkEndColor(new java.awt.Color(0, 0, 0));
        containerButton1.setkStartColor(new java.awt.Color(0, 0, 0));
        containerButton1.setMaximumSize(new java.awt.Dimension(2147483647, 45));
        containerButton1.setMinimumSize(new java.awt.Dimension(0, 45));
        containerButton1.setOpaque(false);
        containerButton1.setPreferredSize(new java.awt.Dimension(0, 45));
        containerButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                containerButton1MouseClicked(evt);
            }
        });
        containerButton1.setLayout(new java.awt.BorderLayout());

        reload.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reload.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        containerButton1.add(reload, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(container4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                    .addGap(218, 218, 218)
                    .addComponent(containerButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(container4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                    .addContainerGap(29, Short.MAX_VALUE)
                    .addComponent(containerButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        controlMensualTargets.add(jPanel27, java.awt.BorderLayout.PAGE_END);

        scrollPanel.setBackground(new java.awt.Color(255, 255, 255));
        scrollPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        scrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        content.setBackground(new java.awt.Color(255, 255, 255));

        targetsControl.setOpaque(false);
        targetsControl.setLayout(new javax.swing.BoxLayout(targetsControl, javax.swing.BoxLayout.Y_AXIS));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(targetsControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addComponent(targetsControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 293, Short.MAX_VALUE))
        );

        scrollPanel.setViewportView(content);

        controlMensualTargets.add(scrollPanel, java.awt.BorderLayout.CENTER);

        jPanel24.add(controlMensualTargets, java.awt.BorderLayout.CENTER);

        container3.add(jPanel24, java.awt.BorderLayout.CENTER);

        jPanel15.add(container3, java.awt.BorderLayout.CENTER);

        jPanel13.add(jPanel15, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel13, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel7, java.awt.BorderLayout.LINE_START);

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setMinimumSize(new java.awt.Dimension(7, 100));
        jPanel10.setOpaque(false);
        jPanel10.setPreferredSize(new java.awt.Dimension(7, 425));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 549, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel10, java.awt.BorderLayout.LINE_START);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setMinimumSize(new java.awt.Dimension(14, 7));
        jPanel18.setOpaque(false);
        jPanel18.setPreferredSize(new java.awt.Dimension(307, 7));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 641, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel18, java.awt.BorderLayout.PAGE_START);

        container2.setkEndColor(new java.awt.Color(204, 204, 204));
        container2.setkFillBackground(false);
        container2.setkStartColor(new java.awt.Color(204, 204, 204));
        container2.setOpaque(false);
        container2.setLayout(new java.awt.GridLayout(1, 0));
        jPanel8.add(container2, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel8, java.awt.BorderLayout.CENTER);

        add(jPanel6, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void text1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text1MouseClicked
        ApplicationContext.paciente.mostrarPanel(ApplicationContext.pacienteProfile);
    }//GEN-LAST:event_text1MouseClicked

    private void container1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_container1MouseClicked
        ApplicationContext.paciente.mostrarPanel(ApplicationContext.pacienteProfile);
    }//GEN-LAST:event_container1MouseClicked

    private void container4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_container4MouseClicked
        ApplicationContext.paciente.mostrarPanel(ApplicationContext.nuevoControl);
    }//GEN-LAST:event_container4MouseClicked

    private void containerButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_containerButton1MouseClicked
        addTargets("");
    }//GEN-LAST:event_containerButton1MouseClicked

    private int getMonthValue() {
        int monthValue = 0;
        
        switch (mesCombo.getSelectedItem().toString()) {
            case "Enero":
                monthValue = 1;
                break;
            case "Febrero":
                monthValue = 2;
                break;
            case "Marzo":
                monthValue = 3;
                break;
            case "Abril":
                monthValue = 4;
                break;
            case "Mayo":
                monthValue = 5;
                break;
            case "Junio":
                monthValue = 6;
                break;
            case "Julio":
                monthValue = 7;
                break;
            case "Agosto":
                monthValue = 8;
                break;
            case "Septiembre":
                monthValue = 9;
                break;
            case "Octubre":
                monthValue = 10;
                break;
            case "Noviembre":
                monthValue = 11;
                break;
            case "Diciembre":
                monthValue = 12;
                break;
            default:
                break;
        }
        
        return monthValue;
    }
    
    private void mesComboPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_mesComboPropertyChange

    }//GEN-LAST:event_mesComboPropertyChange

    private void annioComboPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_annioComboPropertyChange

    }//GEN-LAST:event_annioComboPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addIcon;
    private javax.swing.JLabel addText;
    private javax.swing.JComboBox<String> annioCombo;
    private javax.swing.JLabel back;
    private com.k33ptoo.components.KGradientPanel container1;
    private com.k33ptoo.components.KGradientPanel container2;
    private com.k33ptoo.components.KGradientPanel container3;
    private com.k33ptoo.components.KGradientPanel container4;
    private com.k33ptoo.components.KGradientPanel containerButton1;
    private javax.swing.JPanel content;
    private javax.swing.JPanel controlMensualTargets;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JComboBox<String> mesCombo;
    private javax.swing.JPanel needBorder;
    private javax.swing.JLabel reload;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JPanel targetsControl;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel text4;
    private javax.swing.JLabel text5;
    // End of variables declaration//GEN-END:variables

    
}
