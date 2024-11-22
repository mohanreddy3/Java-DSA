/*
 * Given an array of integers nums sorted in non-decreasing order, 
 * find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].
Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
 */
package Searching;

import java.util.Arrays;

public class Bs3 {
    //method
    private static int[] FirstAndLastPos(int[] arr, int target){
        int[] ansArray = {-1,-1};
        ansArray[0] = search(arr, target, true); // using helper method
        if(ansArray[0] != -1){
            ansArray[1] = search(arr, target, false);
        }
        return ansArray;
    }
    //helper method (actual Binary Search)
    private static int search(int[] arr, int target, boolean isFirstOccurence){
        int ans = -1; 
        int start = 0; 
        int end = arr.length-1;
        while(start<= end){
            int mid = start+(end-start)/2;
            if(target > arr[mid]){
                start = mid+1;
            }
            else if(target < arr[mid]){
                end = mid-1;
            }
            else{
                //we have found one of the potential ans
                ans = mid;
                if(isFirstOccurence){
                    end = mid -1;
                }
                else{
                    start = mid+1;
                }
            }    
        }

        return ans;
    }
    //main
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10}; 
        int target = 8;
        // int target = 6;
        System.out.println(Arrays.toString(FirstAndLastPos(arr, target)));
        
    }
    
}
