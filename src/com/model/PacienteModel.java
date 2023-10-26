package com.model;

import java.util.ArrayList;

/**
 * <h1>Paciente</h1>
 
 Clase modelo para pacientes, extiende de UsuarioModel
 * 
 * @see UsuarioModel
 * 
 * @author Daniel Batres
 * @version 1.0.0
 * @since 13/09/22
 */
public class PacienteModel extends Usuario {
    private boolean tratamientoOdontologico;
    private boolean tratamientoOrtodontico;
    private FichaOdontologicaModel fichaOdontologia;
    private FichaOrtodonciaModel fichaOrtodoncia;
    private String parentesco;
    private String responsables;
    private AgendaModel agenda;
    private String estadoDeActividad;
    private ArrayList<ControlMensualModel> controlMensual;
    private ArrayList<ConsultaModel> consultas;
    
    /** 
     * Creacion de nuevo Paciente
     */
    public PacienteModel() {
        
    }

    public PacienteModel(boolean tratamientoOdontologico, boolean tratamientoOrtodontico, FichaOdontologicaModel fichaOdontologia, FichaOrtodonciaModel fichaOrtodoncia, String parentesco, String responsables, AgendaModel agenda, String estadoDeActividad, ArrayList<ControlMensualModel> controlMensual, ArrayList<ConsultaModel> consultas, int id, int edad, int diaNacimiento, int mesNacimiento, int annioNacimiento, String nombres, String apellidos, String genero, String telefonoCasa, String telefonoCelular, String direccion, String departamento, String municipio, String foto, String correoElectronico, String contrasena, int diaCreacion, int mesCreacion, int annioCreacion, String horaCreacion, int diaModificacion, int mesModificacion, int annioModificacion, String horaModificacion) {
        super(id, edad, diaNacimiento, mesNacimiento, annioNacimiento, nombres, apellidos, genero, telefonoCasa, telefonoCelular, direccion, departamento, municipio, foto, correoElectronico, contrasena, diaCreacion, mesCreacion, annioCreacion, horaCreacion, diaModificacion, mesModificacion, annioModificacion, horaModificacion);
        this.tratamientoOdontologico = tratamientoOdontologico;
        this.tratamientoOrtodontico = tratamientoOrtodontico;
        this.fichaOdontologia = fichaOdontologia;
        this.fichaOrtodoncia = fichaOrtodoncia;
        this.parentesco = parentesco;
        this.responsables = responsables;
        this.agenda = agenda;
        this.estadoDeActividad = estadoDeActividad;
        this.controlMensual = controlMensual;
        this.consultas = consultas;
    }

    /*------------------ Getters and setters --------------------*/
    
    public boolean isTratamientoOdontologico() {
        return tratamientoOdontologico;
    }

    public void setTratamientoOdontologico(boolean tratamientoOdontologico) {
        this.tratamientoOdontologico = tratamientoOdontologico;
    }

    public boolean isTratamientoOrtodontico() {
        return tratamientoOrtodontico;
    }

    public void setTratamientoOrtodontico(boolean tratamientoOrtodontico) {
        this.tratamientoOrtodontico = tratamientoOrtodontico;
    }

    public AgendaModel getAgenda() {
        return agenda;
    }

    public void setAgenda(AgendaModel agenda) {
        this.agenda = agenda;
    }
    
    public String getEstadoDeActividad() {
        return estadoDeActividad;
    }

    public void setEstadoDeActividad(String estadoDeActividad) {
        this.estadoDeActividad = estadoDeActividad;
    }
    
    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getResponsables() {
        return responsables;
    }

    public void setResponsables(String responsables) {
        this.responsables = responsables;
    }
    
    public FichaOdontologicaModel getFichaOdontologia() {
        return fichaOdontologia;
    }

    public void setFichaOdontologia(FichaOdontologicaModel fichaOdontologia) {
        this.fichaOdontologia = fichaOdontologia;
    }

    public FichaOrtodonciaModel getFichaOrtodoncia() {
        return fichaOrtodoncia;
    }

    public void setFichaOrtodoncia(FichaOrtodonciaModel fichaOrtodoncia) {
        this.fichaOrtodoncia = fichaOrtodoncia;
    }
    
    public ArrayList<ControlMensualModel> getControlMensual() {
        return controlMensual;
    }

    public void setControlMensual(ArrayList<ControlMensualModel> controlMensual) {
        this.controlMensual = controlMensual;
    }
    
    public ArrayList<ConsultaModel> getConsultas() {
        return consultas;
    }

    public void setConsultas(ArrayList<ConsultaModel> consultas) {
        this.consultas = consultas;
    }
    
    /*------------------ Getters and setters --------------------*/
}
