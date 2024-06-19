//Inverted Half Pyramid ( roatated by 180 degree)
package Patterns_Concepts;
import java.util.*;
public class prac5 {
    public static void main(String[] args) {
        System.out.print("Enter the no of rows:");
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        //outer loop --> no of rows
        for ( int i =1; i<=n; i++){
            //inner loop --> space print
            for( int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //inner loop 2 --> star print
            for(int k=1; k<=i; k++){
            System.out.print("*");
        }
        System.out.println();
        }
        ip.close();
    }
    
}
