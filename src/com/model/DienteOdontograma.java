package com.model;

/**
 * <h1>DienteOdontograma</h1>
 * 
 * Clase modelo para diente unitario dentro de un odontograma
 * 
 * @author Daniel Batres
 * @version 1.0.0
 * @since 13/09/22
 */
public class DienteOdontograma {
    private int id;
    private int numeroDiente;
    private String centerState;
    private String topState;
    private String leftState;
    private String rightState;
    private String bottomState;

    /** 
     * Creacion de nuevo diente para odontograma
     */
    public DienteOdontograma() {
        
    }

    /** 
     * Creacion de nuevo diente para odontograma con atributos indicados
     * 
     * @param numeroDiente numero para el diente correspondiente
     * @param centerState estado para el centro del diente
     * @param topState estado para la parte superior del diente
     * @param leftState estado para la parte izquierda del diente
     * @param rightState estado para la parte derecha del diente
     * @param bottomState estado para la parte inferior del diente
     */
    public DienteOdontograma(int numeroDiente, String centerState, String topState, String leftState, String rightState, String bottomState) {
        this.numeroDiente = numeroDiente;
        this.centerState = centerState;
        this.topState = topState;
        this.leftState = leftState;
        this.rightState = rightState;
        this.bottomState = bottomState;
    }

    /*------------------ Getters and setters --------------------*/
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroDiente() {
        return numeroDiente;
    }

    public void setNumeroDiente(int numeroDiente) {
        this.numeroDiente = numeroDiente;
    }

    public String getCenterState() {
        return centerState;
    }

    public void setCenterState(String centerState) {
        this.centerState = centerState;
    }

    public String getTopState() {
        return topState;
    }

    public void setTopState(String topState) {
        this.topState = topState;
    }

    public String getLeftState() {
        return leftState;
    }

    public void setLeftState(String leftState) {
        this.leftState = leftState;
    }

    public String getRightState() {
        return rightState;
    }

    public void setRightState(String rightState) {
        this.rightState = rightState;
    }

    public String getBottomState() {
        return bottomState;
    }

    public void setBottomState(String bottomState) {
        this.bottomState = bottomState;
    }
    
    /*------------------ Getters and setters --------------------*/
}
