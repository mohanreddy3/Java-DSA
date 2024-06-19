// Print the table of a number input by User.
package Loops_Concepts;
import java.util.*;
public class Pblm2 {
    public static void main(String[] args) {
        System.out.println("Enter your desired Number:");
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();
        for( int i=1; i<10;i++){
            System.out.println(num*i);
        }
        ip.close();
    }
}
