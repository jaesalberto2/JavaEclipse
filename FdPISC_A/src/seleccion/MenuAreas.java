/*
 * Ejercicio13: Determine el area de las siguientes figuras mediante el uso de la sentencia switch:
 * Circulo,Triangulo,Rectangulo y Cuadrado
 */
package seleccion;

import java.util.Scanner;

public class MenuAreas {

	public static void main(String[] args) {
		// Declaracion de variables
		double radio,area,base,altura,lado;
		int opc;
		Scanner in =new Scanner(System.in);
		System.out.println("_______________________________________________________");
		System.out.println("\tMenu Areas\n1._Circulo\n2._Triangulo\n3.-Rectangulo\n4.-Cuadrado\n5.-Paralelogramo\n\6.-Rombo\n7.-Cometa\n8.-Trapecio\n9.-Elipse\n10._Salir\nSelecciona Opcion");
		opc = in.nextInt();
				switch(opc)
				{
				case 1: {
					System.out.println("__________________________________________________________");
					System.out.println("\tArea Circulo");
					System.out.println("__________________________________________________________");
					System.out.println("Ingresa el valor del radio : ");
					radio = in.nextDouble();
					area = Math.PI*Math.pow(radio,2);
					System.out.println("Area del circulo "+area);
					}//fin de case1
				break;
				case 2: {
					System.out.println("__________________________________________________________");
					System.out.println("\tArea Triangulo");
					System.out.println("__________________________________________________________");
					System.out.println("Ingresa el valor de la base : ");
					base = in.nextDouble();
					System.out.println("Ingresa el valor de la altura : ");
					altura = in.nextDouble();
					area = (base*altura)/2;
					System.out.println("Area del Triangulo "+area);
					}//fin de case2}
				break;
				case 3: {
					System.out.println("__________________________________________________________");
					System.out.println("\tArea Rectangulo");
					System.out.println("__________________________________________________________");
					System.out.println("Ingresa el valor de la base : ");
					base = in.nextDouble();
					System.out.println("Ingresa el valor de la altura : ");
					altura = in.nextDouble();
					area = (base*altura);
					System.out.println("Area del Rectangulo "+area);
					}//fin de case3}
				break;
				case 4: {
					System.out.println("__________________________________________________________");
					System.out.println("\tArea Cuadrado");
					System.out.println("__________________________________________________________");
					System.out.println("Ingresa el valor del lado : ");
					lado = in.nextDouble();
					area = Math.pow(lado,2);
					System.out.println("Area del Rectangulo "+area);
					}//fin de case4}
				break;
				case 5: {
					System.out.println("__________________________________________________________");
					System.out.println("\tArea Paralelogramo");
					System.out.println("__________________________________________________________");
					System.out.println("Ingresa el valor de la base : ");
					base = in.nextDouble();
					System.out.println("Ingresa el valor de la altura : ");
					altura = in.nextDouble();
					area = (base*altura);
					System.out.println("Area del Paralelogramo "+area);
					
					}//fin de case5}
				break;
				case 6: {
					System.out.println("__________________________________________________________");
					System.out.println("\tArea Cuadrado");
					System.out.println("__________________________________________________________");
					System.out.println("Ingresa el valor del lado : ");
					lado = in.nextDouble();
					area = Math.pow(lado,2);
					System.out.println("Area del Rectangulo "+area);
					}//fin de case6}
				break;
				case 7: {
					System.out.println("__________________________________________________________");
					System.out.println("\tArea Cuadrado");
					System.out.println("__________________________________________________________");
					System.out.println("Ingresa el valor del lado : ");
					lado = in.nextDouble();
					area = Math.pow(lado,2);
					System.out.println("Area del Rectangulo "+area);
					}//fin de case7}
				break;
				case 8: {
					System.out.println("__________________________________________________________");
					System.out.println("\tArea Cuadrado");
					System.out.println("__________________________________________________________");
					System.out.println("Ingresa el valor del lado : ");
					lado = in.nextDouble();
					area = Math.pow(lado,2);
					System.out.println("Area del Rectangulo "+area);
					}//fin de case8}
				break;
				case 9: {
					System.out.println("__________________________________________________________");
					System.out.println("\tArea Cuadrado");
					System.out.println("__________________________________________________________");
					System.out.println("Ingresa el valor del lado : ");
					lado = in.nextDouble();
					area = Math.pow(lado,2);
					System.out.println("Area del Rectangulo "+area);
					}//fin de case9}
				break;
				
				case 10: {
					System.exit(0);
					}//fin de case10}
				default: System.out.println("Opcion Invalida!!!");
				
				}//fin del switch

	}

}
