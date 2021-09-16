package ejercicios.variables.locales.globales;

public class Animal {

	// VARIABLES GlOBALES: SE DECLARAN A NIVEL DE CLASE.
	// GLOBALES DE INSTANCIA: PERTENECE SOLO A LA INSTANCIA.
	// GOBALES STATICA: PERTENECE SOLO A LA CLASE, SE LO PUEDE USAR EN CUALQUIER
	// CLASE.
	private String nombre;
	private String tipoAnimal;
	private String nombreCientifico;
	private String caracteristica;
	private String habitad;

	// VARIABLES GLOBALES ESTATICAS:
	private static int edad;
	private static int peso;
	private static String estatura;

	// VARIABLE CONSTANTE (SU NOMBRE DEBE SER EN MAYUSCULAS Y SEPARADO POR "_".
	private static final String COLOR_ANIMAL = "blanco";

	// PERTENCEN A LA INSTANCIA.
	public void alimentarse() {
		
		// VARIABLES LOCALES: SE DECLARAN A NIVEL DE METODOS.
		String tipoDeComida;
		String horarioDeComida;
		String cantidadDeComida;
		String vitaminas;
		String postre;
		peso = 80;
	}

	// PERTENECE A LA CLASE - solo pueden utilizar variabels estaticas.
	public static void correr() {
		peso = 80;
		//nombre="Kazuya";

	}

}