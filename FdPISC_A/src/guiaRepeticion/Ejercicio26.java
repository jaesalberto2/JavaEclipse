package guiaRepeticion;

import javax.swing.JOptionPane;

public class Ejercicio26 {

	public static void main(String[] args) {

		
		        String numStr;
		        String digitStr;
		        int index = -1;
		        do {
		            numStr = JOptionPane.showInputDialog("Introduce un número:");
		            digitStr = JOptionPane.showInputDialog("Introduce un dígito:");
		            index = numStr.indexOf(digitStr);
		            if (index == -1) {
		                JOptionPane.showMessageDialog(null, "El dígito " + digitStr + " no se encuentra en el número " + numStr);
		            } else {
		                JOptionPane.showMessageDialog(null, "El dígito " + digitStr + " se encuentra en la posición " + (index + 1) + " del número " + numStr);
		            }
		        } while (index == -1);
		 

		

	}

}
