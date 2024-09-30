//Rotate array by K elements - Block Swap Algorithm (Striver)
package TCS_NQT.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class a8 {
    //method
   static void reverseArray(int[] arr, int start, int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    //method 2
    static void leftRotate(int[] arr, int n, int d){
        // step-1 
        d = d % n; // convert all d values to < n rotations.
        //step -2
        reverseArray(arr, 0, d-1); // reverse from  0 to 3 (let d=3) -> 1st part
        //step -3
        reverseArray(arr, d, n-1); // reverse from 3 to 6 (let n=7) -> 2nd part
        //step -3
        reverseArray(arr, 0, n-1); //reverse from 0 to 6 ->both parts
    }

    //main
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int [] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        System.out.println("Enter the Dth value: ");
        int d = ip.nextInt();
        System.out.println("Before Rotation: ");
        System.out.println(Arrays.toString(arr));
        leftRotate(arr, n , d);
        System.out.println("After rotation:");
        System.out.println(Arrays.toString(arr));

        ip.close();


    }
    
}
