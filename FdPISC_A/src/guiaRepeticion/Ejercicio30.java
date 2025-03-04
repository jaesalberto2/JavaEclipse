/*
 * Realiza una programa que calcule las horas transcurridas entre dos horas 
 * de dos días de la semana. No se tendrán en cuenta los minutos 
 * ni los segundos.El día de la semana se puede pedir como un número 
 * (del 1 al 7) o como una cadena (de “lunes” a “domingo”). Se debe comprobar
 *  que el usuariointroduce los datos correctamente y que el segundo día es 
 *  posterior al primero.A continuación se muestra un ejemplo:
Por favor, introduzca la primera hora.
Día: lunes
Hora: 18
Por favor, introduzca la segunda hora.
Día: martes
Hora: 20
Entre las 18:00h del lunes y las 20:00h del martes hay 26 hora/s.
 */
package guiaRepeticion;

import java.util.Scanner;

public class Ejercicio30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		        Scanner scanner = new Scanner(System.in);
		        String[] daysOfWeek = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};

		        System.out.println("Por favor, introduzca la primera hora.");
		        System.out.println("Día:");
		        String day1 = scanner.nextLine().toLowerCase();
		        System.out.println("Hora:");
		        int hour1 = scanner.nextInt();

		        scanner.nextLine(); // consume the newline

		        System.out.println("Por favor, introduzca la segunda hora.");
		        System.out.println("Día:");
		        String day2 = scanner.nextLine().toLowerCase();
		        System.out.println("Hora:");
		        int hour2 = scanner.nextInt();

		        int day1Index = -1;
		        int day2Index = -1;

		        for (int i = 0; i < daysOfWeek.length; i++) {
		            if (day1.equals(daysOfWeek[i])) {
		                day1Index = i;
		            }
		            if (day2.equals(daysOfWeek[i])) {
		                day2Index = i;
		            }
		        }

		        if (day1Index == -1 || day2Index == -1 || hour1 < 0 || hour1 > 23 || hour2 < 0 || hour2 > 23 || day2Index < day1Index) {
		            System.out.println("Datos introducidos incorrectamente.");
		        } else {
		            int hoursElapsed = (day2Index - day1Index) * 24 + hour2 - hour1;
		            System.out.println("Entre las " + hour1 + ":00h del " + day1 + " y las " + hour2 + ":00h del " + day2 + " hay " + hoursElapsed + " hora/s.");
		        }
		    }
		}

