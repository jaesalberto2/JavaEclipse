/*
 * Ejercicio 8: Determinar el promedio de un estudiante,
 *  solicitar 5 calificaciones y nombre del estudiante y determinar 
 *  si el estudiante aprobó el curso obteniendo una calificación mayor o igual
 *   a 70 utilizar métodos para resolver el problema.

		
 */
package metodos;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Declaracion de variables
		int i;
		String nombre;
		double sumacalif=0, promedio;
		double [] calificaciones = new double [5];

		Scanner in = new Scanner (System.in);
		System.out.print("Ingresa el nombre del estudiante: \n");
		nombre=in.nextLine();

		for(i=0; i<5; i++) {
		System.out.print("Ingrese la calificacion " + (i+1) + ":\n");
		calificaciones[i]=in.nextDouble();
		sumacalif += calificaciones[i];
		}
		promedio=sumacalif/5;
		System.out.print("El promedio del estudiante " + nombre + " es: " + promedio);

		if(promedio>= 70) {
		System.out.print(" El estudiante " + nombre + " ha APROBADO el curso.\n");
		}
		else {
		System.out.print(" El estudiante " + nombre + " ha REPROBADO el curso.\n");
		}
		}
		}