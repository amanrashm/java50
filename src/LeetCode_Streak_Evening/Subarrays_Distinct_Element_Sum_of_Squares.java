package LeetCode_Streak_Evening;
import java.lang.*;

public class Subarrays_Distinct_Element_Sum_of_Squares {
    public static void main (String [] args){
        int[] nums = {1, 2, 1};
        int len=nums.length-1;
        for(int i = 0; i<=len;i++){
            for(int j =i+1; j<=len;j++){
                System.out.println(nums[i]);
            }
        }
    }
}