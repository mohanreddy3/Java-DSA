/*
 * Problem Statement – 5
Write a function to solve the following equation a3 + a2b + 2a2b + 2ab2 + ab2 + b3.
Write a program to accept three values in order of a, b and c and get the result of the above equation.
 */
package CapgeminiQues;

import java.util.Scanner;

public class C5 {
    //method
    private static int expressionAns(int a, int b){
        int c = (a*a*a) + (a*a)*b + 2*((a*a)*b) + 2*(a*(b*b)) + a*(b*b) + (b*b*b);
        return c;
    }
    //main
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int a = ip.nextInt();
        int b = ip.nextInt();
        System.out.println(expressionAns(a , b));
        ip.close();
    }

    
}
