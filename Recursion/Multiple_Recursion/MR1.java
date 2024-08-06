//Fibonacci using Multiple function calls.
package Recursion.Multiple_Recursion;

import java.util.Scanner;

public class MR1 {
    public static void main(String[] args) {
        System.out.println("Enter the position: ");
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        // int n = 4;
        System.out.println("Fibonnaci number at  " + n + "th position is " + fibonacciFun(n));
        ip.close();
    }
    //Function 
    public static int fibonacciFun(int n){
        //base case
        if(n<=1){
            return n;
        }
        else{
            return fibonacciFun(n-1) + fibonacciFun(n-2);
        }

    }
}
