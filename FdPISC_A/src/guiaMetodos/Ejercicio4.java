/*
 * Ejercicio 4 Escribe un programa que piense un número al azar entre 0 y 100. 
 * El usuario debe adivinarlo  y  tiene  para  ello  5  oportunidades. 
 *  Después  de  cada  intento  fallido,  el programa dirá cuántas oportunidades 
 *  quedan y si el número introducido es menor o mayor que el número secreto
 *  utilizando metodos.
 */
package guiaMetodos;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		        int numeroSecreto = generarNumeroSecreto();
		        jugar(numeroSecreto);
		    }

		    public static int generarNumeroSecreto() {
		        Random rand = new Random();
		        return rand.nextInt(101);
		    }

		    public static void jugar(int numeroSecreto) {
		        int intentos = 5;

		        while (intentos > 0) {
		            String input = JOptionPane.showInputDialog("Adivina el numero secreto (entre 0 y 100). Te quedan " + intentos + " intentos:");
		            int numeroUsuario = Integer.parseInt(input);

		            if (numeroUsuario == numeroSecreto) {
		                JOptionPane.showMessageDialog(null, "Felicidades! Has adivinado el numero secreto.");
		                return;
		            } else if (numeroUsuario < numeroSecreto) {
		                JOptionPane.showMessageDialog(null, "El numero secreto es mayor que " + numeroUsuario + ".");
		            } else {
		                JOptionPane.showMessageDialog(null, "El numero secreto es menor que " + numeroUsuario + ".");
		            }

		            intentos--;
		        }

		        JOptionPane.showMessageDialog(null, "Lo siento, no has adivinado el numero secreto. El numero secreto era " + numeroSecreto + ".");
		    }
		}
