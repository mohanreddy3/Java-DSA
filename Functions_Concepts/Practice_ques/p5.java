//Write a function that takes in age as input and returns if that person is eligible to vote or not.
// A person of age > 18 is eligible to vote.
package Functions_Concepts.Practice_ques;

import java.util.Scanner;

public class p5 {

    public static void Eligibility(int age){
        if(age>=18){
            System.out.print("Eligible to vote");
        }else{
            System.out.print("Not Eligible to vote");
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter your Age:");
        Scanner ip = new Scanner (System.in);
        int age = ip.nextInt();
        Eligibility(age);
        ip.close();
    }
    
}
