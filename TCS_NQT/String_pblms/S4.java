//Problem Statement:write a program to remove vowels from a given String. 
// Approach: I used StringBuilder in this
package TCS_NQT.String_pblms;

import java.util.Scanner;

public class S4 {
    //method
    static void removeVowels(StringBuilder str){
        
        int n = str.length();
        for(int i=0; i< n; i++){
            char ch = str.charAt(i);
            if(ch == 'a'|| ch=='e' || ch=='i'||ch=='o'||ch=='u'){
                str.deleteCharAt(i);
                i--; //Move the index back by one to account for the shortened string
                n--; //Reduce the length to match the updated string
            }
        }
        System.out.println(str);
        
    }
    //main
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the String: ");
        // String str = ip.nextLine();
        StringBuilder str = new StringBuilder(ip.nextLine());
        removeVowels(str);
        ip.close();

    }
    
}

// Issues faced: If the input string is "hello", after removing the first vowel 'e', 
// the string becomes "hllo". But your loop doesn't re-check the next character 'l' after deleting the vowel, 
// because the loop continues with the next index, skipping over one character.
//TC : O(n2)
//SC : O(1)

