package Cognizant_Interview;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int size = ip.nextInt();
        for(int i=0; i<=size; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    
}
