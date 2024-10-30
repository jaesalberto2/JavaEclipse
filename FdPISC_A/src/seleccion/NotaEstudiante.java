/*
 * Ejercicio 2: Determinar la nota de un estudiante, solicitar cinco calificaciones
 * y obtener su promedio final, si promedio es menor o igual a 69 el estudiante 
 * estará reprobado, de lo contrario está aprobado
 */

package seleccion;

import java.util.Scanner;

public class NotaEstudiante {

	public static void main(String[] args) {
		// declaracion devariables
		int cal1,cal2,cal3,cal4,cal5,promedio;
		String nombre;
		Scanner entrada = new Scanner(System.in);
		System.out.println("____________________________________________________________________");
		System.out.println("\t\tCalificaciones del estudiante");
		System.out.println("____________________________________________________________________");
		System.out.println("Ingresa el nombre del estudiante: ");
		nombre=entrada.nextLine();
		System.out.println("Ingresa las 5 calificaciones del estudiante "+nombre+" separadas por espacios:");
		cal1=entrada.nextInt();
		cal2=entrada.nextInt();
		cal3=entrada.nextInt();
		cal4=entrada.nextInt();
		cal5=entrada.nextInt();
		System.out.println("______________________________________________________________________");
		promedio=((cal1+cal2+cal3+cal4+cal5)/5);
		System.out.println("La calificacion del estudiante "+nombre+" es "+promedio);
		if(promedio<69) {
			System.out.println("ESTA REPROBADO");
		}
		else {
		System.out.println("ESTA APROBADO");
		}

	}

}
