package Arrays;

import java.util.Arrays;
public class SortEvenAndOdd {
    public static void main(String[] args) {
        int[] numbers = {12, 5, 8, 3, 21, 7, 15, 4, 10};
        sortEvenAndOdd(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }
    static void sortEvenAndOdd(int[] arr) {
        int[] sortedArray = new int[arr.length];
        int evenIndex = 0;
        int oddIndex = arr.length - 1;
        for (int num : arr) {
            if (num % 2 == 0) {
                sortedArray[evenIndex++] = num;
            } else {
                sortedArray[oddIndex--] = num;
            }
        }
        System.arraycopy(sortedArray, 0, arr, 0, arr.length);
    }
}

/*
public class ShiftOddEven {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] shiftedArray = shiftOddEven(originalArray);
        System.out.println("Original Array: ");
        printArray(originalArray);
        System.out.println("\nShifted Array: ");
        printArray(shiftedArray);
    }
    public static int[] shiftOddEven(int[] arr) {
        int[] result = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;
        for (int num : arr) {
            if (num % 2 == 1) {
                result[left++] = num;
            } else {
                result[right--] = num;
            }
        }
        return result;
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}*/