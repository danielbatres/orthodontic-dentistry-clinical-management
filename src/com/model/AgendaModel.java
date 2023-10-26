package com.model;

import java.util.ArrayList;

/**
 * <h1>Agenda</h1>
 * 
 * Clase modelo para la agenda de los pacientes
 * 
 * @author Daniel Batres
 * @version 1.0.0
 * @since 13/09/22
 */
public class AgendaModel {
    private int id;
    private ArrayList<ConsultaModel> consultas = new ArrayList<>();

    /** 
     * Creacion de nueva agenda 
     */
    public AgendaModel() {
        
    }
    
    /*------------------ Getters and setters --------------------*/
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<ConsultaModel> getConsultas() {
        return consultas;
    }

    public void setConsultas(ArrayList<ConsultaModel> consultas) {
        this.consultas = consultas;
    }
    
    /*------------------ Getters and setters --------------------*/
}
