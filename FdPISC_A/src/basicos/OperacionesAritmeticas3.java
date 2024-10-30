package basicos;

import java.util.Scanner;

public class OperacionesAritmeticas3 {

	public static void main(String[] args) {
		
		int x=0,y=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Ingresa un numero ");
		x=in.nextInt();
		System.out.println("Ingresa otro numero");
		y=in.nextInt();
		System.out.println("_________________________________________________________");
		System.out.println("X\t\tOperador\tY\t\tResultado");
		System.out.println("_________________________________________________________");
		System.out.println(x+"\t\t+"+"\t\t"+y+"\t\t"+(x+y));
		System.out.println("_________________________________________________________");
		System.out.println(x+"\t\t-"+"\t\t"+y+"\t\t"+(x-y));
		System.out.println("_________________________________________________________");
		System.out.println(x+"\t\t*"+"\t\t"+y+"\t\t"+(x*y));
		System.out.println("_________________________________________________________");
		System.out.println(x+"\t\t/"+"\t\t"+y+"\t\t"+((double)x/(double)y)); //casting o conversion de tipos
		System.out.println("_________________________________________________________");
		System.out.println(x+"\t\t%"+"\t\t"+y+"\t\t"+(x%y));
		System.out.println("_________________________________________________________");

	}

}
