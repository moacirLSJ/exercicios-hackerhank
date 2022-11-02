import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaRegex {
    public static void main(String[] args) {
        List<String> input = new ArrayList<>();
        input.add("000.12.12.034");
        input.add("121.234.12.12");
        input.add("23.45.12.56");
        input.add("00.12.123.123123.123");
        input.add("122.23");
        input.add("Hello.IP 123.123.123.123)");

//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()) {
//            String IP = in.next();
//            System.out.println(IP.matches(new MyRegex().pattern));
//        }

        input.forEach(s -> {
            System.out.println(s.matches(new MyRegex().pattern));
        });

    }

    private static class MyRegex {
//        public String pattern = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
        public String pattern = "((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
    }
}
