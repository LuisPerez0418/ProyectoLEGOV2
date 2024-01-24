package modelo;

public class ModeloMovRecUni {

    private double posInicial;
    private double posFinal;
    private double tiempoInicial;
    private double tiempoFinal;
    private double velocidad;

    public ModeloMovRecUni() {

    }

    public ModeloMovRecUni(double tiempoInicial, double tiempoFinal, double velocidad,
            double posInicial, double posFinal) {
        setTiempoInicial(tiempoInicial);
        setTiempoFinal(tiempoFinal);
        setPosInicial(posInicial);
        setPosFinal(posFinal);
        setVelocidad(velocidad);
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
        this.tiempoFinal = tiempoFinal;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    //----- Métodos para calcular ------//
    public double calcularVelocidad() {
        return (getPosFinal() - getPosInicial()) / (getTiempoFinal() - getTiempoInicial());
    }

    public double calcularPosicion() {
        return getPosInicial() + getVelocidad() * (getTiempoFinal() - getTiempoInicial());
    }

    public double calcularTiempo() {
        return (getPosFinal() - getPosInicial()) / getVelocidad();
    }

}
