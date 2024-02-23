package controlador;

public class ControladorCaidaLibre extends modelo.ModeloMovVertical {

    public void ControladorCaidaLibre() {

    }

    public void ControladorCaidaLibre(double velocidadInicial,
            double velocidadFinal, double altura, double tiempo,
            double tiempoDCaida, double gravedad) {
        setVelocidadInicial(velocidadInicial);
        setVelocidadFinal(velocidadFinal);
        setAltura(altura);
        setTiempo(tiempo);
        setTiempoCaida(tiempoDCaida);
        setGravedad(gravedad);
    }

    //----- Velocidad inicial ------//
    public double calcularVelocidadInicialFUno() {
        return getVelocidadFinal() - getGravedad() * getTiempo();
    }

    public double calcularVelocidadInicialFDos() {
        return 2 * (getAltura() / getTiempo()) - getVelocidadFinal();
    }

    public double calcularVelocidadInicialFTres() {
        return (getAltura() / getTiempo()) - (1 / 2) * getGravedad() * getTiempo();
    }

    //----- Velocidad final ------//
    public double calcularVelocidadFinalFUno() {
        return 2 * (getAltura() / getTiempo()) - getVelocidadFinal();
    }

    public double calcularVelocidadFinalFDos() {
        return getVelocidadInicial() + getGravedad() * getTiempo();
    }

    public double calcularVelocidadFinalFTres() {
        return (getAltura() / getTiempo()) + (1 / 2) * getGravedad() * getTiempo();
    }

    //----- Altura -----//
    public double calcularAlturaFUno() {
        return getVelocidadInicial() * getTiempo() + (1 / 2) * getGravedad() * Math.pow(getTiempo(), 2);
    }

    public double calcularAlturaFDos() {
        return (Math.pow(getVelocidadFinal(), 2) - Math.pow(getVelocidadInicial(), 2))
                / (2 * getGravedad());
    }

    public double calcularAlturaFTres() {
        return (getVelocidadFinal() + getVelocidadInicial()) / (2) * getTiempo();
    }

    //----- Tiempo -----//
    public double calcularTiempoFUno() {
        return (getVelocidadFinal() - getVelocidadInicial()) / getGravedad();
    }

    public double calcularTiempoFDos() {
        return (2 * getAltura()) / (getVelocidadInicial() + getVelocidadFinal());
    }

    //----- Gravedad ------//
    public double calcularGravedadFUno() {
        return (Math.pow(getVelocidadFinal(), 2) - Math.pow(getVelocidadInicial(), 2))
                / (2 * getAltura());
    }

    public double calcularGravedadFDos() {
        return ((getVelocidadFinal() - getVelocidadInicial()) / getTiempo()) - getVelocidadInicial();
    }

    public double calcularGravedadFTres() {
        return (getAltura() - (getVelocidadInicial() * getTiempo()))
                / ((1 / 2) * Math.pow(getTiempo(), 2));
    }

}
