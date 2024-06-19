// Function for PRIME OR NOT.
package Functions_Concepts;

import java.util.Scanner;

public class h1 {
    public static void primeOrNot(int num){
        //check if num is prime or not
       int count=0;
       // loop
       for ( int i =1; i<=num; i++){
        if(num % i ==0)
            count++;
        }
        if(count==2){
            System.out.println("It is a Prime Number");
        }else{
            System.out.println("Not a Prime Number");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter any number:");
        Scanner ip =  new Scanner(System.in);
        int num = ip.nextInt();
        primeOrNot(num);
        ip.close();
    }
    
}
