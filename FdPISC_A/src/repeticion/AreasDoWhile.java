/*
*Ejercicio 18: Elabora un programa mediante el uso de un menu
*para realizar el calculo de las siguientes figuras geometricas referente
*a sus areas y perimetros: circulo, triangulo, rectangulo cuadrado y rombo
*/
package repeticion;

import java.util.Scanner;

public class AreasDoWhile {

	public static void main(String[] args) {
		// Declaracion de variables
		double area=0, perimetro=0, radio=0, lado=0, base=0, altura=0;
		int opc;
		Scanner in= new Scanner(System.in);
		do {
		System.out.println("\tMenu principal");
		System.out.println("1.- Menu areas");
		System.out.println("2.- Menu perimetros");
		System.out.println("3.- Salir del programa");
		System.out.println("Selecciona opcion:");
		opc = in.nextInt();
		switch(opc)
		{
		case 1:{
			System.out.println("\tMenu areas");
			System.out.println("1.- Circulo");
			System.out.println("2.- Triangulo");
			System.out.println("3.- Rectangulo");
			System.out.println("4.- Cuadrado");
			System.out.println("5.- Rombo");
			System.out.println("6.- Salir");
			System.out.println("Selecciona opcion:");
			opc=in.nextInt();
			switch(opc)
			{
			case 1:{
				System.out.println("\t Circulo");
				System.out.println("Ingresa valor del radio");
				radio=in.nextDouble();
				System.out.println("El area del circulo es: "
				+(Math.PI*Math.pow(radio, 2)));
			}break;
			case 2:{
				
			}break;
			case 3:{
				
			}break;
			case 4:{
				
			}break;
			case 5:{
				
			}break;
			case 6:
				System.exit(0);
			default:
				System.out.println("------Opcion invalida------");
			}//fin del switch menu areas
			
		}break;//break caso 1 menu principal
		
		case 2:{

			System.out.println("\tMenu Perimetros");
			System.out.println("1.- Circulo");
			System.out.println("2.- Triangulo");
			System.out.println("3.- Rectangulo");
			System.out.println("4.- Cuadrado");
			System.out.println("5.- Rombo");
			System.out.println("6.- Salir");
			System.out.println("Selecciona opcion:");
			opc=in.nextInt();
			switch(opc)
			{
			case 1:{
				System.out.println("\t Circulo");
				System.out.println("Ingresa valor del radio");
				radio=in.nextDouble();
				System.out.println("El Perimetro del circulo es: "
				+(2*Math.PI*radio));
			}break;
			case 2:{
				
			}break;
			case 3:{
				
			}break;
			case 4:{
				
			}break;
			case 5:{
				
			}break;
			case 6:
				System.exit(0);
			default:
				System.out.println("------Opcion invalida------");
			}//fin del switch menu perimetros
			
		}break;
		
		case 3:
			System.exit(0);
		default:
			System.out.println("------Opcion invalida------");
		}//Cierre del switch
		}while(opc!=3);

	}

}
