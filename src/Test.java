import java.util.List;

class Test {
    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 2, 3, 4, 5);
//        List<Integer> arr = List.of(256741038, 623958417, 467905213, 714532089, 938071625);
//        List<Integer> arr = List.of(769082435, 210437958, 673982045, 375809214, 380564127);
        long     sumMin = 0, sumMax = 0, sum = 0;

        for (int j = 0; j < arr.size(); j++) {

            for (int i = 0; i < arr.size(); i++) {
                if (i != j) {
                    sum += arr.get(i);
                }
            }
            System.out.println(sum);

            if (sum > sumMax) {
                sumMax = sum;
            }
            if (sum < sumMin || sumMin == 0) {
                sumMin = sum;
            }

            sum = 0;

        }
        System.out.println(sumMin + " " + sumMax);
    }
}