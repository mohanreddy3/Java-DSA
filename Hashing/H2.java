package Hashing;
import java.util.*;

public class H2 {
    public static void main(String[] args) {
      Scanner ip = new Scanner(System.in);
      System.out.println("Enter the String: ");
      String str = ip.nextLine();

      // pre Computing
      int[] HashArray = new int [26];
        for(int i=0; i<str.length();i++){
            HashArray[str.charAt(i)- 'a']++;
        }
        //
        System.out.println("Enter the no of characters: ");
        int q = ip.nextInt();
        System.out.println("Enter the elements:");
        while(q-- !=  0){
            char c = ip.next().charAt(0);
            
            //fetch
            System.out.println("Frequency is: "+ HashArray[c-'a']);
           
        }
        ip.close();
    }
}
