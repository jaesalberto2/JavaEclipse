package guiaExamen;

import java.util.Scanner;

public class MediaNoche {

	public static void main(String[] args) {

	    Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce las horas:");
        int horas = scanner.nextInt();

        System.out.println("Introduce los minutos:");
        int minutos = scanner.nextInt();

        if (horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59) {
            int segundosFaltantes = ((23 - horas) * 3600) + ((59 - minutos) * 60) + 60;
            System.out.println("Los segundos que faltan para llegar a la medianoche son: " + segundosFaltantes);
        } else {
            System.out.println("La hora introducida no es válida.");
        }

	}

}
