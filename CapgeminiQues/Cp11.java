/*
 * Longest Substring Without Repeating Characters:
Problem : Given a string, find the length of the longest substring without 
repeating characters.
 Input:
 String: "abcabcbb"
 Output: 3
 Explanation: The longest substring is "abc" , which has a length of 3
 */



package CapgeminiQues;

import java.util.HashSet;
import java.util.Scanner;

public class Cp11 {
    //method
    private static int substringLength(String str){
        HashSet<Character> set = new HashSet<>();
        int start =0; 
        int maxLength =0;
        //expanding the window -> Sliding Window Technique
        for(int end =0; end<str.length(); end++){
            char ch = str.charAt(end);
            //if character is already present shrink the windpw.
            while(set.contains(ch)){
                set.remove(str.charAt(start));
                start++;
            }
            //adding current character to Set and updating MaxLength.
            set.add(ch);
            maxLength = Math.max(maxLength, end-start+1);
        }
        return maxLength;
        
    }
    //main
    public static void main(String[] args) {
        Scanner ip = new Scanner (System.in);
        System.out.println("String: ");
        String str  = ip.nextLine();
        System.out.println(substringLength(str));
        ip.close();
    }
    
}
