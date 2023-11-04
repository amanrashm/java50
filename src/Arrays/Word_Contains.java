package Arrays;

import java.util.HashMap;
/*
public class Word_Contains {
    public static void main(String[] args) {
        String[] str = {"tiger", "tiger", "cat", "dog", "lion", "lion"};
        int[] counts = new int[str.length];
        for (int i = 0; i < counts.length; i++) {
            counts[i] = 1;
        }
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    counts[i]++;
                    counts[j] = 0;
                }
            }
        }
        for (int i = 0; i < str.length; i++) {
            if (counts[i] != 0) {
                System.out.println(str[i] + ": " + counts[i]);
            }
        }
    }
}*/

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
public class Word_Contains {
    public static void main(String[] args) {
        String[] str = {"tiger", "tiger", "cat", "dog", "lion", "lion"};
        Map<String, Long> wordCounts = Arrays.stream(str)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        wordCounts.forEach((word, count) -> System.out.println(word + ": " + count));
    }
}