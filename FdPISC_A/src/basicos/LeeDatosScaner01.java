package basicos;

import java.util.Scanner;

public class LeeDatosScaner01 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	
		System.out.println("Introduce tu nombre: ");
		String nombre = s.nextLine();
		
		System.out.println("Introduce tu edad: ");
		int edad = Integer.parseInt(s.nextLine());
		
		System.out.println("Tu nombre es " + nombre + " y tu edad es "+ edad + " Years");
		

	}

}
