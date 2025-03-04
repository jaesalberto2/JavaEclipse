	/*
		 * Ejercicio 14: Realizar las operaciones basicas con arreglos
		 * suma, resta, multiplicacion,division,residuo e intercambio,
		 * generar los arreglos con numeros aleatorios con un rango de 1 a 20
		 * utilizar metodos
		 */
package metodos;

import javax.swing.JOptionPane;

public class OperacionesArreglos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
				// TODO Auto-generated method stub
				menuArreglos();
				

			}

			private static void menuArreglos() {
				// TODO Auto-generated method stub
				int opc;
				int x[]=new int[20];
				int y[]=new int[20];
				int z[]=new int[20];
				int k[]=new int[40];
			
				do {
				opc=Integer.parseInt(JOptionPane.showInputDialog(null,"\n1._Inicializar arreglos\n2.-Suma Arreglos\n3.-Resta Arreglos"
						+ "\n4.-Multiplicacion Arreglos\n5.-Division Arreglos\n6.-Residio Arreglos\n"
						+ "7.-Intercalacion Arreglos\n8.-Salir\n\nSelecciona Opcion"));
				
				
				switch(opc)
				{
				case 1:
					//inicializar los arreglos con numeros random
					for(int i=0;i<x.length;i++)
					{
						x[i]=(int)(Math.random()*20+1);
						y[i]=(int)(Math.random()*20+1);
					
					}
					break;
				case 2: sumaArreglos(x,y,z);
					break;
				case 3: restaArreglos(x,y,z);
					break;
				case 4: multiplicacionArreglos(x,y,z);
					break;
				case 5:	divisionArreglos(x,y,z);
					break;
				case 6:	residuoArreglos(x,y,z);
					break;
				case 7: intercalaArreglos(x,y,k);
					break;
				case 8:
					System.exit(0);
				default: JOptionPane.showConfirmDialog(null, "Error, Opcion Invalida!!");
				}//fin del switch
				}while(opc!=8);//fin de do while
			}

			private static void residuoArreglos(int[] x, int[] y, int[] z) {
				// TODO Auto-generated method stub
				String operador=" % ";
				for(int i=0;i<x.length;i++)
				{
					z[i]=x[i]%y[i];//residuo de arreglos
				}
				imprimeArreglo(x,y,z,operador);
			}

			private static void divisionArreglos(int[] x, int[] y, int[] z) {
				// TODO Auto-generated method stub
				String operador=" / ";
				for(int i=0;i<x.length;i++)
				{
					z[i]=x[i]/y[i];//division de arreglos
				}
				imprimeArreglo(x,y,z,operador);
			}

			private static void multiplicacionArreglos(int[] x, int[] y, int[] z) {
				// TODO Auto-generated method stub
				String operador=" X ";
				for(int i=0;i<x.length;i++)
				{
					z[i]=x[i]*y[i];//Multiplicacion de arreglos
				}
				imprimeArreglo(x,y,z,operador);
			}

			private static void intercalaArreglos(int[] x, int[] y, int[] k) {
				// TODO Auto-generated method stub
				for(int i=0; i< x.length-2; i++)
				{
					k[2*i]=x[i];
					k[2*i+1]=y[i];
				}
				imprimeIntercalado(x,y,k);
				
				
			}

			

			private static void imprimeIntercalado(int[] x, int[] y, int[] k) {
				// TODO Auto-generated method stub
				String cadena="";
				for(int i=0; i<k.length ; i++)
				{
					
					cadena=(k[i]+"\t");
				}
				JOptionPane.showConfirmDialog(null, cadena);
			}

			private static void restaArreglos(int[] x, int[] y, int[] z) {
				// Realizar la resta de los arreglos
				String operador=" - ";
				for(int i=0;i<x.length;i++)
				{
					z[i]=x[i]-y[i];//resta de arreglos
				}
				imprimeArreglo(x,y,z,operador);
			}

			private static void sumaArreglos(int[] x, int[] y, int[] z) {
				// Realizar la suma de arreglos
				String operador=" + ";
				for(int i=0;i<x.length;i++)
				{
					z[i]=x[i]+y[i];//suma de arreglos
				}
				imprimeArreglo(x,y,z,operador);
				
				
			}

			private static void imprimeArreglo(int[] x, int[] y, int[] z, String op) {
				// Imprime resultados
				
				String cadena="";
				for(int i=0; i<x.length; i++)
				{
					cadena=(x[i]+op+y[i]+" = "+z[i]+"\n");
				}
				JOptionPane.showConfirmDialog(null, cadena);
			}

		}
