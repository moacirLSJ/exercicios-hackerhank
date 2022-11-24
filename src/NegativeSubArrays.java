import java.util.Scanner;

public class NegativeSubArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array;
        int numberOfNegativeSubArray = 0;
        int N = Integer.parseInt(in.nextLine());
        String[] numbersString = in.nextLine().split(" ");

        array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(numbersString[i]);

            if (array[i] < 0) numberOfNegativeSubArray++;
        }

        for (int i = 0; i < N - 1; i++) {
            int sum = array[i];
            for (int j = i + 1; j < N; j++) {
                sum += array[j];
                if (sum < 0) numberOfNegativeSubArray++;
            }
        }
        System.out.println(numberOfNegativeSubArray);
    }
}
