package com.utils;

import com.context.ChoosedPalette;
import com.k33ptoo.components.KButton;
import com.k33ptoo.components.KGradientPanel;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

/**
 * <h1>Styles</h1> 
 * 
 * Esta clase maneja estilos de texto, titulos, contenedores, iconos y botones
 * 
 * @author Daniel Batres
 * @version 1.0.0
 * @since 17/09/22
 */
public class Styles extends javax.swing.JPanel {
    public final ArrayList<JLabel> TITLES_AND_SUBTITLES = new ArrayList<>();
    public final ArrayList<JLabel> PLAIN_TEXT = new ArrayList<>();
    public final ArrayList<KGradientPanel> CONTAINERS = new ArrayList<>();
    public final ArrayList<KGradientPanel> ICON_CONTAINERS = new ArrayList<>();
    public final ArrayList<KButton> BUTTONS = new ArrayList<>();
    public final ArrayList<JTextField> TEXTFIELDS = new ArrayList<>();
    public final ArrayList<JComboBox> COMBOBOX = new ArrayList<>();
    
    /** 
     * Este metodo realiza todas las acciones complementarias de Styles
     */
    public void styleMyComponentBaby() {
        addAll();
        paintAll();
        initStyles();
    }
    
    /** 
     * Se pintan todos
     */
    public void paintAll() {
        paintTitlesAndSubtitles();
        paintPlainText();
        paintContainers();
        paintIconContainers();
        paintTextFields();
        paintComboBox();
    }
    
    /** 
     * Se anaden todos
     */
    public void addAll() {
        addTitlesAndSubtitles();
        addPlainText();
        addContainers();
        addIconContainers();
        addTextFields();
        addComboBox();
    }
    
    public void paintTitlesAndSubtitles() {
        TITLES_AND_SUBTITLES.forEach((JLabel title) -> {
            if (title != null) 
                title.setForeground(ChoosedPalette.getDarkColor());
        });
    }
    
    public void paintPlainText() {
        PLAIN_TEXT.forEach(plain -> {
            plain.setForeground(ChoosedPalette.getTextColor());
        });
    }
    
    /** 
     * Este metodo pinta un solo texto plano
     * 
     * @param plain texto plano unico
     * @param color color que se utilizara para pintar
     */
    public void paintOnePlainText(JLabel plain, Color color) {
        plain.setForeground(color);
    }
    
    public void paintContainers() {
        try {
            CONTAINERS.forEach(container -> {
                container.setkStartColor(ChoosedPalette.getGray());
                container.setkEndColor(ChoosedPalette.getGray());
            });
        } catch (Exception e) {
            System.out.println("lol " + e);
        }
    }
    
    public void paintSpecifiedContainers(ArrayList<KGradientPanel> containers, Color color) {
        containers.forEach(container -> {
            container.setkStartColor(color);
            container.setkEndColor(color);
        });
    }
    
    /** 
     * Este metodo pinta un solo contenedor
     * 
     * @param container contenedor unico
     * @param color color que se utilizara para pintar
     */
    public static void paintOneContainer(KGradientPanel container, Color color) {
        container.setkStartColor(color);
        container.setkEndColor(color);
    }
    
    /** 
     * Este metodo pinta un solo contenedor tipo panel round
     * 
     * @param container contenedor unico
     * @param color color que se utilizara para pintar
     */
    public void paintOnePanelRound(PanelRound container, Color color) {
        container.setBackground(color);
    }
    
    public void paintIconContainers() {
        ICON_CONTAINERS.forEach(iconContainer -> {
            iconContainer.setkStartColor(ChoosedPalette.getMidColor());
            iconContainer.setkEndColor(ChoosedPalette.getMidColor());
        });
    }
    
    public void paintButtons() {
        BUTTONS.forEach(button -> {
            button.setkBackGroundColor(ChoosedPalette.getMidColor());
        });
    }
    
    public void changeMatteBorder(JPanel panel) {
        panel.setBorder(new MatteBorder(0, 0, 1, 0, ChoosedPalette.getGray()));
    }
    
    /** 
     * Este metodo pintara un solo boton tipo KButton
     * 
     * @param button boton que se pintara
     * @param color color especificado
     */
    public void paintOneButton(KButton button, Color color) {
        button.setkBackGroundColor(ChoosedPalette.getMidColor());
    }
    
    /** 
     * Este metodo pinta el texto dentro de un campo de contraseña
     * 
     * @param passwordField el campo que modificaremos
     */
    public void paintOnePasswordField(JPasswordField passwordField) {
        passwordField.setForeground(ChoosedPalette.getTextColor());
    }
    
    public void paintTextFields() {
        TEXTFIELDS.forEach(textField -> {
            textField.setBackground(ChoosedPalette.getPrimaryBackground());
            textField.setForeground(ChoosedPalette.getTextColor());
            textField.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
            textField.setBorder(new MatteBorder(1, 0, 1, 0, ChoosedPalette.getGray()));
        });
    }
    
    public void paintComboBox() {
        COMBOBOX.forEach(combo -> {
            combo.setBackground(ChoosedPalette.getPrimaryBackground());
            combo.setForeground(ChoosedPalette.getTextColor());
            combo.setBorder(new LineBorder(ChoosedPalette.getGray()));
        });
    }
    
    public void setSelectionNavigation(ArrayList<JPanel> containers, JLabel text, JPanel containerBtn) {
        containers.forEach(button -> {
            button.setBorder(new MatteBorder(0, 0, 1, 0, ChoosedPalette.getGray()));
        });
        
        PLAIN_TEXT.forEach(plainText -> {
            plainText.setForeground(ChoosedPalette.getTextColor());
        });
        
        text.setForeground(ChoosedPalette.getMidColor());
        containerBtn.setBorder(new MatteBorder(0, 0, 3, 0, ChoosedPalette.getMidColor()));
        SwingUtilities.updateComponentTreeUI(this);
    }
    
    public void colorComponent(String preferred) {
        switch (preferred) {
            case "light":
                colorBasics();
                light();
                break;
            case "dark":
                colorBasics();
                dark();
                break;
            default:
                System.out.println("Invalido");
        }
    }
    
    public void colorBasics() {};
    
    public void light() {
        CONTAINERS.forEach(container -> {
            container.setkFillBackground(false);
            container.setkStartColor(ChoosedPalette.getGray());
            container.setkEndColor(ChoosedPalette.getGray());
            container.repaint();
        });
    };
    
    public void dark() {
        CONTAINERS.forEach(container -> {
            container.setkFillBackground(true);
            container.setkStartColor(ChoosedPalette.getPrimaryBackground());
            container.setkEndColor(ChoosedPalette.getPrimaryBackground());
            container.repaint();
        });
    };
    
    public void setScrollSize() {};
    public void addTextFields() {};
    public void addIconContainers() {};
    public void addComboBox() {};
    public void addTitlesAndSubtitles() {};
    public void addPlainText() {};
    public void addContainers() {};
    public void initStyles() {};
}
