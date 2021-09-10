package consultorio;

import java.util.Arrays;
import java.util.Scanner;

import deber.DatoEstudiante;

public class MainRegistroPaciente {

	public static void main(String[] args) {

		Scanner leeInt = new Scanner(System.in);
		Scanner lee = new Scanner(System.in);

		int a = 6;
		Paciente base[] = new Paciente[a];
		int opcion = 0;

		Paciente paciente1 = new Paciente();
		Paciente paciente2 = new Paciente();
		Paciente paciente3 = new Paciente();
		Paciente paciente4 = new Paciente();
		Paciente paciente5 = new Paciente();
		Paciente paciente6 = new Paciente();

		do {

			System.out.println("같같같같같같같같같같같같같같같같같");
			System.out.println("            MENU");
			System.out.println("같같같같같같같같같같같같같같같같같");
			System.out.println("Press[1]    Ingrese paciente");
			System.out.println("Press[2]    Imprimir reporte");
			System.out.println("Press[3]    SALIR");
			System.out.println("같같같같같같같같같같같같같같같같같");
			opcion = leeInt.nextInt();
			System.out.println();

			if (opcion == 1) {

				if (a == 6) {
					a--;
					System.out.println(" ===== PACIENTE #" + a + "=====");
					System.out.println("같같같같같같같같같같같같같같같같같");
					System.out.print("Nombre:");
					paciente6.setNombre(lee.nextLine());
					System.out.print("Apellido:");
					paciente6.setApellido(lee.nextLine());
					System.out.print("Edad:");
					paciente6.setEdad(leeInt.nextInt());
					System.out.print("Sintoma:");
					paciente6.setSintoma(lee.nextLine());
					System.out.println("");
				} else if (a == 4) {
					System.out.println(" ===== PACIENTE #" + a + "=====");
					System.out.println("같같같같같같같같같같같같같같같같같");
					System.out.print("Nombre:");
					paciente5.setNombre(lee.nextLine());
					System.out.print("Apellido:");
					paciente5.setApellido(lee.nextLine());
					System.out.print("Edad:");
					paciente5.setEdad(leeInt.nextInt());
					System.out.print("Sintoma:");
					paciente5.setSintoma(lee.nextLine());
					System.out.println("");
				} else if (a == 3) {
					System.out.println(" ===== PACIENTE #" + a + "=====");
					System.out.println("같같같같같같같같같같같같같같같같같");
					System.out.print("Nombre:");
					paciente4.setNombre(lee.nextLine());
					System.out.print("Apellido:");
					paciente4.setApellido(lee.nextLine());
					System.out.print("Edad:");
					paciente4.setEdad(leeInt.nextInt());
					System.out.print("Sintoma:");
					paciente4.setSintoma(lee.nextLine());
					System.out.println("");

				} else if (a == 2) {
					System.out.println(" ===== PACIENTE #" + a + "=====");
					System.out.println("같같같같같같같같같같같같같같같같같");
					System.out.print("Nombre:");
					paciente3.setNombre(lee.nextLine());
					System.out.print("Apellido:");
					paciente3.setApellido(lee.nextLine());
					System.out.print("Edad:");
					paciente3.setEdad(leeInt.nextInt());
					System.out.print("Sintoma:");
					paciente3.setSintoma(lee.nextLine());
					System.out.println("");
				} else if (a == 1) {
					System.out.println(" ===== PACIENTE #" + a + "=====");
					System.out.println("같같같같같같같같같같같같같같같같같");
					System.out.print("Nombre:");
					paciente2.setNombre(lee.nextLine());
					System.out.print("Apellido:");
					paciente2.setApellido(lee.nextLine());
					System.out.print("Edad:");
					paciente2.setEdad(leeInt.nextInt());
					System.out.print("Sintoma:");
					paciente2.setSintoma(lee.nextLine());
					System.out.println("");
				} else if (a == 0) {
					System.out.println(" ===== PACIENTE #" + a + "=====");
					System.out.println("같같같같같같같같같같같같같같같같같");
					System.out.print("Nombre:");
					paciente1.setNombre(lee.nextLine());
					System.out.print("Apellido:");
					paciente1.setApellido(lee.nextLine());
					System.out.print("Edad:");
					paciente1.setEdad(leeInt.nextInt());
					System.out.print("Sintoma:");
					paciente1.setSintoma(lee.nextLine());
					System.out.println("");
				}

				base[0] = paciente6;
				base[1] = paciente2;
				base[2] = paciente4;
				base[3] = paciente1;
				base[4] = paciente5;
				base[5] = paciente3;
				a--;

			} else if (opcion == 2) {

				Arrays.sort(base);
				String listaPacientes = Arrays.toString(base);
				System.out.println("======= LISTADO DE TODOS LOS PACIENTE INGRESADOS =======\n");
				System.out.println(listaPacientes);
				System.out.println("==========================================================");

			}
		} while (opcion != 3);

	}

}
