/*
 * Ejercicio 23Escribe un programa que permita ir 
 * introduciendo una serie indeterminadade números 
 * mientras su suma no supere el valor 10000. Cuando
 *  esto últimoocurra, se debe mostrar el total acumulado,
 *   el contador de los númerosintroducidos y la media.
 */
package guiaRepeticion;

import javax.swing.JOptionPane;

public class Ejercicio23 {

	public static void main(String[] args) {
		// declaracion de variables
		int num,i=0,sum=0;
		String cadena="";
		do {
			num =Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa un numero",""
					+ "El programa acaba al sumar 10000",JOptionPane.INFORMATION_MESSAGE));
			sum+=num;
			i++;
			cadena+=num+" ";
		}while(sum<=10000);
		
		JOptionPane.showConfirmDialog(null, "suma= "+sum+"\ncantidad de numeros= "+i+"\nmedia= "+(sum/i)+"\nnumeros introducidos ="+cadena);

	}

}
