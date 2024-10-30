/*
 * Ejercicio 13:Determinar mes del año (Nombre del mes)
 * msg correspondiente al mes seleccionado
 */

package seleccion;

import java.util.Scanner;

public class MonthYear2 {

	public static void main(String[] args) {
		String month;
		Scanner in = new Scanner(System.in);
		//Ingresar datos
		System.out.println("______________________________________");
		System.out.println("\tMes del year");
		System.out.println("______________________________________");
		System.out.println("Ingresa el mes del year (1-12)");
		month  = in.nextLine().toLowerCase();
	

		switch(month)
		{
			case "enero": System.out.println("Enero Inicio del año");
			break;
			
			case "febrero": System.out.println("Febrero Mes de la bandera");
			break;
			
			case "marzo": System.out.println("Marzo inicio de la primavera");
			break;
			
			case "abril": System.out.println("Abril Pascuas está aquí");
			break;
			
			case "mayo": System.out.println("Mayo mes dd las madres");
			break;
			
			case "junio": System.out.println("Junio mes de los Padres");
			break;
			
			case "julio": System.out.println("Julio inicia verano");
			break;
			
			case "agosto": System.out.println("Agosto en vacaciones");
			break;
			
			case "septiembre": System.out.println("Septiembre mes patrio");
			break;
			
			case "octubre": System.out.println("Octubre lindas lunas");
			break;
			
			case "noviembre": System.out.println("Noviembre dia de muertos");
			break;
			
			case "diciembre": System.out.println("Diciembre Navidad!!!");
			break;
			
			default: System.out.println("opcion invalida");
		}

	}

}
