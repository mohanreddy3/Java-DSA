package Placement_Pblms;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        System.out.println("Enter the input:");
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();
        System.out.println(luckyNumber(num));
        ip.close();
    } 
    //function
    public static int luckyNumber(int num ){
        if(num-1 <= 1){
            return 1;
        }
        else{
            return luckyNumber(num-1) + luckyNumber(num-2);
        }
    }
    
}
