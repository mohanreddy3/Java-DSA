//Print Duplicate values for a given String.
package Problems;
import java.util.Scanner;
public class p4 {

    public static void main(String[] args) {
        System.out.println("Enter any string:");
        Scanner ip = new Scanner(System.in);
        String str = ip.nextLine();
        // System.out.println(str.length());
        //Function calling
       DupChar(str); 
       ip.close();
    }
    // Function
    public static void DupChar(String str){
        int Array[] = new int[256];
        //loop
        for(int i=0; i<str.length(); i++){
            Array[str.charAt(i)]++;
        }
        //loop
        for(int i=0; i<256; i++){
            if(Array[i]>1){
                System.out.println((char)i +" is repeating " + Array[i] + " times.");
            }
        }
    }
    
}
