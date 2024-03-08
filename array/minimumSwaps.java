package dataStructures.array;

import java.util.Arrays;
import java.util.HashMap;

/*
You are given an unordered array consisting of consecutive integers  [1, 2, 3, ..., n] without any duplicates.
 You are allowed to swap any two elements. Find the minimum number of swaps required to sort the array in ascending order.
 */
public class minimumSwaps {
    static int minimumSwaps(int[] arr) {
        int swaps=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] temp = new int[arr.length];
        temp = Arrays.copyOf(arr, arr.length);
        Arrays.sort(temp);
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }

        for(int i=0;i<arr.length;i++){
            if(temp[i] != arr[i]){
                swaps++;
                int temp2= arr[i];
                swap(arr,i,map.get(temp[i]));


                map.put(temp2,map.get(temp[i]));
                map.put(temp[i],i);
            }
        }

        return swaps;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {7,1,3,2,4,5,6};
        System.out.println(minimumSwaps(arr));
    }
}
