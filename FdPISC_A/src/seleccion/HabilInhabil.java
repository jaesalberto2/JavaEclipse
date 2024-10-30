/*
 * Ejercicio 11: Determine los dias habiles e inhabiles de la semana
 * mediante el uso de la sentencia switch
 */

package seleccion;

import java.util.Scanner;

public class HabilInhabil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
					case 1: System.out.println("Domingo Dia inhabil!!!!");
					break;
					
					case 2: System.out.println("Lunes Dia Habil");
					break;
					
					case 3: System.out.println("Martes Dia Habil !!!");
					break;
					
					case 4: System.out.println("Miercoles Dia Habil");
					break;
					
					case 5: System.out.println("Jueves Dia Habil");
					break;
					
					case 6: System.out.println("Viernes Dia Habil");
					break;
					
					case 7: System.out.println("Sabado Dia inhabil!!!!");
					break;
					
					default: System.out.println("opcion invalida");
				}

	}

}
