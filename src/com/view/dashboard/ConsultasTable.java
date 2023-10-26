package com.view.dashboard;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.helper.ConsultasHelper;
import com.model.ConsultaModel;
import com.utils.CustomScrollBar;
import com.utils.Tools;
import javax.swing.SwingUtilities;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 18/09/22
 */
public class ConsultasTable extends javax.swing.JPanel {
    
    /**
     * Creates new form listPacients
     */
    public ConsultasTable() {
        initComponents();
        styles();
    }
    
    public void addTargets() {
        color.removeAll();
        ApplicationContext.consultasTargetsDashboard.clear();
        ApplicationContext.consultasListadas.clear();
        ApplicationContext.consultasListadas = ConsultasHelper.getConsultas();
        
        for (ConsultaModel consulta : ApplicationContext.consultasListadas) {
            if (consulta.isConsultaRealizada()) {
                continue;
            }
            ApplicationContext.consultasTargetsDashboard.add(new ConsultaTarget(consulta));
        }
        
        ApplicationContext.consultasTargetsDashboard.forEach(target -> {
            color.add(target);
        });
        
        SwingUtilities.updateComponentTreeUI(this);
    }
    
    public void styles() {
        Tools.setScroll(scrollPanel);
    }
    
    public void colorComponent() {
        color.setBackground(ChoosedPalette.getPrimaryBackground());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPanel = new javax.swing.JScrollPane();
        color = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(100, 100));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(289, 100));
        setLayout(new java.awt.BorderLayout());

        scrollPanel.setBackground(new java.awt.Color(255, 255, 255));
        scrollPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        scrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPanel.setMinimumSize(new java.awt.Dimension(280, 200));
        scrollPanel.setOpaque(false);

        color.setBackground(new java.awt.Color(255, 255, 255));
        color.setMaximumSize(new java.awt.Dimension(123123, 123123));
        color.setPreferredSize(new java.awt.Dimension(0, 900));
        color.setLayout(new javax.swing.BoxLayout(color, javax.swing.BoxLayout.Y_AXIS));
        scrollPanel.setViewportView(color);

        add(scrollPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel color;
    private javax.swing.JScrollPane scrollPanel;
    // End of variables declaration//GEN-END:variables
}
