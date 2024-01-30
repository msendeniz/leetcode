package dataStructures.hashMap;

import java.util.HashMap;

/*
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
Input: s = "leetcode"
Output: 0
 */
public class firstUniqueChar {
    
    public static int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int temp = map.get(s.charAt(i)) + 1;
                map.replace(s.charAt(i), temp);
            }
            else{
                map.put(s.charAt(i),1);
            }
            
        }
        for(int i=0; i<s.length(); i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
public static void main(String[] args) {
    String s = "aabb";
    System.out.println(firstUniqChar(s));
}
}
