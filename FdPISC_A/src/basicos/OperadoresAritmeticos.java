/*
 * Ejercicio 12 : Muestra el uso de operadores 
 * aritmeticos
 */
package basicos;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		//Definicion de variables
		int x=10,y=20;
		System.out.println("Resultado de la suma de\t\t\t\t"+x+" + "+y+" = "+(x+y));
		System.out.println("Resultado de la resta de\t\t\t"+x+" - "+y+" = "+(x-y));
		System.out.println("Resultado de la multiplicacion de\t\t"+x+" X "+y+" = "+(x*y));
		System.out.println("Resultado de la divicion de\t\t\t"+x+" / "+y+" = "+((double)x/(double)y)); //casting o conversion de tipos
		System.out.println("El resultado del residuo de\t\t\t"+x+" % "+y+" = "+(x%y));

	}

}
