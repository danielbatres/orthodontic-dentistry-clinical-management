package com.model;

import java.util.ArrayList;

/**
 * <h1>Factura</h1>
 * 
 * Clase modelo para facturas de consultas
 * 
 * @author Daniel Batres
 * @version 1.0.0
 * @since 13/09/22
 */
public class FacturaModel {
    private int id;
    private float saldo;
    private ArrayList<MontosModel> montos;
    private String nombrePaciente;
    private float totales;
    private int diaCreacion;
    private int mesCreacion;
    private int annioCreacion;
    private String horaCreacion;
    private int diaModificacion;
    private int mesModificacion;
    private int annioModificacion;
    private String horaModificacion;

    /** 
     * Creacion de nueva factura
     */
    public FacturaModel() {
        this.montos = new ArrayList<>(4);
        
    }

    public FacturaModel(int id, float saldo, String nombrePaciente, float totales, int diaCreacion, int mesCreacion, int annioCreacion, String horaCreacion, int diaModificacion, int mesModificacion, int annioModificacion, String horaModificacion) {
        this.id = id;
        this.saldo = saldo;
        this.montos = new ArrayList<>(4);
        this.nombrePaciente = nombrePaciente;
        this.totales = totales;
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

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getTotales() {
        return totales;
    }

    public void setTotales(float totales) {
        this.totales = totales;
    }
    
    public ArrayList<MontosModel> getMontos() {
        return montos;
    }

    public void setMontos(ArrayList<MontosModel> montos) {
        this.montos = montos;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
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
