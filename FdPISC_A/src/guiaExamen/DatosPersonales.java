package guiaExamen;

import java.util.Scanner;

public class DatosPersonales {

	public static void main(String[] args) {


		
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Introduce tu edad:");
		        int edad = scanner.nextInt();

		        System.out.println("Introduce tu sexo (H para hombre, M para mujer):");
		        String sexo = scanner.next();

		        if (sexo.equalsIgnoreCase("H")) {
		            if (edad >= 18) {
		                System.out.println("Eres un hombre mayor de edad.");
		            } else {
		                System.out.println("Eres un hombre menor de edad.");
		            }
		        } else if (sexo.equalsIgnoreCase("M")) {
		            if (edad >= 18) {
		                System.out.println("Eres una mujer mayor de edad.");
		            } else {
		                System.out.println("Eres una mujer menor de edad.");
		            }
		        } else {
		            System.out.println("El sexo introducido es incorrecto. Por favor, introduce H para hombre o M para mujer.");
		        }
		    

	}

}
