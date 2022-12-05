import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5AndSHA {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
//       String t = "yxPX0fbIKHvjHo180";
        String t = "K1t4fo0V";
        md.update(t.getBytes());
        byte[] c = md.digest();
        StringBuilder sha = new StringBuilder(new BigInteger(1,c).toString(16));
        while (sha.length() < 64){
            sha.insert(0,"0");
        }
        System.out.println(sha);

    }
}
