//Problem: Given a string, calculate the sum of numbers in a string
//  (multiple consecutive digits are considered one number)
// Example 1:
// Input: string = “123xyz”
// Output: 123
// Example 2:
// Input: string = “1xyz23”
// Output: 24
package TCS_NQT.String_pblms;

import java.util.Scanner;

public class S9 {
    //method
    private static void sumOfNum(String str){
        int n = str.length();
        String tempSum = "0"; // to store digits(as a String) which can be converted as Integer later. 
        int sum =0;           // to store the sum of numbers in a given string.
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){ //to check whether character is a Digit.
                tempSum += ch;         // Append the digit to tempSum to form the number (as string)
            }
            else{   // If the character is not a digit
                sum += Integer.parseInt(tempSum);  // Convert tempSum to integer and add to sum
                tempSum ="0";                      // Reset tempSum to "0" for the next number
            }   
        }
        System.out.println(sum + Integer.parseInt(tempSum));   // After the loop, add the last number in tempSum (if any)
    }
    //main
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = ip.nextLine();
        sumOfNum(str);
        ip.close();
    }
    
}
