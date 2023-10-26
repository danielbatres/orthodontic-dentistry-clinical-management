package com.utils;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 * <h1>Utils</h1>
 * 
 * Esta clase brindara herramientas escenciales para el manejo de las interfaces de usuario
 * 
 * @author Daniel Batres
 * @version 1.0.0
 * @since 12/09/22
 */
public class Tools {
    
    /** 
     * Este metodo se encargara de desplegar un panel donde sea indicado
     * 
     * @param container el panel contenedor donde vamos a agregar nuestro nuevo panel
     * @param content el panel de contenido que vamos a agregar
     * @param width ancho para el panel de contenido
     * @param height alto para el panel de contenido
     */
    public static void showPanel(JPanel container,JPanel content, int width, int height) {
        content.setSize(width, height);
        content.setLocation(0, 0);
        container.removeAll();
        container.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        container.revalidate();
        container.repaint();
        
        SwingUtilities.updateComponentTreeUI(container);
    }
    
    /** 
     * Este metodo ajusta la barra de scroll y su movimiento
     * 
     * @param scrollPanel el panel que se vera afectado
     */
    public static void setScroll(JScrollPane scrollPanel) {
        CustomScrollBar csb = new CustomScrollBar();
        csb.setOrientation(JScrollBar.VERTICAL);
        scrollPanel.setVerticalScrollBar(csb);
        scrollPanel.getVerticalScrollBar().setUnitIncrement(35);
    }
    
    /** 
     * Este metodo coloca una imagen dentro de un label, se utiliza en su mayoria para los iconos de la interfaz
     * 
     * @param label JLabel que se vera afectado
     * @param root ruta de la imagen que colocaremos
     * @param minWidth es para recortar el ancho de la imagen
     * @param minHeight
     * @param color
     */
    public static void setImageLabel(JLabel label, String root, int minWidth, int minHeight, Color color) {
        File img;
        BufferedImage bufferedImage;
        ImageIcon imageIcon;
        Icon icon;
        
        try {
            img = new File(root);
            bufferedImage = colorImage(ImageIO.read(img), color.getRed(), color.getGreen(), color.getBlue());
            imageIcon = new ImageIcon(bufferedImage);
            icon = new ImageIcon(
                imageIcon.getImage().getScaledInstance(label.getWidth() - minWidth, label.getHeight() - minHeight, Image.SCALE_DEFAULT)
            );
            
            label.setIcon(icon);
            label.removeAll();
            label.repaint();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    public static void setImage(JLabel label, String root, int minWidth, int minHeight) {
        ImageIcon imageIcon;
        Icon icon;
        
//        try {
            imageIcon = new ImageIcon(root);
            icon = new ImageIcon(
                imageIcon.getImage().getScaledInstance(label.getWidth() - minWidth, label.getHeight() - minHeight, Image.SCALE_SMOOTH)
            );
            
            label.setIcon(icon);
            label.removeAll();
            label.repaint();
//        } catch (Exception e) {
//            System.out.println(e + "aca");
//        }
    }
    
    public static void deleteText(JTextField JTextField) {
        String text = JTextField.getText();
        
        if (text.contains("Ingresa") || text.contains("$") || text.contains("dd") || text.contains("mm") || text.contains("aaaa") || text.contains("ejemplo@email.com") || text.contains("password")) {
            JTextField.setText("");
        }
    }
    
    public static void deleteIngresaText(JTextField jTextField) {
        String text = jTextField.getText();
        
        if (text.contains("Ingresa")) {
            jTextField.setText("");
        }
    }
    
    public static void deleteDateType(JTextField jTextField) {
        String text = jTextField.getText();
        
        if (text.contains("dd") ||  text.contains("mm") || text.contains("aaaa")) {
            jTextField.setText("");
        }
    }
    
    public static void addMouseListenerIngresa(ArrayList<JTextField> deleteIngresa) {
        deleteIngresa.forEach(item -> {
            item.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    deleteIngresaText(item);
                }
            });
        });
    }
    
    public static void addMouseListenerDate(ArrayList<JTextField> deleteDate) {
        deleteDate.forEach(item -> {
            item.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    deleteDateType(item);
                }
            });
        });
    }
    
    public static void addKeyTypedListener(ArrayList<JTextField> dateArray, int length) {
        dateArray.forEach(item -> {
            item.addKeyListener(new KeyAdapter() {
                public void keyTyped(KeyEvent evt) {
                    numbersForDate(item, evt, length);
                }
            });
        });
    }
    
    public static boolean esAnnioBisiesto(int annio) {
        GregorianCalendar calendar = new GregorianCalendar();
        
        boolean esBisiesto = false;
        
        if (calendar.isLeapYear(annio)) {
            esBisiesto = true;
        }
        
        return esBisiesto;
    }
    
    public static void numbersForDate(JTextField jTextField, KeyEvent evt, int length) {
        if (!Character.isDigit(evt.getKeyChar()) || jTextField.getText().length() == length) {
            evt.consume();
        }
    }
    
    public static void onlyNumbers(JTextField JTextField,KeyEvent evt, int length) {
        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.') {
            evt.consume();
        } else if (evt.getKeyChar() == '.' && JTextField.getText().contains(".") || JTextField.getText().length() == length) {
            evt.consume();
        }
    }
    
    /** 
     * Este metodo se encargara de colorear la imagen segun los argumentos indicados
     * 
     * @param image imagen buffer a la que cambiaremos el color
     * @param red numero del 0 a 255 para el rojo en el sistema rbg
     * @param green numero del 0 a 255 para el verde en el sistema rgb
     * @param blue numero del 0 a 255 para el azul en el sistema rgb
     * 
     * @return image se retorna la imagen con el color modificado
     */
    private static BufferedImage colorImage(BufferedImage image, int red, int green, int blue) {
        int width = image.getWidth();
        int height = image.getHeight();
        WritableRaster raster = image.getRaster();

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int[] pixels = raster.getPixel(i, j, (int[]) null);
                pixels[0] = red;
                pixels[1] = green;
                pixels[2] = blue;
                raster.setPixel(i, j, pixels);
            }
        }
        
        return image;
    }
    
    public static void setTimeout(Runnable runnable, int delay) {
        new Thread(() -> {
            try {
                Thread.sleep(delay);
                runnable.run();
            }
            catch (InterruptedException e){
                System.err.println(e);
            }
        }).start();
    }
}
