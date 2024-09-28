//Reverse a given array
package TCS_NQT.Arrays;

import java.util.Arrays;

public class a4 {
    //method
    static int[] reversedArray(int arr[]){
        int n=arr.length;
        int[] newArray = new int[n];
        for(int i=n-1; i>=0; i--){
            newArray[n-1-i] = arr[i]; 
        }
        return newArray;
    }
    //main
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(reversedArray(arr)));

    }
    


}
