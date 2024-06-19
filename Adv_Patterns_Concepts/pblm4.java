//Pallindrome Number Pyramid
package Adv_Patterns_Concepts;

import java.util.Scanner;

public class pblm4 {
    public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner ip = new Scanner(System.in);
        int n= ip.nextInt();
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //1st half
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            //2d half
            for(int j=1; j<=i; j++ ){
                System.out.print(j);
            }
            System.out.println();
        }ip.close();
    }
    
}
