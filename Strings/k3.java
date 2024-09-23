//palindrome
package Strings;

public class k3 {
    //method
    static boolean palindrome(String str){
        str.toLowerCase();
        for(int i=0; i<str.length()/2; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if(start != end){
                 return false;
            }
        }
        return true;
    }
    //main
    public static void main(String[] args){
        String str = "abcdccba";
       System.out.println(palindrome(str));

    }
    
}
