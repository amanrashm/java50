package Arrays;

import java.util.Arrays;

public class Merge_Unsorted {
    public static void main(String[] args) {

        int[] array = {3, 5, 6, 9, 6};
        int[] array1 = {6, 4, 9, 8, 3};

        int [] combinedArray = new int[array.length + array1.length];

        System.arraycopy(array,0,combinedArray,0,array.length);
        System.arraycopy(array1,0,combinedArray,array.length, array1.length);

        Arrays.sort(combinedArray);
        System.out.println(Arrays.toString(combinedArray));
    }
}
