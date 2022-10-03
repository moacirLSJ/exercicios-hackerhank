import java.util.Scanner;

public class JavaSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        int stringLength = S.length();
        if (stringLength < 1 || stringLength > 100) System.exit(-1);
        if (start < 0 || start > end || start > stringLength || end > stringLength) System.exit(-1);

        System.out.println(S);

        System.out.println(S.substring(start, end));


    }

}
