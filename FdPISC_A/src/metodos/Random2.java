/*
 * Ejercicio 10; Muestra numeros aleatorios con un rango establecido 
 */
package metodos;

import java.util.Scanner;

public class Random2 {

	public static void main(String[] args) {
		// declaracion de variables
		int nrandom;
		int inferior,superior,cantidad;
		Scanner in = new Scanner(System.in);
		System.out.println("_____________________________________________");
		System.out.println("________________Numeros Random_______________");
		System.out.println("_____________________________________________");
		System.out.println("Ingresa cuantos numeros aleatorios a generar");
		cantidad=in.nextInt();
		System.out.println("Ingresa limite superior");
		superior=in.nextInt();
		System.out.println("Ingresa limite inferior");
		inferior=in.nextInt();
		for(int i=0;i<=cantidad;i++)
		{
			nrandom=(int)(Math.random()*superior+inferior);
			System.out.print(nrandom+"\t");
		}

	}

}
