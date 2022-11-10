import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CardinalitySorting {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        int numsCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> nums = IntStream.range(0, numsCount).mapToObj(i -> {
//                    try {
//                        return bufferedReader.readLine().replaceAll("\\s+$", "");
//                    } catch (IOException ex) {
//                        throw new RuntimeException(ex);
//                    }
//                })
//                .map(String::trim)
//                .map(Integer::parseInt)
//                .collect(toList());
//        ;
//        List<Integer> result = Result.cardinalitySort(List.of(31, 15, 7, 3, 2));
        List<Integer> result = Result.cardinalitySort(List.of(65,133,128,5,3));
//        List<Integer> result = Result.cardinalitySort(List.of(605));

//        bufferedWriter.write(
//                result.stream()
//                        .map(Object::toString)
//                        .collect(joining("\n"))
//                        + "\n"
//        );

        bufferedReader.close();
//        bufferedWriter.close();
    }

    static class Result {

        public static List<Integer> cardinalitySort(List<Integer> nums) {
            List<Integer[]> numbersAndOnes = new ArrayList<>();

            nums.forEach(n -> {
                int count = 0;
                int q = n / 2;
                if (n % 2 == 1) count++;

                while (q > 1) {
                    if (q % 2 == 1) count++;
                    q /= 2;
                }
                if (q % 2 == 1) count++;
                numbersAndOnes.add(new Integer[]{n, count});

            });
//            ones.forEach(System.out::println);
            numbersAndOnes.sort((o1, o2) -> o1[1].compareTo(o2[1]));
            numbersAndOnes.sort((o1, o2) -> (Objects.equals(o1[1], o2[1]) ? o1[0] - o2[0] : o1[1] - o2[1]));

            numbersAndOnes.forEach(no -> System.out.println(Arrays.toString(no)));

            List<Integer> orderedNumbers = new ArrayList<>();
            numbersAndOnes.forEach(no -> orderedNumbers.add(no[0]));
            orderedNumbers.forEach(System.out::println);
            return orderedNumbers;
        }
    }
}
