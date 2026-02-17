/**
 * Clase abstracta que representa un polígono regular.
 * Un polígono regular es aquel que tiene todos sus lados y ángulos iguales.
 * Implementa la interfaz Figura.
 */
public abstract class PoligonoRegular implements Figura{
    
    /**
     * Número de lados del polígono.
     */
    protected int numeroLados;
    
    /**
     * Longitud de cada lado del polígono.
     */
    protected double longitudLado;
    
    /**
     * Tipo de figura (nombre del polígono).
     */
    protected String tipoFigura;

    /**
     * Constructor de la clase PoligonoRegular.
     * 
     * @param numeroLados Número de lados del polígono
     * @param longitudLado Longitud de cada lado
     * @param tipoFigura Nombre del tipo de figura
     */
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

    /**
     * Método abstracto para calcular el área del polígono.
     * Cada subclase debe implementar este método según su fórmula específica.
     * 
     * @return El área del polígono
     */
    public abstract double calcularArea();

    /**
     * Devuelve una representación en cadena del polígono.
     * Incluye el tipo de figura, su área y su perímetro.
     * 
     * @return Representación en String del polígono
     */
    public String toString(){
        return "El tipo de figura es: " + this.tipoFigura + 
        "\n Su área es: " + this.calcularArea() + 
        "\n Y su perímetro es: " + this.calcularPerimetro();
    }
}