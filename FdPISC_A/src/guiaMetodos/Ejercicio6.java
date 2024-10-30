/*
 * Ejercicio 6 Escribe  un  programa  que  muestre  20  notas  generadas  al  azar.
 *   Las  notas  deben aparecer  de  la  forma:  suspenso,  suficiente,  bien,
 *     notable  o  sobresaliente.  Al  final aparecerá el número de suspensos,
 *      el número de suficientes, el número de bienes, etc.
 */
package guiaMetodos;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        int[] contadorNotas = new int[5];
		        String notas = generarNotas(contadorNotas);

		        JOptionPane.showMessageDialog(null, "Las notas generadas son: \n" + notas + "\nSuspendidos: " + contadorNotas[0] + "\nSuficientes: " + contadorNotas[1] + "\nBienes: " + contadorNotas[2] + "\nNotables: " + contadorNotas[3] + "\nSobresalientes: " + contadorNotas[4]);
		    }

		    public static String generarNotas(int[] contadorNotas) {
		        Random rand = new Random();
		        StringBuilder sb = new StringBuilder();

		        for (int i = 0; i < 20; i++) {
		            int nota = rand.nextInt(10) + 1;
		            if (nota < 5) {
		                sb.append("Suspendido\n");
		                contadorNotas[0]++;
		            } else if (nota < 6) {
		                sb.append("Suficiente\n");
		                contadorNotas[1]++;
		            } else if (nota < 7) {
		                sb.append("Bien\n");
		                contadorNotas[2]++;
		            } else if (nota < 9) {
		                sb.append("Notable\n");
		                contadorNotas[3]++;
		            } else {
		                sb.append("Sobresaliente\n");
		                contadorNotas[4]++;
		            }
		        }

		        return sb.toString();
		    }
		}
