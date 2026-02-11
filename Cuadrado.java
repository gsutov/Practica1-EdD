public class Cuadrado extends PoligonoRegular {
    private static final int LADOS = 4;
    private static final String TIPOFIGURA = "Cuadrado";

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