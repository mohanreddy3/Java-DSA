// print --> 1 to N.
package BackTracking;

import java.util.Scanner;

public class B1 {
    //main
    public static void main(String[] args) {
        System.out.println("Enter the value of n: ");
        Scanner ip = new Scanner(System.in);
        int n= ip.nextInt();
        recFunction(n ,n);
        ip.close();
    }


    //Function
    public static void recFunction(int i, int n){
        if (i < 1){
            return;
        }
        else{
            recFunction(i-1, n);
            System.out.print(i + " ");
        }
    }
    
}
