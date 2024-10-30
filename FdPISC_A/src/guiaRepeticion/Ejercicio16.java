/*
 * Ejercicio 16Escribe un programa que diga si un número introducido
 *  por teclado es o noprimo. Un número primo es aquel que sólo es 
 *  divisible entre él mismo y launidad.
 */
package guiaRepeticion;

import javax.swing.JOptionPane;

public class Ejercicio16 {

	public static void main(String[] args) {
		// Declaracion de variables
		int num,numcopy,noprimo=0;
		num=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero ",
                JOptionPane.INFORMATION_MESSAGE));
		numcopy=num;
		num-=1;
		do
		{
			
		if(numcopy%num==0)
			{noprimo++;}
		num-=1;
		}while(num>=2);//fin del for
		if(noprimo==0)
		{JOptionPane.showMessageDialog(null, 
                numcopy+" es un numero primo",
                " Numeros Primos ",
                JOptionPane.INFORMATION_MESSAGE);}
		else if(noprimo>=1)
		{
		JOptionPane.showMessageDialog(null, 
                numcopy+" NO es un numero primo ",
                " Numeros Primos ",
                JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
