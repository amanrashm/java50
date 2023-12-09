package Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Find_Words_Containing_Character {
    public List<Integer> findWordsContaining(String[] words, char x) {
        return IntStream.range(0, words.length).filter(i -> words[i].indexOf(x) != -1).boxed().collect(Collectors.toList());
    }
    public static void main(String[] args) {
        Find_Words_Containing_Character wordFinder = new Find_Words_Containing_Character();
        String[] example1 = {"leet", "code"};
        char x1 = 'e';
        List<Integer> result1 = wordFinder.findWordsContaining(example1, x1);
        System.out.println("Example 1: " + result1);

        String[] example2 = {"abc", "bcd", "aaaa", "cbc"};
        char x2 = 'a';
        List<Integer> result2 = wordFinder.findWordsContaining(example2, x2);
        System.out.println("Example 2: " + result2);

        String[] example3 = {"abc", "bcd", "aaaa", "cbc"};
        char x3 = 'z';
        List<Integer> result3 = wordFinder.findWordsContaining(example3, x3);
        System.out.println("Example 3: " + result3);
    }
}