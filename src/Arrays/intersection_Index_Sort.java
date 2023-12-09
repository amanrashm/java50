package Arrays;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class intersection_Index_Sort {
    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }
        int count1 = 0;
        int count2 = 0;
        for (int num : nums1) {
            if (set2.contains(num)) {
                count1++;
            }
        }
        for (int num : nums2) {
            if (set1.contains(num)) {
                count2++;
            }
        }
        return new int[]{count1, count2};
    }
    public static void main(String[] args) {
        int[] nums1 = {4, 3, 2, 3, 1};
        int[] nums2 = {2, 2, 5, 2, 3, 6};
        int[] counts = findIntersectionValues(nums1, nums2);
        System.out.println(Arrays.toString(counts));
    }
}