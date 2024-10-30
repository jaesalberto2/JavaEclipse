/*
 * Ejercicio 17Realiza un programa que sume los 100 números siguientes 
 * a un número enteroy positivointroducido por teclado. Se debe comprobar
 *  que el dato introducidoes correcto (que es un número positivo).
 */
package guiaRepeticion;

import javax.swing.JOptionPane;

public class Ejercicio17 {

	public static void main(String[] args) {
		//Declaracion de variables
		int num,i=0,suma=0,m=100;
		num=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero entero positivo ",
                JOptionPane.INFORMATION_MESSAGE));
		
		if(num>=0)
		{
			
			do
			{
				suma+=num+i;
				i++;
			}while(i<=m);
			
		}//fin del if
		else 
		{
			JOptionPane.showMessageDialog(null, 
	                " Numero incorrecto ",
	                " ERROR ",
	                JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}//fin del else
		
		JOptionPane.showMessageDialog(null, 
                "La suma de los siguientes 100 numeros es "+suma,
                " Suma ",
                JOptionPane.INFORMATION_MESSAGE);

	}

}
