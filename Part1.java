import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String a = "acd";
        String b = "dca";

        System.out.println(isPermutation(a, b));

        ArrayList<Integer> ab = new ArrayList<>();
        ab.add(1);
        ab.add(2);
        ab.add(3);
        ab.add(4);
        ab.add(5);

        System.out.println(pairsThatEqualSum(ab, 7));
    }

    public static boolean isPermutation(String s1, String s2) {
        char[] wordOne = s1.toCharArray();
        char[] wordTwo = s2.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> mapTwo = new HashMap<>();

        for (char ch : wordOne) {
            if (map.containsKey(ch)) {
                int currentCount = map.get(ch);
                map.put(ch, currentCount + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (char ch : wordTwo) {
            if (mapTwo.containsKey(ch)) {
                int currentCount = mapTwo.get(ch);
                mapTwo.put(ch, currentCount + 1);
            } else {
                mapTwo.put(ch, 1);
            }
        }

        return map.equals(mapTwo);
    }

    public static List<List<Integer>> pairsThatEqualSum(List<Integer> inputArray, Integer targetSum) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < inputArray.size(); i++) {
            for (int j = 0; j < inputArray.size(); j++) {
                if (i != j && inputArray.get(i) + inputArray.get(j) == targetSum
                        && !result.contains(Arrays.asList(new Integer[]{inputArray.get(j), inputArray.get(i)}))) {
                    Integer arr[] = {inputArray.get(i), inputArray.get(j)};
                    result.add(Arrays.asList(arr));
                }
            }
        }

        return result;

    }

}
