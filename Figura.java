/**
 * Interfaz que define el comportamiento básico de una figura geométrica.
 * Todas las figuras que implementen esta interfaz deben ser capaces de calcular su área y perímetro.
 */
public interface Figura {
    
    /**
     * Calcula el área de la figura.
     * 
     * @return El área de la figura
     */
    double calcularArea();
    
    /**
     * Calcula el perímetro de la figura.
     * 
     * @return El perímetro de la figura
     */
    double calcularPerimetro();
}