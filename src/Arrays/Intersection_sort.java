package Arrays;
import java.util.HashSet;
public class Intersection_sort {
    public static void main(String[] args) {
        int [] array = {3,5,6,9,6};
        int [] array1 = {6,4,9,8,3};
        HashSet<Integer> set = new HashSet<>();
        for(int element : array1){
            set.add(element);
        }
        HashSet<Integer> Intersection_sort = new HashSet<>();
        for(int element : array){
            if(set.contains(element))
                Intersection_sort.add(element);
        }
        System.out.println(Intersection_sort);
    }
}