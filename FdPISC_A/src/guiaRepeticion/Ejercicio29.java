/*
 * Ejercicio 29 Escribe  un  programa  que  muestre 
 *  por  pantalla  todos  los  números  enterospositivos 
 *  menores a uno leído por teclado que no sean divisibles 
 *  entre otro también leído de igual forma.
 */
package guiaRepeticion;

import java.util.Scanner;

public class Ejercicio29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Introduce un número entero positivo:");
		        int num1 = scanner.nextInt();
		        System.out.println("Introduce otro número entero positivo:");
		        int num2 = scanner.nextInt();

		        System.out.println("Los números enteros positivos menores a " + num1 + " que no son divisibles entre " + num2 + " son:");
		        for (int i = 1; i < num1; i++) {
		            if (i % num2 != 0) {
		                System.out.println(i);
		            }
		        }
		    }
		}
