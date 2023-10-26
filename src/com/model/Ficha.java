package com.model;

import java.util.ArrayList;

/**
 * <h1>Ficha</h1>
 *
 * Clase padre modelo para las fichas
 * 
 * @author Daniel Batres
 * @version 1.0.0
 * @since 13/09/22
 */
public class Ficha {
    private int id;
    private PacienteModel paciente;
    private String HM;
    private String HO;
    private String observaciones;
    private ArrayList<RadiografiaModel> radiografias = new ArrayList<RadiografiaModel>();
    private int diaCreacion;
    private int mesCreacion;
    private int annioCreacion;
    private String horaCreacion;
    private int diaModificacion;
    private int mesModificacion;
    private int annioModificacion;
    private String horaModificacion;
    
    /** 
     * Creacion de nueva ficha
     */
    public Ficha() {
        
    }

    public Ficha(int id, PacienteModel paciente, String HM, String HO, String observaciones, int diaCreacion, int mesCreacion, int annioCreacion, String horaCreacion, int diaModificacion, int mesModificacion, int annioModificacion, String horaModificacion) {
        this.id = id;
        this.paciente = paciente;
        this.HM = HM;
        this.HO = HO;
        this.observaciones = observaciones;
        this.diaCreacion = diaCreacion;
        this.mesCreacion = mesCreacion;
        this.annioCreacion = annioCreacion;
        this.horaCreacion = horaCreacion;
        this.diaModificacion = diaModificacion;
        this.mesModificacion = mesModificacion;
        this.annioModificacion = annioModificacion;
        this.horaModificacion = horaModificacion;
    }

    /*------------------ Getters and setters --------------------*/
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PacienteModel getPaciente() {
        return paciente;
    }

    public void setPaciente(PacienteModel paciente) {
        this.paciente = paciente;
    }

    public String getHM() {
        return HM;
    }

    public void setHM(String HM) {
        this.HM = HM;
    }

    public String getHO() {
        return HO;
    }

    public void setHO(String HO) {
        this.HO = HO;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public ArrayList<RadiografiaModel> getRadiografias() {
        return radiografias;
    }

    public void setRadiografias(ArrayList<RadiografiaModel> radiografias) {
        this.radiografias = radiografias;
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

    public String getHoraModificacion() {
        return horaModificacion;
    }

    public void setHoraModificacion(String horaModificacion) {
        this.horaModificacion = horaModificacion;
    }

    /*------------------ Getters and setters --------------------*/
}
