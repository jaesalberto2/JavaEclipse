/*
 * Ejercicio 39 Pedir números hasta que se introduzca uno negativo, 
 * y calcular la media.
 */
package guiaRepeticion;

import java.util.Scanner;

public class Ejercicio39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner scanner = new Scanner(System.in);
		        int count = 0;
		        int sum = 0;

		        while (true) {
		            System.out.println("Introduce un número:");
		            int num = scanner.nextInt();

		            if (num < 0) {
		                break;
		            } else {
		                sum += num;
		                count++;
		            }
		        }
		        scanner.close();

		        if (count > 0) {
		            double average = (double) sum / count;
		            System.out.println("La media de los números introducidos es " + average);
		        } else {
		            System.out.println("No se introdujo ningún número positivo.");
		        }
		    }
		}
