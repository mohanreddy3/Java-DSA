//check whether the array is sorted or not.
package Dsa_Problems;

public class pblm3 {
    //Function
    public static boolean checkSorted(int arr[], int size){
        for (int i=1; i<arr.length; i++){
            if(arr[i] >= arr[i-1]){

            }
            else{
                return false;
            }
        }
        return true;
    }
    //main
    public static void main(String[] args) {
        int arr[] = {1,5,3,4,5,7,8,9};
        int size = arr.length;
        boolean result = checkSorted(arr, size);
        System.out.println( result);


    }
    
}
