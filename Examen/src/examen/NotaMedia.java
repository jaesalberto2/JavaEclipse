/*
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo 
 * examen de la asignatura Programación para obtener la media deseada. 
 * Hay que tener en cuenta que la nota del primer examen cuenta el 40% y la del segundo examen un 60%
 * 
 */

package examen;

import java.util.Scanner;

public class NotaMedia {

	public static void main(String[] args) {
		// Declaracion de variables
		double calif1,media;
		Scanner in= new Scanner(System.in);
		System.out.println("Ingrese su primera calificacion ");
		calif1=in.nextDouble();
		System.out.println("Ingrese la media deseada ");
		media=in.nextDouble();
		System.out.println("La segunda calificacion necesaria para la media deseada es "+ ((media-calif1*0.4)/0.6));
	

	}

}
