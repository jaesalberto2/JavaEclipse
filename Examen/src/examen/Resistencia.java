/*
*Escriba un programa para calcular la resistencia de un circuito en serie que consta de 12 resistores de
*56 ohmios, 20 de 39 ohmios, 32 de 27 ohmios y 27 de 15 ohmios. Recuerde que la resistencia de un circuito
*en serie es la suma de todas las resistencias individuales.
*/
package examen;

public class Resistencia {

	public static void main(String[] args) {
		// TODO declaracion de variables
		int res1=56,res2=39,res3=27,res4=15;
		System.out.println("La suma de 12 resistores de "
				+ "*56 ohmios, 20 de 39 ohmios, 32 de 27 ohmios y 27 de 15 ohmios es igual a "+ (12*res1+20*res2+32*res3+27*res4));

	}

}
