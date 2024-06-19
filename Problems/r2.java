/*
 * Given an array of size N. The task is to find the maximum and the minimum
 *  element of the array using the minimum number of comparisons.
Example:
Input: arr[] = {3, 5, 4, 1, 9}
Output: Minimum element is: 1
         Maximum element is: 9
 */
package Problems;

import java.util.Scanner;

public class r2 {
    public static void main(String[] args) {
        // input (size of an array)
        System.out.print("Enter the size of array:");
        Scanner ip = new Scanner (System.in);
        int size = ip.nextInt();
        int array1[] = new int [size];
        //values in array
        System.out.print("Enter the values in array:");
        for(int i =0; i<size; i++){
            array1[i]= ip.nextInt();
        }ip.close();
        maxAndMin(size, array1);


    }

    // function to find max and min element.
    public static void maxAndMin (int size , int array1[]){
        int max = array1[0];
        int min = array1[0];
        for(int i=0; i<size; i++){
            if( array1[i]> max){
                max = array1[i];
            }
            if(array1[i]< min){
                min = array1[i];
            }
        }
        System.out.println("Maximum Value is :" + max);
        System.out.print("Minimum Value is :" + min);
    }
    
}
// the time complexity of the code is O(n), and the space complexity is O(n).