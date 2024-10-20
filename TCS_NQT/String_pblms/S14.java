//Maximum occurring character in a string
/*
 * Example 1:
Input: str = “takeuforward”
Output: a
Explanation: The character 'a' and 'r’ have the same  maximum occurrence i.e 2. Hence we can print any one of them

Example 2:
Input: str = “apple”
Output: p
Explanation: The character 'p' have the maximum occurrence i.e 2.
 */
package TCS_NQT.String_pblms;

import java.util.HashMap;
import java.util.Scanner;

public class S14 {
    //method
    private static void maxRepeatedElem(String str){
        int n = str.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch, 1);
            }
        }

        char maxChar = ' '; // to store max character
        int maxFreq = 0;    // to store max frequency of a character.
        // a way to traverse through the keys in HashMap
        for(char ch : map.keySet()){
            int freq = map.get(ch);
            if(freq > maxFreq ){
                maxFreq = freq;
                maxChar = ch;
            }
        }
        System.out.println("Max Character is:"+maxChar);
    }
    //main
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = ip.nextLine();
        maxRepeatedElem(str);
        ip.close();

    }
    
}

// Time Complexity (TC): O(n)
// Space Complexity (SC): O(n)
