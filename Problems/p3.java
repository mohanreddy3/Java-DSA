/*
 * Print all the duplicate characters in a string.
Given a string S, the task is to print all the duplicate characters with their occurrences in the given string.
Example:
Input: S = “geeksforgeeks”
Output:
e, count = 4
g, count = 2
k, count = 2
s, count = 2
 */
package Problems;
import java.util.Scanner;
public class p3 {
    public static void main(String[] args) {
        System.out.println("Enter the String:");
        Scanner ip = new Scanner(System.in);
        String str = ip.nextLine();
        //Function call.
        DupChar(str);
        ip.close();
    }
    public static void DupChar(String str){
        int Array1[] = new int[256];
        //Array1 is an array of integers with a size of 256, which can hold the count of each ASCII character
        // (since there are 256 possible ASCII characters). 
        for(int i=0; i<str.length(); i++){
            Array1[str.charAt(i)]++;
        }
        //Print char that occur more than once.
        for (int i=0; i<256; i++){
            if(Array1[i] > 1){
                System.out.println( (char)i + " is repeated :" +Array1[i] + " times");
                //(char) i --> converts Ascii values to Characters & give Characters as ouput.
            }
        }

    }
    
}

/*
 * Consider the string "geeksforgeeks" and the iteration process:

Initial State:

charCount is an array of size 256 initialized with all zeros.
First Iteration (i = 0):

str.charAt(0) is 'g' (ASCII value 103).
charCount[103] is incremented from 0 to 1.
Second Iteration (i = 1):

str.charAt(1) is 'e' (ASCII value 101).
charCount[101] is incremented from 0 to 1.
Third Iteration (i = 2):

str.charAt(2) is 'e' (ASCII value 101).
charCount[101] is incremented from 1 to 2.
... and so on for each character in the string.
 */
