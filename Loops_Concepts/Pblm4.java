/*
 Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”
	Because marks don’t matter but our effort does.
(Hint : use do-while loop but think & understand why)

 */
package Loops_Concepts;
import java.util.*;
public class Pblm4 {
    public static void main(String[] args) {
        System.out.println("Enter either 1 or 0.");
        Scanner ip = new Scanner(System.in);
        int a = ip.nextInt();
        // int b = ip.nextInt();
        if ( a==1){
            System.out.println("Enter your Marks");
            int b = ip.nextInt();
            if( b>= 90){
                System.out.println("This is Good");
            }
            else if (89>=b && b>=60){
                System.out.println("This is also Good");    
            }
            else{
                System.out.println("This is Good as well");
            }
        }
        else{
            System.out.println("Thanks!");
        }
        ip.close();

    }
    
}
