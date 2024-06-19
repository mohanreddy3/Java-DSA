// Half pyramid
package Patterns_Concepts;
import java.util.*;
public class pblm3 {
    public static void main(String[] args) {
        System.out.print("Enter the no of rows:");
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        for( int i =1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        ip.close();
    }
}
