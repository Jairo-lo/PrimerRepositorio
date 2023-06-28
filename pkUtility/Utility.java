package pkUtility;

/**
 * 
 * Utility es una clase que proporciona métodos útiles para el formateo de
 * números enteros.
 * 
 */

public class Utility {

    /**
     * Formatea un número entero según el formato especificado.
     *
     * @param numero  El número entero a formatear.
     * @param formato El formato deseado para el número entero.
     * @return El número entero formateado como una cadena.
     */
    public static String formatearNumeroEntero(int numero, String formato) {
        String numeroFormateado = String.format(formato, numero);
        return numeroFormateado;
    }
}
