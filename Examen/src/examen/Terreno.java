/*
 * Elaborar un programa que calcule e imprima el costo de un terreno cuadrado. 
 * Teniendo como datos de entrada alto y ancho del terreno, tomando como referencia 
 * el costo por metro cuadrado de 3500
 */

package examen;

import java.util.Scanner;

public class Terreno {

	public static void main(String[] args) {
		// Declaracion de variables
		double alto,ancho,costo=3500;
		Scanner in= new Scanner(System.in);
		System.out.println("Ingrese el alto del terreno en metros");
		alto = in.nextDouble();
		System.out.println("Ingrese el ancho del terreno en metros");
		ancho = in.nextDouble();
		System.out.println("El costo del terreno es "+(ancho*alto*3500));

	}

}
