package Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sort012 {
    public static boolean sort012(List<Integer> arr) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(arr);
        ans.stream().sorted();
        return true;
    }
    public static void main(String[] args) {
        List<Integer> n = Arrays.asList(0,2,1,0,2,2,1,0);
        System.out.println(sort012(n));
    }
}
