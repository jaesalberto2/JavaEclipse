/*
 * Ejercicio 20Realiza  un  programa  que  pida  10  números
 *   por  teclado  y  que  los  almacene  enun array. A continuación 
 *   se mostrará el contenido de ese array junto al índice(0 –9) utilizando 
 *    para  ello  una  tabla.  Seguidamente  el  programa  pasará  
 *    losprimos  a  las primeras posiciones, desplazando el resto de
 *     números (los queno son primos) detal forma que no se pierda ninguno. 
 *     Al final se debe mostrarel array resultante.Por ejemplo:
 */
package guiaMetodos;

import javax.swing.JOptionPane;

public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        int[] numeros = new int[10];
		        for (int i = 0; i < numeros.length; i++) {
		            String numeroStr = JOptionPane.showInputDialog(null, "Introduce el número " + (i + 1) + ":");
		            numeros[i] = Integer.parseInt(numeroStr);
		        }
		        mostrarNumeros("Array original:", numeros);
		        numeros = moverPrimos(numeros);
		        mostrarNumeros("Array con primos movidos:", numeros);
		    }

		    public static void mostrarNumeros(String mensaje, int[] numeros) {
		        StringBuilder sb = new StringBuilder(mensaje);
		        for (int i = 0; i < numeros.length; i++) {
		            sb.append("\nÍndice ").append(i).append(": ").append(numeros[i]);
		        }
		        JOptionPane.showMessageDialog(null, sb.toString());
		    }

		    public static int[] moverPrimos(int[] numeros) {
		        int[] movidos = new int[numeros.length];
		        int indicePrimo = 0, indiceNoPrimo = numeros.length / 2;
		        for (int numero : numeros) {
		            if (esPrimo(numero)) {
		                movidos[indicePrimo++] = numero;
		            } else {
		                movidos[indiceNoPrimo++] = numero;
		            }
		        }
		        return movidos;
		    }

		    public static boolean esPrimo(int numero) {
		        if (numero <= 1) {
		            return false;
		        }
		        for (int i = 2; i < numero; i++) {
		            if (numero % i == 0) {
		                return false;
		            }
		        }
		        return true;
		    }
		}

