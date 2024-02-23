package dataStructures.hashMap;

import java.util.Arrays;
import java.util.HashSet;

/*
Given two integer arrays nums1 and nums2, return an array of their intersection. 
Each element in the result must be unique and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted. */
public class intersectOfArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> intersect = new HashSet<>();
        for(int key: nums1){
            hs.add(key);
        }

        for(int key2 : nums2){
            if(hs.contains(key2)){
                intersect.add(key2);
            }
        }

        int[] result = new int[intersect.size()];
        int i=0;
        for(int num : intersect){
            result[i++] = num;
        }
        return result;    
    }

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
}
