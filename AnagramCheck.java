public class AnagramCheck {
    public static void main (String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean areAnagrams = areAnagrams(str1, str2);
        if (areAnagrams) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
    public static boolean areAnagrams (String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        for (char c : str1.toCharArray()) {
            count1[c - 'a']++;
        }
        for (char c : str2.toCharArray()) {
            count2[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        return true;
    }
}