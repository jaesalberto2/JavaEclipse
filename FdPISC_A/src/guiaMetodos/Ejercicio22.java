/*
 * Ejercicio 22: Escribe   un   programa   que   pida   8   palabras  
 *  y   las   almacene   en   un   array.   Acontinuación,  las  palabras 
 *   correspondientes  a  colores  se  deben  almacenar  alcomienzo  y  las
 *     que  no  son  colores  a  continuación.  Puedes  utilizar  tantos  
 *     arraysauxiliares comoquieras. Los colores que conoce el programa deben
 *      estar enotro array y son los siguientes: verde, rojo, azul, amarillo,
 *       naranja, rosa, negro,blanco y morado.
 */
package guiaMetodos;

import javax.swing.JOptionPane;

public class Ejercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        String[] palabras = new String[8];
		        for (int i = 0; i < palabras.length; i++) {
		            palabras[i] = JOptionPane.showInputDialog(null, "Introduce la palabra " + (i + 1) + ":");
		        }
		        palabras = organizarPalabras(palabras);
		        mostrarPalabras("Palabras organizadas:", palabras);
		    }

		    public static String[] organizarPalabras(String[] palabras) {
		        String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
		        String[] organizadas = new String[palabras.length];
		        int indiceColor = 0, indiceNoColor = palabras.length / 2;
		        for (String palabra : palabras) {
		            boolean esColor = false;
		            for (String color : colores) {
		                if (palabra.equalsIgnoreCase(color)) {
		                    esColor = true;
		                    break;
		                }
		            }
		            if (esColor) {
		                organizadas[indiceColor++] = palabra;
		            } else {
		                organizadas[indiceNoColor++] = palabra;
		            }
		        }
		        return organizadas;
		    }

		    public static void mostrarPalabras(String mensaje, String[] palabras) {
		        StringBuilder sb = new StringBuilder(mensaje);
		        for (String palabra : palabras) {
		            sb.append("\n").append(palabra);
		        }
		        JOptionPane.showMessageDialog(null, sb.toString());
		    }
		}

