package com.context;

import java.awt.Color;

/**
 * <h1>PreferredPalette</h1>
 * 
 * Paleta de colores preferida
 * 
 * @author Daniel Batres
 * @version 1.0.0
 * @since 17/09/22
 */
public class ChoosedPalette {
    private static final Palette DARK_PALETTE = new Palette(Color.decode("#0B0D16"),
        Color.decode("#FFFFFF"),
        Color.decode("#4562FF"),
        Color.decode("#8F8F8F"),
        Color.decode("#4562FF"),
        Color.decode("#16D685"),
        Color.decode("#9665FF"),
        Color.decode("#505050"),
        Color.decode("#272727"),
        Color.decode("#1E1E1E"),
        Color.decode("#272727"),
        Color.decode("#191516"),
        Color.decode("#FFFFFF"),
        Color.decode("#FFFFFF"));
    private static final Palette WHITE_PALETTE = new Palette(Color.decode("#0B0D16"),
        Color.decode("#2F4590"),
        Color.decode("#4562FF"),
        Color.decode("#8F8F8F"),
        Color.decode("#E1ECFF"),
        Color.decode("#CFFFEB"),
        Color.decode("#E6DBFD"),
        Color.decode("#E1ECFF"),
        Color.decode("#F4F6FF"),
        Color.decode("#FFFFFF"),
        Color.decode("#FFFFFF"),
        Color.decode("#FFFFFF"),
        Color.decode("#FFFFFF"),
        Color.decode("#9665FF"));
    private static Color lightHover = WHITE_PALETTE.getLightHover();
    private static Color darkestColor = WHITE_PALETTE.getDarkestColor();
    private static Color darkColor = WHITE_PALETTE.getDarkColor();
    private static Color midColor = WHITE_PALETTE.getMidColor();
    private static Color textColor = WHITE_PALETTE.getTextColor();
    private static Color primaryLightColor = WHITE_PALETTE.getPrimaryLightColor();
    private static Color secondaryLightColor = WHITE_PALETTE.getSecondaryLightColor();
    private static Color terciaryLightColor = WHITE_PALETTE.getTerciaryLightColor();
    private static Color gray = WHITE_PALETTE.getGray();
    private static Color primaryBackground = WHITE_PALETTE.getPrimaryBackground();
    private static Color secondaryBackground = WHITE_PALETTE.getSecondaryBackground();
    private static Color terciaryBackground = WHITE_PALETTE.getTerciaryBackground();
    private static Color white = WHITE_PALETTE.getWhite();
    private static Color terciaryTextColor = WHITE_PALETTE.getTerciaryTextColor();
    
    public static void changePalette(Palette palette) {
        darkestColor = palette.getDarkestColor();
        darkColor = palette.getDarkColor();
        midColor = palette.getMidColor();
        textColor = palette.getTextColor();
        primaryLightColor = palette.getPrimaryLightColor();
        secondaryLightColor = palette.getSecondaryLightColor();
        terciaryLightColor = palette.getTerciaryLightColor();
        gray = palette.getGray();
        lightHover = palette.getLightHover();
        primaryBackground = palette.getPrimaryBackground();
        secondaryBackground = palette.getSecondaryBackground();
        terciaryBackground = palette.getTerciaryBackground();
        white = palette.getWhite();
        terciaryTextColor = palette.getTerciaryTextColor();
    }

    public static Color getTerciaryBackground() {
        return terciaryBackground;
    }

    public static void setTerciaryBackground(Color terciaryBackground) {
        ChoosedPalette.terciaryBackground = terciaryBackground;
    }
    
    public static Color getLightHover() {
        return lightHover;
    }

    public static void setLightHover(Color lightHover) {
        ChoosedPalette.lightHover = lightHover;
    }

    public static Color getDarkestColor() {
        return darkestColor;
    }

    public static void setDarkestColor(Color darkestColor) {
        ChoosedPalette.darkestColor = darkestColor;
    }

    public static Color getDarkColor() {
        return darkColor;
    }

    public static void setDarkColor(Color darkColor) {
        ChoosedPalette.darkColor = darkColor;
    }

    public static Color getMidColor() {
        return midColor;
    }

    public static void setMidColor(Color midColor) {
        ChoosedPalette.midColor = midColor;
    }

    public static Color getTextColor() {
        return textColor;
    }

    public static void setTextColor(Color textColor) {
        ChoosedPalette.textColor = textColor;
    }

    public static Color getPrimaryLightColor() {
        return primaryLightColor;
    }

    public static void setPrimaryLightColor(Color primaryLightColor) {
        ChoosedPalette.primaryLightColor = primaryLightColor;
    }

    public static Color getSecondaryLightColor() {
        return secondaryLightColor;
    }

    public static void setSecondaryLightColor(Color secondaryLightColor) {
        ChoosedPalette.secondaryLightColor = secondaryLightColor;
    }

    public static Color getTerciaryLightColor() {
        return terciaryLightColor;
    }

    public static void setTerciaryLightColor(Color terciaryLightColor) {
        ChoosedPalette.terciaryLightColor = terciaryLightColor;
    }

    public static Color getGray() {
        return gray;
    }

    public static void setGray(Color gray) {
        ChoosedPalette.gray = gray;
    }

    public static Palette getDARK_PALETTE() {
        return DARK_PALETTE;
    }

    public static Palette getWHITE_PALETTE() {
        return WHITE_PALETTE;
    }

    public static Color getWhite() {
        return white;
    }

    public static void setWhite(Color white) {
        ChoosedPalette.white = white;
    }

    public static Color getPrimaryBackground() {
        return primaryBackground;
    }

    public static void setPrimaryBackground(Color primaryBackground) {
        ChoosedPalette.primaryBackground = primaryBackground;
    }

    public static Color getSecondaryBackground() {
        return secondaryBackground;
    }

    public static void setSecondaryBackground(Color secondaryBackground) {
        ChoosedPalette.secondaryBackground = secondaryBackground;
    }

    public static Color getTerciaryTextColor() {
        return terciaryTextColor;
    }

    public static void setTerciaryTextColor(Color terciaryTextColor) {
        ChoosedPalette.terciaryTextColor = terciaryTextColor;
    }
}
