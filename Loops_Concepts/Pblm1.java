//Sum of "N" Natural Numbers.
package Loops_Concepts;
import java.util.*;
public class Pblm1 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner ip = new Scanner (System.in);
        int num =ip.nextInt();
        int sum=0;
        for ( int i=1; i<=num;i++ ){
            sum = sum+i;
        }
        System.out.println(sum);
        ip.close();

    }
}
