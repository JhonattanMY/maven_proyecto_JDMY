package deber;

import java.util.Scanner;

public class MainAtencionAlEstudiante {

	public static void main(String[] args) {

		Scanner leeInt = new Scanner(System.in);
		Scanner lee = new Scanner(System.in);

		int opcion = 0;

		DatoEstudiante primero = new DatoEstudiante();
		DatoEstudiante segundo = new DatoEstudiante();
		DatoEstudiante tercero = new DatoEstudiante();
		DatoEstudiante cuarto = new DatoEstudiante();
		DatoEstudiante quinto = new DatoEstudiante();

		do {

			System.out.println("*******************************");
			System.out.println("            MENU");
			System.out.println("*******************************");
			System.out.println("1<----Ingrese Estudiante");
			System.out.println("2<----Buscar Estudiante");
			System.out.println("3<----SALIR");
			System.out.println("*******************************");
			System.out.print("Ingrese una opcion: ");
			opcion = leeInt.nextInt();

			if (opcion == 1) {

				System.out.println("\n**********************************************");
				System.out.print("Ingrese el numero de cedula del estudiante 0: ");
				primero.setCedulaEstudiante(lee.nextLine());
				System.out.print("Ingrese el numero de cedula del estudiante 1: ");
				segundo.setCedulaEstudiante(lee.nextLine());
				System.out.print("Ingrese el numero de cedula del estudiante 2: ");
				tercero.setCedulaEstudiante(lee.nextLine());
				System.out.print("Ingrese el numero de cedula del estudiante 3: ");
				cuarto.setCedulaEstudiante(lee.nextLine());
				System.out.print("Ingrese el numero de cedula del estudiante 4: ");
				quinto.setCedulaEstudiante(lee.nextLine());

				DatoEstudiante base[] = new DatoEstudiante[5];
				base[0] = primero;
				base[1] = segundo;
				base[2] = tercero;
				base[3] = cuarto;
				base[4] = quinto;

			} else if (opcion == 2) {

				String datos = (primero.getCedulaEstudiante() + " " + segundo.getCedulaEstudiante() + " "
						+ tercero.getCedulaEstudiante() + " " + cuarto.getCedulaEstudiante() + " "
						+ quinto.getCedulaEstudiante());

				System.out.print("\nIngrese numero de cedula a buscar: ");
				String busqueda = lee.nextLine();
				boolean resultado = datos.contains(busqueda);

				if (resultado == true) {
					System.out.println("\n>>>>> Si contiene Estudiante <<<<<\n");
				} else
					System.out.println("\n>>>>> No contiene Estudiante <<<<<\n");
			} else {

			}
		} while (opcion != 3);

	}
}
