package com.view.viewOdontograma;

import com.context.ApplicationContext;
import com.context.StateColors;
import com.model.DienteOdontogramaModel;
import com.utils.Styles;
import com.utils.Tools;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Daniel Batres
 */
public class Diente extends Styles {
    private String stateValue = "";
    private int numPieza;
    private boolean setSm = false;
    private final ArrayList<JLabel> PAINT_LABELS = new ArrayList<>();
    
    /**
     * Creates new form Diente
     * @param value
     */
    public Diente(String value) {
        initComponents();
        styleMyComponentBaby();
        stateValue = value;
    }
    
    @Override
    public void initStyles() {
        addPaintLabels();
        upLabel.setSize(66, 66);
        downLabel.setSize(66, 66);
        rightLabel.setSize(66, 66);
        leftLabel.setSize(66, 66);
        background.setSize(66, 66);
        largeIcon.setSize(66, 66);
        smIcon.setSize(16, 16);
        Tools.setImage(background, "src/com/images/odontogram/diente.png", 5, 5);
    }
    
    private boolean getOdontogramaState(OdontogramaSelection odontogramaSelection) {
        return OdontogramaContext.isSelection() && OdontogramaContext.getOdontogramaSelection().equals(odontogramaSelection);
    }
    
    public void setCorona(int num) {
        if (getOdontogramaState(OdontogramaSelection.CORONA_MAL_ESTADO)) {
            Tools.setImageLabel(largeIcon, "src/com/images/odontogram/corona.png", num, num, StateColors.getDanger());
            smIcon.setIcon(null);
            smIcon.repaint();
            paintCenter(Color.WHITE);
            PAINT_LABELS.forEach(label -> label.setIcon(null));
            OdontogramaContext.setSelectedSide("all");
        } else if (getOdontogramaState(OdontogramaSelection.CORONA_BUEN_ESTADO)) {
            Tools.setImageLabel(largeIcon, "src/com/images/odontogram/corona.png", num, num, StateColors.getInfo());
            smIcon.setIcon(null);
            smIcon.repaint();
            paintCenter(Color.WHITE);
            PAINT_LABELS.forEach(label -> label.setIcon(null));
            OdontogramaContext.setSelectedSide("all");
        } 
    }
    
    public void setCrossValues(int num, int num2) {
        if (getOdontogramaState(OdontogramaSelection.DIENTE_INDICADO_EXTRACCION)) {
            Tools.setImageLabel(largeIcon, "src/com/images/odontogram/cross-line.png", num, num, StateColors.getDanger());
            Tools.setImageLabel(smIcon, "src/com/images/odontogram/let-cross.png", num2, num2, StateColors.getDanger());
            setSm = true;
            paintCenter(Color.WHITE);
            PAINT_LABELS.forEach(label -> label.setIcon(null));
            OdontogramaContext.setSelectedSide("all");
        } else if (getOdontogramaState(OdontogramaSelection.DIENTE_AUSENTE)) {
            Tools.setImageLabel(largeIcon, "src/com/images/odontogram/cross-line.png", num, num, StateColors.getInfo());
            Tools.setImageLabel(smIcon, "src/com/images/odontogram/let-cross.png", num2, num2, StateColors.getInfo());
            setSm = true;
            paintCenter(Color.WHITE);
            PAINT_LABELS.forEach(label -> label.setIcon(null));
            OdontogramaContext.setSelectedSide("all");
        }
    }
    
    private void nullIcons() {
        largeIcon.setIcon(null);
        largeIcon.repaint();
        if (setSm) {
            smIcon.setIcon(null);
            smIcon.repaint();
            setSm = false;
        }
        
        SwingUtilities.updateComponentTreeUI(this);
    }
    
    private void setIconImage(JLabel label, String side, int num) {
        Tools.setImage(label, "src/com/images/odontogram/" + side, num, num);
        nullIcons();
    }
    
    public JLabel setLabel(String side) {
        switch (side) {
            case "up":
                return upLabel;
            case "left":
                return leftLabel;
            case "right":
                return rightLabel;
            case "down":
                return downLabel;
        }
        
        return null;
    }
    
    public void setColorValues(String side, int num) {
        if (OdontogramaContext.isSelection()) {
            switch (OdontogramaContext.getOdontogramaSelection()) {
                case CARIES_DENTAL:
                    setIconImage(setLabel(side), side + "-side-red.png", num);
                    break;
                case OBTURACION_BUEN_ESTADO:
                    setIconImage(setLabel(side), side + "-side-blue.png", num);
                    break;
                case OBTURACION_MAL_ESTADO:
                    setIconImage(setLabel(side), side + "-side-double.png", num);
                    break;
            }
        }
    }
    
    private void setCara(String value) {
        OdontogramaContext.getDienteOdontogramaModel().setCara(value);
    }
    
    private void validateValues(boolean bool, String valueToSwitch, String caraUno, String caraDos, String caraTres, String caraCuatro) {
        if (bool) {
            switch(valueToSwitch) {
                case "up":
                    setCara(caraUno);
                    break;
                case "right":
                    setCara(caraDos);
                    break;
                case "down":
                    setCara(caraTres);
                    break;
                case "left":
                    setCara(caraCuatro);
            }
        }
    }
    
    private void odontogramaData(String side) {
        if (OdontogramaContext.isSelection()) {
            OdontogramaContext.setDienteOdontogramaModel(new DienteOdontogramaModel());
            OdontogramaContext.getDienteOdontogramaModel().setPieza("Pieza " + numPieza);
            
            boolean boolArriba = stateValue.equals("arriba");
            boolean boolAbajo = stateValue.equals("abajo");
            
            validateValues(boolArriba && (numPieza > 20 && numPieza < 29), side, "Vestibular", "Distal", "Lingual", "Mesial");
            validateValues(boolArriba && numPieza < 19, side, "Vestibular", "Mesial", "Lingual", "Distal");
            validateValues(boolAbajo && (numPieza > 30 && numPieza < 39), side, "Lingual", "Distal", "Vestibular", "Mesial");
            validateValues(boolAbajo && numPieza > 40, side, "Lingual", "Mesial", "Vestibular", "Distal");
            
            ApplicationContext.odontogramaData.setValues();
            ApplicationContext.registroOdontograma.setVisible(true);
        }
    }
    
    private void addPaintLabels() {
        PAINT_LABELS.add(upLabel);
        PAINT_LABELS.add(rightLabel);
        PAINT_LABELS.add(downLabel);
        PAINT_LABELS.add(leftLabel);
    }
    
    private void paintCenter(Color color) {
        center.setkStartColor(color);
        center.setkStartColor(color);
        center.repaint();
    }
    
    private void paintBorderCenter() {
        centerBorder.setkStartColor(Color.BLACK);
        centerBorder.setkEndColor(Color.BLACK);
        centerBorder.repaint();
    }
    
    public void setNumPieza(int numPieza) {
        this.numPieza = numPieza;
    }

    public int getNumPieza() {
        return numPieza;
    }

    public JLabel getDownLabel() {
        return downLabel;
    }

    public JLabel getLeftLabel() {
        return leftLabel;
    }

    public JLabel getRightLabel() {
        return rightLabel;
    }

    public JLabel getUpLabel() {
        return upLabel;
    }
    
    public void clickedEvent(String side, int num, int num2) {
        setColorValues(side, num);
        setCorona(num);
        setCrossValues(num, num2);
    }
    
    public void centerClickedEvent() {
        nullIcons();
        
        if (getOdontogramaState(OdontogramaSelection.CARIES_DENTAL)) {
            paintCenter(StateColors.getDanger());
            paintBorderCenter();
        } else if (getOdontogramaState(OdontogramaSelection.OBTURACION_BUEN_ESTADO)) {
            paintCenter(StateColors.getInfo());
            paintBorderCenter();
        } else if (getOdontogramaState(OdontogramaSelection.OBTURACION_MAL_ESTADO)) {
            Tools.setImage(smIcon, "src/com/images/odontogram/double.png", 0, 0);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        diente = new javax.swing.JPanel();
        left = new javax.swing.JPanel();
        right = new javax.swing.JPanel();
        center = new com.k33ptoo.components.KGradientPanel();
        centerBorder = new com.k33ptoo.components.KGradientPanel();
        smIcon = new javax.swing.JLabel();
        up = new javax.swing.JPanel();
        down = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        largeIcon = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        upLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        downLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        rightLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        leftLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        background = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(66, 66));
        setMinimumSize(new java.awt.Dimension(66, 66));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(66, 66));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        diente.setMaximumSize(new java.awt.Dimension(66, 66));
        diente.setMinimumSize(new java.awt.Dimension(66, 66));
        diente.setOpaque(false);
        diente.setPreferredSize(new java.awt.Dimension(66, 66));
        diente.setLayout(new java.awt.BorderLayout());

        left.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        left.setMinimumSize(new java.awt.Dimension(21, 100));
        left.setOpaque(false);
        left.setPreferredSize(new java.awt.Dimension(21, 66));
        left.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leftMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout leftLayout = new javax.swing.GroupLayout(left);
        left.setLayout(leftLayout);
        leftLayout.setHorizontalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        leftLayout.setVerticalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        diente.add(left, java.awt.BorderLayout.LINE_START);

        right.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        right.setMinimumSize(new java.awt.Dimension(16, 0));
        right.setOpaque(false);
        right.setPreferredSize(new java.awt.Dimension(16, 0));
        right.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rightMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout rightLayout = new javax.swing.GroupLayout(right);
        right.setLayout(rightLayout);
        rightLayout.setHorizontalGroup(
            rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        rightLayout.setVerticalGroup(
            rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        diente.add(right, java.awt.BorderLayout.LINE_END);

        center.setkBorderRadius(150);
        center.setkEndColor(new java.awt.Color(255, 255, 255));
        center.setkStartColor(new java.awt.Color(255, 255, 255));
        center.setOpaque(false);
        center.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                centerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                centerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                centerMouseExited(evt);
            }
        });
        center.setLayout(new java.awt.BorderLayout());

        centerBorder.setBackground(new java.awt.Color(255, 255, 255));
        centerBorder.setkBorderRadius(150);
        centerBorder.setkEndColor(new java.awt.Color(0, 0, 0));
        centerBorder.setkFillBackground(false);
        centerBorder.setkStartColor(new java.awt.Color(0, 0, 0));
        centerBorder.setOpaque(false);
        centerBorder.setLayout(new java.awt.BorderLayout());

        smIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        centerBorder.add(smIcon, java.awt.BorderLayout.CENTER);

        center.add(centerBorder, java.awt.BorderLayout.CENTER);

        diente.add(center, java.awt.BorderLayout.CENTER);

        up.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        up.setMinimumSize(new java.awt.Dimension(61, 21));
        up.setOpaque(false);
        up.setPreferredSize(new java.awt.Dimension(66, 21));
        up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout upLayout = new javax.swing.GroupLayout(up);
        up.setLayout(upLayout);
        upLayout.setHorizontalGroup(
            upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );
        upLayout.setVerticalGroup(
            upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        diente.add(up, java.awt.BorderLayout.PAGE_START);

        down.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        down.setMinimumSize(new java.awt.Dimension(61, 16));
        down.setOpaque(false);
        down.setPreferredSize(new java.awt.Dimension(66, 16));
        down.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                downMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout downLayout = new javax.swing.GroupLayout(down);
        down.setLayout(downLayout);
        downLayout.setHorizontalGroup(
            downLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );
        downLayout.setVerticalGroup(
            downLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        diente.add(down, java.awt.BorderLayout.PAGE_END);

        add(diente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel6.setMaximumSize(new java.awt.Dimension(66, 66));
        jPanel6.setMinimumSize(new java.awt.Dimension(66, 66));
        jPanel6.setOpaque(false);

        largeIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        largeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                largeIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(largeIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(largeIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
        );

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        jPanel1.setMaximumSize(new java.awt.Dimension(66, 66));
        jPanel1.setMinimumSize(new java.awt.Dimension(66, 66));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(66, 66));

        upLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(upLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(upLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        jPanel2.setMaximumSize(new java.awt.Dimension(66, 66));
        jPanel2.setMinimumSize(new java.awt.Dimension(66, 66));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(66, 66));

        downLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(downLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(downLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        jPanel3.setMaximumSize(new java.awt.Dimension(66, 66));
        jPanel3.setMinimumSize(new java.awt.Dimension(66, 66));
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(66, 66));

        rightLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(rightLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(rightLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        jPanel4.setMaximumSize(new java.awt.Dimension(66, 66));
        jPanel4.setMinimumSize(new java.awt.Dimension(66, 66));
        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(66, 66));

        leftLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(leftLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(leftLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        jPanel5.setMaximumSize(new java.awt.Dimension(66, 66));
        jPanel5.setMinimumSize(new java.awt.Dimension(66, 66));
        jPanel5.setOpaque(false);

        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
        );

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void upMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upMouseClicked
        OdontogramaContext.setSelectedSide("up");
        odontogramaData("up");
    }//GEN-LAST:event_upMouseClicked

    private void centerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_centerMouseClicked
        OdontogramaContext.setSelectedSide("center");
        OdontogramaContext.setDienteOdontogramaModel(new DienteOdontogramaModel());
        OdontogramaContext.getDienteOdontogramaModel().setPieza("Pieza " + numPieza);
        OdontogramaContext.getDienteOdontogramaModel().setCara("Oclusal");
        ApplicationContext.odontogramaData.setValues();
        ApplicationContext.registroOdontograma.setVisible(true);
    }//GEN-LAST:event_centerMouseClicked

    private void rightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rightMouseClicked
        OdontogramaContext.setSelectedSide("right");
        odontogramaData("right");
    }//GEN-LAST:event_rightMouseClicked

    private void downMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_downMouseClicked
        OdontogramaContext.setSelectedSide("down");
        odontogramaData("down");
    }//GEN-LAST:event_downMouseClicked

    private void leftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftMouseClicked
        OdontogramaContext.setSelectedSide("left");
        odontogramaData("left");
    }//GEN-LAST:event_leftMouseClicked

    private void centerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_centerMouseEntered

    }//GEN-LAST:event_centerMouseEntered

    private void centerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_centerMouseExited

    }//GEN-LAST:event_centerMouseExited

    private void largeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_largeIconMouseClicked

    }//GEN-LAST:event_largeIconMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private com.k33ptoo.components.KGradientPanel center;
    private com.k33ptoo.components.KGradientPanel centerBorder;
    private javax.swing.JPanel diente;
    private javax.swing.JPanel down;
    private javax.swing.JLabel downLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel largeIcon;
    private javax.swing.JPanel left;
    private javax.swing.JLabel leftLabel;
    private javax.swing.JPanel right;
    private javax.swing.JLabel rightLabel;
    private javax.swing.JLabel smIcon;
    private javax.swing.JPanel up;
    private javax.swing.JLabel upLabel;
    // End of variables declaration//GEN-END:variables
}
