//Reversing a String
package Strings;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.print("Enter a String:");
        Scanner ip = new Scanner(System.in);
        StringBuilder str = new StringBuilder(ip.nextLine()); // remember
        System.out.println("Entered String is: " + str);
        //loop to swap char
        for ( int i=0; i<str.length()/2; i++){
            // defining positions
            int front = i;
            int back = str.length()-1-i; // ex: Hello --> 5-1-0 = 4.
            // defining char
            char FrontChar = str.charAt(front);
            char BackChar = str.charAt(back);
            //replacing char
            str.setCharAt(front, BackChar);
            str.setCharAt(back, FrontChar);
            ip.close();
        }
        System.out.println("Reversed String is:" + str);

    }
}
