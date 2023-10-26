package com.model;

/**
 * <h1>Doctor</h1>
 
 Clase modelo para doctores, extiende de UsuarioModel
 * 
 * @see UsuarioModel
 * 
 * @author Daniel Batres
 * @version 1.0.0
 * @since 13/09/22
 */
public class DoctorModel extends Usuario {
    private String paletaPreferencia;
    private String especialidad;
    
    /** 
     * Creacion de nuevo Doctor
     */
    public DoctorModel() {
    }

    public DoctorModel(String paletaPreferencia, String especialidad, int id, int edad, int diaNacimiento, int mesNacimiento, int annioNacimiento, String nombres, String apellidos, String genero, String telefonoCasa, String telefonoCelular, String direccion, String departamento, String municipio, String foto, String correoElectronico, String contrasena, int diaCreacion, int mesCreacion, int annioCreacion, String horaCreacion, int diaModificacion, int mesModificacion, int annioModificacion, String horaModificacion) {
        super(id, edad, diaNacimiento, mesNacimiento, annioNacimiento, nombres, apellidos, genero, telefonoCasa, telefonoCelular, direccion, departamento, municipio, foto, correoElectronico, contrasena, diaCreacion, mesCreacion, annioCreacion, horaCreacion, diaModificacion, mesModificacion, annioModificacion, horaModificacion);
        this.paletaPreferencia = paletaPreferencia;
        this.especialidad = especialidad;
    }
    
    /*------------------ Getters and setters --------------------*/

    public String getEspecialidad() {
        return especialidad;
    }
    
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public String getPaletaPreferencia() {
        return paletaPreferencia;
    }

    public void setPaletaPreferencia(String paletaPreferencia) {
        this.paletaPreferencia = paletaPreferencia;
    }
    
    /*------------------ Getters and setters --------------------*/
}
