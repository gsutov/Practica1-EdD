/**
 * Clase que representa un triángulo equilátero.
 * Hereda de PoligonoRegular ya que un triángulo equilátero es un polígono regular de 3 lados.
 */
public class TrianguloEquilatero extends PoligonoRegular {
    
    /**
     * Número de lados de un triángulo (constante = 3).
     */
    private static final int LADOS = 3;
    
    /**
     * Tipo de figura (constante = "Triángulo equilátero").
     */
    private static final String TIPOFIGURA = "Triángulo equilátero";

    /**
     * Constructor de la clase TrianguloEquilatero.
     * 
     * @param longitudLado Longitud del lado del triángulo equilátero
     */
    public TrianguloEquilatero (double longitudLado) {
        super(LADOS, longitudLado, TIPOFIGURA);
    }

     /**
     * Calcula el área de un triángulo equilátero.
     * El área se calcula usando la fórmula: (base * altura) / 2
     * donde la altura se obtiene mediante el teorema de Pitágoras.
     * 
     * @return El área del triángulo equilátero
     */
    @Override
    public double calcularArea() {
        double altura = Math.sqrt(Math.pow(this.longitudLado, 2) - Math.pow(this.longitudLado/2, 2));
        return (this.longitudLado * altura) / 2;
    }
}