package Patterns_Concepts;

import java.util.Scanner;

public class k5 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n= ip.nextInt();
        for( int row=0; row<=2*n; row++){
            int totalColInRow = row > n ? 2 * n - row  : row;
            for(int col=0; col< totalColInRow; col++){
                System.out.print("*");

            }
            System.out.println();

        }
        ip.close();
    }
    
}
