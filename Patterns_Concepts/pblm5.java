//Inverted Half Pyramid on the right side
package Patterns_Concepts;
import java.util.*;
public class pblm5 {
    public static void main(String[] args) {
        System.out.print("Enter the no of Rows:");
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        //outer loop -> no of rows
        for( int i=1; i<=n; i++){
            //inner loop -> print Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //inner loop 2 -> print Stars
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        ip.close();

        
    }
    
    
}
