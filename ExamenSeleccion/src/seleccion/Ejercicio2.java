/*
 * Calcula la nota de un trimestre de la asignatura de programacion. 
 * El programa pedira las dos notas que has sacado, el alumno el los dos primeros controles.
 * Si la media de los dos controles da un numero mayor o igual a 5 el alumno esta aprobado y se mostrara la media
 * en caso de que la media sea un numero menor a 5, el alumno habrá tenido que hacer el examen de recuperacion 
 * que se califica como apto o no apto, por lo tanto se debe preguntar al usuario
 * ¿Cual ha sido el resultado de la recuperacion? (apto/noapto)
 * si el resultado de la recuperacion es apto la nota seá un 5 en caso contrario se mantiene la nota anterior
 */

package seleccion;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Declaracion de variables
		String nombre, recuperacion;
		int calif1, calif2, promedio;
		Scanner in = new Scanner(System.in);
		System.out.println("________________________________________");
		System.out.println("\tCalificaciones");
		System.out.println("________________________________________");
		System.out.println("Ingresa la primera calificacion: ");
		calif1 = in.nextInt();
		System.out.println("Ingresa la segunda Calificacion: ");
		calif2 = in.nextInt();
		
		promedio =((calif1+calif2)/2);
		
		
		
		if (promedio>=5)
		{
			System.out.println("_____________________________________");
			System.out.println("Calificacion 1 = "+calif1);
			System.out.println("Calificacion 2 = "+calif2);
	
			System.out.println("Promedio = "+promedio);
		}
		
		else
		{
			System.out.println("Ingrese si es *apto* o *no apto* para recuperacion");
			recuperacion = in.next();
			if(recuperacion.equalsIgnoreCase("apto"))
			{
				System.out.println("_____________________________________");
				System.out.println("Calificacion 1 = "+calif1);
				System.out.println("Calificacion 2 = "+calif2);
				System.out.println("Promedio = 5");
			}
			else if(recuperacion.equalsIgnoreCase("no apto"))
			{
				System.out.println("_____________________________________");
				System.out.println("Calificacion 1 = "+calif1);
				System.out.println("Calificacion 2 = "+calif2);
				System.out.println("Estás reprobado");
			}
		}
		

	}

}
