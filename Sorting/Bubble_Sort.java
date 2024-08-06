package Sorting;

import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        System.out.println("Enter the size of array: ");
        Scanner ip = new Scanner(System.in);
        int size = ip.nextInt();
        int [] array = new int[size];
        System.out.println("Enter the elements in array: ");
        for(int i=0; i< size; i++){
            array[i]= ip.nextInt();
        }
        //Bubble Sort
        for(int i=size-1; i>=1; i--){
            //inner loop
            for(int j=0; j<=i-1; j++){
                if(array[j]>array[j+1]){
                    //swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        //output
        for(int k=0; k<size; k++){
            System.out.print(array[k] + " ");
            }ip.close();



    }
    
}
