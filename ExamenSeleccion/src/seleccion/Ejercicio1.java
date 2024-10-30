/*
 * La compañia Fumigas SC utiliza aviones para fumigar las cosechas contra una gran variedad de plagas.
 * la cantidad que la compañia cobra a los granjeros depende de que es lo que se desea fumigar y de cuantas hectareas
 * desea que se fumiguen de acuerdo con la siguiente distribucion:
 * Tipo1 Fumigacion contra malas hierbas $10 por hectarea
 * tipo2 fumigacion contra langostas $20 por hectarea
 * tipo 3 Fumigacion contra gusanos $30 por hectarea
 * tipo4 fumigacion contra todo $50 por hectarea
 * si el area a fumigar es entre 500 y 1000 hectareas el granjero obtiene5% de descuento 
 * si el area es 1001 a 2000 10% de descuento
 * mas de 2001 20% de descuento
 */

package seleccion;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Declaracion de variables
		int tipo,hectareas, costo=0, descuento=0;
		Scanner in =new Scanner(System.in);
		System.out.println("_________________________________________");
		System.out.println("\tFumigas Sc");
		System.out.println("_________________________________________");
		System.out.println("Seleccione su tipo de fumigacion con numero :");
		System.out.println("_________________________________________");
		System.out.println("* Tipo1 Fumigacion contra malas hierbas $10 por hectarea\r\n"
				+ "* Tipo2 fumigacion contra langostas $20 por hectarea\r\n"
				+ "* Tipo3 Fumigacion contra gusanos $30 por hectarea\r\n"
				+ "* Tipo4 fumigacion contra todo $50 por hectarea");
		tipo = in.nextInt();
		System.out.println("__________________________________________");
		System.out.println("Seleccione la cantidad de hectareas a fumigar:");
		hectareas = in.nextInt();
		
		if(tipo==1)
		{
			costo=(10*hectareas);
			if (hectareas<=1000 && hectareas>=500)
			{
				descuento=5;
				costo = costo+costo*descuento/100;
			}
			else if(hectareas<=2000 && hectareas >=1001 )
			{
				descuento=10;
				costo = costo+costo*descuento/100;
			}
			else if(hectareas>=2001)
			{
				descuento=20;
				costo = costo+costo*descuento/100;
			}
			
		}//fin if
		

		if(tipo==2)
		{
			costo=(20*hectareas);
			if (hectareas<=1000 && hectareas>=500)
			{
				descuento=5;
				costo = costo+costo*descuento/100;
			}
			else if(hectareas<=2000 && hectareas >=1001 )
			{
				descuento=10;
				costo = costo+costo*descuento/100;
			}
			else if(hectareas>=2001)
			{
				descuento=20;
				costo = costo+costo*descuento/100;
			}
			
		}//fin if
		

		if(tipo==3)
		{
			costo=(30*hectareas);
			if (hectareas<=1000 && hectareas>=500)
			{
				descuento=5;
				costo = costo+costo*descuento/100;
			}
			else if(hectareas<=2000 && hectareas >=1001 )
			{
				descuento=10;
				costo = costo+costo*descuento/100;
			}
			else if(hectareas>=2001)
			{
				descuento=20;
				costo = costo+costo*descuento/100;
			}
			
		}//fin if
		

		if(tipo==4)
		{
			costo=(50*hectareas);
			if (hectareas<=1000 && hectareas>=500)
			{
				descuento=5;
				costo = costo+costo*descuento/100;
			}
			else if(hectareas<=2000 && hectareas >=1001 )
			{
				descuento=10;
				costo = costo+costo*descuento/100;
			}
			else if(hectareas>=2001)
			{
				descuento=20;
				costo = costo+costo*descuento/100;
			}
			
		}//fin if
		
		System.out.println("El precio es "+costo+" y tienes un descuento de "+ descuento+"%");

	}

}
