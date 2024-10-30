package guiaExamen;

import java.util.Scanner;

public class Digitos {

	public static void main(String[] args) {


		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Por favor, introduce un número entero (hasta 5 dígitos):");
		        int numero = scanner.nextInt();

		        if (numero < 0) {
		            numero = numero * -1;
		        }

		        if (numero < 10) {
		            System.out.println("El número tiene 1 dígito.");
		        } else if (numero < 100) {
		            System.out.println("El número tiene 2 dígitos.");
		        } else if (numero < 1000) {
		            System.out.println("El número tiene 3 dígitos.");
		        } else if (numero < 10000) {
		            System.out.println("El número tiene 4 dígitos.");
		        } else if (numero < 100000) {
		            System.out.println("El número tiene 5 dígitos.");
		        } else {
		            System.out.println("El número introducido tiene más de 5 dígitos.");
		        }


	}

}
