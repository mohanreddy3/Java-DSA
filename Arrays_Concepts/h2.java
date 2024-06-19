/*Take an array of numbers as input and check if it is an array sorted in ascending order.
Eg : { 1, 2, 4, 7 } is sorted in ascending order.
{3, 4, 6, 2} is not sorted in ascending order. */

package Arrays_Concepts;

import java.util.Scanner;

public class h2 {
    public static void main(String[] args) {
        Scanner ip= new Scanner (System.in);
        System.out.print("Enter the size of array:");
        int size = ip.nextInt();
        int array1 []= new int [size];
        //input
        System.out.println("Enter the values:");
        for (int i=0; i<size; i++){
            array1[i]=ip.nextInt();
        }

        boolean isAscOrder = true;
        for(int i=0; i<size-1; i++){
            if(array1[i]>array1[i+1]){ //Descending order
               isAscOrder = false;
               break;
            } 
        }
        if(isAscOrder){
            System.out.println("elements are in ascending order");
        }else{
         System.out.println("Elements are not in ascending order");
        }ip.close();
    } 
    }
