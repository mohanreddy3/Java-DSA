/*
 * Sum of Unique Digits
Write a function to find the sum of unique digits in a given number N. The number will be passed to the 
function as an input parameter of type int.
Assumption: The input number will be a positive integer >= 1 and <= 25000.
Examples:
• If the given number is 292, the function should return 9 because the unique digit '9' in this 
number has a sum of 9.
• If the given number is 1015, the function should return 6 because the unique digits '1', '0', and 
'5' in this number have a sum of 1 + 0 + 5 = 6.
• If the given number is 108, the function should return 9 because the unique digits '1', '0', and '8' 
in this number have a sum of 1 + 0 + 8 = 9.
• If the given number is 22, the function should return 0 because there are NO unique digits in this 
number.
 */
package Cognizant_Problems;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();
        System.out.println("Sum of Unique Digits: " + sumOfUniqueDigits(num));
        ip.close();
    }
    //Function
    public static int sumOfUniqueDigits(int num){
        //create an array to store number as digits.
        int Array[] = new int[10];
        // convert Number to String.
        String str = Integer.toString(num);
        //loop(To find Frequency of Digits).
        for(char digitCount : str.toCharArray()){
            int digit = digitCount - '0'; //char to numbers
            Array[digit]++;
        }
        //loop(to find UniqueSum)
        int UniqueSum =0;
        for(int digit =0; digit<Array.length; digit++){
            if(Array[digit] == 1){
                UniqueSum += digit;
            }
        }
        return UniqueSum;
    }
    
}
