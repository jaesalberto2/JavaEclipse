/*
 * Ejercicio 9 Determina la nota de un estudiante mediante el uso de la sentencia switch
 */

package seleccion;

import java.util.Scanner;

public class NotaEstudianteSwitch {

	public static void main(String[] args) {
		//Declaracion de variables
		String name;
		int note;
		Scanner in = new Scanner(System.in);
		System.out.println("_____________________________________________");
		System.out.println("\tNota Estudante");
		System.out.println("_____________________________________________");
		System.out.println("Ingresa nombre : ");
		name=in.nextLine();
		System.out.println("Ingresa la nota : ");
		note = in.nextInt();
		
		//validar nota mediante sentencia switch
		
		switch(note)
		{
		case 100: System.out.println(name+"Tienes una calificacion de "+note+" Excelente !!!"); 
		break;
		case 90: System.out.println(name+"Tienes una calificacion de "+note+" muy bien !!!");
		break;
		case 80: System.out.println(name+"Tienes una calificacion de "+note+" buena !!!");
		break;
		case 70: System.out.println(name+"Tienes una calificacion de "+note+" Suficiente !!!");
		break;
		case 60:
		case 50:
		case 40:
		case 30:
		case 20:
		case 10: System.out.println(name+"Tienes una calificacion de "+note+" Reprobatorio, hasta la vista");
		break;
		default: System.out.println("Opcion Incorrecta !!!");
		}//fin del switch
		

	}//fin del metodo main

}//fin de la case
