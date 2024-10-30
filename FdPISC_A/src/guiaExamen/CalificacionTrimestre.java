package guiaExamen;

import java.util.Scanner;

public class CalificacionTrimestre {

	public static void main(String[] args) {


		
		        Scanner scanner = new Scanner(System.in);
		        double suma = 0;
		        for (int i = 1; i <= 5; i++) {
		            System.out.println("Introduce la nota de la evaluación " + i + ":");
		            double nota = scanner.nextDouble();
		            suma += nota;
		        }
		        double media = suma / 5;

		        if (media >= 5) {
		            System.out.println("El alumno está aprobado con una nota media de " + media);
		        } else {
		            System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto)");
		            String recuperacion = scanner.next();
		            if (recuperacion.equalsIgnoreCase("apto")) {
		                System.out.println("El alumno está aprobado con una nota de 5");
		            } else {
		                System.out.println("El alumno no está aprobado. La nota media es " + media);
		            }
		        }
		  


	}

}
