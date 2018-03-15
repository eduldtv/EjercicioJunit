package ejercicio;

public class TipoImpuesto {
	private int porcentaje;
	private int porcentaje30;
	private String nombre;

	public TipoImpuesto(int _porcentaje, int _porcentaje30, String _nombre) {
		this.porcentaje = _porcentaje;
		this.porcentaje30 = _porcentaje30;
		this.nombre = _nombre;
	}

	public int getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(int _porcentaje) {
		this.porcentaje = _porcentaje;
	}

	public int getPorcentaje30() {
		return this.porcentaje30;
	}

	public void setPorcentaje30(int _porcentaje30) {
		this.porcentaje30 = _porcentaje30;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String _nombre) {
		this.nombre = _nombre;
	}

}
