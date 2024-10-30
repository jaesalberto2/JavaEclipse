/*
 * Ejercicio 9:Solicictar el limite inferior y superior de la sentencia 
 * y determinar los numeros pares e impares, asi como la media, 
 * la sumatoria y el total de cada uno de ellos y finalmente mostrar
 * los numeros correspondientes
 */

package repeticion;

import java.util.Scanner;

public class Numeros9 {

	public static void main(String[] args) {
		// Declaracion de variables
		String cadpar="",cadinpar="";
		int superior=0,inferior=0,npar=0,ninpar=0,sumpar=0,suminpar=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese el limite superior:");
		superior= in.nextInt();
		System.out.println("Ingrese el limite inferior:");
		inferior = in.nextInt();
		for(int i = inferior; i<=superior; i++)
		{
			if(i%2==0)
			{
				npar++;
				sumpar=sumpar+i;
				cadpar=cadpar+i+" ";
			}//fin del if
			else
			{
			ninpar++;
			suminpar=suminpar+i;
			cadinpar=cadinpar+i+" ";
			}
		}//fin del for
		
		System.out.println("El numero de pares es "+npar);
		System.out.println("La suma de pares es "+sumpar);
		System.out.println("La media de los numeros pares es "+(sumpar/npar));
		System.out.println(cadpar);
		System.out.println("");
		System.out.println("El numero de inpares es "+ninpar);
		System.out.println("La suma de inpares es "+suminpar);
		System.out.println("La media de los numeros pares es "+(suminpar/ninpar));
		System.out.println(cadinpar);

	}

}
