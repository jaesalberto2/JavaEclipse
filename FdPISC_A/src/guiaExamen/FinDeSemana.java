package guiaExamen;

import java.util.Scanner;

public class FinDeSemana {

	public static void main(String[] args) {


	
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Introduce el día de la semana (lunes a viernes):");
		        String dia = scanner.next();
		        System.out.println("Introduce la hora (formato 24h):");
		        int hora = scanner.nextInt();
		        System.out.println("Introduce los minutos:");
		        int minutos = scanner.nextInt();

		        int minutosTotales = hora * 60 + minutos;
		        int minutosFinDeSemana = 15 * 60;

		        if (dia.equalsIgnoreCase("lunes")) {
		            minutosFinDeSemana += 4 * 24 * 60;
		        } else if (dia.equalsIgnoreCase("martes")) {
		            minutosFinDeSemana += 3 * 24 * 60;
		        } else if (dia.equalsIgnoreCase("miercoles")) {
		            minutosFinDeSemana += 2 * 24 * 60;
		        } else if (dia.equalsIgnoreCase("jueves")) {
		            minutosFinDeSemana += 1 * 24 * 60;
		        }

		        int diferencia = minutosFinDeSemana - minutosTotales;

		        System.out.println("Faltan " + diferencia + " minutos para el fin de semana.");
		    
		


	}

}
