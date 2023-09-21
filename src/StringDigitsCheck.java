public class StringDigitsCheck {
    public static void main(String[] args) {
        String str = "12345";
        boolean containsOnlyDigits = containsOnlyDigits(str);
        if (containsOnlyDigits) {
            System.out.println(str + " contains only digits.");
        } else {
            System.out.println(str + " contains non-digit characters.");
        }
    }
    public static boolean containsOnlyDigits(String str) {
        return str.matches("\\d+");
    }
}