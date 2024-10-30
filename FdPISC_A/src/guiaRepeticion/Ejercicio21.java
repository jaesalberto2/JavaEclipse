/*
 * Ejercicio 21 Realiza  un  programa  que  vaya  pidiendo 
 *  números  hasta  que  se  introduzca  un número negativo 
 *  y nos diga cuantos números se han introducido, la media 
 *  delos impares y el mayor de los pares. El número negativo
 *   sólo se utiliza paraindicar el final de la introducción 
 *   de datos pero no se incluye en el cómputo.
 */
package guiaRepeticion;

import javax.swing.JOptionPane;

public class Ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num=0,sum=0;
		int i=-1;
		do
		{
			sum+=num;
			i++;
			num= Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa un numero, "
					+ "si quieres terminar ingresa un numero negativo","conteo y suma"
							+ "",JOptionPane.INFORMATION_MESSAGE));
			
		}while(num>=0);
		JOptionPane.showMessageDialog(null, "Ingresaste "+i+" numeros y la suma es "
				+ ""+sum,"Resultados",JOptionPane.INFORMATION_MESSAGE);
	}

}
