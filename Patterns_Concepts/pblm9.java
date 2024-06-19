//Floyd's Triangle
package Patterns_Concepts;

import java.util.Scanner;

public class pblm9 {
    public static void main(String[] args) {
        System.out.println("Enter no of rows:");
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int number =1;
        //outer loop 
        for( int i=1; i<=n;i++){
            //inner loop
            for(int j=1; j<=i; j++){
                System.out.print(number + " ");
                number++;
            } 
            System.out.println();
         } ip.close();
         
    }
    
}
