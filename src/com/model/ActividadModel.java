package com.model;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 8/10/2022
 */
public class ActividadModel {
    private String nombres;
    private String apellidos;
    private String mensajeActividad;
    private String descripcionActividad;
    private int diaActividad;
    private int mesActividad;
    private int annioActividad;
    private String horaActividad;

    public ActividadModel() {
        
    }

    public ActividadModel(String nombres, String apellidos, String mensajeActividad, String descripcionActividad, int diaActividad, int mesActividad, int annioActividad, String horaActividad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.mensajeActividad = mensajeActividad;
        this.descripcionActividad = descripcionActividad;
        this.diaActividad = diaActividad;
        this.mesActividad = mesActividad;
        this.annioActividad = annioActividad;
        this.horaActividad = horaActividad;
    }

    public String getMensajeActividad() {
        return mensajeActividad;
    }

    public void setMensajeActividad(String mensajeActividad) {
        this.mensajeActividad = mensajeActividad;
    }

    public int getDiaActividad() {
        return diaActividad;
    }

    public void setDiaActividad(int diaActividad) {
        this.diaActividad = diaActividad;
    }

    public int getMesActividad() {
        return mesActividad;
    }

    public void setMesActividad(int mesActividad) {
        this.mesActividad = mesActividad;
    }

    public int getAnnioActividad() {
        return annioActividad;
    }

    public void setAnnioActividad(int annioActividad) {
        this.annioActividad = annioActividad;
    }

    public String getHoraActividad() {
        return horaActividad;
    }

    public void setHoraActividad(String horaActividad) {
        this.horaActividad = horaActividad;
    }

    public String getDescripcionActividad() {
        return descripcionActividad;
    }

    public void setDescripcionActividad(String descripcionActividad) {
        this.descripcionActividad = descripcionActividad;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
