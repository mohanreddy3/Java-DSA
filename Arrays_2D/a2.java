//Take a matrix( 2D Array) as input from the user.
// Search for the given number x and print the indices at which it occur.
package Arrays_2D;

import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        System.out.print(" Enter the no of rows:");
        Scanner ip = new Scanner (System.in);
        int rows = ip.nextInt();
        System.out.print(" Enter the no of cols:");
        int cols = ip.nextInt();
        int array1 [][] = new int [rows][cols];
        // input
        //rows
        System.out.println(" Enter the values in matrix:");
        for(int i =0; i<rows; i++){
            //columns
            for(int j=0; j<cols;j++){
                array1[i][j] = ip.nextInt();
            }
        }
        // getting x value
        System.out.print(" Enter the x value:");
        int x = ip.nextInt();
        // Logic
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if( array1[i][j]==x){
                    System.out.println(" x is found at (" + i + ", " +j + ")");
                }
            }
        } ip.close();  
        

    }
    
}
