package dataStructures.queue;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

import javax.xml.namespace.QName;

public class perfectSquares {
    public int numSquares(int n) {
     int[] squares = new int[(int) (Math.sqrt(n)+1)];
     for(int i=1;i*i <= n ;i++){
        squares[i] = i*i;
     }

     Queue<int[]> queue = new ArrayDeque<>();
     queue.offer(new int[]{n,0});

     Set<Integer> visited = new HashSet<>(); // 
     while (!queue.isEmpty()) {
        int[] current = queue.poll();
        int num = current[0];
        int steps = current[1];
        for(int square : squares){
            if(num==square){
                return steps+1;
            }else if(num < square){
                break;
            }else if(!visited.contains(num-square)){
                visited.add(num-square);
                queue.offer(new int[]{num-square,steps+1});
            }
        }
     }
     return -1;  
    }
    
}
