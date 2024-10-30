/*
 * Ejercicio 20: Operaciones basicas con JOption
 */
package repeticion;

 

import javax.swing.JOptionPane;

 

public class OperacionesBasicasJoption {

 

    public static void main(String[] args) {
        // declaracion de variables
        int opc,num1=0,num2=0;
        // definicion del menu con JOption
        do {
        opc=Integer.parseInt(JOptionPane.showInputDialog(null,"1.-Ingresa Valores"
                + "\n2.-Suma\n3.-Resta\n4.-Multiplicacion\n"
                + "5.-Division\n6.-Salir","Menu Operaciones",
                JOptionPane.INFORMATION_MESSAGE));
        switch(opc)
        {
        case 1:
        {
        num1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa Valor :",
                "Valor 1",JOptionPane.INFORMATION_MESSAGE));
        num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa Valor :",
                "Valor 2",JOptionPane.INFORMATION_MESSAGE));
            
        }
        break;
        case 2:
        {
            JOptionPane.showMessageDialog(null, 
                num1+" + "+num2+" = "+(num1+num2),
                "Resultado de la suma",
                JOptionPane.INFORMATION_MESSAGE);
        }
        break;
        case 6: System.exit(0);
        default:JOptionPane.showMessageDialog(null, 
                "Opcion Invalida","Error !!!!",
                JOptionPane.ERROR_MESSAGE);
        }// fin del switch
        }while(opc!=6);
    }

 

}