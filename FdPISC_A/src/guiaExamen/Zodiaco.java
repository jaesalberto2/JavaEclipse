package guiaExamen;

import java.util.Scanner;

public class Zodiaco {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el día de tu nacimiento:");
        int dia = scanner.nextInt();

        System.out.println("Introduce el mes de tu nacimiento:");
        int mes = scanner.nextInt();

        String signoZodiaco = "";

        if ((dia >= 21 && mes == 3) || (dia <= 20 && mes == 4)) {
            signoZodiaco = "Aries";
        } else if ((dia >= 21 && mes == 4) || (dia <= 21 && mes == 5)) {
            signoZodiaco = "Tauro";
        } else if ((dia >= 22 && mes == 5) || (dia <= 21 && mes == 6)) {
            signoZodiaco = "Géminis";
        } else if ((dia >= 22 && mes == 6) || (dia <= 22 && mes == 7)) {
            signoZodiaco = "Cáncer";
        } else if ((dia >= 23 && mes == 7) || (dia <= 23 && mes == 8)) {
            signoZodiaco = "Leo";
        } else if ((dia >= 24 && mes == 8) || (dia <= 23 && mes == 9)) {
            signoZodiaco = "Virgo";
        } else if ((dia >= 24 && mes == 9) || (dia <= 23 && mes == 10)) {
            signoZodiaco = "Libra";
        } else if ((dia >= 24 && mes == 10) || (dia <= 22 && mes == 11)) {
            signoZodiaco = "Escorpio";
        } else if ((dia >= 23 && mes == 11) || (dia <= 21 && mes == 12)) {
            signoZodiaco = "Sagitario";
        } else if ((dia >= 22 && mes == 12) || (dia <= 20 && mes == 1)) {
            signoZodiaco = "Capricornio";
        } else if ((dia >= 21 && mes == 1) || (dia <= 19 && mes == 2)) {
            signoZodiaco = "Acuario";
        } else if ((dia >= 20 && mes == 2) || (dia <= 20 && mes == 3)) {
            signoZodiaco = "Piscis";
        }

        System.out.println("Tu signo del zodiaco es: " + signoZodiaco);
    


	}

}
