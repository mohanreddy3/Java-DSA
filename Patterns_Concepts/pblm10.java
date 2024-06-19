// 0's & 1's Triangle 
package Patterns_Concepts;

import java.util.Scanner;

public class pblm10 {
    public static void main(String[] args) {
        System.out.println("Enter the no of rows:");
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        // outer loop
        for ( int i=1; i<=n;i++){
            //inner loop 
            for( int j=1; j<=i; j++){
                int sum = i+j;
                if(sum % 2 == 0){ //even--> print 1
                    System.out.print("1 ");
                }else { //odd --> print 0
                    System.out.print("0 ");
                }
                
            }
            System.out.println();
        } ip.close();
    }
}
