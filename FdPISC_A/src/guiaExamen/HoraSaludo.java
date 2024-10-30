package guiaExamen;

import java.util.Scanner;

public class HoraSaludo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        // Crear un objeto Scanner para leer la entrada del teclado
		        Scanner sc = new Scanner(System.in);

		        // Pedir al usuario que introduzca una hora
		        System.out.print("Introduce una hora (solo la hora, sin minutos): ");
		        int hora = sc.nextInt();

		        // Comprobar si la hora es válida
		        if (hora < 0 || hora > 23) {
		            System.out.println("Hora no válida");
		        } else {
		            // Usar la sentencia if para mostrar el saludo correspondiente
		            if (hora >= 6 && hora <= 12) {
		                System.out.println("Buenos días");
		            } else if (hora >= 13 && hora <= 20) {
		                System.out.println("Buenas tardes");
		            } else {
		                System.out.println("Buenas noches");
		            }
		        }
		    }


	}


