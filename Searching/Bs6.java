//Search in Rotated Array (Refer Mohan's Hand Written Notes).
/*
 * There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length)
 such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
  For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target, 
return the index of target if it is in nums, or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexity.
Example 1:
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:
Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
 */
package Searching;

public class Bs6 {
    //method 1 -> Finding Pivot (will not work for duplicate elements)
    private static int findPivot(int[] arr){
        int start = 0; 
        int end = arr.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if( mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){              
                return mid-1;
            }
            if(arr[start] >= arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    //method 2 -> using pivot we'll find target.
    private static int finalAns(int[] arr , int target){
        int pivot = findPivot(arr);
        //case 1
        if(pivot == -1){
            return binarySearch(arr, target, 0, arr.length-1);
        }
        if(arr[pivot] == target){
            return pivot;
        }
        if(target > arr[0]){
            return binarySearch(arr, target, 0, pivot-1);
        }
        else{
            return binarySearch(arr, target, pivot+1, arr.length-1);
        }


    }
    //method 3 -> Classic Binary Search code
    private static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target > arr[mid]){
                start = mid+1;
            }
            else if(target < arr[mid]){
                end= mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    } 
    public static void main(String[] args) {
        //main
        int [] arr = {3,4,5,6,7,0,1,2};
        int target = 6;
        System.out.println("Index of target is : " + finalAns(arr, target));


    }
    
}
