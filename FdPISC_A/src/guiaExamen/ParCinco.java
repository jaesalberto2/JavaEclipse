package guiaExamen;

import java.util.Scanner;

public class ParCinco {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Introduce un número:");
		        int numero = scanner.nextInt();

		        if (numero % 2 == 0) {
		            System.out.println("El número es par.");
		        } else {
		            System.out.println("El número no es par.");
		        }

		        if (numero % 5 == 0) {
		            System.out.println("El número es divisible entre cinco.");
		        } else {
		            System.out.println("El número no es divisible entre cinco.");
		        }
		    
		


	}

}
