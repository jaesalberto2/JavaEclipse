/*
 *Ejercicio 1: Muestra el ingreso al antro de una persona, mediante el uso
 *de la sentencia if 
 */

package seleccion;

import java.util.Scanner;

public class IngresoAntro {

	public static void main(String[] args) {
		// Declaracion de Variables
		String nombre;
		int edad;
		Scanner in = new Scanner(System.in);
		//Solicitar los valores de entrada
		System.out.println("_____________________________________________________");
		System.out.println("\t\tIngreso al Antro");
		System.out.println("_____________________________________________________");
		System.out.println("Ingresa tu nombre : ");
		nombre = in.nextLine();
		System.out.println("Ingresa tu edad : ");
		edad = in.nextInt();
		if (edad >= 18 && edad <= 60) {
			System.out.println("Bienvenido al antro: "+nombre);
			
		}
		else {
			System.out.println(nombre+" Solo se permite el accedo a personas "
					+ "de entre 18 y 60 a\u00f1os de edad");}

	}

}
