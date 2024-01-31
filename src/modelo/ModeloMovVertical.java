package modelo;

public class ModeloMovVertical {

    private double velocidadInicial;
    private double velocidadFinal;
    private double altura;
    private double tiempo;
    private double tiempoCaida;
    private double gravedad;

    public void ModeloCaidaLibre() {

    }

    public void ModeloCaidaLibre(double velocidadInicial,
            double velocidadFinal, double altura, double tiempo,
            double tiempoDCaida, double gravedad) {
        setVelocidadInicial(velocidadInicial);
        setVelocidadFinal(velocidadFinal);
        setAltura(altura);
        setTiempo(tiempo);
        setTiempoCaida(tiempoDCaida);
        setGravedad(gravedad);
    }

    //----- Métodos setters and getters -----//
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public double getTiempoCaida() {
        return tiempoCaida;
    }

    public void setTiempoCaida(double tiempoCaida) {
        this.tiempoCaida = tiempoCaida;
    }

    public double getGravedad() {
        return gravedad;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }

    //----- Métodos para calcular -----//
    public double calcularAltura() {
        return (getVelocidadFinal() / 2) * getTiempo();

    }

    public double calcularVelocidadFinal() {
        return getGravedad() * getTiempo();

    }

    public double calcularTiempoDeCaida() {
        return Math.sqrt(2 * getAltura() / getGravedad());
    }

}
