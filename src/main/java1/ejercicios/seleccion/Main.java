package ejercicios.seleccion;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner leeInt = new Scanner(System.in);
		
		String opcion;
		do {
			System.out.println("Escoja opcion:");
			System.out.println("1. Realizar la trasnferencia");
			System.out.println("2. consultar pagos");
			System.out.println("3. salir");
			opcion = leeInt.next();
			
			if (opcion.equals("1")) {
				System.out.println("Ingrese numero de cuenta: ");
			} else if (opcion.equals("2")) {
				System.out.println("No existen pagos");
			}
		} while (!opcion.equals("3")); //Similar a opcion !=3

		System.out.println("Gracias por preferirnos");
	}

}
