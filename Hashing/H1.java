//Hashing Technique
package Hashing;

import java.util.Scanner;

public class H1 {
    public static void main(String[] args) {
        //working with array.
        System.out.println("Enter the size of the array: ");
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array: ");
        for(int i=0; i<arr.length;i++){
            arr[i]= ip.nextInt();
        }
        //storing the frequency
        int[] hashArray = new int[13];
        for(int i =0; i<arr.length; i++){
            hashArray[arr[i]]= hashArray[arr[i]] +1;
        }
        // getting no of elements
        System.out.println("Enter the no of elements: ");
        int q = ip.nextInt();
        System.out.println("Enter the elements:  ");
        while (q-- != 0){
            int elements = ip.nextInt();
            //output
        System.out.println("Output is: " + hashArray[elements]);
        }
        ip.close();
    }
}
