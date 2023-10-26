package com.model;

/**
 * <h1>FichaOdontologica</h1>
 * 
 * Clase modelo para las fichas odontologicas extiende de Ficha
 * 
 * @see Ficha
 * 
 * @author Daniel Batres
 * @version 1.0.0
 * @since 13/09/22
 */
public class FichaOdontologicaModel extends Ficha {
    private String tipoDeAnestesico;
    private String medicamentos;
    private String protesis;
    private String anotacionesProtesis;
    private OdontogramaModel odontograma;
    private String tipoOdontograma;

    /** 
     * Creacion de nueva ficha odontologica
     */
    public FichaOdontologicaModel() {
    }

    public FichaOdontologicaModel(String tipoDeAnestesico, String medicamentos, String protesis, String anotacionesProtesis, OdontogramaModel odontograma, String tipoOdontograma, int id, PacienteModel paciente, String HM, String HO, String observaciones, int diaCreacion, int mesCreacion, int annioCreacion, String horaCreacion, int diaModificacion, int mesModificacion, int annioModificacion, String horaModificacion) {
        super(id, paciente, HM, HO, observaciones, diaCreacion, mesCreacion, annioCreacion, horaCreacion, diaModificacion, mesModificacion, annioModificacion, horaModificacion);
        this.tipoDeAnestesico = tipoDeAnestesico;
        this.medicamentos = medicamentos;
        this.protesis = protesis;
        this.anotacionesProtesis = anotacionesProtesis;
        this.odontograma = odontograma;
        this.tipoOdontograma = tipoOdontograma;
    }
    
    /*------------------ Getters and setters --------------------*/
    
    public String getTipoDeAnestesico() {
        return tipoDeAnestesico;
    }

    public void setTipoDeAnestesico(String tipoDeAnestesico) {
        this.tipoDeAnestesico = tipoDeAnestesico;
    }

    public String getProtesis() {
        return protesis;
    }

    public void setProtesis(String protesis) {
        this.protesis = protesis;
    }

    public String getAnotacionesProtesis() {
        return anotacionesProtesis;
    }

    public void setAnotacionesProtesis(String anotacionesProtesis) {
        this.anotacionesProtesis = anotacionesProtesis;
    }

    public OdontogramaModel getOdontograma() {
        return odontograma;
    }

    public void setOdontograma(OdontogramaModel odontograma) {
        this.odontograma = odontograma;
    }
    
    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }
    
    public String getTipoOdontograma() {
        return tipoOdontograma;
    }

    public void setTipoOdontograma(String tipoOdontograma) {
        this.tipoOdontograma = tipoOdontograma;
    }
    
    /*------------------ Getters and setters --------------------*/
}
