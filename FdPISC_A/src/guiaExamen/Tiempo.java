package guiaExamen;

import java.util.Scanner;

public class Tiempo {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Introduce la altura desde la que cae el objeto (en metros):");
	        double h = scanner.nextDouble();

	        double g = 9.81;

	        if (h >= 0) {
	            double t = Math.sqrt((2 * h) / g);
	            System.out.println("El tiempo que tardará en caer el objeto es: " + t + " segundos");
	        } else {
	            System.out.println("La altura debe ser un número positivo.");
	        }


	}

}
