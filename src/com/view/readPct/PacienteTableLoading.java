package com.view.readPct;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.utils.CustomScrollBar;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 18/09/22
 */
public class PacienteTableLoading extends javax.swing.JPanel {
    
    /**
     * Creates new form listPacients
     */
    public PacienteTableLoading() {
        initComponents();
        ApplicationContext.pacienteLoadingTarget.clear();
        targets.removeAll();
        
        scrollPanel.setVerticalScrollBar(new CustomScrollBar());
        scrollPanel.getVerticalScrollBar().setUnitIncrement(35);
        
        for (int i = 0; i < 10; i++) {
            ApplicationContext.pacienteLoadingTarget.add(new PacienteLoadingTarget());
        }
        
        ApplicationContext.pacienteLoadingTarget.forEach(target -> {
            targets.add(target);
        });
    }
    
    public void colorComponent() {
        color.setBackground(ChoosedPalette.getPrimaryBackground());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        scrollPanel = new javax.swing.JScrollPane();
        color = new javax.swing.JPanel();
        targets = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(100, 100));
        setPreferredSize(new java.awt.Dimension(100, 100));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(0, 100));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 100));
        jPanel1.setLayout(new java.awt.BorderLayout());

        scrollPanel.setBackground(new java.awt.Color(255, 255, 255));
        scrollPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        scrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPanel.setOpaque(false);

        color.setBackground(new java.awt.Color(255, 255, 255));

        targets.setOpaque(false);
        targets.setLayout(new javax.swing.BoxLayout(targets, javax.swing.BoxLayout.Y_AXIS));

        javax.swing.GroupLayout colorLayout = new javax.swing.GroupLayout(color);
        color.setLayout(colorLayout);
        colorLayout.setHorizontalGroup(
            colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(targets, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
        );
        colorLayout.setVerticalGroup(
            colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorLayout.createSequentialGroup()
                .addComponent(targets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 538, Short.MAX_VALUE))
        );

        scrollPanel.setViewportView(color);

        jPanel1.add(scrollPanel, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel color;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JPanel targets;
    // End of variables declaration//GEN-END:variables
}
