package TCS_NQT.String_pblms;
import java.util.Scanner;
public class S1 {
    //method
    static boolean checkPalindrome(String str){
        int n= str.length();
        for(int i=0; i<n/2; i++){
            char start = str.charAt(i);
            char end = str.charAt(n-i-1);
            if(start != end){
                return false;
            }
        }
        return true;
    }
    
    //main
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = ip.nextLine();
       System.out.println(checkPalindrome(str));
       ip.close();
    }
    
}
// Time Complexity: O(n)
// Space Complexity: O(1)
