/*
 * Ejercicio 22 Muestra por pantalla
 *  todos los números primos entre 2y 100, ambos incluidos.
 */
package guiaRepeticion;

import javax.swing.JOptionPane;

public class Ejercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena="2 ";
		int i=3,k=2,noprimo=0;
		do
		{
		do
		{
			if(i%k==0)
			{
				noprimo=1;
				}
			k++;
				
		}while(k<=i);
		
		if(noprimo==0)
		{
		cadena+=i+" ";
			}
		noprimo=0;
		k=2;
		i++;
		}while(i<=100);
		JOptionPane.showMessageDialog(null, cadena,"Los numeros primos del 2 al 100",JOptionPane.INFORMATION_MESSAGE);

	}

}
