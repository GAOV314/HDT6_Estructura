import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Implementación de la interfaz IHashMap que utiliza el algoritmo MD5 para calcular el hash.
 */
public class HashMD5 implements IHashMap {

    /**
     * Calcula el hash MD5 para la entrada especificada.
     * 
     * @param input La cadena de entrada para la cual se calculará el hash MD5.
     * @return El hash MD5 generado como una cadena hexadecimal.
     */
    @Override
    public String getHash(String input) {
        try {
            // Obtener la instancia de MessageDigest con el algoritmo MD5
            MessageDigest md = MessageDigest.getInstance("MD5");

            // Calcular el hash MD5
            byte[] hashedBytes = md.digest(input.getBytes());

            // Convertir el arreglo de bytes a una representación hexadecimal
            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b));
            }

            String md5Hash = sb.toString();

            return md5Hash;
        } catch (NoSuchAlgorithmException e) {
            // Manejo de excepción si el algoritmo no está disponible
            e.printStackTrace();
            return "";
        }
    }
}
