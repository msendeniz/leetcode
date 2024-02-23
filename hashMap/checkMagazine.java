package dataStructures.hashMap;

import java.util.HashMap;
import java.util.List;
    /*
     * Complete the 'checkMagazine' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY magazine
     *  2. STRING_ARRAY note
     */
public class checkMagazine {
   

        public static void checkMagazine(List<String> magazine, List<String> note) {
        // Write your code here
        HashMap<String,Integer> map = new HashMap<>();
        
        for(String word : magazine){
            if(!map.containsKey(word)){
                map.put(word, 1);
            }else{
                int temp = map.get(word);
                map.put(word,temp+1);
            }
        }

        for(String word: note){
            if(!map.containsKey(word) || map.get(word)==0){
                System.out.println("No");
                return;
            }

            map.put(word, map.get(word) - 1);
        }

        System.out.println("Yes");

    }
    public static void main(String[] args) {
        List<String> magazine = List.of("give", "me", "one", "grand", "today", "night");
        List<String> note = List.of("give", "one", "grand", "today");

        checkMagazine(magazine, note);
    }
}