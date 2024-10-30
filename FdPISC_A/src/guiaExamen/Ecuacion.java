package guiaExamen;

import java.util.Scanner;

public class Ecuacion {

	public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el valor de a:");
        double a = scanner.nextDouble();

        System.out.println("Introduce el valor de b:");
        double b = scanner.nextDouble();

        if (a != 0) {
            double x = -b / a;
            System.out.println("La solución de la ecuación es: " + x);
        } else if (b != 0) {
            System.out.println("La ecuación no tiene solución.");
        } else {
            System.out.println("La ecuación tiene infinitas soluciones.");
        }

	}

}
