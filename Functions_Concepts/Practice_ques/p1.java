//Enter 3 numbers from the user & make a function to print their average.
package Functions_Concepts.Practice_ques;

import java.util.Scanner;

public class p1 {

    public static void Average ( int a , int b , int c){
        int avg = (a+b+c)/3;
        System.out.println("Average is : "+ avg);
    }
    public static void main(String[] args) {
        System.out.print("Enter three numbers:");
        Scanner ip = new Scanner(System.in);
        int a = ip.nextInt();
        int b = ip.nextInt();
        int c = ip.nextInt();
        Average(a, b, c);
        ip.close();



    }

    
}
