package guiaExamen;

import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {
		
	       // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que introduzca un número del 1 al 7
        System.out.println("Introduce un número del 1 al 7:");
        int numero = sc.nextInt();

        // Declarar una variable para almacenar el nombre del día de la semana
        String dia = "";

        // Usar la sentencia "if" para asignar el nombre del día de la semana según el número
        if (numero == 1) {
            dia = "Lunes";
        } else if (numero == 2) {
            dia = "Martes";
        } else if (numero == 3) {
            dia = "Miércoles";
        } else if (numero == 4) {
            dia = "Jueves";
        } else if (numero == 5) {
            dia = "Viernes";
        } else if (numero == 6) {
            dia = "Sábado";
        } else if (numero == 7) {
            dia = "Domingo";
        } else {
            // Si el número no está entre 1 y 7, mostrar un mensaje de error
            System.out.println("Número inválido. Debe ser entre 1 y 7.");
            // Terminar el programa
            return;
        }

        // Mostrar el resultado
        System.out.println("El día de la semana correspondiente al número " + numero + " es " + dia + ".");


	}

}
