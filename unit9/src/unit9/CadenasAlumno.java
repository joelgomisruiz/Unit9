/**
 * 
 */
package unit9;

/**
 * @author joel
 *
 */
public class CadenasAlumno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

	}
	/**
	 * 
	 * @param cadena1
	 * @param cadena2
	 * @return
	 */
	public boolean sonIguales(String cadena1, String cadena2){
	
		if(cadena1.length() == cadena2.length())
			return true;
		else
			return false;
	}
	/**
	 * método que compara dos cadenas y te dice si la primera es mayor
	 * @param cadena1
	 * @param cadena2
	 * @return true si es mayor
	 * @return false si es igual o menor
	 */
	public boolean esMayor(String cadena1, String cadena2){
		
		if(cadena1.length() > cadena2.length())
			return true;
		else
			return false;
	}
	/**
	 * método que compara dos cadenas y te dice si la primera es menor
	 * @param cadena1
	 * @param cadena2
	 * @return true si la primera es menor
	 * @return false si es mayor o igual
	 */
	public boolean esMenor(String cadena1, String cadena2){
		
		if(cadena1.length() < cadena2.length())
			return true;
		else
			return false;
	}
	/**
	 * metodo que compara si dos cadenas son iguales ignorando mayusculas
	 * @param cadena1
	 * @param cadena2
	 * @return true si son iguales
	 * @return false si son distintas
	 */
	public boolean comparaIgnorandoMayusculas(String cadena1, String cadena2){
		
		if(cadena1.toLowerCase().length() == cadena2.toLowerCase().length())
			return true;
		else
			return false;
	}
	/**
	 * método que reemplaza de la cadena: cadena todos los regla/expresión que hay por cambio
	 * @param cadena
	 * @param regla
	 * @param cambio
	 * @return devuelve la cadena con el cambio.
	 */
	public String reemplazaTodos(String cadena, String regla, String cambio){
		char[] caracteres = cadena.toCharArray();
		char[] expresion = regla.toCharArray();
		char[] palabranueva = cambio.toCharArray();
		
		for(int i=0; i<cadena.length(); i++){
			if(caracteres[i] == expresion[0]){
				caracteres[i] = palabranueva[0];
			}
		}
		return new String(caracteres);
	}
	/**
	 * método que reemplaza en la cadena: cadena la primera regla/expresión que hay por cambio
	 * @param cadena
	 * @param regla
	 * @param cambio
	 * @return 
	 * @return devuelve la cadena con el cambio.
	 */
	public String reemplazaPrimero(String cadena, String regla, String cambio){
		char[] caracteres = cadena.toCharArray();
		char[] expresion = regla.toCharArray();
		char[] palabranueva = cambio.toCharArray();
		
		for(int i=0; i<cadena.length(); i++){
			if(caracteres[i] == expresion[0]){
				caracteres[i] = palabranueva[0];
				break;
			}
		}
		return new String(caracteres);
	}
	/**
	 * Método que nos divide una cadena en base a una regla/expresión y un límite que será el número total de cadenas que queremos que nos muestre
	 * @param cadena
	 * @param regla
	 * @param limite
	 */
	public void muestraSplitLimite(String cadena, String regla, int limite){
		//TODO
	}
	/**
	 *  método que nos divide una cadena en base a una regla/expresión
	 * @param cadena
	 * @param regla
	 */
	public void muestraSplit(String cadena, String regla){
		//TODO
	}
	/**
	 * método que devuelve un String sin espacios previos/posteriores
	 * @param cadena
	 * @return devuelve un String sin espacios
	 */
	public String quitaEspacios(String cadena){
		
		String resultado = "";
		
		for(int i=0; i<cadena.length(); i++){
			if(cadena.charAt(i) != ' '){
				resultado += cadena.charAt(i);
			}
		}
		return resultado;
	}
	/**
	 * método que dado un String te devuelve ese mismo pero en mayúsculas
	 * @param cadena
	 * @return devuelve el string en mayusculas
	 */
	public String convertirMayusculas(String cadena){
		return cadena.toUpperCase();
	}
	/**
	 * método que dado un String te devuelve ese mismo pero en minusculas
	 * @param cadena
	 * @return devuelve el string en minusculas
	 */
	public String convertirMinusculas(String cadena){
		return cadena.toLowerCase();
	}
	/**
	 * método que devuelve la longitud de una cadena
	 * @param cadena
	 * @return devuelve la longitud de String cadena.
	 */
	public long longitudCadena(String cadena){
		return cadena.length();
	}
	/**
	 * método que te indica si la cadena comienza con el prefijo dado
	 * @param cadena
	 * @param prefijo
	 * @return true si comienza con el prefijo
	 * @return false si no
	 */
	public boolean empiezaCon(String cadena, String prefijo){
		if (cadena.charAt(0) == prefijo.charAt(0)){
			return true;
		}
		else
			return false;
	}
	/**
	 * método que te indica si la cadena acaba con el prefijo dado
	 * @param cadena
	 * @param prefijo
	 * @return true si acaba con el prefijo
	 * @return false si no
	 */
	public boolean acabaEn(String cadena, String prefijo){
		if (cadena.charAt(cadena.length()) == prefijo.charAt(prefijo.length())){
			return true;
		}
		else
			return false;
	}
	/**
	 * método que te devuelve la posición en la que se encuentra una letra/conjunto de letras en un string
	 * @param cadena
	 * @param letra
	 * @return devuelve la posición en la que se encuentra una letra/conjunto de letras
	 */
	public long posicionPrimeraCadena(String cadena, String letra){
		return cadena.indexOf(letra);
	}
	/**
	 * método que te devuelve una parte del string
	 * @param cadena
	 * @param posicionInicio
	 * @return devuelve parte de un string
	 */
	public String extraerSubstring(String cadena, int posicionInicio){
		String resultado = "";
		for(int i = posicionInicio; i<cadena.length();i++){
			resultado+=cadena.charAt(i);
		}
		return resultado;
	}
	/**
	 * método que te devuelve una parte del string
	 * @param cadena
	 * @param posicionInicio
	 * @param posicionFinal
	 * @return devuelve parte de un string
	 */
	public String extraerSubstring(String cadena, int posicionInicio, int posicionFinal){
		String resultado = "";
		for(int i = posicionInicio; i<posicionFinal;i++){
			resultado+=cadena.charAt(i);
		}
		return resultado;
	}
	/**
	 * Método que te permite concatenar dos cadenas con el operador +
	 * @param cadena1
	 * @param cadena
	 * @return devuelve las dos cadenas juntas
	 */
	public String concatenaCadenas(String cadena1, String cadena){
		return cadena1 + cadena;
	}
}
