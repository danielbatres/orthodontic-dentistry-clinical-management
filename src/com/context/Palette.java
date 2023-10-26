package com.context;

import java.awt.Color;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 29/09/22
 */
public class Palette {
    private Color darkestColor;
    private Color darkColor;
    private Color midColor;
    private Color textColor;
    private Color primaryLightColor;
    private Color secondaryLightColor;
    private Color terciaryLightColor;
    private Color gray;
    private Color lightHover;
    private Color primaryBackground;
    private Color secondaryBackground;
    private Color terciaryBackground;
    private Color white;
    private Color terciaryTextColor;

    public Palette(Color darkestColor, Color darkColor, Color midColor, Color textColor, Color primaryLightColor, Color secondaryLightColor, Color terciaryLightColor, Color gray, Color lightHover, Color primaryBackground, Color secondaryBackground, Color terciaryBackground, Color white, Color terciaryTextColor) {
        this.darkestColor = darkestColor;
        this.darkColor = darkColor;
        this.midColor = midColor;
        this.textColor = textColor;
        this.primaryLightColor = primaryLightColor;
        this.secondaryLightColor = secondaryLightColor;
        this.terciaryLightColor = terciaryLightColor;
        this.gray = gray;
        this.lightHover = lightHover;
        this.primaryBackground = primaryBackground;
        this.secondaryBackground = secondaryBackground;
        this.terciaryBackground = terciaryBackground;
        this.white = white;
        this.terciaryTextColor = terciaryTextColor;
    }
    
    public Color getDarkestColor() {
        return darkestColor;
    }

    public void setDarkestColor(Color darkestColor) {
        this.darkestColor = darkestColor;
    }

    public Color getDarkColor() {
        return darkColor;
    }

    public void setDarkColor(Color darkColor) {
        this.darkColor = darkColor;
    }

    public Color getMidColor() {
        return midColor;
    }

    public void setMidColor(Color midColor) {
        this.midColor = midColor;
    }

    public Color getTextColor() {
        return textColor;
    }

    public void setTextColor(Color textColor) {
        this.textColor = textColor;
    }

    public Color getPrimaryLightColor() {
        return primaryLightColor;
    }

    public void setPrimaryLightColor(Color primaryLightColor) {
        this.primaryLightColor = primaryLightColor;
    }

    public Color getSecondaryLightColor() {
        return secondaryLightColor;
    }

    public void setSecondaryLightColor(Color secondaryLightColor) {
        this.secondaryLightColor = secondaryLightColor;
    }

    public Color getTerciaryLightColor() {
        return terciaryLightColor;
    }

    public void setTerciaryLightColor(Color terciaryLightColor) {
        this.terciaryLightColor = terciaryLightColor;
    }

    public Color getGray() {
        return gray;
    }

    public void setGray(Color gray) {
        this.gray = gray;
    }

    public Color getLightHover() {
        return lightHover;
    }

    public void setLightHover(Color lightHover) {
        this.lightHover = lightHover;
    }

    public Color getPrimaryBackground() {
        return primaryBackground;
    }

    public void setPrimaryBackground(Color primaryBackground) {
        this.primaryBackground = primaryBackground;
    }

    public Color getWhite() {
        return white;
    }

    public void setWhite(Color white) {
        this.white = white;
    }
    
    public Color getSecondaryBackground() {
        return secondaryBackground;
    }

    public void setSecondaryBackground(Color secondaryBackground) {
        this.secondaryBackground = secondaryBackground;
    }

    public Color getTerciaryBackground() {
        return terciaryBackground;
    }

    public void setTerciaryBackground(Color terciaryBackground) {
        this.terciaryBackground = terciaryBackground;
    }

    public Color getTerciaryTextColor() {
        return terciaryTextColor;
    }

    public void setTerciaryTextColor(Color terciaryTextColor) {
        this.terciaryTextColor = terciaryTextColor;
    }
}
