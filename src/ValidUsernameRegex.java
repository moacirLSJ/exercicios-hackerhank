import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernameRegex {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
//        lines.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaab");
        lines.add("Julia");
        lines.add("Samantha");
        lines.add("Samantha_21");
        lines.add("1Samantha");
        lines.add("Samantha?10_2A");
        lines.add("JuliaZ007");
        lines.add("Julia@007");
        lines.add("_Julia007");

        Pattern p = Pattern.compile("[a-zA-Z]\\w{7,29}");
        lines.forEach(l -> {
            System.out.print("l = " + l+", ");
            if (p.matcher(l).find()) {
                System.out.println("valid");
            } else {
                System.out.println("invalid");
            }
        });
//        lines.stream().map(p::matcher)
//                .filter(Matcher::find)
//                .map(g-> "valid")
//                .forEach(System.out::println);

    }
}
