import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestHash {

    @Test
    public void testMD5Hash() {
        String input = "hello world";
        String expectedHash = "5eb63bbbe01eeed093cb22bb8f5acdc3";
        assertEquals(expectedHash, HashFactory.getHashInstance(1).getHash(input));
    }

    @Test
    public void testOrganicHash() {
        String input = "hello world";
        assertEquals(input, HashFactory.getHashInstance(2).getHash(input));
    }

    @Test
    public void testSHA1Hash() {
        String input = "hello";
        String expectedHash = "aaf4c61ddcc5e8a2dabede0f3b482cd9aea9434d";

        ImpHashSHA1 ImpHashSHA1 = new ImpHashSHA1();
        String actualHash = sha1.getHash(input);

        assertEquals(expectedHash, actualHash);
    }
}