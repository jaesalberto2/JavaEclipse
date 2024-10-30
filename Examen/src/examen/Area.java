/*
 * Calcular el área de un triángulo mediante la fórmula del Teorema Herón:
 */
package examen;

import java.util.Scanner;
import java.util.*;

public class Area {

	public static void main(String[] args) {
		// Declaracion de variables
		double a,b,c,s,resultado;
		Scanner in= new Scanner(System.in);
		System.out.println("Ingrese el lado a del triangulo ");
		a=in.nextDouble();
		System.out.println("Ingrese el lado b del triangulo ");
		b=in.nextDouble();
		System.out.println("Ingrese el lado c del triangulo ");
		c=in.nextDouble();
		s=((a+b+c)/2);
		resultado=(s*(s-a)*(s-b)*(s-c));
		
		System.out.println("El valor del area del triangulo es "+(Math.sqrt(resultado)));

	}

}
