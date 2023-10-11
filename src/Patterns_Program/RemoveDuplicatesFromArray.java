package Patterns_Program;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5, 6, 6};
        LinkedHashSet<Integer> uniqueSet = new LinkedHashSet<>();
        for (int num : arr) {
            uniqueSet.add(num);
        }
        Integer[] uniqueArray = uniqueSet.toArray(new Integer[0]);
        int[] result = Arrays.stream(uniqueArray).mapToInt(Integer::intValue).toArray();
        System.out.println("Array with duplicates removed: " + Arrays.toString(result));
    }
}
