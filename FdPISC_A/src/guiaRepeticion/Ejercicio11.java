/*
 * 
 */
package guiaRepeticion;
import javax.swing.JOptionPane;
public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inicio,i;
		String conc="Numero        cuadrado        cubo\n";
		inicio=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero entero:",
                JOptionPane.INFORMATION_MESSAGE));
		
		for(i=0;i<=5;i++)
		{
			conc += inicio+"                   "+Math.pow(inicio, 2)+"            "+Math.pow(inicio, 3)+"\n";
			inicio++;
			
		}//fin del for
		
		JOptionPane.showMessageDialog(null, 
                conc,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
	}

}
