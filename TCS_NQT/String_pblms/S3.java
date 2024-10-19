//Problem Statement: Given a character, Find the ASCII value of the character.
package TCS_NQT.String_pblms;
import java.util.Scanner;

public class S3 {
    //method
    static void asciiValue(char ch){
        int ascii = ch;
        System.out.println("Ascii Value is : " + ascii);
    }
    //main
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch = ip.next().charAt(0); // taking character as input
        asciiValue(ch);
        ip.close();   
    }    
}

// Time Complexity: O(1)
// Space Complexity: O(1)
