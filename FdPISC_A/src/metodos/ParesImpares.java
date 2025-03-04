/*
 * Ejercicio 13; generar 20 numeros random con un rango de 1 a 50
 * y almacenarlo en un arreglo de tipo entero, deteminar cuantos 
 * numeros son pares y cuantos son impares utilizar metodos 
 */
package metodos;

import java.util.Arrays;
import java.util.Random;

public class ParesImpares {
	public static void main(String[] args) {
	int[] numeros = generarNumeros(20, 1, 50);
    
    int pares = contarPares(numeros);
    int impares = contarImpares(numeros);
    
    System.out.println("Cantidad de números pares: " + pares);
    System.out.println("______________________________________");
    System.out.println("Cantidad de números impares: " + impares);
    System.out.println("______________________________________");
    
    System.out.println("Arreglo original: ");
    System.out.println("______________________________________");
    imprimirArreglo(numeros);
    System.out.println("______________________________________");
    
    System.out.println("Arreglo ordenado: ");
    System.out.println("______________________________________");
    int[] numerosOrdenados = ordenarArreglo(numeros);
    imprimirArreglo(numerosOrdenados);
    System.out.println("______________________________________");
}

// Método para generar números aleatorios y almacenarlos en un arreglo
public static int[] generarNumeros(int cantidad, int min, int max) {
    int[] numeros = new int[cantidad];
    Random random = new Random();
    
    for (int i = 0; i < cantidad; i++) {
        numeros[i] = random.nextInt(max - min + 1) + min;
    }
    
    return numeros;
}

// Método para contar la cantidad de números pares en un arreglo
public static int contarPares(int[] numeros) {
    int count = 0;
    for (int num : numeros) {
        if (num % 2 == 0) {
            count++;
        }
    }
    
    return count;
}

// Método para contar la cantidad de números impares en un arreglo
public static int contarImpares(int[] numeros) {
    int count = 0;
    
    for (int num : numeros) {
        if (num % 2 != 0) {
            count++;
        }
    }
    
    return count;
}

// Método para imprimir un arreglo
public static void imprimirArreglo(int[] arreglo) {
    for (int num : arreglo) {
        System.out.print(num + " ");
    }
    System.out.println();
}

// Método para ordenar un arreglo de menor a mayor
public static int[] ordenarArreglo(int[] numeros) {
    int[] copiaNumeros = Arrays.copyOf(numeros, numeros.length);
    Arrays.sort(copiaNumeros);
    return copiaNumeros;

}
}
	
	


