/**
 * Implementación de la interfaz IHashMap que devuelve la entrada tal cual, sin aplicar ningún cálculo de hash.
 */
public class HashOrganic implements IHashMap {

    /**
     * Retorna la cadena de entrada sin aplicar ningún cálculo de hash.
     * 
     * @param input La cadena de entrada.
     * @return La misma cadena de entrada.
     */
    @Override
    public String getHash(String input) {
        return input;
    }
}
