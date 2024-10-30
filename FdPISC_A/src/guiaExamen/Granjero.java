package guiaExamen;

import java.util.Scanner;

public class Granjero {

	public static void main(String[] args) {


		
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Introduce el nombre del granjero:");
		        String nombreGranjero = scanner.nextLine();
		        System.out.println("Tipos de fumigacion\n"
		        		+ "• Tipo 1: Fumigacion contra malas hierbas $ 10 por hactárea.\r\n"
		        		+ "• Tipo 2: Fumugacion contra langostas $ 20 por hectárea.\r\n"
		        		+ "• Tipo 3: Fumigacion contra gusanos $ 30 por hectárea.\r\n"
		        		+ "• Tipo 4: Fumugacion contra todo lo anterior $50 por hectárea.\r\n"
		        		+ "");
		        System.out.println("Introduce el tipo de fumigación (1-4):");
		        int tipoFumigacion = scanner.nextInt();
		        System.out.println("Introduce el número de hectáreas a fumigar:");
		        int numHectareas = scanner.nextInt();

		        double costoPorHectarea = 0;
		        if (tipoFumigacion == 1) {
		            costoPorHectarea = 10;
		        } else if (tipoFumigacion == 2) {
		            costoPorHectarea = 20;
		        } else if (tipoFumigacion == 3) {
		            costoPorHectarea = 30;
		        } else if (tipoFumigacion == 4) {
		            costoPorHectarea = 50;
		        }

		        double costoTotal = costoPorHectarea * numHectareas;
		        if (numHectareas > 1000) {
		            costoTotal = costoTotal - (costoTotal * 0.05);
		        }

		        System.out.println("El granjero " + nombreGranjero + " debe pagar: $" + costoTotal);
		    

	}

}
