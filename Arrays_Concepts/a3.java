//take an array as input from the user. 
// Search for a given number x & print the index at which it occurs. (LINEAR SEARCH)
package Arrays_Concepts;

import java.util.Scanner;

public class a3 {
    public static void main(String[] args) {
        System.out.print("Enter the size of the array:");
        Scanner ip = new Scanner (System.in);
        int size = ip.nextInt();
        int Array1 []= new int[size];
        //input
        System.out.println("Enter values in array:");
        for(int i=0; i<size; i++){
            Array1[i]= ip.nextInt();
        }
        // getting x value
        System.out.print("Enter the x value:");
        int x = ip.nextInt();

        //output
        for(int i=0; i<size; i++){ //Array1.length --> size.
            if(Array1[i]==x){
                System.out.println("x is found at index:"+ i);
            }
        } ip.close();
    }
    
}
