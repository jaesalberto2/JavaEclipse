package basicos;

import java.util.Scanner;

public class ConversorTemperatura2 {

	public static void main(String[] args) {
		// Declaracion de variables
				double centigrados;
				Scanner entrada = new Scanner(System.in);
				System.out.println("Ingresa los grados centigrados : ");
				centigrados = entrada.nextDouble();
				System.out.println("__________________________________________________________________________________________________");
				System.out.println("\t\t\t\tConversor de Temperaturas");
				System.out.println("__________________________________________________________________________________________________");
				System.out.println("Centigrados\t\tFarenheit\t\tKelvin\t\tReamur\t\tRankine");
				System.out.println("__________________________________________________________________________________________________");
				System.out.println("\t"+centigrados+"\t\t"+((centigrados*1.8)+32)+"\t\t\t"+(centigrados+273.15)+"\t\t"+(centigrados/1.25)+"\t\t"+(centigrados*1.8+491.67));
				System.out.println("__________________________________________________________________________________________________");

	}

}
