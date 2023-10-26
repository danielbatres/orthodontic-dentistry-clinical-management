package com.view.viewOdontograma;

import com.model.DienteOdontogramaModel;
import com.utils.Tools;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Daniel Batres
 */
public class OdontogramaAdulto extends javax.swing.JPanel {
    private final ArrayList<JPanel> DIENTES_ARRIBA_PANELES= new ArrayList<>();
    private final ArrayList<JPanel> DIENTES_ABAJO_PANELES = new ArrayList<>();
    private final ArrayList<DienteArriba> DIENTES_ARRIBA = new ArrayList<>();
    private final ArrayList<DienteAbajo> DIENTES_ABAJO = new ArrayList<>();
    
    /**
     * Creates new form OdontogramaAdulto
     */
    public OdontogramaAdulto() {
        initComponents();
        addDientesArriba();
        addDientesAbajo();
        
        addPanels(DIENTES_ARRIBA_PANELES, 11, 18, "arriba");
        addPanels(DIENTES_ABAJO_PANELES, 31, 38, "abajo");
    }
    
    public void addValuesTargets() {
        DIENTES_ARRIBA_PANELES.clear();
        DIENTES_ABAJO_PANELES.clear();
        DIENTES_ARRIBA.clear();
        DIENTES_ABAJO.clear();
        
        addDientesArriba();
        addDientesAbajo();
        
        addPanels(DIENTES_ARRIBA_PANELES, 11, 18, "arriba");
        addPanels(DIENTES_ABAJO_PANELES, 31, 38, "abajo");
    }
    
    private void addPanels(ArrayList<JPanel> paneles, int num, int breakPoint, String type) {
        for (int i = 0; i < 16; i++) {
            
            JPanel diente = paneles.get(i);
            DienteArriba dienteArriba = new DienteArriba();
            DienteAbajo dienteAbajo = new DienteAbajo();
            
            if (type.equals("arriba")) {
                Tools.showPanel(diente, dienteArriba, 0, 0);
                dienteArriba.setValuesByNum(num);
                DIENTES_ARRIBA.add(dienteArriba);
            } else {
                Tools.showPanel(diente, dienteAbajo, 0, 0);
                dienteAbajo.setValuesByNum(num);
                DIENTES_ABAJO.add(dienteAbajo);
            }
            
            if (num == breakPoint) {
                num += 3;
            } else {
                num++;
            }
        }
    }
    
    public void addValues(DienteOdontogramaModel diente) {
        DIENTES_ABAJO.forEach(abajo -> {
            abajo.setValuesByModel(diente);
        });
        
        DIENTES_ARRIBA.forEach(arriba -> {
            arriba.setValuesByModel(diente);
        });
    }
    
    private void addDientesArriba() {
        DIENTES_ARRIBA_PANELES.add(d11);
        DIENTES_ARRIBA_PANELES.add(d12);
        DIENTES_ARRIBA_PANELES.add(d13);
        DIENTES_ARRIBA_PANELES.add(d14);
        DIENTES_ARRIBA_PANELES.add(d15);
        DIENTES_ARRIBA_PANELES.add(d16);
        DIENTES_ARRIBA_PANELES.add(d17);
        DIENTES_ARRIBA_PANELES.add(d18);
        DIENTES_ARRIBA_PANELES.add(d21);
        DIENTES_ARRIBA_PANELES.add(d22);
        DIENTES_ARRIBA_PANELES.add(d23);
        DIENTES_ARRIBA_PANELES.add(d24);
        DIENTES_ARRIBA_PANELES.add(d25);
        DIENTES_ARRIBA_PANELES.add(d26);
        DIENTES_ARRIBA_PANELES.add(d27);
        DIENTES_ARRIBA_PANELES.add(d28);
    }
    
    private void addDientesAbajo() {
        DIENTES_ABAJO_PANELES.add(d31);
        DIENTES_ABAJO_PANELES.add(d32);
        DIENTES_ABAJO_PANELES.add(d33);
        DIENTES_ABAJO_PANELES.add(d34);
        DIENTES_ABAJO_PANELES.add(d35);
        DIENTES_ABAJO_PANELES.add(d36);
        DIENTES_ABAJO_PANELES.add(d37);
        DIENTES_ABAJO_PANELES.add(d38);
        DIENTES_ABAJO_PANELES.add(d41);
        DIENTES_ABAJO_PANELES.add(d42);
        DIENTES_ABAJO_PANELES.add(d43);
        DIENTES_ABAJO_PANELES.add(d44);
        DIENTES_ABAJO_PANELES.add(d45);
        DIENTES_ABAJO_PANELES.add(d46);
        DIENTES_ABAJO_PANELES.add(d47);
        DIENTES_ABAJO_PANELES.add(d48);
    }

    public ArrayList<DienteArriba> getDIENTES_ARRIBA() {
        return DIENTES_ARRIBA;
    }

    public ArrayList<DienteAbajo> getDIENTES_ABAJO() {
        return DIENTES_ABAJO;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        d18 = new javax.swing.JPanel();
        d17 = new javax.swing.JPanel();
        d16 = new javax.swing.JPanel();
        d15 = new javax.swing.JPanel();
        d14 = new javax.swing.JPanel();
        d13 = new javax.swing.JPanel();
        d12 = new javax.swing.JPanel();
        d11 = new javax.swing.JPanel();
        d48 = new javax.swing.JPanel();
        d47 = new javax.swing.JPanel();
        d46 = new javax.swing.JPanel();
        d45 = new javax.swing.JPanel();
        d44 = new javax.swing.JPanel();
        d43 = new javax.swing.JPanel();
        d42 = new javax.swing.JPanel();
        d41 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        d21 = new javax.swing.JPanel();
        d22 = new javax.swing.JPanel();
        d23 = new javax.swing.JPanel();
        d24 = new javax.swing.JPanel();
        d25 = new javax.swing.JPanel();
        d26 = new javax.swing.JPanel();
        d27 = new javax.swing.JPanel();
        d28 = new javax.swing.JPanel();
        d31 = new javax.swing.JPanel();
        d32 = new javax.swing.JPanel();
        d33 = new javax.swing.JPanel();
        d34 = new javax.swing.JPanel();
        d35 = new javax.swing.JPanel();
        d36 = new javax.swing.JPanel();
        d37 = new javax.swing.JPanel();
        d38 = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(1250, 250));
        setMinimumSize(new java.awt.Dimension(1250, 250));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1250, 250));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(2, 8));

        d18.setMinimumSize(new java.awt.Dimension(76, 125));
        d18.setOpaque(false);
        d18.setLayout(new java.awt.GridLayout(1, 0));
        jPanel1.add(d18);

        d17.setMinimumSize(new java.awt.Dimension(76, 125));
        d17.setOpaque(false);
        d17.setLayout(new java.awt.GridLayout(1, 0));
        jPanel1.add(d17);

        d16.setMinimumSize(new java.awt.Dimension(76, 125));
        d16.setOpaque(false);
        d16.setLayout(new java.awt.GridLayout(1, 0));
        jPanel1.add(d16);

        d15.setMinimumSize(new java.awt.Dimension(76, 125));
        d15.setOpaque(false);
        d15.setLayout(new java.awt.GridLayout(1, 0));
        jPanel1.add(d15);

        d14.setMinimumSize(new java.awt.Dimension(76, 125));
        d14.setOpaque(false);
        d14.setLayout(new java.awt.GridLayout(1, 0));
        jPanel1.add(d14);

        d13.setMinimumSize(new java.awt.Dimension(76, 125));
        d13.setOpaque(false);
        d13.setLayout(new java.awt.GridLayout(1, 0));
        jPanel1.add(d13);

        d12.setMinimumSize(new java.awt.Dimension(76, 125));
        d12.setOpaque(false);
        d12.setLayout(new java.awt.GridLayout(1, 0));
        jPanel1.add(d12);

        d11.setMinimumSize(new java.awt.Dimension(76, 125));
        d11.setOpaque(false);
        d11.setLayout(new java.awt.GridLayout(1, 0));
        jPanel1.add(d11);

        d48.setMinimumSize(new java.awt.Dimension(76, 125));
        d48.setOpaque(false);
        d48.setLayout(new java.awt.GridLayout(1, 0));
        jPanel1.add(d48);

        d47.setMinimumSize(new java.awt.Dimension(76, 125));
        d47.setOpaque(false);
        d47.setLayout(new java.awt.GridLayout(1, 0));
        jPanel1.add(d47);

        d46.setMinimumSize(new java.awt.Dimension(76, 125));
        d46.setOpaque(false);
        d46.setLayout(new java.awt.GridLayout(1, 0));
        jPanel1.add(d46);

        d45.setMinimumSize(new java.awt.Dimension(76, 125));
        d45.setOpaque(false);
        d45.setLayout(new java.awt.GridLayout(1, 0));
        jPanel1.add(d45);

        d44.setMinimumSize(new java.awt.Dimension(76, 125));
        d44.setOpaque(false);
        d44.setLayout(new java.awt.GridLayout(1, 0));
        jPanel1.add(d44);

        d43.setMinimumSize(new java.awt.Dimension(76, 125));
        d43.setOpaque(false);
        d43.setLayout(new java.awt.GridLayout(1, 0));
        jPanel1.add(d43);

        d42.setMinimumSize(new java.awt.Dimension(76, 125));
        d42.setOpaque(false);
        d42.setLayout(new java.awt.GridLayout(1, 0));
        jPanel1.add(d42);

        d41.setMinimumSize(new java.awt.Dimension(76, 125));
        d41.setOpaque(false);
        d41.setLayout(new java.awt.GridLayout(1, 0));
        jPanel1.add(d41);

        add(jPanel1);

        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(15, 250));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        add(jPanel3);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(2, 8));

        d21.setMinimumSize(new java.awt.Dimension(76, 125));
        d21.setOpaque(false);
        d21.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(d21);

        d22.setMinimumSize(new java.awt.Dimension(76, 125));
        d22.setOpaque(false);
        d22.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(d22);

        d23.setMinimumSize(new java.awt.Dimension(76, 125));
        d23.setOpaque(false);
        d23.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(d23);

        d24.setMinimumSize(new java.awt.Dimension(76, 125));
        d24.setOpaque(false);
        d24.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(d24);

        d25.setMinimumSize(new java.awt.Dimension(76, 125));
        d25.setOpaque(false);
        d25.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(d25);

        d26.setMinimumSize(new java.awt.Dimension(76, 125));
        d26.setOpaque(false);
        d26.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(d26);

        d27.setMinimumSize(new java.awt.Dimension(76, 125));
        d27.setOpaque(false);
        d27.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(d27);

        d28.setMinimumSize(new java.awt.Dimension(76, 125));
        d28.setOpaque(false);
        d28.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(d28);

        d31.setMinimumSize(new java.awt.Dimension(76, 125));
        d31.setOpaque(false);
        d31.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(d31);

        d32.setMinimumSize(new java.awt.Dimension(76, 125));
        d32.setOpaque(false);
        d32.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(d32);

        d33.setMinimumSize(new java.awt.Dimension(76, 125));
        d33.setOpaque(false);
        d33.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(d33);

        d34.setMinimumSize(new java.awt.Dimension(76, 125));
        d34.setOpaque(false);
        d34.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(d34);

        d35.setMinimumSize(new java.awt.Dimension(76, 125));
        d35.setOpaque(false);
        d35.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(d35);

        d36.setMinimumSize(new java.awt.Dimension(76, 125));
        d36.setOpaque(false);
        d36.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(d36);

        d37.setMinimumSize(new java.awt.Dimension(76, 125));
        d37.setOpaque(false);
        d37.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(d37);

        d38.setMinimumSize(new java.awt.Dimension(76, 125));
        d38.setOpaque(false);
        d38.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(d38);

        add(jPanel2);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel d11;
    private javax.swing.JPanel d12;
    private javax.swing.JPanel d13;
    private javax.swing.JPanel d14;
    private javax.swing.JPanel d15;
    private javax.swing.JPanel d16;
    private javax.swing.JPanel d17;
    private javax.swing.JPanel d18;
    private javax.swing.JPanel d21;
    private javax.swing.JPanel d22;
    private javax.swing.JPanel d23;
    private javax.swing.JPanel d24;
    private javax.swing.JPanel d25;
    private javax.swing.JPanel d26;
    private javax.swing.JPanel d27;
    private javax.swing.JPanel d28;
    private javax.swing.JPanel d31;
    private javax.swing.JPanel d32;
    private javax.swing.JPanel d33;
    private javax.swing.JPanel d34;
    private javax.swing.JPanel d35;
    private javax.swing.JPanel d36;
    private javax.swing.JPanel d37;
    private javax.swing.JPanel d38;
    private javax.swing.JPanel d41;
    private javax.swing.JPanel d42;
    private javax.swing.JPanel d43;
    private javax.swing.JPanel d44;
    private javax.swing.JPanel d45;
    private javax.swing.JPanel d46;
    private javax.swing.JPanel d47;
    private javax.swing.JPanel d48;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
