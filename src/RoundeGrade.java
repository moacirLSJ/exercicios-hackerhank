import java.util.ArrayList;
import java.util.List;

public class RoundeGrade {
    public static void main(String[] args) {
        List<Integer> grades = List.of(73, 67, 38, 33);

        List<Integer> rounded = gradingStudents(grades);
        System.out.println(rounded);
    }

    private static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> gradesRounded = new ArrayList<>();
        int numberUnderLimitRound = 38;
        for (Integer n : grades) {
            if (n >= numberUnderLimitRound) {
                int multiple = n;
                while (multiple % 5 != 0) {
                    multiple++;
                }

                if (Math.abs(Math.subtractExact(n, multiple)) < 3) {
                    gradesRounded.add(multiple);
                } else {
                    gradesRounded.add(n);
                }
            } else {
                gradesRounded.add(n);
            }

        }

        return gradesRounded;
    }
}
