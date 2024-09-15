//Reverse a String
package Cognizant_Interview;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        StringBuilder str = new StringBuilder(ip.nextLine());
        for(int i=0; i<str.length()/2; i++){
            int frontIndex = i;
            int endIndex = str.length()-1-i;
            char frontChar = str.charAt(frontIndex);
            char endChar= str.charAt(endIndex);
            //swapping
            str.setCharAt(frontIndex, endChar);
            str.setCharAt(endIndex, frontChar);
        }
        System.out.println(str);
        ip.close();
    }

    
}
