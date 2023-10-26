package com.view.dashboard;

import com.context.ChoosedPalette;
import com.utils.Styles;
import com.utils.Tools;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 3/10/22
 */
public class ActividadTarget extends Styles {

    /**
     * Creates new form ActividadTarget
     * @param name
     * @param acciones
     * @param fecha
     */
    public ActividadTarget(String name, String acciones, String fecha) {
        initComponents();
        styleMyComponentBaby();
        
        title1.setText(name);
        text1.setText(acciones);
        title2.setText(fecha);
    }
    
    @Override 
    public void addTitlesAndSubtitles() {
        TITLES_AND_SUBTITLES.add(title1);
        TITLES_AND_SUBTITLES.add(title2);
    }
    
    @Override
    public void addPlainText() {
        PLAIN_TEXT.add(text1);
    }
    
    @Override
    public void light() {
        container.setkFillBackground(false);
        container.setkStartColor(ChoosedPalette.getGray());
        container.setkEndColor(ChoosedPalette.getGray());
        container.repaint();
        
         Tools.setImage(user, "src/com/images/user.png", 0, 0);
    }
    
    @Override
    public void colorBasics() {
        paintAll();
    }
    
    @Override
    public void dark() {
        container.setkFillBackground(true);
        container.setkStartColor(ChoosedPalette.getSecondaryBackground());
        container.setkEndColor(ChoosedPalette.getSecondaryBackground());
        container.repaint();
        
        Tools.setImage(user, "src/com/images/dark-user.png", 0, 0);
    }
    
    @Override 
    public void initStyles() {
        user.setSize(48, 48);
        Tools.setImage(user, "src/com/images/dark-user.png", 0, 0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        container = new com.k33ptoo.components.KGradientPanel();
        jPanel2 = new javax.swing.JPanel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        user = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        title1 = new javax.swing.JLabel();
        text1 = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1000, 100));
        setMinimumSize(new java.awt.Dimension(240, 100));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(240, 100));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(100, 10));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 10));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_END);

        container.setkEndColor(new java.awt.Color(204, 204, 204));
        container.setkFillBackground(false);
        container.setkStartColor(new java.awt.Color(204, 204, 204));
        container.setMaximumSize(new java.awt.Dimension(32767, 70));
        container.setMinimumSize(new java.awt.Dimension(0, 70));
        container.setOpaque(false);
        container.setPreferredSize(new java.awt.Dimension(0, 70));
        container.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                containerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                containerMouseExited(evt);
            }
        });
        container.setLayout(new javax.swing.BoxLayout(container, javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setMaximumSize(new java.awt.Dimension(70, 32767));
        jPanel2.setMinimumSize(new java.awt.Dimension(70, 100));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(70, 100));

        kGradientPanel2.setkBorderRadius(100);
        kGradientPanel2.setkEndColor(new java.awt.Color(204, 204, 204));
        kGradientPanel2.setkStartColor(new java.awt.Color(204, 204, 204));
        kGradientPanel2.setMaximumSize(new java.awt.Dimension(48, 48));
        kGradientPanel2.setMinimumSize(new java.awt.Dimension(48, 48));
        kGradientPanel2.setOpaque(false);
        kGradientPanel2.setPreferredSize(new java.awt.Dimension(48, 48));
        kGradientPanel2.setLayout(new java.awt.BorderLayout());

        user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kGradientPanel2.add(user, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );

        container.add(jPanel2);

        jPanel4.setOpaque(false);

        title1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        title1.setText("Nombre de la persona quien realiza la actividad");
        title1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        text1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text1.setText("Acciones realizadas");

        title2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title2.setText("08/08/2022");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(text1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(title2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(title1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title2)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        container.add(jPanel4);

        add(container, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void containerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_containerMouseExited
        
    }//GEN-LAST:event_containerMouseExited

    private void containerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_containerMouseEntered
        
    }//GEN-LAST:event_containerMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KGradientPanel container;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
