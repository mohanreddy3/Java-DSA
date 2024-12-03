/*
 * Merge Two Sorted Arrays:
 Problem: Merge two sorted arrays into a single sorted array.
 Input:
 Array 1: [1, 3, 5]
 Array 2: [2, 4, 6]
 Output:  [1, 2, 3, 4, 5, 6]
 */
package CapgeminiQues;

import java.util.Arrays;

public class Cp14 {
    //method
    private static int[] mergeArrays(int[] arr1, int[] arr2){
       int[] mergedArray = new int[arr1.length+arr2.length];
       //important to remember! 
       System.arraycopy(arr1 , 0 , mergedArray, 0, arr1.length);
       System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);
       Arrays.sort(mergedArray);
       return mergedArray;
    }
    //main
    public static void main(String[] args) {
        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,6};
        System.out.println(Arrays.toString(mergeArrays(arr1, arr2)));
    }

    
}
