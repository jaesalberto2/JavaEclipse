/*
 * Ejercicio 10 Escribe un programa que calcule la media
 *  de un conjunto de números positivosintroducidos por teclado. 
 *  A priori, el programa no sabe cuántos números seintroducirán.
 *   El usuario indicará que ha terminado de introducir los datoscuando 
 *   meta un número negativo.
 */

package guiaRepeticion;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i=0,sum=0;
		Scanner in = new Scanner(System.in);
		String cadena=" ";
		System.out.println("Escribe todos los numeros POSITIVOS de los que deseas sacar la media,"
				+ " para terminar escribe cualquier numero negativo");
		do
		{
			num = in.nextInt();
			if(num>0)
			{
			sum += num;
			i++;
			cadena += num+" ";}
			else break;
		}while(num>0);
		System.out.println("La media de "+cadena+" es "+((double)sum/i));
	}

}
