import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class StringsIntroduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String status = "";
        System.out.println(A.length() + B.length());

        if (A.compareTo(B) > 0){
            status = "Yes";
        }else{
            status = "No";
        }
        A = A.substring(0,1).toUpperCase() + A.substring(1);
        B = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(status);
        System.out.print(A);
        System.out.print(" "+B);
    }
}