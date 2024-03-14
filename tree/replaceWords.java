package dataStructures.tree;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
/*
In English, we have a concept called root, which can be followed by some other word to form another longer word - let's call this word successor. 
For example, when the root "an" is followed by the successor word "other", we can form a new word "another".

Given a dictionary consisting of many roots and a sentence consisting of words separated by spaces,
replace all the successors in the sentence with the root forming it. If a successor can be replaced by more than one root, 
replace it with the root that has the shortest length.

Return the sentence after the replacement.

 


 */
class Trie{
    
}
public class replaceWords {
    public static String replaceWords(List<String> dictionary, String sentence) {
        
        HashSet<String> set = new HashSet<>(dictionary);
        StringBuilder resultString  = new StringBuilder();

        String[] words = sentence.split("\\s+");
        for(String word:words){
            String prefix = "";
            for(int i=1;i<word.length();i++){
                prefix = word.substring(0, i);
                if(set.contains(prefix)){
                    break;
                }
            }

            if(resultString.length()>0){
                resultString.append(" ");
            }

            resultString.append(set.contains(prefix) ? prefix : word);
        }

    return resultString.toString();
    }

    public static void main(String[] args) {
        List<String> roots = Arrays.asList("cat", "bat", "rat");
        String sentence = "the cattle was rattled by the battery";
        System.out.println(replaceWords(roots, sentence));
    }
}
