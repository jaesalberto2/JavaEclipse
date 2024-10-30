/*
 * Ejercicio 31Realiza un programa que pinte la letra L por pantalla
 *  hecha con asteriscos. Elprograma pedirá la altura. El palo horizontal 
 *  de la L tendrá una longitud de lamitad (división entera entre 2) 
 *  de la altura más uno
 */
package guiaRepeticion;

import java.util.Scanner;

public class Ejercicio31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Introduce la altura de la L:");
		        int height = scanner.nextInt();

		        for (int i = 0; i < height; i++) {
		            if (i < height - 1) {
		                System.out.println("*");
		            } else {
		                for (int j = 0; j < height / 2 + 1; j++) {
		                    System.out.print("* ");
		                }
		            }
		        }
		    }
		}
