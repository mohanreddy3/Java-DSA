/*
 * Find position of an element in a sorted array of infinite numbers.
 * here we must assume tht a normal array is a an infinte array and we don't know it's length.
 * we musn't use length in this approach.
 */
package Searching;

public class Bs4 {
    //method 1
    public static int ans(int[] arr , int target){
        //first find the range
        //first start with a box of size 2
        int start = 0;
        int end = 1;
        //condition for target to lie in the range.
        while(target > arr[end]){
            int newStart = end+ 1;
            //double the box value
            //formula -> end = previous end + sizeofbox * 2
            end = end +(end - start + 1)*2;

            // Ensure end does not exceed the array bounds
            if (end >= arr.length) {
                end = arr.length - 1; // Clamp to the last index
                break;
            }
            start = newStart;
        }
        return binarySearch(arr, target, start, end);


    }
    //method 2
    public static int binarySearch(int[] arr, int target , int start, int end){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    //main
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,8,23,69,79,89,95,115};
        int target = 69;
        System.out.println(ans(arr, target));
    }
    
}
