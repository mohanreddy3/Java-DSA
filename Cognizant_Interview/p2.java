//Palindrome or not.
package Cognizant_Interview;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = ip.nextLine();
        boolean isPalindrome = true;
        for(int i=0; i<str.length()/2; i++){
            int front = i;
            int end = str.length()-1-i;
        if(str.charAt(front) != str.charAt(end)){
            isPalindrome = false;
            break;
        }
        }
        if(isPalindrome == true){
            System.out.println("It is a Palindrome");

        }
        else{
            System.out.println("Not a Palindrome");
        }
        ip.close();
    }
    
}
