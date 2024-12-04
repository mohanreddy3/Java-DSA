/*
 * Check for Balanced Parentheses:
 Problem: Given a string containing just the characters  ( , ), {, }, [ and ],
  determine if the input string is valid.
 Input:
 String: "{[()]}"
 Output: True
 Explanation: The string has balanced parentheses.
 */

package CapgeminiQues;

import java.util.Scanner;

public class Cp16 {
    //method
    private static boolean checkBalance(String str){
        for(int i=0; i<(str.length()/2) ; i++){
            for(int j=(str.length()/2)+1; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    return true;
                }
            }
        }
        return false;
    }
    //main
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String str = "{[()]}";
     System.out.println(checkBalance(str));
     ip.close();
    }
    
}
