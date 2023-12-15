package Arrays;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Fact_Count {
    /*public static int[] factCount(int[] nums) {
        int nlen = nums.length;
        int[] count1 = new int[nums.length];
        for (int i = 0; i < nlen; i++) {
            int count = 0;
            for (int j = 1; j <= nums[i]; j++) {
                if (nums[i] % j == 0) {
                    count += 1;
                }
            }
            count1[i] = count;
        }
        return count1;
    }*/
    public static int factCount(int nums){
        int count =0;
        for(int i = 1; i <= nums; i++){
            if(nums % i == 0){
                count+=1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        //int[] n = {28, 26, 13, 17, 18};
        //int[] count1 = factCount(n);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of total iterations you want to have: ");
        int numberOfTotalIterations = sc.nextInt();
        int n;
        List<Integer> numbers = new ArrayList<>();
        List<Integer> indices;
        List<Integer> factCount = new ArrayList<>();
        List<Integer> sortedNumber;
        // Taking numbers one by one and calculating their factor counts
        while (numberOfTotalIterations-->= 0) {
            System.out.print("Give number to find the count of factor: ");
            n = sc.nextInt();
            numbers.add(n);
            int count1 = factCount(n);
            factCount.add(count1);
            System.out.println(count1);
        }
        System.out.println("Unsorted Numbers: " + numbers);
        System.out.println("Unsorted Factor : " + factCount);
        indices = IntStream.range(0, numbers.size()).boxed().sorted(Comparator.comparingInt(factCount::get)).collect(Collectors.toList());
        sortedNumber = indices.stream().mapToInt(index -> index).mapToObj(numbers::get).collect(Collectors.toList());
        System.out.println("Sorted Numbers: " + sortedNumber);
        Collections.sort(factCount);
        System.out.println("Sorted Factor : " +factCount);
    }
}