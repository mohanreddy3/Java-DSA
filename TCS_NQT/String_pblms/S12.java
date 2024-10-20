//Problem:  Given a string, print non-repeating characters of the string.
//Input: string = “google”
//Output: l,e
package TCS_NQT.String_pblms;
import java.util.HashMap;
import java.util.Scanner;

public class S12 {
    //method
    private static void nonRepeatChars(String str){
        int n= str.length();
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
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            if(map.get(ch) == 1){
                System.out.print(ch + " ");
            }
        }
        System.out.println();     
    }
    //main
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = ip.nextLine();
        nonRepeatChars(str);
        ip.close();

    }
    
}
