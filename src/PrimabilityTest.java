import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.stream.IntStream;

public class PrimabilityTest {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger n = new BigInteger(br.readLine());
//            BigInteger n = new BigInteger("1313131313131313131313131313131313");
        System.out.println(isProbablePrime(n));
        System.out.println(usingLib(n));
        System.out.println(usingFor(n));
    }

    private static Long usingFor(BigInteger n) {
        long t = System.currentTimeMillis();
        long c = 0;
        for (int i = 1; i < n.intValue()+1; i++) {
            if (n.longValue() % i == 0) {
                c++;

            }
        }

        if (c == 2) {
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }

        return System.currentTimeMillis() - t;
    }

    private static Long usingLib(BigInteger n) {
        Long t = System.currentTimeMillis();

        if (n.isProbablePrime(1)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

        return System.currentTimeMillis() - t;
    }

    private static Long isProbablePrime(BigInteger n) {
        Long t = System.currentTimeMillis();
        long count = IntStream.range(1, n.intValue() + 1).filter(i -> (n.longValue() % i) == 0).count();
        if (count == 2){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
        return System.currentTimeMillis() - t;
    }
}
