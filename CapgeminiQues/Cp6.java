/*
 * Matrix Identity Check:
 Problem Write a program to check if two given matrices are identical.
 Input:
 Matrix A: [[1,1,1,1], [2,2,2,2], [3,3,3,3], [4,4,4,4]]
 Matrix B: [[1,1,1,1], [2,2,2,2], [3,3,3,3], [4,4,4,4]]
 Output: 
Matrices are identical
 Explanation The program checks each corresponding element in both matrices for equality.
 */
package CapgeminiQues;

import java.util.Scanner;

public class Cp6 {
    //method
    private static String checkArrays(int[][] arr1 , int[][] arr2){
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1.length; j++){
                if(arr1[i][j] != arr2[i][j]){
                    return "Not equal";
                }
            }
        }
        return "Matrices are identical";
    }
    //main
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        // int rows = ip.nextInt(); -> Manual Method
        // int cols = ip.nextInt();
        // int[][] arr = new int[rows][cols];
        // for(int i=0; i<rows; i++){
        //     for(int j=0; j<cols; j++){
        //         arr[i][j] = ip.nextInt();
        //     }
        // }
        int[][] arr1 = {{1,1,1,1}, {2,2,2,2}, {3,3,3,3}, {4,4,4,4}};
        int[][] arr2 = {{1,1,1,1}, {2,2,2,2}, {3,3,3,3}, {4,4,4,4}};
        System.out.println(checkArrays(arr1, arr2));
        ip.close();
    }
    
}
