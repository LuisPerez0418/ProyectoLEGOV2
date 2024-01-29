package controlador;

public class ControladorMovRecUniAce extends modelo.ModeloMovHorizontal {
    
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
    
    private double getTiempo(){
        return (getTiempoFinal() - getTiempoInicial());
    }
    
    private double getPosicion(){
        return getPosFinal() - getPosInicial();
    }
    
    public double calcularVelocidadInicial() {
        return (getPosFinal() - getPosInicial()) / (getTiempo());
    }

    public double calcularVelocidadFinal() {
        return (getVelocidadInicial() + (getAceleracion() * getTiempo()));
    }

    //----- Distancia -----//
    public double calcularDistancia() {
        return (((getVelocidadFinal() + getVelocidadInicial()) / 2) * getTiempo()) + getPosInicial();
    }

    public double calcularDistanciaBase() {
        return ((getVelocidadInicial() * getTiempo()) + 0.5 + 
                (getAceleracion() * Math.pow(getTiempo(), 2))) + getPosInicial();
    }
    
    
    public double calcularTiempo() {
        return (getVelocidadFinal() - getVelocidadInicial()) / getAceleracion();
    }

    public double calcularAceleracion() {
        return ((getVelocidadFinal() - getVelocidadInicial()) / (getTiempo()));
    }
    
}
