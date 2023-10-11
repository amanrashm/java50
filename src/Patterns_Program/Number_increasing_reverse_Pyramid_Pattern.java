package Patterns_Program;
public class Number_increasing_reverse_Pyramid_Pattern {
    public static void main (String args[]) {
        int n = 5;
        printPattern(n);
    }
    public static void printPattern (int n) {
        int i, j;
        int result = factorial(n);
        for (i = n; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(result + " ");
            }
            result--;
            System.out.println();
        }
    }
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}