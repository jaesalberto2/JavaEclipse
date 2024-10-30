//Ejercicio 40Pedir un número y calcular su factorial
package guiaRepeticion;

import java.util.Scanner;

public class Ejercicio40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Introduce un número:");
		        int num = scanner.nextInt();
		        scanner.close();

		        long factorial = 1;
		        for (int i = 1; i <= num; i++) {
		            factorial *= i;
		        }

		        System.out.println("El factorial de " + num + " es " + factorial);
		    }
		}
