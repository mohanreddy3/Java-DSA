//Problem Statement: Given a string, calculate the frequency of characters in a string.
package TCS_NQT.String_pblms;

import java.util.HashMap;
import java.util.Scanner;

public class S11 {
    //method
    private static void freqOfChars(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch, 1);
            }
        }
        System.out.println(map);
    }
    //main
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = ip.nextLine();
        freqOfChars(str);
        ip.close();
    }
    
}

//TC : O(n)
//SC: O(k) where k is the number of unique characters in the string 
// (because the HashMap stores each unique character and its frequency).

// Alternative Approach: Sort the string and print the consecutive elements count.
