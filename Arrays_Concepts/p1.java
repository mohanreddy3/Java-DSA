//swapping indexes
package Arrays_Concepts;

import java.util.Arrays;
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size = ip.nextInt();
        int [] array = new int[size];
        //input
        System.out.print("Enter elements in array: ");
        for(int i=0; i<size; i++){
            array[i] = ip.nextInt();
        }
        // swapping indexes
        System.out.print("Index1: ");
        int index1 = ip.nextInt();
        System.out.print("Index2: ");
        int index2 = ip.nextInt();
        for(int i=0; i<size; i++){
            //swap 
            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
        System.out.println("Swapped array is :");
        System.out.println(Arrays.toString(array));
        ip.close();
    }
}
//Output
// Enter the size of array:5
// Enter elements in array: 1 2 3 4 5
// Index1: 0
// Index2: 4
// Swapped array is :
// [5, 2, 3, 4, 1]
