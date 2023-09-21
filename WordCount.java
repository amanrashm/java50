public class WordCount {
    public static void main(String[] args) {
        String str = "This is a sample sentence."; // Change the string as needed
        int wordCount = countWords(str);
        System.out.println("Number of words in the string: " + wordCount);
    }
    public static int countWords(String str) {
        String[] words = str.split("\\s+");
        return words.length;
    }
}