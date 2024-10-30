/*
 * Ejercicio7: Determina el mayor de dos numeros enteros
 */
package seleccion;

import java.util.Scanner;

public class Mayor2 {

	public static void main(String[] args) {
		// Declaracion de variables
		int num1, num2;
		Scanner in =new Scanner(System.in); 
		//Encabezado
		System.out.println("___________________________________________________");
		System.out.println("'tDetermina el mayo de dos numeros enteros");
		System.out.println("___________________________________________________");
		//Solicitar los valores de entrada
		System.out.println("Ingresa primer valor");
		num1 = in.nextInt();
		System.out.println("Ingresa segundo valor");
		num2 = in.nextInt();
		if(num1>num2)
		{
			System.out.println(num1+" es mayor que "+num2);
		}
		else if(num1<num2)
		{
			System.out.println(num2+" es mayor que "+num1);
		}
		else 
			System.out.println(num1+" es igual que "+num2);


	}

}
