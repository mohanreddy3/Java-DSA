package Strings;

import java.util.Scanner;

public class Pex1 {
    public static void main(String[] args) {
        System.out.print("Enter the String:");
        Scanner ip = new Scanner(System.in);
        StringBuilder str = new StringBuilder(ip.nextLine());
        System.out.println("Entered String is:" + str);
        //reverse order
        for( int i=0; i<str.length()/2; i++){
            int front = i;
            int back = str.length()-1-i;
            char frontChar = str.charAt(front);
            char backChar = str.charAt(back);
            //swapping
            str.setCharAt(front, backChar);
            str.setCharAt(back, frontChar);
        }
        System.out.println("Reversed String is: " + str);
        ip.close();
    }
    
}
