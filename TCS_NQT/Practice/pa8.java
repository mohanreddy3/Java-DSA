//Rotate array by K elements - Block Swap Algorithm
package TCS_NQT.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class pa8 {
    //method 1
    static void reverseArray(int[] arr , int start, int end){
        while(start <= end){ //don't forget while loop bro!
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    //method 2
    static void rotateArray(int[] arr, int n, int k ){
        reverseArray(arr, 0, k-1);
        reverseArray(arr, k, n-1);
        reverseArray(arr, 0, n-1);
    }






    //main
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        System.out.println("Enter the Kth element: ");
        int k = ip.nextInt();
        System.out.println(Arrays.toString(arr));
        rotateArray(arr, n, k);
        System.out.println(Arrays.toString(arr));
        ip.close();


    }
    
}
