//Qs. Print if a number is prime or not (Input n from the user). 
package Loops_Concepts;
import java.util.*;
public class Pblm5 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();
        int count =0; 
        //loop
        for(int i=1; i<=num; i++){
            if(num % i==0){
                count++;
            }
        }
        if (count==2){
            System.out.print("It is a Prime Number");
        } else{
            System.out.print("It is not a prime number");
        }
        ip.close();
        
    }
}
