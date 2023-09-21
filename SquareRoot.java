public class SquareRoot {
    public static void main(String[] args) {
        double num = 16.0;
        double squareRoot = calculateSquareRoot(num);
        System.out.println("Square root of " + num + " is: " + squareRoot);
    }

    public static double calculateSquareRoot(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Square root is not defined for negative numbers.");
        }
        return Math.sqrt(num);
    }
}