// Butterfly Patterns
package Adv_Patterns_Concepts;

import java.util.Scanner;

public class pblm1 {
    public static void main(String[] args) {
        System.out.print(" Enter the no of rows:");
        Scanner ip = new Scanner (System.in);
        int n = ip.nextInt();
        //Upper Half
        for( int i=1; i<=n; i++){
            // 1st part
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            int spaces = 2 * (n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
             // 2nd part 
             for ( int j=1; j<=i;j++){
                System.out.print("*");
             }
            System.out.println();
            
        }
         //Lower Half
         for( int i=n; i>=1; i--){
            // 1st part
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            int spaces = 2 * (n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
             // 2nd part 
             for ( int j=1; j<=i;j++){
                System.out.print("*");
             }
            System.out.println();

    } ip.close();
}
}
