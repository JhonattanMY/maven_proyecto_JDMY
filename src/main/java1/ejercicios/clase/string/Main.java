package ejercicios.clase.string;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1. CONTAINS
		String frase = "La escencia de programar";

		Scanner lee = new Scanner(System.in);
		System.out.println("Ingrese nombre del libro");
		String palabra = lee.next();

		boolean resultado = frase.contains(palabra);
		System.out.println("Contiene la palabra: " + resultado);

		// 2. EQUALS

		System.out.println("***************************************");
		String cadena1 = "jhonattan";
		System.out.println("Ingrese la segunda cadena a comparar");
		String cadena2 = lee.next();

		boolean resultado2 = cadena1.equals(cadena2);

		System.out.println("¿las cadenas son iguales?: " + resultado2);

		// 3. y 4. UPPER / LOWER

		System.out.println("***************************************");
		String nombre = "jhonattan";
		String nombreMayuscula = nombre.toUpperCase();
		System.out.println("Nombre en mayuscula: " + nombreMayuscula);

		System.out.println("***************************************");
		String nombre2 = "DAVID";
		String nombreMinuscula = nombre2.toLowerCase();
		System.out.println("Nombre en minuscula: " + nombreMinuscula);
	}

}
