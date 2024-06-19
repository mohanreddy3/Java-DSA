//Number Pryamid
package Adv_Patterns_Concepts;

import java.util.Scanner;

public class pblm3 {
    public static void main(String[] args) {
        System.out.print("Enter the no of lines:");
        Scanner ip = new Scanner(System.in); 
        int n= ip.nextInt();
        //outer loop
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //printing the row number --> in row no of times.
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        } ip.close();
        
    }
}
