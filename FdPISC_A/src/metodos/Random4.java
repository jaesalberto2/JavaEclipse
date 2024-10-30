/*
 * Ejercicio 12: generar numeros random y almacenarlos en un 
 * arreglo, utilizar metodos y paso de parametros
 */
package metodos;

import java.util.Arrays;

public class Random4 {

	public static void main(String[] args) {
		// llamado al metod genera numeros random
		generaNumeros();
		
	

	}

	private static void generaNumeros() {
		// Declaracion de variables
		int numeros[]=new int[20];
		// genera numeros aleatorios
		for(int i=0;i<numeros.length;i++)
		{
			numeros[i]=(int) (Math.random()*50+1);
		}
		//llamar al metod imprime arreglo
		imprimeArreglo(numeros);
		
		//llamar al metodo imprime arreglo ordenado
		
		imprimeArregloOrdenado(numeros);
	}

	private static void imprimeArregloOrdenado(int[] numeros) {
		// TODO Auto-generated method stub
		Arrays.sort(numeros);
		System.out.println("\n_______________________________________");
		System.out.println("______\tArreglo Ordenado \t_______");
		System.out.println("_______________________________________");
		for(int i=0;i<numeros.length;i++)
		{
			System.out.print(numeros[i]+"\t");
		}
	}

	private static void imprimeArreglo(int[] numeros) {
		// TODO Auto-generated method stub
		System.out.println("\n_______________________________________");
		System.out.println("______\tArreglo Original\t_______");
		System.out.println("_______________________________________");
		for(int i=0;i<numeros.length;i++)
		{
			System.out.print(numeros[i]+"\t");
		}
		
	}

}
