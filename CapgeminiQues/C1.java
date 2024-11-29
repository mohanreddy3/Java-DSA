/*
 * Problem Statement – 1 (PrepInsta)
You have write a function that accepts, a string which length is “len”, the string has some “#”, in it 
you have to move all the hashes to the front of the string and return the whole string back and print it.
char* moveHash(char str[],int n);
example :-
Input:
Move#Hash#to#Front
Output:
###MoveHashtoFront
 */
package CapgeminiQues;
import java.util.*;
public class C1 {
    //method
    private static void moveHashToFront(String str, int n){
        String str1 =  new String("");
        String str2 = new String("");
        for(int i=0; i<n; i++){
            if(str.charAt(i) == '#'){
                str1 = str1 + str.charAt(i);
            }
            else{
                str2 = str2 + str.charAt(i);
            }
        }
        String result = str1.concat(str2);
        System.out.println(result);
    }
    //main
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = ip.nextLine();
        int n = str.length();
        moveHashToFront(str , n); 
        ip.close();
    }    
}
