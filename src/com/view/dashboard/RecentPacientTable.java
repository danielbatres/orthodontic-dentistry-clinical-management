package com.view.dashboard;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.model.PacienteModel;
import com.utils.CustomScrollBar;
import com.utils.Tools;
import java.util.ArrayList;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 26/09/22
 */
public class RecentPacientTable extends javax.swing.JPanel {
    
    /**
     * Creates new form listPacients
     */
    public RecentPacientTable() {
        initComponents();
        styles();
    }
    
    public void listPacients(ArrayList<PacienteModel> pacientes) {
        ApplicationContext.recentPacientsTargets.clear();
        targets.removeAll();
        
        for (int i = 0; i < pacientes.size(); i++) {
            if (!pacientes.get(i).getEstadoDeActividad().equals("inactivo")) {
                ApplicationContext.recentPacientsTargets.add(new RecentPacientTarget(pacientes.get(i)));
            }
            
            if (i == 10) break; 
        }
        
        ApplicationContext.recentPacientsTargets.forEach(target -> {
            targets.add(target);
        });
    }
    
    private void styles() {
        Tools.setScroll(scrollPanel);
    }
    
    public void colorComponent() {
        targets.setBackground(ChoosedPalette.getPrimaryBackground());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        scrollPanel = new javax.swing.JScrollPane();
        targets = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(100, 100));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(0, 0));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(0, 100));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 100));
        jPanel1.setLayout(new java.awt.BorderLayout());

        scrollPanel.setBackground(new java.awt.Color(255, 255, 255));
        scrollPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        scrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPanel.setOpaque(false);

        targets.setBackground(new java.awt.Color(255, 255, 255));
        targets.setMaximumSize(new java.awt.Dimension(12341234, 12341234));
        targets.setPreferredSize(new java.awt.Dimension(100, 1000));
        targets.setLayout(new javax.swing.BoxLayout(targets, javax.swing.BoxLayout.Y_AXIS));
        scrollPanel.setViewportView(targets);

        jPanel1.add(scrollPanel, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JPanel targets;
    // End of variables declaration//GEN-END:variables
}
