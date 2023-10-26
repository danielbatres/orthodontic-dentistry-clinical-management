package com.model;

/**
 * <h1>Consulta</h1>
 * 
 * Clase modelo para las consultas de los pacientes
 * 
 * @author Daniel Batres
 * @version 1.0.0
 * @since 13/09/22
 */
public class ConsultaModel {
    private int id;
    private String nombres;
    private String apellidos;
    private String contacto;
    private int diaDeConsulta;
    private int mesDeConsulta;
    private int annioDeConsulta;
    private String horaDeConsulta;
    private boolean consultaRealizada;
    private String tratamientoDeConsulta;
    private FacturaModel facturaConsulta;
    private int diaCreacion;
    private int mesCreacion;
    private int annioCreacion;
    private String horaCreacion;
    private int diaModificacion;
    private int mesModificacion;
    private int annioModificacion;
    private String horaModificacion;

    /** 
     * Creacion de nueva consulta
     */
    public ConsultaModel() {
        
    }

    public ConsultaModel(int id, String nombres, String apellidos, String contacto, int diaDeConsulta, int mesDeConsulta, int annioDeConsulta, String horaDeConsulta, boolean consultaRealizada, String tratamientoDeConsulta, FacturaModel facturaConsulta, int diaCreacion, int mesCreacion, int annioCreacion, String horaCreacion, int diaModificacion, int mesModificacion, int annioModificacion, String horaModificacion) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.contacto = contacto;
        this.diaDeConsulta = diaDeConsulta;
        this.mesDeConsulta = mesDeConsulta;
        this.annioDeConsulta = annioDeConsulta;
        this.horaDeConsulta = horaDeConsulta;
        this.consultaRealizada = consultaRealizada;
        this.tratamientoDeConsulta = tratamientoDeConsulta;
        this.facturaConsulta = facturaConsulta;
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

    public int getDiaDeConsulta() {
        return diaDeConsulta;
    }

    public void setDiaDeConsulta(int diaDeConsulta) {
        this.diaDeConsulta = diaDeConsulta;
    }

    public int getMesDeConsulta() {
        return mesDeConsulta;
    }

    public void setMesDeConsulta(int mesDeConsulta) {
        this.mesDeConsulta = mesDeConsulta;
    }

    public int getAnnioDeConsulta() {
        return annioDeConsulta;
    }

    public void setAnnioDeConsulta(int annioDeConsulta) {
        this.annioDeConsulta = annioDeConsulta;
    }

    public boolean isConsultaRealizada() {
        return consultaRealizada;
    }

    public void setConsultaRealizada(boolean consultaRealizada) {
        this.consultaRealizada = consultaRealizada;
    }

    public String getTratamientoDeConsulta() {
        return tratamientoDeConsulta;
    }

    public void setTratamientoDeConsulta(String tratamientoDeConsulta) {
        this.tratamientoDeConsulta = tratamientoDeConsulta;
    }

    public FacturaModel getFacturaConsulta() {
        return facturaConsulta;
    }

    public void setFacturaConsulta(FacturaModel facturaConsulta) {
        this.facturaConsulta = facturaConsulta;
    }
    
    public String getHoraDeConsulta() {
        return horaDeConsulta;
    }

    public void setHoraDeConsulta(String horaDeConsulta) {
        this.horaDeConsulta = horaDeConsulta;
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

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    
    /*------------------ Getters and setters --------------------*/ 
}
