/*
 * Ejercicio 36Leer un número e indicar si es positivo o negativo. 
 * El proceso se repetirá hasta que se introduzcaun 0, no ejecutar 
 * el programa si se introduce algun valor en cadena o carácter.
 */

package guiaRepeticion;

import java.util.Scanner;

public class Ejercicio36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        Scanner scanner = new Scanner(System.in);
		        while (true) {
		            System.out.println("Introduce un número:");
		            if (!scanner.hasNextInt()) {
		                System.out.println("Has introducido un valor no válido. Por favor, introduce un número.");
		                scanner.next();
		                continue;
		            }
		            int num = scanner.nextInt();
		            if (num == 0) {
		                break;
		            } else if (num > 0) {
		                System.out.println("El número es positivo.");
		            } else {
		                System.out.println("El número es negativo.");
		            }
		        }
		        scanner.close();
		    }
		}
