/*
 * Ejercicio 15Escribe  un  programa  que  dados  dos  números, 
 *  uno  real  (base)  y  un  enteropositivo (exponente), 
 *  saque por pantalla todas las potencias con base elnumero dado
 *   y exponentes entre uno y el exponente introducido. No se debenutilizar
 *    funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
 *    se deberán mostrar 21, 22, 23, 24 y 25.
 */

package guiaRepeticion;

import javax.swing.JOptionPane;

public class Ejercicio15 {

	public static void main(String[] args) {
		// Declaracion de variables
		int num,potencia,i,num2;
		String cadena="";
		num=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero ",
                JOptionPane.INFORMATION_MESSAGE));
		
		potencia=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa una potencia ",
                JOptionPane.INFORMATION_MESSAGE));
		num2=num;
		for(i=1;i<=potencia;i++)
		{
			cadena+=num2+"  ";
			
			num2*=num;
		}
		JOptionPane.showMessageDialog(null, 
                cadena,
                " Potencias ",
                JOptionPane.INFORMATION_MESSAGE);


	}

}
