package Recursion;

import java.util.Scanner;

public class R2 {
    //Function
    // static int n=0;
    // static int count =n;
    public static void recFunction(int i,int n){
        if(i > n){
            return;
        }
        else{
        System.out.println("Mohan");
        // count++;
        recFunction(i+1 , n);
        }
        
    }

    //main
    public static void main(String[] args) {
        System.out.println("Enter the no of times: ");
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt(); 
        recFunction(1 , n);
        ip.close();

    }
    
}
