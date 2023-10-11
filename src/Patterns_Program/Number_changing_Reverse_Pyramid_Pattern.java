package Patterns_Program;

public class Number_changing_Reverse_Pyramid_Pattern {
    public static void main (String args[]) {
        int n = 5;
        printPattern(n);
    }
    public static void printPattern (int n) {
        int i, j;
        for (i = n; i >=1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
