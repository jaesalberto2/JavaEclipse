package guiaExamen;

import java.util.Scanner;

public class OrdenarNumeros {

	public static void main(String[] args) {
	
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Introduce el primer número:");
		        int num1 = scanner.nextInt();

		        System.out.println("Introduce el segundo número:");
		        int num2 = scanner.nextInt();

		        System.out.println("Introduce el tercer número:");
		        int num3 = scanner.nextInt();

		        if (num1 > num2) {
		            int temp = num1;
		            num1 = num2;
		            num2 = temp;
		        }

		        if (num2 > num3) {
		            int temp = num2;
		            num2 = num3;
		            num3 = temp;
		        }

		        if (num1 > num2) {
		            int temp = num1;
		            num1 = num2;
		            num2 = temp;
		        }

		        System.out.println("Los números en orden son: " + num1 + ", " + num2 + ", " + num3);
		    
		


	}

}
