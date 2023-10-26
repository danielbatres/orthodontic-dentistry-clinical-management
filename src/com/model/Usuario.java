package com.model;

/**
 * <h1>UsuarioModel</h1>
 * 
 * Clase padre, modelo para usuarios
 * 
 * @author Daniel Batres
 * @version 1.0.0
 * @since 13/09/22
 */
public class Usuario {
    private int id;
    private int edad;
    private int diaNacimiento;
    private int mesNacimiento;
    private int annioNacimiento;
    private String nombres;
    private String apellidos;
    private String genero;
    private String telefonoCasa;
    private String telefonoCelular;
    private String direccion;
    private String departamento;
    private String municipio;
    private String foto;
    private String correoElectronico;
    private String contrasena;
    private int diaCreacion;
    private int mesCreacion;
    private int annioCreacion;
    private String horaCreacion;
    private int diaModificacion;
    private int mesModificacion;
    private int annioModificacion;
    private String horaModificacion;
    
    /** 
     * Creacion  de nuevo usuario
     */
    public Usuario() {
    }

    public Usuario(int id, int edad, int diaNacimiento, int mesNacimiento, int annioNacimiento, String nombres, String apellidos, String genero, String telefonoCasa, String telefonoCelular, String direccion, String departamento, String municipio, String foto, String correoElectronico, String contrasena, int diaCreacion, int mesCreacion, int annioCreacion, String horaCreacion, int diaModificacion, int mesModificacion, int annioModificacion, String horaModificacion) {
        this.id = id;
        this.edad = edad;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.annioNacimiento = annioNacimiento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = genero;
        this.telefonoCasa = telefonoCasa;
        this.telefonoCelular = telefonoCelular;
        this.direccion = direccion;
        this.departamento = departamento;
        this.municipio = municipio;
        this.foto = foto;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int getAnnioNacimiento() {
        return annioNacimiento;
    }

    public void setAnnioNacimiento(int annioNacimiento) {
        this.annioNacimiento = annioNacimiento;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefonoCasa() {
        return telefonoCasa;
    }

    public void setTelefonoCasa(String telefonoCasa) {
        this.telefonoCasa = telefonoCasa;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
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
