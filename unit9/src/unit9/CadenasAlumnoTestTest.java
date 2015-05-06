package unit9;

import static org.junit.Assert.*;

import org.junit.Test;

public class CadenasAlumnoTestTest {

	@Test
	public void testSonIgualesA() {
		String cadena1 = "entornos", cadena2 = "ento";
		boolean correcto = cadena1.equals(cadena2);
		assertEquals(correcto,new CadenasAlumno().sonIguales(cadena1, cadena2));
	}
	
	@Test
	public void TestSonigualesB(){
		String cadena1 = "ento", cadena2 = "entornos";
		boolean correcto = cadena1.equals(cadena2);
		assertEquals(correcto,new CadenasAlumno().sonIguales(cadena1, cadena2));
	}
	
	@Test
	public void TestSonigualesC(){
		String cadena1 = "entornos", cadena2 = "sonrotne";
		boolean correcto = cadena1.equals(cadena2);
		assertEquals(true,new CadenasAlumno().sonIguales(cadena1, cadena2));
	}
	@Test
	public void TestSonigualesD(){
		String cadena1 = "entornos", cadena2 = "entornos";
		boolean correcto = cadena1.equals(cadena2);
		assertEquals(correcto,new CadenasAlumno().sonIguales(cadena1, cadena2));
	}


}
