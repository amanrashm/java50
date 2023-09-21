public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = arraySum(arr);
        System.out.println("Sum of array elements: " + sum);
    }
    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}