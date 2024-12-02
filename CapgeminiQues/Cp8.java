
/*
 *  Binary Search:
 Problem: Implement a binary search algorithm to find a target value in a 
sorted array.
 Input:
 Array: [1, 2, 3, 4, 5, 6, 7, 8, 9]
 Target: 4
 Output: 3
 Explanation: The function returns the index of the target value in the 
array.
 */
package CapgeminiQues;

import java.util.Scanner;

public class Cp8 {
    //method
    private static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<= end){
            int mid = start + (end-start)/2;
            if(target > arr[mid]){
                start = mid+1;
            }
            else if(target < arr[mid]){
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    //main
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the target:");
        int target = ip.nextInt();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch(arr, target));
        ip.close();
    }
    
}
