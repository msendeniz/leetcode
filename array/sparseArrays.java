package dataStructures.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class sparseArrays {
    /*
    There is a collection of input strings and a collection of query strings. 
    For each query string, determine how many times it occurs in the list of input strings.
     Return an array of the results.
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY stringList
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        HashMap<String,Integer> map = new HashMap<>();
    // Write your code here
        for(String value : stringList){
            if (!map.containsKey(value)) {
                map.put(value,1);
            }else{
                map.put(value,map.get(value)+1);
            }
        }
        List<Integer> returnList = new ArrayList<>();
        for(String search : queries){
            if(map.containsKey(search)){
                returnList.add(map.get(search));
            }else{
                returnList.add(0);
            }
        }
    return returnList;
    }
}
