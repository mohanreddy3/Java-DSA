//Removing duplicate elements from a sorted array.
package Dsa_Problems;

public class pblm4 {
    //Function
    public static int removeDuplicates(int arr[], int size){
        int i=0;
        for(int j=1; j<size; j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }

    //main
    public static void main(String[] args) {
        int arr[] = { 1,1,2,2,4,4,5};
        int size = arr.length;
        int result = removeDuplicates(arr, size);
        System.out.println("Index is " + result);
        for (int i=0; i<result; i++){
            System.out.print(arr[i] + " ");
        }
    }

    
}
