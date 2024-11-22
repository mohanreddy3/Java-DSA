//floor value of the given Target 
// greatest num which is smaller or equal(<=) to target in the given array.
package Searching;

public class Bs2 {
    //method(if array is sorted in ASC order)
    private static int floorOfNum(int[] arr , int target){
        int start =0; 
        int end = arr.length-1;
        while(start<= end){
            int mid = start + (end-start)/2;
            if(target > arr[mid]){
                start = mid+1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[end];
    }
    //main
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,8,14,24,34,78,90};
        int target = 10;
        System.out.println(floorOfNum(arr , target));
    }
    
}
