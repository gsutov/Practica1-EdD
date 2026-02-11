public abstract class PoligonoRegular implements Figura{
    protected int numeroLados;
    protected double longitudLado;
    protected String tipoFigura;

    public PoligonoRegular(int numeroLados, double longitudLado, String tipoFigura) {
        this.numeroLados = numeroLados;
        this.longitudLado = longitudLado;
        this.tipoFigura = tipoFigura;
    }

     /**
     * Calcula el perímetro de un polígono regular.
     * El perímetro se obtiene multiplicando el número de lados por la longitud de cada lado.
     * 
     * @return El perímetro del polígono regular
     */
    public double calcularPerimetro() {
        return this.numeroLados * this.longitudLado;
    }

    public abstract double calcularArea();

    public String toString(){
        return "El tipo de figura es: " + this.tipoFigura + 
        "\n Su área es: " + this.calcularArea() + 
        "\n Y su perímetro es: " + this.calcularPerimetro();
    }
}