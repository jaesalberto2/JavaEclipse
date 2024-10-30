package guiaExamen;

import java.util.Scanner;

public class Ecuacion2 {

	public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);

	        System.out.println("Introduce el valor de a:");
	        double a = scanner.nextDouble();

	        System.out.println("Introduce el valor de b:");
	        double b = scanner.nextDouble();

	        System.out.println("Introduce el valor de c:");
	        double c = scanner.nextDouble();

	        if (a != 0) {
	            double discriminante = Math.pow(b, 2) - 4 * a * c;
	            if (discriminante >= 0) {
	                double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
	                double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
	                System.out.println("Las soluciones de la ecuación son: " + x1 + " y " + x2);
	            } else {
	                System.out.println("La ecuación no tiene soluciones reales.");
	            }
	        } else {
	            System.out.println("El valor de 'a' no puede ser cero en una ecuación de segundo grado.");
	        }


	}

}
