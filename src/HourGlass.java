import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class HourGlass {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();
        IntStream.range(0, 2).forEach(i -> {
            try {
                arr.add(Arrays.stream(in.readLine().split(" ")).map(Integer::parseInt).toList());

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

//        IntStream.range(0, 36).forEach(i -> {
//            arr.add(
//                    Stream.of((Math.random() * 18) - 9)
//                            .map(Double::intValue)
//                            .collect(Collectors.toList())
//            );
//
//        });

//        arr.add(List.of(1, 1, 1, 0, 0, 0));
//        arr.add(List.of(0, 1, 0, 0, 0, 0));
//        arr.add(List.of(1, 1, 1, 0, 0, 0));
//        arr.add(List.of(0, 0, 2, 4, 4, 0));
//        arr.add(List.of(0, 0, 0, 2, 0, 0));
//        arr.add(List.of(0, 0, 1, 2, 4, 0));

//        arr.add(List.of(-1, -1, 0 ,-9 ,-2 ,-2));
//        arr.add(List.of(-2, -1, -6, -8, -2, -5));
//        arr.add(List.of(-1, -1, -1, -2, -3, -4));
//        arr.add(List.of(-1, -9, -2, -4, -4, -5));
//        arr.add(List.of(-7, -3, -3, -2, -9, -9));
//        arr.add(List.of(-1, -3, -1, -2, -4, -5));

        IntStream.range(0, arr.size()).forEach(r -> {

            System.out.println(arr.get(r));
        });

        System.out.println();
        int biggestSum = -100;
        for (int r = 0; r < arr.size() - 2; r++) {
            for (int c = 0; c < 4; c++) {
                int sumLocal = 0;

                sumLocal += arr.get(r).get(c) +
                        arr.get(r).get(c + 1) +
                        arr.get(r).get(c + 2) +
                        arr.get(r + 1).get(c + 1) +
                        arr.get(r + 2).get(c) +
                        arr.get(r + 2).get(c + 1) +
                        arr.get(r + 2).get(c + 2);
                System.out.println(sumLocal);
                if (sumLocal > biggestSum) biggestSum = sumLocal;
            }
        }
        System.out.println(biggestSum);
    }
}
