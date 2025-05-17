import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        int maxLength = 0;
        
        for (int num : frequencyMap.keySet()) {
            if (frequencyMap.containsKey(num + 1)) {
                int currentLength = frequencyMap.get(num) + frequencyMap.get(num + 1);
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
            }
        }
        
        return maxLength;
    }
    public static void main(String[] args) {
        LongestHarmoniousSubsequence solution = new LongestHarmoniousSubsequence();
        
        int[] nums1 = {1, 3, 2, 2, 5, 2, 3, 7};
        System.out.println("Test Case 1: " + solution.findLHS(nums1));
        
        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Test Case 2: " + solution.findLHS(nums2)); 
    }
}