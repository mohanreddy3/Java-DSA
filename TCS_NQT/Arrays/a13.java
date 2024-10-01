//Insertion at beginning & Insertion at End.
// Time Complexity: θ(n), since n iterations are required to shiftθ(1) since we need to directly add an element at the end of the array
// Space Complexity: O(1)
package TCS_NQT.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class a13 {
    //method 1
    static void insertBegin(int[] arr , int n ,int value){
        for(int i=n-1; i>=0; i--){  //move every element 1 position to right.
            arr[i+1] = arr[i];
        }
        arr[0]=value;
    }
    //method 2
    static void insertEnd(int[] arr , int value){
       arr[arr.length-1] = value;
    }
    //main
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int[] arr ={1,2,3,4,5,0};
        int n=arr.length-1; //must be 1 less than the actual array length
        System.out.print("Enter the value to be inserted at Starting: ");
        int value = ip.nextInt();
        System.out.println("Before Insertion:");
        System.out.println(Arrays.toString(arr));
        insertBegin(arr, n, value);
        System.out.println("After Insertion:");
        System.out.println(Arrays.toString(arr));
        insertEnd(arr, value);
        System.out.println(Arrays.toString(arr));
        ip.close();
       

    }
    
}
