public class TrianguloEquilatero extends PoligonoRegular {
    private static final int LADOS = 3;
    private static final String TIPOFIGURA = "Triángulo equilátero";

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