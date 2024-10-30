/*
 * Ejercicio 5: Determina el costo total del "hotel miramar" considerando
 * lo siguiente, si el huesped es adulto mayor otorgarle un descuento del 
 * 40% si se hospeda por cinco noches o mas, si el huesped es mayor de edad
 * otorgar un descuento del 30% si se hospeda nueve noches o mas, si el huesped 
 * es menor de edad otorgar un descuento del 50%. si no se cumplen 
 * las condiciones anteriores no otorgar ningun descuento, mostrar el costo total a pagar por las noches de hospedaje
 */

package seleccion;

import java.util.Scanner;

public class Reservacion {

	public static void main(String[] args) {
		// Declaracion de variables
		String nombre;
		int noches,edad;
		double tarifa = 1500.00,total;
		Scanner in = new Scanner(System.in);
		//solicitar los valores de ingreso
		System.out.println("__________________________________________________");
		System.out.println("\tHotel Mjiramar");
		System.out.println("Ingresa Nombre :");
		nombre=in.nextLine();
		System.out.println("Ingresa la edad :");
		edad=in.nextInt();
		System.out.println("Ingresa numero de dias :");
		noches=in.nextInt();
		//validar descuento a pagar
		if(edad>=60 && noches >=5)
			{total=((tarifa*0.6)*noches);
			System.out.println("El costo total por alojamiento es :"+total+" y te ahorraste "+(tarifa*noches-total));
			}
		else if(edad>=18 && noches >=9)
			{total=((tarifa*0.7)*noches);
			System.out.println("El costo total por alojamiento es :"+total+" y te ahorraste "+(tarifa*noches-total));
			}
		else if(edad<=17)
			{total=((tarifa*0.5)*noches);
			System.out.println("El costo total por alojamiento es :"+total+" y te ahorraste "+(tarifa*noches-total));
			}	
		else
		{
			total=(tarifa*noches);
			System.out.println("El costo total por alojamiento es :"+total+" y no ahorraste");
		}

	}

}
