/*
 * Ejercicio 7 Realiza el control de acceso a una caja fuerte. 
 * La combinación será un número de 4 cifras. El programa nos pedirá la combinación para abrirla.
 *  Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 *  y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 *  Tendremos cuatro oportunidades para abrir la caja fuerte.
 */
package guiaRepeticion;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1, contrasena;
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("Ingrese la contrasena :");
			contrasena = in.nextInt();
			if(contrasena!=6859)
			{
				i++;
				System.out.println("Lo siento, esa no es la combinacion");
			}
			else if(contrasena == 6859 )
			{ 
				System.out.println("La caja fuerte se ha abierto satisfactoriamente");
				System. exit(0);
			}
			
		}while(i<=4);
		System.out.print("Acabaste con tus oportunidades");
		System. exit(0);

	}

}
