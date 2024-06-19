// Reversing an Array. (using two pointers)
package Problems;

import java.util.Scanner;

public class r3 {
    public static void main(String[] args) {
        System.out.println("Enter the size of array:");
        Scanner ip = new Scanner (System.in);
        int size = ip.nextInt();
        int array [] = new int [size];
        //values
        System.out.println("Enter the values in array:");
        for(int i=0; i<size; i++){
            array[i]= ip.nextInt();
        }
        System.out.println("Reversed Array is:");
        ReverseArray(array);
        //output
        for(int i=0; i<size;i++){
            System.out.print(array[i]+ " ");
        }
        ip.close();
       
    }

    // Function to Reverse an array.
    static void ReverseArray (  int array[]){
        int start = 0;
        int end = array.length-1; // or array.length-1;
        // iterate through array using two pointers
        while(start< end){
            //swap elements at start and end.
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            // move start pointer to end.
            start++;
            //move end pointer to start.
            end--;
        }
    }
    
}
