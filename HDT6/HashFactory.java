/**
 * Clase para la creación de instancias de objetos que implementan la interfaz IHashMap.
 */
public class HashFactory {

    /**
     * Obtiene una instancia de IHashMap según el tipo especificado.
     * 
     * @param input El tipo de hash deseado.
     * @return Una instancia de IHashMap correspondiente al tipo especificado.
     */
    public static IHashMap getHashInstance(int input) {
        switch(input) {
            case 1:
                return new HashMD5();
            case 2:
                return new HashOrganic();
            case 3:
                return new ImpHashSHA1();
            default:
                return new HashMD5();
        }
    }
}
