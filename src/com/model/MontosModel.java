package com.model;

/**
 *
 * @author Daniel Batres
 */
public class MontosModel {
    private int idMontos;
    private float monto;
    private String anotaciones;

    public MontosModel() {
        
    }

    public MontosModel(float monto, String anotaciones) {
        this.monto = monto;
        this.anotaciones = anotaciones;
    }

    public int getIdMontos() {
        return idMontos;
    }

    public void setIdMontos(int idMontos) {
        this.idMontos = idMontos;
    }
    
    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getAnotaciones() {
        return anotaciones;
    }

    public void setAnotaciones(String anotaciones) {
        this.anotaciones = anotaciones;
    }
}
