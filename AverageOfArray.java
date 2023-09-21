public class AverageOfArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        double average = calculateAverage(arr);
        System.out.println("Average of array elements: " + average);
    }
    public static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
}