/*
 *Ejercicio 11: Generar 10  números aleatorios del rango 1 a 20 y 
 *mostrarlos en el orden original e inverso utilizando metodos.
 */
package guiaMetodos;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		        int[] numeros = generarNumerosAleatorios();
		        mostrarNumeros("Orden original:", numeros);
		        numeros = invertirNumeros(numeros);
		        mostrarNumeros("Orden inverso:", numeros);
		    }

		    public static int[] generarNumerosAleatorios() {
		        Random rand = new Random();
		        int[] numeros = new int[10];
		        for (int i = 0; i < numeros.length; i++) {
		            numeros[i] = rand.nextInt(20) + 1;
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

		    public static int[] invertirNumeros(int[] numeros) {
		        int[] invertidos = new int[numeros.length];
		        for (int i = 0; i < numeros.length; i++) {
		            invertidos[i] = numeros[numeros.length - 1 - i];
		        }
		        return invertidos;
		    }
		}
