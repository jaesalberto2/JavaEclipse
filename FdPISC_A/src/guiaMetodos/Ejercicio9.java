/*
 * Ejercicio 9: Define  tres  arreglos  de  20  números  enteros  cada  una, 
 *  con  nombres  numero, cuadrado y cubo. Carga el arreglonumero con valores 
 *  aleatorios entre 1y 100. En el array cuadrado se deben almacenar los cuadrados 
 *  de los valores que hay en el array numero. En el array cubo se deben almacenar
 *   los cubos de los valores quehay en numero. A continuación, muestra el contenido
 *    de los tres arrays dispuesto en tres columnas.
 */
package guiaMetodos;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        int[] numero = new int[20];
		        int[] cuadrado = new int[20];
		        int[] cubo = new int[20];

		        cargarNumeros(numero);
		        calcularCuadrados(numero, cuadrado);
		        calcularCubos(numero, cubo);

		        mostrarNumeros(numero, cuadrado, cubo);
		    }

		    public static void cargarNumeros(int[] numero) {
		        Random rand = new Random();

		        for (int i = 0; i < numero.length; i++) {
		            numero[i] = rand.nextInt(100) + 1;
		        }
		    }

		    public static void calcularCuadrados(int[] numero, int[] cuadrado) {
		        for (int i = 0; i < numero.length; i++) {
		            cuadrado[i] = numero[i] * numero[i];
		        }
		    }

		    public static void calcularCubos(int[] numero, int[] cubo) {
		        for (int i = 0; i < numero.length; i++) {
		            cubo[i] = numero[i] * numero[i] * numero[i];
		        }
		    }

		    public static void mostrarNumeros(int[] numero, int[] cuadrado, int[] cubo) {
		        StringBuilder sb = new StringBuilder("Numero  Cuadrado  Cubo\n");

		        for (int i = 0; i < numero.length; i++) {
		            sb.append(numero[i]).append("            ").append(cuadrado[i]).append("    ").append(cubo[i]).append("\n");
		        }

		        JOptionPane.showMessageDialog(null, sb.toString());
		    }
		}
