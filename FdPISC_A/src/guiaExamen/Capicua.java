package guiaExamen;

import java.util.Scanner;

public class Capicua {

	public static void main(String[] args) {


		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Introduce un número entero positivo de hasta tres cifras:");
		        int numero = scanner.nextInt();

		        if (numero < 0 || numero > 999) {
		            System.out.println("El número introducido no es válido. Debe ser un número entero positivo de hasta tres cifras.");
		        } else {
		            int cifra1 = numero / 100;
		            int cifra3 = numero % 10;
		            if (cifra1 == cifra3) {
		                System.out.println("El número " + numero + " es capicúa.");
		            } else {
		                System.out.println("El número " + numero + " no es capicúa.");
		            }
		        }

	}

}
