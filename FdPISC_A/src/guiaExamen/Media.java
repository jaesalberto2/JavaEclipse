package guiaExamen;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);

	        System.out.println("Introduce el nombre del estudiante:");
	        String nombre = scanner.nextLine();

	        double sumaCalificaciones = 0;
	        for (int i = 1; i <= 5; i++) {
	            System.out.println("Introduce la calificación " + i + ":");
	            double calificacion = scanner.nextDouble();

	            if (calificacion >= 0 && calificacion <= 10) {
	                sumaCalificaciones += calificacion;
	            } else {
	                System.out.println("La calificación debe ser un número entre 0 y 10.");
	                i--; // Descuenta uno a 'i' para repetir la iteración con la misma calificación
	            }
	        }

	        double media = sumaCalificaciones / 5;
	        System.out.println("La media de las calificaciones de " + nombre + " es: " + media);
	 


	}

}
