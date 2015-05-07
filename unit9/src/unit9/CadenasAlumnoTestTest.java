package unit9;

import static org.junit.Assert.*;

import org.junit.Test;

public class CadenasAlumnoTestTest {

	@Test
	public void testSonIgualesA() {
		String cadena1 = "entornos", cadena2 = "ento";
		assertEquals(cadena1.equals(cadena2),new CadenasAlumno().sonIguales(cadena1, cadena2));
	}
	
	@Test
	public void TestSonigualesB(){
		String cadena1 = "ento", cadena2 = "entornos";
		assertEquals(cadena1.equals(cadena2),new CadenasAlumno().sonIguales(cadena1, cadena2));
	}
	
	@Test
	public void TestSonigualesC(){
		String cadena1 = "entornos", cadena2 = "sonrotne";
		assertEquals(cadena1.equals(cadena2),new CadenasAlumno().sonIguales(cadena1, cadena2));
	}
	@Test
	public void TestSonigualesD(){
		String cadena1 = "entornos", cadena2 = "entornos";
		assertEquals(cadena1.equals(cadena2),new CadenasAlumno().sonIguales(cadena1, cadena2));
	}
	@Test
	public void TestEsMayorA(){
		String cadena1 = "entornos", cadena2 = "ento";
		assertEquals(cadena1.compareTo(cadena2) > 0,new CadenasAlumno().esMayor(cadena1, cadena2));
	}
	@Test
	public void TestEsMayorB(){
		String cadena1 = "ento", cadena2 = "entornos";
		assertEquals(cadena1.compareTo(cadena2) > 0,new CadenasAlumno().esMayor(cadena1, cadena2));
	}
	@Test
	public void TestEsMayorC(){
		String cadena1 = "entornos", cadena2 = "sonrotne";
		assertEquals(cadena1.compareTo(cadena2) > 0,new CadenasAlumno().esMayor(cadena1, cadena2));
	}
	@Test
	public void TestEsMayorD(){
		String cadena1 = "entornos", cadena2 = "entornos";
		assertEquals(cadena1.compareTo(cadena2) > 0,new CadenasAlumno().esMayor(cadena1, cadena2));
	}
	@Test
	public void TestEsMenorA(){
		String cadena1 = "entornos", cadena2 = "ento";
		assertEquals(cadena1.compareTo(cadena2) < 0,new CadenasAlumno().esMenor(cadena1, cadena2));
	}
	@Test
	public void TestEsMenorB(){
		String cadena1 = "ento", cadena2 = "entornos";
		assertEquals(cadena1.compareTo(cadena2) < 0,new CadenasAlumno().esMenor(cadena1, cadena2));
	}
	@Test
	public void TestEsMenorC(){
		String cadena1 = "entornos", cadena2 = "sonrotne";
		assertEquals(cadena1.compareTo(cadena2) < 0,new CadenasAlumno().esMenor(cadena1, cadena2));
	}
	@Test
	public void TestEsMenorD(){
		String cadena1 = "entornos", cadena2 = "entornos";
		assertEquals(cadena1.compareTo(cadena2) < 0,new CadenasAlumno().esMenor(cadena1, cadena2));
	}
	@Test
	public void TestComparaIgnorandoMayusculasA(){
		String cadena1 = "Entornos", cadena2 = "ento";
		assertEquals(cadena1.equalsIgnoreCase(cadena2),new CadenasAlumno().comparaIgnorandoMayusculas(cadena1, cadena2));
	}
	@Test
	public void TestComparaIgnorandoMayusculasB(){
		String cadena1 = "ento", cadena2 = "entornos";
		assertEquals(cadena1.equalsIgnoreCase(cadena2),new CadenasAlumno().comparaIgnorandoMayusculas(cadena1, cadena2));
	}
	@Test
	public void TestComparaIgnorandoMayusculasC(){
		String cadena1 = "enTornos", cadena2 = "sonrotne";
		assertEquals(cadena1.equalsIgnoreCase(cadena2),new CadenasAlumno().comparaIgnorandoMayusculas(cadena1, cadena2));
	}
	@Test
	public void TestComparaIgnorandoMayusculasD(){
		String cadena1 = "entornos", cadena2 = "Entornos";
		assertEquals(cadena1.equalsIgnoreCase(cadena2),new CadenasAlumno().comparaIgnorandoMayusculas(cadena1, cadena2));
	}
	@Test
    public void testReemplazaPrimerosA() {
        String cadena = "HolaHolaHolaHola";
        String regla = "Hol";
        String cambio = "Ros";
        String correcto = cadena.replaceFirst(regla, cambio);
        assertEquals(correcto,new CadenasAlumno().reemplazaPrimero(cadena, regla, cambio));
    }
    @Test
    public void testReemplazaPrimerosB() {

        String cadena = "HoolaHolaHolaHola";
        String regla = "Hol";
        String cambio = "Ros";
        String correcto = cadena.replaceFirst(regla, cambio);
        assertEquals(correcto,new CadenasAlumno().reemplazaPrimero(cadena, regla, cambio));
    }
    @Test
    public void testReemplazaTodosA() {
        String cadena = "HolaHolaHolaHola";
        String regla = "Hol";
        String cambio = "Ros";
        String correcto = cadena.replace(regla, cambio);
        assertEquals(correcto,new CadenasAlumno().reemplazaTodos(cadena, regla, cambio));
    }
    @Test
    public void testReemplazaTodosB() {

        String cadena = "HoolaHolaHolaHola";
        String regla = "Hol";
        String cambio = "Ros";
        String correcto = cadena.replace(regla, cambio);
        assertEquals(correcto,new CadenasAlumno().reemplazaTodos(cadena, regla, cambio));
    }
    @Test
    public void testQuitaEspaciosA() {

        String cadena = " JoelGomisRuiz ";
        assertEquals(cadena.trim(),new CadenasAlumno().quitaEspacios(cadena));

    }
    @Test
    public void testQuitaEspaciosB() {

        String cadena = "   JoelGomisRuiz    ";
        assertEquals(cadena.trim(),new CadenasAlumno().quitaEspacios(cadena));
    }
    @Test
	public void testConvertirMayusA() {
		String cadena1 = "entornos";
		assertEquals(cadena1.toUpperCase(), new CadenasAlumno().convertirMayusculas(cadena1));
	}
    @Test
  	public void testConvertirMayusB() {
  		String cadena1 = "EnTorNos";
  		assertEquals(cadena1.toUpperCase(), new CadenasAlumno().convertirMayusculas(cadena1));
  	}
    @Test
  	public void testConvertirMayusC() {
  		String cadena1 = "ENTORNOS";
  		assertEquals(cadena1.toUpperCase(), new CadenasAlumno().convertirMayusculas(cadena1));
  	}
    @Test
  	public void testConvertirMayusD() {
  		String cadena1 = "entorNOS ";
  		assertEquals(cadena1.toUpperCase(), new CadenasAlumno().convertirMayusculas(cadena1));
  	}
    @Test
	public void testConvertirMinusA() {
		String cadena1 = "entornos";
		assertEquals(cadena1.toLowerCase(), new CadenasAlumno().convertirMinusculas(cadena1));
	}
    @Test
  	public void testConvertirMinusB() {
  		String cadena1 = "EnTorNos";
  		assertEquals(cadena1.toLowerCase(), new CadenasAlumno().convertirMinusculas(cadena1));
  	}
    @Test
  	public void testConvertirMinusC() {
  		String cadena1 = "ENTORNOS";
  		assertEquals(cadena1.toLowerCase(), new CadenasAlumno().convertirMinusculas(cadena1));
  	}
    @Test
  	public void testConvertirMinusD() {
  		String cadena1 = "entorNOS ";
  		assertEquals(cadena1.toLowerCase(), new CadenasAlumno().convertirMinusculas(cadena1));
  	}
    @Test
  	public void testLongitudCadena() {
  		String cadena1 = "entorNOS ";
  		assertEquals(cadena1.length(), new CadenasAlumno().longitudCadena(cadena1));
  	}
    @Test
  	public void testEmpiezaConA() {
    	String cadena = "Joel Gomis";
        String prefijo = "Jo";
  		assertEquals(cadena.startsWith(prefijo), new CadenasAlumno().empiezaCon(cadena, prefijo));
  	}
    @Test
  	public void testEmpiezaConB() {
    	String cadena = "Joel Gomis";
        String prefijo = "Mo";
  		assertEquals(cadena.startsWith(prefijo), new CadenasAlumno().empiezaCon(cadena, prefijo));
  	}
    @Test
  	public void testEmpiezaConC() {
    	String cadena = "Joel Gomis";
        String prefijo = "Jo";
  		assertEquals(cadena.startsWith(prefijo), new CadenasAlumno().empiezaCon(cadena, prefijo));
  	}
    @Test
  	public void testEmpiezaConD() {
    	String cadena = "Joel Gomis";
        String prefijo = "Jom";
  		assertEquals(cadena.startsWith(prefijo), new CadenasAlumno().empiezaCon(cadena, prefijo));
  	}
    @Test
    public void testAcabaEn() {
        String cadena = "Joel Gomis";
        String sufijo = "Jo";
        assertEquals(cadena.endsWith(sufijo), new CadenasAlumno().acabaEn(cadena, sufijo));
    }
    @Test
    public void testAcabaEn1() {

        String cadena = "mis";
        String sufijo = "Joel Gomis";
        assertEquals(cadena.endsWith(sufijo), new CadenasAlumno().acabaEn(cadena, sufijo));

    }
    @Test
    public void testAcabaEn2() {

        String cadena = "Jo";
        String sufijo = "Joel Gomis";
        assertEquals(cadena.endsWith(sufijo), new CadenasAlumno().acabaEn(cadena, sufijo));
    }
    @Test
    public void testPosicionPrimeraCadena() {

        String cadena = "Joel Joel Joel";
        String letra = "el";
        assertEquals(cadena.indexOf(letra), new CadenasAlumno().posicionPrimeraCadena(cadena, letra));

    }
    @Test
    public void testPosicionPrimeraCadena1() {

        String cadena = "sel";
        String letra = "Joelel";
        assertEquals(cadena.indexOf(letra), new CadenasAlumno().posicionPrimeraCadena(cadena, letra));
    }
    
    @Test
    public void testExtraerSubstring_String_int() {

        String cadena = "Joel";
        int posicionInicio = 2;
        assertEquals(cadena.substring(posicionInicio), new CadenasAlumno().extraerSubstring(cadena, posicionInicio));

    }
    @Test
    public void testExtraerSubstring_String_int2() {

        String cadena = "Joel";
        int posicionInicio = 6;
        assertEquals(cadena.substring(posicionInicio), new CadenasAlumno().extraerSubstring(cadena, posicionInicio));

    }
    @Test
    public void testExtraerSubstring_3args() {

        String cadena = "Joel Gomis";
        int posicionInicio = 2;
        int posicionFinal = 4;
        assertEquals(cadena.substring(posicionInicio, posicionFinal), new CadenasAlumno().extraerSubstring(cadena, posicionInicio, posicionFinal));

    }
    @Test
    public void testExtraerSubstring_3args1() {

        String cadena = "Joel Gomis";
        int posicionInicio = 2;
        int posicionFinal = 14;
        assertEquals(cadena.substring(posicionInicio, posicionFinal), new CadenasAlumno().extraerSubstring(cadena, posicionInicio, posicionFinal));
    }
    @Test
    public void testConcatenaCadenasAlumno() {

            String cadena1 = "Hola ";
            String cadena2 = "mundo";
            
            assertEquals(cadena1.concat(cadena2), new CadenasAlumno().concatenaCadenas(cadena1, cadena2));
    }
}
