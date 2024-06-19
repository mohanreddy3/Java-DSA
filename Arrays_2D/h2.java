// For a given matrix of N x M, print its transpose.

package Arrays_2D;

import java.util.Scanner;

public class h2 {
    public static void main(String[] args) {
        
    Scanner ip = new Scanner (System.in);
    System.out.print("Enter the no of rows:");
    int rows = ip.nextInt();
    System.out.print("Enter the no of cols:");
    int cols = ip.nextInt();
    int array1[][] = new int [rows][cols];
    //input 
    //rows
    System.out.println("Enter the value of 2D array:");
    for(int i=0; i<rows; i++){
        //columns
        for(int j=0; j<cols; j++){
            array1[i][j]= ip.nextInt();
        }
    }
    System.out.println();
    //output
    for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
            System.out.print(array1[i][j] + " ");
        }
        System.out.println();
    }ip.close();
    System.out.println();
    // transpose of a matrix (Logic) --> interchange outer and inner loops.
    System.out.println("The transpose of the matrix is : ");
    for(int j=0; j<cols; j++){
        for(int i=0; i<rows; i++){
            System.out.print(array1[i][j] + " ");
        } System.out.println();
    }
    
}
}
