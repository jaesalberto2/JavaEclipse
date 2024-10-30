/*
 * Ejercicio 15 Escribe  un  programa  que  pida  10  números  por  teclado 
 *  y  que  luego  muestrelos números introducidos junto con las palabras “máximo” 
 *  y “mínimo” al lado del máximo y del mínimo respectivamenteutilizar metodos.
 */
package guiaMetodos;

import javax.swing.JOptionPane;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        int[] numeros = new int[10];
		        for (int i = 0; i < numeros.length; i++) {
		            String numeroStr = JOptionPane.showInputDialog(null, "Introduce el número " + (i + 1) + ":");
		            numeros[i] = Integer.parseInt(numeroStr);
		        }
		        mostrarNumeros(numeros);
		    }

		    public static void mostrarNumeros(int[] numeros) {
		        int max = numeros[0], min = numeros[0];
		        for (int numero : numeros) {
		            if (numero > max) {
		                max = numero;
		            }
		            if (numero < min) {
		                min = numero;
		            }
		        }
		        StringBuilder sb = new StringBuilder("Números introducidos:");
		        for (int numero : numeros) {
		            sb.append("\n").append(numero);
		            if (numero == max) {
		                sb.append(" máximo");
		            }
		            if (numero == min) {
		                sb.append(" mínimo");
		            }
		        }
		        JOptionPane.showMessageDialog(null, sb.toString());
		    }
		}
