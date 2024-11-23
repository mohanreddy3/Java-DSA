//Peak Index in the Mountain Array.
/*
 * You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.

Return the index of the peak element.
Your task is to solve it in O(log(n)) time complexity.

Example 1:
Input: arr = [0,1,0]
Output: 1

Example 2:
Input: arr = [0,2,1,0]
Output: 1
 */
package Searching;

public class Bs5 {
    //method
    private static int peakElement(int[] arr){
        int start = 0;
        int end = arr.length-1;
        //shouldn't use "=" becoz it's the termination condition here.
        while(start < end){
            int mid = start + (end-start)/2;
            //case 1: check in the right side of the array.
            if(arr[mid] > arr[mid+1]){
                end = mid; // possible ans so end != mid+1.
            }
            //case 2 : check in the left side of the array.
            else{
                start = mid+1;
            }
        }
        //loop break stmt -> if start & end points to same value then it's the largest num
        return start; // we can also return "end" here.
    }
    //main
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,4,3,2}; // my own example
        System.out.println(peakElement(arr));
    }

    
}
