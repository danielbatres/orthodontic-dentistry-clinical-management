package com.view.appointmentsView;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.helper.ConsultasHelper;
import com.utils.CustomScrollBar;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 16/09/22
 */
public class AgendasTable extends javax.swing.JPanel {
 
    /**
     * Creates new form AgendasTable
     */
    public AgendasTable() {
        initComponents();
        
        scrollPanel.setVerticalScrollBar(new CustomScrollBar());
        scrollPanel.getVerticalScrollBar().setUnitIncrement(35);
    }
    
    public void listTargets() {
        targets.removeAll();
        ApplicationContext.agendasTargets.clear();
        ApplicationContext.consultasListadas = ConsultasHelper.getConsultas();
        
        ApplicationContext.consultasListadas.forEach(consulta -> {
            ApplicationContext.agendasTargets.add(new AppointmentTarget(consulta));
        });
        
        ApplicationContext.agendasTargets.forEach(target -> {
            targets.add(target);
        });
    }
    
    public void listTargetsBy(int dia, int mes, int annio, String like) {
        targets.removeAll();
        ApplicationContext.agendasTargets.clear();
        ApplicationContext.consultasListadas = ConsultasHelper.obtenerConsultasPorFecha(dia, mes, annio, like);
        
        ApplicationContext.consultasListadas.forEach(consulta -> {
            ApplicationContext.agendasTargets.add(new AppointmentTarget(consulta));
        });
        
        ApplicationContext.agendasTargets.forEach(target -> {
            targets.add(target);
        });
        
        ApplicationContext.agendasTargets.forEach(target -> target.colorComponent(ApplicationContext.selectedAppereance));
    }
    
    public void colorComponent() {
        content.setBackground(ChoosedPalette.getPrimaryBackground());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPanel = new javax.swing.JScrollPane();
        content = new javax.swing.JPanel();
        targets = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(683, 100));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(683, 100));
        setLayout(new java.awt.BorderLayout());

        scrollPanel.setBackground(new java.awt.Color(255, 255, 255));
        scrollPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        scrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPanel.setOpaque(false);

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setPreferredSize(new java.awt.Dimension(0, 100));

        targets.setOpaque(false);
        targets.setLayout(new javax.swing.BoxLayout(targets, javax.swing.BoxLayout.Y_AXIS));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(targets, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addComponent(targets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 100, Short.MAX_VALUE))
        );

        scrollPanel.setViewportView(content);

        add(scrollPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JPanel targets;
    // End of variables declaration//GEN-END:variables
}
