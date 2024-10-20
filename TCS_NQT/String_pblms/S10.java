//Problem Statement: Given a string, write a program
// to Capitalize the first and last character of each word of that string.
// Input: String str = "Take u Forward is Awesome"
// Output: “TakE U ForwarD IS AwesomE”
package TCS_NQT.String_pblms;

import java.util.Scanner;

public class S10 {
    //method
    private static void tranformCases(String str){
        int n = str.length();
        StringBuffer sb = new StringBuffer(str);
        for(int i=0; i<n; i++){
            if(i ==0 || i== (n-1)){ //keep () in mind.
                sb.setCharAt(i, Character.toUpperCase((char)(int)(str.charAt(i))));
            }
            else if(str.charAt(i) == ' '){
                sb.setCharAt(i-1, Character.toUpperCase((char)(int)(str.charAt(i-1))));
                sb.setCharAt(i+1, Character.toUpperCase((char)(int)(str.charAt(i+1))));
            }
        }
        System.out.println(sb.toString());
       
    }
    //main
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = ip.nextLine();
        tranformCases(str);
        ip.close();
    }
}
