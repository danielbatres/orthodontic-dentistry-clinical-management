package com.view.createPacient;

import com.context.ChoosedPalette;
import com.context.StateColors;
import com.k33ptoo.components.KGradientPanel;
import com.model.PacienteModel;
import com.utils.Styles;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

/**
 * <h3>NewPacientContext</h3>
 *
 * Contexto para la creacion de un nuevo paciente
 * 
 * @author Daniel Batres
 * @version 1.0.0
 * @since 25/09/22
 */
public class NewContext extends Styles {
    public ArrayList<JTextField> camposTexto = new ArrayList<>();
    public ArrayList<KGradientPanel> containersTexto = new ArrayList<>();
    public ArrayList<JLabel> advertenciasTexto = new ArrayList<>();
    public static boolean isTratamientoOdontologico = false;
    public static boolean isTratamientoOrtodontico = false;
    public static PacienteModel paciente = new PacienteModel();
    public static LocalDateTime localTime = LocalDateTime.now();
    public static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("a");
    public static int emptyCounter = 0;
    public static int countedErrors = 0;
    
    /** 
     * Este metodo validara todos los campos
     * @param camposTexto
     * @param advertencias
     * @param containers
     */
    public static void validarTodosLosCampos(ArrayList<JTextField> camposTexto, ArrayList<JLabel> advertencias, ArrayList<KGradientPanel> containers) {
        for (int i = 0; i < camposTexto.size(); i++) {
            validacionCampo(containers.get(i), camposTexto.get(i), advertencias.get(i), 3);
        }
    }
    
    /**
     * Este metodo validara campos de texto o numericos en una capa ligera
     * 
     * @param container contenedor al que se pintara borde segun el estado
     * @param jTextField el campo de validacion
     * @param advertencia texto de advertencia que se desplegara
     * @param minLenght
     * @return isValidated 
     */
    public static boolean validacionCampo(KGradientPanel container, JTextField jTextField, JLabel advertencia, int minLenght) {
        boolean isValidated;
        advertencia.setForeground(StateColors.getDanger());
        jTextField.setBorder(new MatteBorder(1, 0, 1, 0, StateColors.getDanger()));
        container.setkStartColor(StateColors.getDanger());
        container.setkEndColor(StateColors.getDanger());
        
        isValidated = true;
        countedErrors++;
        if (jTextField.getText().toLowerCase().contains("ingresa")) {
            advertencia.setText("Informaci\u00f3n invalida");
        } else if (jTextField.getText().isEmpty()) {
            advertencia.setText("No puede ser vac\u00edo");
        } else if (jTextField.getText().length() < minLenght) {
            advertencia.setText("M\u00ednimo " + minLenght + " caracteres");
        } else if (jTextField.getText().length() > 75) {
            advertencia.setText("M\u00e1ximo 75 caracteres");
        } else {
            advertencia.setText("");
            jTextField.setBorder(new MatteBorder(1, 0, 1, 0, ChoosedPalette.getGray()));
            container.setkStartColor(ChoosedPalette.getGray());
            container.setkEndColor(ChoosedPalette.getGray());
            
            isValidated = false;
            if (countedErrors > 0) countedErrors--;
        }
        
        container.repaint();
        return isValidated;
    }
    
    /**
     * Este metodo validara la fecha de nacimiento
     * 
     * @param containers arreglo de contenedores que se pintaran
     * @param jTextFields arreglo de campos que validaremos
     * @param advertencia advertencia que se desplegara
     */
    public void validarFechaNacimiento(ArrayList<KGradientPanel> containers, ArrayList<JTextField> jTextFields, JLabel advertencia)  {
        advertencia.setForeground(StateColors.getDanger());
        for (JTextField jTextField : jTextFields) {
            jTextField.setBorder(new MatteBorder(1, 0, 1, 0, StateColors.getDanger()));
        }
        
        for (KGradientPanel container : containers) {
            container.setkStartColor(StateColors.getDanger());
            container.setkEndColor(StateColors.getDanger());
            container.repaint();
        }
        
        countedErrors++;
        
        for (JTextField jTextField : jTextFields) {
            if (jTextField.getText().equals("dd") || jTextField.getText().equals("mm") || jTextField.getText().equals("aaaa")) {
                advertencia.setText("Fecha inv\u00e1lida");
            } else if (String.valueOf(jTextField.getText()).trim().equals("")) {
                advertencia.setText("Fecha inv\u00e1lida");
            } else {
                advertencia.setText("");
                jTextField.setBorder(new MatteBorder(1, 0, 1, 0, ChoosedPalette.getGray()));
                containers.get(jTextFields.indexOf(jTextField)).setkStartColor(ChoosedPalette.getGray());
                containers.get(jTextFields.indexOf(jTextField)).setkEndColor(ChoosedPalette.getGray());
                if (countedErrors > 0) countedErrors--;
            }
        }
    }
    
    /**
     * Este metodo validara un combo box segun los parametros indicados
     *
     * @param comboBox comboBox a validar
     * @param advertencia la advertencia que se desplegara
     * @param invalidOption opcion invalida a validar
     */
    public void validacionCombo(JComboBox comboBox, JLabel advertencia, String invalidOption) {
        advertencia.setForeground(StateColors.getDanger());
        comboBox.setBorder(new LineBorder(StateColors.getDanger()));
        
        countedErrors++;
        if (comboBox.getSelectedItem().toString().equals(invalidOption)) {
            advertencia.setText("Opci\u00f3n invalida");
        } else {
            advertencia.setText("");
            comboBox.setBorder(new LineBorder(ChoosedPalette.getGray()));
            if (countedErrors > 0) countedErrors--;
        }
    }
    
    public static String emptyMessage(String message) {
        if (message.toLowerCase().contains("ingresa") || message.equals("")) return "No agregado";
        return message;
    }
    
    public void verifyEmpty() {
        for (JTextField textField : TEXTFIELDS) {
            if (textField.getText().toLowerCase().contains("ingresa") || textField.getText().toLowerCase().contains("no agregado")) {
                NewContext.emptyCounter++;
                break;
            }
        }
    }
}
