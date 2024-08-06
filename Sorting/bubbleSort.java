package Sorting;

import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        //Bubble Sort
        // int array1 [] = {7,9,5,3,1,0};
        System.out.print("Enter size of array:");
        Scanner ip = new Scanner(System.in);
        int size = ip.nextInt();
        int array1[]=new int [size];
        //input
        System.out.print("Enter elements:");
        for(int i=0; i<size;i++){
            array1[i]= ip.nextInt();
        }
        //outer loop (counter)
        for(int i=0; i<array1.length-1;i++){
            //inner loop(traversing the array except the sorted elements)
            for(int j=0; j<array1.length-i-1; j++){
                if(array1[j] > array1[j+1]){
                    //swap
                    int temp = array1[j];
                    array1[j] = array1[j+1];
                    array1[j+1]= temp;  
                }
            }
        }ip.close();
        //calling the function
       printArray(array1); 
    }

    //Function
    public static void printArray(int array1[]){
        for(int i=0; i<array1.length; i++){
            System.out.print(array1[i]+" ");
        }
    }
    
}
