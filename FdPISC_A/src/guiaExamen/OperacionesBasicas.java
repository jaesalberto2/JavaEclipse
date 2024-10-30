/*
 * Ejercicio 19: Realizar las operaciones de suma
 * resta multiplicacion y division de dos numeros enteros mediante
 * la creacion de un menu y la sentencia do while
 */

package guiaExamen;

import java.util.Scanner;

public class OperacionesBasicas {

	public static void main(String[] args) {
		// Declaracion de variables
		int opc, num=0,num2=0;
		Scanner in = new Scanner(System.in);
				do {
		System.out.println("\tMenu operaciones basicas");
		System.out.println("1.- Ingresa valores");
		System.out.println("2.- Suma");
		System.out.println("3.- Resta");
		System.out.println("4.- Multiplicacion");
		System.out.println("5.- Division");
		System.out.println("6.- Salir del programa");
		System.out.println("Selecciona la opcion : ");
		opc =in.nextInt();
		switch(opc)
		{
		case 1:
		{
			System.out.println("Ingresa el primer valor : ");
			num = in.nextInt();
			System.out.println("Ingresa el segundo valor : ");
			num2 = in.nextInt();
		}
			break;
		case 2:
			System.out.println("La suma de "+num+" + "+num2+" es igual a "+(num+num2));
			break;
		case 3:
			System.out.println("La resta de "+num+" - "+num2+" es igual a "+(num-num2));
			break;
		case 4:
			System.out.println("La multiplicacion de "+num+" * "+num2+" es igual a "+(num*num2));
			break;
		case 5:
			System.out.println("La division de "+num+" / "+num2+" es igual a "+((double)num/(double)num2));
			break;
		case 6:
			System.exit(0);
			break;
		default: System.out.println("Opcion invalida");
		}//fin de switch principal
	}while(opc!=6);//fin del do

	}

}
