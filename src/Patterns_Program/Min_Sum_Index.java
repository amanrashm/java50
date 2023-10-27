package Patterns_Program;
import java.util.Vector;

public class Min_Sum_Index {
    public int minimumSum(Vector<Integer> nums) {
        int n = nums.size();
        int minSum = Integer.MAX_VALUE;

        for (int i = 1; i < n - 1; ++i) {
            int leftMax = -1, rightMax = -1;

            for (int j = 0; j < i; ++j) {
                if (nums.get(j) < nums.get(i)) {
                    leftMax = Math.max(leftMax, nums.get(i));
                }
            }

            for (int k = i + 1; k < n; ++k) {
                if (nums.get(k) < nums.get(i)) {
                    rightMax = Math.max(rightMax, nums.get(k));
                }
            }

            if (leftMax != -1 && rightMax != -1) {
                minSum = Math.min(minSum, leftMax + nums.get(i) + rightMax);
            }
        }

        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }

    public static void main(String[] args) {
        Vector<Integer> nums = new Vector<>();
        nums.add(5);
        nums.add(4);
        nums.add(8);
        nums.add(7);
        nums.add(10);
        nums.add(2);

        Min_Sum_Index solution = new Min_Sum_Index();
        int result = solution.minimumSum(nums);

        if (result == -1) {
            System.out.println("No mountain triplets found.");
        } else {
            System.out.println("Minimum Sum: " + result);
        }
    }
}