/*
 * Ejercicio1: Escribe  un  programa utilizando  metodos que  muestre  la  tirada  
 * de  tres  dados.  Se debe mostrar también la suma total 
 * (los puntos que suman entre los tres dados).
 */

package guiaMetodos;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
	
		        int dado1 = tirarDado();
		        int dado2 = tirarDado();
		        int dado3 = tirarDado();

		        int suma = dado1 + dado2 + dado3;

		        JOptionPane.showMessageDialog(null, "Los resultados de los dados son: " + dado1 + ", " + dado2 + ", " + dado3 + "\nLa suma total es: " + suma);
		    }

		    public static int tirarDado() {
		        Random rand = new Random();
		        return rand.nextInt(6) + 1;
		    }
		}
