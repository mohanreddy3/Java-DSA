// Inverted Half Pyramid using Numbers.
package Patterns_Concepts;

import java.util.Scanner;

// import  java.util.*;
public class pblm7 {
    public static void main(String[] args) {
        System.out.println(" Enter the number:");
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        // outer loop --> cell
        for (int i=1; i<=n; i++){
            //inner loop --> 
            for( int j=i; j>=1; j--){
                System.out.print(j +" ");
            }
            System.out.println();

        }
        ip.close();
    }
}
