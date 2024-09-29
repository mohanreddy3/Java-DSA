//Rotate array by K elements - Block Swap Algorithm
package TCS_NQT.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class a8 {
    //method
    static void rotateArray(int[] arr , int k){
        int n= arr.length;
        int[] ans = new int[n];
        for(int i=1; i<n-k; i++){
            ans[i] = arr[n-k+i];
        }
        for(int j=n-k; j<n; j++){
            ans[j] = arr[n-j-1];
        }
        System.out.println(Arrays.toString(ans));
    }


    //main
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the  array size: ");
        int size = ip.nextInt();
        int[] arr = new int[size];
        //input
        System.out.print("Enter the elements in the array: ");
        for(int i=0; i<size; i++){
            arr[i] = ip.nextInt();
        }
        System.out.println("Enter the Kth value: ");
        int k = ip.nextInt();
        rotateArray(arr, k);
        ip.close();


    }
    
}
