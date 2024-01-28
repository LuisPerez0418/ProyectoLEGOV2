package modelo;

import javax.swing.JOptionPane;

public class ModeloMovRecUni {

    private double posInicial;
    private double posFinal;
    private double tiempoInicial;
    private double tiempoFinal;
    private double velocidad;

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
        if (tiempoFinal > this.getTiempoInicial()) {
            this.tiempoFinal = tiempoFinal;
        } else {
            JOptionPane.showMessageDialog(null, "El tiempo final no "
                    + "puede ser menor que el tiempo inicial.", "Error", 0);
        }
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

}
