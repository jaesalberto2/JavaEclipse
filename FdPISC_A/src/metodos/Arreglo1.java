/*
 * Ejercicio 6: muestra la definicion y uso de arreglos
 */

package metodos;

public class Arreglo1 {

	public static void main(String[] args) {
		// Declaracion de variables
		int arreglo[]=new int[10];//definicion de un arreglo de tamano 10
		double arreglo2[]=new double[10];//definimos un arreglo de tipo double
		String arreglo3[]=new String[10];//definicion de un arreglo de tipo cadena
		arreglo[1]=10;
		arreglo[0]=20;
		arreglo[5]=50;
		arreglo3[7]="Hola mundo";
		System.out.println(arreglo[1]);
		System.out.println(arreglo[5]);
		System.out.println(arreglo[0]);
		System.out.println(arreglo[7]);
		System.out.println(arreglo2[1]);
		System.out.println(arreglo3[7]);
		
	}

}
