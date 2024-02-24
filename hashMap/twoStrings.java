package dataStructures.hashMap;

import java.util.HashSet;

/*
 * Complete the 'twoStrings' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. STRING s1
 *  2. STRING s2
 */
public class twoStrings {
    public static String twoStrings(String s1, String s2) {
        // Write your code here
        HashSet<Character> set = new HashSet<>();

        for(char characters:  s1.toCharArray()){
            if(!set.contains(characters)){
                set.add(characters);
            }
        }

        for(char charac : s2.toCharArray()){
            if(set.contains(charac)){
                return "YES";
            }
        }
    return "NO";
    }
}
