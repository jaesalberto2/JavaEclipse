/*
 * Ejercicio 6 Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucledo-while.
 */
package guiaRepeticion;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Declaracion de variables
		int i=320;
		do {
				System.out.print(i+" ");
				i-=5;
		}while(i>=160);

	}

}
