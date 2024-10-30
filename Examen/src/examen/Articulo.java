/*
 * 5. Elaborar un programa que lea el articulo y su costo; 
 * la utilidad es el 150% y el impuesto es el 15%, calcule e imprima artículo,
 *  utilidad, impuesto y precio de venta.
 */

package examen;

import java.util.Scanner;

public class Articulo {

	public static void main(String[] args) {
		// Declaracion de variables
		String nombre;
		Double costo;
		Scanner in= new Scanner(System.in);
		System.out.println("Ingrese el articulo ");
		nombre = in.nextLine();
		System.out.println("Ingrese el costo del "+nombre);
		costo =in.nextDouble();
		System.out.println("la utilidad de "+nombre+" es "+(costo*1.5)+" El impuesto es "+(costo*0.15)+" Y el precio de venta es "+(costo+costo*0.15+costo*1.5));
		

	}

}
