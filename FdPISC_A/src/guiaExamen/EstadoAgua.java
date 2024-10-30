package guiaExamen;

import java.util.Scanner;

public class EstadoAgua {

	public static void main(String[] args) {


		
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Introduce la temperatura del agua:");
		        int temperatura = scanner.nextInt();

		        if (temperatura <= 0) {
		            System.out.println("El agua está en estado sólido.");
		        } else if (temperatura < 100) {
		            System.out.println("El agua está en estado líquido.");
		        } else {
		            System.out.println("El agua está en estado gaseoso.");
		        }
		    


	}

}
