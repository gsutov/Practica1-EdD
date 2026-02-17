/**
 * Clase que representa un cuadrado.
 * Hereda de PoligonoRegular ya que un cuadrado es un polígono regular de 4 lados.
 */
public class Cuadrado extends PoligonoRegular {
    
    /**
     * Número de lados de un cuadrado (constante = 4).
     */
    private static final int LADOS = 4;
    
    /**
     * Tipo de figura (constante = "Cuadrado").
     */
    private static final String TIPOFIGURA = "Cuadrado";

    /**
     * Constructor de la clase Cuadrado.
     * 
     * @param longitudLado Longitud del lado del cuadrado
     */
    public Cuadrado(double longitudLado) {
        super(LADOS, longitudLado, TIPOFIGURA);
    }

    /**
     * Calcula el área de un cuadrado.
     * El área se obtiene elevando al cuadrado la longitud del lado.
     * 
     * @return El área del cuadrado
     */
    @Override
    public double calcularArea() {
        return Math.pow(this.longitudLado, 2);
    }
}