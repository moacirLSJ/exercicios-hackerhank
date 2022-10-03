import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Anagramas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        String a = scan.next();
//        String b = scan.next();
        String a = "anagram";
        String b = "margana";
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    private static boolean isAnagram(String a, String b) {

        StringBuilder sb = new StringBuilder();
        a.chars().distinct().forEach(value -> sb.append((char) value));
        System.out.println(sb.toString());
        List<Integer> f = new ArrayList<>();
        sb.toString().chars().forEach(value -> {
            f.add((int) a.chars().filter(c -> value == c).count());
        });
        System.out.println(f.stream().toList());
        return true;

    }
}
