package Cognizant_Problems;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        System.out.println("Enter the Required nth term:");
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        System.out.println("The "+ n +"th  Fibonacci num is :" + fibonacci(n));
        ip.close();
    }
    //Function
    public static int fibonacci(int n){
        //Edge cases
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        //Logic
        int a =0;
        int b = 1;
        int Fib = 0;
        //loop
        for(int i=2; i<n; i++){
           Fib = a+b;
           a=b;
           b=Fib;
        }
        return Fib;
    }  
          
}

