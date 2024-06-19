// Inverted half Pyramid
package Patterns_Concepts;
import java.util.*;
public class pblm4 {
    public static void main(String[] args) {
        System.out.print("Enter the no of rows:");
        Scanner ip = new Scanner (System.in);
        int num = ip.nextInt();
        for (int i=num; i>=1; i--){
            for ( int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();

        }
        ip.close();

    }
    
}
