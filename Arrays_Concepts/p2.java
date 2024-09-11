//reversing an Array
package Arrays_Concepts;
import java.util.Scanner;

public class p2 {
   
    //method
    static void reverseArray(int[] arr){
        for(int i=arr.length; i>0; i--){
            System.out.print(arr[i-1] + " ");
        }
    }
    //main
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int size = ip.nextInt();
        int [] arr = new int[size];
        //input
        for(int i=0; i<size; i++){
            arr[i] =ip.nextInt();
        }
        reverseArray(arr);
        ip.close();
    }
}

