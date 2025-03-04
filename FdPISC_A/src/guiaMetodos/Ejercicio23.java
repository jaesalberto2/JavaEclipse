/*
 * Ejercicio 23: Escribe  un  programa  que  rellene  un  array  de  20 
 *  elementos  con  núeros  enterosaleatorios comprendidos entre 0 y 400 
 *  (ambos incluidos). A continuacióelprograma mostraráel  array  y  preguntará
 *  si  el  usuario  quiere  resaltar  losmútiplos  de  5  o  los mútiplos de 7.
 *   Seguidamente se volveráa mostrar elarray escribiendo los números que se 
 *   quieren resaltar entre corchetes.
 */
package guiaMetodos;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        int[] numeros = generarNumerosAleatorios();
		        mostrarNumeros("Array original:", numeros);
		        String opcion = JOptionPane.showInputDialog(null, "¿Quieres resaltar los múltiplos de 5 o los múltiplos de 7?");
		        numeros = resaltarMultiplos(numeros, opcion);
		        mostrarNumerosResaltados("Array con números resaltados:", numeros, opcion);
		    }

		    public static int[] generarNumerosAleatorios() {
		        Random rand = new Random();
		        int[] numeros = new int[20];
		        for (int i = 0; i < numeros.length; i++) {
		            numeros[i] = rand.nextInt(401);
		        }
		        return numeros;
		    }

		    public static void mostrarNumeros(String mensaje, int[] numeros) {
		        StringBuilder sb = new StringBuilder(mensaje);
		        for (int numero : numeros) {
		            sb.append("\n").append(numero);
		        }
		        JOptionPane.showMessageDialog(null, sb.toString());
		    }

		    public static int[] resaltarMultiplos(int[] numeros, String opcion) {
		        int[] resaltados = new int[numeros.length];
		        int multiplo = opcion.equals("5") ? 5 : 7;
		        for (int i = 0; i < numeros.length; i++) {
		            if (numeros[i] % multiplo == 0) {
		                resaltados[i] = -1;
		            } else {
		                resaltados[i] = numeros[i];
		            }
		        }
		        return resaltados;
		    }

		    public static void mostrarNumerosResaltados(String mensaje, int[] numeros, String opcion) {
		        StringBuilder sb = new StringBuilder(mensaje);
		        for (int numero : numeros) {
		            if (numero == -1) {
		                sb.append("\n[").append(opcion).append("]");
		            } else {
		                sb.append("\n").append(numero);
		            }
		        }
		        JOptionPane.showMessageDialog(null, sb.toString());
		    }
		}
