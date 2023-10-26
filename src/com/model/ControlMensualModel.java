package com.model;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 04/10/22
 */
public class ControlMensualModel {
    private int id;
    private String md;
    private String mx;
    private String hules;
    private String cadenas;
    private String observaciones;
    private int diaCreacion;
    private int mesCreacion;
    private int annioCreacion;
    private String horaCreacion;
    private int diaModificacion;
    private int mesModificacion;
    private int annioModificacion;
    private int annnioModificacion;
    private String horaModificacion;

    public ControlMensualModel() {
        
    }

    public ControlMensualModel(int id, String md, String mx, String hules, String cadenas, String observaciones, int diaCreacion, int mesCreacion, int annioCreacion, String horaCreacion, int diaModificacion, int mesModificacion, int annioModificacion, int annnioModificacion, String horaModificacion) {
        this.id = id;
        this.md = md;
        this.mx = mx;
        this.hules = hules;
        this.cadenas = cadenas;
        this.observaciones = observaciones;
        this.diaCreacion = diaCreacion;
        this.mesCreacion = mesCreacion;
        this.annioCreacion = annioCreacion;
        this.horaCreacion = horaCreacion;
        this.diaModificacion = diaModificacion;
        this.mesModificacion = mesModificacion;
        this.annioModificacion = annioModificacion;
        this.annnioModificacion = annnioModificacion;
        this.horaModificacion = horaModificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getMd() {
        return md;
    }

    public void setMd(String md) {
        this.md = md;
    }

    public String getMx() {
        return mx;
    }

    public void setMx(String mx) {
        this.mx = mx;
    }

    public String getHules() {
        return hules;
    }

    public void setHules(String hules) {
        this.hules = hules;
    }

    public String getCadenas() {
        return cadenas;
    }

    public void setCadenas(String cadenas) {
        this.cadenas = cadenas;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getDiaCreacion() {
        return diaCreacion;
    }

    public void setDiaCreacion(int diaCreacion) {
        this.diaCreacion = diaCreacion;
    }

    public int getMesCreacion() {
        return mesCreacion;
    }

    public void setMesCreacion(int mesCreacion) {
        this.mesCreacion = mesCreacion;
    }

    public int getAnnioCreacion() {
        return annioCreacion;
    }

    public void setAnnioCreacion(int annioCreacion) {
        this.annioCreacion = annioCreacion;
    }

    public String getHoraCreacion() {
        return horaCreacion;
    }

    public void setHoraCreacion(String horaCreacion) {
        this.horaCreacion = horaCreacion;
    }

    public int getDiaModificacion() {
        return diaModificacion;
    }

    public void setDiaModificacion(int diaModificacion) {
        this.diaModificacion = diaModificacion;
    }

    public int getMesModificacion() {
        return mesModificacion;
    }

    public void setMesModificacion(int mesModificacion) {
        this.mesModificacion = mesModificacion;
    }

    public int getAnnioModificacion() {
        return annioModificacion;
    }

    public void setAnnioModificacion(int annioModificacion) {
        this.annioModificacion = annioModificacion;
    }

    public int getAnnnioModificacion() {
        return annnioModificacion;
    }

    public void setAnnnioModificacion(int annnioModificacion) {
        this.annnioModificacion = annnioModificacion;
    }

    public String getHoraModificacion() {
        return horaModificacion;
    }

    public void setHoraModificacion(String horaModificacion) {
        this.horaModificacion = horaModificacion;
    }
}