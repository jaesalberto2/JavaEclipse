/*
 * Ejercicio 12: Determinar mes del año (1-12)
 * msg correspondiente al mes seleccionado
 */

package seleccion;

import java.util.Scanner;

public class MonthYear {

	public static void main(String[] args) {
		int month;
		Scanner in = new Scanner(System.in);
		//Ingresar datos
		System.out.println("______________________________________");
		System.out.println("\tMes del year");
		System.out.println("______________________________________");
		System.out.println("Ingresa el mes del year (1-12)");
		month  = in.nextInt();

		switch(month)
		{
			case 1: System.out.println("Enero Inicio del año");
			break;
			
			case 2: System.out.println("Febrero Mes de la bandera");
			break;
			
			case 3: System.out.println("Marzo inicio de la primavera");
			break;
			
			case 4: System.out.println("Abril Pascuas está aquí");
			break;
			
			case 5: System.out.println("Mayo mes dd las madres");
			break;
			
			case 6: System.out.println("Junio mes de los Padres");
			break;
			
			case 7: System.out.println("Julio inicia verano");
			break;
			
			case 8: System.out.println("Agosto en vacaciones");
			break;
			
			case 9: System.out.println("Septiembre mes patrio");
			break;
			
			case 10: System.out.println("Octubre lindas lunas");
			break;
			
			case 11: System.out.println("Noviembre dia de muertos");
			break;
			
			case 12: System.out.println("Diciembre Navidad!!!");
			break;
			
			default: System.out.println("opcion invalida");
		}
	}

}
