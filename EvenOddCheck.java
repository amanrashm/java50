public class EvenOddCheck {
    public static void main(String[] args) {
        int num = 7;
        if (isEven(num)) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}