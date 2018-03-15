package ejercicio;

import org.junit.Assert;
import org.junit.Test;

public class TestImpuestos {

	@Test
	public void calcularImpuesto1() {
		PersonaFiscal edu = new PersonaFiscal("Edu", 34, 0);
		edu.vincularTipoImpuesto("a");
		Assert.assertEquals(0, edu.calcularImpuesto());
	}

	@Test
	public void calcularImpuesto2() {
		PersonaFiscal edu = new PersonaFiscal("Edu", 29, 1000);
		edu.vincularTipoImpuesto("a");
		Assert.assertEquals(300, edu.calcularImpuesto());
	}

	@Test
	public void calcularImpuesto3() {
		PersonaFiscal edu = new PersonaFiscal("Edu", 34, 0);
		edu.vincularTipoImpuesto("b");
		Assert.assertEquals(0, edu.calcularImpuesto());
	}

	@Test
	public void calcularImpuesto4() {
		PersonaFiscal edu = new PersonaFiscal("Edu", 29, 1000);
		edu.vincularTipoImpuesto("b");
		Assert.assertEquals(50, edu.calcularImpuesto());
	}

	@Test
	public void calcularImpuesto5() {
		PersonaFiscal edu = new PersonaFiscal("Edu", 34, 0);
		edu.vincularTipoImpuesto("c");
		Assert.assertEquals(0, edu.calcularImpuesto());
	}

	@Test
	public void calcularImpuesto6() {
		PersonaFiscal edu = new PersonaFiscal("Edu", 29, 1000);
		edu.vincularTipoImpuesto("c");
		Assert.assertEquals(250, edu.calcularImpuesto());
	}

	@Test
	public void calcularImpuesto7() {
		PersonaFiscal edu = new PersonaFiscal("Edu", 34, 0);
		edu.vincularTipoImpuesto("d");
		Assert.assertEquals(0, edu.calcularImpuesto());
	}

	@Test
	public void calcularImpuesto8() {
		PersonaFiscal edu = new PersonaFiscal("Edu", 29, 1000);
		edu.vincularTipoImpuesto("d");
		Assert.assertEquals(300, edu.calcularImpuesto());
	}

}
