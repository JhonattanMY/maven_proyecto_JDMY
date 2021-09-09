package ejercicios.nonaccess.estaticos;

public class MainPersona {

	public static void main(String[] args) {

		Paciente paciente1 = new Paciente();
		paciente1.setNombre("<<< David >>>");
		paciente1.setEdad(20);

		paciente1.registrar(paciente1.getNombre());
		Paciente.consultarNacionalidadStatica();

	}

}
