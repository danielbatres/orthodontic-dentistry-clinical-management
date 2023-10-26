package com.utils;

import java.awt.Dimension;
import javax.swing.JScrollBar;
import javax.swing.plaf.basic.BasicScrollBarUI;

/* Scroll bar custom */
public class ModernScrollBarUI extends BasicScrollBarUI {
    private final int THUMB_SIZE = 40;
    
    @Override
    protected Dimension getMaximumThumbSize() {
        if (scrollbar.getOrientation() == JScrollBar.VERTICAL) {
            return new Dimension(0, THUMB_SIZE);
        } else {
            return new Dimension(THUMB_SIZE, 0);
        }
    }

    @Override
    protected Dimension getMinimumThumbSize() {
        if (scrollbar.getOrientation() == JScrollBar.VERTICAL) {
            return new Dimension(0, THUMB_SIZE);
        } else {
            return new Dimension(THUMB_SIZE, 0);
        }
    }
}
