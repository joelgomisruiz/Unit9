package unit9;

import static org.junit.Assert.*;

import org.junit.Test;

public class CadenasAlumnoTestTest {

	@Test
	public void testSonIguales() {
		String a = "pepe", b = "pepe", c = "pep";
		assertEquals(true, new CadenasAlumno().sonIguales(a, b));
		assertEquals(true, new CadenasAlumno().sonIguales(b, a));
		assertEquals(false, new CadenasAlumno().sonIguales(c, a));
		assertEquals(false, new CadenasAlumno().sonIguales(a, c));
	}
	
	@Test
	public void TestSoniguales(){
		
	}

}
