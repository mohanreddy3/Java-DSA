// Second smallest element in an array.
package Dsa_Problems;

public class pblm2 {
    //Function
    public static int secondSamllest(int arr[], int size){
        int Smallest = Integer.MAX_VALUE;
        int SecondSmallest = Integer.MAX_VALUE;
        for(int i=0; i<size; i++){
            if(arr[i]< Smallest){
                SecondSmallest = Smallest; //never forget the order
                Smallest = arr[i];
                
            }
            else if (arr[i] < SecondSmallest && arr[i] != Smallest){
                SecondSmallest = arr[i];
            }
        }
        return SecondSmallest;
    }


    //main
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,7,8,9};
        int size = arr.length;
        int result = secondSamllest(arr, size);
        System.out.println(result);
    }
    
}
