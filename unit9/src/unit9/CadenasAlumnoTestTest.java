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
}
