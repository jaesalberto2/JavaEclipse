package guiaExamen;

import java.util.Scanner;

public class DiaMateria {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un día de la semana:");
        String dia = sc.nextLine().toLowerCase();
        sc.close();
        if (dia.equals("lunes")) {
            System.out.println("A primera hora toca cálculo.");
        } else if (dia.equals("martes")) {
            System.out.println("A primera hora toca administración.");
        } else if (dia.equals("miércoles")) {
            System.out.println("A primera hora toca programación.");
        } else if (dia.equals("jueves")) {
            System.out.println("A primera hora toca matemáticas.");
        } else if (dia.equals("viernes")) {
            System.out.println("A primera hora toca ética.");
        } else if (dia.equals("sábado") || dia.equals("domingo")) {
            System.out.println("Hoy no hay clases. Disfruta del día libre.");
        } else {
            System.out.println("No es un día válido. Introduce un día de la semana entre lunes y domingo.");
        }
    }


	}


