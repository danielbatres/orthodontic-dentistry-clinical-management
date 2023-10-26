package com.model;

import java.awt.image.BufferedImage;
import java.io.InputStream;

/**
 * <h1>Radiografia</h1>
 * 
 * Clase modelo para radiografia
 * 
 * @author Daniel Batres
 * @version 1.0.0
 * @since 13/09/22
 */

public class RadiografiaModel {
    private int id; 
    private InputStream imagen;
    private BufferedImage imagenIcon;
    private String nombreImagen;
    private RadiografiaType tipo;
    private String tratamiento;
    private String fechaDeCreacion;

    /** 
     * Creacion de nueva radiografia
     */
    public RadiografiaModel() {
        
    }

    public RadiografiaModel(int id, InputStream imagen, BufferedImage imagenIcon, String nombreImagen, RadiografiaType tipo, String tratamiento, String fechaDeCreacion) {
        this.id = id;
        this.imagen = imagen;
        this.imagenIcon = imagenIcon;
        this.nombreImagen = nombreImagen;
        this.tipo = tipo;
        this.tratamiento = tratamiento;
        this.fechaDeCreacion = fechaDeCreacion;
    }
    
    /*------------------ Getters and setters --------------------*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public InputStream getImagen() {
        return imagen;
    }

    public void setImagen(InputStream imagen) {
        this.imagen = imagen;
    }
    
    public RadiografiaType getTipo() {
        return tipo;
    }

    public void setTipo(RadiografiaType tipo) {
        this.tipo = tipo;
    }
    
    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
    
    public String getNombreImagen() {
        return nombreImagen;
    }

    public void setNombreImagen(String nombreImagen) {
        this.nombreImagen = nombreImagen;
    }
    
    public BufferedImage getImagenIcon() {
        return imagenIcon;
    }

    public void setImagenIcon(BufferedImage imagenIcon) {
        this.imagenIcon = imagenIcon;
    }
    
    public String getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(String fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }
    
    /*------------------ Getters and setters --------------------*/
}