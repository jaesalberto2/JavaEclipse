/*
 * Ejercicio 27Escribe un programa que muestre, 
 * cuente y sume los múltiplos de 3 que hayentre 1
 *  y un número leído por teclado.
 */
package guiaRepeticion;

import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Introduce un numero:");
		        int num = scanner.nextInt();
		        int count = 0;
		        int sum = 0;

		        System.out.println("Los multiplos de 3 entre 1 y " + num + " son:");
		        for (int i = 1; i <= num; i++) {
		            if (i % 3 == 0) {
		                System.out.print(i+" ");
		                count++;
		                sum += i;
		            }
		        }

		        System.out.println("\nHay " + count + " multiplos de 3 entre 1 y " + num);
		        System.out.println("La suma de los multiplos de 3 entre 1 y " + num + " es " + sum);
		 

		
	}

}
