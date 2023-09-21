public class LCM {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        int lcm = lcm(a, b);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }

    public static int lcm(int a, int b) {
        int gcd = gcd(a, b);
        return (a * b) / gcd;
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