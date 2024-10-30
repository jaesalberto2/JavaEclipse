package basicos;

public class DimeTuNombre {

	public static void main(String[] args) {
		String nombre=null;
		System.out.println("Por favor dime como te llamas");
		nombre = System.console().readLine();
		System.out.println("Hola "+nombre+"¡encantado de conocerte!");

	}

}
