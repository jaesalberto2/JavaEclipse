/*
 * Ejercicio 28 Escribe un programa que calcule el factorial 
 * de un número entero leído porteclado.
 */

package guiaRepeticion;

import java.util.Scanner;

public class Ejercicio28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Introduce un número entero:");
		        int num = scanner.nextInt();

		        long factorial = 1;
		        for (int i = 1; i <= num; i++) {
		            factorial *= i;
		        }

		        System.out.println("El factorial de " + num + " es " + factorial);
		 
	}

}
