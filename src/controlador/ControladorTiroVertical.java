package controlador;

public class ControladorTiroVertical extends modelo.ModeloMovVertical {

    public ControladorTiroVertical() {

    }

    public ControladorTiroVertical(double velocidadInicial, double velocidadFinal,
            double gravedad, double tiempo, double altura) {
        setVelocidadInicial(velocidadInicial);
        setVelocidadFinal(velocidadFinal);
        setGravedad(gravedad);
        setTiempo(tiempo);
        setAltura(altura);
    }

    //----- Velocidad inicial ------//
    public double calcularVelocidadInicialFUno() {
        return (getVelocidadFinal() + getGravedad() * getTiempo());
    }

    public double calcularVelocidadInicialFDos() {
        return 2 * (getAltura() / getTiempo()) - getVelocidadFinal();
    }

    public double calcularVelocidadInicialFTres() {
        return (getAltura() / getTiempo()) - (1 / 2) * getGravedad() * getTiempo();
    }

    //----- Tiempo -----//
    public double calcularTiempoFUno() {
        return (getVelocidadFinal() - getVelocidadInicial()) / getGravedad();
    }

    public double calcularTiempoFDos() {
        return (2 * getAltura()) / (getVelocidadFinal() + getVelocidadInicial());
    }

    public double calcularTiempoFTres() {
        return Math.sqrt(getAltura() / (getGravedad() / 2));
    }

    //----- Gravedad ------//
    public double calcularGravedadFUno() {
        return (getAltura() - (getVelocidadInicial() * getTiempo()))
                / ((1 / 2) * Math.pow(getTiempo(), 2));
    }

    public double calcularGravedadFDos() {
        return (Math.pow(getVelocidadFinal(), 2) - Math.pow(getVelocidadInicial(), 2))
                / (2 * getAltura());
    }

    public double calcularGravedadFTres() {
        return -(getAltura() - (getVelocidadFinal() * getTiempo()))
                / ((1 / 2) * Math.pow(getTiempo(), 2));
    }

    //----- Altura -----//
    public double calcularAlturaFUno() {
        return getVelocidadInicial() * getTiempo() - (1 / 2) * getGravedad()
                * Math.pow(getTiempo(), 2);
    }

    public double calcularAlturaFDos() {
        return ((getVelocidadInicial() + getVelocidadFinal()) / 2) * getTiempo();
    }

    public double calcularAlturaFTres() {
        return (Math.pow(getVelocidadFinal(), 2) + Math.pow(getVelocidadInicial(), 2))
                / (2 * getGravedad());
    }

}
