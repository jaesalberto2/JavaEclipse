package guiaRepeticion;

import java.util.Scanner;

public class Ejercicio20new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
				// Declaracion de variables
				 int altura,i,j,k;
				 Scanner in = new Scanner(System.in);
			        
			        System.out.print("Introduce la altura de la pirámide hueca: ");
			        altura = in.nextInt();
			        
			        System.out.print("Introduce el carácter con el que se pintará la pirámide hueca: ");
			        char caracter = in.next().charAt(0);
			        
			        for (i = 1; i <= altura; i++) {
			            
			            
			            for (j = 1; j <= altura - i; j++) {
			                System.out.print(" ");
			            }
			            
			           
			            for (k = 1; k <= (2 * i) - 1; k++) {
			                if (k == 1 || k == (2 * i) - 1 || i == altura) {
			                    System.out.print(caracter);
			                } else {
			                    System.out.print(" ");
			                }
			            }
			            
			            System.out.println("");
			           

		
		
		
		
	}

}}
