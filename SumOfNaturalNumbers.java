public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int n = 10;
        int sum = sumOfNaturalNumbers(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
    public static int sumOfNaturalNumbers(int n) {
        return (n * (n + 1)) / 2;
    }
}