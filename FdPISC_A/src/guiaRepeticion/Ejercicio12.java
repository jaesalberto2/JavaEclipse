/*
 * Ejercicio 12 Escribe un programa que muestre los n 
 * primeros términos de la serie deFibonacci. El primer 
 * término de la serie de Fibonacci es 0, el segundo es 1
 * y el resto se calcula sumando los dos anteriores, por lo 
 * que tendríamos quelos términos son 
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... 
 * El número n sedebe introducir por teclado.
 */
package guiaRepeticion;
import javax.swing.JOptionPane;
public class Ejercicio12 {

	public static void main(String[] args) {
		// Declaracion de variables
		int num=0,i=0,num1=0,num2=1;
		String cadena="0  ";
		num=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero mayor a 2:",
                JOptionPane.INFORMATION_MESSAGE));
		
		
		do
		{
			cadena+="  "+num2;
			num2 = num1 + num2;
            num1 = num2 - num1;
			i++;
		}while(i<num-1);
		JOptionPane.showMessageDialog(null, 
                cadena,
                "Los primeros "+num+" numeros fibonacci son",
                JOptionPane.INFORMATION_MESSAGE);
			
	}

}
