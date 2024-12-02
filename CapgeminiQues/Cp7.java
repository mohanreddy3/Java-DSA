/*
 *Pythagorean Triplets:
 Problem: Generate all Pythagorean triplets with values smaller than a given 
limit.
 Input: 
limit = 20
Output:
 3 4 5
 8 6 10
 5 12 13
 15 8 17
 12 16 20
 Explanation: The triplets satisfy the condition 
 a² + b² = c² , where a , b, and c are integers
 */
package CapgeminiQues;

import java.util.Scanner;

public class Cp7 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter Limit: ");
        int limit = ip.nextInt();
        for(int a=1; a<=limit; a++){
            for(int b=a+1; b<=limit; b++){
                //c2 = a2 + b2
                int cSquare = (a*a) +(b*b);
                int c = (int)Math.sqrt(cSquare);
                // checking
                if( c*c == cSquare && c<=limit){
                    System.out.println(a + " " + b + " " + c);
                }
            }
        }   
        ip.close(); 
        }
    }
