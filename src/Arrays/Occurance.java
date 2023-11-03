package Arrays;

import java.util.*;

class Occurance {
    public static void main(String[] args) {
        String[] str = { "tiger", "tiger", "cat", "dog", "lion", "lion" };
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : str) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        for (String word : wordCount.keySet()) {
            int count = wordCount.get(word);
            System.out.println(word + ": " + count);
        }
    }
}