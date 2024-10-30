/*
 * Ejercicio 10: Muestra una determinada tabla de multiplicar 
 * solicitar como valor de entrada la tabla utilizar
 * sentencia for
 */

package repeticion;

import java.util.Scanner;

public class Tabla {

	public static void main(String[] args) {
		// Declaracion de variables
		
		int tabla, i;
		Scanner in= new Scanner(System.in);
		
		//Solicitud de la tabla
		System.out.println("Escriba la tabla de multiplicar que desea :");
		tabla = in.nextInt();
		
		for(i=1;i<=10;i++)
			System.out.println(tabla+"X"+i+"= "+(i*tabla));

	}

}
