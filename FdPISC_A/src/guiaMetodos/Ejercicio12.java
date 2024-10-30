/*
 * Ejercicio12: Generar 10 números aleatorios del rango de o a 20 
 * y a continuación realizar la media de  los  números  positivos, 
 *  la  media  de  los  negativos  y  contar  el  número  de  ceros utilizando metodos.
 */
package guiaMetodos;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        int[] numeros = generarNumerosAleatorios();
		        mostrarNumeros("Numeros generados:", numeros);
		        calcularMedia(numeros);
		    }

		    public static int[] generarNumerosAleatorios() {
		        Random rand = new Random();
		        int[] numeros = new int[10];
		        for (int i = 0; i < numeros.length; i++) {
		            numeros[i] = rand.nextInt(21) - 10;
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

		    public static void calcularMedia(int[] numeros) {
		        int sumaPositivos = 0, sumaNegativos = 0, cuentaPositivos = 0, cuentaNegativos = 0, cuentaCeros = 0;
		        for (int numero : numeros) {
		            if (numero > 0) {
		                sumaPositivos += numero;
		                cuentaPositivos++;
		            } else if (numero < 0) {
		                sumaNegativos += numero;
		                cuentaNegativos++;
		            } else {
		                cuentaCeros++;
		            }
		        }
		        double mediaPositivos = cuentaPositivos > 0 ? (double) sumaPositivos / cuentaPositivos : 0;
		        double mediaNegativos = cuentaNegativos > 0 ? (double) sumaNegativos / cuentaNegativos : 0;
		        JOptionPane.showMessageDialog(null, "Media de positivos: " + mediaPositivos +
		                "\nMedia de negativos: " + mediaNegativos +
		                "\nNumero de ceros: " + cuentaCeros);
		    }
		}
