/*
 * Ejercicio 16: Imprime los primeros 20 numeros pares
 */

package repeticion;

public class NumerosDoWhile2 {

	public static void main(String[] args) {
// Declaracion de variables
		int i=1;
		do {
			System.out.print((i*2)+"\t");
			i++;
		}while(i<=20);
	}

}
