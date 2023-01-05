import java.text.ParseException;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) throws ParseException {
        List<Integer> grades = List.of(-4,3,-9,0,4,1);

        plusMinus(grades);
    }

    private static void plusMinus(List<Integer> arr) {
        float ratioPositive, ratioNegative, ratioZeros;

        ratioPositive = (float)arr.stream().filter(n -> n > 0).count() / arr.size();
        ratioNegative = (float)arr.stream().filter(n -> n < 0).count() / arr.size();
        ratioZeros = (float) arr.stream().filter(n -> n == 0).count() / arr.size();

        System.out.printf("%.6f \n", ratioPositive);
        System.out.printf("%.6f \n", ratioNegative);
        System.out.printf("%.6f", ratioZeros);

    }
}
