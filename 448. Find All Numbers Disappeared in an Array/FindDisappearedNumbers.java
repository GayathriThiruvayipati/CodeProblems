import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            int index = Math.abs(num) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        FindDisappearedNumbers solution = new FindDisappearedNumbers();
        
        // Test Case 1
        int[] nums1 = {4,3,2,7,8,2,3,1};
        System.out.println("Test Case 1: " + solution.findDisappearedNumbers(nums1)); 
        
        // Test Case 2
        int[] nums2 = {1,1};
        System.out.println("Test Case 2: " + solution.findDisappearedNumbers(nums2)); 

    }
}
