import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.IdentityHashMap;

public class ImpHashSHA1 implements IHashMap {
    @Override
    public String getHash(String input) {
        try{
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        byte[] hashedBytes = md.digest(input.getBytes());
        StringBuilder hexString = new StringBuilder();
        for (byte hashedByte : hashedBytes) {
        hexString.append(Integer.toHexString(0xFF & hashedByte));
        }

        return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
        e.printStackTrace();
        return null;
        }
        }
    }
