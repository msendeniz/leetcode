package dataStructures.hashMap;
/* 
Given two arrays of strings list1 and list2, find the common strings with the least index sum.
A common string is a string that appeared in both list1 and list2.
A common string with the least index sum is a common string such that if 
it appeared at list1[i] and list2[j] then i + j should be the minimum value among all the other common strings.
Return all the common strings with the least index sum. Return the answer in any order.
Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], 
       list2 = ["KFC","Shogun","Burger King"]
Output: ["Shogun"]
Explanation: The common string with the least index sum is "Shogun" with index sum = (0 + 1) = 1.
*/

import java.util.ArrayList;
import java.util.HashMap;

public class MinimumIndexSumofLists {
    public String[] findRestaurant(String[] list1, String[] list2) {

        HashMap<String,Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        int minVal = Integer.MAX_VALUE; 
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }

        for(int i=0;i<list2.length;i++){
            if(map.containsKey(list2[i])){
               int temp = i + map.get(list2[i]);
               if(temp < minVal ){
                list.clear();
                list.add(list2[i]);
                minVal = temp;
               }else if(temp == minVal){
                    list.add(list2[i]);
               }
            }
        }
    return list.toArray(new String[list.size()]);     
    }

}
