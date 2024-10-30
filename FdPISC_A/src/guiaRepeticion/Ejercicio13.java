/*Ejercicio 13 Escribe un programa que lea una lista de diez números 
*y determine cuántos son positivos, y cuántos son negativos.
*/
package guiaRepeticion;

import javax.swing.JOptionPane;

public class Ejercicio13 {

	public static void main(String[] args) {
		// Declaracion de variables
		int positivos=0,num;
		for(int i=1;i<=10;i++)
		{
		num=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el numero "+i,
                JOptionPane.INFORMATION_MESSAGE));
		if (num>=0)
		{
			positivos++;
			}//fin del if interno
		}//fin del for
		JOptionPane.showMessageDialog(null, 
                "Tienes "+positivos+" numeros positivos\n"+"y "
                		+ ""+(10-positivos)+" numeros negativos",
                "Positivos y negativos",
                JOptionPane.INFORMATION_MESSAGE);
	}

}
