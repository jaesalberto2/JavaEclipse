/*
 * Ejercicio 2: Muestra un menu de ociones con diferentes saludos
 * utilizando metodos
 */
package metodos;

import javax.swing.JOptionPane;

public class Saludos {

	public static void main(String[] args) {
		munuSaludos();
		

	}

	private static void munuSaludos() {
		//Definicion de variables
		int opc;
		// Definicion del menu principal
		do {
		opc=Integer.parseInt(
				JOptionPane.showInputDialog(null,"1.- Saludo Mx\n"
				+ "2.-Saludo Usa\n3.-Saludo Frances\n4.-Saludo Aleman\n5.-Salir"
				,"Menu saludos",JOptionPane.INFORMATION_MESSAGE));
		switch(opc)
		{
		case 1:saludoMx();
				break;
		case 2:saludoUsa();
			break;
		case 3:saludoFances();
			break;
		case 4:saludoAleman();
			break;
		case 5: System.exit(0);
		default:
			JOptionPane.showMessageDialog(null, "Opcion incorrecta","Error",JOptionPane.ERROR_MESSAGE);
			
		
		
		}
		}while(opc!=5);
	}

	private static void saludoAleman() {
		// TODO Auto-generated method stub
		
	}

	private static void saludoFances() {
		// TODO Auto-generated method stub
		
	}

	private static void saludoUsa() {
		// TODO Auto-generated method stub
		
	}

	private static void saludoMx() {
		JOptionPane.showMessageDialog(null, "Hola compadre","Saludo",JOptionPane.INFORMATION_MESSAGE);
		
	}

}
