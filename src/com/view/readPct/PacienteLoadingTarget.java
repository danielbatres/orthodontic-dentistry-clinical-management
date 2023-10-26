package com.view.readPct;

import com.context.ChoosedPalette;
import com.utils.Styles;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 18/09/22
 */
public class PacienteLoadingTarget extends Styles {

    /**
     * Creates new form PacienteTarget
     */
    public PacienteLoadingTarget() {
        initComponents();
        styleMyComponentBaby();
    }
    
    @Override
    public void addTitlesAndSubtitles() {
    }

    @Override
    public void addPlainText() {
        
    }

    @Override
    public void addContainers() {
        CONTAINERS.add(container1);
        CONTAINERS.add(container3);
        CONTAINERS.add(container4);
        CONTAINERS.add(container5);
        CONTAINERS.add(container6);
        CONTAINERS.add(container7);
        CONTAINERS.add(container8);
        CONTAINERS.add(container9);
        CONTAINERS.add(container10);
    }

    @Override
    public void initStyles() {
        
    }
    
    @Override
    public void light() {
        container1.setkFillBackground(false);
        container1.setkStartColor(ChoosedPalette.getGray());
        container1.setkEndColor(ChoosedPalette.getGray());
        container1.repaint();
        
        CONTAINERS.forEach(container -> {
            container.setkStartColor(ChoosedPalette.getGray());
            container.setkEndColor(ChoosedPalette.getGray());
            container.repaint();
        });
    }
    
    @Override
    public void dark() {
        container1.setkFillBackground(true);
        container1.setkStartColor(ChoosedPalette.getSecondaryBackground());
        container1.setkEndColor(ChoosedPalette.getSecondaryBackground());
        container1.repaint();
        
        CONTAINERS.forEach(container -> {
            container.setkStartColor(ChoosedPalette.getPrimaryBackground());
            container.setkEndColor(ChoosedPalette.getPrimaryBackground());
            container.repaint();
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        container1 = new com.k33ptoo.components.KGradientPanel();
        jPanel2 = new javax.swing.JPanel();
        container3 = new com.k33ptoo.components.KGradientPanel();
        container4 = new com.k33ptoo.components.KGradientPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        container5 = new com.k33ptoo.components.KGradientPanel();
        jPanel9 = new javax.swing.JPanel();
        container6 = new com.k33ptoo.components.KGradientPanel();
        jPanel10 = new javax.swing.JPanel();
        container7 = new com.k33ptoo.components.KGradientPanel();
        jPanel11 = new javax.swing.JPanel();
        container8 = new com.k33ptoo.components.KGradientPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        container9 = new com.k33ptoo.components.KGradientPanel();
        jPanel7 = new javax.swing.JPanel();
        container10 = new com.k33ptoo.components.KGradientPanel();

        setMaximumSize(new java.awt.Dimension(2147483647, 80));
        setMinimumSize(new java.awt.Dimension(100, 80));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(700, 80));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(100, 10));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 10));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 711, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_END);

        container1.setkEndColor(new java.awt.Color(204, 204, 204));
        container1.setkFillBackground(false);
        container1.setkStartColor(new java.awt.Color(204, 204, 204));
        container1.setMaximumSize(new java.awt.Dimension(32767, 70));
        container1.setMinimumSize(new java.awt.Dimension(0, 70));
        container1.setOpaque(false);
        container1.setPreferredSize(new java.awt.Dimension(0, 70));
        container1.setLayout(new java.awt.GridLayout(1, 3));

        jPanel2.setOpaque(false);

        container3.setkBorderRadius(100);
        container3.setkEndColor(new java.awt.Color(204, 204, 204));
        container3.setkStartColor(new java.awt.Color(204, 204, 204));
        container3.setMaximumSize(new java.awt.Dimension(48, 48));
        container3.setMinimumSize(new java.awt.Dimension(48, 48));
        container3.setOpaque(false);
        container3.setPreferredSize(new java.awt.Dimension(48, 48));

        javax.swing.GroupLayout container3Layout = new javax.swing.GroupLayout(container3);
        container3.setLayout(container3Layout);
        container3Layout.setHorizontalGroup(
            container3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        container3Layout.setVerticalGroup(
            container3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        container4.setkEndColor(new java.awt.Color(204, 204, 204));
        container4.setkStartColor(new java.awt.Color(204, 204, 204));
        container4.setMaximumSize(new java.awt.Dimension(100, 40));
        container4.setMinimumSize(new java.awt.Dimension(100, 40));
        container4.setOpaque(false);

        javax.swing.GroupLayout container4Layout = new javax.swing.GroupLayout(container4);
        container4.setLayout(container4Layout);
        container4Layout.setHorizontalGroup(
            container4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 136, Short.MAX_VALUE)
        );
        container4Layout.setVerticalGroup(
            container4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(container3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(86, 86, 86)
                    .addComponent(container4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(15, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(container3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(container4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
        );

        container1.add(jPanel2);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jPanel8.setOpaque(false);

        container5.setkEndColor(new java.awt.Color(204, 204, 204));
        container5.setkStartColor(new java.awt.Color(204, 204, 204));
        container5.setMaximumSize(new java.awt.Dimension(100, 40));
        container5.setMinimumSize(new java.awt.Dimension(100, 40));
        container5.setOpaque(false);

        javax.swing.GroupLayout container5Layout = new javax.swing.GroupLayout(container5);
        container5.setLayout(container5Layout);
        container5Layout.setHorizontalGroup(
            container5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        container5Layout.setVerticalGroup(
            container5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 59, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(container5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(33, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(container5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
        );

        jPanel3.add(jPanel8);

        jPanel9.setOpaque(false);

        container6.setkEndColor(new java.awt.Color(204, 204, 204));
        container6.setkStartColor(new java.awt.Color(204, 204, 204));
        container6.setMaximumSize(new java.awt.Dimension(100, 40));
        container6.setMinimumSize(new java.awt.Dimension(100, 40));
        container6.setOpaque(false);

        javax.swing.GroupLayout container6Layout = new javax.swing.GroupLayout(container6);
        container6.setLayout(container6Layout);
        container6Layout.setHorizontalGroup(
            container6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        container6Layout.setVerticalGroup(
            container6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 59, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(container6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(33, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(container6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
        );

        jPanel3.add(jPanel9);

        jPanel10.setOpaque(false);

        container7.setkEndColor(new java.awt.Color(204, 204, 204));
        container7.setkStartColor(new java.awt.Color(204, 204, 204));
        container7.setMaximumSize(new java.awt.Dimension(100, 40));
        container7.setMinimumSize(new java.awt.Dimension(100, 40));
        container7.setOpaque(false);

        javax.swing.GroupLayout container7Layout = new javax.swing.GroupLayout(container7);
        container7.setLayout(container7Layout);
        container7Layout.setHorizontalGroup(
            container7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        container7Layout.setVerticalGroup(
            container7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 59, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(container7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(container7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
        );

        jPanel3.add(jPanel10);

        jPanel11.setOpaque(false);

        container8.setkEndColor(new java.awt.Color(204, 204, 204));
        container8.setkStartColor(new java.awt.Color(204, 204, 204));
        container8.setMaximumSize(new java.awt.Dimension(100, 40));
        container8.setMinimumSize(new java.awt.Dimension(100, 40));
        container8.setOpaque(false);

        javax.swing.GroupLayout container8Layout = new javax.swing.GroupLayout(container8);
        container8.setLayout(container8Layout);
        container8Layout.setHorizontalGroup(
            container8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        container8Layout.setVerticalGroup(
            container8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 59, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(container8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(container8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
        );

        jPanel3.add(jPanel11);

        container1.add(jPanel3);

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jPanel5.setOpaque(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 79, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5);

        jPanel6.setOpaque(false);

        container9.setkEndColor(new java.awt.Color(204, 204, 204));
        container9.setkStartColor(new java.awt.Color(204, 204, 204));
        container9.setMaximumSize(new java.awt.Dimension(100, 50));
        container9.setMinimumSize(new java.awt.Dimension(100, 50));
        container9.setOpaque(false);

        javax.swing.GroupLayout container9Layout = new javax.swing.GroupLayout(container9);
        container9.setLayout(container9Layout);
        container9Layout.setHorizontalGroup(
            container9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        container9Layout.setVerticalGroup(
            container9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(container9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(container9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel6);

        jPanel7.setOpaque(false);

        container10.setkEndColor(new java.awt.Color(204, 204, 204));
        container10.setkStartColor(new java.awt.Color(204, 204, 204));
        container10.setMaximumSize(new java.awt.Dimension(100, 40));
        container10.setMinimumSize(new java.awt.Dimension(100, 40));
        container10.setOpaque(false);

        javax.swing.GroupLayout container10Layout = new javax.swing.GroupLayout(container10);
        container10.setLayout(container10Layout);
        container10Layout.setHorizontalGroup(
            container10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        container10Layout.setVerticalGroup(
            container10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(container10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(container10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel7);

        container1.add(jPanel4);

        add(container1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KGradientPanel container1;
    private com.k33ptoo.components.KGradientPanel container10;
    private com.k33ptoo.components.KGradientPanel container3;
    private com.k33ptoo.components.KGradientPanel container4;
    private com.k33ptoo.components.KGradientPanel container5;
    private com.k33ptoo.components.KGradientPanel container6;
    private com.k33ptoo.components.KGradientPanel container7;
    private com.k33ptoo.components.KGradientPanel container8;
    private com.k33ptoo.components.KGradientPanel container9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables

}
