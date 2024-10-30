/*
 * Ejercicio 17Realiza un programa que pida la temperatura media 
 * que ha hecho en cada mesde un   determinado   año   y   que  
 *  muestre   a   continuación   un   diagrama   de   barras
 *  horizontales con esos datos. Las barras del diagrama se pueden 
 *  dibujar a basede asteriscos o cualquier otro carácter.
 */
package guiaMetodos;

import javax.swing.JOptionPane;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        double[] temperaturas = new double[12];
		        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		        for (int i = 0; i < temperaturas.length; i++) {
		            String tempStr = JOptionPane.showInputDialog(null, "Introduce la temperatura media de " + meses[i] + ":");
		            temperaturas[i] = Double.parseDouble(tempStr);
		        }
		        mostrarDiagrama(meses, temperaturas);
		    }

		    public static void mostrarDiagrama(String[] meses, double[] temperaturas) {
		        StringBuilder sb = new StringBuilder("Diagrama de barras de temperaturas medias:\n");
		        for (int i = 0; i < temperaturas.length; i++) {
		            sb.append(meses[i]).append(": ");
		            int numAsteriscos = (int) Math.round(temperaturas[i]);
		            for (int j = 0; j < numAsteriscos; j++) {
		                sb.append("*");
		            }
		            sb.append("\n");
		        }
		        JOptionPane.showMessageDialog(null, sb.toString());
		    }
		}
