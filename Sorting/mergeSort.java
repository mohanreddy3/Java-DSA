package Sorting;

import java.util.ArrayList;

public class mergeSort {
    public static void main(String[] args) {
        int size = 7;
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.println("Array before Sorting: ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        // Merge_Sort( arr, low high);
    }

    public static void Merge_Sort(int arr[], int low , int high){
        if(low >= high){
            return;
        }
        int mid = (low + high)/2;
        Merge_Sort(arr,low,mid);
        Merge_Sort(arr, mid+1, high);
        Merge_fun (arr, low, mid, high);
    }
    //Merge Function
    public static void Merge_fun(int arr[], int low, int mid , int high){
        ArrayList <Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while(left <= low && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left <= low){
            temp.add(arr[left]);
        }
        while(right <= high){
            temp.add(arr[right]);
        }

    }
    
}
