package Arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {31, 32, 33, 34, 35, 36, 37, 39, 40};

        int n = arr.length + 1;
        int expectedSum = (n * (2 * arr[0] + (n - 1))) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("The missing number is: " + missingNumber);
    }
}