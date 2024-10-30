package seleccion;

import java.util.Scanner;

public class Terremoto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio 3 determine la afectacion de un terremoto segun la escala de Ritcher
		 * mediante el uso de la sentencia if-else-if
		 */

		
				// Declaración de variables
				double grados;
				Scanner in = new Scanner(System.in);
				//ingreso de datos
				System.out.println("__________________________________________________");
				System.out.println("\tAfectacion de Terremotos escala Ritcher");
				System.out.println("__________________________________________________");
				System.out.println("Ingresa la intensidad del Terremoto");
				grados = in.nextDouble();
				if (grados < 3.5)
				{
					System.out.println("Terremoto de "+grados+" Richter queda registrado pero generalmente no se sienten sus efectos");
					
				}
				
				else if (grados>=3.5 && grados<=5.4)
				{
					System.out.println("Terremoto de "+grados+" Richter daños menores, a menudo se siente(sismo menor y terremoto moderado)");
					
				}
				
				else if (grados>=5.5 && grados<=6.0)
				{
					System.out.println("Terremoto de "+grados+" Richter daños ligeros en construcciones (terremoto moderado");
					
					
				}
				
				else if (grados>=6.1 && grados<=6.9)
				{
					System.out.println("Terremoto de "+grados+" Richter Puede causar daños severos en areas muy pobladas (Terremoto fuert)");
					
				}
				
				else if (grados >= 7.0 && grados <= 7.9)
					
				{
					System.out.println("Terremoto de "+grados+" Richter Origina daños graves (terremoto mayor)");
					
				}
				
				else if (grados >= 8)
				{
					System.out.println("Terremoto de "+grados+" Destruccion total en poblaciones cercanas (gran terremoto)");
					
				}
			}

		}

	


