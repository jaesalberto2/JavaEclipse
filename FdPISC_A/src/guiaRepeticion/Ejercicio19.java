/*
 * Ejercicio 19Realiza  un  programa  que  pinte  una  pirámide  por  pantalla. 
 *  La  altura  se  debepedir  por teclado. El carácter con el que se pinta 
 *  la pirámide también se debepedir por teclado.
 */
package guiaRepeticion;

import javax.swing.JOptionPane;

public class Ejercicio19 {

	public static void main(String[] args) {
		// Declaracion de variables
		String m="",cadena="";
		int i=1,num,num2,k=1,l=1;
		m=JOptionPane.showInputDialog(null,"ingresa un caracter ",
                JOptionPane.INFORMATION_MESSAGE);
		num=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa la cantidad de columnas que quieres en tu piramide ",
                JOptionPane.INFORMATION_MESSAGE));
		do
		{
			
			
			for(k=1;k<=i;k++)
			{cadena+=m;
			}
			cadena+="\n";
		i++;
		}while(i<=num);
		JOptionPane.showMessageDialog(null, 
                cadena,
                " Piramide ",
                JOptionPane.INFORMATION_MESSAGE);
	}

}
