package guiaExamen;

import java.util.Scanner;

public class Perimetro {

	public static void main(String[] args) {


		
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Selecciona una opcion:");
		        System.out.println("1. Rectangulo");
		        System.out.println("2. Trapecio");
		        System.out.println("3. Circulo");
		        System.out.println("4. Triangulo");
		        System.out.println("5. Cuadrado");
		        System.out.println("6. Rombo");

		        int opcion = scanner.nextInt();

		        if (opcion == 1) {
		            System.out.println("Introduce la longitud y la anchura del rectangulo:");
		            double longitud = scanner.nextDouble();
		            double anchura = scanner.nextDouble();
		            double perimetro = 2 * (longitud + anchura);
		            System.out.println("El perimetro del rectangulo es: " + perimetro);
		        } else if (opcion == 2) {
		            System.out.println("Introduce la longitud de los lados y las bases del trapecio:");
		            double lado1 = scanner.nextDouble();
		            double lado2 = scanner.nextDouble();
		            double base1 = scanner.nextDouble();
		            double base2 = scanner.nextDouble();
		            double perimetro = lado1 + lado2 + base1 + base2;
		            System.out.println("El perímetro del trapecio es: " + perimetro);
		        } else if (opcion == 3) {
		            System.out.println("Introduce el radio del círculo:");
		            double radio = scanner.nextDouble();
		            double perimetro = 2 * Math.PI * radio;
		            System.out.println("El perímetro del círculo es: " + perimetro);
		        } else if (opcion == 4) {
		            System.out.println("Introduce la longitud de los lados del triángulo:");
		            double lado1 = scanner.nextDouble();
		            double lado2 = scanner.nextDouble();
		            double lado3 = scanner.nextDouble();
		            double perimetro = lado1 + lado2 + lado3;
		            System.out.println("El perímetro del triángulo es: " + perimetro);
		        } else if (opcion == 5) {
		            System.out.println("Introduce la longitud del lado del cuadrado:");
		            double lado = scanner.nextDouble();
		            double perimetro = 4 * lado;
		            System.out.println("El perímetro del cuadrado es: " + perimetro);
		        } else if (opcion == 6) {
		            System.out.println("Introduce la longitud de los lados del rombo:");
		            double lado = scanner.nextDouble();
		            double perimetro = 4 * lado;
		            System.out.println("El perímetro del rombo es: " + perimetro);
		        } else {
		            System.out.println("Opción no válida.");
		        }
		    


	}

}
