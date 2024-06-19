/*
 * Non-Repeated Digits Count
Write a function to find the count of non-repeated digits in a given number N. The number will be 
passed to the function as an input parameter of type int.
Assumption: The input number will be a positive integer number >= 1 and <= 25000.
Some examples are as below -
If the given number is 292, the function should return 1 because there is only 1 non-repeated digit '9' in 
this number
 */

package Cognizant_Problems;

import java.util.Scanner;

public class pr1 {
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();
        System.out.println("No of Non Repeated Digits are :" + nonRepeatedDigitCount(num));
        ip.close();
    }


    public static int nonRepeatedDigitCount(int num){
        //Create an Array
        int Array [] = new int[10];
        //convert numbers to string 
        String str = Integer.toString(num);
        //loop(Find DigitCount)
        for(char DigitCount : str.toCharArray()){
            int Digit = DigitCount - '0';
            Array[Digit]++;
        }
        //loop(Find the Frequency of NonRepeatedCount)
        int NonRepeatedCount =0;
        for(int freq : Array){
            if(freq == 1){
                NonRepeatedCount++;
            }
        }
        return NonRepeatedCount;

    }
    
}
