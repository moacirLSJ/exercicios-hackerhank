import java.util.*;

public class AncestralNames {
    public static void main(String[] args) {
        List<String> names = List.of("B X", "A XLV", "Louis IX", "Louis VIII", "John III");
        List<String> result = Result.sortRoman(names);

        System.out.println(result.stream().toList());
    }

    static class Result {
        static List<String> sortRoman(List<String> names) {
            List<Object[]> listOfNamesAndNumbers = new ArrayList<>();
            List<String> namesSortedByAlphabeticalOrderWhenEqualsByNumber = new ArrayList<>();

            names.forEach(s -> {
                try {
                    String[] data = s.split(" ");

                    listOfNamesAndNumbers.add(new Object[]{s, romanToDecimal(data[1])});

                } catch (Exception e) {
                    System.err.println("Invalid Roman number");
                }
            });

            listOfNamesAndNumbers.sort((o1, o2) -> {
                String ob1 = String.valueOf(o1[0]);
                String ob2 = String.valueOf(o2[0]);
                int iob1 = (Integer) o1[1];
                int iob2 = (Integer) o2[1];

                if (Objects.equals(ob1, ob2)) {
                    return Integer.compare(iob1, iob2);
                } else {
                    return ob1.compareTo(ob2);
                }
            });

            listOfNamesAndNumbers.forEach(objects -> namesSortedByAlphabeticalOrderWhenEqualsByNumber.add(String.valueOf(objects[0])));

            return namesSortedByAlphabeticalOrderWhenEqualsByNumber;
        }

        private static Integer romanToDecimal(String romanNumberToConvert) throws Exception {
            HashMap<String, Integer> romanToDecimalTable = new HashMap<>();
            romanToDecimalTable.put("L", 50);
            romanToDecimalTable.put("XL", 40);
            romanToDecimalTable.put("XXX", 30);
            romanToDecimalTable.put("XX", 20);
            romanToDecimalTable.put("X", 10);
            romanToDecimalTable.put("IX", 9);
            romanToDecimalTable.put("VIII", 8);
            romanToDecimalTable.put("VII", 7);
            romanToDecimalTable.put("VI", 6);
            romanToDecimalTable.put("V", 5);
            romanToDecimalTable.put("IV", 4);
            romanToDecimalTable.put("III", 3);
            romanToDecimalTable.put("II", 2);
            romanToDecimalTable.put("I", 1);

            if (romanToDecimalTable.containsKey(romanNumberToConvert)) {
                return romanToDecimalTable.get(romanNumberToConvert);
            }

            String romanNumberLocalTemp;
            int multipleOfTenLimit = 0;

            String regex = "^(?=[MDCLXVI])M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$";
            if (!romanNumberToConvert.matches(regex)) throw new Exception();

            int size = romanNumberToConvert.length() > 3 ? 3 : 2;
            for (int i = 1; i <= size; i++) {
                romanNumberLocalTemp = romanNumberToConvert.substring(0, i);
                if (romanToDecimalTable.containsKey(romanNumberLocalTemp)) {
                    multipleOfTenLimit++;
                }
            }

            int dozensPartOfNumberInDecimalFormat = getRomanOutDecimalDozens(romanToDecimalTable,
                    romanNumberToConvert,
                    multipleOfTenLimit);

            int unityPartOfNumberInDecimalFormat = getRomanOutDecimalUnity(romanToDecimalTable,
                    romanNumberToConvert,
                    multipleOfTenLimit);


            return dozensPartOfNumberInDecimalFormat + unityPartOfNumberInDecimalFormat;
        }

        private static int getRomanOutDecimalUnity(HashMap<String, Integer> romanToDecimalTable,
                                                   String romanNumberToConvert,
                                                   int multipleOfTenLimit) {
            return romanToDecimalTable.get(romanNumberToConvert.substring(multipleOfTenLimit));
        }

        private static int getRomanOutDecimalDozens(HashMap<String, Integer> romanToDecimalTable,
                                                    String roman,
                                                    int multipleOfTenLimit) {
            return romanToDecimalTable.get(roman.substring(0, multipleOfTenLimit));
        }
    }
}
