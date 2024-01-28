package dataStructures.hashMap;

import java.util.Arrays;
import java.util.HashMap;

/*
Given a string s, find the length of the longest substring without repeating characters.
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
 */
public class longestSubstringWRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int right=0,left=0; right < s.length() ; right++){
            char current = s.charAt(right);
            if(map.containsKey(current) && map.get(current) >= left){
                left = map.get(current) + 1;
            }
            max = Math.max(max , right-left+1);
            map.put(current,right);
        }
        return max;    
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
