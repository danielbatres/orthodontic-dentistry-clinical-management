package com.context;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 02/10/22
 * @param <T>
 */
public class SesionUsuario<T> {
    private final T sesionUsuario;

    public SesionUsuario(T sesionUsuario) {
        this.sesionUsuario = sesionUsuario;
    }
    
    public T getSesionUsuario() {
        return sesionUsuario;
    }
}
