import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SubstringComparisons {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        int n = in.nextInt();
        System.out.println(SubstringComparisons.getSmallestAndLargest(word, 3));
    }


    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        List<String> words = new ArrayList<>();
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'


        for (int i = 0; i < s.length() - k + 1; i++) {
            words.add(s.substring(i, i + k));
        }
        words.sort(Comparator.naturalOrder());

        smallest = words.get(0);
        largest = words.get(words.size() - 1);
        return smallest + "\n" + largest;
    }
}
