//Two numbers are entered through the keyboard. --> (NUM1)^(NUM2) = RESULT.
// Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)
package Problems;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner ip = new Scanner (System.in);
        System.out.print("Enter the Exponent value:");
        int exp = ip.nextInt();
        System.out.print("Enter the Base value:");
        int base = ip.nextInt();

        //power of a number
         long result =1;
        for (int i=1; i<=exp; i++){
            result = result *base;
        }
          System.out.println("Result is " + result);
          ip.close();
    }
    
}
