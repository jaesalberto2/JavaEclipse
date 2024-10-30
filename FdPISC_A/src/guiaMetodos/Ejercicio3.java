/*
 * Ejercicio 3 Muestra   50   números   enteros   aleatorios   entre   
 * 100   y   199   (ambos   incluidos)separados por espacios.
 *  Muestra la media de esos números.
 */
package guiaMetodos;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        int num = 50;

		        String numerosAleatorios = generarNumerosAleatorios(num);
		        double media = calcularMedia(numerosAleatorios);

		        JOptionPane.showMessageDialog(null, "Los numeros aleatorios generados son: \n" + numerosAleatorios + "\nLa media de estos numeros es: " + media);
		    }

		    public static String generarNumerosAleatorios(int num) {
		        Random rand = new Random();
		        StringBuilder sb = new StringBuilder();

		        for (int i = 0; i < num; i++) {
		            int numeroAleatorio = rand.nextInt(100) + 100;
		            sb.append(numeroAleatorio).append(" ");
		        }

		        return sb.toString();
		    }

		    public static double calcularMedia(String numeros) {
		        String[] numerosArray = numeros.split(" ");
		        double suma = 0;

		        for (String numero : numerosArray) {
		            suma += Integer.parseInt(numero);
		        }

		        return suma / numerosArray.length;
		    }
		}
