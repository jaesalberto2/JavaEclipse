/*
 * Ejercicio7: Determinar la nota de un estudiante mediante el uso de arreglos
 */
package metodos;

import javax.swing.JOptionPane;

public class NotaEstudiante {

	public static void main(String[] args) {
		// Llamar metodo ingresaDatos
		
		ingresDatos();
		

	}
	//Definicion del metodo ingresDatos
	private static void ingresDatos() {
		// Declaracion de variables
		String nombre[]=new String[5];
		double promedio[]=new double[5];
		//Solicitar los datos de los estudiantes
		for(int i=0;i<5;i++)
		{
		nombre[i]=JOptionPane.showInputDialog(null,"ingresa nombre","Nombre",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showInputDialog(null,"Ingresa el promedio para "+nombre[i],"Promedio",JOptionPane.INFORMATION_MESSAGE);
	}//fin del for
		imprimeDatos(nombre,promedio);
		}
	private static void imprimeDatos(String[] nom, double[] prom) {
		// Imprime el contenido de los arreglos
		String salida="";
		for(int i=0;i<nom.length;i++)
		{
			salida+=nom[i]+"\t"+prom[i]+"\n";
			
		}//fin del for imprimeDatos
		
		JOptionPane.showMessageDialog(null, salida,"Datos de los estudiantes",JOptionPane.INFORMATION_MESSAGE);
		
	}

}
