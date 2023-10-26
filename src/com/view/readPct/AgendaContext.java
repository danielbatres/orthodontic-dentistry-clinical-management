package com.view.readPct;

import com.context.ChoosedPalette;
import com.context.StateColors;
import com.k33ptoo.components.KGradientPanel;
import static com.utils.Styles.paintOneContainer;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

/**
 *
 * @author Daniel Batres
 */
public class AgendaContext {
    public static int countedErrors = 0;
    
    public static void validateComplete(KGradientPanel container, JTextField jTextField, JLabel label, int max) {
        paintOneContainer(container, StateColors.getDanger());
        jTextField.setBorder(new MatteBorder(1, 0, 1, 0, StateColors.getDanger()));
        label.setForeground(StateColors.getDanger());
        
        int value = 0;
        countedErrors++;
        
        try {
            value = Integer.parseInt(jTextField.getText());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }
        
        if (jTextField.getText().toLowerCase().contains("ingresa") || jTextField.getText().equals("")) {
            label.setText("Datos inv\u00e1lidos");
        } else if (value > max) {
            label.setText("No puede ser mayor a " + max);
        } else {
            paintOneContainer(container, ChoosedPalette.getGray());
            jTextField.setBorder(new MatteBorder(1, 0, 1, 0, ChoosedPalette.getGray()));
            label.setText("");
            if (countedErrors > 0) countedErrors--;
        }
        
        container.repaint();
    }
    
    public static void validateCombo(JComboBox comboBox, JLabel advertencia) {
        advertencia.setForeground(StateColors.getDanger());
        comboBox.setBorder(new LineBorder(StateColors.getDanger()));
        
        countedErrors++;
        if (comboBox.getSelectedItem().toString().equals("Elegir tratamiento")) {
            advertencia.setText("Opci\u00f3n invalida");
        } else {
            advertencia.setText("");
            comboBox.setBorder(new LineBorder(ChoosedPalette.getGray()));
            if (countedErrors > 0) countedErrors--;
        }
    }
    
    public static void validateHour(KGradientPanel container, JTextField jTextField, JLabel label) {
        paintOneContainer(container, StateColors.getDanger());
        jTextField.setBorder(new MatteBorder(1, 0, 1, 0, StateColors.getDanger()));
        label.setForeground(StateColors.getDanger());
        
        countedErrors++;
        if (jTextField.getText().toLowerCase().contains("ingresa") || jTextField.getText().equals("")) {
            label.setText("Datos inv\u00e1lidos");
        } else {
            paintOneContainer(container, ChoosedPalette.getGray());
            jTextField.setBorder(new MatteBorder(1, 0, 1, 0, ChoosedPalette.getGray()));
            label.setText("");
            if (countedErrors > 0) countedErrors--;
        }
        
        container.repaint();
    }
}
