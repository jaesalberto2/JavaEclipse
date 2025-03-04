/*
 * Ejercicio 26: Calcular el area de las siguientes figuras: Cuadrado, 
 * Rectangulo, Triangulo y Circulo
 */
package basicos;

import java.util.Scanner;

public class AreaFiguras {

	public static void main(String[] args) {
		//Declaración de Variables
		double lado,base,altura,baseT,alturaT,radio,perimetroP,apotemaP,perimetroD,apotemaD;
		Scanner in = new Scanner(System.in);
		//solicitar valores para calcular las areas
		System.out.println("Ingresa valor del Lado para el Cuadrado : ");
		lado = in.nextDouble();
		System.out.println("Ingresa el valor de la Base para el Rectangulo : ");
		base = in.nextDouble();
		System.out.println("Ingresa el valor de la Altura para el Rectangulo : ");
		altura = in.nextDouble();
		System.out.println("Ingresa el valor de la Base para el Triangulo : ");
		baseT = in.nextDouble();
		System.out.println("Ingresa el valor de la Altura para el Triangulo : ");
		alturaT = in.nextDouble();
		System.out.println("Ingresa el valor del Radio para el Circulo : ");
		radio = in.nextDouble();
		System.out.println("Ingresa el valor de la Perimetro para el Pentagono : ");
		perimetroP = in.nextDouble();
		System.out.println("Ingresa el valor de la Apotema para el Pentagono : ");
		apotemaP = in.nextDouble();
		System.out.println("Ingresa el valor del Perimetro para el Dodecagono : ");
		perimetroD = in.nextDouble();
		System.out.println("Ingresa el valor de la Apotema para el Dodecagono : ");
		apotemaD = in.nextDouble();
		//Muestra el resultado de las areas
		System.out.println("________________________________________________");
		System.out.println("\tResultado de las Areas");
		System.out.println("________________________________________________");
		System.out.println("Cuadrado :\t\t"+(Math.pow(radio, 2))+" metros cuadrados");
		System.out.println("Rectangulo :\t\t"+(base*altura)+" metros cuadrados");
		System.out.println("Triangulo :\t\t"+(baseT*alturaT/2)+" metros cuadrados");
		System.out.println("Circulo :\t\t"+(Math.PI*Math.pow(radio, 2))+" metros cuadrados");
		System.out.println("Pentagono :\t\t"+(perimetroP*apotemaP/2)+" metros cuadrados");
		System.out.println("Pentagono :\t\t"+(perimetroD*apotemaD/2)+" metros cuadrados");

	}

}
