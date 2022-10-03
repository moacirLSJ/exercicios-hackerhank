import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Anagramas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
//        String a = "anagram";
//        String b = "margan";
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    private static boolean isAnagram(String A, String B) {
        String a = A.toLowerCase();
        String b = B.toLowerCase();
        StringBuilder sb = new StringBuilder();
        a.chars().distinct().forEach(value -> sb.append((char) value));
        List<Integer> f = new ArrayList<>();

        sb.toString().chars().forEach(value -> {
            f.add((int) a.chars().filter(c -> value == c).count());
        });

//        System.out.println(f.stream().toList());

        List<Integer> g = new ArrayList<>();
        sb.toString().chars().forEach(value -> {
            g.add((int) b.chars().filter(c -> value == c).count());
        });

//        System.out.println(Arrays.equals(f.toArray(),g.toArray()));
//        System.out.println(g.toString());
        return Arrays.equals(f.toArray(),g.toArray());

    }
}
