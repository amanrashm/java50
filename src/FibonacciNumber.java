public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 10;
        int fibonacci = findNthFibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + fibonacci);
    }
    public static int findNthFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int prev = 0;
        int current = 1;
        for (int i = 2; i <= n; i++) {
            int next = prev + current;
            prev = current;
            current = next;
        }
        return current;
    }
}