package modelo;

public class ModeloMovParabolico {

    private double velocidadInicial;
    private double velocidadInicialEnX;
    private double velocidadInicialEnY;
    private double gravedad;
    private double alcanceHorizontal;
    private double alcanceVertical;
    private double posicionInicialEnX;
    private double posicionInicialEnY;
    private double angulo;
    private double tiempo;
    private double tiempoVuelo;
    private double velocidadFinalY;

    //----- Métodos getters y setters-----//
    public double getVelocidadInicial() {
        return velocidadInicial;
    }

    public void setVelocidadInicial(double velocidadInicial) {
        this.velocidadInicial = velocidadInicial;
    }

    public double getVelocidadInicialEnX() {
        return velocidadInicialEnX;
    }

    public void setVelocidadInicialEnX(double velocidadInicialEnX) {
        this.velocidadInicialEnX = velocidadInicialEnX;
    }

    public double getVelocidadInicialEnY() {
        return velocidadInicialEnY;
    }

    public void setVelocidadInicialEnY(double velocidadInicialEnY) {
        this.velocidadInicialEnY = velocidadInicialEnY;
    }

    public double getGravedad() {
        return gravedad;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }

    public double getAlcanceHorizontal() {
        return alcanceHorizontal;
    }

    public void setAlcanceHorizontal(double alcanceHorizontal) {
        this.alcanceHorizontal = alcanceHorizontal;
    }

    public double getAlcanceVertical() {
        return alcanceVertical;
    }

    public void setAlcanceVertical(double alcanceVertical) {
        this.alcanceVertical = alcanceVertical;
    }

    public double getPosicionInicialEnX() {
        return posicionInicialEnX;
    }

    public void setPosicionInicialEnX(double posicionInicialEnX) {
        this.posicionInicialEnX = posicionInicialEnX;
    }

    public double getPosicionInicialEnY() {
        return posicionInicialEnY;
    }

    public void setPosicionInicialEnY(double posicionInicialEnY) {
        this.posicionInicialEnY = posicionInicialEnY;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public double getTiempoVuelo() {
        return tiempoVuelo;
    }

    public void setTiempoVuelo(double tiempoVuelo) {
        this.tiempoVuelo = tiempoVuelo;
    }

    public double getVelocidadFinalY() {
        return velocidadFinalY;
    }

    public void setVelocidadFinalY(double velocidadFinalY) {
        this.velocidadFinalY = velocidadFinalY;
    }

}
