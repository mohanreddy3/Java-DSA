//Write a function to print the sum of all odd numbers from 1 to n
package Functions_Concepts.Practice_ques;

import java.util.Scanner;

public class p2 {

    public static void SumOfOdd(int num){
        int sum =0;
        for ( int i=1; i<num; i++){
            if(i % 2 != 0){
                sum = sum+i;
            }
        } 
        System.out.println( "Sum of all odd numbers upto to number is " +  sum);
    }
    public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner ip = new Scanner (System.in);
        int num = ip.nextInt();
        SumOfOdd(num);
        ip.close();
    }
    
}
