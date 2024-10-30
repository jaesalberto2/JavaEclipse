/*
*Escriba un programa para calcular el tiempo necesario de un viaje de 183.67 km. La ecuación para calcular el tiempo transcurrido es:
*Tiempo_trancurrido = distancia_total / velocidad_promedio.
*Solicite la velocidad promedio del viaje
*/
package examen;

import java.util.Scanner;

public class TiempoViaje {

	public static void main(String[] args) {
		// Declaracion de variables
		double vel;
		Scanner in= new Scanner(System.in);
		System.out.println("escriba la velocidad promedio en km/h ");
		vel = in.nextDouble();
		System.out.println("el tiempo necesario de un viaje de 183.67 km es "+(183.67/vel)+" Horas");

	}

}
