/*
 * Ejercicio 14: Generar kardex de estudiante mediante la sentencia while
 */

package repeticion;

import java.util.Scanner;

public class Kardex {

	public static void main(String[] args) {
		//Declaracion de variables
		String nombre="", control="", carrera="",nmat="",cadena="";
		Scanner in = new Scanner(System.in);
		int materias,i=1;
		double calificacion,sumacalif=0;
		
		System.out.println("______________________________________");
		System.out.println("\tKARDEX");
		System.out.println("______________________________________");
		System.out.println("Ingrese el Nombre :");
		nombre = in.nextLine();
		System.out.println("Ingresa carrera :");
		carrera = in.nextLine();
		System.out.println("Ingresa numero de control :");
		control = in.nextLine();
		System.out.println("Ingrese el numero de materias");
		materias = in.nextInt();
		while(i<=materias)
		{
			System.out.println("Ingresa nombre de materia "+i);
			nmat = in.next();
			cadena+=nmat+"\t";
			System.out.println("Ingresa la calificacion");
			calificacion = in.nextDouble();
			sumacalif+=calificacion;
			cadena+=calificacion+"\n";
			i++;
		}//fin de while
		System.out.println("______________________________________");
		System.out.println("\tKARDEX");
		System.out.println("______________________________________");
		System.out.println(cadena);
		System.out.println("Promedio \t"+(sumacalif/materias));

	}

}
