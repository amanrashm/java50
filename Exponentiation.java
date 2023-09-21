public class Exponentiation {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 5;
        double result = exponentiate(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }

    public static double exponentiate(int base, int exponent) {
        return Math.pow(base, exponent);
    }
}