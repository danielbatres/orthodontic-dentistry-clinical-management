package com.model;

/**
 * <h1>Asistente</h1>
 
 Clase modelo para asistentes, extiende de UsuarioModel
 * 
 * @see UsuarioModel
 * 
 * @author Daniel Batres
 * @version 1.0.0
 * @since 13/09/22
 */
public class AsistenteModel extends Usuario {
    private String paletaPreferencia;
    private String especialidad;
    private String estadoActividad;

    /** 
     * Creacion de nuevo Asistente
     */
    public AsistenteModel() {
    }

    public AsistenteModel(String paletaPreferencia, String especialidad, String estadoActividad, int id, int edad, int diaNacimiento, int mesNacimiento, int annioNacimiento, String nombres, String apellidos, String genero, String telefonoCasa, String telefonoCelular, String direccion, String departamento, String municipio, String foto, String correoElectronico, String contrasena, int diaCreacion, int mesCreacion, int annioCreacion, String horaCreacion, int diaModificacion, int mesModificacion, int annioModificacion, String horaModificacion) {
        super(id, edad, diaNacimiento, mesNacimiento, annioNacimiento, nombres, apellidos, genero, telefonoCasa, telefonoCelular, direccion, departamento, municipio, foto, correoElectronico, contrasena, diaCreacion, mesCreacion, annioCreacion, horaCreacion, diaModificacion, mesModificacion, annioModificacion, horaModificacion);
        this.paletaPreferencia = paletaPreferencia;
        this.especialidad = especialidad;
        this.estadoActividad = estadoActividad;
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

    public String getEstadoActividad() {
        return estadoActividad;
    }

    public void setEstadoActividad(String estadoActividad) {
        this.estadoActividad = estadoActividad;
    }
    
    /*------------------ Getters and setters --------------------*/
}
