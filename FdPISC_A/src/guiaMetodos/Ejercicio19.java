/*
 * Ejercicio 19Escribe un programa que genere 20 números enteros aleatorios entre
 *  1y 100y que los almacene en un array. El programa debe ser capaz de pasar
 * todoslos números pares a las primeras posiciones del array 
 * (dela posición0 en adelante) ytodos los números impares a las celdas 
 * restantes. Utiliza arrays auxiliares sies necesario.
 */
package guiaMetodos;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        int[] numeros = generarNumerosAleatorios();
		        mostrarNumeros("Array original:", numeros);
		        numeros = reorganizarNumeros(numeros);
		        mostrarNumeros("Array reorganizado:", numeros);
		    }

		    public static int[] generarNumerosAleatorios() {
		        Random rand = new Random();
		        int[] numeros = new int[20];
		        for (int i = 0; i < numeros.length; i++) {
		            numeros[i] = rand.nextInt(100) + 1;
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

		    public static int[] reorganizarNumeros(int[] numeros) {
		        int[] reorganizados = new int[numeros.length];
		        int indicePar = 0, indiceImpar = numeros.length / 2;
		        for (int numero : numeros) {
		            if (numero % 2 == 0) {
		                reorganizados[indicePar++] = numero;
		            } else {
		                reorganizados[indiceImpar++] = numero;
		            }
		        }
		        return reorganizados;
		    }
		}
