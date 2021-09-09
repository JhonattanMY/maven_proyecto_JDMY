package deber;

import java.util.Scanner;

public class MainAtencionAlEstudiante {

	public static void main(String[] args) {

		Scanner leeInt = new Scanner(System.in);
		Scanner lee = new Scanner(System.in);

		int a = 5;
		DatoEstudiante base[] = new DatoEstudiante[a];
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
			System.out.println("*******************************\n");
			System.out.print("Ingrese una opcion: ");
			opcion = leeInt.nextInt();

			if (opcion == 1) {

				if (a == 5) {
					a--;
					System.out.println("\nposicion [" + a + "] libre");
					System.out.println("**********************************************");
					System.out.print("Ingrese el numero de cedula del estudiante : ");
					quinto.setCedulaEstudiante(lee.nextLine());
					System.out.println("");

				} else if (a == 3) {
					System.out.println("\nposicion [" + a + "] libre");
					System.out.println("**********************************************");
					System.out.print("Ingrese el numero de cedula del estudiante : ");
					cuarto.setCedulaEstudiante(lee.nextLine());
					System.out.println("");

				} else if (a == 2) {
					System.out.println("\nposicion [" + a + "] libre");
					System.out.println("**********************************************");
					System.out.print("Ingrese el numero de cedula del estudiante : ");
					tercero.setCedulaEstudiante(lee.nextLine());
					System.out.println("");

				} else if (a == 1) {
					System.out.println("\nposicion [" + a + "] libre");
					System.out.println("**********************************************");
					System.out.print("Ingrese el numero de cedula del estudiante : ");
					segundo.setCedulaEstudiante(lee.nextLine());
					System.out.println("");

				} else if (a == 0) {
					System.out.println("\nposicion [" + a + "] libre");
					System.out.println("**********************************************");
					System.out.print("Ingrese el numero de cedula del estudiante : ");
					primero.setCedulaEstudiante(lee.nextLine());
					System.out.println("");

				}

				base[0] = primero;
				base[1] = segundo;
				base[2] = tercero;
				base[3] = cuarto;
				base[4] = quinto;
				a--;

			} else if (opcion == 2) {

				System.out.print("\nIngrese numero de cedula a buscar: ");
				String busqueda = lee.nextLine();

				boolean resultado = false;

				for (int i = 0; i < 5; i++) {
					DatoEstudiante estudiante = base[i];
					String cedula = estudiante.getCedulaEstudiante();
					boolean resultadoLocal = busqueda.equals(cedula);
					if (resultadoLocal == true) {
						resultado = true;
					}
				}

				if (resultado == true) {
					System.out.println("\n>>>>> Si contiene Estudiante <<<<<\n");
				} else {
					System.out.println("\n>>>>> No contiene Estudiante <<<<<\n");

				}

			}
		} while (opcion != 3);

	}
}
