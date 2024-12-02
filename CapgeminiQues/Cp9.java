/*
 * String Rotation:
 Problem: Determine if one string is a rotation of another.
 Input:
 String A: "ABCD"
 String B: "CDAB"
 Output: 
True
 Explanation: B is a rotation of A
 */
package CapgeminiQues;

import java.util.Scanner;

public class Cp9 {
    //method
    private static boolean isRotation(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        String concatenated = str1+str1;
        return concatenated.contains(str2);
    } 
    //main
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter String A:");
        String str1 = ip.nextLine();
        System.out.println("Enter String B:");
        String str2 = ip.nextLine();
          if(isRotation(str1, str2)){
            System.out.println("True");
          }
          else{
            System.out.println("False");
          }
          ip.close();
        
    }
    
}
