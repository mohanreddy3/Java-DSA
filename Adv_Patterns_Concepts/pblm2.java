//Solid Rhombus
package Adv_Patterns_Concepts;

import java.util.Scanner;

public class pblm2 {
    public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        //outer loop
        for (int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for( int j=1; j<=n; j++ ){
                System.out.print("*");
            }

            System.out.println();
        }ip.close();
    }
}
