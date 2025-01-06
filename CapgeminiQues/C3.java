/*
 * Problem Statement – 3
Write the code to traverse a matrix in a SPIRAL format.
Input :

5   4

1   2   3   4

5   6   7   8

9   10  11  12

13  14  15  16

17  18  19  20

Output :
1  2  3  4  8  12  16  20  19  18  17  13  9  5  6  7  11  15  12  14 10  
 */
package CapgeminiQues;

import java.util.Scanner;

public class C3 {
    //method
    @SuppressWarnings("unused")
    private static void spiralOrder(int cols , int rows){

    }





    //main
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);  
        System.out.println("Enter no of rows:");     
        int rows = ip.nextInt();
        System.out.println("Enter no of cols: ");
        int cols = ip.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter elements in 2D array: ");
        for(int i =0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = ip.nextInt();
            }
        }
        //output
        for(int i =0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(arr[i][j] + " ");
            }
        }
        // spiralOrder(cols , rows);
        ip.close();
    }
    
}
