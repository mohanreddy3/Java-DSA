// 4
// **** 
// *** 
// ** 
// * 


package Patterns_Concepts;

import java.util.Scanner;

public class k3 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        for(int row=1; row<=n; row++){
            for(int col=0; col<=n-row; col++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        ip.close();
        
    }

    
}
