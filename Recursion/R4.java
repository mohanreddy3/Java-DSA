// print --> N to 1
package Recursion;

import java.util.Scanner;

public class R4 {
    // main
    public static void main(String[] args) {
        System.out.println("Enter the n value:");
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        recFunction(n ,1);
        ip.close();
    }

    //Function
    private static void recFunction(int i , int n){
        if(i<n){
            return;
        }
        else{
            System.out.print(i + " ");
            recFunction(i-1, n);
        }
    }
    
}
