package guiaExamen;

import java.util.Scanner;

public class Minicuestionario {

	public static void main(String[] args) {

		   Scanner scanner = new Scanner(System.in);

	        int puntuacion = 0;

	        System.out.println("Pregunta 1: ¿Cual es la capital de Espana?");
	        String respuesta1 = scanner.nextLine();
	        if (respuesta1.equalsIgnoreCase("Madrid")) {
	            puntuacion++;
	        }

	        System.out.println("Pregunta 2: ¿Cual es el rio mas largo del mundo?");
	        String respuesta2 = scanner.nextLine();
	        if (respuesta2.equalsIgnoreCase("Amazonas")) {
	            puntuacion++;
	        }

	        System.out.println("Pregunta 3: ¿En que año termino la Segunda Guerra Mundial?");
	        String respuesta3 = scanner.nextLine();
	        if (respuesta3.equalsIgnoreCase("1945")) {
	            puntuacion++;
	        }

	        System.out.println("Pregunta 4: ¿Cual es el planeta mas grande del sistema solar?");
	        String respuesta4 = scanner.nextLine();
	        if (respuesta4.equalsIgnoreCase("jupiter")) {
	            puntuacion++;
	        }

	        System.out.println("Pregunta 5: ¿Cuantos lados tiene un octagono?");
	        String respuesta5 = scanner.nextLine();
	        if (respuesta5.equals("8")) {
	            puntuacion++;
	        }

	        System.out.println("Pregunta 6: ¿Cual es el elemento quimico con el simbolo O?");
	        String respuesta6 = scanner.nextLine();
	        if (respuesta6.equalsIgnoreCase("oxigeno")) {
	            puntuacion++;
	        }

	        System.out.println("Pregunta 7: ¿Quien es el autor de “Cien años de soledad”?");
	        String respuesta7 = scanner.nextLine();
	        if (respuesta7.equalsIgnoreCase("Gabriel Garcia Marquez")) {
	            puntuacion++;
	        }

	        System.out.println("Pregunta 8: ¿Quien pinto la Mona Lisa?");
	        String respuesta8 = scanner.nextLine();
	        if (respuesta8.equalsIgnoreCase("Leonardo da Vinci")) {
	            puntuacion++;
	        }

	        System.out.println("Pregunta 9: ¿Cual es la formula quimica del agua?");
	        String respuesta9 = scanner.nextLine();
	        if (respuesta9.equalsIgnoreCase("H2O")) {
	            puntuacion++;
	        }

	        System.out.println("Pregunta 10: ¿Cual es el animal terrestre mas rapido del mundo?");
	        String respuesta10 = scanner.nextLine();
	        if (respuesta10.equalsIgnoreCase("el guepardo")) {
	            puntuacion++;
	        }

	       
	        System.out.println("Tu puntuacion es: " + puntuacion);


	}

}
