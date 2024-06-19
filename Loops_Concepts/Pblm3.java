//print all even numbers unitl "N"(User Input)
package Loops_Concepts;
import java.util.*;
public class Pblm3 {
    public static void main(String[] args) {
        System.out.println("Enter desired number:");
        Scanner ip = new Scanner (System.in);
        int num = ip.nextInt();
        for ( int i=0; i< num;i=i+2 ){
            System.out.println(i);
        }
        ip.close();
    }

}
