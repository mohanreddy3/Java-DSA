package Searching;
import java.util.*;
public class BinarySearch {
    //method
    private static int binarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2; // sometimes (start+end) exceeds limit of int in java.
            if(target > arr[mid]){
                start = mid +1;
            }
            else if( target < arr[mid]){
                end = mid -1;
            }
            else{
                return mid; // return the index  of target value in the sorted array.
            }
        }
        return -1;
    }
    //main
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = ip.nextInt();
        int [] arr = new int[size];
        System.out.print("Enter the elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = ip.nextInt();
        }
        System.out.println("Enter the target value: ");
        int target = ip.nextInt();
        System.out.println("Index of target is: " + binarySearch(arr, target));
        ip.close();
    }
    
}
