/*
 * Input a string from the user. Create a new string called ‘result’ in which
 *  you will replace the letter ‘e’ in the original string with letter ‘i’. 
Example : 
original = “eabcdef’ ; result = “iabcdif”
Original = “xyz” ; result = “xyz”

 */
package Strings;
import java.util.Scanner;
public class h2 {
    public static void main(String[] args) {
        System.out.println("Enter any String:");
        Scanner ip = new Scanner(System.in);
        // String str = ip.nextLine();
        // String str = "Honey";
        StringBuilder str = new StringBuilder(ip.nextLine());
        //loop
        for (int i=0; i<str.length(); i++){
            System.out.println( "Char at index " + i + " :" + str.charAt(i));
        }
        //replacing
        int index = 0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)== 'e'){
                index = i;
                System.out.println("Index where 'e' is present :" + index);
                str.setCharAt(index, 'i');
            }
        } ip.close();
        System.out.println("Output is :" + str);
    }
    
}
