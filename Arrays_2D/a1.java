//2D Arrays --> Matrix
// rows & colmuns
package Arrays_2D;

import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        System.out.print("Enter the rows:");
        Scanner ip = new Scanner (System.in);
        int rows = ip.nextInt();
        System.out.print("Enter the columns:");
        int cols = ip.nextInt();
        int array2 [][] = new int [rows][cols];
        // input 
        //rows (outer loop)
        System.out.println("Enter the values in 2D array:");
        for(int i=0; i<rows; i++){
            //columns (inner loop)
            for(int j=0; j<cols; j++){
                array2 [i][j] = ip.nextInt();
            }
        }
        //output
        for(int i =0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(array2[i][j]+ " ");
            }
            System.out.println();
        } ip.close();
    }

    
}
