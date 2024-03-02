package controlador;

public class ControladorMovParabolico extends modelo.ModeloMovParabolico {

    public ControladorMovParabolico() {

    }

    public ControladorMovParabolico(double velocidadInicial, double velocidadInicialX,
            double velocidadInicialY, double gravedad, double alcHorizontal,
            double alcVertical, double posInicialX, double posInicialY, double angulo,
            double tiempo, double tiempoVuelo, double velocidadFinalY) {
        setVelocidadInicial(velocidadInicial);
        setVelocidadInicialEnX(velocidadInicialX);
        setVelocidadInicialEnY(velocidadInicialY);
        setGravedad(gravedad);
        setAlcanceHorizontal(alcHorizontal);
        setAlcanceVertical(alcVertical);
        setPosicionInicialEnX(posInicialX);
        setPosicionInicialEnY(posInicialY);
        setAngulo(angulo);
        setTiempo(tiempo);
        setTiempoVuelo(tiempoVuelo);
        setVelocidadFinalY(velocidadFinalY);
    }

    //----- Velocidad inicial ------//
    public double calcularVelocidadInicialFUno() {
        return Math.sqrt((2 * getGravedad() * getAlcanceVertical())
                / (Math.pow(Math.sin(getAngulo()), 2)));
    }

    public double calcularVelocidadInicialFDos() {
        return (getGravedad() * getTiempoVuelo()) / (2 * Math.sin(getAngulo()));
    }

    public double calcularVelocidadInicialFTres() {
        return Math.sqrt((getGravedad() * getAlcanceHorizontal())
                / Math.sin(2 * getAngulo()));
    }

    //----- Velocidad inicial en X ------//
    public double calcularVelocidadInicialXFUno() {
        return getVelocidadInicial() * Math.cos(getAngulo());
    }

    public double calcularVelocidadInicialXFDos() {
        return getAlcanceHorizontal() / getTiempo();
    }

    public double calcularVelocidadInicialXFTres() {
        return Math.sqrt(Math.pow(getVelocidadInicial(), 2)
                - Math.pow(getVelocidadInicialEnY(), 2));
    }

    //----- Velocidad inicial en Y ------//
    public double calcularVelocidadInicialYFUno() {
        return getVelocidadInicial() * Math.sin(getAngulo());
    }

    public double calcularVelocidadInicialYFDos() {
        return Math.sqrt(getVelocidadFinalY() - 2 * getGravedad() * getAlcanceVertical());
    }

    public double calcularVelocidadInicialYFTres() {
        return (2 * getAlcanceVertical()) / (getTiempo()) - getVelocidadFinalY();
    }

    //----- Tiempo ------//
    public double calcularTiempoFUno() {
        return (getVelocidadFinalY() + getVelocidadInicialEnY()) / getGravedad();
    }

    public double calcularTiempoFDos() {
        return (2 * getAlcanceVertical()) / getVelocidadInicialEnY();
    }

    public double calcularTiempoFTres() {
        return getAlcanceHorizontal() / getPosicionInicialEnX();
    }

    //----- Altura -----//
    public double calcularAlturaFUno() {
        return ((getVelocidadInicialEnY() + getVelocidadFinalY()) / 2) * getTiempo();
    }

    public double calcularAlturaFDos() {
        return (0 - Math.pow(getVelocidadInicialEnY(), 2) + 0 - Math.pow(getVelocidadFinalY(), 2))
                / (2 * getGravedad());
    }

    public double calcularAlturaFTres() {
        return (Math.pow(getVelocidadInicial(), 2) * Math.pow(getAngulo(), 2)) / (2 * getGravedad());
    }

    //----- Alcance horizontal -----//
    public double calcularAlcHorizontal() {
        return (Math.pow(getVelocidadInicial(), 2) * Math.sin(2 * getAngulo()))
                / getGravedad();
    }

    //----- Tiempo de vuelo -----//
    public double calcularTiempoVuelo() {
        return (2 * getVelocidadInicial() * Math.sin(getAngulo()))
                / getGravedad();
    }

    //----- Distancia -----//
    public double calcularDistancia() {
        return getVelocidadInicialEnX() * getTiempo();
    }

}
