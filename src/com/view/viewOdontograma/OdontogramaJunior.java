package com.view.viewOdontograma;

import com.model.DienteOdontogramaModel;
import com.utils.Tools;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author danie
 */
public class OdontogramaJunior extends javax.swing.JPanel {
    private final ArrayList<JPanel> DIENTES_ARRIBA_PANELES= new ArrayList<>();
    private final ArrayList<JPanel> DIENTES_ABAJO_PANELES = new ArrayList<>();
    private final ArrayList<DienteArriba> DIENTES_ARRIBA = new ArrayList<>();
    private final ArrayList<DienteAbajo> DIENTES_ABAJO = new ArrayList<>();
    
    /**
     * Creates new form OdontogramaJunior
     */
    public OdontogramaJunior() {
        initComponents();
        addDientesArriba();
        addDientesAbajo();
        
        addPanels(DIENTES_ARRIBA_PANELES, 51, 55, "arriba");
        addPanels(DIENTES_ABAJO_PANELES, 71, 75, "abajo");
    }
    
    public void addValuesTargets() {
        DIENTES_ARRIBA_PANELES.clear();
        DIENTES_ABAJO_PANELES.clear();
        
        addDientesArriba();
        addDientesAbajo();
        
        addPanels(DIENTES_ARRIBA_PANELES, 51, 55, "arriba");
        addPanels(DIENTES_ABAJO_PANELES, 71, 75, "abajo");
    }
    
    private void addPanels(ArrayList<JPanel> paneles, int num, int breakPoint, String type) {
        for (int i = 0; i < 10; i++) {
            
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
                num += 6;
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
        DIENTES_ARRIBA_PANELES.add(d51);
        DIENTES_ARRIBA_PANELES.add(d52);
        DIENTES_ARRIBA_PANELES.add(d53);
        DIENTES_ARRIBA_PANELES.add(d54);
        DIENTES_ARRIBA_PANELES.add(d55);
        DIENTES_ARRIBA_PANELES.add(d61);
        DIENTES_ARRIBA_PANELES.add(d62);
        DIENTES_ARRIBA_PANELES.add(d63);
        DIENTES_ARRIBA_PANELES.add(d64);
        DIENTES_ARRIBA_PANELES.add(d65);
    }
    
    private void addDientesAbajo() {
        DIENTES_ABAJO_PANELES.add(d71);
        DIENTES_ABAJO_PANELES.add(d72);
        DIENTES_ABAJO_PANELES.add(d73);
        DIENTES_ABAJO_PANELES.add(d74);
        DIENTES_ABAJO_PANELES.add(d75);
        DIENTES_ABAJO_PANELES.add(d81);
        DIENTES_ABAJO_PANELES.add(d82);
        DIENTES_ABAJO_PANELES.add(d83);
        DIENTES_ABAJO_PANELES.add(d84);
        DIENTES_ABAJO_PANELES.add(d85);
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
        jPanel2 = new javax.swing.JPanel();
        d58 = new javax.swing.JPanel();
        d57 = new javax.swing.JPanel();
        d56 = new javax.swing.JPanel();
        d55 = new javax.swing.JPanel();
        d54 = new javax.swing.JPanel();
        d53 = new javax.swing.JPanel();
        d52 = new javax.swing.JPanel();
        d51 = new javax.swing.JPanel();
        d89 = new javax.swing.JPanel();
        d87 = new javax.swing.JPanel();
        d86 = new javax.swing.JPanel();
        d85 = new javax.swing.JPanel();
        d84 = new javax.swing.JPanel();
        d83 = new javax.swing.JPanel();
        d82 = new javax.swing.JPanel();
        d81 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        d61 = new javax.swing.JPanel();
        d62 = new javax.swing.JPanel();
        d63 = new javax.swing.JPanel();
        d64 = new javax.swing.JPanel();
        d65 = new javax.swing.JPanel();
        d66 = new javax.swing.JPanel();
        d67 = new javax.swing.JPanel();
        d68 = new javax.swing.JPanel();
        d71 = new javax.swing.JPanel();
        d72 = new javax.swing.JPanel();
        d73 = new javax.swing.JPanel();
        d74 = new javax.swing.JPanel();
        d75 = new javax.swing.JPanel();
        d76 = new javax.swing.JPanel();
        d77 = new javax.swing.JPanel();
        d78 = new javax.swing.JPanel();

        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(1250, 250));
        jPanel1.setMinimumSize(new java.awt.Dimension(1250, 250));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1250, 250));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(2, 8));

        d58.setMinimumSize(new java.awt.Dimension(76, 125));
        d58.setOpaque(false);
        d58.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(d58);

        d57.setMinimumSize(new java.awt.Dimension(76, 125));
        d57.setOpaque(false);
        d57.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(d57);

        d56.setMinimumSize(new java.awt.Dimension(76, 125));
        d56.setOpaque(false);
        d56.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(d56);

        d55.setMinimumSize(new java.awt.Dimension(76, 125));
        d55.setOpaque(false);
        d55.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(d55);

        d54.setMinimumSize(new java.awt.Dimension(76, 125));
        d54.setOpaque(false);
        d54.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(d54);

        d53.setMinimumSize(new java.awt.Dimension(76, 125));
        d53.setOpaque(false);
        d53.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(d53);

        d52.setMinimumSize(new java.awt.Dimension(76, 125));
        d52.setOpaque(false);
        d52.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(d52);

        d51.setMinimumSize(new java.awt.Dimension(76, 125));
        d51.setOpaque(false);
        d51.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(d51);

        d89.setMinimumSize(new java.awt.Dimension(76, 125));
        d89.setOpaque(false);
        d89.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(d89);

        d87.setMinimumSize(new java.awt.Dimension(76, 125));
        d87.setOpaque(false);
        d87.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(d87);

        d86.setMinimumSize(new java.awt.Dimension(76, 125));
        d86.setOpaque(false);
        d86.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(d86);

        d85.setMinimumSize(new java.awt.Dimension(76, 125));
        d85.setOpaque(false);
        d85.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(d85);

        d84.setMinimumSize(new java.awt.Dimension(76, 125));
        d84.setOpaque(false);
        d84.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(d84);

        d83.setMinimumSize(new java.awt.Dimension(76, 125));
        d83.setOpaque(false);
        d83.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(d83);

        d82.setMinimumSize(new java.awt.Dimension(76, 125));
        d82.setOpaque(false);
        d82.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(d82);

        d81.setMinimumSize(new java.awt.Dimension(76, 125));
        d81.setOpaque(false);
        d81.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(d81);

        jPanel1.add(jPanel2);

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
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridLayout(2, 8));

        d61.setMinimumSize(new java.awt.Dimension(76, 125));
        d61.setOpaque(false);
        d61.setLayout(new java.awt.GridLayout(1, 0));
        jPanel4.add(d61);

        d62.setMinimumSize(new java.awt.Dimension(76, 125));
        d62.setOpaque(false);
        d62.setLayout(new java.awt.GridLayout(1, 0));
        jPanel4.add(d62);

        d63.setMinimumSize(new java.awt.Dimension(76, 125));
        d63.setOpaque(false);
        d63.setLayout(new java.awt.GridLayout(1, 0));
        jPanel4.add(d63);

        d64.setMinimumSize(new java.awt.Dimension(76, 125));
        d64.setOpaque(false);
        d64.setLayout(new java.awt.GridLayout(1, 0));
        jPanel4.add(d64);

        d65.setMinimumSize(new java.awt.Dimension(76, 125));
        d65.setOpaque(false);
        d65.setLayout(new java.awt.GridLayout(1, 0));
        jPanel4.add(d65);

        d66.setMinimumSize(new java.awt.Dimension(76, 125));
        d66.setOpaque(false);
        d66.setLayout(new java.awt.GridLayout(1, 0));
        jPanel4.add(d66);

        d67.setMinimumSize(new java.awt.Dimension(76, 125));
        d67.setOpaque(false);
        d67.setLayout(new java.awt.GridLayout(1, 0));
        jPanel4.add(d67);

        d68.setMinimumSize(new java.awt.Dimension(76, 125));
        d68.setOpaque(false);
        d68.setLayout(new java.awt.GridLayout(1, 0));
        jPanel4.add(d68);

        d71.setMinimumSize(new java.awt.Dimension(76, 125));
        d71.setOpaque(false);
        d71.setLayout(new java.awt.GridLayout(1, 0));
        jPanel4.add(d71);

        d72.setMinimumSize(new java.awt.Dimension(76, 125));
        d72.setOpaque(false);
        d72.setLayout(new java.awt.GridLayout(1, 0));
        jPanel4.add(d72);

        d73.setMinimumSize(new java.awt.Dimension(76, 125));
        d73.setOpaque(false);
        d73.setLayout(new java.awt.GridLayout(1, 0));
        jPanel4.add(d73);

        d74.setMinimumSize(new java.awt.Dimension(76, 125));
        d74.setOpaque(false);
        d74.setLayout(new java.awt.GridLayout(1, 0));
        jPanel4.add(d74);

        d75.setMinimumSize(new java.awt.Dimension(76, 125));
        d75.setOpaque(false);
        d75.setLayout(new java.awt.GridLayout(1, 0));
        jPanel4.add(d75);

        d76.setMinimumSize(new java.awt.Dimension(76, 125));
        d76.setOpaque(false);
        d76.setLayout(new java.awt.GridLayout(1, 0));
        jPanel4.add(d76);

        d77.setMinimumSize(new java.awt.Dimension(76, 125));
        d77.setOpaque(false);
        d77.setLayout(new java.awt.GridLayout(1, 0));
        jPanel4.add(d77);

        d78.setMinimumSize(new java.awt.Dimension(76, 125));
        d78.setOpaque(false);
        d78.setLayout(new java.awt.GridLayout(1, 0));
        jPanel4.add(d78);

        jPanel1.add(jPanel4);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel d51;
    private javax.swing.JPanel d52;
    private javax.swing.JPanel d53;
    private javax.swing.JPanel d54;
    private javax.swing.JPanel d55;
    private javax.swing.JPanel d56;
    private javax.swing.JPanel d57;
    private javax.swing.JPanel d58;
    private javax.swing.JPanel d61;
    private javax.swing.JPanel d62;
    private javax.swing.JPanel d63;
    private javax.swing.JPanel d64;
    private javax.swing.JPanel d65;
    private javax.swing.JPanel d66;
    private javax.swing.JPanel d67;
    private javax.swing.JPanel d68;
    private javax.swing.JPanel d71;
    private javax.swing.JPanel d72;
    private javax.swing.JPanel d73;
    private javax.swing.JPanel d74;
    private javax.swing.JPanel d75;
    private javax.swing.JPanel d76;
    private javax.swing.JPanel d77;
    private javax.swing.JPanel d78;
    private javax.swing.JPanel d81;
    private javax.swing.JPanel d82;
    private javax.swing.JPanel d83;
    private javax.swing.JPanel d84;
    private javax.swing.JPanel d85;
    private javax.swing.JPanel d86;
    private javax.swing.JPanel d87;
    private javax.swing.JPanel d89;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
