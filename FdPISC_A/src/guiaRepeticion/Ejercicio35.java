/*
 * Ejercicio 35Leer un número y mostrar su potencia al cuadrado,
 * a la tercera y quinta potenciarepetir el proceso hasta que se
 *  introduzca un númeronegativo.
 */

package guiaRepeticion;

import java.util.Scanner;

public class Ejercicio35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        Scanner scanner = new Scanner(System.in);
		        double numero;

		        do {
		            System.out.println("Introduce un número:");
		            numero = scanner.nextDouble();

		            if (numero >= 0) {
		                System.out.println("Al cuadrado: " + Math.pow(numero, 2));
		                System.out.println("A la tercera: " + Math.pow(numero, 3));
		                System.out.println("A la quinta: " + Math.pow(numero, 5));
		            }
		        } while (numero >= 0);

		        scanner.close();
		    }
		}
