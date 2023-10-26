package com.view.readPct;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.model.ConsultaModel;
import com.utils.Styles;
import com.utils.Tools;

/**
 *
 * @author Daniel Batres
 */
public class AgendaGeneral extends Styles {

    /**
     * Creates new form AgendaGeneral
     */
    public AgendaGeneral() {
        initComponents();
    }
    
    @Override
    public void colorBasics() {
        content.setBackground(ChoosedPalette.getSecondaryBackground());
        Tools.setScroll(scroll);
    }
    
    public void addTargets() {
        targets.removeAll();
        ApplicationContext.agendaGeneralTargets.clear();
        
        for (ConsultaModel consulta : ApplicationContext.consultasPacienteListadas) {
            if (consulta.isConsultaRealizada()) {
                continue;
            }
            ApplicationContext.agendaGeneralTargets.add(new AgendaGeneralTarget(consulta));
        }
        
        ApplicationContext.agendaGeneralTargets.forEach(target -> {
            targets.add(target);
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        content = new javax.swing.JPanel();
        targets = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(400, 291));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(400, 291));
        setLayout(new java.awt.BorderLayout());

        scroll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        scroll.setOpaque(false);

        content.setBackground(new java.awt.Color(255, 255, 255));

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
                .addGap(0, 291, Short.MAX_VALUE))
        );

        scroll.setViewportView(content);

        add(scroll, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JPanel targets;
    // End of variables declaration//GEN-END:variables
}
