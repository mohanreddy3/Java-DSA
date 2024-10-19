// Count number of vowels, consonants, spaces in String.
package TCS_NQT.String_pblms;
import java.util.Scanner;
public class S2 {
    //method
    static void noOfElements(String str){
         str = str.toLowerCase();
        int n = str.length();
        int Vcount = 0;
        int Ccount =0;
        int Scount =0;
        for(int i=0; i< n; i++){
            char ch = str.charAt(i);
            if(ch == 'a'  || ch == 'e'|| ch == 'i'|| ch == 'o'  || ch == 'u'){
                Vcount++;
            }
            else if(ch >= 'a' && ch<= 'z'){
                Ccount++;
            }
            else if(ch == ' '){
                Scount++;
            }   
        }
        System.out.println("Vowel count:" + Vcount);
        System.out.println("Consonent count:" + Ccount);
        System.out.println("Spaces count:" + Scount);

    }
    //main
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = ip.nextLine();
        noOfElements(str);
        ip.close();   
    }
    
}
// Time Complexity: O(n)
// Space Complexity: O(1)
