/*
 * Ejercicio 7:Determinar de los numeros ingresados cual es numero par y cual es numero impar
 * ingresar 5
 */

package repeticion;

import java.util.Scanner;

public class Numeros7 {

	public static void main(String[] args) {
		// Declaracion de variables
		Scanner in= new Scanner(System.in);
		int num;
		System.out.println("___________________________________________");
		System.out.println("	Par o impar");
		System.out.println("___________________________________________");
		for(int n=1;n<=5;n++)
		{
			System.out.println("Ingresa el valor "+n);
			num = in.nextInt();
			if(num%2==0)
			{
				System.out.println("El valor "+n+" es PAR ");
				System.out.println("");
			}
			else 
			{
				System.out.println("El valor "+n+" es INPAR ");
				System.out.println("");
			}
		}
		System.out.println("Fin del programa GRACIAS");
		

	}

}
