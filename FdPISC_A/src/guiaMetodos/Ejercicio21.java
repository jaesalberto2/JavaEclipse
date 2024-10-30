/*
 * Ejercicio 21 Escribe un programa que rellene un array de 100 elementos
 *  con números enterosaleatorios  comprendidos  entre 1y  500.
 *  A  continuaciónel  programa  mostrará  el array   y   preguntará 
 *    si   el   usuario   quiere   destacar   elmáximo   o   el   mínimo. 
 *    Seguidamente se volverá a mostrar el array escribiendo el número destacado 
 *    entre dobles asteriscos.
 */
package guiaMetodos;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		        int[] numeros = generarNumerosAleatorios();
		        mostrarNumeros("Array original:", numeros);
		        String opcion = JOptionPane.showInputDialog(null, "¿Quieres destacar el máximo o el mínimo?");
		        numeros = destacarNumero(numeros, opcion);
		        mostrarNumerosDestacados("Array con número destacado:", numeros, opcion);
		    }

		    public static int[] generarNumerosAleatorios() {
		        Random rand = new Random();
		        int[] numeros = new int[100];
		        for (int i = 0; i < numeros.length; i++) {
		            numeros[i] = rand.nextInt(500) + 1;
		        }
		        return numeros;
		    }

		    public static void mostrarNumeros(String mensaje, int[] numeros) {
		        StringBuilder sb = new StringBuilder(mensaje);
		        for (int numero : numeros) {
		            sb.append("  ").append(numero);
		        }
		        JOptionPane.showMessageDialog(null, sb.toString());
		    }

		    public static int[] destacarNumero(int[] numeros, String opcion) {
		        int[] destacados = new int[numeros.length];
		        int destacado = numeros[0];
		        if (opcion.equalsIgnoreCase("maximo")) {
		            for (int numero : numeros) {
		                if (numero > destacado) {
		                    destacado = numero;
		                }
		            }
		        } else if (opcion.equalsIgnoreCase("minimo")) {
		            for (int numero : numeros) {
		                if (numero < destacado) {
		                    destacado = numero;
		                }
		            }
		        }
		        for (int i = 0; i < numeros.length; i++) {
		            if (numeros[i] == destacado) {
		                destacados[i] = -1;
		            } else {
		                destacados[i] = numeros[i];
		            }
		        }
		        return destacados;
		    }

		    public static void mostrarNumerosDestacados(String mensaje, int[] numeros, String opcion) {
		        StringBuilder sb = new StringBuilder(mensaje);
		        for (int numero : numeros) {
		            if (numero == -1) {
		                sb.append("**").append(numeros).append("**");
		            } else {
		               
		            }
		        }
		        JOptionPane.showMessageDialog(null, sb.toString());
		    }
		}
