package com.context;

import java.awt.Color;

/**
 * <h1>StateColors</h1>
 * 
 * Colores para representar distintos estados
 * 
 * @author Daniel Batres
 * @version 1.0.0
 * @since 17/09/22
 */
public class StateColors {
    private static final Color success = Color.decode("#7EE46C");
    private static final Color info = Color.decode("#52A4FF");
    private static final Color warning = Color.decode("#FFDC4B");
    private static final Color danger = Color.decode("#FF717B");
    private static Color lightDanger = Color.decode("#FFB9BE");

    public static Color getSuccess() {
        return success;
    }

    public static Color getInfo() {
        return info;
    }

    public static Color getWarning() {
        return warning;
    }

    public static Color getDanger() {
        return danger;
    }

    public static Color getLightDanger() {
        return lightDanger;
    }

    public static void setLightDanger(Color lightDanger) {
        StateColors.lightDanger = lightDanger;
    }
}
