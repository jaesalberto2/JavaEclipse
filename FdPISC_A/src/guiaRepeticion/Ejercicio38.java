/*
 * 
 */

package guiaRepeticion;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		        Scanner scanner = new Scanner(System.in);
		        ArrayList<Integer> numbers = new ArrayList<>();

		        System.out.println("Introduce el número N:");
		        int N = scanner.nextInt();

		        while (true) {
		            System.out.println("Introduce un número para adivinar:");
		            int num = scanner.nextInt();
		            numbers.add(num);

		            if (num == N) {
		                System.out.println("¡Has acertado!");
		                break;
		            } else if (num > N) {
		                System.out.println("Menor");
		            } else {
		                System.out.println("Mayor");
		            }
		        }

		        System.out.println("Los números ingresados fueron: " + numbers);
		        scanner.close();
		    }
		}
