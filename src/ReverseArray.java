import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        String [] arr = {"this","is","me"};
        reverseArray(arr);
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
    public static void reverseArray(String[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}