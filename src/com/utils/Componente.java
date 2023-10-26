package com.utils;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 18/09/22
 */
public class Componente<T> {
    private T campoAsociado;
    private boolean estado = false;

    public Componente(T campoAsociado) {
        this.campoAsociado = campoAsociado;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public T getCampoAsociado() {
        return campoAsociado;
    }

    public void setCampoAsociado(T campoAsociado) {
        this.campoAsociado = campoAsociado;
    }
}
