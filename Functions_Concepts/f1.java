// Function which prints our name.
package Functions_Concepts;

import java.util.Scanner;

public class f1 {
    public static void PrintMyName(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner ip = new Scanner (System.in);
        String name = ip.next(); 
        PrintMyName(name);
        ip.close();
    } 
} 
