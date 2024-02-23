package dataStructures.hashMap;

import java.util.HashSet;

/*Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), 
or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

Example 1
Input: n = 19
Output: true


  */
public class happyNumber {
    public static boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<>();
        while(true){
            n = numSquareSum(n);
            if(n==1){
                return true;
            }
            if(hs.contains(n))
                return false;

            hs.add(n);        
        }
    }

    static int numSquareSum(int n){
        int squareSum = 0;
        while(n != 0){
            squareSum += (n%10) * (n%10);
            n /= 10;
        }
        return squareSum;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
}
