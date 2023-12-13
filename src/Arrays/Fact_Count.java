package Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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
        System.out.println("Enter number Of Total Iterations You want to have");
        int numberOfTotalIterations = sc.nextInt();
        int n;
        int count1;
        List<Integer> factCount = new ArrayList<>();
        //Taking numbers one by one find the factor and then store it in array
        while(0 <= numberOfTotalIterations--){
            System.out.print("Give number to find the count of factor : ");
            n = sc.nextInt();
            count1 = factCount(n);
            factCount.add(count1);
            System.out.println(count1);
        }
        Integer [] ArrayCount = new Integer[factCount.size()];
        ArrayCount = factCount.toArray(ArrayCount);
        System.out.println(Arrays.toString(ArrayCount));
    }
}