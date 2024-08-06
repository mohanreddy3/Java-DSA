package Placement_Pblms;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner ip = new Scanner(System.in);
        String str = ip.nextLine();
        int halfLength = (str.length()+1)/2;
        char [] firstHalf = new char[halfLength];
        char [] lastHalf = new char[halfLength];

        for(int i=0; i<halfLength; i++){
            firstHalf[i] = str.charAt(i); 
        }
        for(int i=halfLength; i<str.length(); i++){
            lastHalf[i-halfLength] = str.charAt(i);
        }
        System.out.println(firstHalf);
        System.out.println(lastHalf);
        for(int i=0; i<halfLength;i++){
            if(firstHalf[i] != lastHalf[i] ){
                System.out.println(firstHalf[i]);
            }
        }ip.close();
    }
    
}
