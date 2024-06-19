//Function for EVEN OR ODD.
package Functions_Concepts;

import java.util.Scanner;

public class h2 {
    public static void evenOrNot(int num){
        if(num % 2==0){
            System.out.print("Even");
        }else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner ip = new  Scanner(System.in);
        int num = ip.nextInt();
        evenOrNot(num);
        ip.close();
    }
}
