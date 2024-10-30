/*
 * Ejercicio 8: Solicitar 7 valores desde el teclado y determinar 
 * cual es positivo, negativo o cero
 */

package repeticion;

import java.util.Scanner;

public class Numeros8 {

	public static void main(String[] args) {
		// Declaracion de variables
		Scanner in = new Scanner(System.in);
		int n,num;
		//Presentacion 
		System.out.println("___________________________");
		System.out.println("Positivo, negativo o cero");
		System.out.println("___________________________");
		for(n=1;n<=7;n++)
		{
			System.out.println("Ingresa el valor "+n);
			num=in.nextInt();
			
			if(num>0)
				System.out.println(num+" Es positivo");
			else if(num<0)
				System.out.println(num+" Es Negativo");
			else
				System.out.println(num+" Es Cero");
				
				
		}

	}

}
