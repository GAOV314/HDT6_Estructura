/**
 * Interfaz que define el contrato para los objetos que realizan cálculos de hash.
 */
public interface IHashMap {

    /**
     * Calcula el hash para la entrada especificada.
     * 
     * @param input La cadena de entrada para la cual se calculará el hash.
     * @return El hash generado como una cadena.
     */
    String getHash(String input);
}
