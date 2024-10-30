
package guiaRepeticion;

import java.util.Scanner;

public class Ejercicio34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Introduce el primer número:");
		        double num1 = scanner.nextDouble();
		        System.out.println("Introduce el segundo número:");
		        double num2 = scanner.nextDouble();

		        String num1Str = String.valueOf((long) num1);
		        String num2Str = String.valueOf((long) num2);

		        String evenDigits = "";
		        String oddDigits = "";

		        for (int i = 0; i < num1Str.length(); i++) {
		            int digit1 = num1Str.charAt(i) - '0';
		            int digit2 = num2Str.charAt(i) - '0';

		            if (digit1 % 2 == 0) {
		                evenDigits += digit1;
		            } else {
		                oddDigits += digit1;
		            }

		            if (digit2 % 2 == 0) {
		                evenDigits += digit2;
		            } else {
		                oddDigits += digit2;
		            }
		        }

		        System.out.println("El número formado por los dígitos pares es " + evenDigits);
		        System.out.println("El número formado por los dígitos impares es " + oddDigits);
		    }
		}
