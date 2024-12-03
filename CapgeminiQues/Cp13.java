/*
 * Check if a Number is Prime:
 Problem: Write a function to check if a given number is prime.
 Input:
 Number: 29
 Output: True
 Explanation: 29 is a prime number.
 */
package CapgeminiQues;

import java.util.Scanner;

public class Cp13 {
    //method
    private static boolean checkPrime(int num){
        int count =0;
        for(int i=1; i<=num; i++){
            if(num%i == 0){
                count++;
            }
        }
        if(count == 2){
            return true;
        }
        return false;
    }
    //main
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Number: ");
        int num = ip.nextInt();
        System.out.println(checkPrime(num));
        ip.close();
    }
    
}
