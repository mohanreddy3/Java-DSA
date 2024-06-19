//Write a function that takes in the radius as input and returns the circumference of a circle.
package Functions_Concepts.Practice_ques;

import java.util.Scanner;

public class p4 {

    public static void Circumference (float  radius){
        double cum = 2*(3.14)*(radius); //2*Pi*Radius
        System.out.println(cum);
        return;

    }
    public static void main(String[] args) {
        System.out.println("Enter the radius:");
        Scanner ip = new Scanner(System.in);
        float radius = ip.nextFloat();
        Circumference(radius);
        ip.close();

    }

    
}
