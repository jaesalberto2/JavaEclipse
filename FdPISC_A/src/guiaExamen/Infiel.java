package guiaExamen;

import java.util.Scanner;

public class Infiel {

	public static void main(String[] args) {

		
		        Scanner scanner = new Scanner(System.in);
		        int puntos = 0;

		        System.out.println("Responde las siguientes preguntas con 'verdadero' o 'falso'");

		        System.out.println("Pregunta 1: ¿Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente?");
		        if (scanner.nextLine().equalsIgnoreCase("verdadero")) {
		            puntos += 3;
		        }

		        System.out.println("Pregunta 2: ¿Ha comenzado a ocultar su teléfono móvil?");
		        if (scanner.nextLine().equalsIgnoreCase("verdadero")) {
		            puntos += 3;
		        }

		        System.out.println("Pregunta 3: ¿Ha comenzado a salir más con sus amigos y menos contigo?");
		        if (scanner.nextLine().equalsIgnoreCase("verdadero")) {
		            puntos += 3;
		        }

		        System.out.println("Pregunta 4: ¿Se arregla más al salir solo(a) que cuando sale contigo?");
		        if (scanner.nextLine().equalsIgnoreCase("verdadero")) {
		            puntos += 3;
		        }

		        System.out.println("Pregunta 5: ¿Ha cambiado sus contraseñas de las redes sociales recientemente?");
		        if (scanner.nextLine().equalsIgnoreCase("verdadero")) {
		            puntos += 3;
		        }

		        if (puntos > 10) {
		            System.out.println("Según el puntaje, hay una alta probabilidad de infidelidad.");
		        } else if (puntos > 5) {
		            System.out.println("Según el puntaje, podría haber una probabilidad de infidelidad.");
		        } else {
		            System.out.println("Según el puntaje, es poco probable que tu pareja te esté siendo infiel.");
		        }
		    
		


	}

}
