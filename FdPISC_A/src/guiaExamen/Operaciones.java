package guiaExamen;

import java.util.Scanner;

public class Operaciones {

	public static void main(String[] args) {


	
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Introduce el primer número de tres cifras:");
		        int num1 = scanner.nextInt();

		        System.out.println("Introduce el segundo número de tres cifras:");
		        int num2 = scanner.nextInt();

		        if ((num1 >= 100 && num1 <= 999) && (num2 >= 100 && num2 <= 999)) {
		            int suma = num1 + num2;
		            int resta = num1 - num2;
		            int multiplicacion = num1 * num2;
		            int cociente = num1 / num2;
		            int resto = num1 % num2;

		            System.out.println("La suma de los números es: " + suma);
		            System.out.println("La resta de los números es: " + resta);
		            System.out.println("La multiplicación de los números es: " + multiplicacion);
		            System.out.println("El cociente entero de los números es: " + cociente);
		            System.out.println("El resto de los números es: " + resto);
		        } else {
		            System.out.println("Uno o ambos números no son de tres cifras. Por favor, introduce números de tres cifras.");
		        }
		    


	}

}
