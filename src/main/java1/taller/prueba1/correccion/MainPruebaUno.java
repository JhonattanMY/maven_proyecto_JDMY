package taller.prueba1.correccion;

import java.util.Scanner;

public class MainPruebaUno {

	public static void main(String[] args) {

		Scanner lee = new Scanner(System.in);
		Scanner leeInt = new Scanner(System.in);

		String clave;
		String opcionMenu;
		int saldoInicial = 2500;

		do {
			System.out.println("Ingrese clave: ");
			clave = lee.next();
			// SI
			if (clave.equals("85AB")) {
				do {
					System.out.println("Banco Pichincha, elija una opcion: ");
					System.out.println("1. Consultar pagos");
					System.out.println("2. Realizar transferencia");
					System.out.println("3. SALIR");
					opcionMenu = lee.next();

					if (opcionMenu.equals("1")) {
						// Todo lo que me pide la opcion 1
						System.out.println("No tiene ningun pago pendiente\n");

					} else if (opcionMenu.equals("2")) {
						// Todo lo que pide la opcion 2
						System.out.println("Ingrese la cuente de destino: ");
						String cuentaDestino = lee.next();
						System.out.println("Ingrese monto a transferir: ");
						int montoTransferir = leeInt.nextInt();

						 saldoInicial = saldoInicial - montoTransferir;

						System.out.println("Su nuevo saldo es: " + saldoInicial);
					} else {

					}

					// while opcionMenu.equals("1") ||opcionMenu.equals("2")

				} while (!opcionMenu.equals("3"));
				clave = "0";

				// NO
			} else {
				System.out.println("=== Clave no es correcta ==\n");
			}

		} while (!clave.equals("-1"));

		System.out.println("Gracias por preferirnos");
	}
}
