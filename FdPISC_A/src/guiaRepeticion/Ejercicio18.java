/*
 * Ejercicio 18 Escribe un programa que obtenga los números enteros 
 * comprendidos entredos números introducidos por teclado y validados 
 * como distintos, el programadebe empezar por el menor de los enteros 
 * introducidos e ir incrementando de7 en 7.
 */
package guiaRepeticion;

import javax.swing.JOptionPane;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,num2,i;
		String cadena="";
		num=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el limite inferior ",
                JOptionPane.INFORMATION_MESSAGE));
		num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un limite superior ",
                JOptionPane.INFORMATION_MESSAGE));
		if(num!=num2)
		{
		for(i=num;i<=num2;i+=7) 
		{
			cadena+=i+"  ";
		
		}
		}
		else
		{JOptionPane.showMessageDialog(null, 
                " Numero incorrecto ",
                " ERROR ",
                JOptionPane.ERROR_MESSAGE);
		System.exit(0);}
		
		JOptionPane.showMessageDialog(null, 
                cadena,
                " Numeros internos ",
                JOptionPane.INFORMATION_MESSAGE);
	}

}
