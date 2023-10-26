package com.view.dashboard;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.helper.ActividadHelper;
import com.utils.CustomScrollBar;
import com.utils.Tools;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 26/09/22
 */
public class ActividadTable extends javax.swing.JPanel {
    
    /**
     * Creates new form listPacients
     */
    public ActividadTable() {
        initComponents();
        styles();
        setData();
    }
    
    public void setData() {
        targets.removeAll();
        ApplicationContext.actividadRecienteTargets.clear();
        ApplicationContext.actividadesListadas.clear();
        
        ApplicationContext.actividadesListadas = ActividadHelper.listarActividad();
        
        if (!ApplicationContext.actividadesListadas.isEmpty()) {
            ApplicationContext.actividadesListadas.forEach(actividad -> {
                ApplicationContext.actividadRecienteTargets.add(new ActividadTarget(actividad.getNombres(), actividad.getMensajeActividad(),
                actividad.getDiaActividad() + "/" + actividad.getMesActividad() + "/" + actividad.getAnnioActividad() + " " + actividad.getHoraActividad()));
            });
        }
        
        ApplicationContext.actividadRecienteTargets.forEach(target -> {
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
