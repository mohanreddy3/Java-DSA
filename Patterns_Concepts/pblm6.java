// Half Pyramid using Numbers!
package Patterns_Concepts;
import java.util.*;
public class pblm6 {
    public static void main(String[] args) {
        System.out.print("Enter no of Rows:");
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        //outer loop --> no of rows
        for( int i=1; i<=n; i++){
            // inner loop --> print numbers
            for( int j=1; j<=i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        ip.close();
    }
    
}
