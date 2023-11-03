package Arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 2, 7, 9, 4, 7}; // Change the array elements as needed
        int[] uniqueArray = removeDuplicates(arr);
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueArray));
    }
    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return arr;
        }

        Arrays.sort(arr);
        int[] uniqueArray = new int[n];
        uniqueArray[0] = arr[0];
        int uniqueCount = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                uniqueArray[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }
        return Arrays.copyOf(uniqueArray, uniqueCount);
    }
}