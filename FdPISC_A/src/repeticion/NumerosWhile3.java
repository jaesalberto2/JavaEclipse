/*
 * Ejercicio 13: Determina numeros pares e impares solicitando un 
 * rango de limite inferior y limite superior, determinar
 * la sumatoria de pares e impares,
 * su media y el contenido
 */
package repeticion;

import java.util.Scanner;

public class NumerosWhile3 {

	public static void main(String[] args) {
		
		String cadpar="",cadinpar="";
		int i=1,superior=0,inferior=0,npar=0,ninpar=0,sumpar=0,suminpar=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese el limite superior:");
		superior= in.nextInt();
		System.out.println("Ingrese el limite inferior:");
		inferior = in.nextInt();
		while(i<=superior)
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
			i++;
		}//fin del while
		
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


