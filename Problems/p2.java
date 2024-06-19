// Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
// For example, if the input is 12345, the output should be 54321.
package Problems;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
         System.out.println("Enter the number:");
         Scanner ip = new Scanner (System.in);
         int num = ip.nextInt();
         System.out.println("The Reversed number is:");
         Reverse_Num(num);
         ip.close();
         
    }
    //  Function for Reversing an Integer. 
    public static void Reverse_Num(int num){
        int revNum = 0;
        while ( num !=0){
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num = num /10;
        }
        System.out.print(revNum);
    }
    
}
