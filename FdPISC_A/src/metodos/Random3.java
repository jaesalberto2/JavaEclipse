/*
 * Ejercicio 11: Generar numeros aleatorios y almacenarlos en un arreglo 
 * utilizar metodos y paso de parametros
 */
package metodos;

public class Random3 {

	public static void main(String[] args) {
		// LLamar al metodo muestraArreglo
		muestraArreglo();

	}

	private static void muestraArreglo() {
		// definiciom de variables
		int arreglo[]=new int[10];
		//generar numeros aleatorios para llenar el arreglo
		for(int i=0;i<arreglo.length;i++)
		{
			arreglo[i]=(int)(Math.random()*50+1);//llenar el arreglo con numeros aleatorios
		}
		//llamar al metodo muestra arreglo
		muestraArreglo(arreglo);
		
	}

	private static void muestraArreglo(int[] arreglo) {
		// Declaracion de variables
		for(int i=0;i<arreglo.length;i++)
		{System.out.print(arreglo[i]+"\t");}
		
	}

}
