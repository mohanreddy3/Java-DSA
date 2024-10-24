// given integer is palindrome or not
package TCS_NQT.Numbers_pblms;
import java.util.Scanner;

public class N1 {
    //method
    private static boolean checkPalindrome(int num){
        int revNum = 0;
        int dup = num;
         while(num>0){
            int ld = num % 10;
            revNum = (revNum *10) + ld;
            num = num/10;
         }
         if(revNum == dup){
            return true;
        }
        
        return false;

    }


    //main
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();
        System.out.println(checkPalindrome(num));
        ip.close();


    }
    
}
