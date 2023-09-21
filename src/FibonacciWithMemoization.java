import java.util.HashMap;
import java.util.Map;

public class FibonacciWithMemoization {
    public static void main(String[] args) {
        int n = 10;
        Map<Integer, Integer> memo = new HashMap<>();
        int fibonacci = calculateFibonacci(n, memo);
        System.out.println("The " + n + "th Fibonacci number is: " + fibonacci);
    }

    public static int calculateFibonacci(int n, Map<Integer, Integer> memo) {
        if (n <= 1) {
            return n;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int result = calculateFibonacci(n - 1, memo) + calculateFibonacci(n - 2, memo);
        memo.put(n, result);
        return result;
    }
}