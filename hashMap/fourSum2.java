package dataStructures.hashMap;

import java.util.HashMap;

/*
Given four integer arrays nums1, nums2, nums3, and nums4 all of length n,
 return the number of tuples (i, j, k, l) such that:
0 <= i, j, k, l < n
nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0
Input: nums1 = [1,2], nums2 = [-2,-1], nums3 = [-1,2], nums4 = [0,2]
Output: 2
Explanation:
The two tuples are:
1. (0, 0, 0, 1) -> nums1[0] + nums2[0] + nums3[0] + nums4[1] = 1 + (-2) + (-1) + 2 = 0
2. (1, 1, 0, 0) -> nums1[1] + nums2[1] + nums3[0] + nums4[0] = 2 + (-1) + (-1) + 0 = 0
 */
public class fourSum2 {
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                int sum = nums1[i] + nums2[j];
                if(map.containsKey(nums1[i]+nums2[j])){
                    int temp = map.get(sum);
                    map.put(sum, temp+1);
                }else{
                    map.put(sum,1);
                }
            }
        }
        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums4.length; j++) {
                int target = -(nums4[j]+nums3[i]);
                if(map.containsKey(target)){
                    count += map.get(target);
                }
            }
        }
        return count;
    }
     
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {-2,-1};
        int[] nums3 = {-1,2};
        int[] nums4 = {0,2};

        int[] nums11 = {-1,-1};
        int[] nums12 = {-1,1};
        int[] nums13 = {-1,1};
        int[] nums14 = {1,-1};


        System.out.println(fourSumCount(nums1, nums2, nums3, nums4));
        System.out.println(fourSumCount(nums11, nums12, nums13, nums14));


    }
}
