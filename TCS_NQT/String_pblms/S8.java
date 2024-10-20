//Problem Statement: Remove brackets from an algebraic expression
// Input: “a+((b-c)+d)”
// Output: “a+b-c+d”

package TCS_NQT.String_pblms;
import java.util.Scanner;
public class S8 {
    //method
    private static void removeBrackets(String str){
        int n= str.length();
        for(int i=0; i<n; i++){
            if(str.charAt(i) == ')' || str.charAt(i) == '('){
                str = str.substring(0, i) + str.substring(i+1);
                i--;
                n--;
            }
        }
        System.out.println(str);
    }
    //main
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = ip.nextLine();
        removeBrackets(str);
        ip.close();
    }  
}
// TC:O(n)
// SC:O(1)