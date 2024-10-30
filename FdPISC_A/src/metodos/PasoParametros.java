/*
 * Ejercicio 5; Realizar paso de parametros entre metodos
 */
package metodos;

import javax.swing.JOptionPane;

public class PasoParametros {

	public static void main(String[] args) {
		//llamado al metodo operaciones
		operaciones();
		
	}

	private static void operaciones() {
		//Declaracion de variables
		int num1,num2,s,r,m;
		double d;
		num1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa "
				+ "valor","Numero 1",JOptionPane.INFORMATION_MESSAGE));
		num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa "
				+ "valor","Numero 2",JOptionPane.INFORMATION_MESSAGE));
		s=suma(num1,num2);
		r=resta(s,num1);
		m=multiplica(s,r);
		d=division(m,s);
		JOptionPane.showMessageDialog(null, s,"Resultado de la suma"
				+ "",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, r,"Resultado de la resta"
				+ "",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, m,"Resultado de la multiplicacion"
				+ "",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, d,"Resultado de la division"
				+ "",JOptionPane.INFORMATION_MESSAGE);
	}

	private static double division(int n1, int n2) {
		// TODO Auto-generated method stub
		return ((double)n1/(double)n2);
	}

	private static int multiplica(int n1, int n2) {
		// TODO Auto-generated method stub
		return (n1*n2);
	}

	private static int resta(int n1, int n2) {
		// TODO Auto-generated method stub
		return (n1-n2);
	}

	private static int suma(int n1, int n2) {
		
		return (n1+n2);
	}

	

}
