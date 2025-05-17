import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        
        for (int num : nums) {
            if (set.contains(num)) {
                result[0] = num; 
            } else {
                set.add(num);
                actualSum += num;
            }
        }
        result[1] = expectedSum - actualSum; 
        return result;
    }

    public static void main(String[] args) {
        SetMismatch solution = new SetMismatch();
        
        int[] nums1 = {1, 2, 2, 4};
        int[] result1 = solution.findErrorNums(nums1);
        System.out.println("Test Case 1: " + Arrays.toString(result1)); 
        
        int[] nums2 = {1, 1};
        int[] result2 = solution.findErrorNums(nums2);
        System.out.println("Test Case 2: " + Arrays.toString(result2)); 
        
    
    }
}