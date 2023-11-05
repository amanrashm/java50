public class Palindrome {
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Remove non-alphanumeric characters and convert to lowercase
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String aman  = "eye";
        if(isPalindrome(aman))
            System.out.println(aman + " " + "Is Palindrome ");
        else
            System.out.println(aman + " " + "Not a Palindrome");
    }
}
