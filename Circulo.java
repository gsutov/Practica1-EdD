public class Circulo implements Figura {
    
    public double diametro;
    public double PI = 3.1416;

    public Circulo(double diametro) {
        this.diametro = diametro;
    }

    /**
     * Calcula el área de un círculo.
     * El área se obtiene usando la fórmula: π * r²
     * donde r es el radio (diámetro / 2).
     * 
     * @return El área del círculo
     */
    @Override
    public double calcularArea() {
        return PI * Math.pow((diametro/2), 2);
    }

    /**
     * Calcula el perímetro de un círculo.
     * El perímetro (circunferencia) se obtiene usando la fórmula: 2 * π * r
     * donde r es el radio (diámetro / 2).
     * 
     * @return El perímetro del círculo
     */
    @Override
    public double calcularPerimetro () {
        return 2 * PI * (diametro/2);
    }
    
    public String toString(){
        return "El tipo de figura es: Círculo" + 
        "\n Su área es: " + this.calcularArea() + 
        "\n Y su perímetro es: " + this.calcularPerimetro();
    }
}