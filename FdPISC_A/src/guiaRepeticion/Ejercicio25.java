/*
 * Ejercicio 25Realiza un programa que pida un número por teclado
 *  y que luego muestre ese número al revés.
 */
package guiaRepeticion;

import javax.swing.JOptionPane;

public class Ejercicio25 {

	public static void main(String[] args) {
		// Declaracion de variables
		int num=0,numcopy=0,num2;
		String cadena="";
		num=Integer.parseInt(JOptionPane.showInputDialog(null,"Escribe un numero"
				+ "","Numero al reves",JOptionPane.INFORMATION_MESSAGE));
		numcopy=num;
		do
		{
		numcopy=numcopy/10;
		num2=(num-numcopy*10);
		cadena+= num2;
		num=(num/10);
		numcopy=num;
		
		}while(numcopy>=1);
		
		
		JOptionPane.showMessageDialog(null, cadena, "Numero al reves"
				+ "", JOptionPane.INFORMATION_MESSAGE);

	}

}
