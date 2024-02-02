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
