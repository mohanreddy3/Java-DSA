//Second Largest element in an array.
package Dsa_Problems;

public class pblm1 {
    //Function
    public static int SecondLargest(int arr[], int size){
        if (size<2){
            return -1;
        }
        int Largest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;
        for(int i=0; i<size; i++){
            if(arr[i] > Largest){
                SecondLargest = Largest;
                Largest = arr[i];
            }
            else if( arr[i]>SecondLargest && arr[i]!=Largest){
                SecondLargest = arr[i];
            }
        } 
        return SecondLargest;
    } 


    //main
    public static void main(String[] args) {
        int arr[] ={ 1,3,4,5,7,8,9};
        int size = arr.length;
        int result = SecondLargest(arr, size);
        System.out.println(result);
    }
    
}
