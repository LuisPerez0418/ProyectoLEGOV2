package modelo;

public class ModeloMovRecUniAce {

    private double posInicial;
    private double posFinal;
    private double tiempoInicial;
    private double tiempoFinal;
    private double tiempo;
    private double velocidadInicial;
    private double velocidadFinal;
    private double aceleracion;

    public ModeloMovRecUniAce() {
    }

    public ModeloMovRecUniAce(double tiempoInicial, double tiempoFinal,
            double posInicial, double posFinal, double aceleracion,
            double velocidadInicial, double velocidadFinal) {
        setTiempoInicial(tiempoInicial);
        setTiempoFinal(tiempoFinal);
        setPosInicial(posInicial);
        setPosFinal(posFinal);
        setAceleracion(aceleracion);
        setVelocidadInicial(velocidadInicial);
        setVelocidadFinal(velocidadFinal);
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

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
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

    //----- Métodos para calcular ------//
    public double calcularVelocidadInicial() {
        return (getPosFinal() - getPosInicial()) / (getTiempo());
    }

    public double calcularVelocidadFinal() {
        return (getVelocidadInicial() + (getAceleracion() * getTiempo()));
    }

    public double calcularDistancia() {
        return ((getVelocidadFinal() + getVelocidadInicial()) / 2) * getTiempo();
    }

    public double calcularTiempo() {
        return (getVelocidadFinal() - getVelocidadInicial()) / getAceleracion();
    }

    public double calcularAceleracion() {
        return ((getVelocidadFinal() - getVelocidadInicial()) / (getTiempo()));
    }

}
