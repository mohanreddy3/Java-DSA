//generate random string of given length.
package String_Buffer;

import java.util.Random;
import java.util.Scanner;

public class sb2 {
    //method
    private static void randString(int size){
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for(int i=0; i<size; i++){
            int randomChar = 97 + (int)(random.nextFloat() * 24);
            sb.append((char)randomChar);
        }
        System.out.println(sb.toString());

    }
    //main
   public static void main(String[] args) {
    Scanner ip = new Scanner(System.in);
    System.out.println("Enter the size: ");
    int size = ip.nextInt();
    randString(size);
    ip.close();
   }

    
}
