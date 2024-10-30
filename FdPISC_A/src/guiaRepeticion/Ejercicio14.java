/*
 * Ejercicio 14Escribe un programa que pida una base y un exponente
 *  (entero positivo) yque calcule la potencia.(no utilizar Math.pow)
 */
package guiaRepeticion;

import javax.swing.JOptionPane;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,potencia,i,num2;
		num=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero ",
                JOptionPane.INFORMATION_MESSAGE));
		
		potencia=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa una potencia ",
                JOptionPane.INFORMATION_MESSAGE));
		num2=num;
		for(i=1;i<=potencia-1;i++)
		{
			num2*=num;
		}
		JOptionPane.showMessageDialog(null, 
                "El resultado es "+num2,
                num+" Elevado a "+potencia,
                JOptionPane.INFORMATION_MESSAGE);

	}

}
