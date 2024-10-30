/*
 * Ejercicio 14: Define  un  array  de  10  caracteres  con  nombre simbolo
 *  y  asigna  valores  a  loselementos según la tabla que se muestra a continuación.
 *   Muestra el contenidode todos los elementos del array. 
 *   ¿Qué sucede con los valores de los elementosque no han sido inicializados?
 */
package guiaMetodos;

import javax.swing.JOptionPane;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        String num[] = new String[10];
        num[0]="a";
        num[1]="x";
        num[4]="@";
        num[6]=" ";
        num[7]="+";
        num[8]="Q";
       
     
        mostrarNumeros("Contenido del array:", num);
    }

    public static void mostrarNumeros(String mensaje, String[] numeros) {
        StringBuilder sb = new StringBuilder(mensaje);
        for (int i = 0; i < numeros.length; i++) {
            sb.append("\nIndice ").append(i).append(": ").append(numeros[i]);
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
