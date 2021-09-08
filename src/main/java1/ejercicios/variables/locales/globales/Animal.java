package ejercicios.variables.locales.globales;

public class Animal {

	// VARIABLES GlOBALES: SE DECLARAN A NIVEL DE CLASE.
	private String nombre;
	private String tipoAnimal;
	private String nombreCientifico;
	private String caracteristica;
	private String habitad;
	
	//VARIABLES GLOBALES ESTATICAS: 
	private static int edad;
	private static int peso;
	private static String estatura;

	// VARIABLES LOCALES: SE DECLARAN A NIVEL DE METODOS

	public void alimentarse() {
		String tipoDeComida;
		String horarioDeComida;
		String cantidadDeComida;
		String vitaminas;
		String postre;
	}
	
//} else if (opcion == 2) {
//
//	String datos = (primero.getCedulaEstudiante() + " " + segundo.getCedulaEstudiante() + " "
//			+ tercero.getCedulaEstudiante() + " " + cuarto.getCedulaEstudiante() + " "
//			+ quinto.getCedulaEstudiante());
//
//	System.out.print("\nIngrese numero de cedula a buscar: ");
//	String busqueda = lee.nextLine();
//	boolean resultado = datos.contains(busqueda);
//
//	if (resultado == true) {
//		System.out.println("\n>>>>> Si contiene Estudiante <<<<<\n");
//	} else
//		System.out.println("\n>>>>> No contiene Estudiante <<<<<\n");
//} else {
//
//}
//} while (opcion != 3);
}