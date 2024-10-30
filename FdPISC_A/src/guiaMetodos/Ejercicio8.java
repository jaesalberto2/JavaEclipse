/*
 * Ejercicio 8: Escribe un programa que lea 10 números por teclado y 
 * que luego los muestre en orden  inverso,  es  decir,  el  primero  
 * que  se  introduce  es  el  último  en  mostrarse  y viceversa.
 */
package guiaMetodos;

import javax.swing.JOptionPane;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		        int[] numeros = leerNumeros();
		        String numerosInversos = mostrarNumerosInversos(numeros);

		        JOptionPane.showMessageDialog(null, "Los numeros en orden inverso son: \n" + numerosInversos);
		    }

		    public static int[] leerNumeros() {
		        int[] numeros = new int[10];

		        for (int i = 0; i < 10; i++) {
		            String input = JOptionPane.showInputDialog("Introduce el numero " + (i + 1) + ":");
		            numeros[i] = Integer.parseInt(input);
		        }

		        return numeros;
		    }

		    public static String mostrarNumerosInversos(int[] numeros) {
		        StringBuilder sb = new StringBuilder();

		        for (int i = numeros.length - 1; i >= 0; i--) {
		            sb.append(numeros[i]).append("\n");
		        }

		        return sb.toString();
		    }
		}
