/*
 * Ejercicio 20: Realiza la conversion de los diferentes tipos de 
 * monedas utilizando la entrada de datos mediante la clase Scanner
 */
package basicos;

import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		//Declaracion de variables
		double peso,dollar;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa cantidad de pesos a convertir :\t");
		peso = entrada.nextDouble();
		System.out.println("ingresa valor actual del dolar :\t");
		dollar = entrada.nextDouble();
		System.out.println("______________________________________________________");
		System.out.println("\t\tConversor de Monedas");
		System.out.println("______________________________________________________");
		System.out.println(peso+" peso(s) equivale a "+(peso/dollar)+" Dolares");
		System.out.println("______________________________________________________");
		

	}

}
