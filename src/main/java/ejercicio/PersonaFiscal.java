package ejercicio;

public class PersonaFiscal {
	private String nombre;
	private int edad;
	private int sueldo;
	private TipoImpuesto impuesto;

	public int calcularImpuesto() {
		int resultadoImpuesto;
		if (this.edad <= 30) {
			resultadoImpuesto = (this.sueldo * this.impuesto.getPorcentaje30()) / 100;
		} else {
			resultadoImpuesto = (this.sueldo * this.impuesto.getPorcentaje()) / 100;
		}
		return resultadoImpuesto;
	}

	public PersonaFiscal(String _nombre, int _edad, int _sueldo) {
		this.nombre = _nombre;
		this.edad = _edad;
		this.sueldo = _sueldo;
	}

	public void vincularTipoImpuesto(String tipo) {
		if (tipo.equals("a")) {
			this.impuesto = new TipoImpuesto(20, 30, "a");
		} else if (tipo.equals("b")) {
			this.impuesto = new TipoImpuesto(10, 5, "b");
		} else if (tipo.equals("c")) {
			this.impuesto = new TipoImpuesto(30, 25, "c");
		} else if (tipo.equals("d")) {
			this.impuesto = new TipoImpuesto(10, 30, "d");
		}
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String _nombre) {
		this.nombre = _nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int _edad) {
		this.edad = _edad;
	}

	public int getSueldo() {
		return this.sueldo;
	}

	public void setSueldo(int _sueldo) {
		this.sueldo = _sueldo;
	}

}
