package com.view.viewOdontograma;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.utils.Styles;
import com.utils.Tools;

/**
 *
 * @author Daniel Batres
 */
public class OdontogramaTable extends Styles {

    /**
     * Creates new form OdontogramaTable
     */
    public OdontogramaTable() {
        initComponents();
        Tools.setScroll(scroll);
        container.add(ApplicationContext.odontograma);
    }
    
    @Override
    public void colorBasics() {
        content.setBackground(ChoosedPalette.getPrimaryBackground());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        content = new javax.swing.JPanel();
        container = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(0, 10));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(400, 10));
        setLayout(new java.awt.BorderLayout());

        scroll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        container.setOpaque(false);
        container.setLayout(new javax.swing.BoxLayout(container, javax.swing.BoxLayout.Y_AXIS));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 74, Short.MAX_VALUE))
        );

        scroll.setViewportView(content);

        add(scroll, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container;
    private javax.swing.JPanel content;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
