/*
 * Ejercicio6: solicita en pantalla un valor determinado para 
 * el numero de repeticiones y determina cuantos numeros son pares y cuantos son impares
 * mostrar en pantalla ambas filas y nos diga cuantos fueron
 */
package repeticion;

import java.util.Scanner;

public class Numeros6 {

	public static void main(String[] args) {
		int valor,num,npar=0,nimpar=0;
		String par="",impar="";
		Scanner in = new Scanner(System.in);
		System.out.print("____________________________\n");
		System.out.print("numeros pares e impares\n");
		System.out.print("____________________________\n");
		System.out.print("Ingres el limite superior");
		num =in.nextInt();
	
		for(valor=1;valor <= num;valor++)
		{	
		
		if(valor%2==0)
		{
			par+=valor+" ";
			npar++;
		}
		else 
		{
			impar+=valor+" ";
			nimpar++;
			
			
		}
		}
		System.out.println("los numeros pares son "+npar);
		System.out.println(par);
		System.out.println("los numeros pares son "+nimpar);
		System.out.println(impar);
	}

}
