public class PowerCalculation {
    public static void main(String[] args) {
        double base = 2.0;
        int exponent = 3;
        double result = power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }

    public static double power(double base, int exponent) {
        return Math.pow(base, exponent);
    }
}