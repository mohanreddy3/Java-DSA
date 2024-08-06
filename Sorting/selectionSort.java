package Sorting;

public class selectionSort {
    public static void main(String[] args) {
        int arr[] = {9,8,5,7,3,1,6};
        //Insertion Sort
        for(int i=0; i<arr.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i]= temp;

            System.out.print(arr[i] + " ");
        }
    }
    
}
/*
traverses through entire array and finds out the index of smallest element,
and then swaps the smallest element with the first element after on traversal,
repeats the same process until the array is sorted.


*/