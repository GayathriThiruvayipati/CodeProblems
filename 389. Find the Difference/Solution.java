import java.util.*;
 
class Solution {
    public char findTheDifference(String s, String t){
        char added_char = 0;
        for(int i=0; i<s.length(); i++){
            added_char ^= s.charAt(i);
        }
        for(int j=0; j<t.length(); j++){
                added_char ^= t.charAt(j);
            }
        return added_char;
    }

    public static void main(String[] args){
	Solution solution = new Solution();
	System.out.println(solution.findTheDifference("abcd","abcde"));
        System.out.println(solution.findTheDifference("","y"));
    }
}