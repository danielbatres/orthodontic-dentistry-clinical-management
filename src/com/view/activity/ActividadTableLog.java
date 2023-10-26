package com.view.activity;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.utils.CustomScrollBar;
import javax.swing.SwingUtilities;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 16/09/22
 */
public class ActividadTableLog extends javax.swing.JPanel {
 
    /**
     * Creates new form ActivityTable
     */
    public ActividadTableLog() {
        initComponents();
        
        scrollPanel.setVerticalScrollBar(new CustomScrollBar());
        scrollPanel.getVerticalScrollBar().setUnitIncrement(35);
    }
    
    public void listTargets() {
        targets.removeAll();
        ApplicationContext.actividadTargetsLog.clear();
        
        ApplicationContext.actividadesListadas.forEach(actividad -> {
            ApplicationContext.actividadTargetsLog.add(new ActividadTargetLog(actividad));
        });
        
        ApplicationContext.actividadTargetsLog.forEach(target -> {
            targets.add(target);
        });
        
        SwingUtilities.updateComponentTreeUI(targets);
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

        setMinimumSize(new java.awt.Dimension(0, 0));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(0, 0));
        setLayout(new java.awt.BorderLayout());

        scrollPanel.setBackground(new java.awt.Color(255, 255, 255));
        scrollPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        scrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPanel.setMinimumSize(new java.awt.Dimension(17, 500));
        scrollPanel.setOpaque(false);
        scrollPanel.setPreferredSize(new java.awt.Dimension(0, 0));

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setPreferredSize(new java.awt.Dimension(0, 100000));

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
                .addGap(0, 10000, Short.MAX_VALUE))
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
