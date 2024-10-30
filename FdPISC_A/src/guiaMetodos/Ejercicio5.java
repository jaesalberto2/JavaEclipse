/*
 * Ejercicio 5: Realiza un programa que vaya generando números aleatorios
 *  pares entre 0 y 100 y que no termine de generar números hasta que no saque el 24.
 *   El programa deberá decir al final cuántos números se han generado
 *   utilizando metodos.
 */
package guiaMetodos;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
		        int contador = generarNumeros();
		        JOptionPane.showMessageDialog(null, "Se han generado " + contador + " numeros hasta obtener el 24.\n");
		    }

		    public static int generarNumeros() {
		        Random rand = new Random();
		        int numero, contador = 0;
		        String cadena="";

		        do {
		            numero = rand.nextInt(101);
		            cadena += numero+" ";
		            if (numero % 2 == 0) {
		                contador++;
		            }
		        } while (numero != 24);
		        JOptionPane.showMessageDialog(null, cadena);

		        

		        return contador;
		        
		    }
		}
