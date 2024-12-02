/*
 *  Find the Missing Number in an Array:
 Problem: Given an array containing n-1 integers in the range from 1 to n , find the missing number.
 Input:
 Array: [1, 2, 4, 5, 6]
 Output: 3
 Explanation: The missing number is 3

 Logic : sum of n natural numbers!!
 */



package CapgeminiQues;

import java.util.Scanner;

public class Cp10 {
    //method
    private static int missingNum(int[] arr){
        int n = arr.length;
        int expectedSum = n*(n+1)/2;
        int actualSum = 0;
        for(int i=0; i<n; i++){
            actualSum = actualSum + arr[i];
        }

        return Math.abs(expectedSum - actualSum);
    }
    //main
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int size = ip.nextInt();
        int[] arr = new int[size];
        // array input
        for(int i=0; i<size; i++){
            arr[i] = ip.nextInt();
        }
        System.out.println(missingNum(arr));
        ip.close();


    }
    
}
