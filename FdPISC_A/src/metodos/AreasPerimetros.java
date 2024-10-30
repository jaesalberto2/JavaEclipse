package metodos;

import javax.swing.JOptionPane;

public class AreasPerimetros {

	public static void main(String[] args) {
		//llamar al metodo menuPrincipal()
		menuPrincipal();
		

	}//fin del metodo main

	private static void menuPrincipal() {
		// Declaracion de variables
		int opc;
		do {
		opc=Integer.parseInt(JOptionPane.showInputDialog(null,"1.- Areas\n"
				+ "2.- Perimetros\n3.- Salir","Menu Principal"
						+ "",JOptionPane.INFORMATION_MESSAGE));
		switch(opc)
		{
		case 1: menuAreas();
			break;
		case 2: menuPerimetros();
			break;
		case 3: System.exit(0);
		default:JOptionPane.showMessageDialog(null, ""
				+ "Opcion Invalida","Error!!!",JOptionPane.ERROR_MESSAGE);
		}//fin del switch
		}while(opc!=3);//fin del do while
	}

	private static void menuPerimetros() {
		int opc;
		do {
			
			opc=Integer.parseInt(JOptionPane.showInputDialog(null,"1.-Circulo\n2.-Rectangulo\n"
					+ "3.-Triangulo\n4.-Cuadrado"
					+ "\n5.-Menu anterior\n","Menu Perimetros"
							+ "",JOptionPane.INFORMATION_MESSAGE));
			switch(opc)
			{
			case 1: perimetroCirculo();
				break;
			case 2: perimetroRectangulo();
				break;
			case 3: perimetroTriangulo();
				break;
			case 4: perimetroCuadrado();
				break;
			case 5:menuPrincipal();
				break;
				
			default:JOptionPane.showMessageDialog(null, ""
					+ "Opcion Invalida","Error!!!",JOptionPane.ERROR_MESSAGE);
			}//fin del switch
			}while(opc!=5);
		
	}

	

	private static void perimetroCuadrado() {
		// Declaracion de variables
				double lado;
				lado = Double.parseDouble(JOptionPane.showInputDialog(null,"ingresa valor",
						 "Lado",JOptionPane.INFORMATION_MESSAGE));
				
				JOptionPane.showMessageDialog(null, (lado*4),"Perimetro del Rectangulo",JOptionPane.INFORMATION_MESSAGE);
				
		
	}

	private static void perimetroTriangulo() {
		// Declaracion de variables
				double lado1,lado2,lado3;
				lado1 = Double.parseDouble(JOptionPane.showInputDialog(null,"ingresa valor",
						 "Lado 1",JOptionPane.INFORMATION_MESSAGE));
				lado2 = Double.parseDouble(JOptionPane.showInputDialog(null,"ingresa valor",
						 "Lado 2",JOptionPane.INFORMATION_MESSAGE));
				lado3 = Double.parseDouble(JOptionPane.showInputDialog(null,"ingresa valor",
						 "Lado 3",JOptionPane.INFORMATION_MESSAGE));
				JOptionPane.showMessageDialog(null, (lado1+lado2+lado3),"Perimetro del Triangulo",JOptionPane.INFORMATION_MESSAGE);
				
		
	}

	private static void perimetroRectangulo() {
		// Declaracion de variables
				double base,altura;
				base = Double.parseDouble(JOptionPane.showInputDialog(null,"ingresa valor",
						 "Base",JOptionPane.INFORMATION_MESSAGE));
				altura = Double.parseDouble(JOptionPane.showInputDialog(null,"ingresa valor",
						 "Altura",JOptionPane.INFORMATION_MESSAGE));
				JOptionPane.showMessageDialog(null, (base*2+altura*2),"Perimetro del Rectangulo",JOptionPane.INFORMATION_MESSAGE);
				
		
	}

	private static void perimetroCirculo() {
		// Declaracion de variables
				double radio;
				radio = Double.parseDouble(JOptionPane.showInputDialog(null,"ingresa valor"
						+ "","Radio",JOptionPane.INFORMATION_MESSAGE));
				JOptionPane.showMessageDialog(null, Math.PI*(radio*2),"Perimetro del circulo",JOptionPane.INFORMATION_MESSAGE);
	}

	private static void menuAreas() {
		// declaracion de variables
		int opc;
		do {
			
		opc=Integer.parseInt(JOptionPane.showInputDialog(null,"1.-Circulo\n2.-Rectangulo\n"
				+ "3.-Triangulo\n4.-Cuadrado"
				+ "\n5.-Menu anterior\n","Menu Areas"
						+ "",JOptionPane.INFORMATION_MESSAGE));
		switch(opc)
		{
		case 1: areaCirculo();
			break;
		case 2: areaRectangulo();
			break;
		case 3: areaTriangulo();
			break;
		case 4: areaCuadrado();
			break;
		case 5:menuPrincipal();
			break;
			
		default:JOptionPane.showMessageDialog(null, ""
				+ "Opcion Invalida","Error!!!",JOptionPane.ERROR_MESSAGE);
		}//fin del switch
		}while(opc!=5);
		
	}//fin del metodo menuPrincipal

	private static void areaCuadrado() {
		// Declaracion de variables
		double lado;
		lado = Double.parseDouble(JOptionPane.showInputDialog(null,"ingresa valor",
				 "Lado",JOptionPane.INFORMATION_MESSAGE));
		
		JOptionPane.showMessageDialog(null, (Math.pow(lado, 2)),"Area del Rectangulo",JOptionPane.INFORMATION_MESSAGE);
		
	}

	private static void areaTriangulo() {
		// Declaracion de variables
		double base,altura;
		base = Double.parseDouble(JOptionPane.showInputDialog(null,"ingresa valor",
				 "Base",JOptionPane.INFORMATION_MESSAGE));
		altura = Double.parseDouble(JOptionPane.showInputDialog(null,"ingresa valor",
				 "Altura",JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showMessageDialog(null, ((base*altura)/2),"Area del Rectangulo",JOptionPane.INFORMATION_MESSAGE);		
	}

	private static void areaRectangulo() {
		// Declaracion de variables
		double base,altura;
		base = Double.parseDouble(JOptionPane.showInputDialog(null,"ingresa valor",
				 "Base",JOptionPane.INFORMATION_MESSAGE));
		altura = Double.parseDouble(JOptionPane.showInputDialog(null,"ingresa valor",
				 "Altura",JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showMessageDialog(null, (base*altura),"Area del Rectangulo",JOptionPane.INFORMATION_MESSAGE);
		
	}

	private static void areaCirculo() {
		// Declaracion de variables
		double radio;
		radio = Double.parseDouble(JOptionPane.showInputDialog(null,"ingresa valor"
				+ "","Radio",JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showMessageDialog(null, Math.PI*Math.pow(radio, 2),"Area del circulo",JOptionPane.INFORMATION_MESSAGE);
	}

}//fin de la clase
