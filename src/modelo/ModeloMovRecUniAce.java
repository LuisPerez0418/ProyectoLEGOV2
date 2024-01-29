package modelo;

import javax.swing.JOptionPane;

public class ModeloMovRecUniAce {

    private double posInicial;
    private double posFinal;
    private double tiempoInicial;
    private double tiempoFinal;
    private double velocidadInicial;
    private double velocidadFinal;
    private double aceleracion;

    public ModeloMovRecUniAce() {
    }

    //----- Métodos getters y setters -----//
    public double getPosInicial() {
        return posInicial;
    }

    public void setPosInicial(double posInicial) {
        this.posInicial = posInicial;
    }

    public double getPosFinal() {
        return posFinal;
    }

    public void setPosFinal(double posFinal) {
        this.posFinal = posFinal;
    }

    public double getTiempoInicial() {
        return tiempoInicial;
    }

    public void setTiempoInicial(double tiempoInicial) {
        this.tiempoInicial = tiempoInicial;
    }

    public double getTiempoFinal() {
        return tiempoFinal;
    }

    public void setTiempoFinal(double tiempoFinal) {
        if (tiempoFinal > this.tiempoInicial) {
            this.tiempoFinal = tiempoFinal;
        } else {
            JOptionPane.showMessageDialog(null, "El tiempo final no "
                    + "puede ser menor que el tiempo inicial.", "Error", 0);
        } 
    }

    public double getVelocidadInicial() {
        return velocidadInicial;
    }

    public void setVelocidadInicial(double velocidadInicial) {
        this.velocidadInicial = velocidadInicial;
    }

    public double getVelocidadFinal() {
        return velocidadFinal;
    }

    public void setVelocidadFinal(double velocidadFinal) {
        this.velocidadFinal = velocidadFinal;
    }

    public double getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }

} 