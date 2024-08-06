//Finding the FREQUENCY of characters (Includes Upper and Lower case)
package Hashing;

import java.util.Scanner;

public class H3 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        //input from the user
        System.out.println("Enter the String:");
        String str = ip.nextLine();
        //pre computing
        int[] Hash = new int[256];
        for(int i=0; i<str.length(); i++){
            Hash[str.charAt(i)]++;
        }
        //input from user
        System.out.println("Enter the no of characters: ");
        int opr = ip.nextInt();
        System.out.println("Enter the elements: ");
        while(opr-- !=0){
            char indvChar = ip.next().charAt(0);
            System.out.println("Freq of " + indvChar + " is " + Hash[indvChar]);
        }
        ip.close();
    }
    
}
