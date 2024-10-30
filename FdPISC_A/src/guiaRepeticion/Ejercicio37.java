/*Ejercicio 37 Pedir números hasta que se teclee uno negativo, 
y mostrar cuántos números negativos y positivos se han introducido,
*y determinar si las sumatorias son iguales o diferentes.
*/
package guiaRepeticion;

import java.util.Scanner;

public class Ejercicio37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		        Scanner scanner = new Scanner(System.in);
		        int countPositive = 0;
		        int countNegative = 0;
		        int sumPositive = 0;
		        int sumNegative = 0;

		        while (true) {
		            System.out.println("Introduce un número:");
		            if (!scanner.hasNextInt()) {
		                System.out.println("Has introducido un valor no válido. Por favor, introduce un número.");
		                scanner.next();
		                continue;
		            }
		            int num = scanner.nextInt();
		            if (num < 0) {
		                countNegative++;
		                sumNegative += num;
		                break;
		            } else {
		                countPositive++;
		                sumPositive += num;
		            }
		        }
		        scanner.close();

		        System.out.println("Has introducido " + countPositive + " números positivos y " + countNegative + " números negativos.");
		        if (sumPositive == sumNegative) {
		            System.out.println("Las sumatorias de los números positivos y negativos son iguales.");
		        } else {
		            System.out.println("Las sumatorias de los números positivos y negativos son diferentes.");
		        }
		    }
		}
