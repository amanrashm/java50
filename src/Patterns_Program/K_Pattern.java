package Patterns_Program;
public class K_Pattern {
    public static void main (String[] args) {
        int n = 3;
        printPattern(n);
    }
    public static void printPattern (int n) {
        int i, j;
        int result = factorial(n);
        for (i = result; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(result + " ");
            }
            n++;
            System.out.println();
        }
        for (i = 2; i <= result; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(result + " ");
            }
            n++;
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
    /*    for (i = n; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 2; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    */

