//Insertion at beginning & Insertion at End.
// Time Complexity: θ(n), since n iterations are required to shiftθ(1) since we need to directly add an element at the end of the array
// Space Complexity: O(1)
package TCS_NQT.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class a13 {
    //method 1 (Inserting at the begining)
    static void insertBegin(int[] arr , int n ,int value){
        for(int i=n-1; i>=0; i--){  //move every element 1 position to right.
            arr[i+1] = arr[i];
        }
        arr[0]=value;
    }
    //method 2 (Inserting at the End)
    static void insertEnd(int[] arr , int value){
       arr[arr.length-1] = value;
    }
    //method 3 (Inserting at a certain position)
    static void insertPos(int [] arr, int value, int pos){
        int n = arr.length-1;
        for(int i=n; i>=pos; i--){
            arr[i]=arr[i-1];
        }
        arr[pos-1]= value;

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
        System.out.println("After Insertion at End:");
        System.out.println(Arrays.toString(arr));
        int[] arr1 ={5,4,3,2,1,0};
        System.out.println("Enter the position: ");
        int pos = ip.nextInt();
        insertPos(arr1, value, pos);
        System.out.println(Arrays.toString(arr1));
        ip.close();
       

    }
    
}
