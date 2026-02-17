/**
 * Clase que representa un círculo.
 * Implementa la interfaz Figura para calcular su área y perímetro.
 */
public class Circulo implements Figura {
    
    /**
     * Diámetro del círculo.
     */
    public double diametro;
    
    /**
     * Valor de la constante PI.
     */
    public double PI = 3.1416;

    /**
     * Constructor de la clase Circulo.
     * 
     * @param diametro El diámetro del círculo
     */
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
    
    /**
     * Devuelve una representación en cadena del círculo.
     * Incluye el tipo de figura, su área y su perímetro.
     * 
     * @return Representación en String del círculo
     */
    public String toString(){
        return "El tipo de figura es: Círculo" + 
        "\n Su área es: " + this.calcularArea() + 
        "\n Y su perímetro es: " + this.calcularPerimetro();
    }
}