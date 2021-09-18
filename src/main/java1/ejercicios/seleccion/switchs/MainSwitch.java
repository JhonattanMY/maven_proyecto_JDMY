package ejercicios.seleccion.switchs;

import java.util.Scanner;

public class MainSwitch {

	public static void main(String[] args) {

		Scanner lee = new Scanner(System.in);

		String opcion;
		do {
			System.out.println("Escoja opcion:");
			System.out.println("1. Realizar la trasnferencia");
			System.out.println("2. consultar pagos");
			System.out.println("3. salir");
			opcion = lee.next();

			switch (opcion) {

			case "1":
				System.out.println("Ingrese el numero de cuenta: \n");
				break;
			case "2":
				System.out.println("No existen pagos\n");
				break;

			case "3":
				System.out.println("cerrando el sistema .....\n");
				break;

			default:
				System.out.println("No ha elegido nunguna opcion correcta\n");
				break;
			}
		} while (!opcion.equals("3")); 

		System.out.println("Gracias por preferirnos");

	}

}
