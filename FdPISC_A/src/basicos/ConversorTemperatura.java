/*
 * Ejercicio 22: Realiza la conversion de temperatura de grados C a F
 */
package basicos;

import java.util.Scanner;

public class ConversorTemperatura {

	public static void main(String[] args) {
		// Declaracion de variables
		double centigrados;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa los grados centigrados : ");
		centigrados = entrada.nextDouble();
		System.out.println("_________________________________________________");
		System.out.println("\t\tConversor de Temperaturas");
		System.out.println("_________________________________________________");
		System.out.println("\t"+centigrados+" centigrados equivale a "+((centigrados*1.8)+32)+" farenheit");
		System.out.println("_________________________________________________");

	}

}
