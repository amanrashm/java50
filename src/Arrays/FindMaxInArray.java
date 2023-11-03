package Arrays;

public class FindMaxInArray {
    public static void main(String[] args) {
        int[] arr = {12, 45, 67, 89, 34, 56};
        int max = findMax(arr);
        System.out.println("Maximum element in the array is: " + max);
    }
    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}