package controlador;

public class ControladorMovRecUniAce extends modelo.ModeloMovHorizontal {

    public ControladorMovRecUniAce() {

    }

    public ControladorMovRecUniAce(double tiempoInicial, double tiempoFinal,
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

    private double getTiempo() {
        return (getTiempoFinal() - getTiempoInicial());
    }

    private double getPosicion() {
        return getPosFinal() - getPosInicial();
    }

    //----- Velocidad inicial ------//
    public double calcularVelocidadInicialFUno() {
        return (getVelocidadFinal() + getAceleracion() * getTiempo());
    }

    public double calcularVelocidadInicialFDos() {
        return 2 * (getPosicion() / getTiempo()) - getVelocidadFinal();
    }

    public double calcularVelocidadInicialFTres() {
        return (getPosicion() / getTiempo()) - (1 / 2) * getAceleracion() * getTiempo();
    }

    //----- Velocidad final ------//
    public double calcularVelocidadFinalFUno() {
        return getVelocidadInicial() + getAceleracion() * getTiempo();
    }

    public double calcularVelocidadFinalFDos() {
        return 2 * (getPosicion() / getTiempo()) - getVelocidadInicial();
    }

    public double calcularVelocidadFinalFTres() {
        return (getPosicion() / getTiempo()) + (1 / 2) * getAceleracion() * getTiempo();
    }

    //----- Distancia -----//
    public double calcularDistanciaFUno() {
        return ((getVelocidadInicial() * getTiempo()) + 0.5
                + (getAceleracion() * Math.pow(getTiempo(), 2))) + getPosInicial();
    }

    public double calcularDistanciaFDos() {
        return (((getVelocidadFinal() + getVelocidadInicial()) / 2) * getTiempo()) + getPosInicial();
    }

    public double calcularDistanciaFTres() {
        return (Math.pow(getVelocidadFinal(), 2) - Math.pow(getVelocidadInicial(), 2))
                / (2 * getAceleracion()) + getPosInicial();
    }

    //----- Tiempo -----//
    public double calcularTiempoFUno() {
        return (getVelocidadFinal() - getVelocidadInicial()) / getAceleracion();
    }

    public double calcularTiempoFDos() {
        return (2 * getPosicion()) / (getVelocidadFinal() + getVelocidadInicial());
    }

    //----- Aceleración ------//
    public double calcularAceleracionFUno() {
        return ((getVelocidadFinal() - getVelocidadInicial()) / getTiempo()) - getVelocidadInicial();
    }

    public double calcularAceleracionFDos() {
        return (getPosicion() - (getVelocidadInicial() * getTiempo()))
                / ((1 / 2) * Math.pow(getTiempo(), 2));
    }

    public double calcularAceleracionFTres() {
        return (Math.pow(getVelocidadFinal(), 2) - Math.pow(getVelocidadInicial(), 2))
                / (2 * getPosicion());
    }
}
