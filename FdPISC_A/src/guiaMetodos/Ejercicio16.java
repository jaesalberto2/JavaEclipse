/*
 * Ejercicio 16: Escribe  un  programa  que defina  un  arreglo  de  15  elementos 
 *  de  forma  aleatoriay que  los  almacene  en  unarray.  Rota  los  elementos 
 *   de  ese  array,  es  decir,  el elemento de la posición 0debe pasar a la posición 
 *   1, el de la 1 a la 2, etc. El número que  se  encuentra  enla  última  posición  
 *   debe  pasar  a  la  posición  0.  Finalmente, muestra el contenidodel array
 *   original y rotado, utilizar metodos.
 */
package guiaMetodos;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        int[] numeros = generarNumerosAleatorios();
		        mostrarNumeros("Array original:", numeros);
		        numeros = rotarNumeros(numeros);
		        mostrarNumeros("Array rotado:", numeros);
		    }

		    public static int[] generarNumerosAleatorios() {
		        Random rand = new Random();
		        int[] numeros = new int[15];
		        for (int i = 0; i < numeros.length; i++) {
		            numeros[i] = rand.nextInt(100);
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

		    public static int[] rotarNumeros(int[] numeros) {
		        int[] rotados = new int[numeros.length];
		        rotados[0] = numeros[numeros.length - 1];
		        for (int i = 1; i < numeros.length; i++) {
		            rotados[i] = numeros[i - 1];
		        }
		        return rotados;
		    }
		}
