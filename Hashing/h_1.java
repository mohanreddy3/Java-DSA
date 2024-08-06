//Hashing Concept
package Hashing;

import java.util.Scanner;

public class h_1 {
    public static void main(String[] args) {
        //working with arrays
        System.out.println("Enter the size of array:");
          Scanner ip = new Scanner(System.in);
          int size = ip.nextInt();
          int[] array = new int[size];
          System.out.println("Enter the elements in array: ");
          for(int i=0; i<size;i++){
            array[i] = ip.nextInt();
          }
          //storing the values
          int[] hashArray = new int [size+1];
          for(int i=0; i<size; i++){
            hashArray[array[i]] = hashArray[array[i]]+1;
          }
          //working with freq of elements
          System.out.println("Enter the no of elements:");
          int q= ip.nextInt();
          System.out.println("Enter the elements: ");
          while(q-- != 0){ // loop runs until no of inputs the user has given.
            int element = ip.nextInt();
            //output
            System.out.println();
            System.out.println("The frequency of the numbers is : " + hashArray[element]);
          }
        ip.close();
    }
    
}
