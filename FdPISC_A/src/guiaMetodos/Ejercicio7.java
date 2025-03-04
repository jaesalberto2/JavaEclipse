/*
 * Ejercicio 7: Escribe  un  programa  que  simule  la  tirada  de  dos  dados.
 *   El  programa  deberá continuar tirando los dados una y otra vez hasta que
 *    en alguna tirada los dos dados tengan el mismo valor.
 */
package guiaMetodos;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        int[] dados = tirarDados();
		        String cadena="";

		        while (dados[0] != dados[1]) {
		            dados = tirarDados();
		            cadena+=dados[0]+" "+dados[1]+"    ";
		        }

		        JOptionPane.showMessageDialog(null, cadena+"\nLos dos dados tienen el mismo valor: " + dados[0]);
		    }

		    public static int[] tirarDados() {
		        Random rand = new Random();
		        int[] dados = new int[2];

		        dados[0] = rand.nextInt(6) + 1;
		        dados[1] = rand.nextInt(6) + 1;

		        return dados;
		    }
		}
