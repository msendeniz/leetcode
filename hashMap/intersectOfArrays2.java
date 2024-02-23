package dataStructures.hashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*
Given two integer arrays nums1 and nums2, return an array of their intersection.
 Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
 */
public class intersectOfArrays2 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
          return intersect(nums2, nums1);      
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                int temp = map.get(nums1[i]);
                map.put(nums1[i],temp+1);
            }else{
                map.put(nums1[i],1);

            }
        }
        System.out.println("Map:");
        for (int key: map.keySet()) {
            int value = map.get(key);
            System.out.println(key + " " + value);
        }
        
        for(int num : nums2){
            
            if(map.containsKey(num)){
                int freq = map.get(num);
                if(freq > 0){
                    list.add(num);
                    map.put(num, freq-1);
                }
            }
            
        }

        int[] result = new int[list.size()];
        int i =0;
        for(int num : list){
            result[i++] = num;
        }
        
return result;      
    }

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        int[] nums3 = {1,2,2,1};
        int[] nums4 = {2,2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
        System.out.println(Arrays.toString(intersect(nums3, nums4)));

    }
}
