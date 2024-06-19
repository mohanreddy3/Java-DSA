// GET BIT --> identifying whether it is 0 or 1.
package Bit_Manuplation;

import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        // int n=5;
        // int pos =1;
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = ip.nextInt();
        System.out.println("Enter the position:");
        int pos = ip.nextInt();
        // Create a BitMask
        int BitMask = 1 << pos; 
        //AND OPERATION WITH NUMBER
        if((BitMask & num )== 0){
            System.out.println("Bit is 0");
        }
        else{
            System.out.println("Bit is 1");
        }ip.close();
    }
    
}
