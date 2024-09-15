//Anagram or not.
package Cognizant_Interview;
import java.util.Scanner;
public class p3 {
    //method
    static boolean checkAnagram(String str1, String str2){
        //common sense
        if(str1.length() != str2.length()){
            return false;
        }
        //array to store the count of the characters.
        int[] arr = new int[26];
        // String 1
        for(int i=0; i<str1.length(); i++){
            char character = str1.charAt(i);
            arr[ character - 'a']++; //increses count of the character
        }
        //String 2
        for(int i=0; i<str2.length(); i++){
            char character = str2.charAt(i);
            arr[character - 'a']--; //decreases the count of character
        }
        //array
        for(int i=0; i< arr.length; i++){
            if(arr[i] !=0){
                return false;
            }
        }
        return true;
    }
    //main
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the First String:");
        String str1 = ip.nextLine();
        System.out.print("Enter the Second String:");
        String str2 = ip.nextLine();
        if(checkAnagram(str1, str2) == true){
            System.out.print("Both are Anagrams");
        }else{
            System.out.print("Both are not Anagrams");
        }
        ip.close();
    }   
}
