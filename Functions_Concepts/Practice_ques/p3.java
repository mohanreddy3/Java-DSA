//Write a function which takes in 2 numbers and returns the greater of those two.
package Functions_Concepts.Practice_ques;

import java.util.Scanner;

public class p3 {

    public static void HighOrLow( int a , int b){
        if(a>b){
            System.out.println(a+ " is greater than " +b);
        }else{
            System.out.println(b+ " is greater than " + a);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        Scanner ip = new Scanner(System.in);
        int a = ip.nextInt();
        int b = ip.nextInt();
        HighOrLow(a, b);
        ip.close();
    }
    
}
