//Function for multiplication
package Functions_Concepts;

import java.util.Scanner;
public class f3 {

public static int CalculateProduct(int a , int b){
    int product = a*b;
    System.out.println(product);
    return 0;
}
    public static void main(String[] args) {
        System.out.print("Enter two numbers:");
        Scanner ip = new Scanner(System.in);
        int a = ip.nextInt();
        int b = ip.nextInt();
        CalculateProduct(a, b);
        ip.close();
    }
}
