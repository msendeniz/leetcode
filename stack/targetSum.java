package dataStructures.stack;

import java.util.HashMap;
import java.util.Map;

public class targetSum {
    public int findTargetSumWays(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, 1);

        for(int num :nums){
            HashMap<Integer,Integer> next = new HashMap<>();


            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                int sum = entry.getKey();
                int count = entry.getValue();

                next.put(sum+num, next.getOrDefault(sum+num, 0)+count);
                next.put(sum-num, next.getOrDefault(sum-num, 0)+count);
            }
            map = next;

        }

        return map.getOrDefault(target, 0);
    }
}
