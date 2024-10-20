//Check if two Strings are anagrams of each other
// Input: CAT, ACT
// Output: true
package TCS_NQT.String_pblms;
import java.util.Arrays;

public class S13 {
    //method 2
    private static String SortString(String str){
        char ch[] = str.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
    //method 1
    private static boolean anagramCheck(String str1, String str2){
          if(str1.length() != str2.length()){
            return false;
          }
          str1 = SortString(str1);
          str2 = SortString(str2);
          for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i) == str2.charAt(i)){
                return true;
            }
          }
          return false;
    }
    //main
    public static void main(String[] args) {
        String str1 = "CAT";
        String str2 = "TAC";
       System.out.println(anagramCheck(str1, str2));

        
    }
    
}
