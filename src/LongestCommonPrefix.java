public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] inputStrings = {"flower", "flow", "flight", "flock"};
        String commonPrefix = longestCommonPrefix(inputStrings);
        if (!commonPrefix.isEmpty()) {
            System.out.println("The longest common prefix is: " + commonPrefix);
        } else {
            System.out.println("There is no common prefix among the input strings.");
        }
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}