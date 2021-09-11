package ejercicios.nonoaccess.finall;

public class EstudianteOdontologia extends EstudianteMedicina {

	// NO SE PUEDE SOBREESCRIBIR EL METODO FINAL DE LA CLASE PADRE

	@Override
	protected void realizarPracticas() {
		System.out.println("Realiza 100 horas de practicas");
	}

	@Override
	protected void realizarPasantias() {
		System.out.println("Realiza 100 horas de pasantias");

	}
}
