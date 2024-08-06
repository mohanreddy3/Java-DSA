//Selection Sort Strivers.
package Sorting;

import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args) {
        System.out.println("Enter the size of Array: ");
        Scanner ip = new Scanner(System.in);
        int size = ip.nextInt(); 
        int[] Array = new int[size];
        System.out.println("Enter the elements: ");
        for (int i=0;i<size; i++){
            Array[i] = ip.nextInt();
        }
        //Selection Sort
        for(int i=0; i<size-1;i++){
            //inner loop 
            int min = i;
            for(int j=i+1; j<size;j++){
                if( Array[j]<Array[min]){
                    min = j;
                }
            }
            //swap
            int temp = Array[min];
            Array[min] = Array[i];
            Array[i] = temp;
            
        }
        //output
        for(int i=0; i<size; i++){
            System.out.print(Array[i] + " ");
        }ip.close();
    
    }
    
}
