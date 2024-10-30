/*
 * Ejercicio 8 Muestra la tabla de multiplicar de un número introducido por teclado.
 */

package guiaRepeticion;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Declaracion de variables
		int i=1,num;
		Scanner in = new Scanner(System.in);
	
		System.out.print("Ingrese el numero del que desea hacer la tabla: ");
		num = in.nextInt();
		do
		{
			System.out.println(num+" * "+i+"\t= "+(num*i));
			i++;
		}while(i<=10);

	}

}
