/*
 * Ejercicio 5: Determina el salario de un empleado
 * 
 */

package seleccion;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		// Declaracion de variables
		String nombre, city;
		double salario;
		Scanner in = new Scanner(System.in);
		//solicitar los valores iniciales
		System.out.println("___________________________________________");
		System.out.println("\tDetermina el Salario de un Empleado");
		System.out.println("___________________________________________");
		System.out.println("Ingresa el nombre del empleado :");
		nombre=in.nextLine();
		System.out.println("Ingresa lugar de residencia :");
		city=in.nextLine();
		System.out.println("Ingresa salario quincenal :");
		salario=in.nextDouble();
		if(city.equalsIgnoreCase("Monterrey"))
		{
			System.out.println(nombre+" tienes un salario mensual de "+(salario*2.8)+" Por ser de "+city);
		}
		
		else if(city.equalsIgnoreCase("Guadalajara"))
		{
			System.out.println(nombre+" tienes un salario mensual de "+(salario*2.7)+" Por ser de "+city);
		}
		
		else if(city.equalsIgnoreCase("Guanajuato"))
		{
			System.out.println(nombre+" tienes un salario mensual de "+(salario*2.6)+" Por ser de "+city);
		}
		
		else if(city.equalsIgnoreCase("Aguascalientes"))
		{
			System.out.println(nombre+" tienes un salario mensual de "+(salario*2.5)+" Por ser de "+city);
		}
		
		else if(city.equalsIgnoreCase("Zacatecas"))
		{
			System.out.println(nombre+" tienes un salario mensual de "+(salario*2.4)+" Por ser de "+city);
		}
		
		else
		{
			System.out.println(nombre+" tienes un salario mensual de "+(salario*2)+" Por ser de "+city);
		}
	}

}
