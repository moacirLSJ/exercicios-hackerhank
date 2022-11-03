import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class DuplicateWords {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        while (numSentences-- > 0) {
            String input = in.nextLine();
            input = exec(input);
            System.out.println(input);
        }

        in.close();

    }

    private static String exec(String s) {
        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";

        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
//        Pattern p = Pattern.compile("\\b(\\w+)\\b(\\s\\1)+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = p.matcher(s);

        while (matcher.find()) {
            s = s.replaceAll(matcher.group(), matcher.group(1));
        }
        return s;
    }
}
