/*
 * Ejercicio 2 Muestra  un  numero  indeterminado  de  números
 *   enteros  aleatorios  entre  1  y  100 separados por espaciosutilizando metodos.
 */

package guiaMetodos;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        String input = JOptionPane.showInputDialog("Introduce el número de números aleatorios que deseas generar:");
		        int num = Integer.parseInt(input);

		        String numerosAleatorios = generarNumerosAleatorios(num);

		        JOptionPane.showMessageDialog(null, "Los números aleatorios generados son: \n" + numerosAleatorios);
		    }

		    public static String generarNumerosAleatorios(int num) {
		        Random rand = new Random();
		        StringBuilder sb = new StringBuilder();

		        for (int i = 0; i < num; i++) {
		            int numeroAleatorio = rand.nextInt(100) + 1;
		            sb.append(numeroAleatorio).append(" ");
		        }

		        return sb.toString();
		    }
		}
