//Problem Statement:write a program to remove vowels from a given String.
package TCS_NQT.String_pblms;

import java.util.Scanner;

public class S41 {
    //method
    private static void removeVowels(String str){
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a'|| ch=='e' || ch=='i'||ch=='o'||ch=='u'){
                str = str.substring(0, i) + str.substring(i+1);
                i--;
            }
        }
        System.out.println(str);

    }
    //main
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = ip.nextLine();
        removeVowels(str);
        ip.close();

    }
    
}
