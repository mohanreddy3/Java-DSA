//Remove all duplicates from the input string.
/*
 * Input: s = "bcabc"
Output: “bca"

Explanation: Duplicate Characters are removed
Example 2:
Input: s = "cbacdcbc"
Output: "cbad" 
 */
package TCS_NQT.String_pblms;
import java.util.*;
public class S15 {
    //method
    private static void removeDuplicates(String str){
        int n= str.length();
        HashMap <Character,Integer> map = new HashMap<>();
        for( int i=0; i<n; i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch, 1);
            }
            
            
        }
        for(char ch : map.keySet()){
            if(map.get(ch) > 1){
                System.out.println(ch);
                map.remove(ch);
            }
            System.out.println(map.keySet());
        }
        
    }
    //main
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = ip.nextLine();
        removeDuplicates(str);
        ip.close();
    }
}
