//Sum of N numbers. (Parameterized Way)
package Recursion;

import java.util.Scanner;

public class R5 {
    //main 
    public static void main(String[] args) {
        System.out.println("Enter the N value: ");
        Scanner ip = new Scanner(System.in);
        int N = ip.nextInt();
        sum_N_Numbers(N, 0);
        ip.close();
    }
    //Function
    public static void sum_N_Numbers(int i , int sum){
        if (i<1){
            System.out.println("Sum is: " + sum);
            return;
        }
        else{
            sum_N_Numbers(i-1, sum+i);
        }
    }

    
}
