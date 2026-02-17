/**
 * Clase principal que demuestra el uso de las diferentes figuras geométricas.
 * Crea instancias de varias figuras y muestra sus características.
 */
public class MainFiguras{
	
	/**
	 * Método principal que ejecuta el programa.
	 * Crea diferentes figuras geométricas (triángulo, cuadrado, pentágono y círculo)
	 * y muestra sus áreas y perímetros.
	 * 
	 * @param args Argumentos de línea de comandos (no se utilizan)
	 */
	public static void main(String args[]){

		//Creando las Figuras

		Figura triangulo = new TrianguloEquilatero(10.0);
		Figura cuadrado = new Cuadrado(10.0);
		Figura pentagono = new Pentagono(10.0);
		Figura circulo = new Circulo(10.0);

		System.out.println(triangulo);
		System.out.println("_____________________________________________________________\n");

		System.out.println(cuadrado);
		System.out.println("_____________________________________________________________\n");


		System.out.println(pentagono);
		System.out.println("_____________________________________________________________\n");


		System.out.println(circulo);
	}
	
}