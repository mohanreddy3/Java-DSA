// Inverse Pyramid with numbers
package Patterns_Concepts;

import java.util.Scanner;

public class pblm8 {
    public static void main(String[] args) {
        System.out.println("Enter the no of rows:");
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        // outer loop
        for( int i = 1 ; i<=n; i++){
            //inner loop
            for(int j =1 ;j<=n-i+1; j++){
                System.out.print(j);
            } System.out.println();
        } ip.close();
    }
    
    
}
