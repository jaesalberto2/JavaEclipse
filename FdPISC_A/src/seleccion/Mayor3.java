
/*
 * Ejercicio7: Determina el mayor de tres numeros enteros
 */
package seleccion;

import java.util.Scanner;

public class Mayor3 {

	public static void main(String[] args) {
		// Declaracion de variables
		int num1, num2,num3;
		Scanner in =new Scanner(System.in); 
		//Encabezado
		System.out.println("___________________________________________________");
		System.out.println("'tDetermina el mayo de tres numeros enteros");
		System.out.println("___________________________________________________");
		//Solicitar los valores de entrada
		System.out.println("Ingresa primer valor");
		num1 = in.nextInt();
		System.out.println("Ingresa segundo valor");
		num2 = in.nextInt();
		System.out.println("Ingresa tercer valor");
		num3 = in.nextInt();
		if(num1>num2 && num1>num3)
		{
			System.out.println(num1+" es mayor que "+num2+" y "+num3);
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println(num2+" es mayor que "+num1+" y "+num3);
		}
		else if(num3>num1 && num3>num2)
		{
			System.out.println(num3+" es mayor que "+num1+" y "+num2);
		}
		else if(num3==num1 && num3>num2)
		{
			System.out.println(num3+" es mayor que "+num2);
		}
		else if(num2==num1 && num2>num3)
		{
			System.out.println(num2+" es mayor que "+num3);
		}
		else if(num2==num3 && num2>num1)
		{
			System.out.println(num2+" es mayor que "+num1);
		}
		else if(num2==num3 && num2==num1)
		{
			System.out.println("todos los numeros son iguales a "+num1);
		}
	}

}
