package Arrays;

import java.util.HashSet;

public class Unique_element {
    public static void main(String[] args) {

        int[] array = {3, 5, 6, 9, 6};

        HashSet<Integer> Intersection_sort = new HashSet<>();

        for (int element : array) {
            Intersection_sort.add(element);
        }
        System.out.println(Intersection_sort);
    }
}
