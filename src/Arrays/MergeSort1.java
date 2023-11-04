package Arrays;

import java.util.Arrays;

import static java.util.Arrays.copyOfRange;

public class MergeSort1 {
    public static void mergeSort(int[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;
            int[] left = copyOfRange(arr, 0, mid);
            int[] right = copyOfRange(arr, mid, arr.length);
            mergeSort(left);
            mergeSort(right);
            int i = 0, j = 0, k = 0;
            while (i < left.length && j < right.length) {
                if (left[i] < right[j]) {
                    arr[k++] = left[i++];
                } else {
                    arr[k++] = right[j++];
                }
            }
            while (i < left.length) {
                arr[k++] = left[i++];
            }
            while (j < right.length) {
                arr[k++] = right[j++];
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7, 10, 48, 59};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}