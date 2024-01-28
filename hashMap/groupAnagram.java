package dataStructures.hashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
Given an array of strings strs, group the anagrams together. You can return the answer in any order.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 typically using all the original letters exactly once.
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 */
public class groupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String word = strs[i]; 
            if(!map.containsKey(word)){
                char[] letterArr = word.toCharArray();
                Arrays.sort(letterArr);
                String sortedWord = new String(letterArr);
                if(map.containsKey(sortedWord)){
                    List<String> tempList = map.get(sortedWord);
                    tempList.add(word);
                }else{
                    List<String> words = new ArrayList<>();
                    words.add(word);
                    map.put(sortedWord,words);
                }
            }
        }
        
    return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}
