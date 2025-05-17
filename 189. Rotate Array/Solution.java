import java.util.*;
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; 
        
        reverse(nums, 0, n - 1); 
        reverse(nums, 0, k - 1); 
        reverse(nums, k, n - 1); 
    }
    
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args){
	Solution solution = new Solution();

        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        solution.rotate(nums1, 3);
        System.out.println("Test case 1: " + Arrays.toString(nums1));
        

        int[] nums2 = {-1, -100, 3, 99};
        solution.rotate(nums2, 2);
        System.out.println("Test case 2: " + Arrays.toString(nums2));
    }
}