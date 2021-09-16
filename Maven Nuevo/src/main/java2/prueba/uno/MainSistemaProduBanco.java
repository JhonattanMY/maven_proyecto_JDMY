package prueba.uno;

import java.util.Scanner;

public class MainSistemaProduBanco {

	public static void main(String[] args) {

		Scanner lee = new Scanner(System.in);
		Scanner leeInt = new Scanner(System.in);

		final int saldoDisponible = 1000;

		String clave;
		do {
			System.out.print("INGRESE CLAVE: ");
			clave = lee.nextLine();

			if (clave.equals("85AB")) {

				int opcion;
				do {

					System.out.println("##########################");
					System.out.println("BANCO PRODUBANCO, elija una opcion: ");
					System.out.println("1. Realizar transferencia");
					System.out.println("2. Consulta transacciones");
					System.out.println("3. SALIR");
					System.out.println("##########################");
					opcion = leeInt.nextInt();

					if (opcion == 1) {
						System.out.print("Ingrese la cuenta de destino de la transferencia: ");
						String numeroCuenta = lee.nextLine();
						System.out.print("Ingrese monto a transferir: ");
						int monto = leeInt.nextInt();

						int saldo = saldoDisponible - monto;

						System.out.println("Su nuevo saldo es: $" + saldo);
					} else if (opcion == 2) {
						System.out.println("En este momento se están procesando las transacciones, intente más tarde");
					}

				} while (opcion != 3);

			}
		} while (!clave.equals("0"));

		System.out.println("\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
		System.out.println("==== Gracias por preferirnos ====");

	}

}
