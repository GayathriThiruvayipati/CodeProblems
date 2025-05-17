import java.util.*;

class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.equals(word.toUpperCase())) {
            return true;
        }
        if (word.equals(word.toLowerCase())) {
            return true;
        }
        if (word.length() > 0 && 
            Character.isUpperCase(word.charAt(0)) && 
            word.substring(1).equals(word.substring(1).toLowerCase())) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.detectCapitalUse("ggg")); 
        System.out.println(solution.detectCapitalUse("Ggg")); 
        System.out.println(solution.detectCapitalUse("GGG")); 
        System.out.println(solution.detectCapitalUse("gGg"));
        System.out.println(solution.detectCapitalUse("g"));
    }
}