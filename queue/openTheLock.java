package dataStructures.queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class openTheLock {
    public int openLock(String[] deadends, String target) {
        HashSet<String> deadEnds = new HashSet<>(Arrays.asList(deadends));
        HashSet<String> visited = new HashSet<>();
        visited.add("0000");

        Queue<String> queue = new LinkedList();
        queue.offer("0000");
        
        int depth=0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for(int i=0;i<size;i++){
                String current = queue.poll();
                if (current.equals(target)) {
                    return depth;
                }
            List<String> neighbors = getNeighbors(current);
            for(String neighbor : neighbors){
                if(!visited.contains(neighbors) && !deadEnds.contains(neighbor)){
                    queue.offer(neighbor);
                    visited.add(neighbor);
                }
            }

            }
            depth++;
        }

        return -1;
    }

     List<String> getNeighbors(String s) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            char[] chars = s.toCharArray();
            char ch = chars[i];
            chars[i] = ch == '9' ? '0' : (char)(ch + 1);
            result.add(new String(chars));
            
            chars[i] = ch == '0' ? '9' : (char)(ch - 1);
            result.add(new String(chars));
        }
        return result;
    }
}
