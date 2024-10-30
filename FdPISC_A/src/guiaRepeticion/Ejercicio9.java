/*
 * Ejercicio 9Realiza un programa que nos diga 
 * cuántos dígitos tiene un número introducido por teclado.
 */
package guiaRepeticion;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,num,numcopy;
		Scanner in = new Scanner(System.in);
		System.out.println("Escribe un numero :");
		num = in.nextInt();
		numcopy=num;
		do
		{
			num/=10;
			i++;
		}while(num>=1);//fin del do while
		System.out.println("El numero "+numcopy+" tiene "+i+" digitos");
	}

}
