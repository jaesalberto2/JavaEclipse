/*
 * Elaborar un programa que calcule e imprima el costo de producción de un articulo teniendo como datos la descripción
 *  y el número de unidades producidas. El costo se calcula multiplicando el número de unidades producidas por un factor 
 *  de costo de materiales de 3.5 y sumándole al producto un costo fijo de 10700.
 * 
 */

package examen;

import java.util.Scanner;

public class Produccion {

	public static void main(String[] args) {
		// Declaracion de variables
		double factor=3.5,cantidad,costo=10700;
		
		Scanner in= new Scanner(System.in);
		System.out.println("ingrese la cantidad de articulos producidos ");
		cantidad = in.nextDouble();
		System.out.println("El costo de produccion es "+(factor*cantidad+costo));
		

	}

}
