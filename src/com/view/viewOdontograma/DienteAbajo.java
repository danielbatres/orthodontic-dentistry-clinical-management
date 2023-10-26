package com.view.viewOdontograma;

import com.model.DienteOdontogramaModel;
import com.utils.Tools;
import static com.view.viewOdontograma.OdontogramaContext.parseSeleccion;

/**
 *
 * @author Daniel Batres
 */
public class DienteAbajo extends javax.swing.JPanel implements IOdontograma {
    private final Diente DIENTE_ABAJO = new Diente("abajo");
    
    /**
     * Creates new form DienteAbajo
     */
    public DienteAbajo() {
        initComponents();
        Tools.showPanel(diente, DIENTE_ABAJO, 0, 0);
    }
    
    @Override
    public void setValuesByModel(DienteOdontogramaModel dienteOdontograma) {
        if (dienteOdontograma.getNumeroPieza() == DIENTE_ABAJO.getNumPieza() && !dienteOdontograma.getCara().equals("Oclusal")) {
            OdontogramaContext.setSelection(true);
            OdontogramaContext.setOdontogramaSelection(parseSeleccion(dienteOdontograma.getSeleccion()));
            
            switch (parseSeleccion(dienteOdontograma.getSeleccion())) {
                case CORONA_BUEN_ESTADO:
                case CORONA_MAL_ESTADO:
                    DIENTE_ABAJO.setCorona(5);
                    break;
                case DIENTE_AUSENTE:
                case DIENTE_INDICADO_EXTRACCION:
                    DIENTE_ABAJO.setCrossValues(5, 1);
                    break;
                case CARIES_DENTAL:
                case FRACTURA_CORONA_DENTAL:
                case OBTURACION_BUEN_ESTADO:
                case OBTURACION_MAL_ESTADO:
                    DIENTE_ABAJO.setColorValues(dienteOdontograma.getSide(), 5);
            }
        } else {
            if (dienteOdontograma.getNumeroPieza() == DIENTE_ABAJO.getNumPieza()) {
                OdontogramaContext.setSelection(true);
                OdontogramaContext.setOdontogramaSelection(parseSeleccion(dienteOdontograma.getSeleccion()));
                DIENTE_ABAJO.centerClickedEvent();
            }
        }
    }

    @Override
    public void setValuesByNum(int num) {
        number.setText(String.valueOf(num));
        DIENTE_ABAJO.setNumPieza(num);
    }

    public Diente getDIENTE_ABAJO() {
        return DIENTE_ABAJO;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        number = new javax.swing.JLabel();
        diente = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(76, 125));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(76, 125));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(100, 25));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 25));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setMinimumSize(new java.awt.Dimension(5, 100));
        jPanel3.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel4.setMinimumSize(new java.awt.Dimension(5, 100));
        jPanel4.setOpaque(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, java.awt.BorderLayout.LINE_END);

        jPanel5.setMinimumSize(new java.awt.Dimension(100, 10));
        jPanel5.setOpaque(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(76, 10));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel6.setMinimumSize(new java.awt.Dimension(100, 24));
        jPanel6.setOpaque(false);
        jPanel6.setPreferredSize(new java.awt.Dimension(76, 24));

        number.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        number.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        number.setText("10");
        number.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(number, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(number, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6, java.awt.BorderLayout.PAGE_END);

        diente.setOpaque(false);
        diente.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(diente, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel diente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel number;
    // End of variables declaration//GEN-END:variables
}
