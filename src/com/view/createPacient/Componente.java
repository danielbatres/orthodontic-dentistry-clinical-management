package com.view.createPacient;

/**
 *
 * @author danie
 */
public class Componente<T, V> {
    private T campoAsociado;
    private V containerAsociado;
    private boolean estado = false;

    public Componente(T campoAsociado, V containerAsociado) {
        this.campoAsociado = campoAsociado;
        this.containerAsociado = containerAsociado;
    }

    public T getCampoAsociado() {
        return campoAsociado;
    }

    public void setCampoAsociado(T campoAsociado) {
        this.campoAsociado = campoAsociado;
    }

    public V getContainerAsociado() {
        return containerAsociado;
    }

    public void setContainerAsociado(V containerAsociado) {
        this.containerAsociado = containerAsociado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
