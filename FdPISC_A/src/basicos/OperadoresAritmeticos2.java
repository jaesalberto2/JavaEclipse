package basicos;

public class OperadoresAritmeticos2 {

	public static void main(String[] args) {
		int x=10,y=20;
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
