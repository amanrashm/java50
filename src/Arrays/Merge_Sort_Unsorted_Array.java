package Arrays;
import java.util.*;

public class Merge_Sort_Unsorted_Array {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 7, 3, 9, 4, 0};
        int[] arr1 = {3, 4, 66, 7, 8, 3, 2, 1};
        int[] combinedArray = new int[arr.length + arr1.length];

        System.out.println(Arrays.hashCode(arr));
        System.out.println(Arrays.toString(arr));
        System.out.println(arr);
        System.out.println(arr.hashCode());

        for (int nums : arr) {
            System.out.print(nums);
        }
        System.out.println(" ");

        for (int nums : arr1) {
            System.out.print(nums);
        }
        System.out.println(" ");

        System.arraycopy(arr, 0, combinedArray, 0, arr.length);
        System.arraycopy(arr1, 0, combinedArray, arr.length, arr1.length);
        Arrays.sort(combinedArray);
        System.out.println(Arrays.toString(combinedArray));


        int[] sortedArray = new int[combinedArray.length];
        int evenIndex = 0;
        int oddIndex = combinedArray.length - 1;
        for (int num : combinedArray) {
            if (num % 2 == 0) {
                sortedArray[evenIndex++] = num;
            } else {
                sortedArray[oddIndex--] = num;
            }
        }
        System.arraycopy(sortedArray, 0, arr, 0, arr.length);
        System.out.println(Arrays.toString(sortedArray));


        int[] result = new int[arr.length + arr1.length];
        int left = 0;
        int right = arr.length - 1;
        for (int num : arr) {
            if (num % 2 == 1) {
                result[left++] = num;
            } else {
                result[right--] = num;
            }
        }
        System.arraycopy(result, 0, arr, 0, arr.length);
        System.out.println(Arrays.toString(result));



        int Index = 0;
        int Index1 = 15;
        int temp = combinedArray[Index];
        combinedArray[Index] = combinedArray[Index1];
        combinedArray[Index1] = temp;
        System.out.println(Arrays.toString(combinedArray));


        ArrayList<Integer> list = new ArrayList<>();
        for (int nums : combinedArray){
            list.add(nums);
        }
        System.out.println(list);


        Set<Integer> set = new HashSet<>();
        int[] uniqueArray = new int[combinedArray.length];
        int uniqueIndex = 0;
        for (int num : combinedArray) {
            if (set.add(num)) {
                uniqueArray[uniqueIndex++] = num;
            }
        }
        int[] finalArray = Arrays.copyOf(uniqueArray, uniqueIndex);
        System.out.println(Arrays.toString(finalArray));
    }
}