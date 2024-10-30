package guiaExamen;

import java.util.Scanner;

public class Descuento {

	public static void main(String[] args) {


		
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Introduce el valor del producto:");
		        double valorProducto = scanner.nextDouble();

		        if (valorProducto > 30.00 && valorProducto < 100.00) {
		            valorProducto = valorProducto - (valorProducto * 0.03);
		            System.out.println("El producto tiene un descuento del 3%. El precio final es: $" + valorProducto);
		        } else if (valorProducto >= 100.00) {
		            valorProducto = valorProducto - (valorProducto * 0.08);
		            System.out.println("El producto tiene un descuento del 8%. El precio final es: $" + valorProducto);
		        } else {
		            System.out.println("El producto no tiene descuento. El precio final es: $" + valorProducto);
		        }
		    


	}

}
