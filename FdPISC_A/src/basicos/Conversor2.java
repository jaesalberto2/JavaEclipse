/*
 * Ejercicio 21: muestra diferentes tipos de monedas con respecto al peso
 */
package basicos;

import java.util.Scanner;

public class Conversor2 {

	public static void main(String[] args) {
		//Declaracion de variables
		double peso,dollar,yen,euro,colombia,argentino;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa cantidad de pesos a convertir :\t");
		peso = entrada.nextDouble();
		System.out.println("ingresa valor actual del dolar :\t");
		dollar = entrada.nextDouble();
		System.out.println("ingresa valor actual del Yen :\t");
		yen = entrada.nextDouble();
		System.out.println("ingresa valor actual del Euro :\t");
		euro = entrada.nextDouble();
		System.out.println("ingresa valor actual del Peso Colombiano :\t");
		colombia = entrada.nextDouble();
		System.out.println("ingresa valor actual del Peso Argentino :\t");
		argentino = entrada.nextDouble();
		System.out.println("_______________________________________________________________________________________________________________________________________________________________________");
		System.out.println("\t\t\t\t\t\tConversor de Monedas");
		System.out.println("_______________________________________________________________________________________________________________________________________________________________________");
		System.out.println("Cantidad\tDollar\t\t\t\tYen\t\t\t\tEuro\t\t\t\tPeso Colombiano\t\t\tPeso Argentino");
		System.out.println("_______________________________________________________________________________________________________________________________________________________________________");
		System.out.println(peso+"\t\t"+(peso/dollar)+"\t\t"+(peso/yen)+"\t\t"+(peso/euro)+"\t\t"+(peso/colombia)+"\t\t"+(peso/argentino));
		System.out.println("_______________________________________________________________________________________________________________________________________________________________________");

	}

}
