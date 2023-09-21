public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            int fib = fibonacci(i);
            System.out.print(fib + " ");
        }
    }
    public static int fibonacci(int n) {
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