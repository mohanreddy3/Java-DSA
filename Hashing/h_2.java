//Find frequency of given string (where all are Lowercases)
package Hashing;

import java.util.Scanner;

public class h_2 {
    public static void main(String[] args) {
        //input from user
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = ip.nextLine();
        //precomputation
        int[] Hash = new int[26]; //becoz wkt string consists of only lowercases.
        System.out.println("Enter the characters: ");
        for(int i=0; i<str.length();i++){
            Hash[str.charAt(i) - 'a']++; //stores the freq of characters.
        }
        //input no of opr
        System.out.println("Enter the no of element's FREQ is to be found: ");
        int q = ip.nextInt();
        while(q-- != 0){
            char indChar = ip.next().charAt(0);
            System.out.println(" Freq is :"+ Hash[ indChar - 'a']);
        }
        ip.close();
    }
    
}
