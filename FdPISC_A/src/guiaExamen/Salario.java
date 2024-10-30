package guiaExamen;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce las horas trabajadas esta semana:");
        int horasTrabajadas = scanner.nextInt();

        double salario;
        if (horasTrabajadas <= 40) {
            salario = horasTrabajadas * 12;
        } else {
            int horasExtra = horasTrabajadas - 40;
            salario = (40 * 12) + (horasExtra * 16);
        }

        System.out.println("El salario semanal es: " + salario + " euros");


	}

}
