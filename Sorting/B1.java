package Sorting;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        //Input from user
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int size = ip.nextInt();
        int array[] = new int [size];
        //input loop
        System.out.println("Enter the elements: ");
        for(int i=0; i<array.length; i++ ){
            array[i] = ip.nextInt();
        }

        //Bubble Sort --> Time Complexity  : O(n^2)
        //outer loop --> (to traverse the entire array).
        for(int i=0;i<array.length-1; i++){
            //inner loop --> (to traverse through entire array except sorted elements).
            for(int j=0; j<array.length-i-1; j++){
                if(array[j]>array[j+1]){
                    //swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }ip.close();
    printArray(array);

    }
    //Function
    public static void printArray(int array[]){
        //loop --> output
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }


}
