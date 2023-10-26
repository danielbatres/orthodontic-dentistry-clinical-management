package com.utils;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;
import javax.swing.plaf.basic.BasicScrollBarUI;

/**
 *
 * @author Daniel Batres
 */
public class CustomScrollBar extends JScrollBar {
    public CustomScrollBar() {
        setUI((BasicScrollBarUI) new ModernScrollBarUI());
        setPreferredSize(new Dimension(0, 0));
        setForeground(new Color(48, 144, 216));
        setBackground(Color.WHITE);
    } 
}
