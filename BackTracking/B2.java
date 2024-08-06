package BackTracking;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        System.out.println("Enter the value of n: ");
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt(); 
        int i =1;
        recFunction(i , n );
        ip.close();
    }

    //Function
    public static void recFunction(int i, int n){
        if(i>n){
            return;
        }
        else{
            recFunction(i+1,n);
            System.out.print(i+" ");
        
        }
    }
}
