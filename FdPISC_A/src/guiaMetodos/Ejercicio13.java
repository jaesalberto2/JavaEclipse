/*
 * Ejercicio 13Define un array de 12 números enteros con nombre num
 *  y asigna los valoressegún la tabla que se muestra a continuación.
 *   Muestra el contenido de todoslos elementos del  array.  
 *   ¿Qué  sucede  con  los  valores  de  loselementos  que  no
 *   han  sido inicializados?.......Se asigna el cero automaticamente
 */
package guiaMetodos;

import javax.swing.JOptionPane;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		        int num[] = new int[20];
		        num[0]=39;
		        num[1]=-2;
		        num[4]=0;
		        num[6]=14;
		        num[8]=5;
		        num[9]=120;
		       
		     
		        mostrarNumeros("Contenido del array:", num);
		    }

		    public static void mostrarNumeros(String mensaje, int[] numeros) {
		        StringBuilder sb = new StringBuilder(mensaje);
		        for (int i = 0; i < numeros.length; i++) {
		            sb.append("\nIndice ").append(i).append(": ").append(numeros[i]);
		        }
		        JOptionPane.showMessageDialog(null, sb.toString());
		    }
		}
