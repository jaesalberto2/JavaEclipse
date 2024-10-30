/*
 * Ejercicio 24Escribe un programa que lea un número
 *  n e imprima una pirámide de númeroscon n filas 
 *  como en la siguiente figura:
 *  1
 *  121
 *  12321
 *  1234321
 */
package guiaRepeticion;

import javax.swing.JOptionPane;

public class Ejercicio24 {

	public static void main(String[] args) {

		int n,i=1,k=1;
		String cadena="1\n";
		n=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero ",""
				+ "Piramide",JOptionPane.INFORMATION_MESSAGE));
		do
		{
			do
			{
			cadena+=k;
			k++;
			}while(k<=i);
			
			
			do
			{
			cadena+=k;
			k--;
			}while(k>=1);
			
			
			k=1;
			i++;
			cadena+="\n";
		}while(i<=(n-1));
		
		JOptionPane.showConfirmDialog(null, cadena,"Piramide",JOptionPane.INFORMATION_MESSAGE);
	}

}
