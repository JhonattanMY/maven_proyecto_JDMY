package deber.modificador.nonaccess.finall;

public class CorporacionFavorita {

	// ATRIBUTOS FINALES
	private final String ruc = "1790016919001";
	private final String nacionalidad = "Ecuador";
	private final String tipoDeCompañia = "S.A";
	private long capital = 660000000;

	public CorporacionFavorita() {

		// LOS ATRIBUTOD FINALES NO PUEDEN SER RE-ASIGNADOS
		this.ruc = "14569713001";
		this.nacionalidad = "Argentina";
		this.tipoDeCompañia = "CIA.LTDA";

		// LOS ATRIBUTOS QUE NO SON FINALES SI SE PUEDEN RE-ASIGNAR
		this.capital = 550000000;
	}

}
