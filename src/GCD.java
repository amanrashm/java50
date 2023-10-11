public class GCD {
    public static void main(String[] args) {
        int a = 24;
        int b = 36;
        int gcd = gcd(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
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

/*
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        String[] str = { "tiger", "tiger", "cat", "dog", "lion", "lion" };
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
}
*/


/*
import java.util.*;

class HelloWorld {
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
*/

/*
"Java enthusiast and recent graduate, driven by a love for elegant code and a strong desire to contribute to innovative software solutions. Ready to excel in Java development. #JavaFresher #PassionForCode"
*/

/*

public class ArrayCopyOfDemo {
    public static void main(String[] args) {
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };

        String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }
    }
}*/
