import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Implementación de la interfaz IHashMap que utiliza el algoritmo SHA-1 para calcular el hash.
 */
public class ImpHashSHA1 implements IHashMap {

    /**
     * Calcula el hash SHA-1 para la entrada especificada.
     * 
     * @param input La cadena de entrada para la cual se calculará el hash SHA-1.
     * @return El hash SHA-1 generado como una cadena hexadecimal.
     */
    @Override
    public String getHash(String input) {
        try {
            // Obtener la instancia de MessageDigest con el algoritmo SHA-1
            MessageDigest md = MessageDigest.getInstance("SHA-1");

            // Calcular el hash SHA-1
            byte[] hashedBytes = md.digest(input.getBytes());

            // Convertir el arreglo de bytes a una representación hexadecimal
            StringBuilder hexString = new StringBuilder();
            for (byte hashedByte : hashedBytes) {
                hexString.append(Integer.toHexString(0xFF & hashedByte));
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            // Manejo de excepción si el algoritmo no está disponible
            e.printStackTrace();
            return null;
        }
    }
}
