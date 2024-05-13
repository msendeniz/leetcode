package dataStructures.stack;
import java.util.Stack;
/*
Given an encoded string, return its decoded string.
The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. 
Note that k is guaranteed to be a positive integer.
You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. 
Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k.
 For example, there will not be input like 3a or 2[4].
The test cases are generated so that the length of the output will never exceed 105.
 */
public class decodeString {
    public static String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<Character> charStack = new Stack<>();
        int count=0;
        String result="",temp="";

        for(int i=0;i<s.length();i++){
            count=0;
            if(Character.isDigit(s.charAt(i))){
                count = 0;
                
                while(Character.isDigit(s.charAt(i))){
                    count = count*10  + s.charAt(i) - '0';
                    i++;
                }
                numStack.push(count);
                i--;
            }
            else if(s.charAt(i)==']'){
                temp="";
                count=0;
                if(!numStack.isEmpty()){
                    count = numStack.peek();
                    numStack.pop();
                }
                while(!charStack.isEmpty() && charStack.peek() != '['){
                    temp = charStack.peek() + temp;
                    charStack.pop();
                }
                if(!charStack.isEmpty() && charStack.peek() == '['){
                    charStack.pop();
                }    
                    for(int j=0;j<count;j++){
                        result = temp + result;
                    }

                    for(int j=0;j<result.length();j++){
                        charStack.push(result.charAt(j));
                    }
                    result="";
                
            }
            else if(s.charAt(i)=='['){
                if(Character.isDigit(s.charAt(i-1))){
                    charStack.push(s.charAt(i));
                }else{
                    charStack.push(s.charAt(i));
                    numStack.push(1);
                }
            }else{
                    charStack.push(s.charAt(i));
            }

            
        }
        result="";
        while(!charStack.isEmpty()){
            result =  charStack.pop() + result;
        }

        return result;

    }

    public static void main(String[] args) {
        String s = "10[a]";
        System.out.println(decodeString(s));
    }

}
