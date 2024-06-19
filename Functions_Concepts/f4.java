//Function for finding FACTORIAL 
package Functions_Concepts;

import java.util.Scanner;
public class f4 {
    public static void numFactorial(int num){
        //loop
        if(num<0){
            System.out.println("Enter a +ve Number!");
            return; // in between we can return from the function.
        }
        int Factorial =1;
        for(int i=num;i>=1;i--){
            Factorial = Factorial*i;
        }
        System.out.println( "Factorial is: " + Factorial);
        return;
    }
    public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();
        numFactorial(num);
        ip.close();
    }
    
}
