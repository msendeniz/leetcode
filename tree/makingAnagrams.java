package dataStructures.stringManipulation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class makingAnagrams {
    /*
    A student is taking a cryptography class and has found anagrams to be very useful. 
    Two strings are anagrams of each other if the first string's letters can be rearranged to form the second string. In other words, 
    both strings must contain the same exact letters in the same exact frequency.
     For example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.

The student decides on an encryption scheme that involves two large strings.
 The encryption is dependent on the minimum number of character deletions required to make the two strings anagrams. Determine this number.

Given two strings,  and , that may or may not be of the same length, determine the minimum number of character deletions required to make  and  anagrams. 
Any characters can be deleted from either of the strings.
     * Complete the 'makeAnagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING a
     *  2. STRING b
     */

    public static int makeAnagram(String a, String b) {
        // Write your code here
    HashMap<Character,Integer> map = new HashMap<>();
    HashMap<Character,Integer> map2 = new HashMap<>();

    int counter=0;
    char[] arrayA = a.toCharArray();
    char[] arrayB = b.toCharArray();

    for(Character ch : arrayA){
        if(!map.containsKey(ch)){
            map.put(ch, 1);
        }else{
            int temp = map.get(ch);
            map.put(ch, temp+1);
        }
    }

    for(Character ch : arrayB){
        if(!map2.containsKey(ch)){
            map2.put(ch, 1);
        }else{
            int temp = map2.get(ch);
            map2.put(ch, temp+1);
        }
    }
    int deletions = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int freqA = map.getOrDefault(ch, 0);
            int freqB = map2.getOrDefault(ch, 0);
            deletions += Math.abs(freqA - freqB);
        }

    return deletions;
    }
}
