package modelo;

public class ModeloMovParabolico {

    private double velocidadInicial;
    private double velocidadInicialEnX;
    private double velocidadInicialEnY ;
    private double gravedad ;
    private double alcanceHorizontal ;
    private double alcanceVertical ;
    private double posicionInicialEnX ;
    private double posicionInicialEnY ;
    private double angulo ;

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
    
    
    //----- Métodos para calcular ------//
    //----- Tiempos -----//
    public double calcularTiempoSubida() {
        return (getVelocidadInicialEnY() / getGravedad());
    }

    public double calcularTiempoVuelo() {
        return calcularTiempoSubida() * 2;
    }

    //----- Distancias -----//
    public double calcularAlcanceHorizontalMaximo() {
        return (Math.pow(getVelocidadInicial(), 2) * Math.sin(2 * getAngulo())) / getGravedad();
    }

    public double calcularAlturaMaxima() {
        return (Math.pow(getVelocidadInicialEnY(), 2) / (2 * getGravedad()));
    }

    public double calcularAlcanceHorizontal(double tiempo) {
        return getPosicionInicialEnX() + getVelocidadInicialEnX() * tiempo;
    }

    public double calcularAltura(double tiempo) {
        return getPosicionInicialEnY() + getVelocidadInicialEnY() * tiempo - (getGravedad() / 2) * Math.pow(tiempo, 2);
    }

    //----- Velocidades ----//
    public double calcularVelocidad() {
        return Math.sqrt(Math.pow(getVelocidadInicialEnX(), 2) + Math.pow(getVelocidadInicialEnY(), 2));
    }

    public double calcularVelocidadEnX() {
        return getVelocidadInicial() * Math.cos(getAngulo());
    }

    public double calcularVelocidadEnY() {
        return getVelocidadInicial() * Math.sin(getAngulo());
    }

    //----- Angulo -----//
    public double calcularAngulo() {
        return Math.asin(getVelocidadInicialEnY() / getVelocidadInicial());
    }

    public double calcularAngulo(int a) {
        return Math.acos(getVelocidadInicialEnX() / getVelocidadInicial());
    }
    
}
