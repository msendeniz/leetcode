package dataStructures.hashMap;
/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 */

import java.util.HashSet;

class Solution {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(Integer key : nums){
            if(hs.contains(key)){
                return true;
            }
            hs.add(key);    
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int[] nums2 = {1,2,3,4};
        int[] nums3 = {1,1,1,3,3,4,3,2,4,2};

        System.out.println(containsDuplicate(nums));
        System.out.println(containsDuplicate(nums2));
        System.out.println(containsDuplicate(nums3));
    }
}