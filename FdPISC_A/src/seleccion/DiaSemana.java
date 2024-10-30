/*
 * Ejercicio 10: Determina el dia de la semana mediante la sentencia switch
 */

package seleccion;

import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {
		//declaracion de variables
		int day;
		Scanner in = new Scanner(System.in);
		//Ingresar datos
		System.out.println("______________________________________");
		System.out.println("\tDia de la semana");
		System.out.println("______________________________________");
		System.out.println("Ingresa el dia de la semana (1-7)");
		day = in.nextInt();

		switch(day)
		{
			case 1: System.out.println("Domingo familiar!!!!");
			break;
			
			case 2: System.out.println("Lunes todos a trabajar");
			break;
			
			case 3: System.out.println("Martes de mercado !!!");
			break;
			
			case 4: System.out.println("Miercoles ombligo de semana");
			break;
			
			case 5: System.out.println("Juevebes y el cuerpo lo sabe");
			break;
			
			case 6: System.out.println("Viernes Social");
			break;
			
			case 7: System.out.println("Sabado no voy a trabajar");
			break;
			
			default: System.out.println("opcion invalida");
			
		}//fin del switch

	}

}
