public class FindMinInArray {
    public static void main(String[] args) {
        int[] arr = {56, 34, 12, 89, 67}; // Change the array elements as needed
        int min = findMin(arr);
        System.out.println("Minimum element in the array is: " + min);
    }
    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}