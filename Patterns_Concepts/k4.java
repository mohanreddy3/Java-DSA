// 4
// 1
// 1 2
// 1 2 3
// 1 2 3 4


package Patterns_Concepts;

import java.util.Scanner;

public class k4 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        for( int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print(col + " ");
            }
            System.out.println(" ");
        }
        ip.close();
    }
    
}
