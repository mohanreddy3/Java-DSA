//Quick Sort -> Divide & Conquer
package Sorting;

import java.util.Arrays;

public class Quick_Sort {
    //method 1
    private static void quickSort(int[] arr , int low , int high){
        if(low < high){
            int partitionIndex = partitionIndex(arr, low, high);
            quickSort(arr, low, partitionIndex-1);
            quickSort(arr, partitionIndex+1, high);
        }
    }

    //method 2
    private static int partitionIndex(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low; 
        int j = high;
        while(i< j){
            while(arr[i] <= pivot && i<=high) {
                i++;
            }
            while(arr[j] > pivot && j> low){
                j--;
            }
            if(i<j){
                //swap arr[i] & arr[j]
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
        }
        // Swap arr[low] & arr[j] to place pivot in correct position
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        //return partition Index
         return j;
    }
    //main
    public static void main(String[] args) {
        int[] array = {4,6,2,5,7,9,1,3};
        int low = 0;
        int high =array.length-1;
        quickSort(array, low, high);
        System.out.println(Arrays.toString(array));
    }
    
}
