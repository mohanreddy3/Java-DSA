// 5

//     *
//    * *
//   * * *
//  * * * *
// * * * * *
//  * * * *
//   * * *
//    * *
//     * 
package Patterns_Concepts;

import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        //outer loop -> no of rows
        for(int row=0; row<=2*n; row++){
            //no of cols in a row
            int noOfColInRow = row > n ? 2*n-row : row;
            //no of spaces
            int noOfSpaces = n-noOfColInRow;
            // printing space
            for(int s =0; s<noOfSpaces; s++){
                System.out.print(" ");
            } 
            //print colms
            for(int cols = 0; cols < noOfColInRow; cols++){
                System.out.print("* ");
            }
            System.out.println();
        }ip.close();

    }
}
