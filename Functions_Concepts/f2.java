//Function for Calculating Sum.
package Functions_Concepts;

import java.util.Scanner;

public class f2 {
    public static int sumOf2Numbers (int a ,int b){
        int sum = a+b;
        System.out.println(sum);
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        Scanner ip = new Scanner(System.in);
        int a = ip.nextInt();
        int b = ip.nextInt();
        System.out.println("Sum of 2 numbers is : " + sumOf2Numbers(a, b));
        ip.close();
    }  
    
}
