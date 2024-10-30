package guiaExamen;

import java.util.Scanner;

public class FechaCorrecta {

	public static void main(String[] args) {


	
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Introduce el día:");
		        int dia = scanner.nextInt();

		        System.out.println("Introduce el mes:");
		        int mes = scanner.nextInt();

		        System.out.println("Introduce el año:");
		        int año = scanner.nextInt();

		        if (año > 0) {
		            if (mes >= 1 && mes <= 12) {
		                if ((dia >= 1 && dia <= 31) && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)) {
		                    System.out.println("La fecha es correcta.");
		                } else if ((dia >= 1 && dia <= 30) && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
		                    System.out.println("La fecha es correcta.");
		                } else if ((dia >= 1 && dia <= 28) && (mes == 2)) {
		                    System.out.println("La fecha es correcta.");
		                } else {
		                    System.out.println("El día es incorrecto.");
		                }
		            } else {
		                System.out.println("El mes es incorrecto.");
		            }
		        } else {
		            System.out.println("El año es incorrecto.");
		        }
		   


	}

}
