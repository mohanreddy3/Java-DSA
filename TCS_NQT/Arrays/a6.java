//Rearrange array in increasing-decreasing order
//Half the array in Increasing Order and Other half in Decreasing Order.
package TCS_NQT.Arrays;

import java.util.Arrays;

public class a6 {
    //method 1
    static void incrOrder(int[] arr){
        int n= arr.length;
       Arrays.sort(arr); //it always sorts in Increasing order
       for(int i=0; i<n; i++){
        System.out.print(arr[i] + " ");
       }
    }
    //method 2
    static void decrOrder(int [] arr){
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=n-1; i>=0; i--){
            System.out.print(arr[i] +" ");
        }
    }
    //method 3
    static void halfIncHalfDec(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        //first half
        for(int i=0; i<n/2; i++){
            System.out.print(arr[i] + " ");
        }
        for(int i=n-1; i>=n/2; i--){
            System.out.print(arr[i] + " ");
        }
    }



    //main
    public static void main(String[] args) {
        int[] arr = {1,3,2,6,4,8,10,50};
        incrOrder(arr);
        System.out.println();
        decrOrder(arr);
        System.out.println();
        halfIncHalfDec(arr);

    }

    
}
