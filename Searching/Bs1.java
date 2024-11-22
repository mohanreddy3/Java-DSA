//Find the Ceiling of a Number.
// number which is just greater than or equal(>=) to the target.
// smallest greatest number than target in the given array.
package Searching;

public class Bs1 {
    //method
    private static int ceilingOfNum(int[] arr, int target){
        int start = 0; 
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid+1;
            }
            else if(target < arr[mid]){
                end = mid -1;
            }
            else{
                return mid;
            }
        }
        // return start;
        return arr[start];
    }
    //main
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,8,14,24,34,78,90};
        int target = 10;
        System.out.println(ceilingOfNum(arr , target));

    }
    
}
