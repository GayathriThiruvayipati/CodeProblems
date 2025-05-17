import java.util.HashMap;
import java.util.Map;

public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            indexMap.put(nums2[i], i);
        }

        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int num = nums1[i];
            int indexInNums2 = indexMap.get(num);
            ans[i] = -1; 
            for (int j = indexInNums2 + 1; j < nums2.length; j++) {
                if (nums2[j] > num) {
                    ans[i] = nums2[j];
                    break; 
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        NextGreaterElementI solution = new NextGreaterElementI();
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] result1 = solution.nextGreaterElement(nums1, nums2);
        System.out.println("Test Case 1: " + java.util.Arrays.toString(result1));

        int[] nums3 = {2, 4};
        int[] nums4 = {1, 2, 3, 4};
        int[] result2 = solution.nextGreaterElement(nums3, nums4);
        System.out.println("Test Case 2: " + java.util.Arrays.toString(result2));
    }
}