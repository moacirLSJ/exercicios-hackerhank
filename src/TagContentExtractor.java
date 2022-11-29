import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = Integer.parseInt(in.nextLine());
//        int N = 4;


//        String[] line = new String[]{
//                "<h1> val </h1> inv",
//                "<h1>Nayeem loves counseling</h1>",
//                "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>",
//                "<Amee>safat codes like a ninja</amee>",
//                "<SA premium>Imtiaz has a secret crush</SA premium>"
//        };
        for (int i = 0; i < N; i++) {

//            String lineToExtract = line[i];
            String lineToExtract = in.nextLine();

            Pattern p = Pattern.compile("<([^>]+)>(?<content>[^<>]+)</(\\1)>");
            Matcher m = p.matcher(lineToExtract);
            int count = 0;

            while (m.find()) {
                System.out.println(m.group("content"));
                count++;
            }
            if (count == 0)
                System.out.println("None");

        }
    }
}
