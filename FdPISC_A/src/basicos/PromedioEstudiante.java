/*
 * Ejercicio 19: Muestra el promedio de un estudiante
 * mediante el ingreso de datos con la clase Scanner
 */
package basicos;
import java.util.Scanner;

public class PromedioEstudiante {

	public static void main(String[] args) {
		//Declaracion de variables
		String nombre,control;
		double calif1,calif2,calif3,calif4,calif5;
		Scanner entrada = new Scanner(System.in);
		//Ingresa los datos del estudiante
		System.out.println("Ingresa nombre del estudiante : ");
		nombre=entrada.nextLine();
		System.out.println("Ingresa numero de control : ");
		control=entrada.nextLine();
		System.out.println("Ingresa cinco calificaciones separadas por espacios");
		calif1=entrada.nextDouble();
		calif2=entrada.nextDouble();
		calif3=entrada.nextDouble();
		calif4=entrada.nextDouble();
		calif5=entrada.nextDouble();
		//Muestra el reporte del estudiante
		System.out.println("___________________________________");
		System.out.println("\tReporte del Estudiante");
		System.out.println("___________________________________");
		System.out.println("Nombre :\t\t"+nombre);
		System.out.println("___________________________________");
		System.out.println("Control :\t\t"+control);
		System.out.println("___________________________________");
		System.out.println("Promedio :\t\t"+(calif1+calif2+calif3+calif4+calif5)/5);
		
	}

}
