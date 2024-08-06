//print --> 1 to N.
package Recursion;

import java.util.Scanner;

public class R3 {
    //main
    public static void main(String[] args) {
        System.out.println("Enter n value: ");
        Scanner ip = new Scanner(System.in);
        int n= ip.nextInt();
        recFunction(1 , n);
        ip.close();
    }

    //Function
    public static void recFunction(int i, int n){
        if(i>n){
            return;
        }
        else{
            System.out.print(i + " ");
            recFunction(i+1, n);
        }
    }

    
}
