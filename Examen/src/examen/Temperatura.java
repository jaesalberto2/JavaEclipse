/*
 * Elabore un programa para convertir la temperatura en grados Fahrenheit a grados Celsius, utilice la siguiente formula
 * Celsius=5.0/9.0(Fahrenheit-32)
 */
package examen;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fahr;
		Scanner in= new Scanner(System.in);
		System.out.println("Escribe la cantidad de grados Fahrenheit" );
		fahr = in.nextDouble();
		System.out.println("La cantidad de grados celcius es "+((5*(fahr-32))/9));

	}

}
