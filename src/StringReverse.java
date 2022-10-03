import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringReverse {
    public static void main(String[] args) {
//        String A = "madam";
        String A = "java";
        String B = new StringBuilder(A).reverse().toString();
        if (A.compareTo(B) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
