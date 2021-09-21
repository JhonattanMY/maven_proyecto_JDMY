package ejercicios.fechas;

import java.time.LocalDate;
import java.util.Date;

public class MainManejoFechas {

	public static void main(String[] args) {
		// PERTENECE A DOS LIBRERIAS DE JAVA
		Date date = new Date();// ESTA DEPRECADO Y NO SE LO DEBE USAR

		// EJERCICIO1
		LocalDate diaHoy = LocalDate.now();// De esta manera obtenemos la fecha actual

		// AUMENTAR 17 DIAS
		LocalDate diaFin = diaHoy.plusDays(17);

		CursoVacacional curso1 = new CursoVacacional();
		curso1.setNombre("Futbol principiantes");
		curso1.setFechaInicio(diaHoy);
		curso1.setFechaFin(diaFin);

		System.out.println(curso1.getNombre());
		System.out.println("fecha Inicio: " + curso1.getFechaInicio());
		System.out.println("fecha Final: " + curso1.getFechaFin());

		// EJERCICIO 2
		LocalDate diaHoy2 = LocalDate.now();
		LocalDate diaQueInicio = diaHoy2.minusDays(8);
		LocalDate diaQueFinalizo = diaQueInicio.plusDays(28);

		CursoVacacional curso2 = new CursoVacacional();
		curso2.setNombre("Basket principiantes");
		curso2.setFechaInicio(diaQueInicio);
		curso2.setFechaFin(diaQueFinalizo);

		System.out.println("\n" + curso2.getNombre());
		System.out.println("Fecha Inicio: " + curso2.getFechaInicio());
		System.out.println("Fecha Final: " + curso2.getFechaFin());

		// EJERCICIO 3
		// FECHAS ESPECIFICAS
		LocalDate fechaEspecificaIni = LocalDate.of(2022, 2, 15);
		LocalDate fechaEspecificaFin = LocalDate.of(2022, 7, 10);

		CursoVacacional curso3 = new CursoVacacional();
		curso3.setNombre("Karate");
		curso3.setFechaInicio(fechaEspecificaIni);
		curso3.setFechaFin(fechaEspecificaFin);
		
		LocalDate fechaVista = curso3.getFechaFin();
		LocalDate fechaVistaNueva = fechaVista.plusDays(5);
		
		
		curso3.setFechaFin(fechaVistaNueva);

		System.out.println("\n" + curso3.getNombre());
		System.out.println("Fecha Inicio: " + curso3.getFechaInicio());
		System.out.println("Fecha Final: " + curso3.getFechaFin());

	}

}
