/*
 * 
 */
package guiaMetodos;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        int[] numeros = new int[20];
		        cargarNumeros(numeros);
		        organizarNumeros(numeros);

		        mostrarNumeros(numeros);
		    }

		    public static void cargarNumeros(int[] numeros) {
		        Random rand = new Random();

		        for (int i = 0; i < numeros.length; i++) {
		            numeros[i] = rand.nextInt(101);
		        }
		    }

		    public static void organizarNumeros(int[] numeros) {
		        int[] pares = new int[numeros.length];
		        int[] impares = new int[numeros.length];
		        int contadorPares = 0, contadorImpares = 0;

		        for (int numero : numeros) {
		            if (numero % 2 == 0) {
		                pares[contadorPares++] = numero;
		            } else {
		                impares[contadorImpares++] = numero;
		            }
		        }

		        System.arraycopy(pares, 0, numeros, 0, contadorPares);
		        System.arraycopy(impares, 0, numeros, contadorPares, contadorImpares);
		    }

		    public static void mostrarNumeros(int[] numeros) {
		        StringBuilder sb = new StringBuilder("Los numeros organizados son: \n");

		        for (int numero : numeros) {
		            sb.append(numero).append(" ");
		        }

		        JOptionPane.showMessageDialog(null, sb.toString());
		    }
		}

