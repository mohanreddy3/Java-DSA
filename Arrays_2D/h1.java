//Print the spiral order matrix as output for a given matrix of numbers. 
/*   
 * Initialize Variables:
We start by defining four variables: topRow, bottomRow, leftColumn, and rightColumn. These variables represent the boundaries of the current spiral we are traversing. Initially, these boundaries are set to cover the entire matrix.
Traverse in Spiral Order:
We iterate through the matrix in a spiral pattern until the boundaries of the current spiral intersect. This ensures that we traverse the entire matrix.
Print Top Row:
We print the elements of the top row of the current spiral, from leftColumn to rightColumn. This is the first side of the spiral. We start at leftColumn and print each element until we reach rightColumn. This prints the top row of the current spiral.
Print Right Column:
We print the elements of the right column of the current spiral, from topRow to bottomRow. We have already printed the top row, so we start at topRow + 1 and print each element until we reach bottomRow. This prints the right column of the current spiral.
Print Bottom Row:
We print the elements of the bottom row of the current spiral, from rightColumn to leftColumn. We have already printed the top row and the right column, so we start at rightColumn - 1 and print each element until we reach leftColumn. This prints the bottom row of the current spiral.
Print Left Column:
We print the elements of the left column of the current spiral, from bottomRow to topRow. We have already printed the top row, the right column, and the bottom row, so we start at bottomRow - 1 and print each element until we reach topRow. This prints the left column of the current spiral.
Repeat:
We repeat the above steps until all elements of the matrix are printed. As we continue the iterations, the boundaries of the current spiral shrink inward, ensuring that we print the elements in a spiral pattern.
Finish:
Once we have traversed all elements of the matrix, we have printed them in the desired spiral order, starting from the outermost layer and moving inward until all elements are printed.
 */
package Arrays_2D;

import java.util.Scanner;

public class h1 {
    public static void main(String[] args) {
        System.out.print("Enter the no of rows:");
        Scanner ip = new Scanner (System.in);
        int rows = ip.nextInt();
        System.out.print("Enter the no of cols:");
        int cols = ip.nextInt();
        int array1[][] = new int [rows][cols];
        //input 
        //rows
        System.out.println("Enter the values in 2D Array:");
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

        // Logic for spiral order.
        for(int i=0; i<rows-1; i++){
            for(int j=0; j<cols; j++){
                System.out.print(array1[j][i]+ " ");
            }
        }


    }
    
}
