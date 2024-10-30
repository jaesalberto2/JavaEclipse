/*
 * Ejercicio 32Escribe un programa que, dado un número entero, 
 * diga cuáles son y cuánto suman los dígitos pares. Los dígitos 
 * pares se deben mostrar en orden, deizquierda a derecha. Usa double en
 *  lugar de int donde sea necesario para admitirnúmeros largos.
 */
package guiaRepeticion;

import java.util.Scanner;

public class Ejercicio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Introduce un número entero:");
		        double num = scanner.nextDouble();

		        String numStr = String.valueOf((long) num);
		        int sum = 0;
		        System.out.println("Los dígitos pares del número son:");
		        for (char c : numStr.toCharArray()) {
		            int digit = c - '0';
		            if (digit % 2 == 0) {
		                System.out.println(digit);
		                sum += digit;
		            }
		        }

		        System.out.println("La suma de los dígitos pares es " + sum);
		    }
		}
