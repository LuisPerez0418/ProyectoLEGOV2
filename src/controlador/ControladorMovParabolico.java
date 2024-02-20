package controlador;

public class ControladorMovParabolico extends modelo.ModeloMovParabolico {

    public ControladorMovParabolico() {

    }

    public ControladorMovParabolico(double velocidadInicial, double velocidadInicialX,
            double velocidadInicialY, double gravedad, double alcHorizontal,
            double alcVertical, double posInicialX, double posInicialY, double angulo) {
        setVelocidadInicial(velocidadInicial);
        setVelocidadInicialEnX(velocidadInicialX);
        setVelocidadInicialEnY(velocidadInicialY);
        setGravedad(gravedad);
        setAlcanceHorizontal(alcHorizontal);
        setAlcanceVertical(alcVertical);
        setPosicionInicialEnX(posInicialX);
        setPosicionInicialEnY(posInicialY);
        setAngulo(angulo);
    }

    //----- Velocidad inicial ------//
    public double calcularVelocidadInicialFUno() {
        return 0;
    }
    
    public double calcularVelocidadInicialFDos() {
        return 0;
    }
    
    public double calcularVelocidadInicialFTres() {
        return 0;
    }
    
    //----- Velocidad inicial en X ------//
    public double calcularVelocidadInicialXFUno() {
        return 0;
    }
    
    public double calcularVelocidadInicialXFDos() {
        return 0;
    }
    
    public double calcularVelocidadInicialXFTres() {
        return 0;
    }
    
    //----- Velocidad inicial en Y ------//
    public double calcularVelocidadInicialYFUno() {
        return 0;
    }
    
    public double calcularVelocidadInicialYFDos() {
        return 0;
    }
    
    public double calcularVelocidadInicialYFTres() {
        return 0;
    }
    
    //----- Tiempo ------//
    public double calcularTiempoFUno() {
        return 0;
    }
    
    public double calcularTiempoFDos() {
        return 0;
    }
    
    public double calcularTiempoFTres() {
        return 0;
    }
    
    //----- Altura -----//
    public double calcularAlturaFUno() {
        return 0;
    }

    public double calcularAlturaFDos() {
        return 0;
    }

    public double calcularAlturaFTres() {
        return 0;
    }
    
    //----- Alcance horizontal -----//
    public double calcularAlcHorizontal() {
        return 0;
    }

    //----- Tiempo de vuelo -----//
    public double calcularTiempoVuelo() {
        return 0;
    }
    
    //----- Distancia -----//
    public double calcularDistancia() {
        return 0;
    }
    
    
}
