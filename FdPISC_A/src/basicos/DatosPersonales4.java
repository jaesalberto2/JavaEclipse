/*
 * Crea una tabla de datos de estudiantes
 */
package basicos;

public class DatosPersonales4 {

	public static void main(String[] args) {
		//definicion de variables
		String nom1="Juan charrasqueado",
				nom2="Juana de Isla",
				nom3="Doroteo Arango",
				nom4="Andrea Bocelli",
				nom5="Alfredo Juarez";
		String dir1="Av. de los Olivos #123",
				dir2="Av. juarez #89",
				dir3="Colonia Juarez #45",
				dir4="Callejon de la Aura #679",
				dir5="Jardin Morelos #1";
		String email1="jcharrasqueado@gmail.com",
				email2="jisla@hotmail.com",
				email3="darango@tacnm.mx",
				email4="abocelli@yahoo.com",
				email5="ajuarez@telmex.com";
		String tel1="492-123-4567",
				tel2="493-890-2345",
				tel3="324-678-2345",
				tel4="786-897-2378",
				tel5="491-908-1764";
		String carr1="Ing.Informatica",
				carr2="Arquitectura",
				carr3="Finanzas",
				carr4="Derecho",
				carr5="Arte y Costura";
		//Muestra la informacion de los estudiantes
		
		System.out.println("_______________________________________________________________________________________________________________________________________________________________");
		System.out.println("\t\t\t\t\t\t\t\tReporte de estudiantes");
		System.out.println("_______________________________________________________________________________________________________________________________________________________________");
		System.out.println("#\t\tNombre\t\t\t\tDireccion\t\t\tCorreo\t\t\t\t\tTelefono\t\tCarrera\t\t");
		System.out.println("_______________________________________________________________________________________________________________________________________________________________");
		System.out.println("1\t\t"+nom1+"\t\t"+dir1+"\t\t"+email1+"\t\t"+tel1+"\t\t"+carr1);
		System.out.println("_______________________________________________________________________________________________________________________________________________________________");
		System.out.println("2\t\t"+nom2+"\t\t\t"+dir2+"\t\t\t"+email2+"\t\t\t"+tel2+"\t\t"+carr2);
		System.out.println("_______________________________________________________________________________________________________________________________________________________________");
		System.out.println("3\t\t"+nom3+"\t\t\t"+dir3+"\t\t"+email3+"\t\t\t"+tel3+"\t\t"+carr3);
		System.out.println("_______________________________________________________________________________________________________________________________________________________________");
		System.out.println("4\t\t"+nom4+"\t\t\t"+dir4+"\t"+email4+"\t\t\t"+tel4+"\t\t"+carr4);
		System.out.println("_______________________________________________________________________________________________________________________________________________________________");
		System.out.println("5\t\t"+nom5+"\t\t\t"+dir5+"\t\t"+email5+"\t\t\t"+tel5+"\t\t"+carr5);
		System.out.println("_______________________________________________________________________________________________________________________________________________________________");


	}

}
