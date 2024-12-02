/*
 * Counting Valleys:
 1:1 MOCK SESSION
 Problem: Given a sequence of up and down steps during a hike, determine 
the number of valleys traversed.
 Input:
 8
 UDDDUDUU
 Output: 1
 Explanation: A valley is a sequence of consecutive steps below sea level. 
The example describes a single valley.
 */


package CapgeminiQues;

import java.util.Scanner;

public class Cp5 {
    //main
    public static void main(String[] args) {
       Scanner ip  = new Scanner(System.in);
    //    System.out.println("Enter the length of string:");
    //    int num = ip.nextInt();
       System.out.println("Enter the String:");
       String str = ip.nextLine();
       int upCount = 0;
       int downCount =0;
       int valeyCount =0;
       for(int i=0; i<str.length(); i++){
        if(str.charAt(i) == 'U'){
            upCount++;
        }
        if(str.charAt(i) == 'D'){
            downCount++;
        }
        if(upCount == downCount){
            valeyCount++;
           }else{
            valeyCount=0;
            // System.out.println();
           }
       }
       System.out.println(valeyCount);  
       ip.close();      
    }
    
}
