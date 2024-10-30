//Ejercicio4

package seleccion;

import java.util.Scanner;

public class Huracanes {

	public static void main(String[] args) {
		//Declaración de variables
		int categoria;
		Scanner in = new Scanner(System.in);
		//ingreso de datos
		System.out.println("__________________________________________________");
		System.out.println("\tAfectación de huracanes");
		System.out.println("__________________________________________________");
		System.out.println("Ingresa la categoria del huracan");
		categoria = in.nextInt();
		if (categoria <= 1)
		{
			System.out.println("Huracan de categoria *"+categoria+"* Vientos de 119 a 153 km/h Riesgo menor para construcciones posibles, danos en carteles y vegetación");
			
		}
		
		else if (categoria>1 && categoria<=2)
		{
			System.out.println("Huracan de categoria *"+categoria+"* Vientos de 154 a 177 km/h Riesgo de destruccion en edificios din daño estructural, daño en tendido electrico y vegetación )");
			
		}
		
		else if (categoria>2 && categoria<=3)
		{
			System.out.println("Huracan de categoria *"+categoria+"* Vientos de 178 a 208 km/h daño a la estructura de edificios pequeños, servicio electrico y de agua. inundaciones en la costa");
			
			
		}
		
		else if (categoria>3 && categoria<=4)
		{
			System.out.println("Huracan de categoria *"+categoria+"* Vientos de 209 a251 km/h Amplio daño en viviendas, techos y paredes. se aconseja evacuacion hasta 3 km de tierra adentro");
			
		}
		
		else if (categoria > 4 && categoria <= 5)
			
		{
			System.out.println("Huracan de categoria *"+categoria+"* Vientos de mas de 252 km/h Importantes daños a edificios y vegetación. se aconseja evacuacion hasta 6 km tierra adentro");
			
		}
		
		
	}

			

}
