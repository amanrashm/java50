public class GCD {
    public static void main(String[] args) {
        int a = 24;
        int b = 36;
        int gcd = gcd(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}