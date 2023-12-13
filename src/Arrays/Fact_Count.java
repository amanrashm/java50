package Arrays;
import java.util.Arrays;
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
        int numberOfTotalIterations = sc.nextInt();
        int n;
        int [] count1;
        //Taking numbers one by one find the factor and then store it in array
        while(0 <= numberOfTotalIterations--){
            System.out.print("Give number to find the count of factor : ");
            n = sc.nextInt();
            count1 = new int[]{factCount(n)};
            System.out.println(Arrays.toString(count1));
        }
    }
}