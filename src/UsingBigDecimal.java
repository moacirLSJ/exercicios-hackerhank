import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class UsingBigDecimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        List<BigDecimal> numbers = new ArrayList<>();
        List<String> numberString = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String dataIn = in.next();
            BigDecimal bd = new BigDecimal(dataIn);
            numbers.add(bd);

            numberString.add(dataIn);
        }

        numbers.sort(Collections.reverseOrder());
        numbers = numbers.stream().distinct().collect(Collectors.toList());


        numbers.forEach(n -> numberString.forEach(s -> {
            if (Objects.equals(n, new BigDecimal(s)) ) {
                System.out.println(s);

            }
        }));

    }
}
