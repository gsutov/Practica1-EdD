public class Pentagono extends PoligonoRegular {
    
    private static final int LADOS = 5;
    private static final String TIPOFIGURA = "Pentagono";

    public double PI = 3.1416;

    public Pentagono(double longitudLado) {
        super(LADOS, longitudLado, TIPOFIGURA);
    }
/**
     * Calcula el área de un pentágono regular.
     * El área se obtiene usando la fórmula: (perímetro * apotema) / 2
     * 
     * @return El área del pentágono regular
     */
    @Override
    public double calcularArea() {
        return (calcularPerimetro() * calcularApotema()) / 2;
    }

    /**
     * Calcula la apotema de un pentágono regular.
     * La apotema es la distancia del centro del pentágono al punto medio de cualquier lado.
     * Se calcula usando la fórmula: lado / (2 * tan(π / número de lados))
     * 
     * @return La apotema del pentágono regular
     */
    public double calcularApotema(){
        return this.longitudLado / (2 * Math.tan(PI / this.numeroLados));
    }

}