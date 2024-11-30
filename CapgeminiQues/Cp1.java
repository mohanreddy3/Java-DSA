/*
 * Questions 1 Problem Statement – Bela teaches her daughter to find the factors of a given number. 
 * When she provides a number to her daughter, she should tell the factors of that number. 
 * Help her to do this, by writing a program. Write a class FindFactor.java and write the main method in it.
Note :
If the input provided is negative, ignore the sign and provide the output.
If the input is zero the output should be “No Factors”.
Sample Input 1:
54
Sample Output 1:
1, 2, 3, 6, 9, 18, 27, 54
Sample Input 2:
-1869
Sample Output 2 :
1, 3, 7, 21, 89, 267, 623, 1869
 */
package CapgeminiQues;

import java.util.Scanner;

public class Cp1 {
    //method
    private static void factorsOfNum(int num){
        //ignoring -ve sign
        num = Math.abs(num);
        //base case
        if(num == 0){
            System.out.println("No Factors");
        }
        //logic
        for( int i=1; i<=num; i++){
            if(num%i == 0){
                System.out.print(i + " ");
            }
        }
    }
    //main
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();
        factorsOfNum(num);
        ip.close();
        
    }
    
}
