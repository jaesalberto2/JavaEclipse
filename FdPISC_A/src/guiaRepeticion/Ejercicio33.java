/*
 * Ejercicio 33 Realiza un programa que pinte la letra 
 * U por pantalla hecha con asteriscos. Elprograma pedirá la altura. 
 * Fíjate que el programa inserta un espacio y pintados asteriscos menos 
 * en la base para simular la curvatura de las esquinasinferiores.
 */
package guiaRepeticion;

import java.util.Scanner;

public class Ejercicio33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Introduce la altura de la U:");
		        int height = scanner.nextInt();

		        for (int i = 0; i < height; i++) {
		            if (i < height - 1) {
		                System.out.print("* ");
		                for (int j = 0; j < height - 2; j++) {
		                    System.out.print("  ");
		                }
		                System.out.println("*");
		            } else {
		                System.out.print("  ");
		                for (int j = 0; j < height - 2; j++) {
		                    System.out.print("* ");
		                }
		            }
		        }
		    }
		}
