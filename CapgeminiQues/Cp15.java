/*
 * Rotate an Array:
 Problem: Rotate an array by k steps to right 
Input:
 Array: [1, 2, 3, 4, 5]
 k = 2
 Output: [4, 5, 1, 2, 3]
 */
package CapgeminiQues;

import java.util.Arrays;
import java.util.Scanner;

public class Cp15 {
    //method 2 -> to reverse the array(according to index values)
    private static void reverse(int[] arr, int start, int end){
        while(start<=end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}
    //method -> rotate to Left
    private static void rotateArrayLeft(int[] arr, int n, int k){
        //step 1 -> reverse first 'k' elements
        reverse(arr, 0 , k-1);
        //step 2 -> reverse last 'n-k' elements
        reverse(arr, k, n-1);
        //step 3 -> reverse whole array
        reverse(arr, 0, n-1);
    }
    //method -> rotate to right
    private static void rotateArrayRight(int[] arr, int n , int k){
       //step 1 -> reverse last 'k' elements.
       reverse(arr, 0, n-k-1);
       //step 2 -> reverse first 'n-k' elements
       reverse(arr, n-k, n-1); 
       //step 3 -> reverse whole array.
       reverse(arr, 0, n-1);

    }
    //main
    public static void main(String[] args) {
        int[]  arr= {1,2,3,4,5};
        Scanner ip = new Scanner(System.in);
        int n = arr.length;
        System.out.print("Enter k value: ");
        int k = ip.nextInt();
        rotateArrayRight(arr,n, k);
        System.out.println(Arrays.toString(arr));
        rotateArrayLeft(arr, n, k);
        System.out.println(Arrays.toString(arr));
        ip.close();
    }
    
}
