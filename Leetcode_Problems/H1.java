//Hacker Rank Pblm.
// print the no of Subarrays whose sum is a negative number.
//ip: 1st line -> size of an array
//2 nd line -> elements in array.
// op: return no of subarrays.
package Leetcode_Problems;

import java.util.Scanner;

public class H1 {
    //method
    static int noOfSubArrays(int [] arr){ 
        int count =0;
        for( int i=0; i<arr.length; i++){ 
            int sum =0;
            for(int j=i; j<arr.length; j++){
                sum = sum + arr[j];
                if(sum < 0){
                    count++;
                }    
            }
        }
        return count;   
    }
    //main
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int size = ip.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = ip.nextInt();
        }
        System.out.println(noOfSubArrays(arr));
        ip.close();
    }   
}
//output:
// 5
// 1 -2 4 -5 1
// 9