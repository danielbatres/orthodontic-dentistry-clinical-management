package com.model;

/**
 * <h1>FichaOrtodoncia</h1>
 * 
 * Clase modelo para la ficha de ortodoncia 
 * 
 * 
 * @author Daniel Batres
 * @version 1.0.0
 * @since 13/09/22
 */
public class FichaOrtodonciaModel extends Ficha {
    private String perfilTotal;
    private String perfilTercioInf; 
    private String anguloNasolabial;
    private String anguloCuelloMenton;
    private String encias;
    private String frenillos;
    private String RMD;
    private String RMI;
    private String RCD;
    private String RCI;
    private String SMH;
    private String SMV;
    private String tipoDenticion;
    private String lineasMedias;
    private boolean extracciones;

    /** 
     * Creacion de nueva Ficha Ortodontica
     */
    public FichaOrtodonciaModel() {
    }

    public FichaOrtodonciaModel(String perfilTotal, String perfilTercioInf, String anguloNasolabial, String anguloCuelloMenton, String encias, String frenillos, String RMD, String RMI, String RCD, String RCI, String SMH, String SMV, String tipoDenticion, String lineasMedias, boolean extracciones, int id, PacienteModel paciente, String HM, String HO, String observaciones, int diaCreacion, int mesCreacion, int annioCreacion, String horaCreacion, int diaModificacion, int mesModificacion, int annioModificacion, String horaModificacion) {
        super(id, paciente, HM, HO, observaciones, diaCreacion, mesCreacion, annioCreacion, horaCreacion, diaModificacion, mesModificacion, annioModificacion, horaModificacion);
        this.perfilTotal = perfilTotal;
        this.perfilTercioInf = perfilTercioInf;
        this.anguloNasolabial = anguloNasolabial;
        this.anguloCuelloMenton = anguloCuelloMenton;
        this.encias = encias;
        this.frenillos = frenillos;
        this.RMD = RMD;
        this.RMI = RMI;
        this.RCD = RCD;
        this.RCI = RCI;
        this.SMH = SMH;
        this.SMV = SMV;
        this.tipoDenticion = tipoDenticion;
        this.lineasMedias = lineasMedias;
        this.extracciones = extracciones;
    }

    /*------------------ Getters and setters --------------------*/
    
    public String getPerfilTotal() {
        return perfilTotal;
    }

    public void setPerfilTotal(String perfilTotal) {
        this.perfilTotal = perfilTotal;
    }

    public String getPerfilTercioInf() {
        return perfilTercioInf;
    }

    public void setPerfilTercioInf(String perfilTercioInf) {
        this.perfilTercioInf = perfilTercioInf;
    }

    public String getAnguloNasolabial() {
        return anguloNasolabial;
    }

    public void setAnguloNasolabial(String anguloNasolabial) {
        this.anguloNasolabial = anguloNasolabial;
    }

    public String getAnguloCuelloMenton() {
        return anguloCuelloMenton;
    }

    public void setAnguloCuelloMenton(String anguloCuelloMenton) {
        this.anguloCuelloMenton = anguloCuelloMenton;
    }

    public String getEncias() {
        return encias;
    }

    public void setEncias(String encias) {
        this.encias = encias;
    }

    public String getFrenillos() {
        return frenillos;
    }

    public void setFrenillos(String frenillos) {
        this.frenillos = frenillos;
    }

    public String getRMD() {
        return RMD;
    }

    public void setRMD(String RMD) {
        this.RMD = RMD;
    }

    public String getRMI() {
        return RMI;
    }

    public void setRMI(String RMI) {
        this.RMI = RMI;
    }

    public String getRCD() {
        return RCD;
    }

    public void setRCD(String RCD) {
        this.RCD = RCD;
    }

    public String getRCI() {
        return RCI;
    }

    public void setRCI(String RCI) {
        this.RCI = RCI;
    }

    public String getSMH() {
        return SMH;
    }

    public void setSMH(String SMH) {
        this.SMH = SMH;
    }

    public String getSMV() {
        return SMV;
    }

    public void setSMV(String SMV) {
        this.SMV = SMV;
    }

    public String getTipoDenticion() {
        return tipoDenticion;
    }

    public void setTipoDenticion(String tipoDenticion) {
        this.tipoDenticion = tipoDenticion;
    }

    public String getLineasMedias() {
        return lineasMedias;
    }

    public void setLineasMedias(String lineasMedias) {
        this.lineasMedias = lineasMedias;
    }

    public boolean isExtracciones() {
        return extracciones;
    }

    public void setExtracciones(boolean extracciones) {
        this.extracciones = extracciones;
    }
    
    /*------------------ Getters and setters --------------------*/
}
